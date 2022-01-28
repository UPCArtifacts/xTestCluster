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
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge2 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setInsets(rectangleInsets5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Image image5 = plot4.getBackgroundImage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setInsets(rectangleInsets8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot4.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        java.lang.String str4 = multiplePiePlot3.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        multiplePiePlot3.addChangeListener(plotChangeListener5);
        java.awt.Image image7 = multiplePiePlot3.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot3.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot3.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(jFreeChart11);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier8);
        boolean boolean11 = multiplePiePlot7.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint12 = multiplePiePlot7.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot7.getLegendItems();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke5 = plot4.getOutlineStroke();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (-1), plotRenderingInfo11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (-1), plotRenderingInfo11);
        java.lang.Class<?> wildcardClass13 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        plot4.markerChanged(markerChangeEvent7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot4.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
        java.lang.Class<?> wildcardClass6 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge2 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.awt.Paint paint0 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        org.junit.Assert.assertNotNull(paint0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Image image8 = null;
        multiplePiePlot7.setBackgroundImage(image8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener13);
        java.awt.Image image15 = multiplePiePlot11.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot11.getPieChart();
        multiplePiePlot7.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot7.getDataset();
        java.awt.Paint paint19 = multiplePiePlot7.getAggregatedItemsPaint();
        multiplePiePlot7.zoom((double) (short) 100);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        java.awt.geom.Point2D point2D6 = null;
        org.jfree.chart.plot.PlotState plotState7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D4, rectangle2D5, point2D6, plotState7, plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        plot6.setBackgroundAlpha((float) (byte) -1);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot6.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot14.drawBackground(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        java.lang.String str4 = multiplePiePlot3.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        multiplePiePlot3.addChangeListener(plotChangeListener5);
        java.awt.Image image7 = multiplePiePlot3.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot3.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot3.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets9);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        java.lang.Comparable comparable13 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlignment(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Point2D point2D18 = null;
        org.jfree.chart.plot.PlotState plotState19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot4.draw(graphics2D16, rectangle2D17, point2D18, plotState19, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image3 = null;
        multiplePiePlot1.setBackgroundImage(image3);
        java.lang.Class<?> wildcardClass5 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.setLimit((double) (-1.0f));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        java.awt.Paint paint8 = plot4.getBackgroundPaint();
        java.lang.Class<?> wildcardClass9 = paint8.getClass();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image3 = null;
        multiplePiePlot1.setBackgroundImage(image3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        java.awt.Paint paint14 = multiplePiePlot10.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot16.getDrawingSupplier();
        multiplePiePlot10.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier20);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D23, rectangle2D24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(drawingSupplier20);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Stroke stroke15 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setForegroundAlpha((float) 0L);
        java.awt.Paint paint15 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.awt.Image image7 = null;
        multiplePiePlot6.setBackgroundImage(image7);
        multiplePiePlot6.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = multiplePiePlot12.getOutlinePaint();
        multiplePiePlot6.setAggregatedItemsPaint(paint13);
        multiplePiePlot1.setAggregatedItemsPaint(paint13);
        java.awt.Font font16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        plot4.handleClick((int) '#', (int) (byte) 1, plotRenderingInfo7);
        org.jfree.chart.plot.Plot plot9 = plot4.getRootPlot();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = multiplePiePlot11.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent18);
        int int20 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(legendItemCollection17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        // The following exception was thrown during execution in test generation
        try {
            plot6.setOutlinePaint(paint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        java.awt.Stroke stroke9 = plot6.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = plot6.getInsets();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        plot4.axisChanged(axisChangeEvent7);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        plot4.notifyListeners(plotChangeEvent9);
        java.awt.Paint paint11 = plot4.getBackgroundPaint();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        float float9 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent16);
        java.awt.Paint paint18 = multiplePiePlot14.getAggregatedItemsPaint();
        multiplePiePlot11.setOutlinePaint(paint18);
        multiplePiePlot1.setNoDataMessagePaint(paint18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot8.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot15.getDrawingSupplier();
        java.awt.Paint paint20 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot8.setBackgroundPaint(paint20);
        multiplePiePlot1.setBackgroundPaint(paint20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(drawingSupplier23);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getParent();
        multiplePiePlot1.setLimit((double) 10);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Point2D point2D20 = null;
        org.jfree.chart.plot.PlotState plotState21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D18, rectangle2D19, point2D20, plotState21, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset1);
        boolean boolean3 = multiplePiePlot2.isSubplot();
        java.awt.Paint paint4 = multiplePiePlot2.getBackgroundPaint();
        java.awt.Paint paint5 = multiplePiePlot2.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot2.setDataset(categoryDataset6);
        java.lang.Object obj8 = multiplePiePlot2.clone();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot4.drawOutline(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        boolean boolean9 = plot6.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (-1), plotRenderingInfo11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot13.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        java.lang.Comparable comparable13 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        multiplePiePlot1.setBackgroundImageAlpha((float) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setForegroundAlpha((float) 0L);
        java.awt.Paint paint15 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D17, rectangle2D18);
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        plot4.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        plot4.handleClick((int) '#', (int) (byte) 1, plotRenderingInfo7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot4.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke6 = plot5.getOutlineStroke();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(plot5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.awt.Image image10 = multiplePiePlot1.getBackgroundImage();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier8);
        org.jfree.chart.util.TableOrder tableOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Point2D point2D10 = null;
        org.jfree.chart.plot.PlotState plotState11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D8, rectangle2D9, point2D10, plotState11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        float float10 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(tableOrder9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Image image15 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot14.setBackgroundImage(image15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Image image8 = null;
        multiplePiePlot7.setBackgroundImage(image8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener13);
        java.awt.Image image15 = multiplePiePlot11.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot11.getPieChart();
        multiplePiePlot7.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent21);
        java.awt.Paint paint23 = null;
        multiplePiePlot19.setBackgroundPaint(paint23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot19.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot19.getDatasetGroup();
        java.awt.Paint paint27 = multiplePiePlot19.getOutlinePaint();
        multiplePiePlot7.setNoDataMessagePaint(paint27);
        multiplePiePlot1.setOutlinePaint(paint27);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D30, rectangle2D31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        java.awt.Paint paint8 = plot4.getNoDataMessagePaint();
        java.awt.Paint paint9 = plot4.getBackgroundPaint();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        multiplePiePlot1.setBackgroundImageAlignment(100);
        java.awt.Paint paint17 = multiplePiePlot1.getOutlinePaint();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Point2D point2D20 = null;
        org.jfree.chart.plot.PlotState plotState21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D18, rectangle2D19, point2D20, plotState21, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        plot6.setBackgroundAlpha((float) (byte) -1);
        java.awt.Paint paint11 = plot6.getOutlinePaint();
        java.awt.Paint paint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot6.setNoDataMessagePaint(paint12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        boolean boolean14 = multiplePiePlot1.isSubplot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.notifyListeners(plotChangeEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setBackgroundAlpha((float) (short) 10);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setBackgroundImageAlignment((int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.Plot plot10 = plot4.getRootPlot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        plot4.datasetChanged(datasetChangeEvent11);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        multiplePiePlot1.setLimit((double) 10.0f);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot6.notifyListeners(plotChangeEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Image image8 = null;
        multiplePiePlot7.setBackgroundImage(image8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener13);
        java.awt.Image image15 = multiplePiePlot11.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot11.getPieChart();
        multiplePiePlot7.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent21);
        java.awt.Paint paint23 = null;
        multiplePiePlot19.setBackgroundPaint(paint23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot19.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot19.getDatasetGroup();
        java.awt.Paint paint27 = multiplePiePlot19.getOutlinePaint();
        multiplePiePlot7.setNoDataMessagePaint(paint27);
        multiplePiePlot1.setOutlinePaint(paint27);
        java.awt.Paint paint30 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset8 = multiplePiePlot1.getDataset();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        multiplePiePlot1.setForegroundAlpha((float) '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot7.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot7.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets15);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        boolean boolean17 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (-1), plotRenderingInfo11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot1.getRootPlot();
        boolean boolean14 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot16.setParent((org.jfree.chart.plot.Plot) multiplePiePlot19);
        java.awt.Stroke stroke24 = multiplePiePlot19.getOutlineStroke();
        multiplePiePlot19.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        multiplePiePlot19.setDataset(categoryDataset27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent29);
        boolean boolean32 = multiplePiePlot19.equals((java.lang.Object) 1L);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent33);
        multiplePiePlot19.zoom((double) 10);
        java.lang.Object obj37 = multiplePiePlot19.clone();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setLimit(10.0d);
        java.lang.Class<?> wildcardClass7 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.zoom((double) 0.0f);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        java.lang.Object obj13 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1L);
        float float12 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        boolean boolean10 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        plot15.markerChanged(markerChangeEvent16);
        float float18 = plot15.getBackgroundImageAlpha();
        java.awt.Paint paint19 = plot15.getBackgroundPaint();
        java.awt.Font font20 = plot15.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        java.awt.Paint paint8 = plot4.getBackgroundPaint();
        java.awt.Font font9 = plot4.getNoDataMessageFont();
        java.lang.Class<?> wildcardClass10 = font9.getClass();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.plot.PlotState plotState14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D11, rectangle2D12, point2D13, plotState14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.notifyListeners(plotChangeEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        java.awt.Paint paint14 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        multiplePiePlot1.setBackgroundAlpha((float) 0);
        java.lang.Class<?> wildcardClass11 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = plot4.getInsets();
        java.lang.Class<?> wildcardClass6 = plot4.getClass();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        plot18.markerChanged(markerChangeEvent19);
        float float21 = plot18.getBackgroundImageAlpha();
        plot18.setBackgroundImageAlpha(0.0f);
        java.awt.Paint paint24 = plot18.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        java.awt.geom.Point2D point2D28 = null;
        org.jfree.chart.plot.PlotState plotState29 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D26, rectangle2D27, point2D28, plotState29, plotRenderingInfo30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot6.setBackgroundPaint(paint10);
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font14 = multiplePiePlot6.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint17 = plot16.getOutlinePaint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(plot16);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setForegroundAlpha((float) 0L);
        multiplePiePlot14.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot14.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jFreeChart20);
        org.junit.Assert.assertNull(categoryDataset22);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot6.setBackgroundPaint(paint10);
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font14 = multiplePiePlot6.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font14);
        double double16 = multiplePiePlot1.getLimit();
        double double17 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        java.awt.Paint paint7 = null;
        multiplePiePlot1.setOutlinePaint(paint7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.lang.Class<?> wildcardClass4 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        multiplePiePlot1.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot1.setDataset(categoryDataset13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        java.awt.geom.Point2D point2D6 = null;
        org.jfree.chart.plot.PlotState plotState7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D4, rectangle2D5, point2D6, plotState7, plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        boolean boolean11 = multiplePiePlot4.isSubplot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = multiplePiePlot13.getAggregatedItemsPaint();
        multiplePiePlot10.setOutlinePaint(paint17);
        java.lang.String str19 = multiplePiePlot10.getPlotType();
        java.lang.String str20 = multiplePiePlot10.getNoDataMessage();
        float float21 = multiplePiePlot10.getBackgroundImageAlpha();
        multiplePiePlot10.setLimit(100.0d);
        java.awt.Paint paint24 = multiplePiePlot10.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D26, rectangle2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Multiple Pie Plot" + "'", str19, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        plot11.markerChanged(markerChangeEvent12);
        float float14 = plot11.getBackgroundImageAlpha();
        java.awt.Paint paint15 = plot11.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint15);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot17.markerChanged(markerChangeEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(plot17);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Image image14 = multiplePiePlot1.getBackgroundImage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = image14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(image14);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        float float11 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot8.setBackgroundAlpha((float) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        multiplePiePlot15.setForegroundAlpha((float) 0L);
        multiplePiePlot15.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot15.getPieChart();
        multiplePiePlot8.setPieChart(jFreeChart21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        java.awt.Paint paint31 = multiplePiePlot27.getAggregatedItemsPaint();
        multiplePiePlot24.setOutlinePaint(paint31);
        java.lang.String str33 = multiplePiePlot24.getPlotType();
        java.awt.Paint paint34 = multiplePiePlot24.getOutlinePaint();
        multiplePiePlot8.setOutlinePaint(paint34);
        multiplePiePlot1.setNoDataMessagePaint(paint34);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Multiple Pie Plot" + "'", str33, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        java.awt.Image image12 = null;
        multiplePiePlot10.setBackgroundImage(image12);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.plot.PlotState plotState18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot10.draw(graphics2D15, rectangle2D16, point2D17, plotState18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertNull(plot7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        plot4.zoom(0.0d);
        float float9 = plot4.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        plot4.axisChanged(axisChangeEvent10);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        java.awt.Paint paint8 = multiplePiePlot6.getBackgroundPaint();
        float float9 = multiplePiePlot6.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = null;
        multiplePiePlot11.setBackgroundPaint(paint15);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font19 = multiplePiePlot11.getNoDataMessageFont();
        multiplePiePlot6.setNoDataMessageFont(font19);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot6.getParent();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot6.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        multiplePiePlot1.setLimit((-1.0d));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.Plot plot10 = plot4.getRootPlot();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot4.drawOutline(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot6.setBackgroundPaint(paint10);
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font14 = multiplePiePlot6.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font14);
        double double16 = multiplePiePlot1.getLimit();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot1.setOutlineStroke(stroke17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        float float17 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
        multiplePiePlot1.setNoDataMessage("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.lang.Class<?> wildcardClass15 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(legendItemCollection7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Image image14 = multiplePiePlot1.getBackgroundImage();
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        java.awt.Paint paint6 = multiplePiePlot4.getBackgroundPaint();
        java.awt.Paint paint7 = multiplePiePlot4.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot4.setDataset(categoryDataset8);
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot4.removeChangeListener(plotChangeListener10);
        boolean boolean12 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot4);
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        double double14 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setBackgroundImageAlignment(1);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.notifyListeners(plotChangeEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot3.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Stroke stroke11 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke11);
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot1.getDataExtractOrder();
        float float14 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(tableOrder13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot4.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.awt.Image image7 = null;
        multiplePiePlot6.setBackgroundImage(image7);
        multiplePiePlot6.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Paint paint13 = multiplePiePlot12.getOutlinePaint();
        multiplePiePlot6.setAggregatedItemsPaint(paint13);
        multiplePiePlot1.setAggregatedItemsPaint(paint13);
        multiplePiePlot1.setForegroundAlpha((float) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.awt.Image image10 = null;
        multiplePiePlot4.setBackgroundImage(image10);
        multiplePiePlot4.setBackgroundImageAlignment((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder12 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(tableOrder11);
        org.junit.Assert.assertNotNull(tableOrder12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        multiplePiePlot8.setOutlinePaint(paint15);
        multiplePiePlot1.setBackgroundPaint(paint15);
        java.awt.Paint paint18 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(tableOrder19);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        float float13 = multiplePiePlot1.getBackgroundAlpha();
        java.lang.String str14 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setOutlineVisible(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        multiplePiePlot1.setBackgroundImageAlpha(0.5f);
        boolean boolean6 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.plot.PlotState plotState18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D15, rectangle2D16, point2D17, plotState18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint13 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        java.awt.Paint paint14 = multiplePiePlot10.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot10.setDataset(categoryDataset15);
        java.awt.Font font17 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font17);
        java.lang.Comparable comparable19 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Other" + "'", comparable19, "Other");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot1.handleClick(1, 10, plotRenderingInfo14);
        java.awt.Paint paint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessagePaint(paint16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        plot11.markerChanged(markerChangeEvent12);
        float float14 = plot11.getBackgroundImageAlpha();
        java.awt.Paint paint15 = plot11.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint15);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot17.drawBackground(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(plot17);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Paint paint14 = multiplePiePlot1.getBackgroundPaint();
        float float15 = multiplePiePlot1.getBackgroundImageAlpha();
        float float16 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.plot.Plot plot9 = null;
        multiplePiePlot1.setParent(plot9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        float float11 = multiplePiePlot1.getBackgroundAlpha();
        int int12 = multiplePiePlot1.getBackgroundImageAlignment();
        float float13 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        multiplePiePlot1.setForegroundAlpha((float) '#');
        float float8 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        double double10 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot4.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        plot13.handleClick(0, 15, plotRenderingInfo16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        boolean boolean17 = multiplePiePlot4.equals((java.lang.Object) 1L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot4.removeChangeListener(plotChangeListener18);
        java.lang.Class<?> wildcardClass20 = multiplePiePlot4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        java.awt.Font font17 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Stroke stroke18 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(plot19);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        multiplePiePlot1.setLimit(0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        float float11 = multiplePiePlot1.getBackgroundImageAlpha();
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        java.lang.Class<?> wildcardClass13 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick((int) (short) 0, 0, plotRenderingInfo9);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0);
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        java.awt.Image image12 = null;
        multiplePiePlot10.setBackgroundImage(image12);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        multiplePiePlot1.setOutlineVisible(true);
        java.lang.Class<?> wildcardClass12 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        double double10 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(categoryDataset9);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        java.awt.Image image9 = null;
        multiplePiePlot7.setBackgroundImage(image9);
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot14.getDataExtractOrder();
        multiplePiePlot7.setDataExtractOrder(tableOrder18);
        multiplePiePlot1.setDataExtractOrder(tableOrder18);
        multiplePiePlot1.setLimit((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tableOrder18);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        plot16.markerChanged(markerChangeEvent17);
        float float19 = plot16.getBackgroundImageAlpha();
        java.awt.Paint paint20 = plot16.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.lang.String str4 = multiplePiePlot1.getPlotType();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        java.awt.Paint paint13 = multiplePiePlot11.getBackgroundPaint();
        java.awt.Paint paint14 = multiplePiePlot11.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot11.setDataset(categoryDataset15);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot11.removeChangeListener(plotChangeListener17);
        java.awt.Font font19 = multiplePiePlot11.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Multiple Pie Plot" + "'", str4, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        java.awt.Paint paint13 = multiplePiePlot11.getBackgroundPaint();
        java.awt.Paint paint14 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot11.setLimit((double) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot11.getInsets();
        // The following exception was thrown during execution in test generation
        try {
            plot9.setInsets(rectangleInsets17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        multiplePiePlot8.setOutlinePaint(paint15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setForegroundAlpha((float) 0L);
        java.awt.Paint paint22 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot8.setAggregatedItemsPaint(paint22);
        multiplePiePlot1.setAggregatedItemsPaint(paint22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setBackgroundAlpha((float) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(tableOrder10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint13 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot8.getLegendItems();
        multiplePiePlot8.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot18.getDataExtractOrder();
        multiplePiePlot8.setDataExtractOrder(tableOrder22);
        boolean boolean24 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        multiplePiePlot8.setForegroundAlpha((float) (byte) 10);
        multiplePiePlot8.setNoDataMessage("");
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot8.setBackgroundImageAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tableOrder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.setForegroundAlpha((float) 0L);
        java.awt.Paint paint12 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot8.setDataset(categoryDataset13);
        multiplePiePlot8.setLimit((double) 10.0f);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot8.getRootPlot();
        boolean boolean18 = multiplePiePlot1.equals((java.lang.Object) plot17);
        plot17.zoom((double) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(tableOrder5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        java.awt.Image image12 = null;
        multiplePiePlot10.setBackgroundImage(image12);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.lang.String str18 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent15);
        java.awt.Paint paint17 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(jFreeChart18);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        java.lang.Class<?> wildcardClass11 = tableOrder10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(tableOrder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot1.getPieChart();
        double double14 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.lang.String str9 = multiplePiePlot1.getPlotType();
        java.lang.String str10 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        double double11 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        boolean boolean6 = multiplePiePlot1.isSubplot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot7.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent11);
        multiplePiePlot4.zoom((double) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot4.getLegendItems();
        java.lang.Object obj16 = multiplePiePlot4.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        java.awt.Paint paint8 = plot4.getBackgroundPaint();
        plot4.zoom((double) 0L);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        plot4.drawBackgroundImage(graphics2D11, rectangle2D12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = plot4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot4.setDataset(categoryDataset16);
        int int18 = multiplePiePlot4.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 100);
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setAggregatedItemsPaint(paint9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        multiplePiePlot1.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = multiplePiePlot11.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot11.getLegendItems();
        java.awt.Paint paint18 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint18);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(legendItemCollection17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(legendItemCollection20);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot11.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tableOrder15);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        java.awt.Paint paint16 = multiplePiePlot11.getNoDataMessagePaint();
        boolean boolean17 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot11);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot1.getPieChart();
        java.lang.Class<?> wildcardClass19 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot3.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Stroke stroke11 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot1.setDataset(categoryDataset13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            plot6.setNoDataMessage("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        java.awt.Paint paint16 = multiplePiePlot11.getNoDataMessagePaint();
        boolean boolean17 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot11);
        java.awt.Paint paint18 = multiplePiePlot11.getAggregatedItemsPaint();
        java.awt.Paint paint19 = multiplePiePlot11.getBackgroundPaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot11.setBackgroundImageAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setBackgroundPaint(paint6);
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetGroup datasetGroup9 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(datasetGroup9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(datasetGroup12);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        java.awt.Stroke stroke9 = null;
        multiplePiePlot1.setOutlineStroke(stroke9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        java.awt.Paint paint8 = plot4.getNoDataMessagePaint();
        plot4.setNoDataMessage("Other");
        plot4.setNoDataMessage("hi!");
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        plot11.markerChanged(markerChangeEvent12);
        float float14 = plot11.getBackgroundImageAlpha();
        java.awt.Paint paint15 = plot11.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint15);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke18 = plot17.getOutlineStroke();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(plot17);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        boolean boolean11 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
        java.lang.String str18 = multiplePiePlot10.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot10.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier19);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick(100, (int) (short) 1, plotRenderingInfo9);
        double double11 = multiplePiePlot1.getLimit();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        java.lang.String str4 = multiplePiePlot3.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        multiplePiePlot3.addChangeListener(plotChangeListener5);
        java.awt.Image image7 = multiplePiePlot3.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot3.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot3.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setBackgroundAlpha((float) 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setForegroundAlpha((float) '4');
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(tableOrder11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        java.awt.Paint paint7 = null;
        multiplePiePlot1.setOutlinePaint(paint7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(tableOrder11);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot11.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        boolean boolean19 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        java.awt.Paint paint5 = multiplePiePlot3.getBackgroundPaint();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot3);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot3.setDataset(categoryDataset7);
        boolean boolean9 = multiplePiePlot3.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        float float17 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset20);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        boolean boolean13 = multiplePiePlot9.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot16.getDrawingSupplier();
        java.awt.Paint paint21 = multiplePiePlot16.getNoDataMessagePaint();
        multiplePiePlot9.setBackgroundPaint(paint21);
        multiplePiePlot1.setAggregatedItemsPaint(paint21);
        java.awt.Image image24 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(image24);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.plot.PlotState plotState14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D11, rectangle2D12, point2D13, plotState14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        boolean boolean9 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Image image12 = null;
        multiplePiePlot11.setBackgroundImage(image12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        java.awt.Image image19 = multiplePiePlot15.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot15.getPieChart();
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot11.getDataset();
        multiplePiePlot11.setBackgroundImageAlpha((float) 0);
        multiplePiePlot11.setBackgroundImageAlignment(100);
        java.awt.Paint paint27 = multiplePiePlot11.getOutlinePaint();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot11.getRootPlot();
        multiplePiePlot1.setParent(plot28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(jFreeChart20);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(plot28);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot4.setDataset(categoryDataset14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot4.handleClick((int) (short) 0, (int) (short) 10, plotRenderingInfo18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        java.awt.Paint paint8 = plot4.getBackgroundPaint();
        plot4.zoom((double) 0L);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot4.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        boolean boolean14 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jFreeChart15);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot3.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Stroke stroke11 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke11);
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot1.getDataExtractOrder();
        java.lang.Comparable comparable14 = multiplePiePlot1.getAggregatedItemsKey();
        float float15 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(tableOrder13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundAlpha((float) (short) 10);
        java.lang.String str16 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(tableOrder7);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        java.awt.Paint paint5 = multiplePiePlot3.getBackgroundPaint();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot3);
        org.jfree.chart.JFreeChart jFreeChart7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot3.setPieChart(jFreeChart7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot17.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        multiplePiePlot17.setDataset(categoryDataset25);
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot17.getPieChart();
        // The following exception was thrown during execution in test generation
        try {
            plot15.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jFreeChart27);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener7);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Paint paint20 = multiplePiePlot16.getAggregatedItemsPaint();
        multiplePiePlot13.setOutlinePaint(paint20);
        java.lang.String str22 = multiplePiePlot13.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot13.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, 10, plotRenderingInfo27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Multiple Pie Plot" + "'", str22, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart23);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setBackgroundPaint(paint6);
        java.lang.Class<?> wildcardClass8 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        float float11 = multiplePiePlot1.getBackgroundImageAlpha();
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot6.setBackgroundPaint(paint10);
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font14 = multiplePiePlot6.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = plot16.getDrawingSupplier();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(plot16);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        plot18.markerChanged(markerChangeEvent19);
        float float21 = plot18.getBackgroundImageAlpha();
        plot18.setBackgroundImageAlpha(0.0f);
        java.awt.Paint paint24 = plot18.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint24);
        float float26 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart27);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.lang.Comparable comparable15 = multiplePiePlot1.getAggregatedItemsKey();
        boolean boolean16 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.zoom((double) 1.0f);
        float float16 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(tableOrder13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot10.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot1.setDataset(categoryDataset22);
        java.awt.Paint paint24 = null;
        multiplePiePlot1.setOutlinePaint(paint24);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 100);
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.Object obj9 = multiplePiePlot1.clone();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        multiplePiePlot1.setForegroundAlpha(35.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Class<?> wildcardClass9 = comparable8.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        java.awt.Image image12 = multiplePiePlot10.getBackgroundImage();
        java.awt.Paint paint13 = multiplePiePlot10.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        boolean boolean11 = multiplePiePlot7.isSubplot();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot7.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = plot12.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        float float11 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint12 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Image image15 = plot14.getBackgroundImage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Font font4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(tableOrder3);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D12, rectangle2D13);
        java.awt.Font font15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(tableOrder11);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint11 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) true);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        java.lang.String str16 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        java.awt.Paint paint5 = multiplePiePlot3.getBackgroundPaint();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot3);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot3.setDataset(categoryDataset7);
        boolean boolean9 = multiplePiePlot3.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        java.awt.Image image9 = null;
        multiplePiePlot7.setBackgroundImage(image9);
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot14.getDataExtractOrder();
        multiplePiePlot7.setDataExtractOrder(tableOrder18);
        multiplePiePlot1.setDataExtractOrder(tableOrder18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        java.awt.Paint paint26 = null;
        multiplePiePlot22.setBackgroundPaint(paint26);
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        boolean boolean30 = multiplePiePlot22.isSubplot();
        double double31 = multiplePiePlot22.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        boolean boolean34 = multiplePiePlot33.isSubplot();
        java.awt.Paint paint35 = multiplePiePlot33.getBackgroundPaint();
        java.awt.Paint paint36 = multiplePiePlot33.getNoDataMessagePaint();
        multiplePiePlot33.setLimit((double) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = multiplePiePlot33.getInsets();
        multiplePiePlot22.setInsets(rectangleInsets39, false);
        multiplePiePlot1.setInsets(rectangleInsets39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tableOrder18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(rectangleInsets39);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Point2D point2D10 = null;
        org.jfree.chart.plot.PlotState plotState11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D8, rectangle2D9, point2D10, plotState11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        float float9 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint10 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        float float13 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setNoDataMessage("Other");
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot1.setOutlinePaint(paint10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        java.lang.Comparable comparable13 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent14);
        java.awt.Image image16 = null;
        multiplePiePlot1.setBackgroundImage(image16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot3.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Stroke stroke11 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setForegroundAlpha((float) 0L);
        java.awt.Paint paint15 = multiplePiePlot11.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot11.setDataset(categoryDataset16);
        multiplePiePlot11.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot11.getDataset();
        multiplePiePlot11.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener26);
        java.awt.Image image28 = multiplePiePlot24.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot24.getPieChart();
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertNotNull(jFreeChart29);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = plot4.getInsets();
        java.awt.Stroke stroke6 = plot4.getOutlineStroke();
        boolean boolean7 = plot4.isSubplot();
        org.jfree.chart.plot.Plot plot8 = plot4.getParent();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot3.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Stroke stroke11 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        java.awt.Image image17 = null;
        multiplePiePlot15.setBackgroundImage(image17);
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        multiplePiePlot22.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder26 = multiplePiePlot22.getDataExtractOrder();
        multiplePiePlot15.setDataExtractOrder(tableOrder26);
        multiplePiePlot1.setDataExtractOrder(tableOrder26);
        multiplePiePlot1.setBackgroundAlpha(100.0f);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        java.awt.geom.Point2D point2D33 = null;
        org.jfree.chart.plot.PlotState plotState34 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D31, rectangle2D32, point2D33, plotState34, plotRenderingInfo35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tableOrder26);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        multiplePiePlot1.setForegroundAlpha((float) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        multiplePiePlot1.setForegroundAlpha((float) '#');
        float float8 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        float float14 = multiplePiePlot10.getForegroundAlpha();
        multiplePiePlot10.zoom((double) 0.0f);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent17);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot19.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot19.getInsets();
        multiplePiePlot10.setInsets(rectangleInsets22);
        multiplePiePlot1.setInsets(rectangleInsets22);
        java.lang.Comparable comparable25 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + "Other" + "'", comparable25, "Other");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot1.getLegendItems();
        java.awt.Font font18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setBackgroundPaint(paint6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D8, rectangle2D9);
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        multiplePiePlot1.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = multiplePiePlot11.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot11.getLegendItems();
        java.awt.Paint paint18 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint18);
        boolean boolean20 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(legendItemCollection17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.zoom((double) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot1.setDataset(categoryDataset11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot9.handleClick((int) (short) -1, (-1), plotRenderingInfo19);
        multiplePiePlot9.setForegroundAlpha((float) (-1));
        java.awt.Paint paint23 = multiplePiePlot9.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot9.setDataset(categoryDataset24);
        java.awt.Paint paint26 = multiplePiePlot9.getOutlinePaint();
        multiplePiePlot1.setOutlinePaint(paint26);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot8.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot15.getDrawingSupplier();
        java.awt.Paint paint20 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot8.setBackgroundPaint(paint20);
        multiplePiePlot1.setBackgroundPaint(paint20);
        java.awt.Paint paint23 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot1.handleClick(0, (int) '4', plotRenderingInfo26);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D28, rectangle2D29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundImageAlignment(0);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Point2D point2D14 = null;
        org.jfree.chart.plot.PlotState plotState15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot4.draw(graphics2D12, rectangle2D13, point2D14, plotState15, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        java.awt.Paint paint8 = plot4.getBackgroundPaint();
        plot4.zoom((double) 0L);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        plot4.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint14 = plot4.getOutlinePaint();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.Plot plot10 = plot4.getRootPlot();
        java.awt.Image image11 = plot10.getBackgroundImage();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image3 = null;
        multiplePiePlot1.setBackgroundImage(image3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = null;
        multiplePiePlot7.setBackgroundPaint(paint11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot7.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot7.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot16.setParent((org.jfree.chart.plot.Plot) multiplePiePlot19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot16.getDrawingSupplier();
        multiplePiePlot7.setDrawingSupplier(drawingSupplier24);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier24);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent27 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent27);
        java.awt.Font font29 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(drawingSupplier24);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        plot11.markerChanged(markerChangeEvent12);
        float float14 = plot11.getBackgroundImageAlpha();
        java.awt.Paint paint15 = plot11.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint15);
        boolean boolean18 = multiplePiePlot1.equals((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot4.getInsets();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        java.lang.String str13 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        java.lang.Comparable comparable5 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setForegroundAlpha((float) 100);
        java.lang.Class<?> wildcardClass8 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + "Other" + "'", comparable5, "Other");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D3, rectangle2D4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot12.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier21);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot20.getParent();
        multiplePiePlot20.setForegroundAlpha((float) '#');
        java.awt.Paint paint27 = multiplePiePlot20.getOutlinePaint();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        java.lang.Class<?> wildcardClass29 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNull(plot24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setBackgroundImageAlignment(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot8.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot15.getDrawingSupplier();
        java.awt.Paint paint20 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot8.setBackgroundPaint(paint20);
        multiplePiePlot1.setBackgroundPaint(paint20);
        multiplePiePlot1.setBackgroundAlpha((float) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        boolean boolean12 = multiplePiePlot1.isSubplot();
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image3 = null;
        multiplePiePlot1.setBackgroundImage(image3);
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        multiplePiePlot4.setLimit((double) 0.5f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Image image12 = null;
        multiplePiePlot1.setBackgroundImage(image12);
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot1.getDataExtractOrder();
        float float15 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(tableOrder14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener7);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Paint paint20 = multiplePiePlot16.getAggregatedItemsPaint();
        multiplePiePlot13.setOutlinePaint(paint20);
        java.lang.String str22 = multiplePiePlot13.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot13.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        java.awt.geom.Point2D point2D27 = null;
        org.jfree.chart.plot.PlotState plotState28 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D25, rectangle2D26, point2D27, plotState28, plotRenderingInfo29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Multiple Pie Plot" + "'", str22, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart23);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent13);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Image image12 = null;
        multiplePiePlot1.setBackgroundImage(image12);
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot1.getDataExtractOrder();
        float float15 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(tableOrder14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = null;
        multiplePiePlot13.setBackgroundPaint(paint17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot13.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup20 = multiplePiePlot13.getDatasetGroup();
        java.awt.Paint paint21 = multiplePiePlot13.getOutlinePaint();
        multiplePiePlot4.setNoDataMessagePaint(paint21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        java.awt.Paint paint8 = plot4.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot4.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image3 = null;
        multiplePiePlot1.setBackgroundImage(image3);
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder12 = multiplePiePlot8.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tableOrder12);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot4.getRootPlot();
        float float14 = multiplePiePlot4.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        float float10 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.Object obj10 = multiplePiePlot1.clone();
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Font font13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        multiplePiePlot1.setForegroundAlpha((float) '#');
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Point2D point2D10 = null;
        org.jfree.chart.plot.PlotState plotState11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D8, rectangle2D9, point2D10, plotState11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(plot5);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        multiplePiePlot1.setForegroundAlpha((float) '#');
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener11);
        java.awt.Image image13 = multiplePiePlot9.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot9.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot9.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot9.setDataset(categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier20);
        boolean boolean23 = multiplePiePlot19.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint24 = multiplePiePlot19.getOutlinePaint();
        multiplePiePlot9.setBackgroundPaint(paint24);
        multiplePiePlot1.setOutlinePaint(paint24);
        double double27 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.awt.Image image10 = multiplePiePlot1.getBackgroundImage();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        boolean boolean12 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot1.setDataset(categoryDataset11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(legendItemCollection15);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        java.awt.Paint paint11 = multiplePiePlot9.getBackgroundPaint();
        multiplePiePlot9.setForegroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Paint paint22 = multiplePiePlot18.getAggregatedItemsPaint();
        multiplePiePlot15.setOutlinePaint(paint22);
        java.lang.String str24 = multiplePiePlot15.getPlotType();
        java.lang.String str25 = multiplePiePlot15.getNoDataMessage();
        float float26 = multiplePiePlot15.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot15.getPieChart();
        multiplePiePlot9.setPieChart(jFreeChart27);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Multiple Pie Plot" + "'", str24, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart27);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        boolean boolean17 = multiplePiePlot4.equals((java.lang.Object) 1L);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent18);
        multiplePiePlot4.zoom((double) 10);
        java.lang.String str22 = multiplePiePlot4.getPlotType();
        float float23 = multiplePiePlot4.getForegroundAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot4.handleClick((int) (byte) 1, (int) ' ', plotRenderingInfo26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot4.handleClick((int) (byte) 10, 10, plotRenderingInfo30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Multiple Pie Plot" + "'", str22, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        boolean boolean13 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        java.awt.Paint paint6 = multiplePiePlot4.getBackgroundPaint();
        java.awt.Paint paint7 = multiplePiePlot4.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot4.setDataset(categoryDataset8);
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot4.removeChangeListener(plotChangeListener10);
        boolean boolean12 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        java.lang.Comparable comparable15 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        multiplePiePlot1.zoom(0.0d);
        boolean boolean11 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        float float9 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(tableOrder10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        java.awt.Paint paint19 = multiplePiePlot15.getAggregatedItemsPaint();
        multiplePiePlot12.setOutlinePaint(paint19);
        java.lang.String str21 = multiplePiePlot12.getPlotType();
        java.awt.Paint paint22 = multiplePiePlot12.getAggregatedItemsPaint();
        java.awt.Image image23 = null;
        multiplePiePlot12.setBackgroundImage(image23);
        org.jfree.chart.util.TableOrder tableOrder25 = multiplePiePlot12.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder25);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(tableOrder25);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundAlpha((float) (short) 10);
        java.lang.Class<?> wildcardClass16 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setForegroundAlpha((float) '4');
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot14.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot14.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets17, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot1.handleClick((-1), 1, plotRenderingInfo22);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(tableOrder11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        multiplePiePlot1.setBackgroundImageAlpha(0.5f);
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(tableOrder9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(tableOrder10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot11);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.Object obj10 = multiplePiePlot1.clone();
        multiplePiePlot1.setOutlineVisible(false);
        boolean boolean13 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        double double10 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        int int7 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.awt.Image image8 = multiplePiePlot1.getBackgroundImage();
        float float9 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        double double13 = multiplePiePlot1.getLimit();
        double double14 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset15);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot1.getInsets();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.awt.Stroke stroke7 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.TableOrder tableOrder12 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setBackgroundAlpha((float) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(tableOrder12);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        double double13 = multiplePiePlot1.getLimit();
        double double14 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets10, true);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setForegroundAlpha((float) 0L);
        java.awt.Paint paint18 = multiplePiePlot14.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint18);
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(plot20);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNotNull(tableOrder10);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setBackgroundImageAlignment((int) (short) 10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot0.addChangeListener(plotChangeListener3);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        multiplePiePlot10.setOutlineVisible(true);
        java.awt.Font font16 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font16);
        multiplePiePlot1.zoom((double) 10L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setLimit(100.0d);
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getParent();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot18.axisChanged(axisChangeEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(plot18);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setLimit((double) 10.0f);
        float float16 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(tableOrder13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            float float16 = plot15.getForegroundAlpha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.zoom((-1.0d));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot3.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Stroke stroke11 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        java.awt.Image image17 = null;
        multiplePiePlot15.setBackgroundImage(image17);
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        multiplePiePlot22.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder26 = multiplePiePlot22.getDataExtractOrder();
        multiplePiePlot15.setDataExtractOrder(tableOrder26);
        multiplePiePlot1.setDataExtractOrder(tableOrder26);
        multiplePiePlot1.setBackgroundAlpha(100.0f);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tableOrder26);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.lang.String str4 = multiplePiePlot1.getPlotType();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        java.awt.Paint paint10 = multiplePiePlot8.getBackgroundPaint();
        float float11 = multiplePiePlot8.getForegroundAlpha();
        boolean boolean12 = multiplePiePlot8.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup13 = multiplePiePlot8.getDatasetGroup();
        multiplePiePlot8.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot8.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot18.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener26);
        java.awt.Image image28 = multiplePiePlot24.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot24.getPieChart();
        multiplePiePlot24.setBackgroundImageAlpha(1.0f);
        multiplePiePlot24.setBackgroundAlpha((float) 0);
        multiplePiePlot24.zoom((double) 1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        boolean boolean38 = multiplePiePlot37.isSubplot();
        multiplePiePlot37.setForegroundAlpha((float) 0L);
        multiplePiePlot37.setLimit((double) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart43 = multiplePiePlot37.getPieChart();
        multiplePiePlot24.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart43);
        multiplePiePlot18.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart43);
        multiplePiePlot8.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart43);
        multiplePiePlot1.setPieChart(jFreeChart43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Multiple Pie Plot" + "'", str4, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertNotNull(jFreeChart29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jFreeChart43);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        float float13 = multiplePiePlot1.getBackgroundAlpha();
        java.lang.String str14 = multiplePiePlot1.getPlotType();
        java.lang.Comparable comparable15 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Point2D point2D18 = null;
        org.jfree.chart.plot.PlotState plotState19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D16, rectangle2D17, point2D18, plotState19, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick((int) (short) 0, 0, plotRenderingInfo9);
        java.lang.Object obj11 = null;
        boolean boolean12 = multiplePiePlot1.equals(obj11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryDataset18);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 0 + "'", comparable9, (short) 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        java.lang.Class<?> wildcardClass10 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener7);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Paint paint20 = multiplePiePlot16.getAggregatedItemsPaint();
        multiplePiePlot13.setOutlinePaint(paint20);
        java.lang.String str22 = multiplePiePlot13.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot13.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D25, rectangle2D26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Multiple Pie Plot" + "'", str22, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart23);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint13 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot8.getLegendItems();
        multiplePiePlot8.setLimit((double) (-1L));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent17);
        multiplePiePlot8.zoom((double) 10.0f);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot8.getParent();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot8.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart22);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertNotNull(jFreeChart22);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        boolean boolean17 = multiplePiePlot4.equals((java.lang.Object) 1L);
        multiplePiePlot4.zoom((double) 1L);
        org.jfree.data.general.DatasetGroup datasetGroup20 = multiplePiePlot4.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(datasetGroup20);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint8);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets10, true);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setForegroundAlpha((float) 0L);
        java.awt.Paint paint18 = multiplePiePlot14.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint18);
        multiplePiePlot1.setOutlineVisible(false);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        java.awt.Paint paint16 = multiplePiePlot11.getNoDataMessagePaint();
        boolean boolean17 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot11);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        multiplePiePlot1.handleClick(15, (int) '4', plotRenderingInfo21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jFreeChart18);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Paint paint16 = multiplePiePlot12.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener20);
        java.awt.Image image22 = multiplePiePlot18.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot18.getPieChart();
        multiplePiePlot12.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        java.awt.Stroke stroke25 = multiplePiePlot12.getOutlineStroke();
        multiplePiePlot12.setBackgroundImageAlignment(1);
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertNotNull(jFreeChart29);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        multiplePiePlot4.setForegroundAlpha((float) (byte) 1);
        float float18 = multiplePiePlot4.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot4.getPieChart();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot4.handleClick((-1), 15, plotRenderingInfo22);
        java.lang.String str24 = multiplePiePlot4.getNoDataMessage();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot4.drawBackground(graphics2D25, rectangle2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        java.awt.Paint paint5 = multiplePiePlot3.getBackgroundPaint();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot3);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot3.datasetChanged(datasetChangeEvent7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        java.awt.Paint paint14 = multiplePiePlot10.getNoDataMessagePaint();
        boolean boolean15 = multiplePiePlot3.equals((java.lang.Object) multiplePiePlot10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (-1), plotRenderingInfo11);
        multiplePiePlot1.setForegroundAlpha((float) (-1));
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        boolean boolean17 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        boolean boolean17 = multiplePiePlot4.equals((java.lang.Object) 1L);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent18);
        multiplePiePlot4.zoom((double) 10);
        java.lang.String str22 = multiplePiePlot4.getPlotType();
        multiplePiePlot4.setBackgroundAlpha((float) (short) 0);
        multiplePiePlot4.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.util.TableOrder tableOrder27 = multiplePiePlot4.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Multiple Pie Plot" + "'", str22, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(tableOrder27);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        java.awt.Paint paint6 = multiplePiePlot4.getBackgroundPaint();
        java.awt.Paint paint7 = multiplePiePlot4.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot4.setDataset(categoryDataset8);
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot4.removeChangeListener(plotChangeListener10);
        boolean boolean12 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot4);
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot4.getDataExtractOrder();
        multiplePiePlot4.setBackgroundAlpha((float) (byte) -1);
        java.awt.Image image16 = multiplePiePlot4.getBackgroundImage();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tableOrder13);
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.setForegroundAlpha((float) 0L);
        java.awt.Paint paint12 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot8.setDataset(categoryDataset13);
        multiplePiePlot8.setLimit((double) 10.0f);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot8.getRootPlot();
        boolean boolean18 = multiplePiePlot1.equals((java.lang.Object) plot17);
        multiplePiePlot1.setBackgroundAlpha((float) 10);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D23, rectangle2D24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        java.awt.Paint paint16 = multiplePiePlot11.getNoDataMessagePaint();
        boolean boolean17 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot11);
        java.awt.Paint paint18 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot11.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot11.getInsets();
        boolean boolean21 = multiplePiePlot11.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        boolean boolean9 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setBackgroundAlpha((float) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        multiplePiePlot1.setForegroundAlpha((float) (short) 0);
        boolean boolean12 = multiplePiePlot1.equals((java.lang.Object) 100.0f);
        float float13 = multiplePiePlot1.getForegroundAlpha();
        java.lang.Class<?> wildcardClass14 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Image image12 = null;
        multiplePiePlot1.setBackgroundImage(image12);
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setNoDataMessage("Other");
        float float18 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(tableOrder14);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        plot11.markerChanged(markerChangeEvent12);
        float float14 = plot11.getBackgroundImageAlpha();
        java.awt.Paint paint15 = plot11.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint15);
        java.lang.Class<?> wildcardClass17 = paint15.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        boolean boolean8 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = multiplePiePlot13.getAggregatedItemsPaint();
        multiplePiePlot10.setOutlinePaint(paint17);
        java.lang.String str19 = multiplePiePlot10.getPlotType();
        java.lang.String str20 = multiplePiePlot10.getNoDataMessage();
        float float21 = multiplePiePlot10.getBackgroundImageAlpha();
        java.awt.Paint paint22 = multiplePiePlot10.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Multiple Pie Plot" + "'", str19, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot7.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Stroke stroke15 = multiplePiePlot10.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke15);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Paint paint14 = multiplePiePlot1.getBackgroundPaint();
        float float15 = multiplePiePlot1.getBackgroundImageAlpha();
        float float16 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean17 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setForegroundAlpha((float) 15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick((int) (short) -1, 10, plotRenderingInfo9);
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = multiplePiePlot17.getAggregatedItemsPaint();
        multiplePiePlot14.setOutlinePaint(paint21);
        java.lang.String str23 = multiplePiePlot14.getPlotType();
        java.lang.String str24 = multiplePiePlot14.getNoDataMessage();
        float float25 = multiplePiePlot14.getBackgroundImageAlpha();
        multiplePiePlot14.setLimit(100.0d);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        boolean boolean30 = multiplePiePlot29.isSubplot();
        multiplePiePlot29.setForegroundAlpha((float) 0L);
        java.awt.Paint paint33 = multiplePiePlot29.getNoDataMessagePaint();
        multiplePiePlot14.setAggregatedItemsPaint(paint33);
        multiplePiePlot1.setBackgroundPaint(paint33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tableOrder11);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Multiple Pie Plot" + "'", str23, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = null;
        plot6.setBackgroundImage(image7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = plot6.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(datasetGroup9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setLimit((double) 100L);
        java.awt.Stroke stroke15 = multiplePiePlot1.getOutlineStroke();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Point2D point2D18 = null;
        org.jfree.chart.plot.PlotState plotState19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D16, rectangle2D17, point2D18, plotState19, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot6.setBackgroundPaint(paint10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot6.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup13 = multiplePiePlot6.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        java.awt.Image image19 = multiplePiePlot15.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot15.getDataset();
        java.awt.Paint paint21 = multiplePiePlot15.getAggregatedItemsPaint();
        multiplePiePlot6.setAggregatedItemsPaint(paint21);
        multiplePiePlot1.setNoDataMessagePaint(paint21);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        java.lang.String str5 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setBackgroundImageAlignment(100);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        java.awt.Paint paint8 = plot4.getBackgroundPaint();
        java.awt.Font font9 = plot4.getNoDataMessageFont();
        plot4.setForegroundAlpha((float) 100);
        boolean boolean12 = plot4.isOutlineVisible();
        float float13 = plot4.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        java.awt.Paint paint17 = multiplePiePlot15.getBackgroundPaint();
        float float18 = multiplePiePlot15.getForegroundAlpha();
        boolean boolean19 = multiplePiePlot15.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup20 = multiplePiePlot15.getDatasetGroup();
        multiplePiePlot15.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot15.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = multiplePiePlot25.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        java.lang.String str32 = multiplePiePlot31.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot31.addChangeListener(plotChangeListener33);
        java.awt.Image image35 = multiplePiePlot31.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart36 = multiplePiePlot31.getPieChart();
        multiplePiePlot31.setBackgroundImageAlpha(1.0f);
        multiplePiePlot31.setBackgroundAlpha((float) 0);
        multiplePiePlot31.zoom((double) 1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        boolean boolean45 = multiplePiePlot44.isSubplot();
        multiplePiePlot44.setForegroundAlpha((float) 0L);
        multiplePiePlot44.setLimit((double) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart50 = multiplePiePlot44.getPieChart();
        multiplePiePlot31.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        multiplePiePlot25.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        multiplePiePlot15.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        plot4.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNotNull(jFreeChart36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jFreeChart50);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = null;
        plot6.setBackgroundImage(image7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        plot6.drawBackgroundImage(graphics2D9, rectangle2D10);
        java.awt.Paint paint12 = plot6.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        float float11 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint12 = multiplePiePlot1.getOutlinePaint();
        java.awt.Paint paint13 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        java.awt.Paint paint17 = multiplePiePlot15.getBackgroundPaint();
        float float18 = multiplePiePlot15.getForegroundAlpha();
        boolean boolean19 = multiplePiePlot15.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup20 = multiplePiePlot15.getDatasetGroup();
        multiplePiePlot15.setForegroundAlpha((float) (byte) 0);
        boolean boolean23 = multiplePiePlot15.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder24 = multiplePiePlot15.getDataExtractOrder();
        java.lang.String str25 = multiplePiePlot15.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        java.awt.Image image31 = multiplePiePlot27.getBackgroundImage();
        java.lang.Comparable comparable32 = multiplePiePlot27.getAggregatedItemsKey();
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot27.getPieChart();
        multiplePiePlot15.setPieChart(jFreeChart33);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(tableOrder24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Multiple Pie Plot" + "'", str25, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(image31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + "Other" + "'", comparable32, "Other");
        org.junit.Assert.assertNotNull(jFreeChart33);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        boolean boolean13 = multiplePiePlot9.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot16.getDrawingSupplier();
        java.awt.Paint paint21 = multiplePiePlot16.getNoDataMessagePaint();
        multiplePiePlot9.setBackgroundPaint(paint21);
        multiplePiePlot1.setAggregatedItemsPaint(paint21);
        java.awt.Image image24 = null;
        multiplePiePlot1.setBackgroundImage(image24);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset8 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        java.awt.Font font14 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick((int) (short) 0, 0, plotRenderingInfo9);
        java.lang.Object obj11 = null;
        boolean boolean12 = multiplePiePlot1.equals(obj11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot12.getParent();
        multiplePiePlot12.setForegroundAlpha((float) '#');
        java.awt.Paint paint19 = multiplePiePlot12.getOutlinePaint();
        boolean boolean20 = multiplePiePlot12.isOutlineVisible();
        multiplePiePlot4.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        float float22 = multiplePiePlot4.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        multiplePiePlot1.setBackgroundImageAlignment(0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Paint paint14 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent15);
        java.lang.Object obj17 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setBackgroundAlpha((float) (short) 10);
        java.awt.Paint paint13 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Image image16 = multiplePiePlot12.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot12.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot12.axisChanged(axisChangeEvent18);
        java.awt.Font font20 = multiplePiePlot12.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font20);
        java.lang.Class<?> wildcardClass22 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        boolean boolean17 = multiplePiePlot1.isOutlineVisible();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        float float7 = plot6.getBackgroundAlpha();
        int int8 = plot6.getBackgroundImageAlignment();
        float float9 = plot6.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot6.setBackgroundPaint(paint10);
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font14 = multiplePiePlot6.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font14);
        double double16 = multiplePiePlot1.getLimit();
        java.lang.String str17 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier20);
        java.awt.Image image22 = null;
        multiplePiePlot19.setBackgroundImage(image22);
        boolean boolean24 = multiplePiePlot19.isSubplot();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Multiple Pie Plot" + "'", str17, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        float float17 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot1.getParent();
        java.awt.Stroke stroke21 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(plot20);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot8.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot15.getDrawingSupplier();
        java.awt.Paint paint20 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot8.setBackgroundPaint(paint20);
        multiplePiePlot1.setBackgroundPaint(paint20);
        multiplePiePlot1.setLimit((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        boolean boolean17 = multiplePiePlot4.equals((java.lang.Object) 1L);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent18);
        multiplePiePlot4.zoom((double) 10);
        java.lang.String str22 = multiplePiePlot4.getPlotType();
        multiplePiePlot4.setBackgroundAlpha((float) (short) 0);
        multiplePiePlot4.setBackgroundAlpha((float) (short) -1);
        float float27 = multiplePiePlot4.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Multiple Pie Plot" + "'", str22, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent11);
        multiplePiePlot4.zoom((double) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot4.getLegendItems();
        java.awt.Image image16 = null;
        multiplePiePlot4.setBackgroundImage(image16);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(legendItemCollection15);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        boolean boolean14 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setBackgroundPaint(paint6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D8, rectangle2D9);
        java.lang.Object obj11 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier14);
        boolean boolean17 = multiplePiePlot13.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint18 = multiplePiePlot13.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot13.getLegendItems();
        multiplePiePlot13.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        boolean boolean24 = multiplePiePlot23.isSubplot();
        multiplePiePlot23.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder27 = multiplePiePlot23.getDataExtractOrder();
        multiplePiePlot13.setDataExtractOrder(tableOrder27);
        multiplePiePlot1.setDataExtractOrder(tableOrder27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(legendItemCollection19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tableOrder27);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setBackgroundImageAlignment(1);
        java.lang.Class<?> wildcardClass17 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot8.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot15.getDrawingSupplier();
        java.awt.Paint paint20 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot8.setBackgroundPaint(paint20);
        multiplePiePlot1.setBackgroundPaint(paint20);
        java.awt.Paint paint23 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        multiplePiePlot25.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo31);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot25.getInsets();
        org.jfree.chart.util.TableOrder tableOrder34 = multiplePiePlot25.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        java.awt.Image image38 = null;
        multiplePiePlot37.setBackgroundImage(image38);
        multiplePiePlot37.zoom((double) 10L);
        multiplePiePlot37.setBackgroundImageAlignment((int) (byte) 100);
        java.awt.Paint paint44 = multiplePiePlot37.getNoDataMessagePaint();
        boolean boolean45 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot37);
        org.jfree.chart.LegendItemCollection legendItemCollection46 = multiplePiePlot37.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier47 = multiplePiePlot37.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(tableOrder34);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(legendItemCollection46);
        org.junit.Assert.assertNotNull(drawingSupplier47);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        multiplePiePlot1.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        java.awt.Image image18 = multiplePiePlot14.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot14.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        boolean boolean21 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        multiplePiePlot1.setForegroundAlpha((float) '#');
        float float8 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup9 = multiplePiePlot1.getDatasetGroup();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
        org.junit.Assert.assertNull(datasetGroup9);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        java.awt.Image image10 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        java.awt.Paint paint9 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot11);
        multiplePiePlot11.setNoDataMessage("Other");
        java.awt.Image image19 = multiplePiePlot11.getBackgroundImage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        float float11 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot8.setBackgroundAlpha((float) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        multiplePiePlot15.setForegroundAlpha((float) 0L);
        multiplePiePlot15.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot15.getPieChart();
        multiplePiePlot8.setPieChart(jFreeChart21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        java.awt.Paint paint31 = multiplePiePlot27.getAggregatedItemsPaint();
        multiplePiePlot24.setOutlinePaint(paint31);
        java.lang.String str33 = multiplePiePlot24.getPlotType();
        java.awt.Paint paint34 = multiplePiePlot24.getOutlinePaint();
        multiplePiePlot8.setOutlinePaint(paint34);
        multiplePiePlot1.setNoDataMessagePaint(paint34);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        boolean boolean39 = multiplePiePlot38.isSubplot();
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        boolean boolean42 = multiplePiePlot38.isOutlineVisible();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot38);
        org.jfree.chart.plot.Plot plot44 = multiplePiePlot38.getRootPlot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Multiple Pie Plot" + "'", str33, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(plot44);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, (int) (short) 100, plotRenderingInfo10);
        boolean boolean12 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.zoom((double) 35.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(datasetGroup8);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        boolean boolean10 = multiplePiePlot1.isSubplot();
        java.awt.Stroke stroke11 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        plot18.markerChanged(markerChangeEvent19);
        float float21 = plot18.getBackgroundImageAlpha();
        plot18.setBackgroundImageAlpha(0.0f);
        java.awt.Paint paint24 = plot18.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint24);
        boolean boolean26 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (-1), plotRenderingInfo11);
        java.awt.Paint paint13 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Image image12 = null;
        multiplePiePlot11.setBackgroundImage(image12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        java.awt.Image image19 = multiplePiePlot15.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot15.getPieChart();
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot11.getDataset();
        multiplePiePlot11.setBackgroundImageAlpha((float) 0);
        multiplePiePlot11.setBackgroundImageAlignment(100);
        java.awt.Paint paint27 = multiplePiePlot11.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint27);
        java.awt.Image image29 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint30 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(jFreeChart20);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(image29);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        java.awt.Paint paint12 = multiplePiePlot1.getOutlinePaint();
        java.awt.Paint paint13 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.zoom((double) (byte) -1);
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(tableOrder16);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Stroke stroke5 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent7);
        multiplePiePlot1.setBackgroundAlpha((float) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.plot.Plot plot9 = null;
        multiplePiePlot1.setParent(plot9);
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) (short) 100, 15, plotRenderingInfo15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        java.awt.Stroke stroke26 = multiplePiePlot21.getOutlineStroke();
        multiplePiePlot21.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        multiplePiePlot21.setDataset(categoryDataset29);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent31 = null;
        multiplePiePlot21.axisChanged(axisChangeEvent31);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        multiplePiePlot21.setDataset(categoryDataset34);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent36);
        java.awt.Stroke stroke38 = multiplePiePlot21.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        java.lang.Comparable comparable5 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setForegroundAlpha((float) 100);
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + "Other" + "'", comparable5, "Other");
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(tableOrder9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Paint paint14 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset8 = multiplePiePlot1.getDataset();
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent7);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = plot4.getDrawingSupplier();
        plot4.setBackgroundAlpha((float) (byte) 1);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNull(drawingSupplier10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        multiplePiePlot1.handleClick(100, (int) (byte) 1, plotRenderingInfo6);
        multiplePiePlot1.zoom((double) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot17.getPieChart();
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        java.awt.Stroke stroke24 = multiplePiePlot11.getOutlineStroke();
        multiplePiePlot11.setBackgroundImageAlignment(1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot11.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent29);
        multiplePiePlot1.setBackgroundAlpha((float) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(drawingSupplier27);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        boolean boolean13 = multiplePiePlot9.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot16.getDrawingSupplier();
        java.awt.Paint paint21 = multiplePiePlot16.getNoDataMessagePaint();
        multiplePiePlot9.setBackgroundPaint(paint21);
        multiplePiePlot1.setAggregatedItemsPaint(paint21);
        java.awt.Paint paint24 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        boolean boolean15 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        boolean boolean8 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        java.awt.Paint paint12 = multiplePiePlot10.getBackgroundPaint();
        float float13 = multiplePiePlot10.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot10.getDataset();
        multiplePiePlot10.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Paint paint21 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot18.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier26);
        boolean boolean29 = multiplePiePlot25.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot25.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = multiplePiePlot32.getDrawingSupplier();
        java.awt.Paint paint37 = multiplePiePlot32.getNoDataMessagePaint();
        multiplePiePlot25.setBackgroundPaint(paint37);
        multiplePiePlot18.setBackgroundPaint(paint37);
        multiplePiePlot10.setNoDataMessagePaint(paint37);
        double double41 = multiplePiePlot10.getLimit();
        boolean boolean42 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot10);
        java.awt.Font font43 = multiplePiePlot10.getNoDataMessageFont();
        float float44 = multiplePiePlot10.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(drawingSupplier36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(font43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.5f + "'", float44 == 0.5f);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.lang.Object obj9 = null;
        boolean boolean10 = multiplePiePlot1.equals(obj9);
        multiplePiePlot1.setOutlineVisible(false);
        multiplePiePlot1.setLimit((double) 100.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        float float17 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            plot20.setForegroundAlpha((float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        boolean boolean6 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot1.setDataset(categoryDataset7);
        multiplePiePlot1.setForegroundAlpha((float) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        plot15.markerChanged(markerChangeEvent16);
        float float18 = plot15.getBackgroundImageAlpha();
        plot15.setBackgroundImageAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        java.awt.Paint paint24 = multiplePiePlot22.getBackgroundPaint();
        java.awt.Paint paint25 = multiplePiePlot22.getNoDataMessagePaint();
        multiplePiePlot22.setLimit((double) (byte) 1);
        java.lang.String str28 = multiplePiePlot22.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.awt.Image image31 = null;
        multiplePiePlot30.setBackgroundImage(image31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.lang.String str35 = multiplePiePlot34.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener36);
        java.awt.Image image38 = multiplePiePlot34.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart39 = multiplePiePlot34.getPieChart();
        multiplePiePlot30.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        java.lang.String str43 = multiplePiePlot42.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        multiplePiePlot42.markerChanged(markerChangeEvent44);
        java.awt.Paint paint46 = null;
        multiplePiePlot42.setBackgroundPaint(paint46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = multiplePiePlot42.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup49 = multiplePiePlot42.getDatasetGroup();
        java.awt.Paint paint50 = multiplePiePlot42.getOutlinePaint();
        multiplePiePlot30.setNoDataMessagePaint(paint50);
        multiplePiePlot22.setNoDataMessagePaint(paint50);
        plot15.setBackgroundPaint(paint50);
        multiplePiePlot1.setAggregatedItemsPaint(paint50);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Multiple Pie Plot" + "'", str28, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(image38);
        org.junit.Assert.assertNotNull(jFreeChart39);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(categoryDataset48);
        org.junit.Assert.assertNull(datasetGroup49);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        multiplePiePlot1.handleClick(100, (int) (byte) 1, plotRenderingInfo6);
        multiplePiePlot1.zoom((double) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot17.getPieChart();
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        java.awt.Stroke stroke24 = multiplePiePlot11.getOutlineStroke();
        multiplePiePlot11.setBackgroundImageAlignment(1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot11.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent29);
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(drawingSupplier27);
        org.junit.Assert.assertNotNull(plot31);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = null;
        plot6.setBackgroundImage(image7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        plot6.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot13.getDataset();
        java.awt.Paint paint19 = multiplePiePlot13.getAggregatedItemsPaint();
        plot6.setNoDataMessagePaint(paint19);
        org.jfree.chart.plot.Plot plot21 = plot6.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(plot21);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot11.getDrawingSupplier();
        java.lang.String str16 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot11.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(drawingSupplier17);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        double double8 = multiplePiePlot1.getLimit();
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        java.awt.Paint paint8 = multiplePiePlot6.getBackgroundPaint();
        float float9 = multiplePiePlot6.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = null;
        multiplePiePlot11.setBackgroundPaint(paint15);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font19 = multiplePiePlot11.getNoDataMessageFont();
        multiplePiePlot6.setNoDataMessageFont(font19);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot6.getParent();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot6.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart22);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertNotNull(jFreeChart22);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        multiplePiePlot1.setLimit(0.0d);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        float float15 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot11.getRootPlot();
        boolean boolean17 = multiplePiePlot11.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot11.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        java.lang.String str20 = multiplePiePlot11.getPlotType();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot11.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Multiple Pie Plot" + "'", str20, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(tableOrder22);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 100);
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = null;
        plot6.setBackgroundImage(image7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        plot6.drawBackgroundImage(graphics2D9, rectangle2D10);
        plot6.zoom((double) (byte) 100);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot6.drawOutline(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        plot6.setBackgroundAlpha((float) (byte) -1);
        java.awt.Paint paint11 = plot6.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot13.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot13.setDataset(categoryDataset18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot13.getDrawingSupplier();
        plot6.setDrawingSupplier(drawingSupplier20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNotNull(drawingSupplier20);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = plot4.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        java.awt.Paint paint11 = multiplePiePlot9.getBackgroundPaint();
        float float12 = multiplePiePlot9.getForegroundAlpha();
        boolean boolean13 = multiplePiePlot9.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot9.getDatasetGroup();
        multiplePiePlot9.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot9.getDrawingSupplier();
        plot4.setDrawingSupplier(drawingSupplier17);
        plot4.setBackgroundImageAlignment((int) (byte) 0);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(drawingSupplier7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(drawingSupplier17);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        boolean boolean9 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        java.lang.String str12 = multiplePiePlot1.getNoDataMessage();
        float float13 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener7);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        float float12 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent16);
        float float18 = multiplePiePlot14.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot14.getRootPlot();
        boolean boolean20 = multiplePiePlot14.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot14.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(drawingSupplier21);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot4.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        plot16.handleClick((int) (byte) -1, (int) (short) 100, plotRenderingInfo19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        java.awt.Paint paint9 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        java.awt.Paint paint15 = multiplePiePlot13.getBackgroundPaint();
        java.awt.Paint paint16 = multiplePiePlot13.getNoDataMessagePaint();
        multiplePiePlot13.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier21);
        boolean boolean24 = multiplePiePlot20.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot20.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot27.addChangeListener(plotChangeListener29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = multiplePiePlot27.getDrawingSupplier();
        java.awt.Paint paint32 = multiplePiePlot27.getNoDataMessagePaint();
        multiplePiePlot20.setBackgroundPaint(paint32);
        multiplePiePlot13.setBackgroundPaint(paint32);
        java.awt.Paint paint35 = multiplePiePlot13.getAggregatedItemsPaint();
        boolean boolean36 = multiplePiePlot1.equals((java.lang.Object) paint35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(drawingSupplier31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent14);
        org.jfree.chart.JFreeChart jFreeChart16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot4.setPieChart(jFreeChart16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        boolean boolean11 = multiplePiePlot4.isSubplot();
        java.lang.Object obj12 = multiplePiePlot4.clone();
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot4.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(tableOrder13);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        multiplePiePlot1.handleClick(100, (int) (byte) 1, plotRenderingInfo6);
        multiplePiePlot1.zoom((double) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot17.getPieChart();
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        java.awt.Stroke stroke24 = multiplePiePlot11.getOutlineStroke();
        multiplePiePlot11.setBackgroundImageAlignment(1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot11.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent29);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(drawingSupplier27);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot4.handleClick(1, (int) (byte) 0, plotRenderingInfo14);
        java.lang.Comparable comparable16 = multiplePiePlot4.getAggregatedItemsKey();
        java.lang.Class<?> wildcardClass17 = comparable16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 0 + "'", comparable16, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        boolean boolean6 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        boolean boolean14 = multiplePiePlot10.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        java.awt.Image image16 = null;
        plot15.setBackgroundImage(image16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        plot15.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        java.awt.Image image26 = multiplePiePlot22.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot22.getDataset();
        java.awt.Paint paint28 = multiplePiePlot22.getAggregatedItemsPaint();
        plot15.setNoDataMessagePaint(paint28);
        multiplePiePlot1.setBackgroundPaint(paint28);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(image26);
        org.junit.Assert.assertNull(categoryDataset27);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent7);
        java.lang.Object obj9 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot3.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Stroke stroke11 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke11);
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint14 = multiplePiePlot1.getOutlinePaint();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(tableOrder13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.lang.String str9 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot1.getDrawingSupplier();
        float float11 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        java.awt.Paint paint10 = multiplePiePlot8.getBackgroundPaint();
        java.awt.Paint paint11 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot8.setLimit((double) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot8.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot16.setParent((org.jfree.chart.plot.Plot) multiplePiePlot19);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot19.getInsets();
        multiplePiePlot8.setInsets(rectangleInsets24);
        multiplePiePlot1.setInsets(rectangleInsets24, true);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D28, rectangle2D29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener7);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        float float12 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setOutlineVisible(false);
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.lang.Object obj9 = null;
        boolean boolean10 = multiplePiePlot1.equals(obj9);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.awt.Image image15 = null;
        multiplePiePlot14.setBackgroundImage(image15);
        multiplePiePlot14.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.awt.Paint paint21 = multiplePiePlot20.getOutlinePaint();
        multiplePiePlot14.setAggregatedItemsPaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot14.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot14.setDataset(categoryDataset24);
        multiplePiePlot14.setLimit((double) 10);
        java.awt.Paint paint28 = multiplePiePlot14.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = null;
        multiplePiePlot30.setDrawingSupplier(drawingSupplier31);
        boolean boolean34 = multiplePiePlot30.equals((java.lang.Object) 1.0d);
        boolean boolean35 = multiplePiePlot30.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        multiplePiePlot30.handleClick((int) (short) 0, 0, plotRenderingInfo38);
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        multiplePiePlot30.handleClick(0, 0, plotRenderingInfo44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        boolean boolean48 = multiplePiePlot47.isSubplot();
        multiplePiePlot47.setForegroundAlpha((float) 0L);
        multiplePiePlot47.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart53 = multiplePiePlot47.getPieChart();
        multiplePiePlot30.setPieChart(jFreeChart53);
        multiplePiePlot14.setPieChart(jFreeChart53);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart53);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent57 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent57);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jFreeChart53);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent10);
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot1.handleClick((int) (byte) 100, 1, plotRenderingInfo12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(drawingSupplier9);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick((int) (short) 0, 0, plotRenderingInfo9);
        java.lang.Object obj11 = null;
        boolean boolean12 = multiplePiePlot1.equals(obj11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot1.getPieChart();
        boolean boolean17 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart4 = multiplePiePlot0.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        float float10 = multiplePiePlot6.getForegroundAlpha();
        multiplePiePlot6.zoom((double) 0.0f);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot6.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot15.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot15.getInsets();
        multiplePiePlot6.setInsets(rectangleInsets18);
        multiplePiePlot0.setInsets(rectangleInsets18);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier23);
        float float25 = multiplePiePlot22.getBackgroundImageAlpha();
        multiplePiePlot22.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = multiplePiePlot22.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets28);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent30 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent30);
        org.junit.Assert.assertNotNull(drawingSupplier3);
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        double double8 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent11);
        multiplePiePlot4.zoom((double) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot4.getLegendItems();
        java.lang.Class<?> wildcardClass16 = legendItemCollection15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        boolean boolean3 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str4 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(plot5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setForegroundAlpha((float) 0L);
        java.awt.Paint paint15 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint15);
        java.lang.Class<?> wildcardClass17 = paint15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setForegroundAlpha((float) 0L);
        java.awt.Paint paint16 = multiplePiePlot12.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot12.setDataset(categoryDataset17);
        multiplePiePlot12.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier23);
        boolean boolean26 = multiplePiePlot22.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint27 = multiplePiePlot22.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection28 = multiplePiePlot22.getLegendItems();
        java.awt.Paint paint29 = multiplePiePlot22.getNoDataMessagePaint();
        multiplePiePlot12.setNoDataMessagePaint(paint29);
        multiplePiePlot1.setAggregatedItemsPaint(paint29);
        java.awt.Stroke stroke32 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(legendItemCollection28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent10);
        multiplePiePlot1.zoom((double) 10.0f);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        float float10 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        java.awt.Paint paint8 = multiplePiePlot6.getBackgroundPaint();
        float float9 = multiplePiePlot6.getForegroundAlpha();
        boolean boolean10 = multiplePiePlot6.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup11 = multiplePiePlot6.getDatasetGroup();
        multiplePiePlot6.setForegroundAlpha((float) (byte) 0);
        boolean boolean14 = multiplePiePlot6.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot6.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        java.awt.Paint paint26 = multiplePiePlot22.getAggregatedItemsPaint();
        multiplePiePlot19.setOutlinePaint(paint26);
        java.lang.String str28 = multiplePiePlot19.getPlotType();
        java.lang.String str29 = multiplePiePlot19.getNoDataMessage();
        float float30 = multiplePiePlot19.getBackgroundImageAlpha();
        multiplePiePlot19.setLimit(100.0d);
        java.awt.Paint paint33 = multiplePiePlot19.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint33);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Multiple Pie Plot" + "'", str28, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.awt.Paint paint14 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint15 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.zoom((double) 10);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(plot19);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset8 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertNull(categoryDataset9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        multiplePiePlot1.setOutlineVisible(true);
        float float14 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        plot15.notifyListeners(plotChangeEvent16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        boolean boolean17 = multiplePiePlot4.equals((java.lang.Object) 1L);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent18);
        multiplePiePlot4.zoom((double) 10);
        java.awt.Image image22 = multiplePiePlot4.getBackgroundImage();
        java.lang.String str23 = multiplePiePlot4.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Multiple Pie Plot" + "'", str23, "Multiple Pie Plot");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        boolean boolean8 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        java.awt.Paint paint12 = multiplePiePlot10.getBackgroundPaint();
        float float13 = multiplePiePlot10.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot10.getDataset();
        multiplePiePlot10.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Paint paint21 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot18.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier26);
        boolean boolean29 = multiplePiePlot25.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot25.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = multiplePiePlot32.getDrawingSupplier();
        java.awt.Paint paint37 = multiplePiePlot32.getNoDataMessagePaint();
        multiplePiePlot25.setBackgroundPaint(paint37);
        multiplePiePlot18.setBackgroundPaint(paint37);
        multiplePiePlot10.setNoDataMessagePaint(paint37);
        double double41 = multiplePiePlot10.getLimit();
        boolean boolean42 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(drawingSupplier36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint14 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot8.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot15.getDrawingSupplier();
        java.awt.Paint paint20 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot8.setBackgroundPaint(paint20);
        multiplePiePlot1.setBackgroundPaint(paint20);
        java.awt.Paint paint23 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot1.handleClick(0, (int) '4', plotRenderingInfo26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(drawingSupplier28);
    }
}

