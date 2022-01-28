import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getOutlinePaint();
        valueMarker2.setLabelPaint(paint9);
        java.awt.Paint paint11 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((-1.0d));
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
        valueMarker13.setOutlineStroke(stroke29);
        java.awt.Paint paint31 = null;
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker33.addChangeListener(markerChangeListener36);
        double double38 = valueMarker33.getValue();
        java.awt.Paint paint39 = valueMarker33.getOutlinePaint();
        java.awt.Paint paint40 = valueMarker33.getLabelPaint();
        java.awt.Paint paint41 = valueMarker33.getPaint();
        java.lang.Object obj42 = null;
        boolean boolean43 = valueMarker33.equals(obj42);
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker45.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener48 = null;
        valueMarker45.addChangeListener(markerChangeListener48);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener50 = null;
        valueMarker45.removeChangeListener(markerChangeListener50);
        java.awt.Stroke stroke52 = valueMarker45.getOutlineStroke();
        boolean boolean54 = valueMarker45.equals((java.lang.Object) (short) -1);
        org.jfree.chart.text.TextAnchor textAnchor55 = valueMarker45.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker57 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker57.setLabel("");
        float float60 = valueMarker57.getAlpha();
        java.lang.String str61 = valueMarker57.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener62 = null;
        valueMarker57.removeChangeListener(markerChangeListener62);
        valueMarker57.setAlpha((float) 1L);
        java.lang.String str66 = valueMarker57.getLabel();
        java.awt.Stroke stroke67 = valueMarker57.getStroke();
        valueMarker45.setStroke(stroke67);
        valueMarker33.setOutlineStroke(stroke67);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker71 = new org.jfree.chart.plot.ValueMarker(10.0d, paint11, stroke29, paint31, stroke67, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(textAnchor55);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.8f + "'", float60 == 0.8f);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(stroke67);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker25.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker25.removeChangeListener(markerChangeListener28);
        java.awt.Font font30 = valueMarker25.getLabelFont();
        valueMarker1.setLabelFont(font30);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker1.addChangeListener(markerChangeListener32);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(font30);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        java.lang.Object obj6 = valueMarker1.clone();
        valueMarker1.setLabel("");
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.awt.Paint paint10 = valueMarker1.getPaint();
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
        java.awt.Paint paint43 = valueMarker12.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint43);
        java.awt.Stroke stroke45 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
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
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke45);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.awt.Stroke stroke13 = valueMarker9.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getOutlinePaint();
        valueMarker9.setLabelPaint(paint18);
        double double20 = valueMarker9.getValue();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker9.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor21);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker25.addChangeListener(markerChangeListener28);
        double double30 = valueMarker25.getValue();
        java.awt.Paint paint31 = valueMarker25.getOutlinePaint();
        java.awt.Paint paint32 = valueMarker25.getLabelPaint();
        java.awt.Paint paint33 = valueMarker25.getPaint();
        java.lang.Object obj34 = null;
        boolean boolean35 = valueMarker25.equals(obj34);
        java.awt.Paint paint36 = valueMarker25.getPaint();
        java.awt.Stroke stroke37 = valueMarker25.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker25.addChangeListener(markerChangeListener38);
        java.awt.Paint paint40 = valueMarker25.getLabelPaint();
        boolean boolean41 = valueMarker1.equals((java.lang.Object) valueMarker25);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        java.awt.Paint paint39 = valueMarker36.getPaint();
        java.lang.Object obj40 = valueMarker36.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType41 = valueMarker36.getLabelOffsetType();
        valueMarker36.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener44 = null;
        valueMarker36.addChangeListener(markerChangeListener44);
        java.lang.String str46 = valueMarker36.getLabel();
        java.awt.Stroke stroke47 = valueMarker36.getOutlineStroke();
        java.lang.Class<?> wildcardClass48 = stroke47.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray49 = valueMarker1.getListeners((java.lang.Class) wildcardClass48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.BasicStroke; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(lengthAdjustmentType41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        java.awt.Font font23 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker13.getLabelAnchor();
        valueMarker13.setValue((double) 0L);
        java.awt.Stroke stroke31 = valueMarker13.getStroke();
        valueMarker1.setOutlineStroke(stroke31);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        java.awt.Font font16 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.addChangeListener(markerChangeListener16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getOutlinePaint();
        valueMarker1.setLabelPaint(paint20);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType34 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(lengthAdjustmentType34);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        float float16 = valueMarker13.getAlpha();
        java.lang.String str17 = valueMarker13.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        java.awt.Stroke stroke23 = valueMarker19.getOutlineStroke();
        valueMarker13.setStroke(stroke23);
        java.awt.Stroke stroke25 = valueMarker13.getStroke();
        valueMarker13.setValue((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker29.getLabelAnchor();
        valueMarker13.setLabelAnchor(rectangleAnchor30);
        valueMarker1.setLabelAnchor(rectangleAnchor30);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        java.lang.Class<?> wildcardClass18 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        java.lang.Class class28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray29 = valueMarker1.getListeners(class28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.lang.Class<?> wildcardClass4 = valueMarker1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker1.getLabelOffsetType();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType31);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.lang.String str11 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.lang.String str6 = valueMarker2.getLabel();
        java.awt.Paint paint7 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker15.notifyListeners(markerChangeEvent18);
        valueMarker15.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getPaint();
        java.awt.Stroke stroke27 = valueMarker23.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setLabel("");
        java.awt.Paint paint32 = valueMarker29.getOutlinePaint();
        valueMarker23.setLabelPaint(paint32);
        float float34 = valueMarker23.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker23.addChangeListener(markerChangeListener35);
        java.awt.Stroke stroke37 = valueMarker23.getOutlineStroke();
        valueMarker15.setStroke(stroke37);
        valueMarker9.setStroke(stroke37);
        java.awt.Stroke stroke40 = valueMarker9.getOutlineStroke();
        java.awt.Paint paint41 = null;
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker43.setLabel("");
        java.awt.Paint paint46 = valueMarker43.getPaint();
        java.lang.String str47 = valueMarker43.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType48 = valueMarker43.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = valueMarker43.getLabelOffset();
        float float50 = valueMarker43.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setLabel("");
        java.awt.Paint paint55 = valueMarker52.getPaint();
        java.lang.String str56 = valueMarker52.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent57 = null;
        valueMarker52.notifyListeners(markerChangeEvent57);
        java.awt.Paint paint59 = valueMarker52.getPaint();
        valueMarker52.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker63.setLabel("");
        java.awt.Paint paint66 = valueMarker63.getPaint();
        java.awt.Stroke stroke67 = valueMarker63.getOutlineStroke();
        valueMarker52.setOutlineStroke(stroke67);
        valueMarker43.setOutlineStroke(stroke67);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker71 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint7, stroke40, paint41, stroke67, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.8f + "'", float34 == 0.8f);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType48);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.8f + "'", float50 == 0.8f);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(stroke67);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker10.removeChangeListener(markerChangeListener14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker10.addChangeListener(markerChangeListener16);
        java.awt.Paint paint18 = valueMarker10.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        boolean boolean23 = valueMarker10.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass24 = valueMarker10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray25 = valueMarker1.getListeners((java.lang.Class) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        boolean boolean10 = valueMarker1.equals((java.lang.Object) (short) -1);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font13 = valueMarker12.getLabelFont();
        java.awt.Stroke stroke14 = valueMarker12.getOutlineStroke();
        java.awt.Stroke stroke15 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getPaint();
        java.lang.Object obj21 = valueMarker17.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker17.getLabelOffsetType();
        valueMarker17.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker17.addChangeListener(markerChangeListener25);
        java.lang.String str27 = valueMarker17.getLabel();
        java.awt.Font font28 = valueMarker17.getLabelFont();
        valueMarker12.setLabelFont(font28);
        boolean boolean30 = valueMarker1.equals((java.lang.Object) valueMarker12);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        java.lang.Class<?> wildcardClass13 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType34 = valueMarker1.getLabelOffsetType();
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
        org.junit.Assert.assertNotNull(lengthAdjustmentType34);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker1.notifyListeners(markerChangeEvent22);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelAnchor(rectangleAnchor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        java.lang.Object obj21 = valueMarker1.clone();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font23 = valueMarker22.getLabelFont();
        valueMarker1.setLabelFont(font23);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker1.addChangeListener(markerChangeListener25);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        java.awt.Paint paint32 = valueMarker1.getOutlinePaint();
        java.lang.String str33 = valueMarker1.getLabel();
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
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        valueMarker1.setAlpha(0.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        valueMarker26.setValue((-1.0d));
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker1.addChangeListener(markerChangeListener19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        java.lang.Class<?> wildcardClass20 = valueMarker11.getClass();
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.lang.Object obj3 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str6 = valueMarker5.getLabel();
        java.awt.Paint paint7 = valueMarker5.getLabelPaint();
        valueMarker1.setLabelPaint(paint7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor49 = valueMarker48.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent50 = null;
        valueMarker48.notifyListeners(markerChangeEvent50);
        java.awt.Paint paint52 = valueMarker48.getPaint();
        valueMarker16.setLabelPaint(paint52);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType54 = valueMarker16.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType54);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
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
        org.junit.Assert.assertNotNull(rectangleAnchor49);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(lengthAdjustmentType54);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker1.getLabelAnchor();
        double double4 = valueMarker1.getValue();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Font font10 = valueMarker7.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker7.addChangeListener(markerChangeListener11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker7.getLabelAnchor();
        java.awt.Stroke stroke14 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke14);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        float float22 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker1.getLabelOffset();
        java.lang.String str18 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.lang.String str17 = valueMarker13.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        valueMarker13.setLabelPaint(paint22);
        valueMarker1.setPaint(paint22);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker26.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker26.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker26.addChangeListener(markerChangeListener31);
        valueMarker26.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker26.addChangeListener(markerChangeListener35);
        valueMarker26.setValue((double) (-1L));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType39 = valueMarker26.getLabelOffsetType();
        float float40 = valueMarker26.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType43 = valueMarker42.getLabelOffsetType();
        valueMarker26.setLabelOffsetType(lengthAdjustmentType43);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType43);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
        org.junit.Assert.assertNotNull(lengthAdjustmentType39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.8f + "'", float40 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType43);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = valueMarker1.getLabelOffset();
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.awt.Stroke stroke8 = valueMarker7.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker4.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor7);
        java.lang.Object obj9 = valueMarker1.clone();
        float float10 = valueMarker1.getAlpha();
        valueMarker1.setValue((double) (byte) 10);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker13.getLabelOffset();
        valueMarker13.setAlpha((float) 1);
        java.awt.Stroke stroke17 = valueMarker13.getStroke();
        valueMarker1.setOutlineStroke(stroke17);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.awt.Paint paint1 = null;
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
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setLabel("");
        java.awt.Paint paint32 = valueMarker29.getPaint();
        java.awt.Stroke stroke33 = valueMarker29.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        java.awt.Paint paint38 = valueMarker35.getOutlinePaint();
        valueMarker29.setLabelPaint(paint38);
        java.awt.Paint paint40 = valueMarker29.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker42.setLabel("");
        java.awt.Paint paint45 = valueMarker42.getPaint();
        java.lang.Object obj46 = valueMarker42.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType47 = valueMarker42.getLabelOffsetType();
        float float48 = valueMarker42.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        valueMarker42.notifyListeners(markerChangeEvent49);
        valueMarker42.setLabel("");
        java.awt.Stroke stroke53 = valueMarker42.getStroke();
        java.awt.Stroke stroke54 = valueMarker42.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) (short) 1, paint1, stroke27, paint40, stroke54, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(lengthAdjustmentType47);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.8f + "'", float48 == 0.8f);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(stroke54);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        float float8 = valueMarker5.getAlpha();
        java.lang.String str9 = valueMarker5.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker5.removeChangeListener(markerChangeListener10);
        valueMarker5.setAlpha((float) 1L);
        java.lang.String str14 = valueMarker5.getLabel();
        java.awt.Stroke stroke15 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getOutlinePaint();
        valueMarker5.setPaint(paint20);
        valueMarker1.setOutlinePaint(paint20);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.lang.String str9 = valueMarker5.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker5.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        double double11 = valueMarker1.getValue();
        java.lang.Object obj12 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getPaint();
        java.lang.String str24 = valueMarker20.getLabel();
        double double25 = valueMarker20.getValue();
        java.awt.Stroke stroke26 = valueMarker20.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint29 = valueMarker28.getLabelPaint();
        valueMarker20.setOutlinePaint(paint29);
        java.lang.String str31 = valueMarker20.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker20.getLabelOffsetType();
        java.lang.Class<?> wildcardClass33 = valueMarker20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray34 = valueMarker1.getListeners((java.lang.Class) wildcardClass33);
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
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        java.lang.String str30 = valueMarker1.getLabel();
        float float31 = valueMarker1.getAlpha();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.8f + "'", float31 == 0.8f);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.lang.String str8 = valueMarker7.getLabel();
        java.lang.Class<?> wildcardClass9 = valueMarker7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray10 = valueMarker1.getListeners((java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        float float11 = valueMarker10.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker10.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker14.addChangeListener(markerChangeListener17);
        double double19 = valueMarker14.getValue();
        java.awt.Paint paint20 = valueMarker14.getLabelPaint();
        java.awt.Paint paint21 = valueMarker14.getOutlinePaint();
        boolean boolean22 = valueMarker10.equals((java.lang.Object) valueMarker14);
        float float23 = valueMarker14.getAlpha();
        valueMarker14.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        double double14 = valueMarker9.getValue();
        java.awt.Paint paint15 = valueMarker9.getOutlinePaint();
        java.awt.Paint paint16 = valueMarker9.getLabelPaint();
        java.awt.Paint paint17 = valueMarker9.getPaint();
        valueMarker9.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.awt.Stroke stroke25 = valueMarker21.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getOutlinePaint();
        valueMarker21.setLabelPaint(paint30);
        float float32 = valueMarker21.getAlpha();
        valueMarker21.setLabel("");
        valueMarker21.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker21.getLabelTextAnchor();
        java.awt.Paint paint38 = valueMarker21.getOutlinePaint();
        valueMarker9.setLabelPaint(paint38);
        java.lang.String str40 = valueMarker9.getLabel();
        double double41 = valueMarker9.getValue();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = valueMarker9.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets42);
        java.awt.Paint paint44 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setPaint(paint44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleInsets42);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker4.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor7);
        java.lang.Object obj9 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        double double15 = valueMarker10.getValue();
        java.awt.Paint paint16 = valueMarker10.getOutlinePaint();
        java.awt.Paint paint17 = valueMarker10.getLabelPaint();
        java.awt.Paint paint18 = valueMarker10.getPaint();
        valueMarker10.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.awt.Stroke stroke26 = valueMarker22.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getOutlinePaint();
        valueMarker22.setLabelPaint(paint31);
        float float33 = valueMarker22.getAlpha();
        valueMarker22.setLabel("");
        valueMarker22.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor38 = valueMarker22.getLabelTextAnchor();
        java.awt.Paint paint39 = valueMarker22.getOutlinePaint();
        valueMarker10.setLabelPaint(paint39);
        java.awt.Paint paint41 = valueMarker10.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint41);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.8f + "'", float33 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        java.lang.String str10 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        org.jfree.chart.text.TextAnchor textAnchor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelTextAnchor(textAnchor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        java.awt.Paint paint19 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        java.awt.Paint paint17 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.awt.Paint paint19 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker19.addChangeListener(markerChangeListener22);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker19.removeChangeListener(markerChangeListener24);
        java.awt.Stroke stroke26 = valueMarker19.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker19.getLabelOffsetType();
        java.lang.Class<?> wildcardClass28 = lengthAdjustmentType27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray29 = valueMarker10.getListeners((java.lang.Class) wildcardClass28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
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
        valueMarker12.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker12.getLabelTextAnchor();
        java.awt.Paint paint29 = valueMarker12.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker12.getLabelOffsetType();
        java.awt.Paint paint31 = valueMarker12.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker12.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint21 = valueMarker20.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.addChangeListener(markerChangeListener23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        java.lang.Object obj18 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker1.notifyListeners(markerChangeEvent11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.removeChangeListener(markerChangeListener13);
        java.awt.Stroke stroke15 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setStroke(stroke15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker2.notifyListeners(markerChangeEvent4);
        float float6 = valueMarker2.getAlpha();
        java.awt.Font font7 = valueMarker2.getLabelFont();
        java.awt.Paint paint8 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        double double15 = valueMarker10.getValue();
        java.awt.Paint paint16 = valueMarker10.getOutlinePaint();
        java.awt.Paint paint17 = valueMarker10.getLabelPaint();
        java.awt.Paint paint18 = valueMarker10.getPaint();
        valueMarker10.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.awt.Stroke stroke26 = valueMarker22.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getOutlinePaint();
        valueMarker22.setLabelPaint(paint31);
        float float33 = valueMarker22.getAlpha();
        valueMarker22.setLabel("");
        valueMarker22.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor38 = valueMarker22.getLabelTextAnchor();
        java.awt.Paint paint39 = valueMarker22.getOutlinePaint();
        valueMarker10.setLabelPaint(paint39);
        java.lang.String str41 = valueMarker10.getLabel();
        java.awt.Stroke stroke42 = valueMarker10.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker45.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener48 = null;
        valueMarker45.addChangeListener(markerChangeListener48);
        double double50 = valueMarker45.getValue();
        java.awt.Paint paint51 = valueMarker45.getLabelPaint();
        java.awt.Paint paint52 = valueMarker45.getOutlinePaint();
        java.lang.String str53 = valueMarker45.getLabel();
        java.awt.Paint paint54 = valueMarker45.getOutlinePaint();
        java.awt.Paint paint55 = valueMarker45.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker57 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint58 = valueMarker57.getLabelPaint();
        java.awt.Stroke stroke59 = valueMarker57.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker(0.0d, paint55, stroke59);
        org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker62.setLabel("");
        float float65 = valueMarker62.getAlpha();
        java.lang.String str66 = valueMarker62.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker68 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke69 = valueMarker68.getStroke();
        valueMarker62.setStroke(stroke69);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker72 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f), paint8, stroke42, paint55, stroke69, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.8f + "'", float33 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 0.8f + "'", float65 == 0.8f);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(stroke69);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        double double30 = valueMarker1.getValue();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        java.awt.Paint paint38 = valueMarker35.getPaint();
        java.awt.Stroke stroke39 = valueMarker35.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getOutlinePaint();
        valueMarker35.setLabelPaint(paint44);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = valueMarker35.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener47 = null;
        valueMarker35.addChangeListener(markerChangeListener47);
        org.jfree.chart.text.TextAnchor textAnchor49 = valueMarker35.getLabelTextAnchor();
        java.lang.Class<?> wildcardClass50 = valueMarker35.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray51 = valueMarker1.getListeners((java.lang.Class) wildcardClass50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(rectangleAnchor46);
        org.junit.Assert.assertNotNull(textAnchor49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        java.awt.Font font11 = valueMarker6.getLabelFont();
        valueMarker1.setLabelFont(font11);
        java.lang.Object obj13 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Font font5 = valueMarker2.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker2.addChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        valueMarker2.setOutlinePaint(paint12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getOutlinePaint();
        java.awt.Paint paint19 = valueMarker15.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Font font24 = valueMarker21.getLabelFont();
        valueMarker15.setLabelFont(font24);
        java.awt.Stroke stroke26 = valueMarker15.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker28.addChangeListener(markerChangeListener31);
        double double33 = valueMarker28.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker28.getLabelAnchor();
        valueMarker28.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = valueMarker28.getLabelOffset();
        java.awt.Paint paint38 = valueMarker28.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((-1.0d));
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
        java.awt.Stroke stroke58 = valueMarker44.getOutlineStroke();
        valueMarker42.setOutlineStroke(stroke58);
        valueMarker40.setOutlineStroke(stroke58);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((double) 10, paint12, stroke26, paint38, stroke58, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor34);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.8f + "'", float55 == 0.8f);
        org.junit.Assert.assertNotNull(stroke58);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.lang.Object obj26 = valueMarker22.clone();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray28 = valueMarker1.getListeners((java.lang.Class) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        double double22 = valueMarker1.getValue();
        valueMarker1.setAlpha((float) (byte) 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        double double16 = valueMarker10.getValue();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.addChangeListener(markerChangeListener16);
        float float18 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 100);
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
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        java.awt.Font font3 = valueMarker1.getLabelFont();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(font3);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        java.lang.Object obj13 = valueMarker1.clone();
        java.lang.Object obj14 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker1.addChangeListener(markerChangeListener27);
        java.lang.Object obj29 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        java.awt.Paint paint24 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.awt.Paint paint3 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke6 = valueMarker5.getStroke();
        valueMarker1.setStroke(stroke6);
        float float8 = valueMarker1.getAlpha();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        java.awt.Paint paint17 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.removeChangeListener(markerChangeListener18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        java.awt.Paint paint17 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker1.notifyListeners(markerChangeEvent31);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(rectangleAnchor33);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        valueMarker1.setValue((double) (short) 1);
        float float18 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        float float11 = valueMarker8.getAlpha();
        java.lang.String str12 = valueMarker8.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker8.removeChangeListener(markerChangeListener13);
        valueMarker8.setAlpha((float) 1L);
        java.lang.String str17 = valueMarker8.getLabel();
        java.awt.Stroke stroke18 = valueMarker8.getStroke();
        valueMarker1.setStroke(stroke18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0.0f);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        valueMarker1.setValue((double) 100);
        java.awt.Paint paint27 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font39 = valueMarker38.getLabelFont();
        java.awt.Stroke stroke40 = valueMarker38.getOutlineStroke();
        java.awt.Stroke stroke41 = valueMarker38.getOutlineStroke();
        valueMarker1.setStroke(stroke41);
        java.awt.Stroke stroke43 = valueMarker1.getStroke();
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
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        double double11 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker13.getLabelAnchor();
        valueMarker13.setLabel("hi!");
        java.lang.Object obj20 = valueMarker13.clone();
        valueMarker13.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker13.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(textAnchor23);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setAlpha((float) 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor12);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        java.awt.Stroke stroke11 = valueMarker3.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker3.getLabelTextAnchor();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker3.setAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor12);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        java.awt.Paint paint19 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        java.lang.Object obj7 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint10 = valueMarker9.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker12.getLabelTextAnchor();
        valueMarker9.setLabelTextAnchor(textAnchor15);
        java.lang.Object obj17 = valueMarker9.clone();
        java.lang.Class<?> wildcardClass18 = valueMarker9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray19 = valueMarker1.getListeners((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getOutlinePaint();
        valueMarker9.setLabelPaint(paint16);
        boolean boolean18 = valueMarker1.equals((java.lang.Object) paint16);
        double double19 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        java.awt.Font font32 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        valueMarker10.setValue((double) 10);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        float float17 = valueMarker14.getAlpha();
        java.lang.String str18 = valueMarker14.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker14.removeChangeListener(markerChangeListener19);
        valueMarker14.setAlpha((float) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker14.getLabelOffset();
        valueMarker10.setLabelOffset(rectangleInsets23);
        java.lang.String str25 = valueMarker10.getLabel();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        float float18 = valueMarker15.getAlpha();
        java.lang.String str19 = valueMarker15.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.awt.Stroke stroke25 = valueMarker21.getOutlineStroke();
        valueMarker15.setStroke(stroke25);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker15.removeChangeListener(markerChangeListener27);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker15.addChangeListener(markerChangeListener29);
        valueMarker15.setValue((double) '#');
        boolean boolean34 = valueMarker15.equals((java.lang.Object) ' ');
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor37 = valueMarker36.getLabelAnchor();
        java.awt.Paint paint38 = valueMarker36.getLabelPaint();
        valueMarker15.setOutlinePaint(paint38);
        boolean boolean40 = valueMarker1.equals((java.lang.Object) paint38);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.lang.String str19 = valueMarker15.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker15.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker15.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor22);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(textAnchor22);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelAnchor(rectangleAnchor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        double double16 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        double double18 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
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
        java.awt.Paint paint26 = valueMarker12.getOutlinePaint();
        java.awt.Paint paint27 = valueMarker12.getOutlinePaint();
        valueMarker1.setLabelPaint(paint27);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        double double19 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.lang.Object obj3 = valueMarker1.clone();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setAlpha((float) (byte) 0);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        float float2 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.8f + "'", float2 == 0.8f);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.awt.Stroke stroke10 = valueMarker9.getOutlineStroke();
        valueMarker1.setStroke(stroke10);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        float float13 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        java.lang.String str18 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.String str7 = valueMarker1.getLabel();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getPaint();
        java.lang.String str15 = valueMarker11.getLabel();
        java.awt.Paint paint16 = valueMarker11.getLabelPaint();
        java.awt.Paint paint17 = valueMarker11.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker19.addChangeListener(markerChangeListener22);
        double double24 = valueMarker19.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker19.getLabelAnchor();
        valueMarker19.setLabel("hi!");
        java.awt.Stroke stroke28 = valueMarker19.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (short) 0, paint17, stroke28);
        valueMarker1.setPaint(paint17);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        java.lang.String str24 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        valueMarker1.setAlpha(0.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        float float2 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.8f + "'", float2 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        java.awt.Font font11 = valueMarker1.getLabelFont();
        valueMarker1.setLabel("");
        java.awt.Paint paint14 = valueMarker1.getPaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        double double12 = valueMarker1.getValue();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.awt.Paint paint26 = valueMarker23.getPaint();
        java.lang.String str27 = valueMarker23.getLabel();
        double double28 = valueMarker23.getValue();
        java.awt.Stroke stroke29 = valueMarker23.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint32 = valueMarker31.getLabelPaint();
        valueMarker23.setOutlinePaint(paint32);
        java.awt.Paint paint34 = valueMarker23.getPaint();
        valueMarker1.setOutlinePaint(paint34);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker1.removeChangeListener(markerChangeListener36);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        valueMarker2.setLabel("");
        valueMarker2.setAlpha(0.0f);
        valueMarker2.setLabel("");
        java.awt.Paint paint16 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Font font21 = valueMarker18.getLabelFont();
        java.awt.Stroke stroke22 = valueMarker18.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getPaint();
        java.lang.String str28 = valueMarker24.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker24.notifyListeners(markerChangeEvent29);
        java.awt.Paint paint31 = valueMarker24.getPaint();
        valueMarker24.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker24.addChangeListener(markerChangeListener34);
        java.awt.Paint paint36 = valueMarker24.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent43 = null;
        valueMarker40.notifyListeners(markerChangeEvent43);
        valueMarker40.setValue((double) 0.8f);
        boolean boolean47 = valueMarker38.equals((java.lang.Object) valueMarker40);
        java.awt.Stroke stroke48 = valueMarker40.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) (-1L), paint16, stroke22, paint36, stroke48, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker9.removeChangeListener(markerChangeListener13);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker9.addChangeListener(markerChangeListener15);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker26.notifyListeners(markerChangeEvent29);
        valueMarker26.setValue((double) 0.8f);
        boolean boolean33 = valueMarker24.equals((java.lang.Object) valueMarker26);
        java.awt.Stroke stroke34 = valueMarker26.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint22, stroke34);
        valueMarker9.setOutlinePaint(paint22);
        boolean boolean37 = valueMarker1.equals((java.lang.Object) valueMarker9);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        double double15 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Font font20 = valueMarker17.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker17.addChangeListener(markerChangeListener21);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke24 = valueMarker17.getStroke();
        java.lang.Class<?> wildcardClass25 = valueMarker17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray26 = valueMarker1.getListeners((java.lang.Class) wildcardClass25);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        java.awt.Font font16 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(textAnchor24);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker13.removeChangeListener(markerChangeListener18);
        java.awt.Stroke stroke20 = valueMarker13.getOutlineStroke();
        boolean boolean22 = valueMarker13.equals((java.lang.Object) (short) -1);
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker13.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        float float28 = valueMarker25.getAlpha();
        java.lang.String str29 = valueMarker25.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker25.removeChangeListener(markerChangeListener30);
        valueMarker25.setAlpha((float) 1L);
        java.lang.String str34 = valueMarker25.getLabel();
        java.awt.Stroke stroke35 = valueMarker25.getStroke();
        valueMarker13.setStroke(stroke35);
        valueMarker1.setOutlineStroke(stroke35);
        java.awt.Font font38 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.8f + "'", float28 == 0.8f);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(font38);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        java.awt.Paint paint10 = valueMarker1.getPaint();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        java.awt.Paint paint19 = valueMarker13.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker13.getLabelPaint();
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker13.notifyListeners(markerChangeEvent23);
        java.lang.Object obj25 = valueMarker13.clone();
        java.lang.Class<?> wildcardClass26 = valueMarker13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray27 = valueMarker1.getListeners((java.lang.Class) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.lang.String str8 = valueMarker1.getLabel();
        java.lang.String str9 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker11.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke16 = valueMarker15.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint19 = valueMarker18.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.lang.String str25 = valueMarker21.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker21.getLabelOffsetType();
        valueMarker18.setLabelOffsetType(lengthAdjustmentType26);
        valueMarker15.setLabelOffsetType(lengthAdjustmentType26);
        valueMarker11.setLabelOffsetType(lengthAdjustmentType26);
        valueMarker11.setAlpha((float) 1L);
        java.awt.Font font32 = valueMarker11.getLabelFont();
        valueMarker1.setLabelFont(font32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.lang.String str12 = valueMarker8.getLabel();
        double double13 = valueMarker8.getValue();
        java.awt.Stroke stroke14 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint17 = valueMarker16.getLabelPaint();
        valueMarker8.setOutlinePaint(paint17);
        java.awt.Paint paint19 = valueMarker8.getPaint();
        valueMarker1.setPaint(paint19);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker1.notifyListeners(markerChangeEvent21);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke3 = valueMarker2.getStroke();
        java.awt.Paint paint4 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        float float9 = valueMarker6.getAlpha();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint4, stroke10);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker11.notifyListeners(markerChangeEvent13);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        valueMarker1.setValue(1.0d);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        java.awt.Stroke stroke13 = valueMarker12.getStroke();
        valueMarker1.setOutlineStroke(stroke13);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        valueMarker1.setLabel("");
        java.awt.Paint paint12 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.removeChangeListener(markerChangeListener13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        java.lang.String str14 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        java.awt.Font font30 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(font30);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        java.lang.Object obj14 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        java.awt.Paint paint23 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setPaint(paint35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(textAnchor34);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        java.lang.Class class2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray3 = valueMarker1.getListeners(class2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        double double9 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType2 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker4.addChangeListener(markerChangeListener7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker4.removeChangeListener(markerChangeListener9);
        java.awt.Stroke stroke11 = valueMarker4.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType2);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        valueMarker1.setLabel("");
        float float16 = valueMarker1.getAlpha();
        float float17 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setValue((double) (byte) 0);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font8 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker11.addChangeListener(markerChangeListener14);
        double double16 = valueMarker11.getValue();
        java.awt.Paint paint17 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint18 = valueMarker11.getLabelPaint();
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker11.notifyListeners(markerChangeEvent21);
        float float23 = valueMarker11.getAlpha();
        java.awt.Stroke stroke24 = valueMarker11.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke24);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker27.getLabelAnchor();
        java.lang.Class<?> wildcardClass31 = rectangleAnchor30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray32 = valueMarker1.getListeners((java.lang.Class) wildcardClass31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.RectangleAnchor; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        java.awt.Paint paint12 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        valueMarker1.setLabel("");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        java.awt.Paint paint10 = valueMarker2.getPaint();
        valueMarker2.setLabel("hi!");
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
        valueMarker2.setLabelPaint(paint31);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker2.removeChangeListener(markerChangeListener33);
        java.awt.Stroke stroke35 = valueMarker2.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker2.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        valueMarker2.notifyListeners(markerChangeEvent37);
        java.awt.Paint paint39 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getPaint();
        java.lang.String str45 = valueMarker41.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType46 = valueMarker41.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = valueMarker41.getLabelOffset();
        float float48 = valueMarker41.getAlpha();
        java.awt.Stroke stroke49 = valueMarker41.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10);
        java.awt.Paint paint52 = valueMarker51.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker54.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener57 = null;
        valueMarker54.addChangeListener(markerChangeListener57);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener59 = null;
        valueMarker54.removeChangeListener(markerChangeListener59);
        java.awt.Stroke stroke61 = valueMarker54.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10, paint39, stroke49, paint52, stroke61, (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(textAnchor36);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType46);
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.8f + "'", float48 == 0.8f);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(stroke61);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getOutlinePaint();
        valueMarker9.setLabelPaint(paint16);
        java.lang.Class<?> wildcardClass18 = paint16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray19 = valueMarker1.getListeners((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.lang.String str2 = valueMarker1.getLabel();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        java.lang.Object obj22 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.lang.String str10 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.awt.Stroke stroke16 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getOutlinePaint();
        valueMarker12.setLabelPaint(paint21);
        double double23 = valueMarker12.getValue();
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker12.getLabelTextAnchor();
        valueMarker12.setLabel("hi!");
        java.awt.Paint paint27 = valueMarker12.getLabelPaint();
        double double28 = valueMarker12.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker12.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType29);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke21 = valueMarker1.getOutlineStroke();
        valueMarker1.setAlpha((float) 1L);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker1.removeChangeListener(markerChangeListener29);
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
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        boolean boolean10 = valueMarker1.equals((java.lang.Object) (short) -1);
        boolean boolean12 = valueMarker1.equals((java.lang.Object) 10);
        java.awt.Font font13 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke16 = valueMarker15.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        float float21 = valueMarker18.getAlpha();
        java.lang.String str22 = valueMarker18.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker18.removeChangeListener(markerChangeListener23);
        valueMarker18.setAlpha((float) 1L);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker28.notifyListeners(markerChangeEvent31);
        java.awt.Stroke stroke33 = valueMarker28.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType34 = valueMarker28.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint37 = valueMarker36.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker36.getLabelAnchor();
        valueMarker28.setLabelAnchor(rectangleAnchor38);
        valueMarker18.setLabelAnchor(rectangleAnchor38);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = valueMarker18.getLabelOffset();
        valueMarker15.setLabelOffset(rectangleInsets41);
        valueMarker1.setLabelOffset(rectangleInsets41);
        java.awt.Font font44 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelFont(font44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(lengthAdjustmentType34);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(rectangleAnchor38);
        org.junit.Assert.assertNotNull(rectangleInsets41);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.awt.Stroke stroke19 = valueMarker15.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getOutlinePaint();
        valueMarker15.setLabelPaint(paint24);
        float float26 = valueMarker15.getAlpha();
        valueMarker15.setLabel("");
        valueMarker15.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor31 = valueMarker15.getLabelTextAnchor();
        java.awt.Paint paint32 = valueMarker15.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType33 = valueMarker15.getLabelOffsetType();
        java.awt.Paint paint34 = valueMarker15.getOutlinePaint();
        java.lang.Class<?> wildcardClass35 = valueMarker15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray36 = valueMarker1.getListeners((java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(lengthAdjustmentType33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("");
        valueMarker1.setValue((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        float float11 = valueMarker8.getAlpha();
        java.lang.String str12 = valueMarker8.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker8.removeChangeListener(markerChangeListener13);
        valueMarker8.setAlpha((float) 1L);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker18.notifyListeners(markerChangeEvent21);
        java.awt.Stroke stroke23 = valueMarker18.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint27 = valueMarker26.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker26.getLabelAnchor();
        valueMarker18.setLabelAnchor(rectangleAnchor28);
        valueMarker8.setLabelAnchor(rectangleAnchor28);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker8.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets31);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertNotNull(rectangleInsets31);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        double double4 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        valueMarker1.setAlpha((float) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        java.awt.Stroke stroke13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint12, stroke13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker3.addChangeListener(markerChangeListener6);
        double double8 = valueMarker3.getValue();
        java.awt.Paint paint9 = valueMarker3.getOutlinePaint();
        java.awt.Paint paint10 = valueMarker3.getLabelPaint();
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker3.notifyListeners(markerChangeEvent13);
        float float15 = valueMarker3.getAlpha();
        java.awt.Stroke stroke16 = valueMarker3.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint1, stroke16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        java.awt.Paint paint21 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker1.getLabelAnchor();
        java.lang.Object obj21 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getOutlinePaint();
        java.lang.Class<?> wildcardClass27 = valueMarker23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray28 = valueMarker1.getListeners((java.lang.Class) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        valueMarker1.setValue((double) (short) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        double double17 = valueMarker12.getValue();
        java.awt.Paint paint18 = valueMarker12.getLabelPaint();
        java.awt.Paint paint19 = valueMarker12.getOutlinePaint();
        java.awt.Stroke stroke20 = valueMarker12.getOutlineStroke();
        float float21 = valueMarker12.getAlpha();
        boolean boolean22 = valueMarker1.equals((java.lang.Object) valueMarker12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker1.notifyListeners(markerChangeEvent23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        java.lang.String str20 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Font font8 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        float float14 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        valueMarker27.notifyListeners(markerChangeEvent30);
        valueMarker27.setValue((double) 0.8f);
        boolean boolean34 = valueMarker25.equals((java.lang.Object) valueMarker27);
        valueMarker27.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType37 = valueMarker27.getLabelOffsetType();
        java.lang.Class<?> wildcardClass38 = lengthAdjustmentType37.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray39 = valueMarker1.getListeners((java.lang.Class) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        java.awt.Paint paint33 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        float float7 = valueMarker1.getAlpha();
        valueMarker1.setValue((double) '4');
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getPaint();
        java.awt.Stroke stroke15 = valueMarker11.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getOutlinePaint();
        valueMarker11.setLabelPaint(paint20);
        float float22 = valueMarker11.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker11.addChangeListener(markerChangeListener23);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker11.getLabelOffsetType();
        java.lang.Class<?> wildcardClass26 = lengthAdjustmentType25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray27 = valueMarker1.getListeners((java.lang.Class) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.awt.Paint paint33 = valueMarker1.getLabelPaint();
        java.lang.String str34 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        valueMarker1.setAlpha(0.0f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        java.awt.Font font21 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker11.setLabelFont(font21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker1.getLabelAnchor();
        double double37 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(rectangleAnchor36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        java.awt.Stroke stroke21 = valueMarker1.getStroke();
        java.awt.Font font22 = valueMarker1.getLabelFont();
        java.awt.Paint paint23 = valueMarker1.getPaint();
        java.lang.String str24 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker2.addChangeListener(markerChangeListener7);
        valueMarker2.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker2.getLabelTextAnchor();
        java.lang.String str12 = valueMarker2.getLabel();
        java.awt.Paint paint13 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.awt.Paint paint19 = valueMarker15.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str22 = valueMarker21.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker21.addChangeListener(markerChangeListener23);
        java.awt.Font font25 = valueMarker21.getLabelFont();
        valueMarker15.setLabelFont(font25);
        java.awt.Stroke stroke27 = valueMarker15.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker29.addChangeListener(markerChangeListener32);
        double double34 = valueMarker29.getValue();
        java.awt.Paint paint35 = valueMarker29.getOutlinePaint();
        java.awt.Paint paint36 = valueMarker29.getLabelPaint();
        java.awt.Paint paint37 = valueMarker29.getPaint();
        valueMarker29.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getPaint();
        java.awt.Stroke stroke45 = valueMarker41.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker47.setLabel("");
        java.awt.Paint paint50 = valueMarker47.getOutlinePaint();
        valueMarker41.setLabelPaint(paint50);
        float float52 = valueMarker41.getAlpha();
        valueMarker41.setLabel("");
        valueMarker41.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor57 = valueMarker41.getLabelTextAnchor();
        java.awt.Paint paint58 = valueMarker41.getOutlinePaint();
        valueMarker29.setLabelPaint(paint58);
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor62 = valueMarker61.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent63 = null;
        valueMarker61.notifyListeners(markerChangeEvent63);
        java.awt.Paint paint65 = valueMarker61.getPaint();
        valueMarker29.setLabelPaint(paint65);
        org.jfree.chart.plot.ValueMarker valueMarker68 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str69 = valueMarker68.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener70 = null;
        valueMarker68.addChangeListener(markerChangeListener70);
        java.awt.Font font72 = valueMarker68.getLabelFont();
        java.awt.Paint paint73 = valueMarker68.getOutlinePaint();
        java.awt.Stroke stroke74 = valueMarker68.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker76 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint13, stroke27, paint65, stroke74, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.8f + "'", float52 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor57);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(rectangleAnchor62);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(font72);
        org.junit.Assert.assertNotNull(paint73);
        org.junit.Assert.assertNotNull(stroke74);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        java.awt.Stroke stroke23 = valueMarker1.getStroke();
        double double24 = valueMarker1.getValue();
        valueMarker1.setValue((double) '4');
        double double27 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint4 = valueMarker3.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint4, stroke10);
        float float12 = valueMarker11.getAlpha();
        java.awt.Paint paint13 = valueMarker11.getOutlinePaint();
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
        java.lang.Object obj29 = valueMarker15.clone();
        java.awt.Stroke stroke30 = valueMarker15.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker15.removeChangeListener(markerChangeListener31);
        java.awt.Paint paint33 = valueMarker15.getPaint();
        float float34 = valueMarker15.getAlpha();
        java.awt.Stroke stroke35 = valueMarker15.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint38 = valueMarker37.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor39 = valueMarker37.getLabelAnchor();
        double double40 = valueMarker37.getValue();
        java.awt.Stroke stroke41 = valueMarker37.getStroke();
        valueMarker15.setStroke(stroke41);
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker45.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener48 = null;
        valueMarker45.addChangeListener(markerChangeListener48);
        double double50 = valueMarker45.getValue();
        java.awt.Paint paint51 = valueMarker45.getLabelPaint();
        java.awt.Paint paint52 = valueMarker45.getOutlinePaint();
        java.lang.String str53 = valueMarker45.getLabel();
        java.awt.Paint paint54 = valueMarker45.getOutlinePaint();
        java.awt.Paint paint55 = valueMarker45.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker57 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint58 = valueMarker57.getLabelPaint();
        java.awt.Stroke stroke59 = valueMarker57.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker(0.0d, paint55, stroke59);
        org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker62.setLabel("");
        java.awt.Paint paint65 = valueMarker62.getPaint();
        java.lang.String str66 = valueMarker62.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent67 = null;
        valueMarker62.notifyListeners(markerChangeEvent67);
        org.jfree.chart.plot.ValueMarker valueMarker70 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = valueMarker70.getLabelOffset();
        valueMarker62.setLabelOffset(rectangleInsets71);
        java.awt.Stroke stroke73 = valueMarker62.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker75 = new org.jfree.chart.plot.ValueMarker((double) ' ', paint13, stroke41, paint55, stroke73, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.8f + "'", float34 == 0.8f);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(rectangleAnchor39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(rectangleInsets71);
        org.junit.Assert.assertNotNull(stroke73);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Stroke stroke2 = valueMarker1.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        double double26 = valueMarker1.getValue();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        float float6 = valueMarker3.getAlpha();
        java.lang.String str7 = valueMarker3.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker3.removeChangeListener(markerChangeListener8);
        valueMarker3.setAlpha((float) 1L);
        java.lang.String str12 = valueMarker3.getLabel();
        java.awt.Stroke stroke13 = valueMarker3.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker15.notifyListeners(markerChangeEvent18);
        java.awt.Stroke stroke20 = valueMarker15.getOutlineStroke();
        valueMarker3.setStroke(stroke20);
        valueMarker1.setStroke(stroke20);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font25 = valueMarker24.getLabelFont();
        java.awt.Stroke stroke26 = valueMarker24.getOutlineStroke();
        java.awt.Paint paint27 = valueMarker24.getOutlinePaint();
        java.awt.Stroke stroke28 = valueMarker24.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint31 = valueMarker30.getPaint();
        valueMarker24.setPaint(paint31);
        java.awt.Paint paint33 = valueMarker24.getOutlinePaint();
        valueMarker1.setLabelPaint(paint33);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        java.lang.Object obj17 = valueMarker8.clone();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker19.addChangeListener(markerChangeListener22);
        double double24 = valueMarker19.getValue();
        java.awt.Paint paint25 = valueMarker19.getOutlinePaint();
        java.awt.Paint paint26 = valueMarker19.getLabelPaint();
        valueMarker19.setLabel("");
        valueMarker19.setAlpha(0.0f);
        java.awt.Paint paint31 = valueMarker19.getLabelPaint();
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        valueMarker19.notifyListeners(markerChangeEvent34);
        java.lang.Class<?> wildcardClass36 = valueMarker19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray37 = valueMarker8.getListeners((java.lang.Class) wildcardClass36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        java.lang.Object obj21 = valueMarker1.clone();
        java.lang.Object obj22 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        valueMarker1.setLabel("");
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
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.removeChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker8.addChangeListener(markerChangeListener11);
        double double13 = valueMarker8.getValue();
        java.awt.Paint paint14 = valueMarker8.getLabelPaint();
        java.awt.Paint paint15 = valueMarker8.getPaint();
        java.awt.Stroke stroke16 = valueMarker8.getOutlineStroke();
        java.awt.Paint paint17 = valueMarker8.getLabelPaint();
        valueMarker2.setPaint(paint17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker22.notifyListeners(markerChangeEvent25);
        valueMarker22.setValue((double) 0.8f);
        boolean boolean29 = valueMarker20.equals((java.lang.Object) valueMarker22);
        java.awt.Stroke stroke30 = valueMarker22.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (short) 0, paint17, stroke30);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        java.lang.Object obj16 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        float float15 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker1.removeChangeListener(markerChangeListener38);
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        valueMarker1.setValue((double) ' ');
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.removeChangeListener(markerChangeListener15);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint21 = valueMarker20.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor26 = valueMarker23.getLabelTextAnchor();
        valueMarker20.setLabelTextAnchor(textAnchor26);
        java.lang.Object obj28 = valueMarker20.clone();
        java.lang.Class<?> wildcardClass29 = valueMarker20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray30 = valueMarker1.getListeners((java.lang.Class) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(textAnchor26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        java.awt.Paint paint3 = valueMarker2.getPaint();
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
        java.awt.Stroke stroke19 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker21.addChangeListener(markerChangeListener24);
        double double26 = valueMarker21.getValue();
        java.awt.Paint paint27 = valueMarker21.getOutlinePaint();
        java.awt.Paint paint28 = valueMarker21.getLabelPaint();
        java.awt.Paint paint29 = valueMarker21.getPaint();
        valueMarker21.setLabel("hi!");
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
        valueMarker33.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor49 = valueMarker33.getLabelTextAnchor();
        java.awt.Paint paint50 = valueMarker33.getOutlinePaint();
        valueMarker21.setLabelPaint(paint50);
        java.awt.Stroke stroke52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) (-1L), paint3, stroke19, paint50, stroke52, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.8f + "'", float44 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor49);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        double double8 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffsetType(lengthAdjustmentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        java.awt.Paint paint19 = valueMarker13.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker13.getLabelPaint();
        valueMarker13.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint26 = valueMarker25.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getPaint();
        java.awt.Stroke stroke32 = valueMarker28.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint26, stroke32);
        valueMarker13.setOutlinePaint(paint26);
        java.lang.Class<?> wildcardClass35 = valueMarker13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray36 = valueMarker1.getListeners((java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        java.lang.String str10 = valueMarker1.getLabel();
        java.lang.Object obj11 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        valueMarker1.setValue((double) 10L);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker15.addChangeListener(markerChangeListener20);
        float float22 = valueMarker15.getAlpha();
        java.awt.Paint paint23 = valueMarker15.getPaint();
        valueMarker1.setLabelPaint(paint23);
        double double25 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0L);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.removeChangeListener(markerChangeListener20);
        valueMarker1.setAlpha((float) (byte) 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        java.awt.Paint paint10 = valueMarker2.getPaint();
        valueMarker2.setLabel("hi!");
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
        valueMarker2.setLabelPaint(paint31);
        java.awt.Paint paint33 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        java.awt.Paint paint38 = valueMarker35.getPaint();
        java.awt.Stroke stroke39 = valueMarker35.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getOutlinePaint();
        valueMarker35.setLabelPaint(paint44);
        float float46 = valueMarker35.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener47 = null;
        valueMarker35.addChangeListener(markerChangeListener47);
        java.awt.Stroke stroke49 = valueMarker35.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor50 = valueMarker35.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor51 = valueMarker35.getLabelTextAnchor();
        java.awt.Stroke stroke52 = valueMarker35.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker54 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker54.setLabel("");
        java.awt.Paint paint57 = valueMarker54.getPaint();
        java.lang.String str58 = valueMarker54.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType59 = valueMarker54.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets60 = valueMarker54.getLabelOffset();
        float float61 = valueMarker54.getAlpha();
        java.awt.Paint paint62 = valueMarker54.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker64.setLabel("");
        java.awt.Paint paint67 = valueMarker64.getPaint();
        java.awt.Stroke stroke68 = valueMarker64.getOutlineStroke();
        java.awt.Stroke stroke69 = valueMarker64.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker71 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint33, stroke52, paint62, stroke69, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.8f + "'", float46 == 0.8f);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(textAnchor50);
        org.junit.Assert.assertNotNull(textAnchor51);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType59);
        org.junit.Assert.assertNotNull(rectangleInsets60);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 0.8f + "'", float61 == 0.8f);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertNotNull(stroke69);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        float float6 = valueMarker3.getAlpha();
        java.lang.String str7 = valueMarker3.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker3.removeChangeListener(markerChangeListener8);
        valueMarker3.setAlpha((float) 1L);
        java.lang.String str12 = valueMarker3.getLabel();
        java.awt.Stroke stroke13 = valueMarker3.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker15.notifyListeners(markerChangeEvent18);
        java.awt.Stroke stroke20 = valueMarker15.getOutlineStroke();
        valueMarker3.setStroke(stroke20);
        valueMarker1.setStroke(stroke20);
        java.lang.Object obj23 = valueMarker1.clone();
        java.lang.Object obj24 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        java.awt.Paint paint12 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Font font8 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint8 = valueMarker7.getPaint();
        valueMarker1.setPaint(paint8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker11.addChangeListener(markerChangeListener14);
        double double16 = valueMarker11.getValue();
        java.awt.Paint paint17 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint18 = valueMarker11.getLabelPaint();
        java.awt.Paint paint19 = valueMarker11.getPaint();
        java.lang.Object obj20 = null;
        boolean boolean21 = valueMarker11.equals(obj20);
        java.awt.Paint paint22 = valueMarker11.getPaint();
        java.awt.Stroke stroke23 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke23);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker1.removeChangeListener(markerChangeListener26);
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Paint paint18 = valueMarker14.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str21 = valueMarker20.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker20.addChangeListener(markerChangeListener22);
        java.awt.Font font24 = valueMarker20.getLabelFont();
        valueMarker14.setLabelFont(font24);
        java.awt.Stroke stroke26 = valueMarker14.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker28.addChangeListener(markerChangeListener31);
        double double33 = valueMarker28.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker28.getLabelAnchor();
        valueMarker28.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = valueMarker28.getLabelOffset();
        valueMarker14.setLabelOffset(rectangleInsets37);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        float float43 = valueMarker40.getAlpha();
        java.lang.String str44 = valueMarker40.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker40.removeChangeListener(markerChangeListener45);
        valueMarker40.setAlpha((float) 1L);
        java.lang.String str49 = valueMarker40.getLabel();
        java.awt.Stroke stroke50 = valueMarker40.getStroke();
        valueMarker14.setStroke(stroke50);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint12, stroke50);
        valueMarker1.setPaint(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor34);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.8f + "'", float43 == 0.8f);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(stroke50);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(32.0d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        java.lang.Class<?> wildcardClass16 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        java.awt.Paint paint39 = valueMarker36.getPaint();
        java.lang.String str40 = valueMarker36.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        valueMarker36.notifyListeners(markerChangeEvent41);
        java.awt.Paint paint43 = valueMarker36.getPaint();
        valueMarker36.setLabel("hi!");
        double double46 = valueMarker36.getValue();
        java.awt.Stroke stroke47 = valueMarker36.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke47);
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
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(stroke47);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Stroke stroke11 = valueMarker10.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke11);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        valueMarker1.setAlpha((float) 1L);
        java.lang.String str10 = valueMarker1.getLabel();
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getOutlinePaint();
        valueMarker1.setPaint(paint16);
        java.awt.Paint paint18 = valueMarker1.getPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.lang.Object obj2 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.lang.String str10 = valueMarker6.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker6.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker6.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker16.notifyListeners(markerChangeEvent19);
        valueMarker16.setValue((double) 0.8f);
        boolean boolean23 = valueMarker14.equals((java.lang.Object) valueMarker16);
        java.awt.Stroke stroke24 = valueMarker16.getStroke();
        valueMarker6.setOutlineStroke(stroke24);
        valueMarker4.setOutlineStroke(stroke24);
        valueMarker1.setStroke(stroke24);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Font font8 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        java.awt.Paint paint20 = valueMarker1.getLabelPaint();
        double double21 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.awt.Paint paint20 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.awt.Stroke stroke26 = valueMarker22.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getOutlinePaint();
        valueMarker22.setLabelPaint(paint31);
        float float33 = valueMarker22.getAlpha();
        valueMarker22.setLabel("");
        java.awt.Paint paint36 = valueMarker22.getOutlinePaint();
        java.awt.Stroke stroke37 = valueMarker22.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker39.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker39.addChangeListener(markerChangeListener42);
        double double44 = valueMarker39.getValue();
        java.awt.Paint paint45 = valueMarker39.getOutlinePaint();
        java.awt.Paint paint46 = valueMarker39.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType47 = valueMarker39.getLabelOffsetType();
        java.awt.Paint paint48 = valueMarker39.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker50.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent53 = null;
        valueMarker50.notifyListeners(markerChangeEvent53);
        java.awt.Stroke stroke55 = valueMarker50.getStroke();
        java.lang.Object obj56 = valueMarker50.clone();
        java.awt.Stroke stroke57 = valueMarker50.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint20, stroke37, paint48, stroke57, (float) ' ');
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
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.8f + "'", float33 == 0.8f);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(lengthAdjustmentType47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(stroke57);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker15.addChangeListener(markerChangeListener20);
        java.awt.Paint paint22 = valueMarker15.getOutlinePaint();
        java.awt.Stroke stroke23 = valueMarker15.getStroke();
        valueMarker1.setStroke(stroke23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor9);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getPaint();
        java.lang.String str21 = valueMarker17.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker17.getLabelOffsetType();
        java.lang.Object obj23 = valueMarker17.clone();
        java.lang.Class<?> wildcardClass24 = valueMarker17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray25 = valueMarker1.getListeners((java.lang.Class) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.awt.Paint paint1 = null;
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
        java.awt.Paint paint17 = valueMarker3.getOutlinePaint();
        java.awt.Stroke stroke18 = valueMarker3.getOutlineStroke();
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
        java.awt.Stroke stroke34 = valueMarker20.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor35 = valueMarker20.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker20.getLabelTextAnchor();
        java.awt.Stroke stroke37 = valueMarker20.getOutlineStroke();
        java.awt.Paint paint38 = valueMarker20.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        java.awt.Paint paint43 = valueMarker40.getPaint();
        java.lang.String str44 = valueMarker40.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType45 = valueMarker40.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = valueMarker40.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener47 = null;
        valueMarker40.addChangeListener(markerChangeListener47);
        java.awt.Stroke stroke49 = valueMarker40.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) (short) 0, paint1, stroke18, paint38, stroke49, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.8f + "'", float31 == 0.8f);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(textAnchor35);
        org.junit.Assert.assertNotNull(textAnchor36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType45);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        double double10 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.lang.Object obj19 = valueMarker15.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker15.getLabelOffsetType();
        valueMarker15.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker15.addChangeListener(markerChangeListener23);
        java.lang.String str25 = valueMarker15.getLabel();
        java.awt.Stroke stroke26 = valueMarker15.getOutlineStroke();
        java.lang.Class<?> wildcardClass27 = stroke26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray28 = valueMarker1.getListeners((java.lang.Class) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.BasicStroke; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        java.awt.Paint paint14 = valueMarker3.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.awt.Stroke stroke20 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getOutlinePaint();
        valueMarker16.setLabelPaint(paint25);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker16.getLabelAnchor();
        valueMarker16.setLabel("hi!");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker16.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker16.getLabelOffsetType();
        valueMarker3.setLabelOffsetType(lengthAdjustmentType31);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
        org.junit.Assert.assertNotNull(lengthAdjustmentType31);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        valueMarker10.setLabelPaint(paint17);
        java.awt.Stroke stroke19 = valueMarker10.getStroke();
        java.awt.Paint paint20 = valueMarker10.getLabelPaint();
        valueMarker8.setLabelPaint(paint20);
        java.lang.Class<?> wildcardClass22 = paint20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray23 = valueMarker1.getListeners((java.lang.Class) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint10 = valueMarker9.getLabelPaint();
        valueMarker1.setOutlinePaint(paint10);
        java.lang.Class<?> wildcardClass12 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        java.lang.String str21 = valueMarker1.getLabel();
        java.awt.Paint paint22 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker2.addChangeListener(markerChangeListener7);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker2.addChangeListener(markerChangeListener11);
        valueMarker2.setValue((double) (-1L));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getPaint();
        java.awt.Stroke stroke21 = valueMarker17.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getOutlinePaint();
        valueMarker17.setLabelPaint(paint26);
        float float28 = valueMarker17.getAlpha();
        valueMarker17.setLabel("");
        valueMarker17.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor33 = valueMarker17.getLabelTextAnchor();
        double double34 = valueMarker17.getValue();
        java.awt.Paint paint35 = valueMarker17.getPaint();
        valueMarker2.setPaint(paint35);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker38.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        valueMarker38.notifyListeners(markerChangeEvent41);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent43 = null;
        valueMarker38.notifyListeners(markerChangeEvent43);
        double double45 = valueMarker38.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent46 = null;
        valueMarker38.notifyListeners(markerChangeEvent46);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        valueMarker38.notifyListeners(markerChangeEvent48);
        java.awt.Stroke stroke50 = valueMarker38.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker53.setLabel("");
        java.awt.Paint paint56 = valueMarker53.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener57 = null;
        valueMarker53.removeChangeListener(markerChangeListener57);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener59 = null;
        valueMarker53.addChangeListener(markerChangeListener59);
        java.awt.Paint paint61 = valueMarker53.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType62 = valueMarker53.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener63 = null;
        valueMarker53.removeChangeListener(markerChangeListener63);
        java.awt.Paint paint65 = valueMarker53.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker67 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke68 = valueMarker67.getStroke();
        java.awt.Paint paint69 = valueMarker67.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker71 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke72 = valueMarker71.getStroke();
        valueMarker67.setStroke(stroke72);
        org.jfree.chart.plot.ValueMarker valueMarker74 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint65, stroke72);
        org.jfree.chart.plot.ValueMarker valueMarker76 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker76.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener79 = null;
        valueMarker76.addChangeListener(markerChangeListener79);
        double double81 = valueMarker76.getValue();
        java.awt.Paint paint82 = valueMarker76.getOutlinePaint();
        java.awt.Paint paint83 = valueMarker76.getLabelPaint();
        valueMarker76.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent86 = null;
        valueMarker76.notifyListeners(markerChangeEvent86);
        java.lang.Object obj88 = valueMarker76.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent89 = null;
        valueMarker76.notifyListeners(markerChangeEvent89);
        java.awt.Paint paint91 = valueMarker76.getOutlinePaint();
        java.awt.Stroke stroke92 = valueMarker76.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker94 = new org.jfree.chart.plot.ValueMarker((double) '4', paint35, stroke50, paint65, stroke92, (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.8f + "'", float28 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(lengthAdjustmentType62);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNotNull(stroke72);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertNotNull(paint82);
        org.junit.Assert.assertNotNull(paint83);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertNotNull(paint91);
        org.junit.Assert.assertNotNull(stroke92);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker1.getLabelOffsetType();
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
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        java.lang.Object obj13 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker1.notifyListeners(markerChangeEvent14);
        java.awt.Paint paint16 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke17 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke18 = valueMarker1.getStroke();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        java.awt.Font font12 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = valueMarker1.getLabelOffset();
        valueMarker1.setValue((-1.0d));
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
        org.junit.Assert.assertNotNull(rectangleInsets34);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker26.getLabelOffset();
        java.awt.Stroke stroke28 = valueMarker26.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke28);
        java.lang.Object obj30 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getOutlinePaint();
        valueMarker8.setLabelPaint(paint15);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker8.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        valueMarker19.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker19.removeChangeListener(markerChangeListener24);
        boolean boolean26 = valueMarker8.equals((java.lang.Object) markerChangeListener24);
        boolean boolean27 = valueMarker1.equals((java.lang.Object) valueMarker8);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        valueMarker1.setValue((double) (-1L));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        valueMarker1.setLabel("");
        valueMarker1.setValue((double) 100);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        java.lang.String str18 = valueMarker17.getLabel();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        java.awt.Stroke stroke15 = valueMarker1.getStroke();
        java.awt.Stroke stroke16 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.lang.Object obj26 = null;
        boolean boolean27 = valueMarker1.equals(obj26);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 1L);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Stroke stroke21 = valueMarker20.getOutlineStroke();
        boolean boolean22 = valueMarker1.equals((java.lang.Object) stroke21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.lang.Object obj4 = valueMarker1.clone();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker1.getLabelAnchor();
        java.lang.Object obj21 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.removeChangeListener(markerChangeListener22);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(0.0d);
        float float2 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.8f + "'", float2 == 0.8f);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker9.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType10);
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.lang.Object obj3 = valueMarker1.clone();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setAlpha((float) (byte) 0);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.awt.Stroke stroke13 = valueMarker9.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getOutlinePaint();
        valueMarker9.setLabelPaint(paint18);
        double double20 = valueMarker9.getValue();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker9.getLabelTextAnchor();
        float float22 = valueMarker9.getAlpha();
        java.lang.Class<?> wildcardClass23 = valueMarker9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray24 = valueMarker1.getListeners((java.lang.Class) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        float float20 = valueMarker18.getAlpha();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType2 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj3 = valueMarker1.clone();
        valueMarker1.setAlpha((float) 0);
        org.junit.Assert.assertNotNull(lengthAdjustmentType2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getPaint();
        java.lang.String str22 = valueMarker18.getLabel();
        double double23 = valueMarker18.getValue();
        java.awt.Stroke stroke24 = valueMarker18.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint27 = valueMarker26.getLabelPaint();
        valueMarker18.setOutlinePaint(paint27);
        boolean boolean29 = valueMarker1.equals((java.lang.Object) paint27);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        java.awt.Paint paint16 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.lang.String str20 = valueMarker16.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker16.notifyListeners(markerChangeEvent21);
        java.awt.Paint paint23 = valueMarker16.getPaint();
        valueMarker16.setLabel("hi!");
        double double26 = valueMarker16.getValue();
        java.awt.Stroke stroke27 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setLabel("");
        java.awt.Paint paint32 = valueMarker29.getPaint();
        java.awt.Stroke stroke33 = valueMarker29.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        java.awt.Paint paint38 = valueMarker35.getOutlinePaint();
        valueMarker29.setLabelPaint(paint38);
        float float40 = valueMarker29.getAlpha();
        valueMarker29.setLabel("");
        valueMarker29.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor45 = valueMarker29.getLabelTextAnchor();
        java.awt.Paint paint46 = valueMarker29.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType47 = valueMarker29.getLabelOffsetType();
        double double48 = valueMarker29.getValue();
        org.jfree.chart.text.TextAnchor textAnchor49 = valueMarker29.getLabelTextAnchor();
        valueMarker16.setLabelTextAnchor(textAnchor49);
        valueMarker1.setLabelTextAnchor(textAnchor49);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.8f + "'", float40 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(lengthAdjustmentType47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor49);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint16 = valueMarker1.getPaint();
        java.lang.Object obj17 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker2.notifyListeners(markerChangeEvent4);
        float float6 = valueMarker2.getAlpha();
        java.awt.Font font7 = valueMarker2.getLabelFont();
        java.awt.Paint paint8 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        double double15 = valueMarker10.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker10.getLabelAnchor();
        valueMarker10.setLabel("hi!");
        java.awt.Stroke stroke19 = valueMarker10.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.awt.Stroke stroke25 = valueMarker21.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getOutlinePaint();
        valueMarker21.setLabelPaint(paint30);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker21.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker21.addChangeListener(markerChangeListener33);
        org.jfree.chart.text.TextAnchor textAnchor35 = valueMarker21.getLabelTextAnchor();
        java.awt.Paint paint36 = valueMarker21.getPaint();
        java.awt.Stroke stroke37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 100L, paint8, stroke19, paint36, stroke37, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(textAnchor35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        java.awt.Paint paint29 = valueMarker1.getPaint();
        java.lang.Object obj30 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker10.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(textAnchor14);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType9);
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.removeChangeListener(markerChangeListener13);
        java.lang.String str15 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        java.awt.Paint paint10 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        double double17 = valueMarker12.getValue();
        java.awt.Paint paint18 = valueMarker12.getLabelPaint();
        java.awt.Paint paint19 = valueMarker12.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker21.addChangeListener(markerChangeListener24);
        double double26 = valueMarker21.getValue();
        java.awt.Paint paint27 = valueMarker21.getLabelPaint();
        valueMarker12.setOutlinePaint(paint27);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor30 = valueMarker12.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor30);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
        org.junit.Assert.assertNotNull(textAnchor30);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        java.awt.Paint paint21 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(textAnchor10);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType9);
        float float11 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker1.notifyListeners(markerChangeEvent12);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font17 = valueMarker16.getLabelFont();
        java.awt.Stroke stroke18 = valueMarker16.getOutlineStroke();
        java.awt.Stroke stroke19 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.lang.Object obj25 = valueMarker21.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker21.getLabelOffsetType();
        valueMarker21.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker21.addChangeListener(markerChangeListener29);
        java.lang.String str31 = valueMarker21.getLabel();
        java.awt.Font font32 = valueMarker21.getLabelFont();
        valueMarker16.setLabelFont(font32);
        valueMarker1.setLabelFont(font32);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        valueMarker1.setAlpha(1.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(textAnchor26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        java.awt.Font font11 = valueMarker10.getLabelFont();
        java.lang.String str12 = valueMarker10.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.lang.String str18 = valueMarker14.getLabel();
        double double19 = valueMarker14.getValue();
        java.awt.Stroke stroke20 = valueMarker14.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint23 = valueMarker22.getLabelPaint();
        valueMarker14.setOutlinePaint(paint23);
        java.awt.Paint paint25 = valueMarker14.getPaint();
        java.awt.Paint paint26 = valueMarker14.getPaint();
        valueMarker10.setPaint(paint26);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(textAnchor14);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType9);
        float float11 = valueMarker1.getAlpha();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(textAnchor7);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.awt.Stroke stroke8 = valueMarker4.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets9);
        java.lang.Class<?> wildcardClass11 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.lang.String str19 = valueMarker15.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint22 = valueMarker21.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker21.getLabelAnchor();
        valueMarker15.setLabelAnchor(rectangleAnchor23);
        valueMarker1.setLabelAnchor(rectangleAnchor23);
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.awt.Stroke stroke13 = valueMarker9.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getOutlinePaint();
        valueMarker9.setLabelPaint(paint18);
        double double20 = valueMarker9.getValue();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker9.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.addChangeListener(markerChangeListener23);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker1.getLabelOffset();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        java.lang.Class<?> wildcardClass22 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.lang.String str10 = valueMarker1.getLabel();
        java.lang.Object obj11 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
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
        java.awt.Font font22 = valueMarker8.getLabelFont();
        java.lang.Class<?> wildcardClass23 = valueMarker8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray24 = valueMarker1.getListeners((java.lang.Class) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker11.notifyListeners(markerChangeEvent14);
        valueMarker11.setValue((double) 0.8f);
        boolean boolean18 = valueMarker9.equals((java.lang.Object) valueMarker11);
        java.awt.Stroke stroke19 = valueMarker11.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint7, stroke19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.awt.Stroke stroke26 = valueMarker22.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker22.getLabelOffset();
        java.awt.Paint paint28 = valueMarker22.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke31 = valueMarker30.getStroke();
        java.awt.Paint paint32 = valueMarker30.getOutlinePaint();
        valueMarker22.setOutlinePaint(paint32);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        java.awt.Paint paint40 = valueMarker37.getPaint();
        java.lang.String str41 = valueMarker37.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType42 = valueMarker37.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = valueMarker37.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker47.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent50 = null;
        valueMarker47.notifyListeners(markerChangeEvent50);
        valueMarker47.setValue((double) 0.8f);
        boolean boolean54 = valueMarker45.equals((java.lang.Object) valueMarker47);
        java.awt.Stroke stroke55 = valueMarker47.getStroke();
        valueMarker37.setOutlineStroke(stroke55);
        valueMarker35.setOutlineStroke(stroke55);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) (-1), paint1, stroke19, paint32, stroke55, (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType42);
        org.junit.Assert.assertNotNull(rectangleInsets43);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(stroke55);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker10.addChangeListener(markerChangeListener15);
        valueMarker10.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker10.getLabelTextAnchor();
        java.lang.String str20 = valueMarker10.getLabel();
        java.awt.Paint paint21 = valueMarker10.getOutlinePaint();
        java.awt.Paint paint22 = valueMarker10.getLabelPaint();
        valueMarker1.setLabelPaint(paint22);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker20.getLabelOffset();
        java.awt.Stroke stroke22 = valueMarker20.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        java.awt.Paint paint28 = valueMarker25.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker32.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        valueMarker32.notifyListeners(markerChangeEvent35);
        valueMarker32.setValue((double) 0.8f);
        boolean boolean39 = valueMarker30.equals((java.lang.Object) valueMarker32);
        java.awt.Stroke stroke40 = valueMarker32.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint28, stroke40);
        valueMarker20.setStroke(stroke40);
        java.lang.Class<?> wildcardClass43 = stroke40.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray44 = valueMarker1.getListeners((java.lang.Class) wildcardClass43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.BasicStroke; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker1.removeChangeListener(markerChangeListener25);
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
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        java.lang.Object obj5 = valueMarker1.clone();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        float float8 = valueMarker1.getAlpha();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue(1.0d);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker6.notifyListeners(markerChangeEvent9);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker6.notifyListeners(markerChangeEvent11);
        java.awt.Font font13 = valueMarker6.getLabelFont();
        java.awt.Stroke stroke14 = valueMarker6.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker16.addChangeListener(markerChangeListener21);
        float float23 = valueMarker16.getAlpha();
        java.awt.Paint paint24 = valueMarker16.getPaint();
        valueMarker6.setLabelPaint(paint24);
        valueMarker1.setOutlinePaint(paint24);
        java.lang.Object obj27 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        java.lang.Object obj9 = valueMarker1.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
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
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        valueMarker1.addChangeListener(markerChangeListener32);
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(textAnchor34);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        java.awt.Paint paint23 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke26 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        java.awt.Stroke stroke17 = valueMarker1.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(textAnchor18);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        java.awt.Paint paint24 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        valueMarker1.setAlpha((float) 1L);
        java.lang.String str10 = valueMarker1.getLabel();
        valueMarker1.setAlpha(1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker14.addChangeListener(markerChangeListener19);
        valueMarker14.setLabel("");
        valueMarker14.setLabel("");
        java.awt.Paint paint25 = valueMarker14.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        float float30 = valueMarker27.getAlpha();
        java.lang.String str31 = valueMarker27.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker27.removeChangeListener(markerChangeListener32);
        valueMarker27.setAlpha((float) 1L);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        valueMarker37.notifyListeners(markerChangeEvent40);
        java.awt.Stroke stroke42 = valueMarker37.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType43 = valueMarker37.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint46 = valueMarker45.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor47 = valueMarker45.getLabelAnchor();
        valueMarker37.setLabelAnchor(rectangleAnchor47);
        valueMarker27.setLabelAnchor(rectangleAnchor47);
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = valueMarker27.getLabelOffset();
        valueMarker14.setLabelOffset(rectangleInsets50);
        boolean boolean52 = valueMarker1.equals((java.lang.Object) valueMarker14);
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker14.setLabelOffset(rectangleInsets53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(lengthAdjustmentType43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(rectangleAnchor47);
        org.junit.Assert.assertNotNull(rectangleInsets50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        java.lang.String str24 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        java.awt.Paint paint35 = valueMarker1.getLabelPaint();
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
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        float float11 = valueMarker10.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker10.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker14.addChangeListener(markerChangeListener17);
        double double19 = valueMarker14.getValue();
        java.awt.Paint paint20 = valueMarker14.getLabelPaint();
        java.awt.Paint paint21 = valueMarker14.getOutlinePaint();
        boolean boolean22 = valueMarker10.equals((java.lang.Object) valueMarker14);
        java.awt.Font font23 = valueMarker14.getLabelFont();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.lang.String str9 = valueMarker5.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker5.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType10);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        valueMarker1.notifyListeners(markerChangeEvent32);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        float float38 = valueMarker35.getAlpha();
        java.lang.String str39 = valueMarker35.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker35.removeChangeListener(markerChangeListener40);
        valueMarker35.setAlpha((float) 1L);
        java.lang.String str44 = valueMarker35.getLabel();
        java.lang.Class<?> wildcardClass45 = valueMarker35.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray46 = valueMarker1.getListeners((java.lang.Class) wildcardClass45);
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
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.800000011920929d + "'", double31 == 0.800000011920929d);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.8f + "'", float38 == 0.8f);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        float float24 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker1.addChangeListener(markerChangeListener25);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker8.getLabelOffset();
        java.awt.Stroke stroke10 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker13.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker13.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font23 = valueMarker22.getLabelFont();
        valueMarker1.setLabelFont(font23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.addChangeListener(markerChangeListener21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        float float5 = valueMarker2.getAlpha();
        java.lang.String str6 = valueMarker2.getLabel();
        java.lang.Object obj7 = valueMarker2.clone();
        valueMarker2.setLabel("");
        java.awt.Paint paint10 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke13 = valueMarker12.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker12.addChangeListener(markerChangeListener14);
        java.lang.String str16 = valueMarker12.getLabel();
        java.awt.Stroke stroke17 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker19.addChangeListener(markerChangeListener22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker25.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker25.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker25.addChangeListener(markerChangeListener30);
        float float32 = valueMarker25.getAlpha();
        java.awt.Paint paint33 = valueMarker25.getPaint();
        valueMarker19.setOutlinePaint(paint33);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke37 = valueMarker36.getStroke();
        java.lang.Object obj38 = valueMarker36.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker36.addChangeListener(markerChangeListener39);
        java.awt.Paint paint41 = valueMarker36.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker43.setLabel("");
        java.awt.Paint paint46 = valueMarker43.getPaint();
        java.awt.Stroke stroke47 = valueMarker43.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker49.setLabel("");
        java.awt.Paint paint52 = valueMarker49.getOutlinePaint();
        valueMarker43.setLabelPaint(paint52);
        float float54 = valueMarker43.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener55 = null;
        valueMarker43.addChangeListener(markerChangeListener55);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType57 = valueMarker43.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker61.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent64 = null;
        valueMarker61.notifyListeners(markerChangeEvent64);
        valueMarker61.setValue((double) 0.8f);
        boolean boolean68 = valueMarker59.equals((java.lang.Object) valueMarker61);
        java.awt.Stroke stroke69 = valueMarker61.getStroke();
        valueMarker43.setStroke(stroke69);
        java.awt.Stroke stroke71 = valueMarker43.getOutlineStroke();
        valueMarker36.setStroke(stroke71);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker74 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10, paint10, stroke17, paint33, stroke71, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.8f + "'", float54 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType57);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(stroke69);
        org.junit.Assert.assertNotNull(stroke71);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        java.lang.Object obj31 = null;
        boolean boolean32 = valueMarker1.equals(obj31);
        java.awt.Paint paint33 = valueMarker1.getLabelPaint();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        valueMarker1.setValue((double) 0.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        double double5 = valueMarker1.getValue();
        valueMarker1.setValue((double) (byte) 0);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        valueMarker10.setValue((double) 10);
        java.awt.Stroke stroke13 = valueMarker10.getOutlineStroke();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        java.awt.Font font15 = valueMarker10.getLabelFont();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke22 = valueMarker21.getStroke();
        valueMarker1.setOutlineStroke(stroke22);
        java.lang.Object obj24 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        java.lang.Object obj31 = null;
        boolean boolean32 = valueMarker1.equals(obj31);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker34.addChangeListener(markerChangeListener37);
        double double39 = valueMarker34.getValue();
        java.awt.Paint paint40 = valueMarker34.getLabelPaint();
        java.awt.Paint paint41 = valueMarker34.getOutlinePaint();
        java.awt.Stroke stroke42 = valueMarker34.getOutlineStroke();
        java.awt.Stroke stroke43 = valueMarker34.getOutlineStroke();
        java.awt.Paint paint44 = valueMarker34.getOutlinePaint();
        java.lang.Class<?> wildcardClass45 = paint44.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray46 = valueMarker1.getListeners((java.lang.Class) wildcardClass45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
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
        boolean boolean26 = valueMarker1.equals((java.lang.Object) valueMarker10);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker2.removeChangeListener(markerChangeListener7);
        java.awt.Stroke stroke9 = valueMarker2.getOutlineStroke();
        boolean boolean11 = valueMarker2.equals((java.lang.Object) (short) -1);
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker2.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker14.addChangeListener(markerChangeListener19);
        valueMarker14.setLabel("");
        valueMarker14.setLabel("");
        java.awt.Paint paint25 = valueMarker14.getOutlinePaint();
        valueMarker2.setLabelPaint(paint25);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Stroke stroke29 = valueMarker28.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker31.addChangeListener(markerChangeListener34);
        double double36 = valueMarker31.getValue();
        java.awt.Paint paint37 = valueMarker31.getOutlinePaint();
        java.awt.Paint paint38 = valueMarker31.getLabelPaint();
        valueMarker31.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        valueMarker31.notifyListeners(markerChangeEvent41);
        java.lang.Object obj43 = valueMarker31.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        valueMarker31.notifyListeners(markerChangeEvent44);
        java.awt.Paint paint46 = valueMarker31.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker48.setLabel("");
        java.awt.Font font51 = valueMarker48.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker48.addChangeListener(markerChangeListener52);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor54 = valueMarker48.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor55 = valueMarker48.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker58.setLabel("");
        java.awt.Paint paint61 = valueMarker58.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker65 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker65.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent68 = null;
        valueMarker65.notifyListeners(markerChangeEvent68);
        valueMarker65.setValue((double) 0.8f);
        boolean boolean72 = valueMarker63.equals((java.lang.Object) valueMarker65);
        java.awt.Stroke stroke73 = valueMarker65.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker74 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint61, stroke73);
        java.awt.Stroke stroke75 = valueMarker74.getOutlineStroke();
        valueMarker48.setOutlineStroke(stroke75);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker78 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100, paint25, stroke29, paint46, stroke75, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(font51);
        org.junit.Assert.assertNotNull(rectangleAnchor54);
        org.junit.Assert.assertNotNull(rectangleAnchor55);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(stroke73);
        org.junit.Assert.assertNotNull(stroke75);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        float float5 = valueMarker1.getAlpha();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker22.notifyListeners(markerChangeEvent24);
        float float26 = valueMarker22.getAlpha();
        java.awt.Font font27 = valueMarker22.getLabelFont();
        valueMarker1.setLabelFont(font27);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint31 = valueMarker30.getPaint();
        valueMarker1.setPaint(paint31);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        java.lang.String str16 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        java.lang.String str25 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.lang.String str18 = valueMarker14.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getPaint();
        valueMarker14.setLabelPaint(paint23);
        valueMarker1.setLabelPaint(paint23);
        java.lang.String str26 = valueMarker1.getLabel();
        java.lang.Class<?> wildcardClass27 = valueMarker1.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke3 = valueMarker2.getStroke();
        java.awt.Paint paint4 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker7.addChangeListener(markerChangeListener10);
        double double12 = valueMarker7.getValue();
        java.awt.Paint paint13 = valueMarker7.getLabelPaint();
        java.awt.Paint paint14 = valueMarker7.getOutlinePaint();
        java.lang.String str15 = valueMarker7.getLabel();
        java.awt.Paint paint16 = valueMarker7.getOutlinePaint();
        java.awt.Paint paint17 = valueMarker7.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint20 = valueMarker19.getLabelPaint();
        java.awt.Stroke stroke21 = valueMarker19.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker(0.0d, paint17, stroke21);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint4, stroke21);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        java.lang.Object obj30 = valueMarker1.clone();
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
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getOutlinePaint();
        valueMarker17.setLabelPaint(paint24);
        java.awt.Stroke stroke26 = valueMarker17.getStroke();
        java.awt.Paint paint27 = valueMarker17.getLabelPaint();
        valueMarker15.setLabelPaint(paint27);
        java.lang.Class<?> wildcardClass29 = paint27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray30 = valueMarker1.getListeners((java.lang.Class) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        java.awt.Font font41 = valueMarker1.getLabelFont();
        java.lang.Class<?> wildcardClass42 = font41.getClass();
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
        org.junit.Assert.assertNotNull(font41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        org.jfree.chart.text.TextAnchor textAnchor47 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font50 = valueMarker49.getLabelFont();
        java.awt.Stroke stroke51 = valueMarker49.getOutlineStroke();
        java.awt.Paint paint52 = valueMarker49.getOutlinePaint();
        java.awt.Stroke stroke53 = valueMarker49.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint56 = valueMarker55.getPaint();
        valueMarker49.setPaint(paint56);
        valueMarker1.setOutlinePaint(paint56);
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
        org.junit.Assert.assertNotNull(textAnchor47);
        org.junit.Assert.assertNotNull(font50);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(paint56);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        java.awt.Stroke stroke15 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.removeChangeListener(markerChangeListener16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getOutlinePaint();
        java.awt.Paint paint10 = valueMarker6.getOutlinePaint();
        valueMarker1.setPaint(paint10);
        java.awt.Font font12 = valueMarker1.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelTextAnchor(textAnchor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint10 = valueMarker9.getPaint();
        valueMarker1.setLabelPaint(paint10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        double double21 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        java.awt.Paint paint13 = valueMarker1.getPaint();
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker1.notifyListeners(markerChangeEvent24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        java.lang.Object obj9 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker1.notifyListeners(markerChangeEvent12);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        float float15 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getOutlinePaint();
        valueMarker19.setLabelPaint(paint26);
        java.awt.Stroke stroke28 = valueMarker19.getStroke();
        java.awt.Paint paint29 = valueMarker19.getLabelPaint();
        valueMarker17.setLabelPaint(paint29);
        java.lang.Class<?> wildcardClass31 = paint29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray32 = valueMarker1.getListeners((java.lang.Class) wildcardClass31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke24 = valueMarker23.getStroke();
        java.awt.Paint paint25 = valueMarker23.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke28 = valueMarker27.getStroke();
        valueMarker23.setStroke(stroke28);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker23.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets30);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        java.awt.Paint paint19 = valueMarker13.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker13.getLabelPaint();
        valueMarker13.setLabel("");
        float float23 = valueMarker13.getAlpha();
        valueMarker13.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor26 = valueMarker13.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor26);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor26);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        java.awt.Paint paint34 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType35 = valueMarker1.getLabelOffsetType();
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
        org.junit.Assert.assertNotNull(lengthAdjustmentType35);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.lang.String str19 = valueMarker15.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker15.getLabelOffsetType();
        valueMarker15.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getPaint();
        java.lang.String str28 = valueMarker24.getLabel();
        boolean boolean29 = valueMarker15.equals((java.lang.Object) valueMarker24);
        double double30 = valueMarker24.getValue();
        boolean boolean31 = valueMarker1.equals((java.lang.Object) valueMarker24);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.Class<?> wildcardClass2 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.lang.String str6 = valueMarker2.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker2.notifyListeners(markerChangeEvent7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.lang.String str14 = valueMarker10.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        valueMarker10.setLabelPaint(paint19);
        valueMarker2.setOutlinePaint(paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker2.getLabelOffset();
        valueMarker2.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker2.notifyListeners(markerChangeEvent25);
        float float27 = valueMarker2.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint29 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        java.awt.Paint paint34 = valueMarker31.getPaint();
        java.lang.String str35 = valueMarker31.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        valueMarker31.notifyListeners(markerChangeEvent36);
        java.awt.Paint paint38 = valueMarker31.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor39 = valueMarker31.getLabelAnchor();
        java.awt.Stroke stroke40 = valueMarker31.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker42.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker42.addChangeListener(markerChangeListener45);
        double double47 = valueMarker42.getValue();
        java.awt.Paint paint48 = valueMarker42.getOutlinePaint();
        java.awt.Paint paint49 = valueMarker42.getLabelPaint();
        java.awt.Paint paint50 = valueMarker42.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener55 = null;
        valueMarker52.addChangeListener(markerChangeListener55);
        double double57 = valueMarker52.getValue();
        java.awt.Paint paint58 = valueMarker52.getOutlinePaint();
        java.awt.Paint paint59 = valueMarker52.getLabelPaint();
        java.awt.Paint paint60 = valueMarker52.getPaint();
        valueMarker42.setLabelPaint(paint60);
        java.awt.Paint paint62 = valueMarker42.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker64.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener67 = null;
        valueMarker64.addChangeListener(markerChangeListener67);
        double double69 = valueMarker64.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor70 = valueMarker64.getLabelAnchor();
        valueMarker64.setLabel("hi!");
        java.awt.Stroke stroke73 = valueMarker64.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker75 = new org.jfree.chart.plot.ValueMarker(1.0d, paint29, stroke40, paint62, stroke73, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(rectangleAnchor39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor70);
        org.junit.Assert.assertNotNull(stroke73);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker1.notifyListeners(markerChangeEvent12);
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font11 = valueMarker10.getLabelFont();
        java.awt.Stroke stroke12 = valueMarker10.getOutlineStroke();
        java.awt.Stroke stroke13 = valueMarker10.getOutlineStroke();
        valueMarker10.setLabel("");
        java.awt.Paint paint16 = valueMarker10.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker18.addChangeListener(markerChangeListener21);
        double double23 = valueMarker18.getValue();
        java.awt.Paint paint24 = valueMarker18.getLabelPaint();
        java.awt.Paint paint25 = valueMarker18.getOutlinePaint();
        java.lang.String str26 = valueMarker18.getLabel();
        java.awt.Paint paint27 = valueMarker18.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker18.getLabelAnchor();
        valueMarker10.setLabelAnchor(rectangleAnchor28);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker10.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor30);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker3.addChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker3.removeChangeListener(markerChangeListener8);
        java.awt.Stroke stroke10 = valueMarker3.getOutlineStroke();
        java.lang.Class<?> wildcardClass11 = valueMarker3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray12 = valueMarker1.getListeners((java.lang.Class) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        java.lang.Class<?> wildcardClass9 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker23.getLabelAnchor();
        java.lang.Class<?> wildcardClass27 = rectangleAnchor26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray28 = valueMarker1.getListeners((java.lang.Class) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.RectangleAnchor; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(rectangleAnchor26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        java.awt.Stroke stroke14 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        float float16 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        float float20 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        valueMarker1.setValue((double) 10.0f);
        java.lang.Object obj24 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker13.getLabelTextAnchor();
        float float17 = valueMarker13.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font20 = valueMarker19.getLabelFont();
        valueMarker13.setLabelFont(font20);
        java.lang.Class<?> wildcardClass22 = font20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray23 = valueMarker1.getListeners((java.lang.Class) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Font; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        java.awt.Stroke stroke8 = valueMarker3.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getPaint();
        java.awt.Stroke stroke15 = valueMarker11.getOutlineStroke();
        java.awt.Stroke stroke16 = valueMarker11.getStroke();
        valueMarker3.setStroke(stroke16);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker3.notifyListeners(markerChangeEvent18);
        valueMarker3.setValue((double) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker3.getLabelAnchor();
        java.awt.Stroke stroke23 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        java.awt.Paint paint28 = valueMarker25.getPaint();
        java.lang.String str29 = valueMarker25.getLabel();
        double double30 = valueMarker25.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker32.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        java.awt.Paint paint39 = valueMarker36.getOutlinePaint();
        valueMarker32.setLabelPaint(paint39);
        java.awt.Stroke stroke41 = valueMarker32.getStroke();
        valueMarker25.setStroke(stroke41);
        java.awt.Paint paint43 = valueMarker25.getOutlinePaint();
        java.awt.Stroke stroke44 = valueMarker25.getOutlineStroke();
        java.awt.Font font45 = valueMarker25.getLabelFont();
        java.awt.Stroke stroke46 = valueMarker25.getStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor47 = valueMarker25.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        valueMarker25.notifyListeners(markerChangeEvent48);
        java.awt.Paint paint50 = valueMarker25.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setLabel("");
        java.awt.Paint paint55 = valueMarker52.getPaint();
        java.lang.String str56 = valueMarker52.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent57 = null;
        valueMarker52.notifyListeners(markerChangeEvent57);
        java.awt.Paint paint59 = valueMarker52.getPaint();
        valueMarker52.setLabel("hi!");
        double double62 = valueMarker52.getValue();
        java.awt.Stroke stroke63 = valueMarker52.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker65 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint1, stroke23, paint50, stroke63, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(font45);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(rectangleAnchor47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(stroke63);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(textAnchor10);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker1.getLabelOffset();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '#');
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
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker25.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker25.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker25.addChangeListener(markerChangeListener30);
        java.awt.Paint paint32 = valueMarker25.getLabelPaint();
        java.awt.Stroke stroke33 = valueMarker25.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint36 = valueMarker35.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker38.setLabel("");
        java.awt.Paint paint41 = valueMarker38.getPaint();
        java.lang.String str42 = valueMarker38.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType43 = valueMarker38.getLabelOffsetType();
        valueMarker35.setLabelOffsetType(lengthAdjustmentType43);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker35.addChangeListener(markerChangeListener45);
        java.awt.Paint paint47 = valueMarker35.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType48 = valueMarker35.getLabelOffsetType();
        java.awt.Paint paint49 = valueMarker35.getLabelPaint();
        valueMarker25.setOutlinePaint(paint49);
        valueMarker1.setLabelPaint(paint49);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType43);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(lengthAdjustmentType48);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor9);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        float float13 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getOutlinePaint();
        java.awt.Paint paint10 = valueMarker6.getOutlinePaint();
        valueMarker1.setPaint(paint10);
        java.awt.Font font12 = valueMarker1.getLabelFont();
        java.lang.Object obj13 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        java.lang.Object obj29 = valueMarker15.clone();
        java.awt.Stroke stroke30 = valueMarker15.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker15.removeChangeListener(markerChangeListener31);
        java.awt.Paint paint33 = valueMarker15.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker15.getLabelAnchor();
        java.awt.Font font35 = valueMarker15.getLabelFont();
        java.awt.Stroke stroke36 = valueMarker15.getStroke();
        java.lang.Class<?> wildcardClass37 = valueMarker15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray38 = valueMarker1.getListeners((java.lang.Class) wildcardClass37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(rectangleAnchor34);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        double double9 = valueMarker1.getValue();
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        java.awt.Paint paint25 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        float float6 = valueMarker3.getAlpha();
        java.lang.String str7 = valueMarker3.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker3.removeChangeListener(markerChangeListener8);
        valueMarker3.setAlpha((float) 1L);
        java.lang.String str12 = valueMarker3.getLabel();
        java.awt.Stroke stroke13 = valueMarker3.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker15.notifyListeners(markerChangeEvent18);
        java.awt.Stroke stroke20 = valueMarker15.getOutlineStroke();
        valueMarker3.setStroke(stroke20);
        valueMarker1.setStroke(stroke20);
        valueMarker1.setLabel("");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        double double7 = valueMarker1.getValue();
        double double8 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(textAnchor18);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        java.lang.String str9 = valueMarker1.getLabel();
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType48 = valueMarker1.getLabelOffsetType();
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
        org.junit.Assert.assertNotNull(lengthAdjustmentType48);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        java.awt.Stroke stroke15 = valueMarker10.getStroke();
        valueMarker1.setOutlineStroke(stroke15);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        double double30 = valueMarker1.getValue();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.lang.Object obj8 = valueMarker1.clone();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker1.notifyListeners(markerChangeEvent11);
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        valueMarker1.setLabelPaint(paint10);
        java.awt.Font font12 = valueMarker1.getLabelFont();
        java.lang.Object obj13 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffsetType(lengthAdjustmentType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
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
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        java.awt.Font font38 = valueMarker1.getLabelFont();
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
        org.junit.Assert.assertNotNull(font38);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker10.removeChangeListener(markerChangeListener15);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        valueMarker1.setLabel("");
        java.awt.Paint paint12 = null;
        valueMarker1.setOutlinePaint(paint12);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.removeChangeListener(markerChangeListener16);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.lang.Object obj9 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType9);
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.lang.String str14 = valueMarker10.getLabel();
        double double15 = valueMarker10.getValue();
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker10.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor16);
        float float18 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        java.awt.Paint paint21 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke24 = valueMarker23.getStroke();
        java.lang.Object obj25 = valueMarker23.clone();
        valueMarker23.setValue((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker23.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        java.awt.Paint paint33 = valueMarker30.getPaint();
        java.awt.Stroke stroke34 = valueMarker30.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        java.awt.Paint paint39 = valueMarker36.getOutlinePaint();
        valueMarker30.setLabelPaint(paint39);
        float float41 = valueMarker30.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker30.addChangeListener(markerChangeListener42);
        java.lang.Object obj44 = valueMarker30.clone();
        java.awt.Stroke stroke45 = valueMarker30.getStroke();
        valueMarker30.setValue((double) '#');
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint50 = valueMarker49.getOutlinePaint();
        valueMarker30.setOutlinePaint(paint50);
        java.awt.Stroke stroke52 = valueMarker30.getOutlineStroke();
        valueMarker23.setOutlineStroke(stroke52);
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker57 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker57.setLabel("");
        java.awt.Paint paint60 = valueMarker57.getPaint();
        java.lang.Object obj61 = valueMarker57.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType62 = valueMarker57.getLabelOffsetType();
        valueMarker57.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener65 = null;
        valueMarker57.addChangeListener(markerChangeListener65);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener67 = null;
        valueMarker57.removeChangeListener(markerChangeListener67);
        org.jfree.chart.text.TextAnchor textAnchor69 = valueMarker57.getLabelTextAnchor();
        valueMarker55.setLabelTextAnchor(textAnchor69);
        org.jfree.chart.plot.ValueMarker valueMarker72 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets73 = valueMarker72.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor74 = valueMarker72.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets75 = valueMarker72.getLabelOffset();
        valueMarker55.setLabelOffset(rectangleInsets75);
        java.awt.Paint paint77 = valueMarker55.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker79 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker79.setLabel("");
        java.awt.Paint paint82 = valueMarker79.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener83 = null;
        valueMarker79.removeChangeListener(markerChangeListener83);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener85 = null;
        valueMarker79.addChangeListener(markerChangeListener85);
        java.awt.Paint paint87 = valueMarker79.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker89 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker89.setLabel("");
        boolean boolean92 = valueMarker79.equals((java.lang.Object) "");
        java.awt.Stroke stroke93 = valueMarker79.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker95 = new org.jfree.chart.plot.ValueMarker((double) (short) -1, paint21, stroke52, paint77, stroke93, 10.0f);
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
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.8f + "'", float41 == 0.8f);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(lengthAdjustmentType62);
        org.junit.Assert.assertNotNull(textAnchor69);
        org.junit.Assert.assertNotNull(rectangleInsets73);
        org.junit.Assert.assertNotNull(rectangleAnchor74);
        org.junit.Assert.assertNotNull(rectangleInsets75);
        org.junit.Assert.assertNotNull(paint77);
        org.junit.Assert.assertNotNull(paint82);
        org.junit.Assert.assertNotNull(paint87);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(stroke93);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.lang.String str18 = valueMarker14.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker14.getLabelOffsetType();
        valueMarker11.setLabelOffsetType(lengthAdjustmentType19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker11.addChangeListener(markerChangeListener21);
        java.awt.Paint paint23 = valueMarker11.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker11.getLabelOffsetType();
        java.awt.Paint paint25 = valueMarker11.getLabelPaint();
        valueMarker1.setOutlinePaint(paint25);
        double double27 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        double double14 = valueMarker9.getValue();
        java.awt.Paint paint15 = valueMarker9.getOutlinePaint();
        java.awt.Paint paint16 = valueMarker9.getLabelPaint();
        java.awt.Paint paint17 = valueMarker9.getPaint();
        valueMarker9.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.awt.Stroke stroke25 = valueMarker21.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getOutlinePaint();
        valueMarker21.setLabelPaint(paint30);
        float float32 = valueMarker21.getAlpha();
        valueMarker21.setLabel("");
        valueMarker21.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker21.getLabelTextAnchor();
        java.awt.Paint paint38 = valueMarker21.getOutlinePaint();
        valueMarker9.setLabelPaint(paint38);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker9.removeChangeListener(markerChangeListener40);
        java.awt.Stroke stroke42 = valueMarker9.getStroke();
        java.awt.Stroke stroke43 = valueMarker9.getOutlineStroke();
        valueMarker1.setStroke(stroke43);
        java.awt.Font font45 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(font45);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        java.lang.Class<?> wildcardClass52 = valueMarker1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue(1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        double double24 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        float float31 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.8f + "'", float31 == 0.8f);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        java.awt.Stroke stroke38 = valueMarker1.getOutlineStroke();
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
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.lang.String str9 = valueMarker5.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker5.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType10);
        java.awt.Font font12 = valueMarker1.getLabelFont();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker3.getLabelOffsetType();
        java.awt.Font font12 = valueMarker3.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker3.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker26.getLabelOffset();
        java.awt.Stroke stroke28 = valueMarker26.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke28);
        java.awt.Paint paint30 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        java.lang.Class class18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray19 = valueMarker1.getListeners(class18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker6.getLabelAnchor();
        java.lang.Class<?> wildcardClass10 = rectangleAnchor9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray11 = valueMarker1.getListeners((java.lang.Class) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.RectangleAnchor; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.awt.Stroke stroke33 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.800000011920929d + "'", double31 == 0.800000011920929d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        float float17 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        java.lang.String str34 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker38.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        valueMarker38.notifyListeners(markerChangeEvent41);
        valueMarker38.setValue((double) 0.8f);
        boolean boolean45 = valueMarker36.equals((java.lang.Object) valueMarker38);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType46 = valueMarker38.getLabelOffsetType();
        java.lang.Class<?> wildcardClass47 = valueMarker38.getClass();
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
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker1.notifyListeners(markerChangeEvent11);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint8 = valueMarker7.getPaint();
        valueMarker1.setPaint(paint8);
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        float float11 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        double double47 = valueMarker1.getValue();
        double double48 = valueMarker1.getValue();
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        java.awt.Paint paint11 = valueMarker1.getPaint();
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        java.awt.Stroke stroke19 = valueMarker14.getStroke();
        valueMarker1.setOutlineStroke(stroke19);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor7);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent47 = null;
        valueMarker1.notifyListeners(markerChangeEvent47);
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
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(textAnchor7);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        valueMarker1.setLabelTextAnchor(textAnchor48);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
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
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        double double3 = valueMarker1.getValue();
        java.lang.Object obj4 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        java.awt.Paint paint21 = valueMarker11.getPaint();
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.lang.Object obj2 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.lang.String str4 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        java.lang.Class<?> wildcardClass14 = paint13.getClass();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        double double20 = valueMarker15.getValue();
        java.awt.Paint paint21 = valueMarker15.getOutlinePaint();
        java.awt.Paint paint22 = valueMarker15.getLabelPaint();
        java.awt.Paint paint23 = valueMarker15.getPaint();
        java.lang.Object obj24 = null;
        boolean boolean25 = valueMarker15.equals(obj24);
        java.awt.Paint paint26 = valueMarker15.getPaint();
        java.awt.Stroke stroke27 = valueMarker15.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker15.addChangeListener(markerChangeListener28);
        java.awt.Paint paint30 = valueMarker15.getLabelPaint();
        java.awt.Stroke stroke31 = valueMarker15.getOutlineStroke();
        valueMarker1.setStroke(stroke31);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        java.lang.Object obj6 = valueMarker1.clone();
        valueMarker1.setLabel("");
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        java.awt.Font font14 = valueMarker1.getLabelFont();
        java.lang.Class<?> wildcardClass15 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        double double7 = valueMarker1.getValue();
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        valueMarker1.setValue((double) (short) 10);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.removeChangeListener(markerChangeListener2);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.removeChangeListener(markerChangeListener4);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.lang.Class<?> wildcardClass8 = paint7.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.awt.Stroke stroke2 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str5 = valueMarker4.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker4.addChangeListener(markerChangeListener6);
        java.awt.Font font8 = valueMarker4.getLabelFont();
        valueMarker1.setLabelFont(font8);
        valueMarker1.setLabel("");
        java.lang.Object obj12 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        valueMarker1.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font39 = valueMarker38.getLabelFont();
        java.awt.Stroke stroke40 = valueMarker38.getOutlineStroke();
        java.awt.Stroke stroke41 = valueMarker38.getOutlineStroke();
        valueMarker1.setStroke(stroke41);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor43 = valueMarker1.getLabelAnchor();
        double double44 = valueMarker1.getValue();
        java.lang.Object obj45 = valueMarker1.clone();
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
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(rectangleAnchor43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        java.awt.Stroke stroke19 = valueMarker1.getOutlineStroke();
        valueMarker1.setValue((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        valueMarker1.setStroke(stroke7);
        java.awt.Font font9 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker11.addChangeListener(markerChangeListener14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker11.removeChangeListener(markerChangeListener16);
        java.awt.Stroke stroke18 = valueMarker11.getOutlineStroke();
        boolean boolean20 = valueMarker11.equals((java.lang.Object) (short) -1);
        java.awt.Paint paint21 = valueMarker11.getOutlinePaint();
        boolean boolean22 = valueMarker1.equals((java.lang.Object) valueMarker11);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        java.awt.Stroke stroke2 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getOutlinePaint();
        valueMarker6.setLabelPaint(paint15);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker6.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker6.addChangeListener(markerChangeListener18);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker6.getLabelTextAnchor();
        valueMarker4.setLabelTextAnchor(textAnchor20);
        valueMarker1.setLabelTextAnchor(textAnchor20);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(textAnchor20);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.lang.String str17 = valueMarker13.getLabel();
        double double18 = valueMarker13.getValue();
        java.awt.Stroke stroke19 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint22 = valueMarker21.getLabelPaint();
        valueMarker13.setOutlinePaint(paint22);
        java.lang.String str24 = valueMarker13.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker13.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType25);
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(textAnchor27);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.addChangeListener(markerChangeListener11);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        java.lang.String str2 = valueMarker1.getLabel();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint8 = valueMarker7.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker7.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor9);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker1.notifyListeners(markerChangeEvent11);
        java.lang.Object obj13 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker1.setValue((double) '#');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelAnchor(rectangleAnchor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        java.lang.Object obj6 = valueMarker1.clone();
        valueMarker1.setLabel("");
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        java.lang.String str10 = valueMarker1.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textAnchor11);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        valueMarker27.notifyListeners(markerChangeEvent30);
        valueMarker27.setValue((double) 0.8f);
        boolean boolean34 = valueMarker25.equals((java.lang.Object) valueMarker27);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType35 = valueMarker27.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType35);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType35);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint9 = valueMarker8.getOutlinePaint();
        java.awt.Font font10 = valueMarker8.getLabelFont();
        valueMarker1.setLabelFont(font10);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        double double10 = valueMarker1.getValue();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font7 = valueMarker6.getLabelFont();
        java.awt.Stroke stroke8 = valueMarker6.getOutlineStroke();
        java.awt.Stroke stroke9 = valueMarker6.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke9);
        java.awt.Stroke stroke11 = null;
        valueMarker1.setOutlineStroke(stroke11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        java.awt.Stroke stroke36 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke36);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker1.getLabelOffsetType();
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
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.lang.String str6 = valueMarker2.getLabel();
        java.awt.Paint paint7 = valueMarker2.getLabelPaint();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker10.addChangeListener(markerChangeListener13);
        double double15 = valueMarker10.getValue();
        java.awt.Paint paint16 = valueMarker10.getLabelPaint();
        java.awt.Paint paint17 = valueMarker10.getOutlinePaint();
        java.awt.Stroke stroke18 = valueMarker10.getOutlineStroke();
        java.awt.Stroke stroke19 = valueMarker10.getOutlineStroke();
        java.awt.Paint paint20 = valueMarker10.getOutlinePaint();
        java.awt.Paint paint21 = valueMarker10.getOutlinePaint();
        valueMarker2.setLabelPaint(paint21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker24.addChangeListener(markerChangeListener29);
        valueMarker24.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor33 = valueMarker24.getLabelTextAnchor();
        java.lang.String str34 = valueMarker24.getLabel();
        java.awt.Stroke stroke35 = valueMarker24.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType40 = valueMarker37.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType41 = valueMarker37.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker37.addChangeListener(markerChangeListener42);
        valueMarker37.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener46 = null;
        valueMarker37.addChangeListener(markerChangeListener46);
        valueMarker37.setValue((double) (-1L));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType50 = valueMarker37.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setLabel("");
        java.awt.Paint paint55 = valueMarker52.getOutlinePaint();
        java.awt.Paint paint56 = valueMarker52.getOutlinePaint();
        java.awt.Paint paint57 = valueMarker52.getOutlinePaint();
        valueMarker37.setPaint(paint57);
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker60.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener63 = null;
        valueMarker60.addChangeListener(markerChangeListener63);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener65 = null;
        valueMarker60.removeChangeListener(markerChangeListener65);
        java.awt.Stroke stroke67 = valueMarker60.getOutlineStroke();
        boolean boolean69 = valueMarker60.equals((java.lang.Object) (short) -1);
        boolean boolean71 = valueMarker60.equals((java.lang.Object) 10);
        java.awt.Stroke stroke72 = valueMarker60.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker74 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100, paint21, stroke35, paint57, stroke72, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(textAnchor33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(lengthAdjustmentType40);
        org.junit.Assert.assertNotNull(lengthAdjustmentType41);
        org.junit.Assert.assertNotNull(lengthAdjustmentType50);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(stroke67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(stroke72);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        valueMarker1.setLabel("hi!");
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        valueMarker1.setAlpha(0.8f);
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
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        float float8 = valueMarker1.getAlpha();
        valueMarker1.setLabel("");
        java.lang.Object obj11 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker19.notifyListeners(markerChangeEvent22);
        valueMarker19.setValue((double) 0.8f);
        boolean boolean26 = valueMarker17.equals((java.lang.Object) valueMarker19);
        java.awt.Stroke stroke27 = valueMarker19.getStroke();
        valueMarker1.setOutlineStroke(stroke27);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker1.notifyListeners(markerChangeEvent29);
        java.awt.Paint paint31 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker1.notifyListeners(markerChangeEvent14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Font font8 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke9 = valueMarker1.getStroke();
        java.lang.Object obj10 = valueMarker1.clone();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        valueMarker1.setValue((double) 10.0f);
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint12, stroke18);
        float float20 = valueMarker19.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker19.getLabelTextAnchor();
        java.lang.String str22 = valueMarker19.getLabel();
        valueMarker19.setValue((double) 0.0f);
        java.awt.Paint paint25 = valueMarker19.getLabelPaint();
        boolean boolean26 = valueMarker1.equals((java.lang.Object) valueMarker19);
        java.lang.String str27 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.lang.Object obj10 = valueMarker1.clone();
        double double11 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke9 = valueMarker1.getStroke();
        java.awt.Paint paint10 = valueMarker1.getPaint();
        double double11 = valueMarker1.getValue();
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
        java.awt.Stroke stroke27 = valueMarker13.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker13.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker13.removeChangeListener(markerChangeListener29);
        org.jfree.chart.text.TextAnchor textAnchor31 = valueMarker13.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor31);
        java.lang.Object obj33 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(textAnchor28);
        org.junit.Assert.assertNotNull(textAnchor31);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker3.addChangeListener(markerChangeListener8);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker3.addChangeListener(markerChangeListener12);
        valueMarker3.setValue((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getPaint();
        java.lang.String str21 = valueMarker17.getLabel();
        double double22 = valueMarker17.getValue();
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker17.getLabelTextAnchor();
        valueMarker3.setLabelTextAnchor(textAnchor23);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker3.removeChangeListener(markerChangeListener25);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker28.getLabelOffset();
        java.awt.Stroke stroke30 = valueMarker28.getOutlineStroke();
        valueMarker3.setOutlineStroke(stroke30);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker(52.0d, paint1, stroke30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        float float24 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker4.addChangeListener(markerChangeListener7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker4.removeChangeListener(markerChangeListener9);
        java.awt.Stroke stroke11 = valueMarker4.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str14 = valueMarker13.getLabel();
        java.awt.Paint paint15 = valueMarker13.getLabelPaint();
        valueMarker4.setLabelPaint(paint15);
        boolean boolean17 = valueMarker1.equals((java.lang.Object) valueMarker4);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker19.addChangeListener(markerChangeListener22);
        double double24 = valueMarker19.getValue();
        java.awt.Paint paint25 = valueMarker19.getOutlinePaint();
        java.awt.Paint paint26 = valueMarker19.getLabelPaint();
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker19.notifyListeners(markerChangeEvent29);
        java.lang.String str31 = valueMarker19.getLabel();
        java.lang.Class<?> wildcardClass32 = valueMarker19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray33 = valueMarker4.getListeners((java.lang.Class) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font8 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font11 = valueMarker10.getLabelFont();
        java.awt.Stroke stroke12 = valueMarker10.getOutlineStroke();
        java.awt.Stroke stroke13 = valueMarker10.getOutlineStroke();
        valueMarker10.setLabel("");
        java.awt.Paint paint16 = valueMarker10.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getPaint();
        java.lang.String str22 = valueMarker18.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint25 = valueMarker24.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker24.getLabelAnchor();
        valueMarker18.setLabelAnchor(rectangleAnchor26);
        java.awt.Stroke stroke28 = valueMarker18.getStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker18.notifyListeners(markerChangeEvent29);
        java.awt.Font font31 = valueMarker18.getLabelFont();
        valueMarker10.setLabelFont(font31);
        java.awt.Paint paint33 = valueMarker10.getOutlinePaint();
        valueMarker1.setLabelPaint(paint33);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleAnchor26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.lang.Object obj2 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.lang.String str20 = valueMarker16.getLabel();
        double double21 = valueMarker16.getValue();
        java.awt.Stroke stroke22 = valueMarker16.getOutlineStroke();
        boolean boolean23 = valueMarker1.equals((java.lang.Object) valueMarker16);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint27 = valueMarker26.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setLabel("");
        java.awt.Paint paint32 = valueMarker29.getPaint();
        java.awt.Stroke stroke33 = valueMarker29.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint27, stroke33);
        float float35 = valueMarker34.getAlpha();
        java.lang.Class<?> wildcardClass36 = valueMarker34.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray37 = valueMarker16.getListeners((java.lang.Class) wildcardClass36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        valueMarker1.setAlpha((float) (byte) 1);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.awt.Font font15 = valueMarker8.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        java.awt.Stroke stroke21 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        float float5 = valueMarker1.getAlpha();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        double double14 = valueMarker9.getValue();
        java.awt.Paint paint15 = valueMarker9.getOutlinePaint();
        java.awt.Paint paint16 = valueMarker9.getLabelPaint();
        valueMarker9.setLabel("");
        valueMarker9.setAlpha(0.0f);
        java.awt.Paint paint21 = valueMarker9.getLabelPaint();
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker9.notifyListeners(markerChangeEvent24);
        java.lang.Class<?> wildcardClass26 = valueMarker9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray27 = valueMarker1.getListeners((java.lang.Class) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker1.getLabelOffset();
        float float14 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        valueMarker1.setAlpha(0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.addChangeListener(markerChangeListener20);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        java.lang.Object obj4 = valueMarker1.clone();
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
        valueMarker6.setLabel("hi!");
        valueMarker6.setAlpha(1.0f);
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker6.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor24);
        java.lang.String str26 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        java.lang.Class<?> wildcardClass18 = valueMarker13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray19 = valueMarker1.getListeners((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        java.awt.Font font16 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.lang.String str14 = valueMarker10.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker10.getLabelOffsetType();
        valueMarker10.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        java.lang.Object obj23 = valueMarker19.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker19.getLabelOffsetType();
        valueMarker19.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker19.addChangeListener(markerChangeListener27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker19.getLabelOffset();
        valueMarker10.setLabelOffset(rectangleInsets29);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker10.notifyListeners(markerChangeEvent31);
        java.awt.Paint paint33 = valueMarker10.getPaint();
        valueMarker1.setPaint(paint33);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        java.awt.Paint paint39 = valueMarker36.getOutlinePaint();
        java.awt.Paint paint40 = valueMarker36.getOutlinePaint();
        java.awt.Paint paint41 = valueMarker36.getOutlinePaint();
        java.lang.Class<?> wildcardClass42 = paint41.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray43 = valueMarker1.getListeners((java.lang.Class) wildcardClass42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker7.notifyListeners(markerChangeEvent10);
        java.awt.Stroke stroke12 = valueMarker7.getStroke();
        java.lang.Object obj13 = valueMarker7.clone();
        java.awt.Paint paint14 = valueMarker7.getLabelPaint();
        java.lang.String str15 = valueMarker7.getLabel();
        java.lang.Class<?> wildcardClass16 = valueMarker7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray17 = valueMarker1.getListeners((java.lang.Class) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.lang.Object obj2 = valueMarker1.clone();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker1.notifyListeners(markerChangeEvent5);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        java.awt.Stroke stroke23 = valueMarker1.getStroke();
        double double24 = valueMarker1.getValue();
        valueMarker1.setValue((double) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        java.awt.Stroke stroke7 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint10 = valueMarker9.getLabelPaint();
        valueMarker1.setOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
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
        java.awt.Paint paint30 = valueMarker12.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint30);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(stroke2);
    }
}

