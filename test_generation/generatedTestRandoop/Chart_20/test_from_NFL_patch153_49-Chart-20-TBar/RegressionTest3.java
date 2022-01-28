import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        java.awt.Paint paint22 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        float float11 = valueMarker1.getAlpha();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        float float7 = valueMarker4.getAlpha();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker4.removeChangeListener(markerChangeListener9);
        valueMarker4.setAlpha((float) 1L);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker14.notifyListeners(markerChangeEvent17);
        java.awt.Stroke stroke19 = valueMarker14.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker22.getLabelAnchor();
        valueMarker14.setLabelAnchor(rectangleAnchor24);
        valueMarker4.setLabelAnchor(rectangleAnchor24);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets27);
        java.awt.Paint paint29 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker1.getLabelAnchor();
        float float25 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(0.800000011920929d);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        double double14 = valueMarker3.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker3.addChangeListener(markerChangeListener15);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker3.addChangeListener(markerChangeListener17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker22.notifyListeners(markerChangeEvent25);
        valueMarker22.setValue((double) 0.8f);
        boolean boolean29 = valueMarker20.equals((java.lang.Object) valueMarker22);
        java.awt.Stroke stroke30 = valueMarker22.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker22.getLabelOffset();
        valueMarker3.setLabelOffset(rectangleInsets31);
        valueMarker1.setLabelOffset(rectangleInsets31);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        java.awt.Paint paint19 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.awt.Paint paint20 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke21 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        java.lang.Object obj25 = valueMarker1.clone();
        valueMarker1.setValue((double) '#');
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        float float11 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        double double10 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.lang.Object obj5 = valueMarker1.clone();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        float float19 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        java.awt.Paint paint19 = valueMarker18.getOutlinePaint();
        java.awt.Stroke stroke20 = valueMarker18.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke7 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        java.awt.Paint paint20 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.lang.String str19 = valueMarker15.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker15.getLabelOffsetType();
        valueMarker12.setLabelOffsetType(lengthAdjustmentType20);
        valueMarker9.setLabelOffsetType(lengthAdjustmentType20);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker9.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(textAnchor23);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font18 = valueMarker17.getLabelFont();
        java.awt.Stroke stroke19 = valueMarker17.getOutlineStroke();
        java.awt.Stroke stroke20 = valueMarker17.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.lang.Object obj26 = valueMarker22.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker22.getLabelOffsetType();
        valueMarker22.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker22.addChangeListener(markerChangeListener30);
        java.lang.String str32 = valueMarker22.getLabel();
        java.awt.Font font33 = valueMarker22.getLabelFont();
        valueMarker17.setLabelFont(font33);
        valueMarker1.setLabelFont(font33);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType36 = valueMarker1.getLabelOffsetType();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener43 = null;
        valueMarker40.addChangeListener(markerChangeListener43);
        double double45 = valueMarker40.getValue();
        java.awt.Paint paint46 = valueMarker40.getOutlinePaint();
        java.awt.Paint paint47 = valueMarker40.getLabelPaint();
        valueMarker40.setLabel("");
        valueMarker40.setAlpha(0.0f);
        java.awt.Paint paint52 = valueMarker40.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType53 = valueMarker40.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType53);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(lengthAdjustmentType36);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(lengthAdjustmentType53);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        float float14 = valueMarker1.getAlpha();
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker13.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.addChangeListener(markerChangeListener21);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.removeChangeListener(markerChangeListener24);
        java.awt.Stroke stroke26 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.removeChangeListener(markerChangeListener15);
        double double17 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker1.notifyListeners(markerChangeEvent18);
        java.awt.Font font20 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        java.awt.Stroke stroke10 = valueMarker5.getStroke();
        valueMarker1.setOutlineStroke(stroke10);
        java.lang.Class<?> wildcardClass12 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        java.awt.Paint paint33 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        java.lang.String str13 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker15.notifyListeners(markerChangeEvent18);
        java.awt.Stroke stroke20 = valueMarker15.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker15.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.addChangeListener(markerChangeListener23);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.removeChangeListener(markerChangeListener15);
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType2 = valueMarker1.getLabelOffsetType();
        double double3 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(lengthAdjustmentType2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.removeChangeListener(markerChangeListener20);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        valueMarker1.setValue((double) (byte) 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(textAnchor18);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 1);
        java.awt.Paint paint10 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        valueMarker10.setValue((double) 100.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.lang.Object obj14 = valueMarker10.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker10.getLabelOffsetType();
        valueMarker10.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker10.addChangeListener(markerChangeListener18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker10.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets20);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker1.notifyListeners(markerChangeEvent22);
        java.awt.Paint paint24 = valueMarker1.getPaint();
        valueMarker1.setValue((double) (short) 10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        valueMarker1.setValue((double) (-1L));
        java.lang.Object obj4 = valueMarker1.clone();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        java.lang.Object obj14 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker10.notifyListeners(markerChangeEvent18);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker10.removeChangeListener(markerChangeListener20);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker1.getLabelOffset();
        java.awt.Paint paint26 = valueMarker1.getOutlinePaint();
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
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker9.notifyListeners(markerChangeEvent12);
        valueMarker9.setValue((double) 0.8f);
        boolean boolean16 = valueMarker7.equals((java.lang.Object) valueMarker9);
        valueMarker9.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker9.removeChangeListener(markerChangeListener19);
        boolean boolean21 = valueMarker2.equals((java.lang.Object) valueMarker9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker2.getLabelAnchor();
        java.awt.Font font23 = valueMarker2.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker25.addChangeListener(markerChangeListener28);
        double double30 = valueMarker25.getValue();
        java.awt.Paint paint31 = valueMarker25.getLabelPaint();
        java.awt.Paint paint32 = valueMarker25.getOutlinePaint();
        java.awt.Stroke stroke33 = valueMarker25.getOutlineStroke();
        java.awt.Stroke stroke34 = valueMarker25.getOutlineStroke();
        java.awt.Paint paint35 = valueMarker25.getOutlinePaint();
        java.awt.Paint paint36 = valueMarker25.getOutlinePaint();
        valueMarker2.setOutlinePaint(paint36);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker39.setLabel("");
        java.awt.Paint paint42 = valueMarker39.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener43 = null;
        valueMarker39.removeChangeListener(markerChangeListener43);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker39.addChangeListener(markerChangeListener45);
        java.awt.Paint paint47 = valueMarker39.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker49.setLabel("");
        boolean boolean52 = valueMarker39.equals((java.lang.Object) "");
        java.awt.Stroke stroke53 = valueMarker39.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker55.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor58 = valueMarker55.getLabelTextAnchor();
        float float59 = valueMarker55.getAlpha();
        double double60 = valueMarker55.getValue();
        java.awt.Paint paint61 = valueMarker55.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker63.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType66 = valueMarker63.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType67 = valueMarker63.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener68 = null;
        valueMarker63.addChangeListener(markerChangeListener68);
        valueMarker63.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener72 = null;
        valueMarker63.addChangeListener(markerChangeListener72);
        valueMarker63.setValue((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker77 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker77.setLabel("");
        java.awt.Paint paint80 = valueMarker77.getPaint();
        java.lang.String str81 = valueMarker77.getLabel();
        double double82 = valueMarker77.getValue();
        org.jfree.chart.text.TextAnchor textAnchor83 = valueMarker77.getLabelTextAnchor();
        valueMarker63.setLabelTextAnchor(textAnchor83);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener85 = null;
        valueMarker63.removeChangeListener(markerChangeListener85);
        org.jfree.chart.plot.ValueMarker valueMarker88 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets89 = valueMarker88.getLabelOffset();
        java.awt.Stroke stroke90 = valueMarker88.getOutlineStroke();
        valueMarker63.setOutlineStroke(stroke90);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker93 = new org.jfree.chart.plot.ValueMarker((double) 0.0f, paint36, stroke53, paint61, stroke90, (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(textAnchor58);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.8f + "'", float59 == 0.8f);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(lengthAdjustmentType66);
        org.junit.Assert.assertNotNull(lengthAdjustmentType67);
        org.junit.Assert.assertNotNull(paint80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor83);
        org.junit.Assert.assertNotNull(rectangleInsets89);
        org.junit.Assert.assertNotNull(stroke90);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker1.removeChangeListener(markerChangeListener32);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        valueMarker1.setValue((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((-1.0d));
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
        valueMarker12.setOutlineStroke(stroke28);
        java.awt.Stroke stroke30 = valueMarker12.getStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker12.notifyListeners(markerChangeEvent31);
        java.awt.Paint paint33 = valueMarker12.getPaint();
        float float34 = valueMarker12.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker12.getLabelAnchor();
        java.lang.Class<?> wildcardClass36 = valueMarker12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray37 = valueMarker1.getListeners((java.lang.Class) wildcardClass36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.8f + "'", float34 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        valueMarker1.setValue((double) '#');
        java.awt.Font font19 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.addChangeListener(markerChangeListener20);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker1.notifyListeners(markerChangeEvent5);
        valueMarker1.setAlpha((float) 1L);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        java.lang.Object obj19 = valueMarker1.clone();
        float float20 = valueMarker1.getAlpha();
        java.awt.Paint paint21 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.addChangeListener(markerChangeListener22);
        java.awt.Stroke stroke24 = valueMarker1.getOutlineStroke();
        java.awt.Font font25 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        double double20 = valueMarker1.getValue();
        double double21 = valueMarker1.getValue();
        java.awt.Paint paint22 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker7.addChangeListener(markerChangeListener10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker7.removeChangeListener(markerChangeListener12);
        java.awt.Stroke stroke14 = valueMarker7.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str17 = valueMarker16.getLabel();
        java.awt.Paint paint18 = valueMarker16.getLabelPaint();
        valueMarker7.setLabelPaint(paint18);
        valueMarker1.setPaint(paint18);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        float float18 = valueMarker15.getAlpha();
        java.awt.Stroke stroke19 = valueMarker15.getOutlineStroke();
        java.lang.Class<?> wildcardClass20 = stroke19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray21 = valueMarker1.getListeners((java.lang.Class) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.BasicStroke; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        valueMarker1.setAlpha((float) (short) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        valueMarker1.setAlpha((float) 1);
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        java.awt.Paint paint29 = valueMarker1.getLabelPaint();
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
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        java.awt.Font font19 = valueMarker1.getLabelFont();
        java.awt.Paint paint20 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        java.awt.Stroke stroke35 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker37.addChangeListener(markerChangeListener40);
        double double42 = valueMarker37.getValue();
        java.awt.Paint paint43 = valueMarker37.getOutlinePaint();
        java.awt.Paint paint44 = valueMarker37.getLabelPaint();
        java.awt.Paint paint45 = valueMarker37.getPaint();
        java.lang.Object obj46 = null;
        boolean boolean47 = valueMarker37.equals(obj46);
        valueMarker37.setAlpha((float) 0);
        java.awt.Paint paint50 = valueMarker37.getLabelPaint();
        valueMarker1.setLabelPaint(paint50);
        java.lang.String str52 = valueMarker1.getLabel();
        double double53 = valueMarker1.getValue();
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
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        java.awt.Stroke stroke16 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        java.awt.Stroke stroke19 = valueMarker18.getOutlineStroke();
        valueMarker18.setValue((double) (byte) -1);
        java.lang.Object obj22 = valueMarker18.clone();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker21.notifyListeners(markerChangeEvent24);
        valueMarker21.setValue((double) 0.8f);
        boolean boolean28 = valueMarker19.equals((java.lang.Object) valueMarker21);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker21.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker21.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType30);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
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
        valueMarker10.setValue((double) 10L);
        float float26 = valueMarker10.getAlpha();
        java.awt.Paint paint27 = valueMarker10.getPaint();
        boolean boolean28 = valueMarker1.equals((java.lang.Object) paint27);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker30.addChangeListener(markerChangeListener33);
        double double35 = valueMarker30.getValue();
        java.awt.Paint paint36 = valueMarker30.getOutlinePaint();
        java.awt.Paint paint37 = valueMarker30.getLabelPaint();
        valueMarker30.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        valueMarker30.notifyListeners(markerChangeEvent40);
        org.jfree.chart.text.TextAnchor textAnchor42 = valueMarker30.getLabelTextAnchor();
        valueMarker30.setValue((double) '#');
        java.awt.Paint paint45 = valueMarker30.getOutlinePaint();
        java.awt.Paint paint46 = valueMarker30.getOutlinePaint();
        java.awt.Stroke stroke47 = valueMarker30.getStroke();
        valueMarker1.setOutlineStroke(stroke47);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(textAnchor42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(stroke47);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        java.lang.String str10 = valueMarker1.getLabel();
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.awt.Stroke stroke6 = valueMarker2.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getOutlinePaint();
        valueMarker2.setLabelPaint(paint11);
        float float13 = valueMarker2.getAlpha();
        valueMarker2.setValue((double) (byte) 0);
        java.lang.String str16 = valueMarker2.getLabel();
        java.awt.Paint paint17 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        float float22 = valueMarker19.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getPaint();
        java.awt.Stroke stroke28 = valueMarker24.getOutlineStroke();
        java.awt.Font font29 = valueMarker24.getLabelFont();
        valueMarker19.setLabelFont(font29);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker19.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker19.getLabelAnchor();
        valueMarker19.setAlpha(1.0f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker19.removeChangeListener(markerChangeListener35);
        java.awt.Paint paint37 = valueMarker19.getPaint();
        java.awt.Font font38 = valueMarker19.getLabelFont();
        java.awt.Stroke stroke39 = valueMarker19.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint42 = valueMarker41.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker44.setLabel("");
        java.awt.Paint paint47 = valueMarker44.getPaint();
        java.lang.String str48 = valueMarker44.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker50.setLabel("");
        java.awt.Paint paint53 = valueMarker50.getPaint();
        valueMarker44.setLabelPaint(paint53);
        java.awt.Font font55 = valueMarker44.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent56 = null;
        valueMarker44.notifyListeners(markerChangeEvent56);
        java.awt.Stroke stroke58 = valueMarker44.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint17, stroke39, paint42, stroke58, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(font55);
        org.junit.Assert.assertNotNull(stroke58);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = null;
        valueMarker1.setOutlineStroke(stroke8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker8.notifyListeners(markerChangeEvent11);
        java.awt.Stroke stroke13 = valueMarker8.getStroke();
        java.lang.Object obj14 = valueMarker8.clone();
        valueMarker8.setValue((double) (short) 100);
        valueMarker8.setAlpha(0.0f);
        java.awt.Font font19 = valueMarker8.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker8.removeChangeListener(markerChangeListener20);
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker8.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor22);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke25 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        java.awt.Stroke stroke20 = valueMarker1.getOutlineStroke();
        java.awt.Font font21 = valueMarker1.getLabelFont();
        java.lang.String str22 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        java.awt.Paint paint23 = valueMarker1.getLabelPaint();
        valueMarker1.setValue(32.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        java.awt.Paint paint21 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        java.awt.Font font16 = valueMarker10.getLabelFont();
        java.lang.String str17 = valueMarker10.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker10.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.removeChangeListener(markerChangeListener12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        double double20 = valueMarker15.getValue();
        java.awt.Paint paint21 = valueMarker15.getLabelPaint();
        java.awt.Paint paint22 = valueMarker15.getPaint();
        java.awt.Stroke stroke23 = valueMarker15.getOutlineStroke();
        java.awt.Paint paint24 = valueMarker15.getLabelPaint();
        valueMarker9.setPaint(paint24);
        valueMarker1.setLabelPaint(paint24);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        float float5 = valueMarker2.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        java.awt.Font font12 = valueMarker7.getLabelFont();
        valueMarker2.setLabelFont(font12);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker2.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker2.getLabelAnchor();
        valueMarker2.setAlpha(1.0f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker2.removeChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.lang.Object obj26 = valueMarker22.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker22.getLabelOffsetType();
        valueMarker22.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker22.addChangeListener(markerChangeListener30);
        java.lang.String str32 = valueMarker22.getLabel();
        java.awt.Font font33 = valueMarker22.getLabelFont();
        double double34 = valueMarker22.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.awt.Stroke stroke37 = valueMarker36.getOutlineStroke();
        valueMarker22.setStroke(stroke37);
        java.lang.Object obj39 = valueMarker22.clone();
        java.awt.Stroke stroke40 = valueMarker22.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker42.setLabel("");
        java.awt.Paint paint45 = valueMarker42.getPaint();
        java.lang.String str46 = valueMarker42.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent47 = null;
        valueMarker42.notifyListeners(markerChangeEvent47);
        java.awt.Paint paint49 = valueMarker42.getPaint();
        valueMarker42.setLabel("hi!");
        double double52 = valueMarker42.getValue();
        java.awt.Stroke stroke53 = valueMarker42.getOutlineStroke();
        valueMarker22.setOutlineStroke(stroke53);
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker56.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent59 = null;
        valueMarker56.notifyListeners(markerChangeEvent59);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent61 = null;
        valueMarker56.notifyListeners(markerChangeEvent61);
        java.awt.Stroke stroke63 = valueMarker56.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker65 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker65.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener68 = null;
        valueMarker65.addChangeListener(markerChangeListener68);
        double double70 = valueMarker65.getValue();
        java.awt.Paint paint71 = valueMarker65.getLabelPaint();
        valueMarker56.setLabelPaint(paint71);
        org.jfree.chart.plot.ValueMarker valueMarker75 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker75.setLabel("");
        java.awt.Paint paint78 = valueMarker75.getPaint();
        java.lang.String str79 = valueMarker75.getLabel();
        java.awt.Paint paint80 = valueMarker75.getLabelPaint();
        java.awt.Paint paint81 = valueMarker75.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker83 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker83.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener86 = null;
        valueMarker83.addChangeListener(markerChangeListener86);
        double double88 = valueMarker83.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor89 = valueMarker83.getLabelAnchor();
        valueMarker83.setLabel("hi!");
        java.awt.Stroke stroke92 = valueMarker83.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker93 = new org.jfree.chart.plot.ValueMarker((double) (short) 0, paint81, stroke92);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker95 = new org.jfree.chart.plot.ValueMarker((double) (short) 1, paint20, stroke53, paint71, stroke92, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(stroke63);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertNotNull(paint71);
        org.junit.Assert.assertNotNull(paint78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(paint80);
        org.junit.Assert.assertNotNull(paint81);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 10.0d + "'", double88 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor89);
        org.junit.Assert.assertNotNull(stroke92);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.addChangeListener(markerChangeListener23);
        java.awt.Stroke stroke25 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        double double12 = valueMarker1.getValue();
        java.awt.Paint paint13 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        double double14 = valueMarker1.getValue();
        double double15 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        float float11 = valueMarker1.getAlpha();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        double double15 = valueMarker10.getValue();
        java.awt.Paint paint16 = valueMarker10.getLabelPaint();
        java.awt.Paint paint17 = valueMarker10.getOutlinePaint();
        java.awt.Stroke stroke18 = valueMarker10.getOutlineStroke();
        java.awt.Stroke stroke19 = valueMarker10.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker10.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor20);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker13.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor19);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke23 = valueMarker1.getStroke();
        java.awt.Font font24 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker26.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType27);
        java.awt.Font font29 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelFont(font29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        boolean boolean10 = valueMarker1.equals((java.lang.Object) (short) -1);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker15.getLabelTextAnchor();
        valueMarker12.setLabelTextAnchor(textAnchor18);
        valueMarker1.setLabelTextAnchor(textAnchor18);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        valueMarker24.notifyListeners(markerChangeEvent27);
        valueMarker24.setValue((double) 0.8f);
        boolean boolean31 = valueMarker22.equals((java.lang.Object) valueMarker24);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker24.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType32);
        double double34 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font7 = valueMarker6.getLabelFont();
        java.awt.Stroke stroke8 = valueMarker6.getOutlineStroke();
        java.awt.Stroke stroke9 = valueMarker6.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) 'a');
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint13 = valueMarker12.getLabelPaint();
        java.awt.Stroke stroke14 = valueMarker12.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        valueMarker24.notifyListeners(markerChangeEvent27);
        valueMarker24.setValue((double) 0.8f);
        boolean boolean31 = valueMarker22.equals((java.lang.Object) valueMarker24);
        java.awt.Stroke stroke32 = valueMarker24.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint20, stroke32);
        valueMarker12.setOutlineStroke(stroke32);
        valueMarker1.setOutlineStroke(stroke32);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        java.awt.Paint paint16 = valueMarker1.getPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '#');
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
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        double double17 = valueMarker12.getValue();
        java.awt.Paint paint18 = valueMarker12.getOutlinePaint();
        java.awt.Paint paint19 = valueMarker12.getLabelPaint();
        java.awt.Paint paint20 = valueMarker12.getPaint();
        valueMarker1.setPaint(paint20);
        java.awt.Paint paint22 = valueMarker1.getPaint();
        java.awt.Stroke stroke23 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        float float5 = valueMarker2.getAlpha();
        java.lang.String str6 = valueMarker2.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker2.removeChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker2.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getPaint();
        java.lang.String str15 = valueMarker11.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker11.getLabelOffsetType();
        valueMarker11.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getPaint();
        java.lang.Object obj24 = valueMarker20.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker20.getLabelOffsetType();
        valueMarker20.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker20.addChangeListener(markerChangeListener28);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker20.getLabelOffset();
        valueMarker11.setLabelOffset(rectangleInsets30);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        valueMarker11.notifyListeners(markerChangeEvent32);
        java.awt.Paint paint34 = valueMarker11.getPaint();
        valueMarker2.setPaint(paint34);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        java.awt.Paint paint40 = valueMarker37.getOutlinePaint();
        java.awt.Stroke stroke41 = valueMarker37.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = valueMarker43.getLabelOffset();
        valueMarker37.setLabelOffset(rectangleInsets44);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = valueMarker37.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = valueMarker37.getLabelOffset();
        java.lang.Object obj48 = valueMarker37.clone();
        java.awt.Stroke stroke49 = valueMarker37.getStroke();
        java.awt.Stroke stroke50 = valueMarker37.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setLabel("");
        java.awt.Paint paint55 = valueMarker52.getPaint();
        java.awt.Stroke stroke56 = valueMarker52.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker58.setLabel("");
        java.awt.Paint paint61 = valueMarker58.getOutlinePaint();
        valueMarker52.setLabelPaint(paint61);
        float float63 = valueMarker52.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener64 = null;
        valueMarker52.addChangeListener(markerChangeListener64);
        java.awt.Stroke stroke66 = valueMarker52.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor67 = valueMarker52.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener68 = null;
        valueMarker52.removeChangeListener(markerChangeListener68);
        java.lang.Object obj70 = valueMarker52.clone();
        float float71 = valueMarker52.getAlpha();
        java.awt.Paint paint72 = valueMarker52.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker74 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker74.setLabel("");
        java.awt.Paint paint77 = valueMarker74.getPaint();
        java.lang.String str78 = valueMarker74.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker80 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint81 = valueMarker80.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor82 = valueMarker80.getLabelAnchor();
        valueMarker74.setLabelAnchor(rectangleAnchor82);
        java.awt.Paint paint84 = valueMarker74.getPaint();
        java.awt.Paint paint85 = valueMarker74.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker87 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.awt.Stroke stroke88 = valueMarker87.getOutlineStroke();
        valueMarker74.setOutlineStroke(stroke88);
        java.awt.Stroke stroke90 = valueMarker74.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker92 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint34, stroke50, paint72, stroke90, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(rectangleAnchor46);
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.8f + "'", float63 == 0.8f);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertNotNull(textAnchor67);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.8f + "'", float71 == 0.8f);
        org.junit.Assert.assertNotNull(paint72);
        org.junit.Assert.assertNotNull(paint77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(paint81);
        org.junit.Assert.assertNotNull(rectangleAnchor82);
        org.junit.Assert.assertNotNull(paint84);
        org.junit.Assert.assertNotNull(paint85);
        org.junit.Assert.assertNotNull(stroke88);
        org.junit.Assert.assertNotNull(stroke90);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        double double21 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        float float18 = valueMarker1.getAlpha();
        valueMarker1.setAlpha((float) (byte) 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        float float17 = valueMarker1.getAlpha();
        java.lang.Class<?> wildcardClass18 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker16.addChangeListener(markerChangeListener21);
        java.awt.Paint paint23 = valueMarker16.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10.0f);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getPaint();
        java.awt.Stroke stroke32 = valueMarker28.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        java.awt.Paint paint37 = valueMarker34.getOutlinePaint();
        valueMarker28.setLabelPaint(paint37);
        float float39 = valueMarker28.getAlpha();
        valueMarker28.setLabel("");
        valueMarker28.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor44 = valueMarker28.getLabelTextAnchor();
        java.awt.Paint paint45 = valueMarker28.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType46 = valueMarker28.getLabelOffsetType();
        java.awt.Paint paint47 = valueMarker28.getOutlinePaint();
        valueMarker28.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener50 = null;
        valueMarker28.addChangeListener(markerChangeListener50);
        java.awt.Stroke stroke52 = valueMarker28.getOutlineStroke();
        valueMarker26.setStroke(stroke52);
        valueMarker16.setOutlineStroke(stroke52);
        boolean boolean55 = valueMarker1.equals((java.lang.Object) valueMarker16);
        valueMarker16.setAlpha((float) 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.8f + "'", float39 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(lengthAdjustmentType46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        java.awt.Paint paint19 = valueMarker18.getOutlinePaint();
        valueMarker18.setValue((double) 10);
        double double22 = valueMarker18.getValue();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint6 = valueMarker2.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker2.addChangeListener(markerChangeListener7);
        float float9 = valueMarker2.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker2.notifyListeners(markerChangeEvent10);
        java.awt.Paint paint12 = valueMarker2.getPaint();
        java.awt.Stroke stroke13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 0, paint12, stroke13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker2.removeChangeListener(markerChangeListener7);
        java.awt.Stroke stroke9 = valueMarker2.getOutlineStroke();
        boolean boolean11 = valueMarker2.equals((java.lang.Object) (short) -1);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.lang.String str17 = valueMarker13.getLabel();
        java.awt.Paint paint18 = valueMarker13.getLabelPaint();
        valueMarker2.setLabelPaint(paint18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getOutlinePaint();
        java.awt.Stroke stroke25 = valueMarker21.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getPaint();
        java.awt.Stroke stroke31 = valueMarker27.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        java.awt.Paint paint36 = valueMarker33.getPaint();
        java.lang.String str37 = valueMarker33.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType38 = valueMarker33.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = valueMarker33.getLabelOffset();
        valueMarker27.setLabelOffset(rectangleInsets39);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor41 = valueMarker27.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor42 = valueMarker27.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor45 = valueMarker44.getLabelAnchor();
        java.awt.Paint paint46 = valueMarker44.getLabelPaint();
        valueMarker27.setPaint(paint46);
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str50 = valueMarker49.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener51 = null;
        valueMarker49.addChangeListener(markerChangeListener51);
        org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker54.setLabel("");
        float float57 = valueMarker54.getAlpha();
        java.lang.String str58 = valueMarker54.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener59 = null;
        valueMarker54.removeChangeListener(markerChangeListener59);
        valueMarker54.setAlpha((float) 1L);
        java.awt.Stroke stroke63 = valueMarker54.getStroke();
        valueMarker49.setStroke(stroke63);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker66 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint18, stroke25, paint46, stroke63, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType38);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertNotNull(rectangleAnchor41);
        org.junit.Assert.assertNotNull(textAnchor42);
        org.junit.Assert.assertNotNull(rectangleAnchor45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.8f + "'", float57 == 0.8f);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(stroke63);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font18 = valueMarker17.getLabelFont();
        java.awt.Stroke stroke19 = valueMarker17.getOutlineStroke();
        java.awt.Stroke stroke20 = valueMarker17.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.lang.Object obj26 = valueMarker22.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker22.getLabelOffsetType();
        valueMarker22.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker22.addChangeListener(markerChangeListener30);
        java.lang.String str32 = valueMarker22.getLabel();
        java.awt.Font font33 = valueMarker22.getLabelFont();
        valueMarker17.setLabelFont(font33);
        valueMarker1.setLabelFont(font33);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType36 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker38.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker38.addChangeListener(markerChangeListener41);
        double double43 = valueMarker38.getValue();
        java.awt.Paint paint44 = valueMarker38.getOutlinePaint();
        java.awt.Paint paint45 = valueMarker38.getLabelPaint();
        valueMarker38.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        valueMarker38.notifyListeners(markerChangeEvent48);
        java.lang.Object obj50 = valueMarker38.clone();
        java.lang.Class<?> wildcardClass51 = valueMarker38.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray52 = valueMarker1.getListeners((java.lang.Class) wildcardClass51);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(lengthAdjustmentType36);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        java.awt.Font font17 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint24 = valueMarker8.getPaint();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        float float18 = valueMarker17.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker17.removeChangeListener(markerChangeListener19);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        valueMarker1.setLabel("");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker6.getLabelOffsetType();
        double double10 = valueMarker6.getValue();
        java.awt.Paint paint11 = valueMarker6.getPaint();
        valueMarker1.setPaint(paint11);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        java.awt.Stroke stroke20 = valueMarker1.getOutlineStroke();
        java.awt.Font font21 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke22 = valueMarker1.getStroke();
        double double23 = valueMarker1.getValue();
        java.awt.Font font24 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke25 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        java.awt.Paint paint13 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Font font18 = valueMarker15.getLabelFont();
        valueMarker1.setLabelFont(font18);
        valueMarker1.setValue((double) 0L);
        java.awt.Font font22 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getPaint();
        java.lang.String str28 = valueMarker24.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker24.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        valueMarker34.notifyListeners(markerChangeEvent37);
        valueMarker34.setValue((double) 0.8f);
        boolean boolean41 = valueMarker32.equals((java.lang.Object) valueMarker34);
        java.awt.Stroke stroke42 = valueMarker34.getStroke();
        valueMarker24.setOutlineStroke(stroke42);
        valueMarker24.setValue((double) (byte) 0);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType46 = valueMarker24.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType46);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener48 = null;
        valueMarker1.removeChangeListener(markerChangeListener48);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(lengthAdjustmentType46);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue(32.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(textAnchor19);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        float float30 = valueMarker27.getAlpha();
        java.lang.String str31 = valueMarker27.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker27.removeChangeListener(markerChangeListener32);
        valueMarker27.setAlpha((float) 1L);
        java.lang.String str36 = valueMarker27.getLabel();
        java.awt.Stroke stroke37 = valueMarker27.getStroke();
        valueMarker1.setStroke(stroke37);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        float float43 = valueMarker40.getAlpha();
        java.lang.String str44 = valueMarker40.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker46.setLabel("");
        java.awt.Paint paint49 = valueMarker46.getPaint();
        java.awt.Stroke stroke50 = valueMarker46.getOutlineStroke();
        valueMarker40.setStroke(stroke50);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker40.removeChangeListener(markerChangeListener52);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener54 = null;
        valueMarker40.addChangeListener(markerChangeListener54);
        valueMarker40.setValue((double) '#');
        java.awt.Paint paint58 = valueMarker40.getPaint();
        valueMarker1.setLabelPaint(paint58);
        double double60 = valueMarker1.getValue();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.8f + "'", float43 == 0.8f);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker2.notifyListeners(markerChangeEvent4);
        float float6 = valueMarker2.getAlpha();
        java.awt.Font font7 = valueMarker2.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker2.removeChangeListener(markerChangeListener8);
        java.lang.String str10 = valueMarker2.getLabel();
        java.awt.Font font11 = valueMarker2.getLabelFont();
        java.awt.Paint paint12 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker14.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker14.removeChangeListener(markerChangeListener19);
        java.awt.Stroke stroke21 = valueMarker14.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 0, paint12, stroke21);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        java.lang.Class class20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray21 = valueMarker1.getListeners(class20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        valueMarker1.setValue((double) (-1L));
        java.lang.Object obj4 = valueMarker1.clone();
        double double5 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        float float10 = valueMarker7.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.awt.Stroke stroke16 = valueMarker12.getOutlineStroke();
        java.awt.Font font17 = valueMarker12.getLabelFont();
        valueMarker7.setLabelFont(font17);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker7.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker7.getLabelAnchor();
        valueMarker7.setAlpha(1.0f);
        java.awt.Stroke stroke23 = valueMarker7.getStroke();
        java.awt.Paint paint24 = valueMarker7.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint24);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Stroke stroke10 = valueMarker7.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke10);
        java.awt.Paint paint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.awt.Stroke stroke10 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        java.lang.Object obj19 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.lang.Class<?> wildcardClass9 = paint8.getClass();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker3.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleAnchor29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType31);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        float float18 = valueMarker10.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.removeChangeListener(markerChangeListener15);
        double double17 = valueMarker1.getValue();
        float float18 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        double double11 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        float float14 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.lang.Object obj5 = valueMarker1.clone();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        valueMarker1.setAlpha((float) 1L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        java.awt.Font font18 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        java.lang.Object obj9 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker11.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor14);
        double double16 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        java.awt.Paint paint17 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker1.notifyListeners(markerChangeEvent5);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.awt.Stroke stroke6 = valueMarker2.getOutlineStroke();
        java.awt.Font font7 = valueMarker2.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker2.addChangeListener(markerChangeListener8);
        java.awt.Font font10 = valueMarker2.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker12.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker12.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker12.notifyListeners(markerChangeEvent19);
        java.awt.Paint paint21 = valueMarker12.getPaint();
        java.awt.Paint paint22 = valueMarker12.getLabelPaint();
        boolean boolean23 = valueMarker2.equals((java.lang.Object) paint22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker25.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker25.getLabelAnchor();
        valueMarker25.setLabel("hi!");
        java.lang.Object obj32 = valueMarker25.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        valueMarker25.notifyListeners(markerChangeEvent33);
        java.awt.Stroke stroke35 = valueMarker25.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        java.awt.Paint paint40 = valueMarker37.getPaint();
        java.awt.Stroke stroke41 = valueMarker37.getOutlineStroke();
        java.awt.Stroke stroke42 = valueMarker37.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker44.setLabel("");
        java.awt.Paint paint47 = valueMarker44.getPaint();
        java.lang.String str48 = valueMarker44.getLabel();
        java.awt.Paint paint49 = valueMarker44.getLabelPaint();
        java.awt.Paint paint50 = valueMarker44.getPaint();
        valueMarker37.setPaint(paint50);
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker53.setLabel("");
        java.awt.Paint paint56 = valueMarker53.getPaint();
        java.lang.Object obj57 = valueMarker53.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType58 = valueMarker53.getLabelOffsetType();
        valueMarker53.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener61 = null;
        valueMarker53.addChangeListener(markerChangeListener61);
        java.lang.String str63 = valueMarker53.getLabel();
        java.awt.Font font64 = valueMarker53.getLabelFont();
        double double65 = valueMarker53.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker67 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.awt.Stroke stroke68 = valueMarker67.getOutlineStroke();
        valueMarker53.setStroke(stroke68);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker71 = new org.jfree.chart.plot.ValueMarker(0.0d, paint22, stroke35, paint50, stroke68, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(rectangleAnchor29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(lengthAdjustmentType58);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(font64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(stroke68);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker1.notifyListeners(markerChangeEvent18);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        java.awt.Paint paint29 = valueMarker1.getLabelPaint();
        valueMarker1.setValue((double) 0.0f);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        valueMarker1.notifyListeners(markerChangeEvent32);
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
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        java.awt.Font font14 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        float float30 = valueMarker27.getAlpha();
        java.lang.String str31 = valueMarker27.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker27.removeChangeListener(markerChangeListener32);
        valueMarker27.setAlpha((float) 1L);
        java.lang.String str36 = valueMarker27.getLabel();
        java.awt.Stroke stroke37 = valueMarker27.getStroke();
        valueMarker1.setStroke(stroke37);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        float float43 = valueMarker40.getAlpha();
        java.lang.String str44 = valueMarker40.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker46.setLabel("");
        java.awt.Paint paint49 = valueMarker46.getPaint();
        java.awt.Stroke stroke50 = valueMarker46.getOutlineStroke();
        valueMarker40.setStroke(stroke50);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker40.removeChangeListener(markerChangeListener52);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener54 = null;
        valueMarker40.addChangeListener(markerChangeListener54);
        valueMarker40.setValue((double) '#');
        java.awt.Paint paint58 = valueMarker40.getPaint();
        valueMarker1.setLabelPaint(paint58);
        double double60 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor61 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.8f + "'", float43 == 0.8f);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor61);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker16.addChangeListener(markerChangeListener21);
        java.awt.Paint paint23 = valueMarker16.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10.0f);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getPaint();
        java.awt.Stroke stroke32 = valueMarker28.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        java.awt.Paint paint37 = valueMarker34.getOutlinePaint();
        valueMarker28.setLabelPaint(paint37);
        float float39 = valueMarker28.getAlpha();
        valueMarker28.setLabel("");
        valueMarker28.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor44 = valueMarker28.getLabelTextAnchor();
        java.awt.Paint paint45 = valueMarker28.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType46 = valueMarker28.getLabelOffsetType();
        java.awt.Paint paint47 = valueMarker28.getOutlinePaint();
        valueMarker28.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener50 = null;
        valueMarker28.addChangeListener(markerChangeListener50);
        java.awt.Stroke stroke52 = valueMarker28.getOutlineStroke();
        valueMarker26.setStroke(stroke52);
        valueMarker16.setOutlineStroke(stroke52);
        boolean boolean55 = valueMarker1.equals((java.lang.Object) valueMarker16);
        org.jfree.chart.plot.ValueMarker valueMarker57 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke58 = valueMarker57.getStroke();
        valueMarker16.setOutlineStroke(stroke58);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.8f + "'", float39 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(lengthAdjustmentType46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(stroke58);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker24.getLabelOffset();
        valueMarker24.setValue((double) (-1.0f));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker24.getLabelAnchor();
        boolean boolean29 = valueMarker1.equals((java.lang.Object) valueMarker24);
        double double30 = valueMarker24.getValue();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.awt.Stroke stroke2 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str5 = valueMarker4.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker4.addChangeListener(markerChangeListener6);
        java.awt.Font font8 = valueMarker4.getLabelFont();
        valueMarker1.setLabelFont(font8);
        float float10 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        java.awt.Stroke stroke29 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker1.getLabelOffset();
        java.awt.Font font18 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        float float36 = valueMarker3.getAlpha();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.8f + "'", float36 == 0.8f);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        java.awt.Paint paint19 = valueMarker18.getOutlinePaint();
        valueMarker18.setValue((double) 10);
        java.awt.Stroke stroke22 = valueMarker18.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.awt.Paint paint3 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke6 = valueMarker5.getStroke();
        valueMarker1.setStroke(stroke6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        valueMarker1.setValue((double) 0);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType9);
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.awt.Stroke stroke2 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke3 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker1.notifyListeners(markerChangeEvent11);
        java.awt.Paint paint13 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker15.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker15.notifyListeners(markerChangeEvent17);
        float float19 = valueMarker15.getAlpha();
        java.awt.Font font20 = valueMarker15.getLabelFont();
        valueMarker1.setLabelFont(font20);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.awt.Paint paint15 = valueMarker14.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker14.getLabelAnchor();
        double double17 = valueMarker14.getValue();
        java.awt.Stroke stroke18 = valueMarker14.getStroke();
        valueMarker1.setOutlineStroke(stroke18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        java.awt.Paint paint22 = valueMarker21.getLabelPaint();
        valueMarker1.setLabelPaint(paint22);
        valueMarker1.setValue((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.removeChangeListener(markerChangeListener15);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker1.getLabelAnchor();
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
        org.junit.Assert.assertNotNull(rectangleAnchor29);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint12 = valueMarker1.getPaint();
        java.awt.Paint paint13 = valueMarker1.getOutlinePaint();
        java.awt.Font font14 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        java.lang.String str15 = valueMarker1.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke17 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        java.awt.Paint paint34 = valueMarker31.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker31.removeChangeListener(markerChangeListener35);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker31.addChangeListener(markerChangeListener37);
        java.awt.Paint paint39 = valueMarker31.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType40 = valueMarker31.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType40);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(lengthAdjustmentType40);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke6 = valueMarker5.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker5.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker5.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets9);
        java.awt.Font font11 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.lang.String str3 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.lang.String str25 = valueMarker21.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        valueMarker21.notifyListeners(markerChangeEvent26);
        java.awt.Paint paint28 = valueMarker21.getPaint();
        valueMarker1.setPaint(paint28);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        java.awt.Stroke stroke20 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.removeChangeListener(markerChangeListener15);
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker19.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker19.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker19.addChangeListener(markerChangeListener24);
        valueMarker19.setLabel("");
        valueMarker19.setLabel("");
        java.awt.Paint paint30 = valueMarker19.getOutlinePaint();
        valueMarker19.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType33 = valueMarker19.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType33);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(lengthAdjustmentType33);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        valueMarker1.setAlpha((float) 0);
        valueMarker1.setAlpha((float) 1L);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) '#');
        java.awt.Paint paint16 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint17 = valueMarker1.getOutlinePaint();
        java.lang.Object obj18 = valueMarker1.clone();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(textAnchor19);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.lang.Object obj5 = valueMarker1.clone();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker9.notifyListeners(markerChangeEvent11);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker9.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType13);
        java.awt.Stroke stroke15 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        java.awt.Stroke stroke20 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint21 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font8 = valueMarker1.getLabelFont();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker12.notifyListeners(markerChangeEvent15);
        java.awt.Stroke stroke17 = valueMarker12.getStroke();
        java.lang.Object obj18 = valueMarker12.clone();
        valueMarker12.setValue((double) (short) 100);
        valueMarker12.setAlpha(0.0f);
        java.awt.Font font23 = valueMarker12.getLabelFont();
        valueMarker1.setLabelFont(font23);
        float float25 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        java.lang.Object obj24 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        float float5 = valueMarker1.getAlpha();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        java.lang.String str9 = valueMarker1.getLabel();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        java.lang.Class<?> wildcardClass12 = paint11.getClass();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        java.lang.Object obj21 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker28.getLabelAnchor();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        valueMarker1.setPaint(paint30);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        valueMarker1.notifyListeners(markerChangeEvent32);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor29);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker19.addChangeListener(markerChangeListener22);
        double double24 = valueMarker19.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker19.getLabelAnchor();
        valueMarker19.setLabel("hi!");
        java.awt.Stroke stroke28 = valueMarker19.getStroke();
        valueMarker1.setStroke(stroke28);
        valueMarker1.setValue((double) (-1));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        java.awt.Paint paint25 = valueMarker22.getOutlinePaint();
        java.awt.Stroke stroke26 = valueMarker22.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker28.getLabelOffset();
        valueMarker22.setLabelOffset(rectangleInsets29);
        java.lang.Class<?> wildcardClass31 = rectangleInsets29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray32 = valueMarker1.getListeners((java.lang.Class) wildcardClass31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.RectangleInsets; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.removeChangeListener(markerChangeListener24);
        java.lang.Class<?> wildcardClass26 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.awt.Stroke stroke22 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setStroke(stroke22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Stroke stroke12 = valueMarker11.getOutlineStroke();
        java.awt.Paint paint13 = valueMarker11.getPaint();
        valueMarker1.setPaint(paint13);
        java.lang.String str15 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(textAnchor19);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint11 = valueMarker10.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint11, stroke17);
        valueMarker1.setStroke(stroke17);
        java.awt.Font font20 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        valueMarker1.setAlpha((float) 1);
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        java.awt.Paint paint19 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        valueMarker1.notifyListeners(markerChangeEvent28);
        java.awt.Paint paint30 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker1.notifyListeners(markerChangeEvent11);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke15 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        java.awt.Paint paint12 = valueMarker1.getOutlinePaint();
        java.lang.Object obj13 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker10.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker1.notifyListeners(markerChangeEvent20);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.addChangeListener(markerChangeListener22);
        java.awt.Paint paint24 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        valueMarker1.setLabel("");
        java.awt.Paint paint12 = valueMarker1.getOutlinePaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        java.lang.String str16 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker2.notifyListeners(markerChangeEvent17);
        java.awt.Paint paint19 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker2.getLabelPaint();
        java.awt.Paint paint21 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke25 = valueMarker24.getStroke();
        java.awt.Paint paint26 = valueMarker24.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        float float31 = valueMarker28.getAlpha();
        java.awt.Stroke stroke32 = valueMarker28.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint26, stroke32);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker35.addChangeListener(markerChangeListener38);
        double double40 = valueMarker35.getValue();
        java.awt.Paint paint41 = valueMarker35.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker43.setLabel("");
        java.awt.Paint paint46 = valueMarker43.getOutlinePaint();
        java.awt.Paint paint47 = valueMarker43.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener48 = null;
        valueMarker43.addChangeListener(markerChangeListener48);
        float float50 = valueMarker43.getAlpha();
        java.awt.Stroke stroke51 = valueMarker43.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker(0.0d, paint21, stroke32, paint41, stroke51, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.8f + "'", float31 == 0.8f);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.8f + "'", float50 == 0.8f);
        org.junit.Assert.assertNotNull(stroke51);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        java.lang.Class<?> wildcardClass8 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        float float5 = valueMarker1.getAlpha();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.lang.String str16 = valueMarker12.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker12.getLabelOffset();
        float float19 = valueMarker12.getAlpha();
        java.awt.Paint paint20 = valueMarker12.getOutlinePaint();
        valueMarker1.setPaint(paint20);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        float float17 = valueMarker1.getAlpha();
        java.awt.Paint paint18 = valueMarker1.getPaint();
        valueMarker1.setValue((double) 0L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        double double20 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker23.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker23.notifyListeners(markerChangeEvent25);
        java.awt.Paint paint27 = valueMarker23.getLabelPaint();
        valueMarker1.setPaint(paint27);
        java.awt.Paint paint29 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker7.notifyListeners(markerChangeEvent10);
        valueMarker7.setValue((double) 0.8f);
        boolean boolean14 = valueMarker5.equals((java.lang.Object) valueMarker7);
        java.awt.Stroke stroke15 = valueMarker7.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint17 = valueMarker7.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke20 = valueMarker19.getStroke();
        valueMarker7.setOutlineStroke(stroke20);
        valueMarker1.setStroke(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker9.notifyListeners(markerChangeEvent12);
        valueMarker9.setValue((double) 0.8f);
        boolean boolean16 = valueMarker7.equals((java.lang.Object) valueMarker9);
        java.awt.Stroke stroke17 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker9.getLabelTextAnchor();
        java.awt.Paint paint19 = valueMarker9.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke22 = valueMarker21.getStroke();
        valueMarker9.setOutlineStroke(stroke22);
        java.awt.Font font24 = valueMarker9.getLabelFont();
        java.lang.Class<?> wildcardClass25 = font24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray26 = valueMarker1.getListeners((java.lang.Class) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Font; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        java.awt.Paint paint11 = valueMarker10.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker11.notifyListeners(markerChangeEvent14);
        java.awt.Stroke stroke16 = valueMarker11.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker19.getLabelAnchor();
        valueMarker11.setLabelAnchor(rectangleAnchor21);
        valueMarker1.setLabelAnchor(rectangleAnchor21);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker1.getLabelOffset();
        java.lang.String str25 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        java.awt.Stroke stroke11 = valueMarker3.getStroke();
        java.awt.Stroke stroke12 = valueMarker3.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker3.addChangeListener(markerChangeListener13);
        java.awt.Stroke stroke15 = valueMarker3.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker3.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        java.awt.Paint paint38 = null;
        valueMarker1.setOutlinePaint(paint38);
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
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        double double7 = valueMarker1.getValue();
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.awt.Stroke stroke10 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        java.lang.Object obj31 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(textAnchor24);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker7.addChangeListener(markerChangeListener10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker7.removeChangeListener(markerChangeListener12);
        java.awt.Stroke stroke14 = valueMarker7.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str17 = valueMarker16.getLabel();
        java.awt.Paint paint18 = valueMarker16.getLabelPaint();
        valueMarker7.setLabelPaint(paint18);
        valueMarker1.setPaint(paint18);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker1.notifyListeners(markerChangeEvent21);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Font font9 = valueMarker1.getLabelFont();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.lang.String str7 = valueMarker3.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker3.getLabelOffsetType();
        valueMarker3.setAlpha((float) (short) 0);
        java.lang.Object obj11 = valueMarker3.clone();
        java.awt.Font font12 = valueMarker3.getLabelFont();
        double double13 = valueMarker3.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        double double20 = valueMarker15.getValue();
        java.awt.Paint paint21 = valueMarker15.getOutlinePaint();
        java.awt.Paint paint22 = valueMarker15.getLabelPaint();
        java.awt.Paint paint23 = valueMarker15.getPaint();
        valueMarker15.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getPaint();
        java.awt.Stroke stroke31 = valueMarker27.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        java.awt.Paint paint36 = valueMarker33.getOutlinePaint();
        valueMarker27.setLabelPaint(paint36);
        float float38 = valueMarker27.getAlpha();
        valueMarker27.setLabel("");
        valueMarker27.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor43 = valueMarker27.getLabelTextAnchor();
        java.awt.Paint paint44 = valueMarker27.getOutlinePaint();
        valueMarker15.setLabelPaint(paint44);
        java.lang.String str46 = valueMarker15.getLabel();
        java.awt.Stroke stroke47 = valueMarker15.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor48 = valueMarker15.getLabelTextAnchor();
        valueMarker15.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font53 = valueMarker52.getLabelFont();
        java.awt.Stroke stroke54 = valueMarker52.getOutlineStroke();
        java.awt.Stroke stroke55 = valueMarker52.getOutlineStroke();
        valueMarker15.setStroke(stroke55);
        valueMarker3.setOutlineStroke(stroke55);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint1, stroke55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.8f + "'", float38 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(textAnchor48);
        org.junit.Assert.assertNotNull(font53);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(stroke55);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.lang.Object obj5 = valueMarker1.clone();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker1.notifyListeners(markerChangeEvent15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        java.lang.Object obj12 = valueMarker1.clone();
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        java.awt.Paint paint16 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker17.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor18);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertNotNull(textAnchor18);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker1.removeChangeListener(markerChangeListener30);
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
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke8);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        valueMarker1.setValue(32.0d);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        valueMarker3.setValue((double) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker2.getLabelTextAnchor();
        java.awt.Stroke stroke19 = valueMarker2.getOutlineStroke();
        java.awt.Paint paint20 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.lang.String str26 = valueMarker22.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        valueMarker22.notifyListeners(markerChangeEvent27);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker30.getLabelOffset();
        valueMarker22.setLabelOffset(rectangleInsets31);
        java.awt.Stroke stroke33 = valueMarker22.getStroke();
        double double34 = valueMarker22.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType39 = valueMarker36.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType40 = valueMarker36.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker36.addChangeListener(markerChangeListener41);
        valueMarker36.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker36.addChangeListener(markerChangeListener45);
        valueMarker36.setValue((double) (-1L));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType49 = valueMarker36.getLabelOffsetType();
        float float50 = valueMarker36.getAlpha();
        boolean boolean51 = valueMarker22.equals((java.lang.Object) float50);
        valueMarker22.setAlpha(0.8f);
        java.awt.Stroke stroke54 = valueMarker22.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint57 = valueMarker56.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker59.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener62 = null;
        valueMarker59.addChangeListener(markerChangeListener62);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener64 = null;
        valueMarker59.removeChangeListener(markerChangeListener64);
        org.jfree.chart.plot.ValueMarker valueMarker68 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint69 = valueMarker68.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker71 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker71.setLabel("");
        java.awt.Paint paint74 = valueMarker71.getPaint();
        java.awt.Stroke stroke75 = valueMarker71.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker76 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint69, stroke75);
        boolean boolean77 = valueMarker59.equals((java.lang.Object) paint69);
        java.awt.Paint paint78 = valueMarker59.getLabelPaint();
        java.awt.Stroke stroke79 = valueMarker59.getOutlineStroke();
        java.awt.Stroke stroke80 = valueMarker59.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker82 = new org.jfree.chart.plot.ValueMarker((double) ' ', paint20, stroke54, paint57, stroke80, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType39);
        org.junit.Assert.assertNotNull(lengthAdjustmentType40);
        org.junit.Assert.assertNotNull(lengthAdjustmentType49);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.8f + "'", float50 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertNotNull(stroke75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(paint78);
        org.junit.Assert.assertNotNull(stroke79);
        org.junit.Assert.assertNotNull(stroke80);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker1.getLabelOffset();
        java.awt.Paint paint17 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker1.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker1.notifyListeners(markerChangeEvent18);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor17);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        java.awt.Stroke stroke15 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.awt.Paint paint29 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker22.addChangeListener(markerChangeListener23);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        java.awt.Paint paint29 = valueMarker26.getPaint();
        java.awt.Stroke stroke30 = valueMarker26.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker32.setLabel("");
        java.awt.Paint paint35 = valueMarker32.getOutlinePaint();
        valueMarker26.setLabelPaint(paint35);
        float float37 = valueMarker26.getAlpha();
        valueMarker26.setLabel("");
        java.awt.Paint paint40 = valueMarker26.getOutlinePaint();
        java.awt.Paint paint41 = valueMarker26.getOutlinePaint();
        valueMarker22.setPaint(paint41);
        valueMarker1.setOutlinePaint(paint41);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.8f + "'", float37 == 0.8f);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker12.getLabelTextAnchor();
        float float16 = valueMarker12.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker12.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str21 = valueMarker20.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker20.addChangeListener(markerChangeListener22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font26 = valueMarker25.getLabelFont();
        java.awt.Stroke stroke27 = valueMarker25.getOutlineStroke();
        java.awt.Stroke stroke28 = valueMarker25.getOutlineStroke();
        valueMarker20.setOutlineStroke(stroke28);
        valueMarker1.setOutlineStroke(stroke28);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 100);
        java.lang.Class<?> wildcardClass33 = valueMarker32.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray34 = valueMarker1.getListeners((java.lang.Class) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker1.getLabelOffset();
        java.lang.Class<?> wildcardClass9 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        java.awt.Stroke stroke35 = valueMarker1.getOutlineStroke();
        java.lang.String str36 = valueMarker1.getLabel();
        java.awt.Font font37 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        valueMarker1.notifyListeners(markerChangeEvent38);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(font37);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        double double14 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        java.awt.Paint paint21 = valueMarker1.getOutlinePaint();
        java.lang.Object obj22 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.removeChangeListener(markerChangeListener23);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        java.lang.Object obj25 = valueMarker1.clone();
        valueMarker1.setLabel("hi!");
        java.awt.Font font28 = valueMarker1.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(textAnchor29);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        java.lang.Object obj19 = valueMarker1.clone();
        float float20 = valueMarker1.getAlpha();
        java.awt.Paint paint21 = valueMarker1.getPaint();
        float float22 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.lang.Object obj10 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        valueMarker1.setLabel("hi!");
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Font font10 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font10);
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        double double13 = valueMarker1.getValue();
        java.awt.Paint paint14 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(textAnchor12);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker10.notifyListeners(markerChangeEvent13);
        valueMarker10.setValue((double) 0.8f);
        boolean boolean17 = valueMarker8.equals((java.lang.Object) valueMarker10);
        valueMarker10.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker10.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.lang.String str9 = valueMarker1.getLabel();
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint14 = valueMarker13.getOutlinePaint();
        java.lang.Class<?> wildcardClass15 = paint14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray16 = valueMarker1.getListeners((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        java.lang.String str16 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        java.awt.Stroke stroke22 = valueMarker8.getStroke();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker2.notifyListeners(markerChangeEvent17);
        java.awt.Paint paint19 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.lang.Object obj26 = valueMarker22.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker22.getLabelOffsetType();
        valueMarker22.setValue((double) 0);
        valueMarker22.setLabel("hi!");
        java.awt.Stroke stroke32 = valueMarker22.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        java.awt.Paint paint37 = valueMarker34.getPaint();
        java.awt.Stroke stroke38 = valueMarker34.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        java.awt.Paint paint43 = valueMarker40.getOutlinePaint();
        valueMarker34.setLabelPaint(paint43);
        float float45 = valueMarker34.getAlpha();
        valueMarker34.setLabel("");
        valueMarker34.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor50 = valueMarker34.getLabelTextAnchor();
        java.awt.Paint paint51 = valueMarker34.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType52 = valueMarker34.getLabelOffsetType();
        double double53 = valueMarker34.getValue();
        org.jfree.chart.text.TextAnchor textAnchor54 = valueMarker34.getLabelTextAnchor();
        java.awt.Paint paint55 = valueMarker34.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker57 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker57.setLabel("");
        java.awt.Paint paint60 = valueMarker57.getPaint();
        java.awt.Stroke stroke61 = valueMarker57.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker63.setLabel("");
        java.awt.Paint paint66 = valueMarker63.getOutlinePaint();
        valueMarker57.setLabelPaint(paint66);
        float float68 = valueMarker57.getAlpha();
        boolean boolean70 = valueMarker57.equals((java.lang.Object) 10.0f);
        java.awt.Stroke stroke71 = valueMarker57.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker73 = new org.jfree.chart.plot.ValueMarker(52.0d, paint20, stroke32, paint55, stroke71, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.8f + "'", float45 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(lengthAdjustmentType52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(stroke61);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 0.8f + "'", float68 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(stroke71);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint35 = valueMarker34.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker34.getLabelAnchor();
        double double37 = valueMarker34.getValue();
        java.awt.Stroke stroke38 = valueMarker34.getStroke();
        valueMarker1.setStroke(stroke38);
        java.lang.Class<?> wildcardClass40 = stroke38.getClass();
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
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(rectangleAnchor36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        java.awt.Stroke stroke30 = valueMarker1.getStroke();
        double double31 = valueMarker1.getValue();
        java.lang.String str32 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.800000011920929d + "'", double31 == 0.800000011920929d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(rectangleAnchor33);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.lang.Object obj11 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        java.awt.Paint paint14 = null;
        valueMarker1.setOutlinePaint(paint14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        double double8 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker1.notifyListeners(markerChangeEvent11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        valueMarker1.setValue((double) (-1));
        java.lang.Class<?> wildcardClass23 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        valueMarker7.setLabel("");
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
        valueMarker11.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker11.getLabelTextAnchor();
        valueMarker7.setLabelTextAnchor(textAnchor27);
        java.lang.Class<?> wildcardClass29 = textAnchor27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray30 = valueMarker1.getListeners((java.lang.Class) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.text.TextAnchor; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        java.awt.Paint paint12 = valueMarker10.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker15.removeChangeListener(markerChangeListener20);
        java.awt.Stroke stroke22 = valueMarker15.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker15.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker1.notifyListeners(markerChangeEvent21);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.lang.String str8 = valueMarker1.getLabel();
        java.lang.Class class9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray10 = valueMarker1.getListeners(class9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker4.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker4.getLabelPaint();
        valueMarker1.setPaint(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        java.lang.Class<?> wildcardClass3 = valueMarker1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        java.awt.Stroke stroke20 = valueMarker1.getStroke();
        double double21 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        java.lang.Object obj19 = valueMarker1.clone();
        float float20 = valueMarker1.getAlpha();
        java.awt.Paint paint21 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.addChangeListener(markerChangeListener22);
        java.awt.Stroke stroke24 = valueMarker1.getOutlineStroke();
        float float25 = valueMarker1.getAlpha();
        valueMarker1.setAlpha(0.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        java.awt.Paint paint18 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint19 = valueMarker1.getLabelPaint();
        java.awt.Paint paint20 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker1.notifyListeners(markerChangeEvent23);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker1.removeChangeListener(markerChangeListener27);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker1.notifyListeners(markerChangeEvent21);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        java.lang.String str13 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint16 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        double double15 = valueMarker10.getValue();
        java.awt.Paint paint16 = valueMarker10.getLabelPaint();
        java.awt.Paint paint17 = valueMarker10.getOutlinePaint();
        java.lang.String str18 = valueMarker10.getLabel();
        java.awt.Paint paint19 = valueMarker10.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker10.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor20);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getOutlinePaint();
        valueMarker17.setLabelPaint(paint24);
        java.lang.Class<?> wildcardClass26 = paint24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray27 = valueMarker1.getListeners((java.lang.Class) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        java.awt.Paint paint17 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        java.lang.Class<?> wildcardClass13 = lengthAdjustmentType12.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        float float18 = valueMarker15.getAlpha();
        java.lang.String str19 = valueMarker15.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker15.removeChangeListener(markerChangeListener20);
        valueMarker15.setAlpha((float) 1L);
        java.lang.String str24 = valueMarker15.getLabel();
        java.awt.Stroke stroke25 = valueMarker15.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint28 = valueMarker27.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        java.awt.Paint paint33 = valueMarker30.getPaint();
        java.lang.String str34 = valueMarker30.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType35 = valueMarker30.getLabelOffsetType();
        valueMarker27.setLabelOffsetType(lengthAdjustmentType35);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker38.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker38.addChangeListener(markerChangeListener41);
        double double43 = valueMarker38.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor44 = valueMarker38.getLabelAnchor();
        valueMarker38.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = valueMarker38.getLabelOffset();
        java.awt.Paint paint48 = valueMarker38.getOutlinePaint();
        valueMarker27.setOutlinePaint(paint48);
        boolean boolean50 = valueMarker15.equals((java.lang.Object) paint48);
        valueMarker1.setLabelPaint(paint48);
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker53.setLabel("");
        java.awt.Paint paint56 = valueMarker53.getPaint();
        java.lang.String str57 = valueMarker53.getLabel();
        java.awt.Paint paint58 = valueMarker53.getLabelPaint();
        java.lang.Object obj59 = valueMarker53.clone();
        java.awt.Paint paint60 = valueMarker53.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType61 = valueMarker53.getLabelOffsetType();
        java.lang.Class<?> wildcardClass62 = valueMarker53.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray63 = valueMarker1.getListeners((java.lang.Class) wildcardClass62);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType35);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor44);
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(lengthAdjustmentType61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.awt.Stroke stroke8 = valueMarker4.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets9);
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint12 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker8.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker8.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker8.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(textAnchor24);
        org.junit.Assert.assertNotNull(textAnchor25);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker10.removeChangeListener(markerChangeListener15);
        java.awt.Stroke stroke17 = valueMarker10.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker10.removeChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker10.getLabelPaint();
        valueMarker1.setOutlinePaint(paint20);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.addChangeListener(markerChangeListener22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker25.addChangeListener(markerChangeListener28);
        double double30 = valueMarker25.getValue();
        java.awt.Paint paint31 = valueMarker25.getOutlinePaint();
        java.awt.Paint paint32 = valueMarker25.getLabelPaint();
        valueMarker25.setLabel("");
        java.awt.Stroke stroke35 = valueMarker25.getOutlineStroke();
        boolean boolean36 = valueMarker1.equals((java.lang.Object) valueMarker25);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.text.TextAnchor textAnchor2 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke3 = valueMarker1.getStroke();
        java.awt.Paint paint4 = null;
        valueMarker1.setOutlinePaint(paint4);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        float float10 = valueMarker7.getAlpha();
        java.lang.String str11 = valueMarker7.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        valueMarker7.setStroke(stroke17);
        java.awt.Stroke stroke19 = valueMarker7.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker7.addChangeListener(markerChangeListener21);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker7.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker7.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker28.notifyListeners(markerChangeEvent31);
        valueMarker28.setValue((double) 0.8f);
        boolean boolean35 = valueMarker26.equals((java.lang.Object) valueMarker28);
        java.awt.Stroke stroke36 = valueMarker28.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker28.getLabelTextAnchor();
        java.awt.Paint paint38 = valueMarker28.getPaint();
        valueMarker7.setLabelPaint(paint38);
        valueMarker1.setLabelPaint(paint38);
        org.junit.Assert.assertNotNull(textAnchor2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(textAnchor37);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str26 = valueMarker25.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker25.addChangeListener(markerChangeListener27);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        float float33 = valueMarker30.getAlpha();
        java.lang.String str34 = valueMarker30.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker30.removeChangeListener(markerChangeListener35);
        valueMarker30.setAlpha((float) 1L);
        java.awt.Stroke stroke39 = valueMarker30.getStroke();
        valueMarker25.setStroke(stroke39);
        valueMarker1.setStroke(stroke39);
        valueMarker1.setLabel("hi!");
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.8f + "'", float33 == 0.8f);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(stroke39);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        float float11 = valueMarker1.getAlpha();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        java.awt.Stroke stroke19 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker1.notifyListeners(markerChangeEvent21);
        java.awt.Stroke stroke23 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType2 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue(10.0d);
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(lengthAdjustmentType2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        valueMarker1.setValue((double) 0L);
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
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        java.awt.Paint paint18 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint19 = valueMarker1.getLabelPaint();
        java.awt.Paint paint20 = valueMarker1.getPaint();
        java.awt.Paint paint21 = valueMarker1.getPaint();
        java.awt.Paint paint22 = valueMarker1.getOutlinePaint();
        java.lang.String str23 = valueMarker1.getLabel();
        java.awt.Paint paint24 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker13.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor19);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.removeChangeListener(markerChangeListener23);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font27 = valueMarker26.getLabelFont();
        java.awt.Stroke stroke28 = valueMarker26.getOutlineStroke();
        java.awt.Stroke stroke29 = valueMarker26.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj11 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        java.awt.Paint paint14 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        valueMarker1.setValue((double) 10L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.lang.String str10 = valueMarker1.getLabel();
        java.lang.String str11 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Font font9 = valueMarker1.getLabelFont();
        java.awt.Paint paint10 = null;
        valueMarker1.setOutlinePaint(paint10);
        java.lang.Object obj12 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker14.addChangeListener(markerChangeListener17);
        double double19 = valueMarker14.getValue();
        java.awt.Paint paint20 = valueMarker14.getOutlinePaint();
        java.awt.Paint paint21 = valueMarker14.getLabelPaint();
        java.awt.Paint paint22 = valueMarker14.getPaint();
        java.lang.Object obj23 = null;
        boolean boolean24 = valueMarker14.equals(obj23);
        valueMarker14.setLabel("hi!");
        double double27 = valueMarker14.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker14.removeChangeListener(markerChangeListener28);
        double double30 = valueMarker14.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker14.notifyListeners(markerChangeEvent31);
        boolean boolean33 = valueMarker1.equals((java.lang.Object) markerChangeEvent31);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        double double19 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffset(rectangleInsets20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker3.addChangeListener(markerChangeListener11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Paint paint15 = valueMarker14.getPaint();
        java.awt.Font font16 = valueMarker14.getLabelFont();
        valueMarker3.setLabelFont(font16);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        java.awt.Paint paint44 = valueMarker43.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint44);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor40);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        java.awt.Paint paint18 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint19 = valueMarker1.getLabelPaint();
        java.awt.Paint paint20 = valueMarker1.getPaint();
        java.awt.Paint paint21 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        java.lang.Object obj16 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        java.awt.Paint paint22 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        float float27 = valueMarker24.getAlpha();
        java.lang.String str28 = valueMarker24.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker24.removeChangeListener(markerChangeListener29);
        valueMarker24.setAlpha((float) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker24.getLabelOffset();
        java.awt.Paint paint34 = valueMarker24.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint34);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker1.addChangeListener(markerChangeListener36);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.lang.Object obj14 = valueMarker10.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker10.getLabelOffsetType();
        valueMarker10.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker10.addChangeListener(markerChangeListener18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker10.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets20);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        double double20 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        double double8 = valueMarker1.getValue();
        double double9 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker13.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor19);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke23 = valueMarker1.getStroke();
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker27.addChangeListener(markerChangeListener30);
        double double32 = valueMarker27.getValue();
        java.awt.Paint paint33 = valueMarker27.getOutlinePaint();
        java.awt.Paint paint34 = valueMarker27.getLabelPaint();
        valueMarker27.setLabel("");
        valueMarker27.setAlpha(0.0f);
        java.awt.Paint paint39 = valueMarker27.getLabelPaint();
        valueMarker27.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker45.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        valueMarker45.notifyListeners(markerChangeEvent48);
        valueMarker45.setValue((double) 0.8f);
        boolean boolean52 = valueMarker43.equals((java.lang.Object) valueMarker45);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType53 = valueMarker45.getLabelOffsetType();
        java.awt.Font font54 = valueMarker45.getLabelFont();
        valueMarker27.setLabelFont(font54);
        valueMarker1.setLabelFont(font54);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType53);
        org.junit.Assert.assertNotNull(font54);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        float float7 = valueMarker1.getAlpha();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        double double14 = valueMarker9.getValue();
        java.awt.Paint paint15 = valueMarker9.getOutlinePaint();
        java.awt.Paint paint16 = valueMarker9.getLabelPaint();
        java.awt.Paint paint17 = valueMarker9.getPaint();
        java.lang.Object obj18 = null;
        boolean boolean19 = valueMarker9.equals(obj18);
        valueMarker9.setLabel("hi!");
        double double22 = valueMarker9.getValue();
        java.awt.Font font23 = valueMarker9.getLabelFont();
        valueMarker1.setLabelFont(font23);
        java.awt.Stroke stroke25 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getPaint();
        java.lang.String str31 = valueMarker27.getLabel();
        double double32 = valueMarker27.getValue();
        java.awt.Stroke stroke33 = valueMarker27.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint36 = valueMarker35.getLabelPaint();
        valueMarker27.setOutlinePaint(paint36);
        java.awt.Paint paint38 = valueMarker27.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker27.addChangeListener(markerChangeListener39);
        java.awt.Font font41 = valueMarker27.getLabelFont();
        boolean boolean42 = valueMarker1.equals((java.lang.Object) font41);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(font41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = valueMarker36.getLabelOffset();
        valueMarker36.setAlpha((float) 1);
        java.awt.Stroke stroke40 = valueMarker36.getStroke();
        valueMarker1.setStroke(stroke40);
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
        org.junit.Assert.assertNotNull(textAnchor34);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(stroke40);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        double double15 = valueMarker1.getValue();
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        valueMarker1.setOutlinePaint(paint20);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
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
        valueMarker1.setOutlineStroke(stroke21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.addChangeListener(markerChangeListener24);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker1.addChangeListener(markerChangeListener26);
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(textAnchor28);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker1.getLabelOffsetType();
        java.awt.Font font9 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.awt.Stroke stroke8 = valueMarker4.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets9);
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        java.lang.Object obj12 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker10.getLabelAnchor();
        java.awt.Paint paint16 = valueMarker10.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker10.notifyListeners(markerChangeEvent17);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        java.lang.Class<?> wildcardClass14 = rectangleInsets12.getClass();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker13.notifyListeners(markerChangeEvent16);
        valueMarker13.setValue((double) 0.8f);
        boolean boolean20 = valueMarker11.equals((java.lang.Object) valueMarker13);
        java.awt.Stroke stroke21 = valueMarker13.getStroke();
        java.awt.Stroke stroke22 = valueMarker13.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke22);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getPaint();
        java.lang.String str24 = valueMarker20.getLabel();
        double double25 = valueMarker20.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker20.getLabelOffsetType();
        java.awt.Paint paint27 = valueMarker20.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker20.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets28);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        valueMarker1.notifyListeners(markerChangeEvent30);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker1.addChangeListener(markerChangeListener32);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker12.getLabelTextAnchor();
        float float16 = valueMarker12.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker12.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType17);
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        double double7 = valueMarker1.getValue();
        java.lang.Object obj8 = valueMarker1.clone();
        java.lang.String str9 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        valueMarker1.setLabelPaint(paint16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(textAnchor18);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        float float16 = valueMarker9.getAlpha();
        java.awt.Paint paint17 = valueMarker9.getOutlinePaint();
        valueMarker1.setPaint(paint17);
        java.lang.String str19 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Font font8 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        float float9 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        valueMarker1.setValue((double) (byte) 0);
        java.awt.Paint paint23 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.lang.Object obj2 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker30.addChangeListener(markerChangeListener33);
        double double35 = valueMarker30.getValue();
        java.awt.Paint paint36 = valueMarker30.getOutlinePaint();
        java.awt.Paint paint37 = valueMarker30.getLabelPaint();
        java.awt.Paint paint38 = valueMarker30.getPaint();
        java.lang.Object obj39 = null;
        boolean boolean40 = valueMarker30.equals(obj39);
        valueMarker30.setLabel("hi!");
        double double43 = valueMarker30.getValue();
        java.awt.Font font44 = valueMarker30.getLabelFont();
        java.awt.Stroke stroke45 = valueMarker30.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = valueMarker30.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets46);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(rectangleInsets46);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((-1.0d));
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
        valueMarker12.setOutlineStroke(stroke28);
        java.awt.Stroke stroke30 = valueMarker12.getStroke();
        float float31 = valueMarker12.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker12.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType32);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.8f + "'", float31 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker8.addChangeListener(markerChangeListener11);
        double double13 = valueMarker8.getValue();
        java.awt.Paint paint14 = valueMarker8.getOutlinePaint();
        java.awt.Paint paint15 = valueMarker8.getLabelPaint();
        valueMarker8.setLabel("");
        java.awt.Font font18 = valueMarker8.getLabelFont();
        valueMarker1.setLabelFont(font18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker27.addChangeListener(markerChangeListener30);
        double double32 = valueMarker27.getValue();
        java.awt.Paint paint33 = valueMarker27.getOutlinePaint();
        java.awt.Paint paint34 = valueMarker27.getLabelPaint();
        valueMarker27.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        valueMarker27.notifyListeners(markerChangeEvent37);
        java.lang.Object obj39 = valueMarker27.clone();
        java.lang.Class<?> wildcardClass40 = valueMarker27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray41 = valueMarker1.getListeners((java.lang.Class) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        java.awt.Stroke stroke11 = valueMarker3.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker3.getLabelTextAnchor();
        java.awt.Stroke stroke13 = valueMarker3.getStroke();
        float float14 = valueMarker3.getAlpha();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        java.lang.Class<?> wildcardClass5 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker1.notifyListeners(markerChangeEvent14);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        float float15 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        java.awt.Paint paint24 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint25 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke8);
        double double10 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.lang.Object obj10 = valueMarker1.clone();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(0.0d);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType2 = valueMarker1.getLabelOffsetType();
        java.awt.Font font3 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(lengthAdjustmentType2);
        org.junit.Assert.assertNotNull(font3);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        double double40 = valueMarker1.getValue();
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
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker15.setLabelPaint(paint22);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker15.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker15.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor25);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(textAnchor25);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
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
        float float37 = valueMarker8.getAlpha();
        java.awt.Paint paint38 = valueMarker8.getLabelPaint();
        valueMarker1.setLabelPaint(paint38);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker1.addChangeListener(markerChangeListener40);
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.8f + "'", float37 == 0.8f);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker17.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker17.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker17.getLabelOffset();
        java.awt.Paint paint21 = valueMarker17.getPaint();
        java.awt.Paint paint22 = valueMarker17.getOutlinePaint();
        valueMarker1.setLabelPaint(paint22);
        double double24 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke20 = null;
        valueMarker1.setOutlineStroke(stroke20);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        java.lang.String str15 = valueMarker1.getLabel();
        java.lang.Class<?> wildcardClass16 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker10.removeChangeListener(markerChangeListener15);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker8.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker8.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor12);
        java.awt.Paint paint14 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(textAnchor15);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        double double8 = valueMarker1.getValue();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        valueMarker1.setLabel("");
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(35.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.lang.String str9 = valueMarker5.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker5.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker13.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker13.notifyListeners(markerChangeEvent15);
        java.awt.Paint paint17 = valueMarker13.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker13.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor18);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        float float5 = valueMarker1.getAlpha();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        java.lang.String str9 = valueMarker1.getLabel();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        java.lang.String str11 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleAnchor4);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.addChangeListener(markerChangeListener23);
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker1.getLabelTextAnchor();
        double double26 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.lang.String str2 = valueMarker1.getLabel();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        double double15 = valueMarker1.getValue();
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        valueMarker1.setLabel("");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        float float30 = valueMarker27.getAlpha();
        java.lang.String str31 = valueMarker27.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker27.removeChangeListener(markerChangeListener32);
        valueMarker27.setAlpha((float) 1L);
        java.lang.String str36 = valueMarker27.getLabel();
        java.awt.Stroke stroke37 = valueMarker27.getStroke();
        valueMarker1.setStroke(stroke37);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker1.removeChangeListener(markerChangeListener39);
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker42.setLabel("");
        java.awt.Paint paint45 = valueMarker42.getOutlinePaint();
        java.awt.Stroke stroke46 = valueMarker42.getStroke();
        valueMarker1.setStroke(stroke46);
        valueMarker1.setValue((double) 0);
        java.awt.Paint paint50 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        java.awt.Paint paint9 = valueMarker2.getOutlinePaint();
        java.lang.String str10 = valueMarker2.getLabel();
        java.awt.Paint paint11 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint12 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint15 = valueMarker14.getLabelPaint();
        java.awt.Stroke stroke16 = valueMarker14.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker(0.0d, paint12, stroke16);
        java.awt.Stroke stroke18 = valueMarker17.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker17.setAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        java.awt.Font font15 = valueMarker1.getLabelFont();
        valueMarker1.setAlpha((float) 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        double double26 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        double double17 = valueMarker8.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        valueMarker1.setValue(0.0d);
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        valueMarker1.setValue(0.800000011920929d);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.lang.Object obj3 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        valueMarker1.setValue((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        float float20 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        double double26 = valueMarker1.getValue();
        double double27 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        java.lang.String str25 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        java.lang.Object obj23 = valueMarker19.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker19.getLabelOffsetType();
        valueMarker19.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker19.addChangeListener(markerChangeListener27);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker19.removeChangeListener(markerChangeListener29);
        double double31 = valueMarker19.getValue();
        java.lang.Class<?> wildcardClass32 = valueMarker19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray33 = valueMarker1.getListeners((java.lang.Class) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Paint paint10 = valueMarker1.getPaint();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker13.setLabelPaint(paint22);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker13.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker13.addChangeListener(markerChangeListener25);
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint28 = valueMarker13.getPaint();
        java.lang.Class<?> wildcardClass29 = valueMarker13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray30 = valueMarker1.getListeners((java.lang.Class) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(textAnchor16);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker11.notifyListeners(markerChangeEvent14);
        java.awt.Stroke stroke16 = valueMarker11.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker19.getLabelAnchor();
        valueMarker11.setLabelAnchor(rectangleAnchor21);
        valueMarker1.setLabelAnchor(rectangleAnchor21);
        float float24 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        float float16 = valueMarker9.getAlpha();
        java.awt.Paint paint17 = valueMarker9.getOutlinePaint();
        valueMarker1.setPaint(paint17);
        valueMarker1.setValue((double) '4');
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        java.lang.String str18 = valueMarker14.getLabel();
        double double19 = valueMarker14.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker14.getLabelOffsetType();
        java.awt.Paint paint21 = valueMarker14.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker14.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets22);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.removeChangeListener(markerChangeListener24);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        double double16 = valueMarker1.getValue();
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        valueMarker3.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker3.getLabelOffsetType();
        java.awt.Stroke stroke14 = valueMarker3.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint10 = valueMarker9.getLabelPaint();
        valueMarker1.setOutlinePaint(paint10);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker14.removeChangeListener(markerChangeListener18);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker14.addChangeListener(markerChangeListener20);
        java.awt.Paint paint22 = valueMarker14.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker14.removeChangeListener(markerChangeListener24);
        java.awt.Paint paint26 = valueMarker14.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke29 = valueMarker28.getStroke();
        java.awt.Paint paint30 = valueMarker28.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke33 = valueMarker32.getStroke();
        valueMarker28.setStroke(stroke33);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint26, stroke33);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker35.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        valueMarker35.notifyListeners(markerChangeEvent37);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType39 = valueMarker35.getLabelOffsetType();
        valueMarker35.setLabel("hi!");
        boolean boolean42 = valueMarker1.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(rectangleAnchor36);
        org.junit.Assert.assertNotNull(lengthAdjustmentType39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        java.awt.Paint paint34 = valueMarker1.getOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        valueMarker4.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.lang.Object obj17 = valueMarker13.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker13.getLabelOffsetType();
        valueMarker13.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker13.addChangeListener(markerChangeListener21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker13.getLabelOffset();
        valueMarker4.setLabelOffset(rectangleInsets23);
        valueMarker1.setLabelOffset(rectangleInsets23);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        valueMarker1.notifyListeners(markerChangeEvent26);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.addChangeListener(markerChangeListener20);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker3.notifyListeners(markerChangeEvent15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        double double21 = valueMarker16.getValue();
        java.awt.Paint paint22 = valueMarker16.getOutlinePaint();
        java.awt.Paint paint23 = valueMarker16.getLabelPaint();
        java.awt.Paint paint24 = valueMarker16.getPaint();
        valueMarker16.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getPaint();
        java.awt.Stroke stroke32 = valueMarker28.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        java.awt.Paint paint37 = valueMarker34.getOutlinePaint();
        valueMarker28.setLabelPaint(paint37);
        float float39 = valueMarker28.getAlpha();
        valueMarker28.setLabel("");
        valueMarker28.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor44 = valueMarker28.getLabelTextAnchor();
        java.awt.Paint paint45 = valueMarker28.getOutlinePaint();
        valueMarker16.setLabelPaint(paint45);
        java.lang.String str47 = valueMarker16.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor48 = valueMarker16.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener49 = null;
        valueMarker16.addChangeListener(markerChangeListener49);
        java.awt.Stroke stroke51 = valueMarker16.getOutlineStroke();
        valueMarker3.setOutlineStroke(stroke51);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.8f + "'", float39 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(textAnchor48);
        org.junit.Assert.assertNotNull(stroke51);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor12);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        java.awt.Paint paint16 = valueMarker1.getPaint();
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker1.notifyListeners(markerChangeEvent18);
        java.lang.Class class20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray21 = valueMarker1.getListeners(class20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker1.notifyListeners(markerChangeEvent23);
        java.awt.Paint paint25 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker1.addChangeListener(markerChangeListener26);
        java.lang.String str28 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker1.notifyListeners(markerChangeEvent23);
        java.awt.Paint paint25 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke26 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        valueMarker1.setOutlineStroke(stroke11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker17.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker17.getLabelOffsetType();
        valueMarker14.setLabelOffsetType(lengthAdjustmentType21);
        java.awt.Font font23 = valueMarker14.getLabelFont();
        valueMarker1.setLabelFont(font23);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker1.addChangeListener(markerChangeListener25);
        double double27 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        valueMarker1.setStroke(stroke7);
        java.awt.Font font9 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke10 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        java.awt.Stroke stroke35 = valueMarker1.getOutlineStroke();
        java.lang.String str36 = valueMarker1.getLabel();
        double double37 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType39 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffsetType(lengthAdjustmentType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker1.getLabelOffsetType();
        float float25 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        double double11 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker15.addChangeListener(markerChangeListener20);
        valueMarker15.setLabel("");
        valueMarker15.setLabel("");
        valueMarker15.setValue((double) 100L);
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker15.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor28);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(textAnchor28);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        java.awt.Font font26 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(font26);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        java.awt.Paint paint13 = valueMarker1.getOutlinePaint();
        java.lang.Class<?> wildcardClass14 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker18.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker18.notifyListeners(markerChangeEvent20);
        float float22 = valueMarker18.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getPaint();
        java.awt.Stroke stroke28 = valueMarker24.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        java.awt.Paint paint33 = valueMarker30.getOutlinePaint();
        valueMarker24.setLabelPaint(paint33);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor35 = valueMarker24.getLabelAnchor();
        valueMarker24.setLabel("hi!");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker24.getLabelAnchor();
        valueMarker18.setLabelAnchor(rectangleAnchor38);
        boolean boolean40 = valueMarker1.equals((java.lang.Object) valueMarker18);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(rectangleAnchor35);
        org.junit.Assert.assertNotNull(rectangleAnchor38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker2.addChangeListener(markerChangeListener3);
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
        java.awt.Paint paint21 = valueMarker6.getOutlinePaint();
        valueMarker2.setPaint(paint21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Font font27 = valueMarker24.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker24.addChangeListener(markerChangeListener28);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker24.getLabelAnchor();
        java.awt.Stroke stroke31 = valueMarker24.getStroke();
        float float32 = valueMarker24.getAlpha();
        java.awt.Stroke stroke33 = valueMarker24.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        java.awt.Paint paint38 = valueMarker35.getPaint();
        java.awt.Stroke stroke39 = valueMarker35.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getOutlinePaint();
        valueMarker35.setLabelPaint(paint44);
        float float46 = valueMarker35.getAlpha();
        java.lang.Object obj47 = valueMarker35.clone();
        java.awt.Paint paint48 = valueMarker35.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker51.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType54 = valueMarker51.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType55 = valueMarker51.getLabelOffsetType();
        double double56 = valueMarker51.getValue();
        valueMarker51.setAlpha(1.0f);
        java.awt.Paint paint59 = valueMarker51.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker61.setLabel("");
        java.awt.Paint paint64 = valueMarker61.getPaint();
        java.awt.Stroke stroke65 = valueMarker61.getOutlineStroke();
        java.awt.Font font66 = valueMarker61.getLabelFont();
        java.awt.Stroke stroke67 = valueMarker61.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker68 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint59, stroke67);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker70 = new org.jfree.chart.plot.ValueMarker((double) (-1L), paint21, stroke33, paint48, stroke67, (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.8f + "'", float46 == 0.8f);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(lengthAdjustmentType54);
        org.junit.Assert.assertNotNull(lengthAdjustmentType55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(font66);
        org.junit.Assert.assertNotNull(stroke67);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke8);
        valueMarker1.setValue((double) (-1));
        double double12 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
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
        valueMarker1.setPaint(paint29);
        java.lang.String str31 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker7.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker7.notifyListeners(markerChangeEvent9);
        java.awt.Paint paint11 = valueMarker7.getLabelPaint();
        java.awt.Paint paint12 = valueMarker7.getLabelPaint();
        valueMarker1.setOutlinePaint(paint12);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        valueMarker1.setLabel("");
        float float7 = valueMarker1.getAlpha();
        double double8 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker4.addChangeListener(markerChangeListener7);
        double double9 = valueMarker4.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker4.getLabelAnchor();
        valueMarker4.setLabel("hi!");
        java.awt.Stroke stroke13 = valueMarker4.getStroke();
        float float14 = valueMarker4.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker4.addChangeListener(markerChangeListener15);
        java.awt.Font font17 = valueMarker4.getLabelFont();
        valueMarker1.setLabelFont(font17);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker11.notifyListeners(markerChangeEvent14);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker11.notifyListeners(markerChangeEvent16);
        java.awt.Stroke stroke18 = valueMarker11.getStroke();
        java.awt.Paint paint19 = valueMarker11.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker11.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor20);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(textAnchor20);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke3 = valueMarker2.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker2.addChangeListener(markerChangeListener4);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.lang.String str11 = valueMarker7.getLabel();
        double double12 = valueMarker7.getValue();
        java.awt.Stroke stroke13 = valueMarker7.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker17.notifyListeners(markerChangeEvent20);
        valueMarker17.setValue((double) 0.8f);
        boolean boolean24 = valueMarker15.equals((java.lang.Object) valueMarker17);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker17.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker17.addChangeListener(markerChangeListener26);
        java.awt.Paint paint28 = valueMarker17.getOutlinePaint();
        valueMarker7.setLabelPaint(paint28);
        valueMarker2.setLabelPaint(paint28);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint34 = valueMarker33.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        java.awt.Paint paint39 = valueMarker36.getPaint();
        java.awt.Stroke stroke40 = valueMarker36.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint34, stroke40);
        valueMarker41.setValue((double) 10);
        java.awt.Stroke stroke44 = valueMarker41.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10L, paint28, stroke44);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(stroke44);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(textAnchor5);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(textAnchor10);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffsetType(lengthAdjustmentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        double double8 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker7.addChangeListener(markerChangeListener12);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker7.addChangeListener(markerChangeListener16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker19.addChangeListener(markerChangeListener22);
        double double24 = valueMarker19.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker19.getLabelAnchor();
        valueMarker7.setLabelAnchor(rectangleAnchor25);
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker7.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker7.getLabelTextAnchor();
        java.awt.Stroke stroke29 = valueMarker7.getStroke();
        valueMarker7.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker7.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType32);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(textAnchor28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        float float18 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getOutlinePaint();
        valueMarker10.setLabelPaint(paint19);
        float float21 = valueMarker10.getAlpha();
        valueMarker10.setValue((double) (byte) 0);
        java.lang.String str24 = valueMarker10.getLabel();
        java.lang.Class<?> wildcardClass25 = valueMarker10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray26 = valueMarker1.getListeners((java.lang.Class) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        java.lang.String str20 = valueMarker15.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker15.addChangeListener(markerChangeListener21);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker15.getLabelOffsetType();
        valueMarker3.setLabelOffsetType(lengthAdjustmentType23);
        valueMarker3.setLabel("hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str21 = valueMarker20.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker20.addChangeListener(markerChangeListener22);
        java.awt.Font font24 = valueMarker20.getLabelFont();
        java.awt.Paint paint25 = valueMarker20.getOutlinePaint();
        java.awt.Stroke stroke26 = valueMarker20.getOutlineStroke();
        double double27 = valueMarker20.getValue();
        boolean boolean28 = valueMarker1.equals((java.lang.Object) valueMarker20);
        java.awt.Paint paint29 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker1.notifyListeners(markerChangeEvent23);
        float float25 = valueMarker1.getAlpha();
        java.lang.Class class26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray27 = valueMarker1.getListeners(class26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        valueMarker1.setValue(0.0d);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        float float18 = valueMarker15.getAlpha();
        java.lang.String str19 = valueMarker15.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke22 = valueMarker21.getStroke();
        valueMarker15.setStroke(stroke22);
        valueMarker15.setValue((double) (-1));
        double double26 = valueMarker15.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker15.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker29.addChangeListener(markerChangeListener32);
        double double34 = valueMarker29.getValue();
        java.awt.Paint paint35 = valueMarker29.getOutlinePaint();
        java.awt.Paint paint36 = valueMarker29.getLabelPaint();
        valueMarker29.setLabel("");
        valueMarker29.setAlpha(0.0f);
        java.awt.Paint paint41 = valueMarker29.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType42 = valueMarker29.getLabelOffsetType();
        java.awt.Paint paint43 = valueMarker29.getOutlinePaint();
        valueMarker15.setPaint(paint43);
        valueMarker1.setOutlinePaint(paint43);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(lengthAdjustmentType42);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        java.awt.Paint paint19 = valueMarker1.getLabelPaint();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        float float11 = valueMarker3.getAlpha();
        java.awt.Paint paint12 = valueMarker3.getOutlinePaint();
        java.awt.Font font13 = valueMarker3.getLabelFont();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        java.lang.Class<?> wildcardClass15 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint12 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.removeChangeListener(markerChangeListener13);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        java.awt.Paint paint19 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.addChangeListener(markerChangeListener16);
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint24 = valueMarker23.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker23.getLabelAnchor();
        double double26 = valueMarker23.getValue();
        java.awt.Stroke stroke27 = valueMarker23.getStroke();
        valueMarker1.setStroke(stroke27);
        java.awt.Paint paint29 = valueMarker1.getOutlinePaint();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        double double20 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker23.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker23.notifyListeners(markerChangeEvent25);
        java.awt.Paint paint27 = valueMarker23.getLabelPaint();
        valueMarker1.setPaint(paint27);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker1.removeChangeListener(markerChangeListener29);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        java.awt.Paint paint19 = valueMarker13.getLabelPaint();
        java.awt.Paint paint20 = valueMarker13.getOutlinePaint();
        java.awt.Stroke stroke21 = valueMarker13.getOutlineStroke();
        float float22 = valueMarker13.getAlpha();
        java.awt.Stroke stroke23 = valueMarker13.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint11, stroke23);
        valueMarker1.setOutlinePaint(paint11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker5.notifyListeners(markerChangeEvent8);
        valueMarker5.setValue((double) 0.8f);
        boolean boolean12 = valueMarker3.equals((java.lang.Object) valueMarker5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker5.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker5.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker5.getLabelAnchor();
        java.awt.Stroke stroke16 = valueMarker5.getStroke();
        valueMarker1.setOutlineStroke(stroke16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker19.addChangeListener(markerChangeListener20);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getPaint();
        java.lang.String str27 = valueMarker23.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker23.getLabelOffsetType();
        valueMarker19.setLabelOffsetType(lengthAdjustmentType28);
        java.awt.Font font30 = valueMarker19.getLabelFont();
        java.awt.Paint paint31 = valueMarker19.getPaint();
        valueMarker1.setLabelPaint(paint31);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.awt.Paint paint3 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke6 = valueMarker5.getStroke();
        valueMarker1.setStroke(stroke6);
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker4.getLabelAnchor();
        java.lang.Object obj6 = valueMarker4.clone();
        boolean boolean7 = valueMarker1.equals((java.lang.Object) valueMarker4);
        java.lang.String str8 = valueMarker4.getLabel();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        org.jfree.chart.text.TextAnchor textAnchor30 = valueMarker26.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker26.addChangeListener(markerChangeListener31);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(textAnchor30);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint35 = null;
        valueMarker1.setOutlinePaint(paint35);
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
        org.junit.Assert.assertNotNull(textAnchor34);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.awt.Stroke stroke2 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str5 = valueMarker4.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker4.addChangeListener(markerChangeListener6);
        java.awt.Font font8 = valueMarker4.getLabelFont();
        valueMarker1.setLabelFont(font8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker11.notifyListeners(markerChangeEvent14);
        java.awt.Stroke stroke16 = valueMarker11.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        java.awt.Stroke stroke23 = valueMarker19.getOutlineStroke();
        java.awt.Stroke stroke24 = valueMarker19.getStroke();
        valueMarker11.setStroke(stroke24);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        valueMarker11.notifyListeners(markerChangeEvent26);
        valueMarker11.setValue((double) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker11.getLabelAnchor();
        java.awt.Stroke stroke31 = valueMarker11.getOutlineStroke();
        valueMarker1.setStroke(stroke31);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker1.addChangeListener(markerChangeListener33);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        valueMarker10.setValue((double) 10);
        java.awt.Paint paint13 = valueMarker10.getPaint();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
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
        java.awt.Paint paint23 = valueMarker8.getPaint();
        java.awt.Paint paint24 = valueMarker8.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint24);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        java.lang.Object obj10 = valueMarker1.clone();
        valueMarker1.setLabel("");
        java.awt.Paint paint13 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        valueMarker1.setAlpha((float) 1L);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        java.lang.Class<?> wildcardClass11 = stroke10.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        java.lang.String str15 = valueMarker1.getLabel();
        float float16 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        java.awt.Stroke stroke24 = valueMarker1.getStroke();
        float float25 = valueMarker1.getAlpha();
        java.awt.Paint paint26 = valueMarker1.getOutlinePaint();
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
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker13.getLabelAnchor();
        valueMarker3.setLabelAnchor(rectangleAnchor19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
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
        java.awt.Paint paint26 = valueMarker1.getPaint();
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
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        float float16 = valueMarker1.getAlpha();
        double double17 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke13 = valueMarker12.getStroke();
        valueMarker1.setStroke(stroke13);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker16.removeChangeListener(markerChangeListener21);
        java.awt.Stroke stroke23 = valueMarker16.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker16.removeChangeListener(markerChangeListener24);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        valueMarker16.notifyListeners(markerChangeEvent26);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker16.getLabelOffsetType();
        boolean boolean29 = valueMarker1.equals((java.lang.Object) valueMarker16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Font font9 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker11.addChangeListener(markerChangeListener14);
        double double16 = valueMarker11.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker11.notifyListeners(markerChangeEvent17);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker11.notifyListeners(markerChangeEvent19);
        java.lang.Object obj21 = null;
        boolean boolean22 = valueMarker11.equals(obj21);
        boolean boolean23 = valueMarker1.equals(obj21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.removeChangeListener(markerChangeListener24);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.lang.Object obj8 = valueMarker1.clone();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker8.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker8.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor12);
        java.awt.Paint paint14 = valueMarker1.getPaint();
        valueMarker1.setLabel("");
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        float float5 = valueMarker1.getAlpha();
        java.awt.Font font6 = valueMarker1.getLabelFont();
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
        float float37 = valueMarker8.getAlpha();
        java.awt.Paint paint38 = valueMarker8.getOutlinePaint();
        valueMarker1.setPaint(paint38);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.8f + "'", float37 == 0.8f);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker5.getLabelTextAnchor();
        float float9 = valueMarker5.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker5.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.lang.String str16 = valueMarker12.getLabel();
        double double17 = valueMarker12.getValue();
        java.awt.Stroke stroke18 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint21 = valueMarker20.getLabelPaint();
        valueMarker12.setOutlinePaint(paint21);
        java.awt.Paint paint23 = valueMarker12.getPaint();
        valueMarker5.setPaint(paint23);
        valueMarker1.setOutlinePaint(paint23);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        float float11 = valueMarker1.getAlpha();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getPaint();
        java.awt.Stroke stroke22 = valueMarker18.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getOutlinePaint();
        valueMarker18.setLabelPaint(paint27);
        float float29 = valueMarker18.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker18.addChangeListener(markerChangeListener30);
        java.awt.Stroke stroke32 = valueMarker18.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor33 = valueMarker18.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker18.removeChangeListener(markerChangeListener34);
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker18.getLabelTextAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType37 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = valueMarker18.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = valueMarker18.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets39);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.8f + "'", float29 == 0.8f);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(textAnchor33);
        org.junit.Assert.assertNotNull(textAnchor36);
        org.junit.Assert.assertNotNull(lengthAdjustmentType37);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNotNull(rectangleInsets39);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        double double9 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker9.getLabelOffsetType();
        double double14 = valueMarker9.getValue();
        valueMarker9.setAlpha(1.0f);
        java.awt.Paint paint17 = valueMarker9.getPaint();
        valueMarker1.setPaint(paint17);
        boolean boolean20 = valueMarker1.equals((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        java.awt.Font font19 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str22 = valueMarker21.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker21.addChangeListener(markerChangeListener23);
        java.awt.Font font25 = valueMarker21.getLabelFont();
        java.awt.Paint paint26 = valueMarker21.getOutlinePaint();
        java.awt.Stroke stroke27 = valueMarker21.getOutlineStroke();
        valueMarker1.setStroke(stroke27);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.awt.Stroke stroke6 = valueMarker2.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getOutlinePaint();
        valueMarker2.setLabelPaint(paint11);
        double double13 = valueMarker2.getValue();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker2.getLabelTextAnchor();
        valueMarker2.setLabel("hi!");
        java.awt.Paint paint17 = valueMarker2.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker2.addChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.lang.String str26 = valueMarker22.getLabel();
        double double27 = valueMarker22.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        java.awt.Paint paint36 = valueMarker33.getOutlinePaint();
        valueMarker29.setLabelPaint(paint36);
        java.awt.Stroke stroke38 = valueMarker29.getStroke();
        valueMarker22.setStroke(stroke38);
        java.awt.Paint paint40 = valueMarker22.getOutlinePaint();
        java.awt.Stroke stroke41 = valueMarker22.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker43.setLabel("");
        java.awt.Paint paint46 = valueMarker43.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker48.setLabel("");
        float float51 = valueMarker48.getAlpha();
        java.lang.String str52 = valueMarker48.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker54.setLabel("");
        java.awt.Paint paint57 = valueMarker54.getPaint();
        java.awt.Stroke stroke58 = valueMarker54.getOutlineStroke();
        valueMarker48.setStroke(stroke58);
        float float60 = valueMarker48.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor61 = valueMarker48.getLabelTextAnchor();
        double double62 = valueMarker48.getValue();
        org.jfree.chart.text.TextAnchor textAnchor63 = valueMarker48.getLabelTextAnchor();
        java.awt.Stroke stroke64 = valueMarker48.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker66 = new org.jfree.chart.plot.ValueMarker(35.0d, paint20, stroke41, paint46, stroke64, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.8f + "'", float51 == 0.8f);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.8f + "'", float60 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor63);
        org.junit.Assert.assertNotNull(stroke64);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        double double21 = valueMarker11.getValue();
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        double double9 = valueMarker1.getValue();
        java.awt.Paint paint10 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(textAnchor13);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
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
        valueMarker11.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker11.getLabelTextAnchor();
        java.awt.Paint paint28 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker11.getLabelOffsetType();
        double double30 = valueMarker11.getValue();
        org.jfree.chart.text.TextAnchor textAnchor31 = valueMarker11.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker33.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        valueMarker33.notifyListeners(markerChangeEvent35);
        java.awt.Paint paint37 = valueMarker33.getLabelPaint();
        valueMarker11.setPaint(paint37);
        valueMarker1.setLabelPaint(paint37);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor31);
        org.junit.Assert.assertNotNull(rectangleAnchor34);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        java.awt.Paint paint11 = valueMarker9.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        java.awt.Font font14 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((-1.0d));
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
        java.awt.Stroke stroke19 = valueMarker5.getOutlineStroke();
        valueMarker3.setOutlineStroke(stroke19);
        valueMarker1.setOutlineStroke(stroke19);
        java.awt.Paint paint22 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke23 = valueMarker1.getStroke();
        java.awt.Font font24 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(font24);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        java.awt.Stroke stroke4 = valueMarker1.getStroke();
        valueMarker1.setAlpha((float) (short) 1);
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        java.awt.Stroke stroke35 = valueMarker1.getOutlineStroke();
        java.lang.String str36 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker1.addChangeListener(markerChangeListener37);
        double double39 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType40 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType40);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        java.awt.Stroke stroke11 = valueMarker3.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker3.getLabelTextAnchor();
        float float13 = valueMarker3.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke16 = valueMarker15.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker18.addChangeListener(markerChangeListener23);
        valueMarker18.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker18.addChangeListener(markerChangeListener27);
        valueMarker18.setValue((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker32.setLabel("");
        java.awt.Paint paint35 = valueMarker32.getPaint();
        java.lang.String str36 = valueMarker32.getLabel();
        double double37 = valueMarker32.getValue();
        org.jfree.chart.text.TextAnchor textAnchor38 = valueMarker32.getLabelTextAnchor();
        valueMarker18.setLabelTextAnchor(textAnchor38);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker18.removeChangeListener(markerChangeListener40);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = valueMarker43.getLabelOffset();
        java.awt.Stroke stroke45 = valueMarker43.getOutlineStroke();
        valueMarker18.setOutlineStroke(stroke45);
        valueMarker15.setStroke(stroke45);
        valueMarker3.setStroke(stroke45);
        double double49 = valueMarker3.getValue();
        java.lang.String str50 = valueMarker3.getLabel();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor38);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.800000011920929d + "'", double49 == 0.800000011920929d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint17 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker1.notifyListeners(markerChangeEvent23);
        java.awt.Paint paint25 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint28 = valueMarker27.getOutlinePaint();
        java.awt.Font font29 = valueMarker27.getLabelFont();
        valueMarker1.setLabelFont(font29);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker1.getLabelOffset();
        java.awt.Paint paint32 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.removeChangeListener(markerChangeListener15);
        double double17 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker1.notifyListeners(markerChangeEvent18);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker21.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker21.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker21.addChangeListener(markerChangeListener26);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker21.getLabelAnchor();
        boolean boolean29 = valueMarker1.equals((java.lang.Object) valueMarker21);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.removeChangeListener(markerChangeListener13);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(textAnchor12);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Font font10 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        java.awt.Stroke stroke14 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker1.notifyListeners(markerChangeEvent21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker25.addChangeListener(markerChangeListener37);
        java.awt.Stroke stroke39 = valueMarker25.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker25.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker25.removeChangeListener(markerChangeListener41);
        org.jfree.chart.text.TextAnchor textAnchor43 = valueMarker25.getLabelTextAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType44 = valueMarker25.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = valueMarker25.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = valueMarker25.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets46);
        java.awt.Stroke stroke48 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener49 = null;
        valueMarker1.removeChangeListener(markerChangeListener49);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.8f + "'", float36 == 0.8f);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(textAnchor40);
        org.junit.Assert.assertNotNull(textAnchor43);
        org.junit.Assert.assertNotNull(lengthAdjustmentType44);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker9.notifyListeners(markerChangeEvent12);
        valueMarker9.setValue((double) 0.8f);
        boolean boolean16 = valueMarker7.equals((java.lang.Object) valueMarker9);
        valueMarker9.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker9.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.addChangeListener(markerChangeListener21);
        valueMarker1.setValue(0.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        float float10 = valueMarker1.getAlpha();
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        valueMarker1.setLabel("hi!");
        java.lang.Object obj22 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker9.addChangeListener(markerChangeListener14);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker9.addChangeListener(markerChangeListener18);
        valueMarker9.setValue((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getPaint();
        java.lang.String str27 = valueMarker23.getLabel();
        double double28 = valueMarker23.getValue();
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker23.getLabelTextAnchor();
        valueMarker9.setLabelTextAnchor(textAnchor29);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker9.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType31);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType31);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        java.awt.Paint paint12 = valueMarker10.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint12);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker5.getLabelTextAnchor();
        float float9 = valueMarker5.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker5.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.lang.String str16 = valueMarker12.getLabel();
        double double17 = valueMarker12.getValue();
        java.awt.Stroke stroke18 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint21 = valueMarker20.getLabelPaint();
        valueMarker12.setOutlinePaint(paint21);
        java.awt.Paint paint23 = valueMarker12.getPaint();
        valueMarker5.setPaint(paint23);
        valueMarker1.setOutlinePaint(paint23);
        java.awt.Paint paint26 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffset(rectangleInsets28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker24.getLabelOffsetType();
        java.lang.Class<?> wildcardClass29 = lengthAdjustmentType28.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray30 = valueMarker1.getListeners((java.lang.Class) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        java.awt.Stroke stroke11 = valueMarker3.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker3.getLabelTextAnchor();
        float float13 = valueMarker3.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker3.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor14);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.removeChangeListener(markerChangeListener2);
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        double double7 = valueMarker1.getValue();
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(textAnchor10);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font4 = valueMarker3.getLabelFont();
        java.awt.Stroke stroke5 = valueMarker3.getOutlineStroke();
        java.awt.Stroke stroke6 = valueMarker3.getOutlineStroke();
        valueMarker1.setStroke(stroke6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.awt.Stroke stroke13 = valueMarker9.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getOutlinePaint();
        valueMarker9.setLabelPaint(paint18);
        float float20 = valueMarker9.getAlpha();
        valueMarker9.setLabel("");
        java.awt.Paint paint23 = valueMarker9.getOutlinePaint();
        java.awt.Paint paint24 = valueMarker9.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker26.getLabelAnchor();
        valueMarker9.setLabelAnchor(rectangleAnchor27);
        valueMarker1.setLabelAnchor(rectangleAnchor27);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        double double11 = valueMarker1.getValue();
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(textAnchor13);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker17.notifyListeners(markerChangeEvent20);
        valueMarker17.setValue((double) 0.8f);
        boolean boolean24 = valueMarker15.equals((java.lang.Object) valueMarker17);
        java.awt.Stroke stroke25 = valueMarker17.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint13, stroke25);
        java.awt.Paint paint27 = valueMarker26.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint27);
        java.awt.Stroke stroke29 = valueMarker1.getStroke();
        double double30 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((-1.0d));
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
        java.awt.Stroke stroke24 = valueMarker10.getOutlineStroke();
        valueMarker8.setOutlineStroke(stroke24);
        valueMarker1.setStroke(stroke24);
        java.awt.Paint paint27 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke28 = valueMarker1.getStroke();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker10.notifyListeners(markerChangeEvent18);
        java.awt.Stroke stroke20 = valueMarker10.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.addChangeListener(markerChangeListener23);
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint26 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        double double3 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
}

