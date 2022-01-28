import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.awt.Stroke stroke6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) -1, paint5, stroke6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffsetType(lengthAdjustmentType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffsetType(lengthAdjustmentType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getOutlinePaint();
        java.awt.Stroke stroke6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1, paint5, stroke6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        float float10 = valueMarker7.getAlpha();
        java.lang.String str11 = valueMarker7.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        valueMarker7.setStroke(stroke17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        java.awt.Paint paint28 = valueMarker25.getPaint();
        java.awt.Stroke stroke29 = valueMarker25.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 0L, paint5, stroke17, paint23, stroke29, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffset(rectangleInsets6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.lang.Class<?> wildcardClass12 = valueMarker8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray13 = valueMarker1.getListeners((java.lang.Class) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.lang.String str6 = valueMarker2.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        valueMarker2.setLabelPaint(paint11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        java.awt.Paint paint19 = null;
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        float float24 = valueMarker21.getAlpha();
        java.lang.String str25 = valueMarker21.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getPaint();
        java.awt.Stroke stroke31 = valueMarker27.getOutlineStroke();
        valueMarker21.setStroke(stroke31);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10L, paint11, stroke18, paint19, stroke31, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelAnchor(rectangleAnchor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.lang.Class<?> wildcardClass11 = valueMarker7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray12 = valueMarker1.getListeners((java.lang.Class) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        java.lang.Object obj6 = valueMarker1.clone();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        float float11 = valueMarker10.getAlpha();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker10.setAlpha((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
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
        java.lang.Object obj32 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.Class<?> wildcardClass8 = valueMarker4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray9 = valueMarker1.getListeners((java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.lang.String str12 = valueMarker8.getLabel();
        double double13 = valueMarker8.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        float float18 = valueMarker15.getAlpha();
        java.awt.Stroke stroke19 = valueMarker15.getOutlineStroke();
        boolean boolean20 = valueMarker8.equals((java.lang.Object) valueMarker15);
        boolean boolean21 = valueMarker1.equals((java.lang.Object) valueMarker8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelAnchor(rectangleAnchor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.lang.String str7 = valueMarker3.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker3.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker13.notifyListeners(markerChangeEvent16);
        valueMarker13.setValue((double) 0.8f);
        boolean boolean20 = valueMarker11.equals((java.lang.Object) valueMarker13);
        java.awt.Stroke stroke21 = valueMarker13.getStroke();
        valueMarker3.setOutlineStroke(stroke21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) '#', paint1, stroke21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffsetType(lengthAdjustmentType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        valueMarker2.setPaint(paint11);
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
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor33 = valueMarker30.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        java.awt.Paint paint38 = valueMarker35.getPaint();
        java.awt.Stroke stroke39 = valueMarker35.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getOutlinePaint();
        valueMarker35.setLabelPaint(paint44);
        float float46 = valueMarker35.getAlpha();
        valueMarker35.setValue((double) (byte) 0);
        java.lang.String str49 = valueMarker35.getLabel();
        java.awt.Paint paint50 = valueMarker35.getPaint();
        valueMarker30.setOutlinePaint(paint50);
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker53.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener56 = null;
        valueMarker53.addChangeListener(markerChangeListener56);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener58 = null;
        valueMarker53.removeChangeListener(markerChangeListener58);
        java.awt.Stroke stroke60 = valueMarker53.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint11, stroke28, paint50, stroke60, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(textAnchor33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.8f + "'", float46 == 0.8f);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(stroke60);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelAnchor(rectangleAnchor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker9.notifyListeners(markerChangeEvent12);
        valueMarker9.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getPaint();
        java.awt.Stroke stroke21 = valueMarker17.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getOutlinePaint();
        valueMarker17.setLabelPaint(paint26);
        float float28 = valueMarker17.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker17.addChangeListener(markerChangeListener29);
        java.awt.Stroke stroke31 = valueMarker17.getOutlineStroke();
        valueMarker9.setStroke(stroke31);
        valueMarker3.setStroke(stroke31);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor38 = valueMarker35.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        java.awt.Paint paint43 = valueMarker40.getPaint();
        java.awt.Stroke stroke44 = valueMarker40.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker46.setLabel("");
        java.awt.Paint paint49 = valueMarker46.getOutlinePaint();
        valueMarker40.setLabelPaint(paint49);
        float float51 = valueMarker40.getAlpha();
        valueMarker40.setValue((double) (byte) 0);
        java.lang.String str54 = valueMarker40.getLabel();
        java.awt.Paint paint55 = valueMarker40.getPaint();
        valueMarker35.setOutlinePaint(paint55);
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker58.setLabel("");
        java.awt.Paint paint61 = valueMarker58.getPaint();
        java.lang.String str62 = valueMarker58.getLabel();
        double double63 = valueMarker58.getValue();
        java.awt.Stroke stroke64 = valueMarker58.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker66 = new org.jfree.chart.plot.ValueMarker((double) 10, paint1, stroke31, paint55, stroke64, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.8f + "'", float28 == 0.8f);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(textAnchor38);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.8f + "'", float51 == 0.8f);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertNotNull(stroke64);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        java.awt.Paint paint10 = valueMarker2.getPaint();
        java.awt.Stroke stroke11 = null;
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        java.awt.Paint paint19 = valueMarker13.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker13.getLabelPaint();
        java.awt.Paint paint21 = valueMarker13.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getPaint();
        java.awt.Stroke stroke27 = valueMarker23.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1, paint10, stroke11, paint21, stroke27, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        java.awt.Paint paint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha(10.0f);
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
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.lang.String str7 = valueMarker3.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker3.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker13.notifyListeners(markerChangeEvent16);
        valueMarker13.setValue((double) 0.8f);
        boolean boolean20 = valueMarker11.equals((java.lang.Object) valueMarker13);
        java.awt.Stroke stroke21 = valueMarker13.getStroke();
        valueMarker3.setOutlineStroke(stroke21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100, paint1, stroke21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        java.awt.Stroke stroke11 = valueMarker3.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker3.setAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.lang.Object obj7 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint11 = valueMarker10.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint11, stroke17);
        float float19 = valueMarker18.getAlpha();
        java.lang.Class<?> wildcardClass20 = valueMarker18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray21 = valueMarker1.getListeners((java.lang.Class) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.lang.Class<?> wildcardClass16 = valueMarker12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray17 = valueMarker1.getListeners((java.lang.Class) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        java.lang.Class<?> wildcardClass14 = valueMarker9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray15 = valueMarker1.getListeners((java.lang.Class) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        java.lang.Class<?> wildcardClass11 = stroke9.getClass();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Font font8 = valueMarker1.getLabelFont();
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker10.getLabelOffsetType();
        java.lang.Class<?> wildcardClass25 = lengthAdjustmentType24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray26 = valueMarker1.getListeners((java.lang.Class) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffsetType(lengthAdjustmentType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker14.notifyListeners(markerChangeEvent17);
        java.awt.Stroke stroke19 = valueMarker14.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker14.getLabelOffsetType();
        java.lang.Class<?> wildcardClass21 = lengthAdjustmentType20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray22 = valueMarker1.getListeners((java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker19.removeChangeListener(markerChangeListener23);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker19.addChangeListener(markerChangeListener25);
        java.awt.Paint paint27 = valueMarker19.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setLabel("");
        boolean boolean32 = valueMarker19.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass33 = valueMarker19.getClass();
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
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        java.awt.Paint paint23 = valueMarker22.getPaint();
        valueMarker1.setLabelPaint(paint23);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        java.awt.Paint paint16 = valueMarker1.getPaint();
        java.lang.Object obj17 = null;
        boolean boolean18 = valueMarker1.equals(obj17);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.awt.Paint paint3 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke6 = valueMarker5.getStroke();
        valueMarker1.setStroke(stroke6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker9.getLabelTextAnchor();
        java.lang.Class<?> wildcardClass13 = valueMarker9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray14 = valueMarker1.getListeners((java.lang.Class) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 100L);
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
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '#');
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        float float11 = valueMarker10.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker10.getLabelTextAnchor();
        double double13 = valueMarker10.getValue();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelAnchor(rectangleAnchor2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        float float8 = valueMarker1.getAlpha();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getOutlinePaint();
        valueMarker11.setLabelPaint(paint18);
        java.lang.Class<?> wildcardClass20 = paint18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray21 = valueMarker1.getListeners((java.lang.Class) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        float float19 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType9);
        float float11 = valueMarker1.getAlpha();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker10.notifyListeners(markerChangeEvent16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker9.notifyListeners(markerChangeEvent12);
        java.awt.Stroke stroke14 = valueMarker9.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker9.getLabelOffsetType();
        java.lang.Class<?> wildcardClass16 = lengthAdjustmentType15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray17 = valueMarker1.getListeners((java.lang.Class) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker4.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        java.awt.Font font14 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker9.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets10);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffset(rectangleInsets16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker2.removeChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker2.addChangeListener(markerChangeListener8);
        java.awt.Paint paint10 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        boolean boolean15 = valueMarker2.equals((java.lang.Object) "");
        java.awt.Paint paint16 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getPaint();
        java.awt.Stroke stroke22 = valueMarker18.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getOutlinePaint();
        valueMarker18.setLabelPaint(paint27);
        float float29 = valueMarker18.getAlpha();
        valueMarker18.setLabel("");
        java.awt.Paint paint32 = valueMarker18.getOutlinePaint();
        java.awt.Stroke stroke33 = valueMarker18.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker35.addChangeListener(markerChangeListener38);
        double double40 = valueMarker35.getValue();
        java.awt.Paint paint41 = valueMarker35.getOutlinePaint();
        java.awt.Paint paint42 = valueMarker35.getLabelPaint();
        java.awt.Paint paint43 = valueMarker35.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker45.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        valueMarker45.notifyListeners(markerChangeEvent48);
        java.awt.Stroke stroke50 = valueMarker45.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 100, paint16, stroke33, paint43, stroke50, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.8f + "'", float29 == 0.8f);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke50);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        java.lang.Object obj15 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.awt.Paint paint1 = null;
        java.awt.Stroke stroke2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint1, stroke2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        double double16 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor9);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        java.lang.Object obj13 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        valueMarker1.setValue((double) (short) 10);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker1.removeChangeListener(markerChangeListener19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        java.lang.String str29 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.awt.Stroke stroke6 = valueMarker2.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getOutlinePaint();
        valueMarker2.setLabelPaint(paint11);
        float float13 = valueMarker2.getAlpha();
        valueMarker2.setLabel("");
        java.awt.Paint paint16 = valueMarker2.getOutlinePaint();
        java.awt.Stroke stroke17 = null;
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        java.awt.Paint paint21 = valueMarker19.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        valueMarker23.notifyListeners(markerChangeEvent26);
        java.awt.Stroke stroke28 = valueMarker23.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker23.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        java.awt.Paint paint34 = valueMarker31.getPaint();
        java.awt.Stroke stroke35 = valueMarker31.getOutlineStroke();
        java.awt.Stroke stroke36 = valueMarker31.getStroke();
        valueMarker23.setStroke(stroke36);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint16, stroke17, paint21, stroke36, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(stroke36);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        java.lang.Object obj16 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffsetType(lengthAdjustmentType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Stroke stroke7 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setStroke(stroke7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Font font10 = valueMarker7.getLabelFont();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke11);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke3 = valueMarker2.getStroke();
        java.awt.Paint paint4 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        float float9 = valueMarker6.getAlpha();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint4, stroke10);
        java.awt.Paint paint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker11.setPaint(paint12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.String str8 = valueMarker4.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType9);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.addChangeListener(markerChangeListener11);
        java.awt.Paint paint13 = valueMarker1.getPaint();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.lang.String str6 = valueMarker2.getLabel();
        double double7 = valueMarker2.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker2.getLabelOffsetType();
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker11.notifyListeners(markerChangeEvent14);
        java.awt.Stroke stroke16 = valueMarker11.getStroke();
        java.awt.Paint paint17 = null;
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        java.lang.Object obj23 = valueMarker19.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker19.getLabelOffsetType();
        valueMarker19.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker19.addChangeListener(markerChangeListener27);
        java.lang.String str29 = valueMarker19.getLabel();
        java.awt.Stroke stroke30 = valueMarker19.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker(0.0d, paint9, stroke16, paint17, stroke30, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        java.awt.Stroke stroke22 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        java.awt.Paint paint16 = valueMarker1.getPaint();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        java.awt.Paint paint9 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.awt.Stroke stroke19 = valueMarker15.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint13, stroke19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Font font25 = valueMarker22.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker22.addChangeListener(markerChangeListener26);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setLabel("");
        java.awt.Paint paint32 = valueMarker29.getPaint();
        valueMarker22.setOutlinePaint(paint32);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        float float38 = valueMarker35.getAlpha();
        java.lang.String str39 = valueMarker35.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke42 = valueMarker41.getStroke();
        valueMarker35.setStroke(stroke42);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint9, stroke19, paint32, stroke42, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.8f + "'", float38 == 0.8f);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint3 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        java.awt.Paint paint8 = valueMarker6.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        float float13 = valueMarker10.getAlpha();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint8, stroke14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker19.notifyListeners(markerChangeEvent22);
        valueMarker19.setValue((double) 0.8f);
        boolean boolean26 = valueMarker17.equals((java.lang.Object) valueMarker19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker19.addChangeListener(markerChangeListener27);
        java.awt.Paint paint29 = valueMarker19.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        java.awt.Paint paint34 = valueMarker31.getPaint();
        java.lang.String str35 = valueMarker31.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        valueMarker31.notifyListeners(markerChangeEvent36);
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = valueMarker39.getLabelOffset();
        valueMarker31.setLabelOffset(rectangleInsets40);
        java.awt.Stroke stroke42 = valueMarker31.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint3, stroke14, paint29, stroke42, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        valueMarker1.setValue((double) (short) 100);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        valueMarker1.notifyListeners(markerChangeEvent18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker3.setAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        java.awt.Font font20 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelFont(font20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        float float8 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        valueMarker2.setPaint(paint11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker14.addChangeListener(markerChangeListener17);
        double double19 = valueMarker14.getValue();
        java.awt.Paint paint20 = valueMarker14.getOutlinePaint();
        java.awt.Paint paint21 = valueMarker14.getLabelPaint();
        valueMarker14.setLabel("");
        valueMarker14.setValue((double) 10L);
        java.awt.Stroke stroke26 = valueMarker14.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str29 = valueMarker28.getLabel();
        java.awt.Paint paint30 = valueMarker28.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        java.awt.Paint paint40 = valueMarker37.getOutlinePaint();
        valueMarker33.setLabelPaint(paint40);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke44 = valueMarker43.getStroke();
        java.awt.Paint paint45 = valueMarker43.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke48 = valueMarker47.getStroke();
        valueMarker43.setStroke(stroke48);
        org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) 0.8f, paint40, stroke48);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10, paint11, stroke26, paint30, stroke48, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        float float15 = valueMarker12.getAlpha();
        java.awt.Stroke stroke16 = valueMarker12.getOutlineStroke();
        java.lang.Class<?> wildcardClass17 = stroke16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray18 = valueMarker1.getListeners((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.BasicStroke; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker12.getLabelTextAnchor();
        java.lang.Class<?> wildcardClass16 = valueMarker12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray17 = valueMarker10.getListeners((java.lang.Class) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener46 = null;
        valueMarker15.removeChangeListener(markerChangeListener46);
        java.lang.Class<?> wildcardClass48 = valueMarker15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray49 = valueMarker1.getListeners((java.lang.Class) wildcardClass48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker1.notifyListeners(markerChangeEvent15);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        java.awt.Font font9 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getOutlinePaint();
        valueMarker24.setLabelPaint(paint31);
        java.awt.Stroke stroke33 = valueMarker24.getStroke();
        java.awt.Paint paint34 = valueMarker24.getLabelPaint();
        valueMarker22.setLabelPaint(paint34);
        java.lang.Class<?> wildcardClass36 = paint34.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray37 = valueMarker1.getListeners((java.lang.Class) wildcardClass36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        java.awt.Font font21 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker32.setLabel("");
        java.awt.Paint paint35 = valueMarker32.getOutlinePaint();
        valueMarker28.setLabelPaint(paint35);
        java.awt.Stroke stroke37 = valueMarker28.getStroke();
        java.awt.Paint paint38 = valueMarker28.getLabelPaint();
        valueMarker26.setLabelPaint(paint38);
        java.lang.Class<?> wildcardClass40 = paint38.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray41 = valueMarker1.getListeners((java.lang.Class) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker10.notifyListeners(markerChangeEvent25);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        float float13 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker1.notifyListeners(markerChangeEvent14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.lang.Object obj11 = valueMarker7.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray13 = valueMarker1.getListeners((java.lang.Class) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        java.awt.Paint paint24 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(textAnchor13);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker10.getLabelTextAnchor();
        float float14 = valueMarker10.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font17 = valueMarker16.getLabelFont();
        valueMarker10.setLabelFont(font17);
        java.lang.Class<?> wildcardClass19 = font17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray20 = valueMarker1.getListeners((java.lang.Class) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Font; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.lang.String str6 = valueMarker2.getLabel();
        java.awt.Paint paint7 = valueMarker2.getLabelPaint();
        java.awt.Paint paint8 = valueMarker2.getPaint();
        java.awt.Stroke stroke9 = null;
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str12 = valueMarker11.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker11.addChangeListener(markerChangeListener13);
        java.awt.Font font15 = valueMarker11.getLabelFont();
        java.awt.Paint paint16 = valueMarker11.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getPaint();
        java.lang.String str22 = valueMarker18.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker18.notifyListeners(markerChangeEvent23);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker26.getLabelOffset();
        valueMarker18.setLabelOffset(rectangleInsets27);
        java.awt.Stroke stroke29 = valueMarker18.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((-1.0d), paint8, stroke9, paint16, stroke29, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getOutlinePaint();
        java.lang.Class<?> wildcardClass21 = valueMarker17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray22 = valueMarker1.getListeners((java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) ' ');
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str22 = valueMarker21.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker21.addChangeListener(markerChangeListener23);
        java.awt.Font font25 = valueMarker21.getLabelFont();
        java.awt.Paint paint26 = valueMarker21.getOutlinePaint();
        java.lang.Class<?> wildcardClass27 = paint26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray28 = valueMarker1.getListeners((java.lang.Class) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.awt.Stroke stroke26 = valueMarker22.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint20, stroke26);
        float float28 = valueMarker27.getAlpha();
        java.lang.Class<?> wildcardClass29 = valueMarker27.getClass();
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
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        java.awt.Paint paint12 = valueMarker1.getPaint();
        java.awt.Stroke stroke13 = null;
        valueMarker1.setOutlineStroke(stroke13);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (-1));
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
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
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
        float float19 = valueMarker9.getAlpha();
        double double20 = valueMarker9.getValue();
        boolean boolean21 = valueMarker1.equals((java.lang.Object) valueMarker9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getOutlinePaint();
        valueMarker2.setLabelPaint(paint9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.awt.Stroke stroke16 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getPaint();
        java.awt.Stroke stroke22 = valueMarker18.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getOutlinePaint();
        valueMarker18.setLabelPaint(paint27);
        float float29 = valueMarker18.getAlpha();
        valueMarker18.setLabel("");
        java.awt.Paint paint32 = valueMarker18.getOutlinePaint();
        java.awt.Paint paint33 = valueMarker18.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        java.awt.Paint paint38 = valueMarker35.getPaint();
        java.awt.Stroke stroke39 = valueMarker35.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getOutlinePaint();
        valueMarker35.setLabelPaint(paint44);
        float float46 = valueMarker35.getAlpha();
        boolean boolean48 = valueMarker35.equals((java.lang.Object) 10.0f);
        java.awt.Stroke stroke49 = valueMarker35.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker(0.0d, paint9, stroke16, paint33, stroke49, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.8f + "'", float29 == 0.8f);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.8f + "'", float46 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        java.awt.Stroke stroke16 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getPaint();
        java.awt.Stroke stroke23 = valueMarker19.getOutlineStroke();
        boolean boolean24 = valueMarker1.equals((java.lang.Object) valueMarker19);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.lang.Class<?> wildcardClass6 = stroke5.getClass();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker20.notifyListeners(markerChangeEvent23);
        java.awt.Stroke stroke25 = valueMarker20.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint29 = valueMarker28.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker28.getLabelAnchor();
        valueMarker20.setLabelAnchor(rectangleAnchor30);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        java.awt.Paint paint36 = valueMarker33.getPaint();
        java.awt.Stroke stroke37 = valueMarker33.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker39.setLabel("");
        java.awt.Paint paint42 = valueMarker39.getOutlinePaint();
        valueMarker33.setLabelPaint(paint42);
        float float44 = valueMarker33.getAlpha();
        valueMarker33.setValue((double) (byte) 0);
        java.awt.Font font47 = valueMarker33.getLabelFont();
        valueMarker20.setLabelFont(font47);
        java.lang.Class<?> wildcardClass49 = valueMarker20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray50 = valueMarker1.getListeners((java.lang.Class) wildcardClass49);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.8f + "'", float44 == 0.8f);
        org.junit.Assert.assertNotNull(font47);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        java.awt.Paint paint10 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker12.removeChangeListener(markerChangeListener17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font21 = valueMarker20.getLabelFont();
        java.awt.Stroke stroke22 = valueMarker20.getOutlineStroke();
        valueMarker12.setOutlineStroke(stroke22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        java.awt.Paint paint28 = valueMarker25.getPaint();
        java.awt.Stroke stroke29 = valueMarker25.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        java.awt.Paint paint34 = valueMarker31.getOutlinePaint();
        valueMarker25.setLabelPaint(paint34);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker37.addChangeListener(markerChangeListener40);
        double double42 = valueMarker37.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker46.setLabel("");
        java.awt.Paint paint49 = valueMarker46.getPaint();
        java.awt.Stroke stroke50 = valueMarker46.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker52.setLabel("");
        java.awt.Paint paint55 = valueMarker52.getOutlinePaint();
        valueMarker46.setLabelPaint(paint55);
        float float57 = valueMarker46.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener58 = null;
        valueMarker46.addChangeListener(markerChangeListener58);
        java.awt.Stroke stroke60 = valueMarker46.getOutlineStroke();
        valueMarker44.setOutlineStroke(stroke60);
        valueMarker37.setStroke(stroke60);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker64 = new org.jfree.chart.plot.ValueMarker((double) (short) -1, paint10, stroke22, paint34, stroke60, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.8f + "'", float57 == 0.8f);
        org.junit.Assert.assertNotNull(stroke60);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker1.notifyListeners(markerChangeEvent23);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.awt.Stroke stroke12 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint6, stroke12);
        float float14 = valueMarker13.getAlpha();
        java.lang.Class<?> wildcardClass15 = valueMarker13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray16 = valueMarker1.getListeners((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.awt.Stroke stroke7 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getOutlinePaint();
        valueMarker3.setLabelPaint(paint12);
        double double14 = valueMarker3.getValue();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker3.getLabelTextAnchor();
        java.lang.Class<?> wildcardClass16 = valueMarker3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray17 = valueMarker1.getListeners((java.lang.Class) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        java.lang.String str11 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker10.getLabelOffset();
        java.awt.Stroke stroke12 = valueMarker10.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke12);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        valueMarker10.setValue((double) 10);
        java.awt.Stroke stroke13 = valueMarker10.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker10.setAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.lang.String str6 = valueMarker2.getLabel();
        java.awt.Paint paint7 = valueMarker2.getLabelPaint();
        java.lang.Object obj8 = valueMarker2.clone();
        java.awt.Paint paint9 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker11.addChangeListener(markerChangeListener14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker11.removeChangeListener(markerChangeListener16);
        java.awt.Stroke stroke18 = valueMarker11.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        float float23 = valueMarker20.getAlpha();
        java.lang.String str24 = valueMarker20.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        java.awt.Paint paint29 = valueMarker26.getPaint();
        java.awt.Stroke stroke30 = valueMarker26.getOutlineStroke();
        valueMarker20.setStroke(stroke30);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker20.removeChangeListener(markerChangeListener32);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker20.addChangeListener(markerChangeListener34);
        valueMarker20.setValue((double) '#');
        java.awt.Paint paint38 = valueMarker20.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        java.awt.Paint paint43 = valueMarker40.getOutlinePaint();
        java.awt.Paint paint44 = valueMarker40.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker46.setLabel("");
        java.awt.Font font49 = valueMarker46.getLabelFont();
        valueMarker40.setLabelFont(font49);
        java.awt.Stroke stroke51 = valueMarker40.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) (byte) 0, paint9, stroke18, paint38, stroke51, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNotNull(stroke51);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker4.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType8);
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.addChangeListener(markerChangeListener11);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker1.notifyListeners(markerChangeEvent24);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker22.addChangeListener(markerChangeListener25);
        java.lang.Class<?> wildcardClass27 = valueMarker22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray28 = valueMarker1.getListeners((java.lang.Class) wildcardClass27);
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        valueMarker8.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        float float29 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.8f + "'", float29 == 0.8f);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker28.addChangeListener(markerChangeListener31);
        double double33 = valueMarker28.getValue();
        java.awt.Paint paint34 = valueMarker28.getOutlinePaint();
        java.awt.Paint paint35 = valueMarker28.getLabelPaint();
        java.awt.Paint paint36 = valueMarker28.getPaint();
        valueMarker28.setLabel("hi!");
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
        valueMarker40.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor56 = valueMarker40.getLabelTextAnchor();
        java.awt.Paint paint57 = valueMarker40.getOutlinePaint();
        valueMarker28.setLabelPaint(paint57);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener59 = null;
        valueMarker28.removeChangeListener(markerChangeListener59);
        java.lang.Class<?> wildcardClass61 = valueMarker28.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray62 = valueMarker1.getListeners((java.lang.Class) wildcardClass61);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.8f + "'", float51 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getOutlinePaint();
        java.awt.Paint paint10 = valueMarker6.getOutlinePaint();
        valueMarker1.setPaint(paint10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 100);
        java.lang.Class<?> wildcardClass14 = valueMarker13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray15 = valueMarker1.getListeners((java.lang.Class) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        java.lang.Object obj6 = valueMarker1.clone();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(textAnchor9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        java.lang.Class class6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray7 = valueMarker1.getListeners(class6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker10.setAlpha((float) 100L);
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        java.lang.String str21 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        java.lang.String str17 = valueMarker1.getLabel();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.lang.String str7 = valueMarker3.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker3.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker13.notifyListeners(markerChangeEvent16);
        valueMarker13.setValue((double) 0.8f);
        boolean boolean20 = valueMarker11.equals((java.lang.Object) valueMarker13);
        java.awt.Stroke stroke21 = valueMarker13.getStroke();
        valueMarker3.setOutlineStroke(stroke21);
        valueMarker1.setOutlineStroke(stroke21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.removeChangeListener(markerChangeListener24);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        java.awt.Paint paint15 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
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
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getPaint();
        java.awt.Stroke stroke28 = valueMarker24.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        java.awt.Paint paint33 = valueMarker30.getOutlinePaint();
        valueMarker24.setLabelPaint(paint33);
        float float35 = valueMarker24.getAlpha();
        valueMarker24.setValue((double) (byte) 0);
        java.awt.Font font38 = valueMarker24.getLabelFont();
        valueMarker11.setLabelFont(font38);
        java.lang.Class<?> wildcardClass40 = valueMarker11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray41 = valueMarker1.getListeners((java.lang.Class) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.8f + "'", float35 == 0.8f);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker13.notifyListeners(markerChangeEvent16);
        valueMarker13.setValue((double) 0.8f);
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
        java.awt.Stroke stroke35 = valueMarker21.getOutlineStroke();
        valueMarker13.setStroke(stroke35);
        valueMarker7.setStroke(stroke35);
        boolean boolean38 = valueMarker1.equals((java.lang.Object) valueMarker7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        double double13 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Font font23 = valueMarker20.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker20.addChangeListener(markerChangeListener24);
        java.lang.Class<?> wildcardClass26 = valueMarker20.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        double double16 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker23.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker23.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker23.addChangeListener(markerChangeListener28);
        valueMarker23.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker23.addChangeListener(markerChangeListener32);
        valueMarker23.setValue((double) (-1L));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType36 = valueMarker23.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType36);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType36);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor10);
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor13);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        java.awt.Stroke stroke19 = valueMarker15.getOutlineStroke();
        java.awt.Font font20 = valueMarker15.getLabelFont();
        valueMarker1.setLabelFont(font20);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        java.lang.String str10 = valueMarker1.getLabel();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker12.addChangeListener(markerChangeListener17);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker12.addChangeListener(markerChangeListener21);
        valueMarker12.setValue((double) (-1L));
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker12.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType25);
        java.awt.Paint paint27 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker12.removeChangeListener(markerChangeListener17);
        java.awt.Stroke stroke19 = valueMarker12.getOutlineStroke();
        java.lang.Class<?> wildcardClass20 = valueMarker12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray21 = valueMarker1.getListeners((java.lang.Class) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.lang.Object obj8 = valueMarker1.clone();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        double double22 = valueMarker1.getValue();
        java.awt.Stroke stroke23 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.awt.Font font5 = valueMarker1.getLabelFont();
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        java.awt.Paint paint20 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        java.lang.Class class15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray16 = valueMarker1.getListeners(class15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker19.notifyListeners(markerChangeEvent22);
        java.awt.Stroke stroke24 = valueMarker19.getStroke();
        java.lang.Object obj25 = valueMarker19.clone();
        java.awt.Stroke stroke26 = valueMarker19.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getOutlinePaint();
        java.awt.Paint paint32 = valueMarker28.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        valueMarker34.notifyListeners(markerChangeEvent37);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        valueMarker34.notifyListeners(markerChangeEvent39);
        java.awt.Font font41 = valueMarker34.getLabelFont();
        java.awt.Stroke stroke42 = valueMarker34.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint17, stroke26, paint32, stroke42, 10.0f);
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
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(font41);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.awt.Stroke stroke4 = valueMarker3.getOutlineStroke();
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
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke24 = valueMarker23.getStroke();
        java.lang.Object obj25 = valueMarker23.clone();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getPaint();
        java.awt.Stroke stroke31 = valueMarker27.getOutlineStroke();
        java.awt.Stroke stroke32 = valueMarker27.getStroke();
        valueMarker23.setOutlineStroke(stroke32);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10, paint1, stroke4, paint21, stroke32, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker22.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker22.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker28.notifyListeners(markerChangeEvent31);
        valueMarker28.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        java.awt.Paint paint39 = valueMarker36.getPaint();
        java.awt.Stroke stroke40 = valueMarker36.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker42.setLabel("");
        java.awt.Paint paint45 = valueMarker42.getOutlinePaint();
        valueMarker36.setLabelPaint(paint45);
        float float47 = valueMarker36.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener48 = null;
        valueMarker36.addChangeListener(markerChangeListener48);
        java.awt.Stroke stroke50 = valueMarker36.getOutlineStroke();
        valueMarker28.setStroke(stroke50);
        valueMarker22.setStroke(stroke50);
        java.awt.Stroke stroke53 = valueMarker22.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker55.setLabel("");
        java.awt.Paint paint58 = valueMarker55.getPaint();
        java.awt.Stroke stroke59 = valueMarker55.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker61.setLabel("");
        java.awt.Paint paint64 = valueMarker61.getOutlinePaint();
        valueMarker55.setLabelPaint(paint64);
        float float66 = valueMarker55.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener67 = null;
        valueMarker55.addChangeListener(markerChangeListener67);
        java.lang.Object obj69 = valueMarker55.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent70 = null;
        valueMarker55.notifyListeners(markerChangeEvent70);
        java.awt.Paint paint72 = valueMarker55.getOutlinePaint();
        java.awt.Paint paint73 = valueMarker55.getLabelPaint();
        java.awt.Paint paint74 = valueMarker55.getPaint();
        java.awt.Paint paint75 = valueMarker55.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker77 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker77.setLabel("");
        java.awt.Paint paint80 = valueMarker77.getPaint();
        java.lang.Object obj81 = valueMarker77.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType82 = valueMarker77.getLabelOffsetType();
        valueMarker77.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener85 = null;
        valueMarker77.addChangeListener(markerChangeListener85);
        java.lang.String str87 = valueMarker77.getLabel();
        java.awt.Stroke stroke88 = valueMarker77.getOutlineStroke();
        java.awt.Stroke stroke89 = valueMarker77.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker91 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint20, stroke53, paint75, stroke89, (float) 100);
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
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.8f + "'", float47 == 0.8f);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 0.8f + "'", float66 == 0.8f);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(paint72);
        org.junit.Assert.assertNotNull(paint73);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertNotNull(paint75);
        org.junit.Assert.assertNotNull(paint80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertNotNull(lengthAdjustmentType82);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(stroke88);
        org.junit.Assert.assertNotNull(stroke89);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        double double19 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker6.notifyListeners(markerChangeEvent16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker6.getLabelTextAnchor();
        java.lang.Class<?> wildcardClass19 = valueMarker6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray20 = valueMarker1.getListeners((java.lang.Class) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.awt.Stroke stroke6 = valueMarker2.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getOutlinePaint();
        valueMarker2.setLabelPaint(paint11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        java.awt.Stroke stroke19 = valueMarker14.getStroke();
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
        float float50 = valueMarker21.getAlpha();
        java.awt.Paint paint51 = valueMarker21.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker53.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType56 = valueMarker53.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType57 = valueMarker53.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker59.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent62 = null;
        valueMarker59.notifyListeners(markerChangeEvent62);
        valueMarker59.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker67 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker67.setLabel("");
        java.awt.Paint paint70 = valueMarker67.getPaint();
        java.awt.Stroke stroke71 = valueMarker67.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker73 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker73.setLabel("");
        java.awt.Paint paint76 = valueMarker73.getOutlinePaint();
        valueMarker67.setLabelPaint(paint76);
        float float78 = valueMarker67.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener79 = null;
        valueMarker67.addChangeListener(markerChangeListener79);
        java.awt.Stroke stroke81 = valueMarker67.getOutlineStroke();
        valueMarker59.setStroke(stroke81);
        valueMarker53.setStroke(stroke81);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker85 = new org.jfree.chart.plot.ValueMarker((-1.0d), paint11, stroke19, paint51, stroke81, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.8f + "'", float50 == 0.8f);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(lengthAdjustmentType56);
        org.junit.Assert.assertNotNull(lengthAdjustmentType57);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(stroke71);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 0.8f + "'", float78 == 0.8f);
        org.junit.Assert.assertNotNull(stroke81);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker8.setAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
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
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        valueMarker23.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker23.removeChangeListener(markerChangeListener28);
        java.lang.String str30 = valueMarker23.getLabel();
        java.lang.Class<?> wildcardClass31 = valueMarker23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray32 = valueMarker1.getListeners((java.lang.Class) wildcardClass31);
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
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker19.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((-1.0d));
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
        valueMarker23.setOutlineStroke(stroke39);
        valueMarker19.setOutlineStroke(stroke39);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker43.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener46 = null;
        valueMarker43.addChangeListener(markerChangeListener46);
        double double48 = valueMarker43.getValue();
        java.awt.Paint paint49 = valueMarker43.getLabelPaint();
        java.awt.Paint paint50 = valueMarker43.getOutlinePaint();
        java.awt.Stroke stroke51 = valueMarker43.getOutlineStroke();
        java.awt.Stroke stroke52 = valueMarker43.getOutlineStroke();
        java.awt.Paint paint53 = valueMarker43.getOutlinePaint();
        float float54 = valueMarker43.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker56.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener59 = null;
        valueMarker56.addChangeListener(markerChangeListener59);
        double double61 = valueMarker56.getValue();
        java.awt.Paint paint62 = valueMarker56.getOutlinePaint();
        valueMarker43.setLabelPaint(paint62);
        org.jfree.chart.plot.ValueMarker valueMarker65 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke66 = valueMarker65.getStroke();
        java.lang.Object obj67 = valueMarker65.clone();
        valueMarker65.setValue((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor70 = valueMarker65.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker72 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets73 = valueMarker72.getLabelOffset();
        java.awt.Stroke stroke74 = valueMarker72.getOutlineStroke();
        valueMarker65.setStroke(stroke74);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker77 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint17, stroke39, paint62, stroke74, (float) 10);
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
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.8f + "'", float36 == 0.8f);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.8f + "'", float54 == 0.8f);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(rectangleAnchor70);
        org.junit.Assert.assertNotNull(rectangleInsets73);
        org.junit.Assert.assertNotNull(stroke74);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(textAnchor24);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker4.notifyListeners(markerChangeEvent7);
        valueMarker4.setValue((double) 0.8f);
        boolean boolean11 = valueMarker2.equals((java.lang.Object) valueMarker4);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker4.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker4.addChangeListener(markerChangeListener13);
        java.awt.Paint paint15 = valueMarker4.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getPaint();
        java.awt.Stroke stroke21 = valueMarker17.getOutlineStroke();
        java.awt.Stroke stroke22 = valueMarker17.getStroke();
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
        java.awt.Paint paint38 = valueMarker24.getOutlinePaint();
        java.awt.Paint paint39 = valueMarker24.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getPaint();
        java.awt.Stroke stroke45 = valueMarker41.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker47.setLabel("");
        java.awt.Paint paint50 = valueMarker47.getOutlinePaint();
        valueMarker41.setLabelPaint(paint50);
        float float52 = valueMarker41.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener53 = null;
        valueMarker41.addChangeListener(markerChangeListener53);
        java.awt.Stroke stroke55 = valueMarker41.getStroke();
        java.awt.Stroke stroke56 = valueMarker41.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1, paint15, stroke22, paint39, stroke56, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.8f + "'", float35 == 0.8f);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.8f + "'", float52 == 0.8f);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(stroke56);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.awt.Stroke stroke16 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        java.awt.Stroke stroke18 = valueMarker14.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker20.getLabelOffset();
        valueMarker14.setLabelOffset(rectangleInsets21);
        java.lang.Class<?> wildcardClass23 = rectangleInsets21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray24 = valueMarker1.getListeners((java.lang.Class) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.RectangleInsets; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        valueMarker1.setLabel("");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0);
        valueMarker1.setValue((double) (-1.0f));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        java.awt.Stroke stroke30 = valueMarker1.getOutlineStroke();
        java.lang.Object obj31 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        valueMarker1.removeChangeListener(markerChangeListener12);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        double double12 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Object obj24 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        valueMarker1.setValue((double) '#');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        valueMarker3.setLabel("hi!");
        java.lang.Class<?> wildcardClass13 = valueMarker3.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.lang.String str9 = valueMarker5.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker5.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getPaint();
        java.lang.String str17 = valueMarker13.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker13.getLabelOffsetType();
        java.lang.Object obj19 = valueMarker13.clone();
        java.awt.Stroke stroke20 = valueMarker13.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker13.notifyListeners(markerChangeEvent21);
        java.lang.Class<?> wildcardClass23 = valueMarker13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray24 = valueMarker1.getListeners((java.lang.Class) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.removeChangeListener(markerChangeListener24);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Font font8 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker1.removeChangeListener(markerChangeListener35);
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        java.lang.String str31 = valueMarker1.getLabel();
        java.awt.Font font32 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Paint paint2 = valueMarker1.getPaint();
        java.awt.Stroke stroke3 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker11.addChangeListener(markerChangeListener14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker11.removeChangeListener(markerChangeListener16);
        java.awt.Stroke stroke18 = valueMarker11.getOutlineStroke();
        boolean boolean20 = valueMarker11.equals((java.lang.Object) (short) -1);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker11.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(textAnchor21);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str13 = valueMarker12.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker12.addChangeListener(markerChangeListener14);
        java.awt.Font font16 = valueMarker12.getLabelFont();
        java.awt.Paint paint17 = valueMarker12.getOutlinePaint();
        java.lang.Class<?> wildcardClass18 = paint17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray19 = valueMarker1.getListeners((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker4.addChangeListener(markerChangeListener7);
        double double9 = valueMarker4.getValue();
        java.awt.Paint paint10 = valueMarker4.getOutlinePaint();
        java.awt.Paint paint11 = valueMarker4.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker4.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener38 = null;
        valueMarker1.addChangeListener(markerChangeListener38);
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        valueMarker1.notifyListeners(markerChangeEvent35);
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.lang.Object obj10 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (-1));
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
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.awt.Stroke stroke6 = valueMarker2.getOutlineStroke();
        java.awt.Stroke stroke7 = valueMarker2.getStroke();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getOutlinePaint();
        java.awt.Paint paint14 = valueMarker10.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Font font19 = valueMarker16.getLabelFont();
        valueMarker10.setLabelFont(font19);
        java.awt.Stroke stroke21 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker23.addChangeListener(markerChangeListener26);
        double double28 = valueMarker23.getValue();
        java.awt.Paint paint29 = valueMarker23.getOutlinePaint();
        java.awt.Paint paint30 = valueMarker23.getLabelPaint();
        valueMarker23.setLabel("");
        valueMarker23.setValue((double) 10L);
        java.awt.Stroke stroke35 = valueMarker23.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType40 = valueMarker37.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType41 = valueMarker37.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener42 = null;
        valueMarker37.addChangeListener(markerChangeListener42);
        float float44 = valueMarker37.getAlpha();
        java.awt.Paint paint45 = valueMarker37.getPaint();
        valueMarker23.setLabelPaint(paint45);
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker48.setLabel("");
        java.awt.Paint paint51 = valueMarker48.getPaint();
        java.lang.String str52 = valueMarker48.getLabel();
        double double53 = valueMarker48.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker55.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker59.setLabel("");
        java.awt.Paint paint62 = valueMarker59.getOutlinePaint();
        valueMarker55.setLabelPaint(paint62);
        java.awt.Stroke stroke64 = valueMarker55.getStroke();
        valueMarker48.setStroke(stroke64);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker67 = new org.jfree.chart.plot.ValueMarker((-1.0d), paint8, stroke21, paint45, stroke64, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(lengthAdjustmentType40);
        org.junit.Assert.assertNotNull(lengthAdjustmentType41);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.8f + "'", float44 == 0.8f);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(stroke64);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        java.awt.Paint paint9 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint10 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        double double17 = valueMarker12.getValue();
        java.awt.Paint paint18 = valueMarker12.getOutlinePaint();
        java.awt.Paint paint19 = valueMarker12.getLabelPaint();
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker12.notifyListeners(markerChangeEvent22);
        java.awt.Stroke stroke24 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker26.addChangeListener(markerChangeListener29);
        double double31 = valueMarker26.getValue();
        java.awt.Paint paint32 = valueMarker26.getLabelPaint();
        java.awt.Paint paint33 = valueMarker26.getOutlinePaint();
        java.awt.Stroke stroke34 = valueMarker26.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker36.addChangeListener(markerChangeListener39);
        double double41 = valueMarker36.getValue();
        java.awt.Paint paint42 = valueMarker36.getOutlinePaint();
        java.awt.Paint paint43 = valueMarker36.getLabelPaint();
        java.awt.Paint paint44 = valueMarker36.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker46.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener49 = null;
        valueMarker46.addChangeListener(markerChangeListener49);
        double double51 = valueMarker46.getValue();
        java.awt.Paint paint52 = valueMarker46.getOutlinePaint();
        java.awt.Paint paint53 = valueMarker46.getLabelPaint();
        java.awt.Paint paint54 = valueMarker46.getPaint();
        valueMarker36.setLabelPaint(paint54);
        valueMarker26.setLabelPaint(paint54);
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = valueMarker58.getLabelOffset();
        java.awt.Stroke stroke60 = valueMarker58.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker63.setLabel("");
        java.awt.Paint paint66 = valueMarker63.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker68 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker70 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker70.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent73 = null;
        valueMarker70.notifyListeners(markerChangeEvent73);
        valueMarker70.setValue((double) 0.8f);
        boolean boolean77 = valueMarker68.equals((java.lang.Object) valueMarker70);
        java.awt.Stroke stroke78 = valueMarker70.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker79 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint66, stroke78);
        valueMarker58.setStroke(stroke78);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker82 = new org.jfree.chart.plot.ValueMarker((double) '#', paint10, stroke24, paint54, stroke78, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(stroke78);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        valueMarker1.setValue((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker5.addChangeListener(markerChangeListener8);
        double double10 = valueMarker5.getValue();
        java.awt.Paint paint11 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint12 = valueMarker5.getLabelPaint();
        valueMarker5.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker5.notifyListeners(markerChangeEvent15);
        java.lang.Object obj17 = valueMarker5.clone();
        java.lang.Class<?> wildcardClass18 = valueMarker5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray19 = valueMarker1.getListeners((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        valueMarker1.setAlpha((float) (byte) 0);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(textAnchor21);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(52.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        java.awt.Stroke stroke8 = valueMarker3.getStroke();
        java.lang.Object obj9 = valueMarker3.clone();
        java.awt.Stroke stroke10 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.lang.Object obj16 = valueMarker12.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker12.getLabelOffsetType();
        valueMarker12.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker12.addChangeListener(markerChangeListener20);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker12.addChangeListener(markerChangeListener22);
        java.lang.Object obj24 = valueMarker12.clone();
        java.awt.Paint paint25 = valueMarker12.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getPaint();
        java.awt.Stroke stroke31 = valueMarker27.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        java.awt.Paint paint36 = valueMarker33.getOutlinePaint();
        valueMarker27.setLabelPaint(paint36);
        float float38 = valueMarker27.getAlpha();
        boolean boolean40 = valueMarker27.equals((java.lang.Object) 10.0f);
        java.awt.Stroke stroke41 = valueMarker27.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 0.0f, paint1, stroke10, paint25, stroke41, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.8f + "'", float38 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(stroke41);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        java.lang.Object obj11 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker4.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor7);
        java.lang.Object obj9 = valueMarker1.clone();
        float float10 = valueMarker1.getAlpha();
        double double11 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        valueMarker1.setValue((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker5.addChangeListener(markerChangeListener8);
        double double10 = valueMarker5.getValue();
        java.awt.Paint paint11 = valueMarker5.getOutlinePaint();
        java.awt.Paint paint12 = valueMarker5.getLabelPaint();
        java.awt.Paint paint13 = valueMarker5.getPaint();
        valueMarker5.setLabel("hi!");
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
        java.awt.Paint paint34 = valueMarker17.getOutlinePaint();
        valueMarker5.setLabelPaint(paint34);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker5.removeChangeListener(markerChangeListener36);
        java.lang.Class<?> wildcardClass38 = valueMarker5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray39 = valueMarker1.getListeners((java.lang.Class) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.8f + "'", float28 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffset(rectangleInsets8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        java.lang.Object obj10 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.addChangeListener(markerChangeListener11);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        float float23 = valueMarker20.getAlpha();
        java.awt.Stroke stroke24 = valueMarker20.getOutlineStroke();
        boolean boolean25 = valueMarker1.equals((java.lang.Object) valueMarker20);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType2 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        java.awt.Paint paint7 = valueMarker4.getPaint();
        java.lang.Object obj8 = valueMarker4.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker4.getLabelOffsetType();
        valueMarker4.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker4.addChangeListener(markerChangeListener12);
        java.lang.String str14 = valueMarker4.getLabel();
        java.awt.Stroke stroke15 = valueMarker4.getOutlineStroke();
        java.lang.Class<?> wildcardClass16 = stroke15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray17 = valueMarker1.getListeners((java.lang.Class) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.BasicStroke; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        valueMarker3.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker3.removeChangeListener(markerChangeListener8);
        java.lang.String str10 = valueMarker3.getLabel();
        java.lang.Class<?> wildcardClass11 = valueMarker3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray12 = valueMarker1.getListeners((java.lang.Class) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.lang.Object obj22 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        float float5 = valueMarker2.getAlpha();
        java.lang.String str6 = valueMarker2.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.awt.Stroke stroke12 = valueMarker8.getOutlineStroke();
        valueMarker2.setStroke(stroke12);
        float float14 = valueMarker2.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker2.getLabelTextAnchor();
        double double16 = valueMarker2.getValue();
        java.awt.Paint paint17 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font20 = valueMarker19.getLabelFont();
        java.awt.Stroke stroke21 = valueMarker19.getOutlineStroke();
        java.awt.Stroke stroke22 = valueMarker19.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getPaint();
        java.lang.String str28 = valueMarker24.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint31 = valueMarker30.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker30.getLabelAnchor();
        valueMarker24.setLabelAnchor(rectangleAnchor32);
        java.awt.Paint paint34 = valueMarker24.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker36.addChangeListener(markerChangeListener39);
        double double41 = valueMarker36.getValue();
        java.awt.Paint paint42 = valueMarker36.getOutlinePaint();
        java.awt.Paint paint43 = valueMarker36.getLabelPaint();
        java.awt.Paint paint44 = valueMarker36.getPaint();
        java.lang.Object obj45 = null;
        boolean boolean46 = valueMarker36.equals(obj45);
        java.awt.Paint paint47 = valueMarker36.getPaint();
        java.awt.Stroke stroke48 = valueMarker36.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1, paint17, stroke22, paint34, stroke48, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Font font10 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font10);
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        java.awt.Paint paint34 = valueMarker31.getOutlinePaint();
        valueMarker27.setLabelPaint(paint34);
        java.awt.Stroke stroke36 = valueMarker27.getStroke();
        java.awt.Paint paint37 = valueMarker27.getLabelPaint();
        valueMarker25.setLabelPaint(paint37);
        java.lang.Class<?> wildcardClass39 = paint37.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray40 = valueMarker1.getListeners((java.lang.Class) wildcardClass39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        float float9 = valueMarker1.getAlpha();
        float float10 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Font font5 = valueMarker2.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker2.addChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        valueMarker2.setOutlinePaint(paint12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font16 = valueMarker15.getLabelFont();
        java.awt.Stroke stroke17 = valueMarker15.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint20 = valueMarker19.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.lang.String str26 = valueMarker22.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker22.getLabelOffsetType();
        valueMarker19.setLabelOffsetType(lengthAdjustmentType27);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker19.addChangeListener(markerChangeListener29);
        java.awt.Paint paint31 = valueMarker19.getPaint();
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
        java.lang.Object obj47 = valueMarker33.clone();
        java.awt.Stroke stroke48 = valueMarker33.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker50 = new org.jfree.chart.plot.ValueMarker(100.0d, paint12, stroke17, paint31, stroke48, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.8f + "'", float44 == 0.8f);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        valueMarker1.setValue((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = valueMarker1.getLabelOffset();
        double double8 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.lang.String str19 = valueMarker15.getLabel();
        double double20 = valueMarker15.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        java.awt.Paint paint29 = valueMarker26.getOutlinePaint();
        valueMarker22.setLabelPaint(paint29);
        java.awt.Stroke stroke31 = valueMarker22.getStroke();
        valueMarker15.setStroke(stroke31);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker34.addChangeListener(markerChangeListener37);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType43 = valueMarker40.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType44 = valueMarker40.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener45 = null;
        valueMarker40.addChangeListener(markerChangeListener45);
        float float47 = valueMarker40.getAlpha();
        java.awt.Paint paint48 = valueMarker40.getPaint();
        valueMarker34.setOutlinePaint(paint48);
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker51.setLabel("");
        float float54 = valueMarker51.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker56.setLabel("");
        java.awt.Paint paint59 = valueMarker56.getPaint();
        java.awt.Stroke stroke60 = valueMarker56.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker62.setLabel("");
        java.awt.Paint paint65 = valueMarker62.getOutlinePaint();
        valueMarker56.setLabelPaint(paint65);
        float float67 = valueMarker56.getAlpha();
        valueMarker56.setLabel("");
        java.awt.Paint paint70 = valueMarker56.getOutlinePaint();
        java.awt.Stroke stroke71 = valueMarker56.getOutlineStroke();
        valueMarker51.setOutlineStroke(stroke71);
        java.awt.Stroke stroke73 = valueMarker51.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker75 = new org.jfree.chart.plot.ValueMarker((double) 10L, paint12, stroke31, paint48, stroke73, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(lengthAdjustmentType43);
        org.junit.Assert.assertNotNull(lengthAdjustmentType44);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.8f + "'", float47 == 0.8f);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.8f + "'", float54 == 0.8f);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.8f + "'", float67 == 0.8f);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(stroke71);
        org.junit.Assert.assertNotNull(stroke73);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        java.awt.Paint paint16 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker18.addChangeListener(markerChangeListener21);
        java.lang.Class<?> wildcardClass23 = valueMarker18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray24 = valueMarker1.getListeners((java.lang.Class) wildcardClass23);
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
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font2 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.awt.Stroke stroke12 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        valueMarker8.setLabelPaint(paint17);
        double double19 = valueMarker8.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker8.addChangeListener(markerChangeListener20);
        boolean boolean22 = valueMarker1.equals((java.lang.Object) markerChangeListener20);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        double double17 = valueMarker12.getValue();
        java.awt.Paint paint18 = valueMarker12.getOutlinePaint();
        java.awt.Paint paint19 = valueMarker12.getLabelPaint();
        java.awt.Paint paint20 = valueMarker12.getPaint();
        valueMarker2.setLabelPaint(paint20);
        java.awt.Paint paint22 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint23 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        java.awt.Paint paint28 = valueMarker25.getPaint();
        java.lang.String str29 = valueMarker25.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint32 = valueMarker31.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker31.getLabelAnchor();
        valueMarker25.setLabelAnchor(rectangleAnchor33);
        java.awt.Stroke stroke35 = valueMarker25.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        valueMarker37.notifyListeners(markerChangeEvent40);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        valueMarker37.notifyListeners(markerChangeEvent42);
        java.awt.Font font44 = valueMarker37.getLabelFont();
        java.awt.Stroke stroke45 = valueMarker37.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker47.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType50 = valueMarker47.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType51 = valueMarker47.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker47.addChangeListener(markerChangeListener52);
        float float54 = valueMarker47.getAlpha();
        java.awt.Paint paint55 = valueMarker47.getPaint();
        valueMarker37.setLabelPaint(paint55);
        org.jfree.chart.plot.ValueMarker valueMarker58 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke59 = valueMarker58.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker(0.800000011920929d, paint23, stroke35, paint55, stroke59, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleAnchor33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(lengthAdjustmentType50);
        org.junit.Assert.assertNotNull(lengthAdjustmentType51);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.8f + "'", float54 == 0.8f);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(stroke59);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        java.awt.Stroke stroke20 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker1.addChangeListener(markerChangeListener32);
        java.awt.Paint paint34 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.800000011920929d + "'", double31 == 0.800000011920929d);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        java.lang.Object obj6 = valueMarker1.clone();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        double double14 = valueMarker9.getValue();
        java.awt.Paint paint15 = valueMarker9.getOutlinePaint();
        java.awt.Paint paint16 = valueMarker9.getLabelPaint();
        valueMarker9.setLabel("");
        java.awt.Stroke stroke19 = valueMarker9.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke19);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint4 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.lang.String str10 = valueMarker6.getLabel();
        double double11 = valueMarker6.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getOutlinePaint();
        valueMarker13.setLabelPaint(paint20);
        java.awt.Stroke stroke22 = valueMarker13.getStroke();
        valueMarker6.setStroke(stroke22);
        java.awt.Paint paint24 = valueMarker6.getOutlinePaint();
        java.awt.Stroke stroke25 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint28 = valueMarker27.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker30.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker30.addChangeListener(markerChangeListener33);
        double double35 = valueMarker30.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker39.setLabel("");
        java.awt.Paint paint42 = valueMarker39.getPaint();
        java.awt.Stroke stroke43 = valueMarker39.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker45.setLabel("");
        java.awt.Paint paint48 = valueMarker45.getOutlinePaint();
        valueMarker39.setLabelPaint(paint48);
        float float50 = valueMarker39.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener51 = null;
        valueMarker39.addChangeListener(markerChangeListener51);
        java.awt.Stroke stroke53 = valueMarker39.getOutlineStroke();
        valueMarker37.setOutlineStroke(stroke53);
        valueMarker30.setStroke(stroke53);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker57 = new org.jfree.chart.plot.ValueMarker((double) 0.0f, paint4, stroke25, paint28, stroke53, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.8f + "'", float50 == 0.8f);
        org.junit.Assert.assertNotNull(stroke53);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        java.lang.Object obj10 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.awt.Stroke stroke15 = valueMarker10.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker15.addChangeListener(markerChangeListener20);
        java.awt.Paint paint22 = valueMarker15.getLabelPaint();
        java.lang.Class<?> wildcardClass23 = valueMarker15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray24 = valueMarker1.getListeners((java.lang.Class) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        java.lang.String str19 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        java.lang.Object obj3 = valueMarker1.clone();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(textAnchor5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
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
        valueMarker1.setLabelTextAnchor(textAnchor19);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor19);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        java.lang.Object obj16 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.lang.Object obj8 = valueMarker1.clone();
        java.lang.Object obj9 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        java.awt.Stroke stroke25 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker1.addChangeListener(markerChangeListener26);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.Class class27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray28 = valueMarker1.getListeners(class27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 1);
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
        java.lang.Class<?> wildcardClass18 = valueMarker3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray19 = valueMarker1.getListeners((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        java.awt.Paint paint8 = valueMarker6.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        float float13 = valueMarker10.getAlpha();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint8, stroke14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker15.addChangeListener(markerChangeListener16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker19.notifyListeners(markerChangeEvent20);
        java.awt.Stroke stroke22 = valueMarker19.getStroke();
        valueMarker15.setOutlineStroke(stroke22);
        java.awt.Stroke stroke24 = valueMarker15.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker26.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker26.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker26.addChangeListener(markerChangeListener31);
        valueMarker26.setLabel("");
        valueMarker26.setLabel("");
        java.awt.Paint paint37 = valueMarker26.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker39.setLabel("");
        java.awt.Paint paint42 = valueMarker39.getPaint();
        java.lang.String str43 = valueMarker39.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint46 = valueMarker45.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor47 = valueMarker45.getLabelAnchor();
        valueMarker39.setLabelAnchor(rectangleAnchor47);
        java.awt.Stroke stroke49 = valueMarker39.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) '4', paint3, stroke24, paint37, stroke49, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(rectangleAnchor47);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker33.setLabel("");
        float float36 = valueMarker33.getAlpha();
        java.awt.Stroke stroke37 = valueMarker33.getOutlineStroke();
        java.lang.Class<?> wildcardClass38 = stroke37.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray39 = valueMarker1.getListeners((java.lang.Class) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.BasicStroke; cannot be cast to [Ljava.util.EventListener;");
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
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.8f + "'", float36 == 0.8f);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker1.removeChangeListener(markerChangeListener35);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke17 = valueMarker16.getStroke();
        java.awt.Paint paint18 = valueMarker16.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        float float23 = valueMarker20.getAlpha();
        java.awt.Stroke stroke24 = valueMarker20.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint18, stroke24);
        valueMarker1.setOutlineStroke(stroke24);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        java.awt.Paint paint22 = valueMarker19.getOutlinePaint();
        valueMarker15.setLabelPaint(paint22);
        java.awt.Stroke stroke24 = valueMarker15.getStroke();
        java.awt.Paint paint25 = valueMarker15.getLabelPaint();
        valueMarker13.setLabelPaint(paint25);
        java.lang.Class<?> wildcardClass27 = paint25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray28 = valueMarker1.getListeners((java.lang.Class) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.lang.Object obj10 = valueMarker1.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        double double12 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker3.addChangeListener(markerChangeListener6);
        double double8 = valueMarker3.getValue();
        java.awt.Paint paint9 = valueMarker3.getOutlinePaint();
        java.awt.Paint paint10 = valueMarker3.getLabelPaint();
        java.awt.Paint paint11 = valueMarker3.getPaint();
        java.lang.Object obj12 = null;
        boolean boolean13 = valueMarker3.equals(obj12);
        java.awt.Paint paint14 = valueMarker3.getPaint();
        java.awt.Stroke stroke15 = valueMarker3.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        java.awt.Paint paint20 = valueMarker17.getPaint();
        java.lang.String str21 = valueMarker17.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker17.notifyListeners(markerChangeEvent22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        java.awt.Paint paint28 = valueMarker25.getPaint();
        java.lang.String str29 = valueMarker25.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        java.awt.Paint paint34 = valueMarker31.getPaint();
        valueMarker25.setLabelPaint(paint34);
        valueMarker17.setOutlinePaint(paint34);
        java.awt.Stroke stroke37 = valueMarker17.getStroke();
        java.awt.Font font38 = valueMarker17.getLabelFont();
        java.awt.Paint paint39 = valueMarker17.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getPaint();
        java.awt.Stroke stroke45 = valueMarker41.getOutlineStroke();
        java.awt.Stroke stroke46 = valueMarker41.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f), paint1, stroke15, paint39, stroke46, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(stroke46);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        double double11 = valueMarker6.getValue();
        java.awt.Paint paint12 = valueMarker6.getOutlinePaint();
        java.awt.Paint paint13 = valueMarker6.getLabelPaint();
        valueMarker6.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker6.notifyListeners(markerChangeEvent16);
        org.jfree.chart.text.TextAnchor textAnchor18 = valueMarker6.getLabelTextAnchor();
        java.lang.Class<?> wildcardClass19 = valueMarker6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray20 = valueMarker1.getListeners((java.lang.Class) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint16 = valueMarker15.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker15.getLabelAnchor();
        valueMarker9.setLabelAnchor(rectangleAnchor17);
        java.awt.Stroke stroke19 = valueMarker9.getStroke();
        valueMarker1.setStroke(stroke19);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.lang.String str9 = valueMarker1.getLabel();
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setPaint(paint11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.text.TextAnchor textAnchor2 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(textAnchor2);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker9.notifyListeners(markerChangeEvent14);
        java.awt.Paint paint16 = valueMarker9.getPaint();
        valueMarker9.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getPaint();
        java.awt.Stroke stroke24 = valueMarker20.getOutlineStroke();
        valueMarker9.setOutlineStroke(stroke24);
        java.lang.Class<?> wildcardClass26 = valueMarker9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray27 = valueMarker1.getListeners((java.lang.Class) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker1.notifyListeners(markerChangeEvent17);
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        java.awt.Paint paint20 = valueMarker1.getPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        double double12 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.addChangeListener(markerChangeListener20);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        java.awt.Paint paint16 = valueMarker1.getOutlinePaint();
        java.lang.Object obj17 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor9);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.addChangeListener(markerChangeListener11);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(textAnchor9);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        java.awt.Paint paint20 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        float float25 = valueMarker22.getAlpha();
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
        java.awt.Paint paint41 = valueMarker27.getOutlinePaint();
        java.awt.Stroke stroke42 = valueMarker27.getOutlineStroke();
        valueMarker22.setOutlineStroke(stroke42);
        java.awt.Stroke stroke44 = valueMarker22.getStroke();
        java.awt.Paint paint45 = null;
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker47.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent50 = null;
        valueMarker47.notifyListeners(markerChangeEvent50);
        valueMarker47.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker55.setLabel("");
        java.awt.Paint paint58 = valueMarker55.getPaint();
        java.awt.Stroke stroke59 = valueMarker55.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker61.setLabel("");
        java.awt.Paint paint64 = valueMarker61.getOutlinePaint();
        valueMarker55.setLabelPaint(paint64);
        float float66 = valueMarker55.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener67 = null;
        valueMarker55.addChangeListener(markerChangeListener67);
        java.awt.Stroke stroke69 = valueMarker55.getOutlineStroke();
        valueMarker47.setStroke(stroke69);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker72 = new org.jfree.chart.plot.ValueMarker(52.0d, paint20, stroke44, paint45, stroke69, 100.0f);
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
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.8f + "'", float38 == 0.8f);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 0.8f + "'", float66 == 0.8f);
        org.junit.Assert.assertNotNull(stroke69);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.String str7 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        java.awt.Paint paint16 = valueMarker13.getOutlinePaint();
        valueMarker9.setLabelPaint(paint16);
        java.awt.Font font18 = valueMarker9.getLabelFont();
        java.lang.Class<?> wildcardClass19 = font18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray20 = valueMarker1.getListeners((java.lang.Class) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Font; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        valueMarker1.setValue(0.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffset(rectangleInsets7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        double double7 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker9.notifyListeners(markerChangeEvent12);
        java.awt.Stroke stroke14 = valueMarker9.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint18 = valueMarker17.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker17.getLabelAnchor();
        valueMarker9.setLabelAnchor(rectangleAnchor19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.awt.Stroke stroke26 = valueMarker22.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getOutlinePaint();
        valueMarker22.setLabelPaint(paint31);
        float float33 = valueMarker22.getAlpha();
        valueMarker22.setValue((double) (byte) 0);
        java.awt.Font font36 = valueMarker22.getLabelFont();
        valueMarker9.setLabelFont(font36);
        java.lang.Class<?> wildcardClass38 = valueMarker9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray39 = valueMarker1.getListeners((java.lang.Class) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.8f + "'", float33 == 0.8f);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        java.lang.Class<?> wildcardClass20 = valueMarker1.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke26 = valueMarker25.getStroke();
        java.awt.Paint paint27 = valueMarker25.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke30 = valueMarker29.getStroke();
        valueMarker25.setStroke(stroke30);
        float float32 = valueMarker25.getAlpha();
        boolean boolean33 = valueMarker1.equals((java.lang.Object) valueMarker25);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        valueMarker1.notifyListeners(markerChangeEvent34);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        valueMarker37.notifyListeners(markerChangeEvent40);
        java.awt.Stroke stroke42 = valueMarker37.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType43 = valueMarker37.getLabelOffsetType();
        java.lang.Class<?> wildcardClass44 = lengthAdjustmentType43.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray45 = valueMarker1.getListeners((java.lang.Class) wildcardClass44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(lengthAdjustmentType43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(font29);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker12.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker12.notifyListeners(markerChangeEvent14);
        java.awt.Paint paint16 = valueMarker12.getPaint();
        valueMarker1.setOutlinePaint(paint16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.addChangeListener(markerChangeListener21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        java.awt.Stroke stroke17 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.lang.String str6 = valueMarker2.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        valueMarker2.setLabelPaint(paint11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.lang.String str18 = valueMarker14.getLabel();
        double double19 = valueMarker14.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        java.awt.Paint paint28 = valueMarker25.getOutlinePaint();
        valueMarker21.setLabelPaint(paint28);
        java.awt.Stroke stroke30 = valueMarker21.getStroke();
        valueMarker14.setStroke(stroke30);
        java.awt.Paint paint32 = valueMarker14.getOutlinePaint();
        java.awt.Stroke stroke33 = valueMarker14.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = valueMarker35.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = valueMarker38.getLabelOffset();
        valueMarker35.setLabelOffset(rectangleInsets39);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker35.addChangeListener(markerChangeListener41);
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker46.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        valueMarker46.notifyListeners(markerChangeEvent49);
        valueMarker46.setValue((double) 0.8f);
        boolean boolean53 = valueMarker44.equals((java.lang.Object) valueMarker46);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType54 = valueMarker46.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener55 = null;
        valueMarker46.addChangeListener(markerChangeListener55);
        java.awt.Paint paint57 = valueMarker46.getOutlinePaint();
        valueMarker35.setPaint(paint57);
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker60.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent63 = null;
        valueMarker60.notifyListeners(markerChangeEvent63);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent65 = null;
        valueMarker60.notifyListeners(markerChangeEvent65);
        java.awt.Stroke stroke67 = valueMarker60.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker69 = new org.jfree.chart.plot.ValueMarker((double) (-1L), paint11, stroke33, paint57, stroke67, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType54);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(stroke67);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        java.lang.String str20 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        float float13 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        java.awt.Font font25 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        valueMarker1.setValue((double) (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.awt.Paint paint16 = null;
        valueMarker1.setOutlinePaint(paint16);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(textAnchor15);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        valueMarker22.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker22.addChangeListener(markerChangeListener25);
        java.lang.Class<?> wildcardClass27 = valueMarker22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray28 = valueMarker1.getListeners((java.lang.Class) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        valueMarker12.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker12.removeChangeListener(markerChangeListener17);
        java.lang.String str19 = valueMarker12.getLabel();
        java.lang.Class<?> wildcardClass20 = valueMarker12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray21 = valueMarker1.getListeners((java.lang.Class) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = valueMarker3.getLabelOffset();
        java.awt.Stroke stroke5 = valueMarker3.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker7.removeChangeListener(markerChangeListener10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        java.awt.Paint paint19 = valueMarker13.getLabelPaint();
        java.awt.Paint paint20 = valueMarker13.getPaint();
        java.awt.Stroke stroke21 = valueMarker13.getOutlineStroke();
        java.awt.Paint paint22 = valueMarker13.getLabelPaint();
        valueMarker7.setPaint(paint22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        valueMarker25.notifyListeners(markerChangeEvent28);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        valueMarker25.notifyListeners(markerChangeEvent30);
        java.awt.Stroke stroke32 = valueMarker25.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 1L, paint1, stroke5, paint22, stroke32, (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        java.awt.Paint paint14 = valueMarker10.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str17 = valueMarker16.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker16.addChangeListener(markerChangeListener18);
        java.awt.Font font20 = valueMarker16.getLabelFont();
        valueMarker10.setLabelFont(font20);
        java.awt.Stroke stroke22 = valueMarker10.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker24.addChangeListener(markerChangeListener27);
        double double29 = valueMarker24.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker24.getLabelAnchor();
        valueMarker24.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker24.getLabelOffset();
        valueMarker10.setLabelOffset(rectangleInsets33);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        float float39 = valueMarker36.getAlpha();
        java.lang.String str40 = valueMarker36.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker36.removeChangeListener(markerChangeListener41);
        valueMarker36.setAlpha((float) 1L);
        java.lang.String str45 = valueMarker36.getLabel();
        java.awt.Stroke stroke46 = valueMarker36.getStroke();
        valueMarker10.setStroke(stroke46);
        valueMarker1.setOutlineStroke(stroke46);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.8f + "'", float39 == 0.8f);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(stroke46);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.awt.Paint paint15 = valueMarker12.getPaint();
        java.awt.Stroke stroke16 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getOutlinePaint();
        valueMarker12.setLabelPaint(paint21);
        float float23 = valueMarker12.getAlpha();
        boolean boolean25 = valueMarker12.equals((java.lang.Object) 10.0f);
        java.awt.Stroke stroke26 = valueMarker12.getOutlineStroke();
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
        java.awt.Paint paint47 = valueMarker28.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker49.setLabel("");
        java.awt.Font font52 = valueMarker49.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener53 = null;
        valueMarker49.addChangeListener(markerChangeListener53);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor55 = valueMarker49.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor56 = valueMarker49.getLabelAnchor();
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
        java.awt.Stroke stroke76 = valueMarker75.getOutlineStroke();
        valueMarker49.setOutlineStroke(stroke76);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker79 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint10, stroke26, paint47, stroke76, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.8f + "'", float39 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(lengthAdjustmentType46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(font52);
        org.junit.Assert.assertNotNull(rectangleAnchor55);
        org.junit.Assert.assertNotNull(rectangleAnchor56);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(stroke74);
        org.junit.Assert.assertNotNull(stroke76);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        double double9 = valueMarker1.getValue();
        java.awt.Paint paint10 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Paint paint15 = valueMarker12.getOutlinePaint();
        java.lang.Class<?> wildcardClass16 = valueMarker12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray17 = valueMarker1.getListeners((java.lang.Class) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        java.awt.Font font15 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelAnchor(rectangleAnchor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker5.removeChangeListener(markerChangeListener9);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker5.addChangeListener(markerChangeListener11);
        java.awt.Paint paint13 = valueMarker5.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        boolean boolean18 = valueMarker5.equals((java.lang.Object) "");
        java.awt.Stroke stroke19 = valueMarker5.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        float float24 = valueMarker21.getAlpha();
        java.lang.String str25 = valueMarker21.getLabel();
        java.lang.Object obj26 = valueMarker21.clone();
        valueMarker21.setLabel("");
        java.awt.Paint paint29 = valueMarker21.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker31.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker31.addChangeListener(markerChangeListener34);
        double double36 = valueMarker31.getValue();
        java.awt.Paint paint37 = valueMarker31.getLabelPaint();
        java.awt.Paint paint38 = valueMarker31.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke41 = valueMarker40.getStroke();
        valueMarker31.setOutlineStroke(stroke41);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) 100L, paint3, stroke19, paint29, stroke41, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke41);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker29.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker29.addChangeListener(markerChangeListener32);
        double double34 = valueMarker29.getValue();
        java.awt.Paint paint35 = valueMarker29.getOutlinePaint();
        java.awt.Paint paint36 = valueMarker29.getLabelPaint();
        valueMarker29.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        valueMarker29.notifyListeners(markerChangeEvent39);
        org.jfree.chart.text.TextAnchor textAnchor41 = valueMarker29.getLabelTextAnchor();
        java.lang.Class<?> wildcardClass42 = valueMarker29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray43 = valueMarker1.getListeners((java.lang.Class) wildcardClass42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(rectangleAnchor26);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(textAnchor41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker10.notifyListeners(markerChangeEvent13);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker10.notifyListeners(markerChangeEvent15);
        java.awt.Font font17 = valueMarker10.getLabelFont();
        java.awt.Stroke stroke18 = valueMarker10.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker20.addChangeListener(markerChangeListener25);
        float float27 = valueMarker20.getAlpha();
        java.awt.Paint paint28 = valueMarker20.getPaint();
        valueMarker10.setLabelPaint(paint28);
        valueMarker1.setOutlinePaint(paint28);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.awt.Paint paint16 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
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
        java.awt.Paint paint25 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Paint paint10 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getOutlinePaint();
        valueMarker12.setLabelPaint(paint19);
        java.lang.Class<?> wildcardClass21 = paint19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray22 = valueMarker1.getListeners((java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.addChangeListener(markerChangeListener21);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.awt.Stroke stroke31 = null;
        valueMarker1.setOutlineStroke(stroke31);
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
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker14.addChangeListener(markerChangeListener17);
        double double19 = valueMarker14.getValue();
        java.awt.Paint paint20 = valueMarker14.getOutlinePaint();
        java.awt.Paint paint21 = valueMarker14.getLabelPaint();
        valueMarker14.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker14.notifyListeners(markerChangeEvent24);
        org.jfree.chart.text.TextAnchor textAnchor26 = valueMarker14.getLabelTextAnchor();
        valueMarker14.setValue((double) '#');
        java.awt.Paint paint29 = valueMarker14.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(textAnchor26);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker11.notifyListeners(markerChangeEvent14);
        java.awt.Stroke stroke16 = valueMarker11.getStroke();
        java.lang.Object obj17 = valueMarker11.clone();
        valueMarker11.setValue((double) (short) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getPaint();
        java.lang.String str26 = valueMarker22.getLabel();
        double double27 = valueMarker22.getValue();
        java.awt.Stroke stroke28 = valueMarker22.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint31 = valueMarker30.getLabelPaint();
        valueMarker22.setOutlinePaint(paint31);
        valueMarker11.setOutlinePaint(paint31);
        valueMarker1.setLabelPaint(paint31);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke17 = valueMarker16.getStroke();
        java.awt.Paint paint18 = valueMarker16.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        float float23 = valueMarker20.getAlpha();
        java.awt.Stroke stroke24 = valueMarker20.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint18, stroke24);
        valueMarker1.setLabelPaint(paint18);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        java.awt.Paint paint33 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
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
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker7.addChangeListener(markerChangeListener10);
        double double12 = valueMarker7.getValue();
        java.awt.Paint paint13 = valueMarker7.getOutlinePaint();
        java.awt.Paint paint14 = valueMarker7.getLabelPaint();
        java.awt.Paint paint15 = valueMarker7.getPaint();
        java.lang.Object obj16 = null;
        boolean boolean17 = valueMarker7.equals(obj16);
        java.awt.Paint paint18 = valueMarker7.getPaint();
        java.awt.Stroke stroke19 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke19);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.awt.Stroke stroke12 = valueMarker8.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke12);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue(1.0d);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        double double11 = valueMarker6.getValue();
        java.awt.Paint paint12 = valueMarker6.getOutlinePaint();
        java.awt.Paint paint13 = valueMarker6.getLabelPaint();
        java.awt.Paint paint14 = valueMarker6.getPaint();
        valueMarker6.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker18.setLabel("");
        java.awt.Paint paint21 = valueMarker18.getPaint();
        java.awt.Stroke stroke22 = valueMarker18.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        java.awt.Paint paint27 = valueMarker24.getOutlinePaint();
        valueMarker18.setLabelPaint(paint27);
        float float29 = valueMarker18.getAlpha();
        valueMarker18.setLabel("");
        valueMarker18.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker18.getLabelTextAnchor();
        java.awt.Paint paint35 = valueMarker18.getOutlinePaint();
        valueMarker6.setLabelPaint(paint35);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker6.removeChangeListener(markerChangeListener37);
        java.lang.Class<?> wildcardClass39 = valueMarker6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray40 = valueMarker1.getListeners((java.lang.Class) wildcardClass39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.8f + "'", float29 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        java.awt.Paint paint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setPaint(paint18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor17);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker24.getLabelTextAnchor();
        float float28 = valueMarker24.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font31 = valueMarker30.getLabelFont();
        valueMarker24.setLabelFont(font31);
        java.lang.Class<?> wildcardClass33 = font31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray34 = valueMarker1.getListeners((java.lang.Class) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Font; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.8f + "'", float28 == 0.8f);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker1.notifyListeners(markerChangeEvent14);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        java.awt.Stroke stroke11 = valueMarker3.getStroke();
        java.lang.Object obj12 = valueMarker3.clone();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.lang.String str12 = valueMarker8.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker8.notifyListeners(markerChangeEvent13);
        java.awt.Paint paint15 = valueMarker8.getPaint();
        valueMarker1.setPaint(paint15);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker22.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker1.getLabelAnchor();
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
        org.junit.Assert.assertNotNull(rectangleAnchor38);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker20.notifyListeners(markerChangeEvent23);
        valueMarker20.setValue((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getPaint();
        java.awt.Stroke stroke32 = valueMarker28.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        java.awt.Paint paint37 = valueMarker34.getOutlinePaint();
        valueMarker28.setLabelPaint(paint37);
        float float39 = valueMarker28.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker28.addChangeListener(markerChangeListener40);
        java.awt.Stroke stroke42 = valueMarker28.getOutlineStroke();
        valueMarker20.setStroke(stroke42);
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker45.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType48 = valueMarker45.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType49 = valueMarker45.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener50 = null;
        valueMarker45.addChangeListener(markerChangeListener50);
        valueMarker45.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor54 = valueMarker45.getLabelTextAnchor();
        java.lang.String str55 = valueMarker45.getLabel();
        java.awt.Paint paint56 = valueMarker45.getOutlinePaint();
        java.awt.Paint paint57 = valueMarker45.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker59.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener62 = null;
        valueMarker59.addChangeListener(markerChangeListener62);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener64 = null;
        valueMarker59.removeChangeListener(markerChangeListener64);
        java.awt.Stroke stroke66 = valueMarker59.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker68 = new org.jfree.chart.plot.ValueMarker(52.0d, paint17, stroke42, paint57, stroke66, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.8f + "'", float39 == 0.8f);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(lengthAdjustmentType48);
        org.junit.Assert.assertNotNull(lengthAdjustmentType49);
        org.junit.Assert.assertNotNull(textAnchor54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(stroke66);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getPaint();
        java.awt.Stroke stroke24 = valueMarker20.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        java.awt.Paint paint29 = valueMarker26.getOutlinePaint();
        valueMarker20.setLabelPaint(paint29);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker20.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker20.addChangeListener(markerChangeListener32);
        java.awt.Font font34 = valueMarker20.getLabelFont();
        java.lang.Class<?> wildcardClass35 = valueMarker20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray36 = valueMarker1.getListeners((java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(textAnchor16);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker17.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        float float11 = valueMarker10.getAlpha();
        java.awt.Stroke stroke12 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker14.getLabelTextAnchor();
        java.awt.Paint paint18 = valueMarker14.getPaint();
        boolean boolean19 = valueMarker10.equals((java.lang.Object) valueMarker14);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        valueMarker1.setAlpha((float) 1L);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        double double17 = valueMarker12.getValue();
        java.awt.Paint paint18 = valueMarker12.getLabelPaint();
        java.awt.Paint paint19 = valueMarker12.getOutlinePaint();
        java.lang.String str20 = valueMarker12.getLabel();
        java.awt.Paint paint21 = valueMarker12.getOutlinePaint();
        valueMarker1.setLabelPaint(paint21);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker1.notifyListeners(markerChangeEvent24);
        org.jfree.chart.text.TextAnchor textAnchor26 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(textAnchor26);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        java.awt.Paint paint13 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker1.notifyListeners(markerChangeEvent14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.awt.Paint paint19 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        java.awt.Paint paint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(textAnchor9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker2.notifyListeners(markerChangeEvent5);
        java.awt.Stroke stroke7 = valueMarker2.getStroke();
        java.lang.Object obj8 = valueMarker2.clone();
        java.awt.Paint paint9 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker13.notifyListeners(markerChangeEvent16);
        valueMarker13.setValue((double) 0.8f);
        boolean boolean20 = valueMarker11.equals((java.lang.Object) valueMarker13);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker13.addChangeListener(markerChangeListener22);
        java.awt.Paint paint24 = valueMarker13.getOutlinePaint();
        valueMarker2.setPaint(paint24);
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        valueMarker27.notifyListeners(markerChangeEvent30);
        java.awt.Stroke stroke32 = valueMarker27.getStroke();
        java.lang.Object obj33 = valueMarker27.clone();
        java.awt.Stroke stroke34 = valueMarker27.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType39 = valueMarker36.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType40 = valueMarker36.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener41 = null;
        valueMarker36.addChangeListener(markerChangeListener41);
        valueMarker36.setLabel("");
        valueMarker36.setLabel("");
        java.awt.Paint paint47 = valueMarker36.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker49.setLabel("");
        java.awt.Paint paint52 = valueMarker49.getPaint();
        java.lang.String str53 = valueMarker49.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint56 = valueMarker55.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor57 = valueMarker55.getLabelAnchor();
        valueMarker49.setLabelAnchor(rectangleAnchor57);
        java.awt.Paint paint59 = valueMarker49.getPaint();
        float float60 = valueMarker49.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker62 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker62.setLabel("");
        java.awt.Paint paint65 = valueMarker62.getPaint();
        java.awt.Stroke stroke66 = valueMarker62.getOutlineStroke();
        java.awt.Stroke stroke67 = valueMarker62.getStroke();
        valueMarker49.setOutlineStroke(stroke67);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker70 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100, paint24, stroke34, paint47, stroke67, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(lengthAdjustmentType39);
        org.junit.Assert.assertNotNull(lengthAdjustmentType40);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(rectangleAnchor57);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.8f + "'", float60 == 0.8f);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertNotNull(stroke67);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        valueMarker1.notifyListeners(markerChangeEvent3);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.lang.Object obj47 = valueMarker1.clone();
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
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker5.removeChangeListener(markerChangeListener9);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker5.addChangeListener(markerChangeListener11);
        java.awt.Paint paint13 = valueMarker5.getPaint();
        java.awt.Paint paint14 = valueMarker5.getPaint();
        double double15 = valueMarker5.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint18 = valueMarker17.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker17.getLabelAnchor();
        double double20 = valueMarker17.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 100.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker22.getLabelOffsetType();
        valueMarker17.setLabelOffsetType(lengthAdjustmentType23);
        valueMarker5.setLabelOffsetType(lengthAdjustmentType23);
        valueMarker1.setLabelOffsetType(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        valueMarker1.setLabel("");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        java.awt.Stroke stroke10 = valueMarker5.getStroke();
        valueMarker1.setOutlineStroke(stroke10);
        java.lang.Object obj12 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        java.lang.Class<?> wildcardClass18 = valueMarker14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray19 = valueMarker1.getListeners((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        java.awt.Paint paint30 = valueMarker27.getOutlinePaint();
        valueMarker23.setLabelPaint(paint30);
        java.awt.Stroke stroke32 = valueMarker23.getStroke();
        java.awt.Paint paint33 = valueMarker23.getLabelPaint();
        valueMarker21.setLabelPaint(paint33);
        java.lang.Class<?> wildcardClass35 = paint33.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray36 = valueMarker1.getListeners((java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.awt.Color; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        valueMarker1.setAlpha((float) 1L);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor13);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker1.getLabelAnchor();
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
        org.junit.Assert.assertNotNull(rectangleAnchor29);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker1.getLabelOffset();
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
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker1.setValue((double) '#');
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke19 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke26 = valueMarker25.getStroke();
        java.awt.Paint paint27 = valueMarker25.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke30 = valueMarker29.getStroke();
        valueMarker25.setStroke(stroke30);
        float float32 = valueMarker25.getAlpha();
        boolean boolean33 = valueMarker1.equals((java.lang.Object) valueMarker25);
        float float34 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.8f + "'", float34 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets35);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        java.lang.Object obj10 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        java.awt.Font font19 = valueMarker14.getLabelFont();
        valueMarker8.setLabelFont(font19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker8.getLabelOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker8.notifyListeners(markerChangeEvent22);
        boolean boolean24 = valueMarker1.equals((java.lang.Object) valueMarker8);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.String str20 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        valueMarker1.addChangeListener(markerChangeListener16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        java.lang.Object obj9 = valueMarker1.clone();
        double double10 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(textAnchor15);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        double double7 = valueMarker2.getValue();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        java.awt.Paint paint9 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker11.setLabel("");
        java.awt.Paint paint14 = valueMarker11.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker11.removeChangeListener(markerChangeListener15);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker11.addChangeListener(markerChangeListener17);
        java.awt.Paint paint19 = valueMarker11.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        boolean boolean24 = valueMarker11.equals((java.lang.Object) "");
        java.awt.Stroke stroke25 = valueMarker11.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker27.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker27.addChangeListener(markerChangeListener30);
        double double32 = valueMarker27.getValue();
        java.awt.Paint paint33 = valueMarker27.getOutlinePaint();
        java.awt.Paint paint34 = valueMarker27.getLabelPaint();
        valueMarker27.setLabel("");
        java.awt.Stroke stroke37 = valueMarker27.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker39 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker39.setLabel("");
        float float42 = valueMarker39.getAlpha();
        java.lang.String str43 = valueMarker39.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke46 = valueMarker45.getStroke();
        valueMarker39.setStroke(stroke46);
        valueMarker27.setOutlineStroke(stroke46);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        valueMarker27.notifyListeners(markerChangeEvent49);
        java.awt.Paint paint51 = valueMarker27.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker53 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker53.setLabel("");
        java.awt.Paint paint56 = valueMarker53.getPaint();
        java.awt.Stroke stroke57 = valueMarker53.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker59 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker59.setLabel("");
        java.awt.Paint paint62 = valueMarker59.getOutlinePaint();
        valueMarker53.setLabelPaint(paint62);
        float float64 = valueMarker53.getAlpha();
        valueMarker53.setLabel("");
        valueMarker53.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor69 = valueMarker53.getLabelTextAnchor();
        java.awt.Paint paint70 = valueMarker53.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType71 = valueMarker53.getLabelOffsetType();
        java.awt.Paint paint72 = valueMarker53.getOutlinePaint();
        valueMarker53.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener75 = null;
        valueMarker53.addChangeListener(markerChangeListener75);
        java.awt.Stroke stroke77 = valueMarker53.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker79 = new org.jfree.chart.plot.ValueMarker((double) 'a', paint9, stroke25, paint51, stroke77, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.8f + "'", float42 == 0.8f);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.8f + "'", float64 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor69);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(lengthAdjustmentType71);
        org.junit.Assert.assertNotNull(paint72);
        org.junit.Assert.assertNotNull(stroke77);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        java.awt.Stroke stroke14 = valueMarker1.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker25.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        valueMarker25.notifyListeners(markerChangeEvent28);
        valueMarker25.setValue((double) 0.8f);
        boolean boolean32 = valueMarker23.equals((java.lang.Object) valueMarker25);
        valueMarker25.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType35 = valueMarker25.getLabelOffsetType();
        java.lang.Class<?> wildcardClass36 = lengthAdjustmentType35.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray37 = valueMarker1.getListeners((java.lang.Class) wildcardClass36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
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
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 100L);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker29.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType30);
        java.awt.Stroke stroke32 = valueMarker1.getStroke();
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
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        java.awt.Paint paint22 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        org.jfree.chart.text.TextAnchor textAnchor38 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelTextAnchor(textAnchor38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.removeChangeListener(markerChangeListener16);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.addChangeListener(markerChangeListener18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        float float40 = valueMarker1.getAlpha();
        valueMarker1.setValue((double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.awt.Stroke stroke12 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        valueMarker8.setLabelPaint(paint17);
        double double19 = valueMarker8.getValue();
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker8.getLabelTextAnchor();
        java.lang.Class<?> wildcardClass21 = valueMarker8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray22 = valueMarker1.getListeners((java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker13.addChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker13.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker13.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType21);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(textAnchor17);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        java.lang.Object obj19 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.awt.Paint paint18 = valueMarker1.getPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        double double6 = valueMarker1.getValue();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        double double5 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker9.notifyListeners(markerChangeEvent12);
        valueMarker9.setValue((double) 0.8f);
        boolean boolean16 = valueMarker7.equals((java.lang.Object) valueMarker9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker9.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker9.getLabelOffsetType();
        java.lang.Class<?> wildcardClass19 = lengthAdjustmentType18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray20 = valueMarker1.getListeners((java.lang.Class) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        java.awt.Paint paint9 = valueMarker6.getPaint();
        java.lang.String str10 = valueMarker6.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker6.getLabelOffsetType();
        valueMarker6.setAlpha((float) (short) 0);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.lang.Object obj19 = valueMarker15.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker15.getLabelOffsetType();
        valueMarker15.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker15.addChangeListener(markerChangeListener23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker15.getLabelOffset();
        valueMarker6.setLabelOffset(rectangleInsets25);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker6.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor27);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textAnchor6);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint12);
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        double double33 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker8.addChangeListener(markerChangeListener11);
        double double13 = valueMarker8.getValue();
        java.awt.Paint paint14 = valueMarker8.getOutlinePaint();
        java.awt.Paint paint15 = valueMarker8.getLabelPaint();
        valueMarker8.setLabel("");
        valueMarker8.setValue((double) 10L);
        java.awt.Stroke stroke20 = valueMarker8.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker22.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker22.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker22.addChangeListener(markerChangeListener27);
        float float29 = valueMarker22.getAlpha();
        java.awt.Paint paint30 = valueMarker22.getPaint();
        valueMarker8.setLabelPaint(paint30);
        valueMarker1.setLabelPaint(paint30);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.8f + "'", float29 == 0.8f);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.awt.Paint paint13 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        java.lang.Object obj12 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker9.setLabel("");
        java.awt.Paint paint12 = valueMarker9.getPaint();
        java.lang.String str13 = valueMarker9.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker9.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker9.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        valueMarker1.setLabelPaint(paint10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker1.notifyListeners(markerChangeEvent12);
        double double14 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
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
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        org.jfree.chart.text.TextAnchor textAnchor33 = valueMarker1.getLabelTextAnchor();
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
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(textAnchor33);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        java.awt.Paint paint37 = valueMarker34.getOutlinePaint();
        boolean boolean38 = valueMarker1.equals((java.lang.Object) valueMarker34);
        org.jfree.chart.plot.ValueMarker valueMarker40 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker40.setLabel("");
        java.awt.Paint paint43 = valueMarker40.getPaint();
        java.awt.Stroke stroke44 = valueMarker40.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker46 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker46.setLabel("");
        java.awt.Paint paint49 = valueMarker46.getOutlinePaint();
        valueMarker40.setLabelPaint(paint49);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor51 = valueMarker40.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener52 = null;
        valueMarker40.addChangeListener(markerChangeListener52);
        java.awt.Font font54 = valueMarker40.getLabelFont();
        java.lang.Class<?> wildcardClass55 = valueMarker40.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray56 = valueMarker1.getListeners((java.lang.Class) wildcardClass55);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(rectangleAnchor51);
        org.junit.Assert.assertNotNull(font54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        valueMarker16.setValue((double) (short) 1);
        java.lang.Class<?> wildcardClass33 = valueMarker16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray34 = valueMarker1.getListeners((java.lang.Class) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        // The following exception was thrown during execution in test generation
        try {
            valueMarker3.setAlpha((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.awt.Font font8 = valueMarker1.getLabelFont();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.lang.String str9 = valueMarker1.getLabel();
        valueMarker1.setValue((double) 100);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffsetType(lengthAdjustmentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor15);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
            valueMarker1.setAlpha(10.0f);
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker19.setLabel("");
        float float22 = valueMarker19.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker19.getLabelOffsetType();
        valueMarker19.setLabel("hi!");
        java.awt.Font font26 = valueMarker19.getLabelFont();
        valueMarker1.setLabelFont(font26);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(font26);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        float float17 = valueMarker14.getAlpha();
        java.lang.String str18 = valueMarker14.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Paint paint23 = valueMarker20.getPaint();
        java.awt.Stroke stroke24 = valueMarker20.getOutlineStroke();
        valueMarker14.setStroke(stroke24);
        java.awt.Stroke stroke26 = valueMarker14.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint29 = valueMarker28.getPaint();
        valueMarker14.setPaint(paint29);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker32.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker32.addChangeListener(markerChangeListener35);
        double double37 = valueMarker32.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker32.getLabelAnchor();
        valueMarker32.setLabel("hi!");
        java.awt.Stroke stroke41 = valueMarker32.getStroke();
        valueMarker14.setStroke(stroke41);
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker44.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker48.setLabel("");
        java.awt.Paint paint51 = valueMarker48.getOutlinePaint();
        valueMarker44.setLabelPaint(paint51);
        java.awt.Paint paint53 = valueMarker44.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker55 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint56 = valueMarker55.getLabelPaint();
        java.awt.Stroke stroke57 = valueMarker55.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker60 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker60.setLabel("");
        java.awt.Paint paint63 = valueMarker60.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker65 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker67 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker67.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent70 = null;
        valueMarker67.notifyListeners(markerChangeEvent70);
        valueMarker67.setValue((double) 0.8f);
        boolean boolean74 = valueMarker65.equals((java.lang.Object) valueMarker67);
        java.awt.Stroke stroke75 = valueMarker67.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker76 = new org.jfree.chart.plot.ValueMarker((double) (short) 100, paint63, stroke75);
        valueMarker55.setOutlineStroke(stroke75);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker79 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100, paint12, stroke41, paint53, stroke75, 10.0f);
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor38);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(stroke75);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker12.setLabel("");
        java.awt.Font font15 = valueMarker12.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker12.addChangeListener(markerChangeListener16);
        java.lang.Class<?> wildcardClass18 = valueMarker12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray19 = valueMarker1.getListeners((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        java.awt.Paint paint12 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getOutlinePaint();
        valueMarker1.setLabelPaint(paint8);
        java.awt.Font font10 = valueMarker1.getLabelFont();
        java.lang.Object obj11 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        java.lang.String str6 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        float float40 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        valueMarker1.notifyListeners(markerChangeEvent41);
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
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        java.lang.Class<?> wildcardClass36 = valueMarker1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker3.notifyListeners(markerChangeEvent6);
        valueMarker3.setValue((double) 0.8f);
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker3);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker3.getLabelOffsetType();
        java.lang.String str12 = valueMarker3.getLabel();
        java.lang.Object obj13 = valueMarker3.clone();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        valueMarker1.setValue(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.awt.Stroke stroke2 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.lang.String str5 = valueMarker4.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker4.addChangeListener(markerChangeListener6);
        java.awt.Font font8 = valueMarker4.getLabelFont();
        valueMarker1.setLabelFont(font8);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker11.removeChangeListener(markerChangeListener20);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        double double8 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        valueMarker1.setValue((double) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker1.notifyListeners(markerChangeEvent29);
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
        org.junit.Assert.assertNotNull(textAnchor28);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
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
        java.lang.Class<?> wildcardClass18 = valueMarker3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray19 = valueMarker1.getListeners((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        java.lang.Object obj22 = null;
        boolean boolean23 = valueMarker1.equals(obj22);
        java.awt.Paint paint24 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        java.awt.Paint paint5 = valueMarker2.getPaint();
        java.awt.Stroke stroke6 = valueMarker2.getOutlineStroke();
        java.awt.Stroke stroke7 = valueMarker2.getStroke();
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Font font13 = valueMarker10.getLabelFont();
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.lang.String str20 = valueMarker16.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker16.notifyListeners(markerChangeEvent21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker28.setLabel("");
        java.awt.Paint paint31 = valueMarker28.getOutlinePaint();
        valueMarker24.setLabelPaint(paint31);
        boolean boolean33 = valueMarker16.equals((java.lang.Object) paint31);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        java.awt.Paint paint38 = valueMarker35.getPaint();
        java.lang.String str39 = valueMarker35.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint42 = valueMarker41.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor43 = valueMarker41.getLabelAnchor();
        valueMarker35.setLabelAnchor(rectangleAnchor43);
        java.awt.Paint paint45 = valueMarker35.getPaint();
        java.awt.Paint paint46 = valueMarker35.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.awt.Stroke stroke49 = valueMarker48.getOutlineStroke();
        valueMarker35.setOutlineStroke(stroke49);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1, paint8, stroke14, paint31, stroke49, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(rectangleAnchor43);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker2.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker2.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.awt.Stroke stroke12 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        valueMarker8.setLabelPaint(paint17);
        float float19 = valueMarker8.getAlpha();
        valueMarker8.setLabel("");
        valueMarker8.setValue((double) 10L);
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker8.getLabelTextAnchor();
        java.awt.Paint paint25 = valueMarker8.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker8.getLabelOffsetType();
        java.awt.Paint paint27 = valueMarker8.getOutlinePaint();
        valueMarker2.setPaint(paint27);
        java.awt.Stroke stroke29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker(0.0d, paint27, stroke29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker1.notifyListeners(markerChangeEvent29);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        double double6 = valueMarker1.getValue();
        double double7 = valueMarker1.getValue();
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.awt.Paint paint10 = valueMarker1.getPaint();
        java.lang.Object obj11 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        java.awt.Stroke stroke20 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        java.awt.Paint paint25 = valueMarker22.getOutlinePaint();
        valueMarker16.setLabelPaint(paint25);
        float float27 = valueMarker16.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker16.addChangeListener(markerChangeListener28);
        java.lang.Object obj30 = valueMarker16.clone();
        java.awt.Stroke stroke31 = valueMarker16.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker16.removeChangeListener(markerChangeListener32);
        java.awt.Paint paint34 = valueMarker16.getPaint();
        java.lang.Class<?> wildcardClass35 = valueMarker16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray36 = valueMarker1.getListeners((java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        java.lang.Class<?> wildcardClass24 = paint23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getOutlinePaint();
        java.lang.Class<?> wildcardClass12 = valueMarker8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray13 = valueMarker1.getListeners((java.lang.Class) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker1.notifyListeners(markerChangeEvent15);
        java.awt.Stroke stroke17 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        float float4 = valueMarker1.getAlpha();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getPaint();
        java.awt.Stroke stroke11 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        java.awt.Paint paint13 = valueMarker1.getPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        double double18 = valueMarker13.getValue();
        java.awt.Paint paint19 = valueMarker13.getLabelPaint();
        java.awt.Paint paint20 = valueMarker13.getOutlinePaint();
        java.lang.String str21 = valueMarker13.getLabel();
        java.awt.Paint paint22 = valueMarker13.getOutlinePaint();
        valueMarker1.setPaint(paint22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.awt.Paint paint20 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker1.removeChangeListener(markerChangeListener31);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Paint paint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = valueMarker1.getLabelOffset();
        valueMarker1.setValue(0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        java.awt.Font font32 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelFont(font32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType33 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(lengthAdjustmentType33);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        valueMarker1.setValue(1.0d);
        java.awt.Stroke stroke22 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        double double24 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker10.setLabel("");
        java.awt.Paint paint13 = valueMarker10.getPaint();
        java.lang.String str14 = valueMarker10.getLabel();
        double double15 = valueMarker10.getValue();
        java.awt.Stroke stroke16 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint19 = valueMarker18.getLabelPaint();
        valueMarker10.setOutlinePaint(paint19);
        boolean boolean21 = valueMarker1.equals((java.lang.Object) valueMarker10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker1.setValue((double) '#');
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
        valueMarker1.setOutlineStroke(stroke19);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker1.notifyListeners(markerChangeEvent31);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(10.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        java.lang.Object obj8 = valueMarker1.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke3 = valueMarker2.getStroke();
        java.awt.Paint paint4 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker6.setLabel("");
        float float9 = valueMarker6.getAlpha();
        java.awt.Stroke stroke10 = valueMarker6.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint4, stroke10);
        java.awt.Paint paint12 = valueMarker11.getPaint();
        java.awt.Font font13 = valueMarker11.getLabelFont();
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font8 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font8);
        java.awt.Stroke stroke10 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getPaint();
        java.lang.Object obj18 = valueMarker14.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker14.getLabelOffsetType();
        valueMarker14.setValue((double) 0);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker14.addChangeListener(markerChangeListener22);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker14.removeChangeListener(markerChangeListener24);
        org.jfree.chart.text.TextAnchor textAnchor26 = valueMarker14.getLabelTextAnchor();
        valueMarker12.setLabelTextAnchor(textAnchor26);
        valueMarker1.setLabelTextAnchor(textAnchor26);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(textAnchor26);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        valueMarker1.setLabel("");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.removeChangeListener(markerChangeListener4);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        double double21 = valueMarker16.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker16.getLabelAnchor();
        valueMarker16.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = valueMarker16.getLabelOffset();
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
        java.awt.Paint paint41 = valueMarker27.getOutlinePaint();
        java.awt.Stroke stroke42 = valueMarker27.getOutlineStroke();
        valueMarker16.setOutlineStroke(stroke42);
        valueMarker1.setOutlineStroke(stroke42);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.8f + "'", float38 == 0.8f);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        float float60 = valueMarker1.getAlpha();
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
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.8f + "'", float60 == 0.8f);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker4.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor7);
        java.lang.Object obj9 = valueMarker1.clone();
        float float10 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(textAnchor12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.lang.String str7 = valueMarker3.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker3.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker13.notifyListeners(markerChangeEvent16);
        valueMarker13.setValue((double) 0.8f);
        boolean boolean20 = valueMarker11.equals((java.lang.Object) valueMarker13);
        java.awt.Stroke stroke21 = valueMarker13.getStroke();
        valueMarker3.setOutlineStroke(stroke21);
        valueMarker1.setOutlineStroke(stroke21);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker1.notifyListeners(markerChangeEvent24);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        valueMarker1.setLabel("");
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.removeChangeListener(markerChangeListener18);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker4.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker4.notifyListeners(markerChangeEvent7);
        valueMarker4.setValue((double) 0.8f);
        boolean boolean11 = valueMarker2.equals((java.lang.Object) valueMarker4);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker4.addChangeListener(markerChangeListener12);
        java.awt.Paint paint14 = valueMarker4.getLabelPaint();
        java.awt.Stroke stroke15 = null;
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker17.setLabel("");
        float float20 = valueMarker17.getAlpha();
        java.lang.String str21 = valueMarker17.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        java.awt.Paint paint26 = valueMarker23.getPaint();
        java.awt.Stroke stroke27 = valueMarker23.getOutlineStroke();
        valueMarker17.setStroke(stroke27);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker17.removeChangeListener(markerChangeListener29);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker17.addChangeListener(markerChangeListener31);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker17.getLabelOffset();
        java.awt.Paint paint34 = valueMarker17.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker36.setLabel("");
        java.awt.Paint paint39 = valueMarker36.getPaint();
        java.lang.Object obj40 = valueMarker36.clone();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType41 = valueMarker36.getLabelOffsetType();
        float float42 = valueMarker36.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent43 = null;
        valueMarker36.notifyListeners(markerChangeEvent43);
        valueMarker36.setLabel("");
        java.awt.Stroke stroke47 = valueMarker36.getStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint14, stroke15, paint34, stroke47, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(lengthAdjustmentType41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.8f + "'", float42 == 0.8f);
        org.junit.Assert.assertNotNull(stroke47);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker34.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        valueMarker34.notifyListeners(markerChangeEvent37);
        java.awt.Stroke stroke39 = valueMarker34.getStroke();
        java.lang.Object obj40 = valueMarker34.clone();
        java.awt.Paint paint41 = valueMarker34.getLabelPaint();
        java.lang.String str42 = valueMarker34.getLabel();
        java.lang.Class<?> wildcardClass43 = valueMarker34.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray44 = valueMarker1.getListeners((java.lang.Class) wildcardClass43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker8.setLabel("");
        java.awt.Paint paint11 = valueMarker8.getPaint();
        java.awt.Stroke stroke12 = valueMarker8.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker14.setLabel("");
        java.awt.Paint paint17 = valueMarker14.getOutlinePaint();
        valueMarker8.setLabelPaint(paint17);
        float float19 = valueMarker8.getAlpha();
        valueMarker8.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker8.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets22);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker23.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker23.addChangeListener(markerChangeListener26);
        double double28 = valueMarker23.getValue();
        java.awt.Paint paint29 = valueMarker23.getOutlinePaint();
        java.awt.Paint paint30 = valueMarker23.getLabelPaint();
        valueMarker23.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint36 = valueMarker35.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker38.setLabel("");
        java.awt.Paint paint41 = valueMarker38.getPaint();
        java.awt.Stroke stroke42 = valueMarker38.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint36, stroke42);
        valueMarker23.setOutlinePaint(paint36);
        java.lang.Class<?> wildcardClass45 = valueMarker23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray46 = valueMarker1.getListeners((java.lang.Class) wildcardClass45);
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
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        java.lang.Class<?> wildcardClass6 = paint5.getClass();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        java.awt.Paint paint10 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        float float12 = valueMarker1.getAlpha();
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        java.awt.Font font9 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        java.lang.Class<?> wildcardClass17 = valueMarker1.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker8.getLabelOffset();
        float float17 = valueMarker8.getAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        valueMarker1.setValue((double) '#');
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        java.awt.Paint paint19 = valueMarker16.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker16.removeChangeListener(markerChangeListener20);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker16.addChangeListener(markerChangeListener22);
        java.awt.Paint paint24 = valueMarker16.getPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker16.removeChangeListener(markerChangeListener26);
        java.awt.Paint paint28 = valueMarker16.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke31 = valueMarker30.getStroke();
        java.awt.Paint paint32 = valueMarker30.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke35 = valueMarker34.getStroke();
        valueMarker30.setStroke(stroke35);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint28, stroke35);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker37.getLabelAnchor();
        boolean boolean39 = valueMarker1.equals((java.lang.Object) valueMarker37);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(rectangleAnchor38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) -1);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        java.awt.Font font3 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 100);
        java.lang.Class<?> wildcardClass6 = valueMarker5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray7 = valueMarker1.getListeners((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        java.lang.Class<?> wildcardClass12 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker3.setLabel("");
        java.awt.Paint paint6 = valueMarker3.getPaint();
        java.lang.String str7 = valueMarker3.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker3.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker13.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker13.notifyListeners(markerChangeEvent16);
        valueMarker13.setValue((double) 0.8f);
        boolean boolean20 = valueMarker11.equals((java.lang.Object) valueMarker13);
        java.awt.Stroke stroke21 = valueMarker13.getStroke();
        valueMarker3.setOutlineStroke(stroke21);
        valueMarker1.setOutlineStroke(stroke21);
        java.awt.Paint paint24 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        valueMarker1.setValue((double) 100.0f);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker10.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker10.notifyListeners(markerChangeEvent12);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker10.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker8.addChangeListener(markerChangeListener15);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        java.lang.Object obj23 = valueMarker1.clone();
        java.awt.Stroke stroke24 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker7.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker7.notifyListeners(markerChangeEvent10);
        java.awt.Stroke stroke12 = valueMarker7.getStroke();
        java.lang.Object obj13 = valueMarker7.clone();
        java.awt.Paint paint14 = valueMarker7.getLabelPaint();
        java.awt.Paint paint15 = valueMarker7.getLabelPaint();
        java.awt.Paint paint16 = valueMarker7.getLabelPaint();
        float float17 = valueMarker7.getAlpha();
        boolean boolean18 = valueMarker1.equals((java.lang.Object) valueMarker7);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker1.getLabelOffsetType();
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
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType39 = valueMarker25.getLabelOffsetType();
        java.lang.Class<?> wildcardClass40 = lengthAdjustmentType39.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray41 = valueMarker1.getListeners((java.lang.Class) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.util.LengthAdjustmentType; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.8f + "'", float36 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke26 = valueMarker25.getStroke();
        java.awt.Paint paint27 = valueMarker25.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 0);
        java.awt.Stroke stroke30 = valueMarker29.getStroke();
        valueMarker25.setStroke(stroke30);
        float float32 = valueMarker25.getAlpha();
        boolean boolean33 = valueMarker1.equals((java.lang.Object) valueMarker25);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        valueMarker1.notifyListeners(markerChangeEvent34);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker37.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker37.addChangeListener(markerChangeListener40);
        double double42 = valueMarker37.getValue();
        java.awt.Paint paint43 = valueMarker37.getOutlinePaint();
        java.awt.Paint paint44 = valueMarker37.getLabelPaint();
        valueMarker37.setLabel("");
        valueMarker37.setAlpha(0.0f);
        java.awt.Paint paint49 = valueMarker37.getLabelPaint();
        valueMarker37.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent52 = null;
        valueMarker37.notifyListeners(markerChangeEvent52);
        java.lang.Class<?> wildcardClass54 = valueMarker37.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray55 = valueMarker1.getListeners((java.lang.Class) wildcardClass54);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.awt.Paint paint34 = valueMarker17.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType35 = valueMarker17.getLabelOffsetType();
        java.awt.Paint paint36 = valueMarker17.getOutlinePaint();
        java.lang.Class<?> wildcardClass37 = valueMarker17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray38 = valueMarker1.getListeners((java.lang.Class) wildcardClass37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.8f + "'", float28 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(lengthAdjustmentType35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker22.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker22.notifyListeners(markerChangeEvent25);
        valueMarker22.setValue((double) 0.8f);
        boolean boolean29 = valueMarker20.equals((java.lang.Object) valueMarker22);
        valueMarker22.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker22.removeChangeListener(markerChangeListener32);
        boolean boolean34 = valueMarker15.equals((java.lang.Object) valueMarker22);
        java.awt.Font font35 = valueMarker15.getLabelFont();
        valueMarker1.setLabelFont(font35);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(font35);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) -1);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        float float16 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        valueMarker1.setValue(0.0d);
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker1.notifyListeners(markerChangeEvent17);
        double double19 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj7 = valueMarker1.clone();
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.awt.Paint paint22 = valueMarker1.getPaint();
        java.awt.Stroke stroke23 = valueMarker1.getStroke();
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
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.awt.Stroke stroke23 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.removeChangeListener(markerChangeListener24);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        double double37 = valueMarker1.getValue();
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.lang.Object obj3 = valueMarker1.clone();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        java.awt.Stroke stroke10 = valueMarker5.getStroke();
        valueMarker1.setOutlineStroke(stroke10);
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor12);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        valueMarker8.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(textAnchor22);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        java.awt.Font font8 = valueMarker7.getLabelFont();
        valueMarker1.setLabelFont(font8);
        java.awt.Stroke stroke10 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.awt.Paint paint20 = valueMarker1.getPaint();
        java.awt.Paint paint21 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        float float8 = valueMarker1.getAlpha();
        java.awt.Stroke stroke9 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint13 = valueMarker12.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.awt.Stroke stroke19 = valueMarker15.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint13, stroke19);
        valueMarker20.setValue((double) 10);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker24.setLabel("");
        float float27 = valueMarker24.getAlpha();
        java.lang.String str28 = valueMarker24.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker24.removeChangeListener(markerChangeListener29);
        valueMarker24.setAlpha((float) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker24.getLabelOffset();
        valueMarker20.setLabelOffset(rectangleInsets33);
        valueMarker1.setLabelOffset(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.addChangeListener(markerChangeListener6);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.Object obj5 = valueMarker1.clone();
        java.lang.String str6 = valueMarker1.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textAnchor7);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.lang.String str9 = valueMarker1.getLabel();
        double double10 = valueMarker1.getValue();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.lang.Object obj34 = valueMarker1.clone();
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
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.removeChangeListener(markerChangeListener16);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker20.setLabel("");
        java.awt.Font font23 = valueMarker20.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker20.addChangeListener(markerChangeListener24);
        java.lang.Class<?> wildcardClass26 = valueMarker20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray27 = valueMarker1.getListeners((java.lang.Class) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to [Ljava.util.EventListener;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker1.removeChangeListener(markerChangeListener20);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker1.setLabel("");
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
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
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        java.lang.Class<?> wildcardClass29 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }
}

