import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
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
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker21.setLabel("");
        java.awt.Paint paint24 = valueMarker21.getPaint();
        java.lang.String str25 = valueMarker21.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint28 = valueMarker27.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker27.getLabelAnchor();
        valueMarker21.setLabelAnchor(rectangleAnchor29);
        java.awt.Paint paint31 = valueMarker21.getPaint();
        java.awt.Paint paint32 = valueMarker21.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.awt.Stroke stroke35 = valueMarker34.getOutlineStroke();
        valueMarker21.setOutlineStroke(stroke35);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType37 = valueMarker21.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker7 and valueMarker21", valueMarker7.equals(valueMarker21) ? valueMarker7.hashCode() == valueMarker21.hashCode() : true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
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
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker35.setLabel("");
        java.awt.Paint paint38 = valueMarker35.getPaint();
        java.lang.String str39 = valueMarker35.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker41.setLabel("");
        java.awt.Paint paint44 = valueMarker41.getPaint();
        valueMarker35.setLabelPaint(paint44);
        valueMarker1.setLabelPaint(paint44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker15 and valueMarker35", valueMarker15.equals(valueMarker35) ? valueMarker15.hashCode() == valueMarker35.hashCode() : true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10);
        java.awt.Paint paint3 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker5.setLabel("");
        java.awt.Paint paint8 = valueMarker5.getPaint();
        java.awt.Stroke stroke9 = valueMarker5.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint3, stroke9);
        float float11 = valueMarker10.getAlpha();
        valueMarker10.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker15.setLabel("");
        java.awt.Paint paint18 = valueMarker15.getPaint();
        java.lang.String str19 = valueMarker15.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker15.notifyListeners(markerChangeEvent20);
        java.awt.Paint paint22 = valueMarker15.getPaint();
        valueMarker15.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker26.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker26.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker26.getLabelAnchor();
        valueMarker15.setLabelAnchor(rectangleAnchor30);
        valueMarker15.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        valueMarker15.notifyListeners(markerChangeEvent34);
        boolean boolean36 = valueMarker10.equals((java.lang.Object) valueMarker15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker5 and valueMarker26", valueMarker5.equals(valueMarker26) ? valueMarker5.hashCode() == valueMarker26.hashCode() : true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
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
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10);
        valueMarker16.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker16.notifyListeners(markerChangeEvent19);
        java.awt.Stroke stroke21 = valueMarker16.getStroke();
        java.lang.Object obj22 = valueMarker16.clone();
        java.awt.Paint paint23 = valueMarker16.getLabelPaint();
        java.awt.Paint paint24 = valueMarker16.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker16.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on valueMarker4 and valueMarker16", valueMarker4.equals(valueMarker16) ? valueMarker4.hashCode() == valueMarker16.hashCode() : true);
    }
}

