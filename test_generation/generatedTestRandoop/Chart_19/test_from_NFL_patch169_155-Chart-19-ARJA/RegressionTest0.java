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
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_RANGE_GRIDLINES_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Paint paint4 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeCrosshairPaint(paint4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        java.awt.Paint paint2 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeGridlinePaint(paint2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRenderers(categoryItemRendererArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomDomainAxes((double) (-1.0f), (double) 100.0f, plotRenderingInfo6, point2D7);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlinePosition(categoryAnchor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge6 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation4, plotOrientation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge6 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation4, plotOrientation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryMarker categoryMarker12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.data.Range range13 = categoryPlot0.getDataRange(valueAxis12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.awt.Paint paint0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        org.junit.Assert.assertNotNull(paint0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((-1), valueAxis6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot10.zoomRangeAxes((-1.0d), plotRenderingInfo13, point2D14, false);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot10.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation18, true);
        org.jfree.chart.plot.PlotOrientation plotOrientation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge22 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation18, plotOrientation21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = categoryPlot0.getDatasetRenderingOrder();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRenderer((int) (byte) -1, categoryItemRenderer5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean5 = categoryPlot0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot11.setRangeAxis((int) (byte) 100, valueAxis13);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot11.getRangeAxisLocation();
        categoryPlot8.setDomainAxisLocation(axisLocation15);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (short) -1, axisLocation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.Marker marker5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis12 };
        categoryPlot11.setDomainAxes(categoryAxisArray13);
        categoryPlot11.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot11.getDomainAxisLocation(100);
        categoryPlot0.setRangeAxisLocation(axisLocation18, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge22 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation18, plotOrientation21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis10, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis14 };
        categoryPlot13.setDomainAxes(categoryAxisArray15);
        java.awt.Stroke stroke17 = categoryPlot13.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot13.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection18);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(legendItemCollection18);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) '#', marker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRendererForDataset(categoryDataset1);
        org.junit.Assert.assertNull(categoryItemRenderer2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearDomainMarkers();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((int) (short) -1, valueAxis6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(categoryItemRenderer8);
        org.jfree.chart.plot.Marker marker10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder5 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        categoryPlot0.notifyListeners(plotChangeEvent6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis12);
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot10.getRangeAxisLocation();
        categoryPlot7.setDomainAxisLocation(axisLocation14);
        categoryPlot0.setRangeAxisLocation(10, axisLocation14);
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge18 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation14, plotOrientation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        java.lang.String str11 = categoryPlot0.getNoDataMessage();
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = categoryPlot0.getDomainAxisIndex(categoryAxis14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setOrientation(plotOrientation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup3);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        categoryPlot0.setOutlineVisible(false);
        org.jfree.chart.plot.Marker marker8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        org.jfree.chart.axis.AxisLocation axisLocation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (short) -1, axisLocation12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray8);
        categoryPlot0.setRangeCrosshairValue((double) (-1.0f), false);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Graphics2D graphics2D1 = null;
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        float float7 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isRangeZoomable();
        categoryPlot8.setWeight(0);
        java.awt.Paint paint12 = categoryPlot8.getBackgroundPaint();
        categoryPlot0.setRangeGridlinePaint(paint12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(10, (int) (short) 10, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setAnchorValue(100.0d, false);
        float float12 = categoryPlot7.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis14 };
        categoryPlot13.setDomainAxes(categoryAxisArray15);
        java.awt.Stroke stroke17 = categoryPlot13.getOutlineStroke();
        categoryPlot7.setRangeCrosshairStroke(stroke17);
        categoryPlot0.setRangeGridlineStroke(stroke17);
        org.jfree.chart.plot.PlotOrientation plotOrientation20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setOrientation(plotOrientation20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryMarker categoryMarker9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot4.configureRangeAxes();
        categoryPlot4.clearDomainMarkers();
        categoryPlot4.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot9.setDomainAxes(categoryAxisArray11);
        java.awt.Stroke stroke13 = categoryPlot9.getOutlineStroke();
        categoryPlot4.setRangeCrosshairStroke(stroke13);
        categoryPlot0.setRangeCrosshairStroke(stroke13);
        org.jfree.chart.plot.CategoryMarker categoryMarker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) '#', categoryMarker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = categoryPlot0.getRangeAxisIndex(valueAxis9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = categoryPlot0.removeAnnotation(categoryAnnotation12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getRangeAxisEdge(10);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot0.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo8, point2D9, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (short) -1, (int) 'a', plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        categoryPlot0.setRenderer(categoryItemRenderer6);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge10 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation8, plotOrientation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo9, point2D10, false);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryMarker categoryMarker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer10, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot13.render(graphics2D17, rectangle2D18, (int) (byte) 100, plotRenderingInfo20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot13.getRenderer((int) (short) 10);
        java.awt.Stroke stroke24 = categoryPlot13.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = categoryPlot13.getInsets();
        categoryPlot0.setInsets(rectangleInsets25, false);
        boolean boolean28 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean29 = categoryPlot0.isDomainZoomable();
        categoryPlot0.setForegroundAlpha((float) 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryItemRenderer23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.removeChangeListener(plotChangeListener12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge((int) (byte) -1);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation(axisLocation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setOrientation(plotOrientation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        categoryPlot0.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        java.lang.Class<?> wildcardClass6 = categoryPlot0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot10.zoomRangeAxes((-1.0d), plotRenderingInfo13, point2D14, false);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot10.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation18, true);
        boolean boolean22 = categoryPlot0.equals((java.lang.Object) "hi!");
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = categoryPlot0.getDomainAxisForDataset((int) 'a');
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(categoryAxis24);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) 'a', layer8);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        java.awt.Image image11 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.data.Range range13 = categoryPlot0.getDataRange(valueAxis12);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        java.awt.Paint paint9 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray9 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot0.setRenderers(categoryItemRendererArray9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.plot.PlotState plotState14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D11, rectangle2D12, point2D13, plotState14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setForegroundAlpha((float) 15);
        org.junit.Assert.assertNull(image6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryMarker categoryMarker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 10, categoryMarker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryAxis7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        int int4 = categoryPlot0.getDatasetCount();
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlineStroke(stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setAxisOffset(rectangleInsets7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.plot.Plot plot7 = categoryPlot0.getRootPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearRangeMarkers();
        categoryPlot8.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke14 = categoryPlot8.getRangeGridlineStroke();
        double double15 = categoryPlot8.getRangeCrosshairValue();
        java.awt.Paint paint16 = categoryPlot8.getBackgroundPaint();
        categoryPlot0.setRangeCrosshairPaint(paint16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxisForDataset((-1));
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot0.setRangeAxis(valueAxis13);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers(1, layer9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(collection10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getRootPlot();
        plot2.setForegroundAlpha((float) 0L);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(plot2);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer12, false);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        float float22 = categoryPlot17.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray25 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis24 };
        categoryPlot23.setDomainAxes(categoryAxisArray25);
        java.awt.Stroke stroke27 = categoryPlot23.getOutlineStroke();
        categoryPlot17.setRangeCrosshairStroke(stroke27);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder29 = categoryPlot17.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder29);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D31, rectangle2D32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        categoryPlot0.setRenderer(categoryItemRenderer6);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot10.zoomRangeAxes((-1.0d), plotRenderingInfo13, point2D14, false);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot10.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation18, true);
        boolean boolean22 = categoryPlot0.equals((java.lang.Object) "hi!");
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis24);
        float float26 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot11.zoomRangeAxes((-1.0d), plotRenderingInfo14, point2D15, false);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot11.setRangeAxis(valueAxis18);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot11.setRangeAxis(valueAxis20);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset24 = categoryPlot22.getDataset((int) (short) 1);
        categoryPlot22.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor27 = categoryPlot22.getDomainGridlinePosition();
        categoryPlot11.setDomainGridlinePosition(categoryAnchor27);
        categoryPlot0.setDomainGridlinePosition(categoryAnchor27);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(categoryAnchor27);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) '4', categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray16 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis15 };
        categoryPlot14.setDomainAxes(categoryAxisArray16);
        float float18 = categoryPlot14.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        categoryPlot19.clearDomainMarkers();
        categoryPlot19.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot19.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        categoryPlot19.removeChangeListener(plotChangeListener26);
        java.awt.Paint paint28 = categoryPlot19.getBackgroundPaint();
        categoryPlot14.setRangeGridlinePaint(paint28);
        categoryPlot0.setOutlinePaint(paint28);
        org.jfree.chart.plot.Marker marker31 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis10);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot8.getDomainMarkers((int) (byte) 10, layer13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearDomainMarkers();
        boolean boolean18 = categoryPlot8.equals((java.lang.Object) categoryPlot15);
        java.awt.Image image19 = categoryPlot8.getBackgroundImage();
        categoryPlot8.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray24 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis23 };
        categoryPlot22.setDomainAxes(categoryAxisArray24);
        categoryPlot22.setAnchorValue(10.0d);
        categoryPlot22.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean31 = categoryPlot30.isRangeZoomable();
        categoryPlot30.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder35 = categoryPlot30.getDatasetRenderingOrder();
        categoryPlot22.setDatasetRenderingOrder(datasetRenderingOrder35);
        java.awt.Paint paint37 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot22.setNoDataMessagePaint(paint37);
        categoryPlot8.setBackgroundPaint(paint37);
        categoryPlot0.setRangeGridlinePaint(paint37);
        categoryPlot0.setRangeCrosshairValue((double) 'a');
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(categoryAxisArray24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder35);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.CategoryMarker categoryMarker5 = null;
        org.jfree.chart.util.Layer layer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(categoryMarker5, layer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        boolean boolean7 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryAxis9);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo16, point2D17, false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot0.getDomainMarkers(15, layer21);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(collection22);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        float float8 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation(axisLocation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getDomainAxisLocation(100);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(axisLocation7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot3.setRangeAxis((int) (byte) 100, valueAxis5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        boolean boolean11 = categoryPlot3.render(graphics2D7, rectangle2D8, (int) (byte) 100, plotRenderingInfo10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot3.getRenderer((int) (short) 10);
        java.awt.Stroke stroke14 = categoryPlot3.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot3.getInsets();
        categoryPlot0.setInsets(rectangleInsets15, true);
        org.jfree.chart.plot.CategoryMarker categoryMarker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (short) 10, categoryMarker19, layer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        java.awt.Paint paint9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        // The following exception was thrown during execution in test generation
        try {
            plot8.setBackgroundPaint(paint9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setAnchorValue(100.0d, false);
        float float12 = categoryPlot7.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis14 };
        categoryPlot13.setDomainAxes(categoryAxisArray15);
        java.awt.Stroke stroke17 = categoryPlot13.getOutlineStroke();
        categoryPlot7.setRangeCrosshairStroke(stroke17);
        categoryPlot0.setRangeGridlineStroke(stroke17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo21, point2D22, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot0.setDomainAxis(categoryAxis25);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray9 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis8 };
        categoryPlot7.setDomainAxes(categoryAxisArray9);
        categoryPlot7.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot7.getDomainAxisLocation(100);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (short) -1, axisLocation14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray9);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot6.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot6.zoomRangeAxes((-1.0d), plotRenderingInfo9, point2D10, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor13 = categoryPlot6.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot6.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot16.zoomRangeAxes((-1.0d), plotRenderingInfo19, point2D20, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor23 = categoryPlot16.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot16.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = categoryPlot16.getAxisOffset();
        categoryPlot6.setInsets(rectangleInsets26);
        categoryPlot0.setInsets(rectangleInsets26, true);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        boolean boolean34 = categoryPlot0.render(graphics2D30, rectangle2D31, (int) '#', plotRenderingInfo33);
        categoryPlot0.setRangeGridlinesVisible(true);
        java.lang.Class<?> wildcardClass37 = categoryPlot0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        org.jfree.chart.plot.Plot plot11 = categoryPlot0.getParent();
        int int12 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint7 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Paint paint8 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setInsets(rectangleInsets11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 0, valueAxis10);
        org.jfree.chart.plot.Plot plot12 = categoryPlot0.getParent();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        categoryPlot0.clearRangeMarkers((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        boolean boolean9 = categoryPlot0.render(graphics2D5, rectangle2D6, (int) (short) 100, plotRenderingInfo8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        boolean boolean18 = categoryPlot10.render(graphics2D14, rectangle2D15, (int) (byte) 100, plotRenderingInfo17);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot10.getRenderer((int) (short) 10);
        java.awt.Paint paint21 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot10.setRangeCrosshairPaint(paint21);
        java.awt.Paint paint23 = categoryPlot10.getOutlinePaint();
        categoryPlot0.setBackgroundPaint(paint23);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        java.awt.Paint paint14 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearRangeMarkers();
        boolean boolean18 = categoryPlot15.isOutlineVisible();
        categoryPlot15.setRangeGridlinesVisible(false);
        categoryPlot15.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        categoryPlot23.clearRangeMarkers();
        categoryPlot23.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke29 = categoryPlot23.getRangeGridlineStroke();
        double double30 = categoryPlot23.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        categoryPlot23.drawBackgroundImage(graphics2D31, rectangle2D32);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray35 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer34 };
        categoryPlot23.setRenderers(categoryItemRendererArray35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = categoryPlot23.getDrawingSupplier();
        categoryPlot15.setDrawingSupplier(drawingSupplier37);
        categoryPlot0.setDrawingSupplier(drawingSupplier37);
        org.jfree.chart.axis.AxisSpace axisSpace40 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace40);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray35);
        org.junit.Assert.assertNotNull(drawingSupplier37);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int0 = org.jfree.chart.util.AbstractObjectList.DEFAULT_INITIAL_CAPACITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getRangeAxisEdge(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot0.zoomRangeAxes((double) (-1L), (double) 100, plotRenderingInfo16, point2D17);
        boolean boolean19 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue(10.0d);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isRangeZoomable();
        categoryPlot8.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder13 = categoryPlot8.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot15.setRangeAxis((int) (byte) 100, valueAxis17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        boolean boolean23 = categoryPlot15.render(graphics2D19, rectangle2D20, (int) (byte) 100, plotRenderingInfo22);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = categoryPlot15.getRenderer((int) (short) 10);
        java.awt.Stroke stroke26 = categoryPlot15.getDomainGridlineStroke();
        java.awt.Stroke stroke27 = categoryPlot15.getDomainGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke27);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        float float7 = categoryPlot0.getForegroundAlpha();
        int int8 = categoryPlot0.getWeight();
        categoryPlot0.setBackgroundAlpha((float) 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getRangeAxisEdge();
        org.jfree.data.general.DatasetGroup datasetGroup12 = categoryPlot0.getDatasetGroup();
        categoryPlot0.clearDomainMarkers((int) (short) 100);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNull(datasetGroup12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        float float7 = categoryPlot0.getForegroundAlpha();
        int int8 = categoryPlot0.getWeight();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot9.setDomainAxes(categoryAxisArray11);
        categoryPlot9.setAnchorValue(10.0d);
        categoryPlot9.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder22 = categoryPlot17.getDatasetRenderingOrder();
        categoryPlot9.setDatasetRenderingOrder(datasetRenderingOrder22);
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder22);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D25, rectangle2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder22);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo7, point2D8);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = categoryPlot0.removeAnnotation(categoryAnnotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        java.lang.Class<?> wildcardClass3 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot0.getInsets();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers(layer9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(collection10);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor12 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryMarker categoryMarker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(categoryAnchor12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setInsets(rectangleInsets7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        int int9 = categoryPlot0.getRangeAxisIndex(valueAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        float float22 = categoryPlot17.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder23 = categoryPlot17.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder23);
        org.jfree.chart.axis.AxisSpace axisSpace25 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace25);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder23);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        categoryPlot0.clearAnnotations();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToDomainAxis((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.Marker marker6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset(0);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot9.setRangeAxis((int) (byte) 100, valueAxis11);
        boolean boolean14 = categoryPlot9.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot9.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder15);
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sortOrder15);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        java.awt.Image image11 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray16 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis15 };
        categoryPlot14.setDomainAxes(categoryAxisArray16);
        categoryPlot14.setAnchorValue(10.0d);
        categoryPlot14.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean23 = categoryPlot22.isRangeZoomable();
        categoryPlot22.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder27 = categoryPlot22.getDatasetRenderingOrder();
        categoryPlot14.setDatasetRenderingOrder(datasetRenderingOrder27);
        java.awt.Paint paint29 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot14.setNoDataMessagePaint(paint29);
        categoryPlot0.setBackgroundPaint(paint29);
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        categoryPlot0.addChangeListener(plotChangeListener32);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder27);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot0.getLegendItems();
        java.awt.Paint paint17 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot18.configureRangeAxes();
        categoryPlot18.clearRangeMarkers();
        categoryPlot18.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke24 = categoryPlot18.getRangeGridlineStroke();
        double double25 = categoryPlot18.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        categoryPlot18.drawBackgroundImage(graphics2D26, rectangle2D27);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray30 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer29 };
        categoryPlot18.setRenderers(categoryItemRendererArray30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = categoryPlot18.getDrawingSupplier();
        categoryPlot18.clearDomainMarkers((int) ' ');
        java.awt.Stroke stroke35 = categoryPlot18.getRangeGridlineStroke();
        categoryPlot0.setOutlineStroke(stroke35);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot37.configureRangeAxes();
        categoryPlot37.clearDomainMarkers();
        categoryPlot37.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint42 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot37.setNoDataMessagePaint(paint42);
        categoryPlot0.setOutlinePaint(paint42);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray30);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis10, false);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis14);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        categoryPlot0.axisChanged(axisChangeEvent16);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Paint paint8 = categoryPlot0.getBackgroundPaint();
        java.lang.String str9 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Category Plot" + "'", str9, "Category Plot");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        java.awt.Image image11 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNull(valueAxis12);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean5 = categoryPlot0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot0.markerChanged(markerChangeEvent6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.plot.Plot plot7 = categoryPlot0.getRootPlot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        plot7.addChangeListener(plotChangeListener8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plot7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = categoryPlot11.getDataset((int) (short) 1);
        categoryPlot11.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor16 = categoryPlot11.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot18.configureRangeAxes();
        categoryPlot18.clearRangeMarkers();
        boolean boolean21 = categoryPlot18.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.configureRangeAxes();
        categoryPlot22.clearDomainMarkers();
        categoryPlot22.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray29 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis28 };
        categoryPlot27.setDomainAxes(categoryAxisArray29);
        java.awt.Stroke stroke31 = categoryPlot27.getOutlineStroke();
        categoryPlot22.setRangeCrosshairStroke(stroke31);
        categoryPlot18.setRangeCrosshairStroke(stroke31);
        categoryPlot0.setOutlineStroke(stroke31);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryAnchor16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray29);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot10.zoomRangeAxes((-1.0d), plotRenderingInfo13, point2D14, false);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot10.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation18, true);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        categoryPlot0.notifyListeners(plotChangeEvent21);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder23 = categoryPlot0.getDatasetRenderingOrder();
        java.lang.Class<?> wildcardClass24 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot0.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 1, (double) '#', plotRenderingInfo15, point2D16);
        java.awt.Paint paint18 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        categoryPlot0.setDomainAxis((int) ' ', categoryAxis20);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot0.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 1, (double) '#', plotRenderingInfo15, point2D16);
        java.awt.Paint paint18 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean20 = categoryPlot19.isRangeZoomable();
        categoryPlot19.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        java.util.List list24 = categoryPlot19.getCategoriesForAxis(categoryAxis23);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent25 = null;
        categoryPlot19.axisChanged(axisChangeEvent25);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = categoryPlot19.getInsets();
        categoryPlot0.setInsets(rectangleInsets27);
        float float29 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        java.lang.String str6 = categoryPlot0.getPlotType();
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Category Plot" + "'", str6, "Category Plot");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.Marker marker1 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        float float5 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis7, false);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue(10.0d);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isRangeZoomable();
        categoryPlot8.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder13 = categoryPlot8.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder13);
        java.awt.Paint paint15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint15);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = categoryPlot0.removeAnnotation(categoryAnnotation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Paint paint11 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot0.setRangeCrosshairPaint(paint11);
        java.lang.Class<?> wildcardClass13 = paint11.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) '4', categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray16 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis15 };
        categoryPlot14.setDomainAxes(categoryAxisArray16);
        float float18 = categoryPlot14.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        categoryPlot19.clearDomainMarkers();
        categoryPlot19.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot19.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        categoryPlot19.removeChangeListener(plotChangeListener26);
        java.awt.Paint paint28 = categoryPlot19.getBackgroundPaint();
        categoryPlot14.setRangeGridlinePaint(paint28);
        categoryPlot0.setOutlinePaint(paint28);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = categoryPlot0.removeAnnotation(categoryAnnotation31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairValue((double) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        float float5 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(10, categoryItemRenderer7);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getRangeMarkers(layer7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        categoryPlot0.setDomainAxis(categoryAxis4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot6.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot6.zoomRangeAxes((-1.0d), plotRenderingInfo9, point2D10, false);
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot6.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray15 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot6.setRangeAxes(valueAxisArray15);
        categoryPlot0.setRangeAxes(valueAxisArray15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot0.setRenderer(categoryItemRenderer18, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(valueAxisArray15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        int int15 = categoryPlot0.getIndexOf(categoryItemRenderer14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue((double) (byte) 10);
        org.jfree.chart.plot.CategoryMarker categoryMarker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis19 };
        categoryPlot18.setDomainAxes(categoryAxisArray20);
        categoryPlot18.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot18.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean27 = categoryPlot26.isRangeZoomable();
        org.jfree.chart.plot.Plot plot28 = categoryPlot26.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation29 = categoryPlot26.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation25, plotOrientation29);
        categoryPlot0.setOrientation(plotOrientation29);
        org.jfree.chart.axis.AxisSpace axisSpace32 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace32);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(plot28);
        org.junit.Assert.assertNotNull(plotOrientation29);
        org.junit.Assert.assertNotNull(rectangleEdge30);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) 'a', layer8);
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 100, (int) (byte) 0);
        java.lang.Object obj13 = categoryPlot0.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomRangeAxes((double) 100.0f, plotRenderingInfo15, point2D16, false);
        categoryPlot0.setRangeCrosshairValue((double) 'a', true);
        org.junit.Assert.assertNull(collection6);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.util.List list8 = categoryPlot0.getCategories();
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot0.setDomainAxis((int) (byte) 100, categoryAxis12);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent14 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent14);
        boolean boolean16 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        float float5 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) 0, (int) '#', plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer10, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot13.render(graphics2D17, rectangle2D18, (int) (byte) 100, plotRenderingInfo20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot13.getRenderer((int) (short) 10);
        java.awt.Stroke stroke24 = categoryPlot13.getDomainGridlineStroke();
        java.awt.Stroke stroke25 = categoryPlot13.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = categoryPlot13.getFixedLegendItems();
        boolean boolean27 = categoryPlot13.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder28 = categoryPlot13.getDatasetRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection29 = categoryPlot13.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean31 = categoryPlot30.isRangeZoomable();
        categoryPlot30.setAnchorValue(100.0d, false);
        float float35 = categoryPlot30.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder36 = categoryPlot30.getRowRenderingOrder();
        categoryPlot13.setRowRenderingOrder(sortOrder36);
        categoryPlot0.setColumnRenderingOrder(sortOrder36);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryItemRenderer23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(legendItemCollection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder28);
        org.junit.Assert.assertNotNull(legendItemCollection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder36);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot6.setRangeAxis((int) (byte) 100, valueAxis8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        boolean boolean14 = categoryPlot6.render(graphics2D10, rectangle2D11, (int) (byte) 100, plotRenderingInfo13);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot6.setRenderer(0, categoryItemRenderer16, true);
        float float19 = categoryPlot6.getForegroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot6.getDomainAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((-1), axisLocation20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation20);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = categoryPlot0.getRangeAxisIndex(valueAxis11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot13.zoomRangeAxes((-1.0d), plotRenderingInfo16, point2D17, false);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot13.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot23.zoomRangeAxes((-1.0d), plotRenderingInfo26, point2D27, false);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot23.getRangeAxisLocation((int) (byte) 10);
        categoryPlot13.setDomainAxisLocation((int) (short) 1, axisLocation31, true);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        categoryPlot13.notifyListeners(plotChangeEvent34);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder36 = categoryPlot13.getDatasetRenderingOrder();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        org.jfree.chart.plot.CategoryMarker categoryMarker38 = null;
        org.jfree.chart.util.Layer layer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker38, layer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNotNull(datasetRenderingOrder36);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        categoryPlot0.mapDatasetToRangeAxis((int) ' ', (int) '#');
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        categoryPlot0.setRenderer(categoryItemRenderer4, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot3.setRangeAxis((int) (byte) 100, valueAxis5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        boolean boolean11 = categoryPlot3.render(graphics2D7, rectangle2D8, (int) (byte) 100, plotRenderingInfo10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot3.getRenderer((int) (short) 10);
        java.awt.Stroke stroke14 = categoryPlot3.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot3.getInsets();
        categoryPlot0.setInsets(rectangleInsets15, true);
        org.jfree.chart.plot.CategoryMarker categoryMarker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 1, categoryMarker19, layer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        java.awt.Image image11 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setWeight((-1));
        org.jfree.data.category.CategoryDataset categoryDataset5 = categoryPlot0.getDataset();
        org.junit.Assert.assertNull(categoryDataset5);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.Marker marker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) 1, marker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray8);
        categoryPlot0.setRangeCrosshairValue((double) (-1.0f), false);
        java.awt.Paint paint13 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.Marker marker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer10, true);
        float float13 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryMarker categoryMarker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(categoryAxis15);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        boolean boolean5 = categoryPlot0.isRangeZoomable();
        double double6 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Paint paint7 = categoryPlot0.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis19 };
        categoryPlot18.setDomainAxes(categoryAxisArray20);
        categoryPlot18.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot18.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean27 = categoryPlot26.isRangeZoomable();
        org.jfree.chart.plot.Plot plot28 = categoryPlot26.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation29 = categoryPlot26.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation25, plotOrientation29);
        categoryPlot0.setOrientation(plotOrientation29);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor32 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        categoryPlot0.notifyListeners(plotChangeEvent33);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean37 = categoryPlot36.isRangeZoomable();
        categoryPlot36.setAnchorValue(100.0d, false);
        float float41 = categoryPlot36.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray44 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis43 };
        categoryPlot42.setDomainAxes(categoryAxisArray44);
        java.awt.Stroke stroke46 = categoryPlot42.getOutlineStroke();
        categoryPlot36.setRangeCrosshairStroke(stroke46);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder48 = categoryPlot36.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation49 = categoryPlot36.getRangeAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (byte) -1, axisLocation49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(plot28);
        org.junit.Assert.assertNotNull(plotOrientation29);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertNotNull(categoryAnchor32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray44);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(datasetRenderingOrder48);
        org.junit.Assert.assertNotNull(axisLocation49);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo5, point2D6, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(15, 10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup3);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.clearDomainMarkers((int) ' ');
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis19 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        categoryPlot20.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot23.setRangeAxis((int) (byte) 100, valueAxis25);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot23.getRangeAxisLocation();
        categoryPlot20.setDomainAxisLocation(axisLocation27);
        categoryPlot20.clearRangeMarkers();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot20);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent31 = null;
        categoryPlot20.axisChanged(axisChangeEvent31);
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot20.drawOutline(graphics2D33, rectangle2D34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot7.getDomainAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder12 = categoryPlot7.getRowRenderingOrder();
        boolean boolean13 = categoryPlot7.isOutlineVisible();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(sortOrder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        java.lang.Object obj5 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        float float7 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isRangeZoomable();
        java.awt.Paint paint10 = categoryPlot8.getBackgroundPaint();
        categoryPlot0.setDomainGridlinePaint(paint10);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(valueAxis12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot3.setRangeAxis((int) (byte) 100, valueAxis5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot3.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation7);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        categoryPlot0.axisChanged(axisChangeEvent9);
        org.junit.Assert.assertNotNull(axisLocation7);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset((int) (byte) 100);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxisForDataset((int) (byte) -1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(valueAxis12);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo8, point2D9, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) 10, (int) ' ', plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot5.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection10);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        categoryPlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot0.getRenderer(10);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        java.util.List list18 = categoryPlot0.getCategoriesForAxis(categoryAxis17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (short) 0, (int) (byte) 10, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.clearDomainMarkers((int) ' ');
        categoryPlot0.setForegroundAlpha((float) 100L);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        categoryPlot0.clearDomainMarkers();
        java.lang.Object obj14 = categoryPlot0.clone();
        categoryPlot0.clearRangeAxes();
        java.lang.Class<?> wildcardClass16 = categoryPlot0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo9, point2D10, false);
        java.awt.Image image13 = null;
        categoryPlot0.setBackgroundImage(image13);
        java.awt.Image image15 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer9, true);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace12);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = categoryPlot0.removeAnnotation(categoryAnnotation14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        int int4 = categoryPlot0.getDatasetCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        java.util.List list6 = categoryPlot0.getCategoriesForAxis(categoryAxis5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer12, false);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.configureDomainAxes();
        java.lang.String str19 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot3.setRangeAxis((int) (byte) 100, valueAxis5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot3.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation7);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo11, point2D12, false);
        org.junit.Assert.assertNotNull(axisLocation7);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        categoryPlot0.setNoDataMessage("");
        boolean boolean13 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean15 = categoryPlot14.isRangeZoomable();
        org.jfree.chart.plot.Plot plot16 = categoryPlot14.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot14.getOrientation();
        categoryPlot0.setOrientation(plotOrientation17);
        java.awt.Paint paint19 = categoryPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        categoryPlot0.clearDomainMarkers(0);
        double double9 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Point2D point2D12 = null;
        org.jfree.chart.plot.PlotState plotState13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D10, rectangle2D11, point2D12, plotState13, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis10, false);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis14);
        categoryPlot0.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset18 = categoryPlot0.getDataset();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryDataset18);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis19 };
        categoryPlot18.setDomainAxes(categoryAxisArray20);
        categoryPlot18.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot18.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean27 = categoryPlot26.isRangeZoomable();
        org.jfree.chart.plot.Plot plot28 = categoryPlot26.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation29 = categoryPlot26.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation25, plotOrientation29);
        categoryPlot0.setOrientation(plotOrientation29);
        java.awt.Image image32 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(plot28);
        org.junit.Assert.assertNotNull(plotOrientation29);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertNull(image32);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder10 = categoryPlot7.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot7.zoomRangeAxes((double) 0L, plotRenderingInfo12, point2D13);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot7.setDomainAxes(categoryAxisArray15);
        categoryPlot7.setRangeCrosshairValue((double) (-1.0f), false);
        java.awt.Paint paint20 = categoryPlot7.getRangeCrosshairPaint();
        categoryPlot0.setBackgroundPaint(paint20);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        categoryPlot0.removeChangeListener(plotChangeListener22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setAnchorValue(100.0d, false);
        float float12 = categoryPlot7.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis14 };
        categoryPlot13.setDomainAxes(categoryAxisArray15);
        java.awt.Stroke stroke17 = categoryPlot13.getOutlineStroke();
        categoryPlot7.setRangeCrosshairStroke(stroke17);
        categoryPlot0.setRangeGridlineStroke(stroke17);
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace20);
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        int int25 = categoryPlot0.getDomainAxisIndex(categoryAxis24);
        org.jfree.chart.plot.Plot plot26 = categoryPlot0.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        categoryPlot0.setRenderer((int) (byte) 100, categoryItemRenderer28, true);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(plot26);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        java.util.List list5 = categoryPlot0.getAnnotations();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        float float6 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.chart.util.SortOrder sortOrder14 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot0.getRangeAxisEdge(10);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNotNull(rectangleEdge16);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        int int4 = categoryPlot0.getDatasetCount();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.chart.util.SortOrder sortOrder14 = categoryPlot0.getColumnRenderingOrder();
        boolean boolean15 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        categoryPlot0.addChangeListener(plotChangeListener16);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        categoryPlot0.clearDomainMarkers();
        java.lang.Object obj14 = categoryPlot0.clone();
        categoryPlot0.clearRangeAxes();
        categoryPlot0.setBackgroundAlpha((-1.0f));
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo7, point2D8);
        double double10 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearRangeMarkers();
        categoryPlot11.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke17 = categoryPlot11.getRangeGridlineStroke();
        double double18 = categoryPlot11.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        categoryPlot11.drawBackgroundImage(graphics2D19, rectangle2D20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray23 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer22 };
        categoryPlot11.setRenderers(categoryItemRendererArray23);
        org.jfree.chart.LegendItemCollection legendItemCollection25 = categoryPlot11.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection25);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        categoryPlot0.drawBackgroundImage(graphics2D27, rectangle2D28);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.Plot plot31 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNotNull(plot31);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = categoryPlot0.getRangeAxisIndex(valueAxis11);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        boolean boolean11 = categoryPlot0.isSubplot();
        categoryPlot0.setBackgroundImageAlignment((-1));
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxisForDataset((-1));
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot0.getDomainAxisForDataset(0);
        categoryPlot0.setRangeCrosshairValue((double) (short) 1, false);
        org.jfree.chart.plot.CategoryMarker categoryMarker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker18, layer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryAxis14);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        boolean boolean6 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.awt.Paint paint7 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        java.awt.Paint paint6 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.lang.Object obj4 = categoryPlot0.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomDomainAxes((double) 1L, plotRenderingInfo6, point2D7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) '4', categoryItemRenderer12);
        categoryPlot0.setForegroundAlpha((float) 10);
        java.awt.Stroke stroke16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot0.setDomainGridlineStroke(stroke16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(0, 100, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis10, false);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis14);
        categoryPlot0.setForegroundAlpha((float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.Marker marker4 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.clearDomainMarkers((int) ' ');
        categoryPlot0.setRangeCrosshairVisible(true);
        java.lang.Class<?> wildcardClass19 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.removeChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getRangeAxisLocation((int) (short) 10);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(0, layer10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        categoryPlot0.drawBackgroundImage(graphics2D12, rectangle2D13);
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.clearDomainMarkers((int) ' ');
        java.awt.Stroke stroke17 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((int) (short) -1, categoryAxis19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        categoryPlot0.setAnchorValue(0.0d);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        java.util.List list12 = categoryPlot7.getCategoriesForAxis(categoryAxis11);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        categoryPlot7.axisChanged(axisChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot7.getInsets();
        categoryPlot0.setAxisOffset(rectangleInsets15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot0.zoomRangeAxes((double) ' ', plotRenderingInfo18, point2D19, true);
        org.jfree.chart.plot.CategoryMarker categoryMarker22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Paint paint8 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        boolean boolean11 = categoryPlot0.isRangeCrosshairVisible();
        boolean boolean12 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.lang.Object obj4 = categoryPlot0.clone();
        double double5 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        int int16 = categoryPlot0.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot0.getRangeAxisLocation((int) '#');
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker19, layer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke10 = categoryPlot9.getRangeGridlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis13);
        java.awt.Paint paint15 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        categoryPlot0.setRangeAxis(valueAxis4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot6.setRangeAxis((int) (byte) 100, valueAxis8);
        boolean boolean10 = categoryPlot6.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot6.getDataset((-1));
        java.awt.Stroke stroke13 = categoryPlot6.getRangeGridlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke13);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        int int16 = categoryPlot0.getWeight();
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot0.setRangeAxis(100, valueAxis19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.CategoryMarker categoryMarker3 = null;
        org.jfree.chart.util.Layer layer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker3, layer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 0, valueAxis10);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getDomainAxisEdge(15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.axis.AxisSpace axisSpace15 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray13 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray13);
        java.lang.Object obj15 = categoryPlot0.clone();
        org.jfree.chart.plot.Marker marker16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot3.setRangeAxis((int) (byte) 100, valueAxis5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot3.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation7);
        categoryPlot0.clearRangeMarkers();
        int int10 = categoryPlot0.getDatasetCount();
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getDomainMarkers((int) '#', layer15);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot14.setRangeAxis((int) (byte) 100, valueAxis16);
        boolean boolean18 = categoryPlot14.isOutlineVisible();
        categoryPlot14.setRangeCrosshairLockedOnData(true);
        float float21 = categoryPlot14.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean23 = categoryPlot22.isRangeZoomable();
        categoryPlot22.setWeight(0);
        java.awt.Paint paint26 = categoryPlot22.getBackgroundPaint();
        categoryPlot14.setRangeGridlinePaint(paint26);
        categoryPlot0.setRangeGridlinePaint(paint26);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = categoryPlot0.getDomainMarkers(layer29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(collection30);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryMarker categoryMarker1 = null;
        org.jfree.chart.util.Layer layer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker1, layer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot6.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot6.zoomRangeAxes((-1.0d), plotRenderingInfo9, point2D10, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor13 = categoryPlot6.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot6.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot16.zoomRangeAxes((-1.0d), plotRenderingInfo19, point2D20, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor23 = categoryPlot16.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot16.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = categoryPlot16.getAxisOffset();
        categoryPlot6.setInsets(rectangleInsets26);
        categoryPlot0.setInsets(rectangleInsets26, true);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.data.Range range31 = categoryPlot0.getDataRange(valueAxis30);
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(range31);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) 'a', layer8);
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 100, (int) (byte) 0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = categoryPlot0.removeAnnotation(categoryAnnotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        categoryPlot0.setDataset((int) (short) 10, categoryDataset8);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot10.zoomRangeAxes((-1.0d), plotRenderingInfo13, point2D14, false);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot10.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation18, true);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        categoryPlot0.notifyListeners(plotChangeEvent21);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue(10.0d);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isRangeZoomable();
        categoryPlot8.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder13 = categoryPlot8.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder13);
        java.awt.Paint paint15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = categoryPlot0.getDataset();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryDataset17);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis12 };
        categoryPlot11.setDomainAxes(categoryAxisArray13);
        categoryPlot11.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot11.getDomainAxisLocation(100);
        categoryPlot0.setRangeAxisLocation(axisLocation18, false);
        float float21 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray25 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis24 };
        categoryPlot23.setDomainAxes(categoryAxisArray25);
        float float27 = categoryPlot23.getBackgroundAlpha();
        categoryPlot23.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = categoryPlot23.getDomainAxisForDataset((int) '#');
        boolean boolean33 = categoryPlot23.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot23.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeAxisLocation(0, axisLocation35);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', (int) (short) -1);
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(axisLocation35);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        java.lang.Object obj6 = categoryPlot4.clone();
        categoryPlot4.clearRangeMarkers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray8);
        categoryPlot0.setRangeCrosshairValue((double) (-1.0f), false);
        java.awt.Paint paint13 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot0.getDomainAxisIndex(categoryAxis14);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = categoryPlot0.getDomainAxis((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean7 = categoryPlot6.isRangeZoomable();
        categoryPlot6.setWeight(0);
        java.awt.Paint paint10 = categoryPlot6.getBackgroundPaint();
        categoryPlot0.setNoDataMessagePaint(paint10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo13, point2D14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(categoryAxis5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        int int8 = categoryPlot0.getDomainAxisIndex(categoryAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot11.zoomRangeAxes((-1.0d), plotRenderingInfo14, point2D15, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot11.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation((int) (byte) 0, axisLocation19);
        java.awt.Paint paint21 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        int int4 = categoryPlot0.getDatasetCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.configureRangeAxes();
        categoryPlot5.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot5.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot5.zoomRangeAxes((double) 0L, plotRenderingInfo10, point2D11);
        int int13 = categoryPlot5.getWeight();
        categoryPlot5.setBackgroundImageAlignment((int) (byte) -1);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot5);
        org.jfree.chart.axis.AxisSpace axisSpace17 = categoryPlot5.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(axisSpace17);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.configureDomainAxes();
        java.awt.Stroke stroke5 = categoryPlot0.getOutlineStroke();
        java.util.List list6 = categoryPlot0.getCategories();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent7);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        categoryPlot0.setNoDataMessage("");
        boolean boolean13 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean15 = categoryPlot14.isRangeZoomable();
        org.jfree.chart.plot.Plot plot16 = categoryPlot14.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot14.getOrientation();
        categoryPlot0.setOrientation(plotOrientation17);
        org.jfree.chart.plot.CategoryMarker categoryMarker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 0, categoryMarker20, layer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(plotOrientation17);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis10, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot13.zoomRangeAxes((-1.0d), plotRenderingInfo16, point2D17, false);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot13.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setRangeAxisLocation(axisLocation21, true);
        float float24 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean5 = categoryPlot0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        java.awt.Stroke stroke7 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isRangeZoomable();
        categoryPlot8.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder13 = categoryPlot8.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder13);
        org.jfree.chart.axis.AxisSpace axisSpace15 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace15);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis10);
        boolean boolean13 = categoryPlot8.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder14 = categoryPlot8.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer17, false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sortOrder14);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(legendItemCollection15);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        java.awt.Paint paint14 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearRangeMarkers();
        boolean boolean18 = categoryPlot15.isOutlineVisible();
        categoryPlot15.setRangeGridlinesVisible(false);
        categoryPlot15.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        categoryPlot23.clearRangeMarkers();
        categoryPlot23.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke29 = categoryPlot23.getRangeGridlineStroke();
        double double30 = categoryPlot23.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        categoryPlot23.drawBackgroundImage(graphics2D31, rectangle2D32);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray35 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer34 };
        categoryPlot23.setRenderers(categoryItemRendererArray35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = categoryPlot23.getDrawingSupplier();
        categoryPlot15.setDrawingSupplier(drawingSupplier37);
        categoryPlot0.setDrawingSupplier(drawingSupplier37);
        org.jfree.chart.plot.CategoryMarker categoryMarker41 = null;
        org.jfree.chart.util.Layer layer42 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) '#', categoryMarker41, layer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray35);
        org.junit.Assert.assertNotNull(drawingSupplier37);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(0, categoryMarker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setWeight((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis12);
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot10.getRangeAxisLocation();
        categoryPlot7.setDomainAxisLocation(axisLocation14);
        categoryPlot0.setRangeAxisLocation(10, axisLocation14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 10, plotRenderingInfo18, point2D19);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray21 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray21);
        categoryPlot0.setRangeCrosshairValue((double) 1.0f, true);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        boolean boolean9 = categoryPlot0.isRangeZoomable();
        categoryPlot0.clearDomainMarkers((int) (short) 10);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot7.getDomainAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder12 = categoryPlot7.getRowRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot7.getRangeAxis(10);
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot7.addDomainMarker(categoryMarker15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(sortOrder12);
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        java.awt.Paint paint14 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearRangeMarkers();
        boolean boolean18 = categoryPlot15.isOutlineVisible();
        categoryPlot15.setRangeGridlinesVisible(false);
        categoryPlot15.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        categoryPlot23.clearRangeMarkers();
        categoryPlot23.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke29 = categoryPlot23.getRangeGridlineStroke();
        double double30 = categoryPlot23.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        categoryPlot23.drawBackgroundImage(graphics2D31, rectangle2D32);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray35 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer34 };
        categoryPlot23.setRenderers(categoryItemRendererArray35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = categoryPlot23.getDrawingSupplier();
        categoryPlot15.setDrawingSupplier(drawingSupplier37);
        categoryPlot0.setDrawingSupplier(drawingSupplier37);
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        int int41 = categoryPlot0.getDomainAxisIndex(categoryAxis40);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        java.awt.geom.Point2D point2D44 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) -1, plotRenderingInfo43, point2D44, false);
        java.lang.String str47 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray35);
        org.junit.Assert.assertNotNull(drawingSupplier37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = categoryPlot0.getLegendItems();
        categoryPlot0.clearDomainMarkers((int) (short) 100);
        categoryPlot0.setAnchorValue((double) 1L, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        categoryPlot21.setRangeAxis((int) (byte) 100, valueAxis23);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot21.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(10, axisLocation25);
        org.jfree.chart.plot.Marker marker27 = null;
        org.jfree.chart.util.Layer layer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker27, layer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(axisLocation25);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder5 = categoryPlot0.getDatasetRenderingOrder();
        int int6 = categoryPlot0.getDatasetCount();
        categoryPlot0.setAnchorValue((double) 0L, true);
        java.awt.Paint paint10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlinePaint(paint10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot4.configureRangeAxes();
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot7.setRangeAxis((int) (byte) 100, valueAxis9);
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot7.getRangeAxisLocation();
        categoryPlot4.setDomainAxisLocation(axisLocation11);
        categoryPlot0.setRangeAxisLocation(axisLocation11, false);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.plot.PlotState plotState18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D15, rectangle2D16, point2D17, plotState18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(axisLocation11);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.removeChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot0.markerChanged(markerChangeEvent15);
        categoryPlot0.setRangeCrosshairValue((double) (byte) 10, false);
        org.jfree.chart.axis.ValueAxis valueAxis20 = categoryPlot0.getRangeAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        java.util.List list22 = categoryPlot0.getCategoriesForAxis(categoryAxis21);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setAnchorValue(100.0d, false);
        float float12 = categoryPlot7.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis14 };
        categoryPlot13.setDomainAxes(categoryAxisArray15);
        java.awt.Stroke stroke17 = categoryPlot13.getOutlineStroke();
        categoryPlot7.setRangeCrosshairStroke(stroke17);
        categoryPlot0.setRangeGridlineStroke(stroke17);
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace20);
        categoryPlot0.setDomainGridlinesVisible(true);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        categoryPlot0.drawBackgroundImage(graphics2D24, rectangle2D25);
        java.util.List list27 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(list27);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.removeChangeListener(plotChangeListener12);
        boolean boolean14 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getDomainAxisLocation();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        java.awt.Paint paint8 = categoryPlot0.getDomainGridlinePaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer9);
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        boolean boolean12 = categoryPlot0.isSubplot();
        java.awt.Paint paint13 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = categoryPlot0.getRangeAxisIndex(valueAxis11);
        org.jfree.chart.plot.Plot plot13 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(plot13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        boolean boolean5 = categoryPlot0.isRangeZoomable();
        double double6 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Marker marker7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        categoryPlot0.clearDomainMarkers(0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.setRangeCrosshairValue((double) (short) 0, true);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(drawingSupplier9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        java.lang.Object obj7 = categoryPlot0.clone();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot0.setDomainAxis(categoryAxis8);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = categoryPlot0.getLegendItems();
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        float float10 = categoryPlot6.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearDomainMarkers();
        categoryPlot11.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset17 = categoryPlot11.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        categoryPlot11.removeChangeListener(plotChangeListener18);
        java.awt.Paint paint20 = categoryPlot11.getBackgroundPaint();
        categoryPlot6.setRangeGridlinePaint(paint20);
        categoryPlot0.setOutlinePaint(paint20);
        categoryPlot0.setBackgroundAlpha((float) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 1, plotRenderingInfo14, point2D15, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setWeight((-1));
        java.util.List list5 = categoryPlot0.getCategories();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot7.zoomRangeAxes((-1.0d), plotRenderingInfo10, point2D11, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor14 = categoryPlot7.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot7.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = categoryPlot7.getAxisOffset();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot18.setRangeAxis((int) (byte) 100, valueAxis20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot18.getRangeAxisLocation();
        categoryPlot18.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean26 = categoryPlot25.isRangeZoomable();
        categoryPlot25.setAnchorValue(100.0d, false);
        float float30 = categoryPlot25.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray33 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis32 };
        categoryPlot31.setDomainAxes(categoryAxisArray33);
        java.awt.Stroke stroke35 = categoryPlot31.getOutlineStroke();
        categoryPlot25.setRangeCrosshairStroke(stroke35);
        categoryPlot18.setRangeGridlineStroke(stroke35);
        categoryPlot7.setRangeCrosshairStroke(stroke35);
        categoryPlot0.setRangeGridlineStroke(stroke35);
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        categoryPlot0.setRangeAxis(8, valueAxis41);
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(categoryAnchor14);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray33);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        int int8 = categoryPlot0.getDomainAxisIndex(categoryAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot11.zoomRangeAxes((-1.0d), plotRenderingInfo14, point2D15, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot11.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation((int) (byte) 0, axisLocation19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot0.zoomRangeAxes(0.0d, plotRenderingInfo22, point2D23, false);
        java.awt.Paint paint26 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.data.category.CategoryDataset categoryDataset27 = categoryPlot0.getDataset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(0, (-1), plotRenderingInfo30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categoryDataset27);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray8);
        categoryPlot0.setRangeCrosshairValue((double) (-1.0f), false);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRendererForDataset(categoryDataset13);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNull(categoryItemRenderer14);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue(10.0d);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean7 = categoryPlot6.isRangeZoomable();
        categoryPlot6.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        java.util.List list11 = categoryPlot6.getCategoriesForAxis(categoryAxis10);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        categoryPlot6.axisChanged(axisChangeEvent12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = categoryPlot6.getInsets();
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot6.getColumnRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder15);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(sortOrder15);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.clearDomainMarkers((int) ' ');
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis19 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        categoryPlot20.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot23.setRangeAxis((int) (byte) 100, valueAxis25);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot23.getRangeAxisLocation();
        categoryPlot20.setDomainAxisLocation(axisLocation27);
        categoryPlot20.clearRangeMarkers();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot20);
        boolean boolean31 = categoryPlot20.isRangeCrosshairLockedOnData();
        java.awt.Stroke stroke32 = categoryPlot20.getDomainGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        categoryPlot20.setRenderer((int) 'a', categoryItemRenderer34);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        java.awt.geom.Point2D point2D39 = null;
        categoryPlot20.zoomDomainAxes((double) 0.0f, (double) (byte) 10, plotRenderingInfo38, point2D39);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        float float8 = categoryPlot0.getBackgroundAlpha();
        java.lang.Object obj9 = categoryPlot0.clone();
        categoryPlot0.setBackgroundAlpha((-1.0f));
        float float12 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor13 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(categoryAnchor13);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge((int) (short) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.Plot plot10 = categoryPlot0.getRootPlot();
        org.jfree.data.general.DatasetGroup datasetGroup11 = plot10.getDatasetGroup();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(axisSpace9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNull(datasetGroup11);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo7, point2D8);
        double double10 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearRangeMarkers();
        categoryPlot11.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke17 = categoryPlot11.getRangeGridlineStroke();
        double double18 = categoryPlot11.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        categoryPlot11.drawBackgroundImage(graphics2D19, rectangle2D20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray23 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer22 };
        categoryPlot11.setRenderers(categoryItemRendererArray23);
        org.jfree.chart.LegendItemCollection legendItemCollection25 = categoryPlot11.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        categoryPlot0.setRenderer(categoryItemRenderer27);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(legendItemCollection25);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        boolean boolean8 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo10, point2D11, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot0.zoomDomainAxes((-1.0d), 0.0d, plotRenderingInfo16, point2D17);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot19.setRangeAxis((int) (byte) 100, valueAxis21);
        boolean boolean23 = categoryPlot19.isOutlineVisible();
        categoryPlot19.setRangeCrosshairLockedOnData(true);
        boolean boolean26 = categoryPlot19.isDomainZoomable();
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = categoryPlot19.getDomainMarkers((int) (byte) 0, layer28);
        java.awt.Paint paint30 = categoryPlot19.getNoDataMessagePaint();
        org.jfree.chart.util.SortOrder sortOrder31 = categoryPlot19.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder31);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(sortOrder31);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getAxisOffset();
        java.awt.Paint paint12 = categoryPlot0.getNoDataMessagePaint();
        java.awt.Image image13 = null;
        categoryPlot0.setBackgroundImage(image13);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        java.util.List list7 = categoryPlot0.getCategories();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getDomainMarkers(layer8);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomDomainAxes((double) (-1.0f), (double) 100.0f, plotRenderingInfo6, point2D7);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot9.setDomainAxes(categoryAxisArray11);
        java.awt.Stroke stroke13 = categoryPlot9.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = categoryPlot9.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot9.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot9.markerChanged(markerChangeEvent16);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot9.getRangeAxisEdge((int) (short) 10);
        java.awt.Paint paint20 = categoryPlot9.getRangeGridlinePaint();
        categoryPlot0.setRangeGridlinePaint(paint20);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        categoryPlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot17.setRangeAxis((int) (byte) 100, valueAxis19);
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = categoryPlot17.getDomainMarkers((int) (byte) 10, layer22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        categoryPlot17.setFixedRangeAxisSpace(axisSpace24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot17.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo28, point2D29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = categoryPlot17.getDataset();
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot17.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation32, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection23);
        org.junit.Assert.assertNull(categoryDataset31);
        org.junit.Assert.assertNotNull(axisLocation32);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        categoryPlot0.clearRangeMarkers((int) 'a');
        org.jfree.chart.util.SortOrder sortOrder9 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(sortOrder9);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo16, point2D17, false);
        java.awt.Image image20 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(image20);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        categoryPlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean15 = categoryPlot14.isRangeZoomable();
        org.jfree.chart.plot.Plot plot16 = categoryPlot14.getParent();
        categoryPlot14.configureRangeAxes();
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        categoryPlot14.setFixedDomainAxisSpace(axisSpace18);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot20.zoomRangeAxes((-1.0d), plotRenderingInfo23, point2D24, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor27 = categoryPlot20.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot20.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        categoryPlot30.zoomRangeAxes((-1.0d), plotRenderingInfo33, point2D34, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor37 = categoryPlot30.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = categoryPlot30.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = categoryPlot30.getAxisOffset();
        categoryPlot20.setInsets(rectangleInsets40);
        categoryPlot14.setInsets(rectangleInsets40, true);
        categoryPlot14.setRangeCrosshairValue((double) '4', true);
        boolean boolean47 = categoryPlot0.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(categoryAnchor27);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(categoryAnchor37);
        org.junit.Assert.assertNotNull(rectangleEdge39);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearDomainMarkers();
        categoryPlot11.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray18 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis17 };
        categoryPlot16.setDomainAxes(categoryAxisArray18);
        java.awt.Stroke stroke20 = categoryPlot16.getOutlineStroke();
        categoryPlot11.setRangeCrosshairStroke(stroke20);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot11.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder22);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = categoryPlot0.getDomainAxis((int) ' ');
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(categoryAxisArray18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertNull(categoryAxis25);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        categoryPlot0.clearDomainMarkers(0);
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis12 };
        categoryPlot11.setDomainAxes(categoryAxisArray13);
        java.awt.Stroke stroke15 = categoryPlot11.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot11.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot11.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot11.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot11.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) '#', axisLocation20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot0.zoomRangeAxes(10.0d, plotRenderingInfo23, point2D24, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation27 = categoryPlot0.getOrientation();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot0.getAxisOffset();
        categoryPlot0.setRangeCrosshairValue(0.0d, false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(plotOrientation27);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        int int8 = categoryPlot0.getDomainAxisIndex(categoryAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot11.zoomRangeAxes((-1.0d), plotRenderingInfo14, point2D15, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot11.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation((int) (byte) 0, axisLocation19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot0.zoomRangeAxes(0.0d, plotRenderingInfo22, point2D23, false);
        java.awt.Paint paint26 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.data.category.CategoryDataset categoryDataset27 = categoryPlot0.getDataset();
        categoryPlot0.clearDomainMarkers((int) (byte) 1);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categoryDataset27);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setWeight((-1));
        java.util.List list5 = categoryPlot0.getCategories();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        boolean boolean7 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke10 = categoryPlot9.getRangeGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray14 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis13 };
        categoryPlot12.setDomainAxes(categoryAxisArray14);
        java.awt.Stroke stroke16 = categoryPlot12.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = categoryPlot12.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot12.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        int int20 = categoryPlot12.getDomainAxisIndex(categoryAxis19);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot12.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot23.zoomRangeAxes((-1.0d), plotRenderingInfo26, point2D27, false);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot23.getRangeAxisLocation((int) (byte) 10);
        categoryPlot12.setDomainAxisLocation((int) (byte) 0, axisLocation31);
        categoryPlot9.setRangeAxisLocation(0, axisLocation31, false);
        categoryPlot0.setDomainAxisLocation(8, axisLocation31);
        org.jfree.chart.plot.CategoryMarker categoryMarker36 = null;
        org.jfree.chart.util.Layer layer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker36, layer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(legendItemCollection17);
        org.junit.Assert.assertNull(categoryItemRenderer18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.removeChangeListener(plotChangeListener12);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(15, layer15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        int int18 = categoryPlot0.getRangeAxisIndex(valueAxis17);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        categoryPlot19.clearRangeMarkers();
        categoryPlot19.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke25 = categoryPlot19.getRangeGridlineStroke();
        double double26 = categoryPlot19.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        categoryPlot19.drawBackgroundImage(graphics2D27, rectangle2D28);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray31 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer30 };
        categoryPlot19.setRenderers(categoryItemRendererArray31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = categoryPlot19.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier33);
        org.jfree.chart.plot.CategoryMarker categoryMarker35 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray31);
        org.junit.Assert.assertNotNull(drawingSupplier33);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean7 = categoryPlot6.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot6.setRangeAxis((int) (byte) 1, valueAxis9, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot6.getInsets();
        categoryPlot0.setInsets(rectangleInsets12, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setInsets(rectangleInsets15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(plotOrientation5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot4.configureRangeAxes();
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = categoryPlot4.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder7);
        categoryPlot0.setWeight((int) (short) 10);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
        org.junit.Assert.assertNotNull(sortOrder11);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot4.getRangeAxisLocation();
        java.awt.Stroke stroke7 = categoryPlot4.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot8.getDataset((int) (short) 1);
        categoryPlot8.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot8.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot8.getLegendItems();
        org.jfree.chart.util.SortOrder sortOrder14 = categoryPlot8.getRowRenderingOrder();
        categoryPlot4.setRowRenderingOrder(sortOrder14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(sortOrder14);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer10, true);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getRangeAxisEdge();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent14);
        java.awt.Paint paint16 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        categoryPlot7.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot7.setNoDataMessagePaint(paint12);
        java.awt.Image image14 = categoryPlot7.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot7.zoomDomainAxes((double) 0.0f, plotRenderingInfo16, point2D17);
        java.awt.Paint paint19 = categoryPlot7.getDomainGridlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot7.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation20, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray25 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis24 };
        categoryPlot23.setDomainAxes(categoryAxisArray25);
        categoryPlot23.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot23.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean32 = categoryPlot31.isRangeZoomable();
        org.jfree.chart.plot.Plot plot33 = categoryPlot31.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation34 = categoryPlot31.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation30, plotOrientation34);
        org.jfree.chart.util.RectangleEdge rectangleEdge36 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation20, plotOrientation34);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(plot33);
        org.junit.Assert.assertNotNull(plotOrientation34);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertNotNull(rectangleEdge36);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToDomainAxis((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(datasetGroup13);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot10.zoomRangeAxes((-1.0d), plotRenderingInfo13, point2D14, false);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot10.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation18, true);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        categoryPlot0.notifyListeners(plotChangeEvent21);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder23 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot24.configureRangeAxes();
        categoryPlot24.clearRangeMarkers();
        categoryPlot24.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke30 = categoryPlot24.getRangeGridlineStroke();
        double double31 = categoryPlot24.getRangeCrosshairValue();
        java.awt.Paint paint32 = categoryPlot24.getBackgroundPaint();
        java.awt.Stroke stroke33 = categoryPlot24.getDomainGridlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke33);
        categoryPlot0.setBackgroundAlpha((float) 101);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = categoryPlot7.getDataset((int) (short) 1);
        categoryPlot7.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor12 = categoryPlot7.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        categoryPlot14.clearRangeMarkers();
        boolean boolean17 = categoryPlot14.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot14.setDomainAxis(categoryAxis18);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot20.zoomRangeAxes((-1.0d), plotRenderingInfo23, point2D24, false);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot20.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray29 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot20.setRangeAxes(valueAxisArray29);
        categoryPlot14.setRangeAxes(valueAxisArray29);
        categoryPlot0.setRangeAxes(valueAxisArray29);
        org.jfree.chart.util.Layer layer33 = null;
        java.util.Collection collection34 = categoryPlot0.getRangeMarkers(layer33);
        org.jfree.chart.util.SortOrder sortOrder35 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryAnchor12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNotNull(valueAxisArray29);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertNotNull(sortOrder35);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot17.setRangeAxis((int) (byte) 100, valueAxis19);
        boolean boolean21 = categoryPlot17.isOutlineVisible();
        org.jfree.chart.axis.AxisSpace axisSpace22 = null;
        categoryPlot17.setFixedDomainAxisSpace(axisSpace22);
        java.awt.Font font24 = categoryPlot17.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font24);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(font24);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot3.setRangeAxis((int) (byte) 100, valueAxis5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        boolean boolean11 = categoryPlot3.render(graphics2D7, rectangle2D8, (int) (byte) 100, plotRenderingInfo10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot3.getRenderer((int) (short) 10);
        java.awt.Stroke stroke14 = categoryPlot3.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot3.getInsets();
        categoryPlot0.setInsets(rectangleInsets15, true);
        float float18 = categoryPlot0.getBackgroundImageAlpha();
        boolean boolean19 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.util.SortOrder sortOrder20 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(sortOrder20);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray8);
        org.jfree.data.general.DatasetGroup datasetGroup10 = categoryPlot0.getDatasetGroup();
        boolean boolean11 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot10.zoomRangeAxes((-1.0d), plotRenderingInfo13, point2D14, false);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot10.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation18, true);
        boolean boolean22 = categoryPlot0.equals((java.lang.Object) "hi!");
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder23 = categoryPlot0.getDatasetRenderingOrder();
        float float24 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.removeChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot0.markerChanged(markerChangeEvent15);
        double double17 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer10, true);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.CategoryMarker categoryMarker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot7.getDomainAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder12 = categoryPlot7.getRowRenderingOrder();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot7.setRenderer((int) ' ', categoryItemRenderer14, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot7.getDomainAxis();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(sortOrder12);
        org.junit.Assert.assertNull(categoryAxis17);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        int int4 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot0.setDomainAxis((int) (byte) 1, categoryAxis8, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNull(image6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getDomainMarkers((int) '4', layer10);
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = categoryPlot0.getAxisOffset();
        org.jfree.chart.axis.AxisSpace axisSpace15 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        categoryPlot0.axisChanged(axisChangeEvent16);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(axisSpace15);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        int int11 = categoryPlot0.getWeight();
        categoryPlot0.setBackgroundAlpha((float) (-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        int int6 = categoryPlot4.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot11.setRangeAxis((int) (byte) 100, valueAxis13);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot11.getRangeAxisLocation();
        categoryPlot11.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean19 = categoryPlot18.isRangeZoomable();
        categoryPlot18.setAnchorValue(100.0d, false);
        float float23 = categoryPlot18.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray26 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis25 };
        categoryPlot24.setDomainAxes(categoryAxisArray26);
        java.awt.Stroke stroke28 = categoryPlot24.getOutlineStroke();
        categoryPlot18.setRangeCrosshairStroke(stroke28);
        categoryPlot11.setRangeGridlineStroke(stroke28);
        categoryPlot0.setRangeCrosshairStroke(stroke28);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = categoryPlot0.getDomainAxis((int) (byte) 100);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent34 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent34);
        int int36 = categoryPlot0.getDomainAxisCount();
        java.util.List list37 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(categoryAxis33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(list37);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer((int) (short) -1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) 'a', plotRenderingInfo13, point2D14, false);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer11);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot0.getLegendItems();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        categoryPlot0.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getFixedLegendItems();
        categoryPlot0.clearRangeAxes();
        java.lang.Object obj9 = categoryPlot0.clone();
        java.util.List list10 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) 'a', layer8);
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 100, (int) (byte) 0);
        java.lang.String str13 = categoryPlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Category Plot" + "'", str13, "Category Plot");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        categoryPlot0.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = categoryPlot0.getDataRange(valueAxis11);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNull(range12);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer12, false);
        java.lang.String str15 = categoryPlot0.getPlotType();
        boolean boolean16 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot18.setRangeAxis((int) (byte) 100, valueAxis20);
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = categoryPlot18.getDomainMarkers((int) (byte) 10, layer23);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.configureRangeAxes();
        categoryPlot25.clearDomainMarkers();
        boolean boolean28 = categoryPlot18.equals((java.lang.Object) categoryPlot25);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot25.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean31 = categoryPlot30.isRangeZoomable();
        categoryPlot30.setAnchorValue(100.0d, false);
        float float35 = categoryPlot30.getForegroundAlpha();
        int int36 = categoryPlot30.getWeight();
        org.jfree.chart.util.Layer layer38 = null;
        java.util.Collection collection39 = categoryPlot30.getRangeMarkers((int) 'a', layer38);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = categoryPlot30.getAxisOffset();
        categoryPlot25.setInsets(rectangleInsets40, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot43.configureRangeAxes();
        categoryPlot43.clearDomainMarkers();
        categoryPlot43.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint48 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot43.setNoDataMessagePaint(paint48);
        java.awt.Image image50 = categoryPlot43.getBackgroundImage();
        org.jfree.chart.axis.AxisLocation axisLocation51 = categoryPlot43.getDomainAxisLocation();
        categoryPlot25.setDomainAxisLocation(axisLocation51, false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (byte) -1, axisLocation51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Category Plot" + "'", str15, "Category Plot");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(collection39);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNull(image50);
        org.junit.Assert.assertNotNull(axisLocation51);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = categoryPlot4.getDomainAxis();
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot4.getDomainAxisLocation(0);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot4.getRangeAxisEdge(0);
        categoryPlot4.setNoDataMessage("Category Plot");
        org.junit.Assert.assertNull(categoryAxis5);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 1, plotRenderingInfo8, point2D9);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot1.setRangeAxis((int) (byte) 100, valueAxis3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        boolean boolean9 = categoryPlot1.render(graphics2D5, rectangle2D6, (int) (byte) 100, plotRenderingInfo8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot1.getRenderer((int) (short) 10);
        java.awt.Paint paint12 = categoryPlot1.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis15);
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = categoryPlot13.getDomainMarkers((int) (byte) 10, layer18);
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        categoryPlot13.setFixedRangeAxisSpace(axisSpace20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        categoryPlot13.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo24, point2D25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = categoryPlot13.getDataset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot13.zoomDomainAxes((double) (byte) 0, plotRenderingInfo29, point2D30, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation33 = categoryPlot13.getOrientation();
        categoryPlot1.setOrientation(plotOrientation33);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge35 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(collection19);
        org.junit.Assert.assertNull(categoryDataset27);
        org.junit.Assert.assertNotNull(plotOrientation33);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue((double) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot6.setRangeAxis((int) (byte) 100, valueAxis8);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot6.getRangeAxisLocation();
        categoryPlot6.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean14 = categoryPlot13.isRangeZoomable();
        categoryPlot13.setAnchorValue(100.0d, false);
        float float18 = categoryPlot13.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray21 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis20 };
        categoryPlot19.setDomainAxes(categoryAxisArray21);
        java.awt.Stroke stroke23 = categoryPlot19.getOutlineStroke();
        categoryPlot13.setRangeCrosshairStroke(stroke23);
        categoryPlot6.setRangeGridlineStroke(stroke23);
        org.jfree.chart.axis.AxisSpace axisSpace26 = null;
        categoryPlot6.setFixedRangeAxisSpace(axisSpace26);
        categoryPlot6.setDomainGridlinesVisible(true);
        org.jfree.chart.LegendItemCollection legendItemCollection30 = categoryPlot6.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection30);
        java.awt.Paint paint32 = categoryPlot0.getDomainGridlinePaint();
        categoryPlot0.setOutlineVisible(true);
        int int35 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(legendItemCollection30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot4.configureRangeAxes();
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot7.setRangeAxis((int) (byte) 100, valueAxis9);
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot7.getRangeAxisLocation();
        categoryPlot4.setDomainAxisLocation(axisLocation11);
        categoryPlot0.setRangeAxisLocation(axisLocation11, false);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        boolean boolean19 = categoryPlot0.render(graphics2D15, rectangle2D16, (int) (byte) 1, plotRenderingInfo18);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean5 = categoryPlot0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer7, true);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRendererForDataset(categoryDataset10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemRenderer11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        boolean boolean10 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomRangeAxes((double) '#', 0.0d, plotRenderingInfo8, point2D9);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setAnchorValue(100.0d, false);
        float float12 = categoryPlot7.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis14 };
        categoryPlot13.setDomainAxes(categoryAxisArray15);
        java.awt.Stroke stroke17 = categoryPlot13.getOutlineStroke();
        categoryPlot7.setRangeCrosshairStroke(stroke17);
        categoryPlot0.setRangeGridlineStroke(stroke17);
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace20);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent22 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent22);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean5 = categoryPlot0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer7, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray12 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis11 };
        categoryPlot10.setDomainAxes(categoryAxisArray12);
        java.awt.Stroke stroke14 = categoryPlot10.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot10.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot10.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot10.markerChanged(markerChangeEvent17);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot10.getRangeAxisEdge((int) (short) 10);
        java.awt.Paint paint21 = categoryPlot10.getRangeGridlinePaint();
        categoryPlot0.setRangeCrosshairPaint(paint21);
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.data.Range range13 = categoryPlot0.getDataRange(valueAxis12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo9, point2D10, false);
        java.awt.Image image13 = null;
        categoryPlot0.setBackgroundImage(image13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        categoryPlot0.setDataset(categoryDataset15);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        categoryPlot0.addChangeListener(plotChangeListener17);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryAxis7);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        categoryPlot0.clearAnnotations();
        int int9 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = categoryPlot0.getRenderer();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        categoryPlot0.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(categoryItemRenderer5);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((int) (byte) -1, categoryAxis6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getRangeAxisLocation();
        boolean boolean8 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge(0);
        java.awt.Paint paint11 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis10, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot13.zoomRangeAxes((-1.0d), plotRenderingInfo16, point2D17, false);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot13.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setRangeAxisLocation(axisLocation21, true);
        java.awt.Stroke stroke24 = categoryPlot0.getRangeCrosshairStroke();
        java.awt.Paint paint25 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset26 = categoryPlot0.getDataset();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(categoryDataset26);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        boolean boolean5 = categoryPlot0.isRangeZoomable();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor5 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        categoryPlot6.setRangeCrosshairVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = categoryPlot13.getDataset((int) (short) 1);
        categoryPlot13.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor18 = categoryPlot13.getDomainGridlinePosition();
        categoryPlot6.setDomainGridlinePosition(categoryAnchor18);
        categoryPlot0.setDomainGridlinePosition(categoryAnchor18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo22, point2D23, true);
        java.util.List list26 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(categoryAnchor5);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(categoryAnchor18);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        int int9 = categoryPlot0.getBackgroundImageAlignment();
        double double10 = categoryPlot0.getAnchorValue();
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        categoryPlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        categoryPlot0.setRangeCrosshairValue((double) 'a', true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot0.setRenderer(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setAnchorValue(100.0d, false);
        float float12 = categoryPlot7.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis14 };
        categoryPlot13.setDomainAxes(categoryAxisArray15);
        java.awt.Stroke stroke17 = categoryPlot13.getOutlineStroke();
        categoryPlot7.setRangeCrosshairStroke(stroke17);
        categoryPlot0.setRangeGridlineStroke(stroke17);
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace20);
        categoryPlot0.setDomainGridlinesVisible(true);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        categoryPlot0.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation27 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis12 };
        categoryPlot11.setDomainAxes(categoryAxisArray13);
        java.awt.Stroke stroke15 = categoryPlot11.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot11.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot11.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot11.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot11.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) '#', axisLocation20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot0.zoomRangeAxes(10.0d, plotRenderingInfo23, point2D24, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation27 = categoryPlot0.getOrientation();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot0.getAxisOffset();
        boolean boolean30 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(plotOrientation27);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        int int16 = categoryPlot0.getWeight();
        boolean boolean17 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        int int19 = categoryPlot0.getIndexOf(categoryItemRenderer18);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot20.zoomRangeAxes((-1.0d), plotRenderingInfo23, point2D24, false);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot20.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = categoryPlot20.getRendererForDataset(categoryDataset29);
        org.jfree.chart.axis.ValueAxis valueAxis32 = categoryPlot20.getRangeAxisForDataset((-1));
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = categoryPlot20.getDomainAxisForDataset(0);
        categoryPlot20.setRangeCrosshairValue((double) (short) 1, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        categoryPlot38.setRangeAxis((int) (byte) 100, valueAxis40);
        org.jfree.chart.util.Layer layer43 = null;
        java.util.Collection collection44 = categoryPlot38.getDomainMarkers((int) (byte) 10, layer43);
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot45.configureRangeAxes();
        categoryPlot45.clearDomainMarkers();
        boolean boolean48 = categoryPlot38.equals((java.lang.Object) categoryPlot45);
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot49.configureRangeAxes();
        categoryPlot49.clearRangeMarkers();
        categoryPlot49.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke55 = categoryPlot49.getRangeGridlineStroke();
        double double56 = categoryPlot49.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D57 = null;
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        categoryPlot49.drawBackgroundImage(graphics2D57, rectangle2D58);
        org.jfree.chart.util.RectangleInsets rectangleInsets60 = categoryPlot49.getInsets();
        categoryPlot38.setAxisOffset(rectangleInsets60);
        categoryPlot20.setInsets(rectangleInsets60);
        categoryPlot0.setInsets(rectangleInsets60, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNull(categoryItemRenderer30);
        org.junit.Assert.assertNull(valueAxis32);
        org.junit.Assert.assertNull(categoryAxis34);
        org.junit.Assert.assertNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets60);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis19 };
        categoryPlot18.setDomainAxes(categoryAxisArray20);
        categoryPlot18.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot18.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean27 = categoryPlot26.isRangeZoomable();
        org.jfree.chart.plot.Plot plot28 = categoryPlot26.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation29 = categoryPlot26.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation25, plotOrientation29);
        categoryPlot0.setOrientation(plotOrientation29);
        boolean boolean32 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(plot28);
        org.junit.Assert.assertNotNull(plotOrientation29);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearRangeMarkers();
        categoryPlot11.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke17 = categoryPlot11.getRangeGridlineStroke();
        double double18 = categoryPlot11.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        categoryPlot11.drawBackgroundImage(graphics2D19, rectangle2D20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray23 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer22 };
        categoryPlot11.setRenderers(categoryItemRendererArray23);
        categoryPlot0.setRenderers(categoryItemRendererArray23);
        java.awt.Paint paint26 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer12, false);
        java.lang.String str15 = categoryPlot0.getPlotType();
        boolean boolean16 = categoryPlot0.isRangeCrosshairVisible();
        java.awt.Image image17 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Category Plot" + "'", str15, "Category Plot");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(image17);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = categoryPlot11.getDataset((int) (short) 1);
        categoryPlot11.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor16 = categoryPlot11.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot0.getRangeAxis();
        java.awt.Paint paint19 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        categoryPlot20.setRangeAxis((int) (byte) 100, valueAxis22);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = categoryPlot20.getDomainMarkers((int) (byte) 10, layer25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        categoryPlot20.setFixedRangeAxisSpace(axisSpace27);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        categoryPlot29.setRangeAxis((int) (byte) 100, valueAxis31);
        boolean boolean34 = categoryPlot29.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder35 = categoryPlot29.getRowRenderingOrder();
        categoryPlot20.setRowRenderingOrder(sortOrder35);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot20.setAxisOffset(rectangleInsets37);
        categoryPlot0.setInsets(rectangleInsets37, true);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        java.awt.geom.Point2D point2D43 = null;
        org.jfree.chart.plot.PlotState plotState44 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D41, rectangle2D42, point2D43, plotState44, plotRenderingInfo45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryAnchor16);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(sortOrder35);
        org.junit.Assert.assertNotNull(rectangleInsets37);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot4.getRangeAxisLocation();
        java.awt.Stroke stroke7 = categoryPlot4.getDomainGridlineStroke();
        int int8 = categoryPlot4.getRangeAxisCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot11.setRangeAxis((int) (byte) 100, valueAxis13);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot11.getRangeAxisLocation();
        categoryPlot11.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean19 = categoryPlot18.isRangeZoomable();
        categoryPlot18.setAnchorValue(100.0d, false);
        float float23 = categoryPlot18.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray26 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis25 };
        categoryPlot24.setDomainAxes(categoryAxisArray26);
        java.awt.Stroke stroke28 = categoryPlot24.getOutlineStroke();
        categoryPlot18.setRangeCrosshairStroke(stroke28);
        categoryPlot11.setRangeGridlineStroke(stroke28);
        categoryPlot0.setRangeCrosshairStroke(stroke28);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = categoryPlot0.getDomainAxis((int) (byte) 100);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent34 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent34);
        int int36 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = categoryPlot0.getRenderer((-1));
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(categoryAxis33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer38);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer12, false);
        java.lang.String str15 = categoryPlot0.getPlotType();
        org.jfree.chart.plot.Plot plot16 = categoryPlot0.getParent();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Point2D point2D19 = null;
        org.jfree.chart.plot.PlotState plotState20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D17, rectangle2D18, point2D19, plotState20, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Category Plot" + "'", str15, "Category Plot");
        org.junit.Assert.assertNull(plot16);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot7.setRangeAxis((int) (byte) 100, valueAxis9);
        boolean boolean11 = categoryPlot7.isOutlineVisible();
        categoryPlot7.setRangeCrosshairLockedOnData(true);
        boolean boolean14 = categoryPlot7.isDomainZoomable();
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot7.getDomainMarkers((int) (byte) 0, layer16);
        java.awt.Paint paint18 = categoryPlot7.getNoDataMessagePaint();
        categoryPlot0.setDomainGridlinePaint(paint18);
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        categoryPlot0.setNoDataMessage("");
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        categoryPlot0.addChangeListener(plotChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        categoryPlot7.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray14 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis13 };
        categoryPlot12.setDomainAxes(categoryAxisArray14);
        java.awt.Stroke stroke16 = categoryPlot12.getOutlineStroke();
        categoryPlot7.setRangeCrosshairStroke(stroke16);
        org.jfree.chart.util.SortOrder sortOrder18 = categoryPlot7.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        categoryPlot7.removeChangeListener(plotChangeListener19);
        java.awt.Paint paint21 = categoryPlot7.getNoDataMessagePaint();
        categoryPlot0.setBackgroundPaint(paint21);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = categoryPlot0.getDomainAxisForDataset((int) (short) 1);
        java.awt.Stroke stroke25 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(sortOrder18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(categoryAxis24);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        java.lang.Object obj6 = categoryPlot4.clone();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        int int8 = categoryPlot4.getIndexOf(categoryItemRenderer7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot3.setRangeAxis((int) (byte) 100, valueAxis5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot3.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation7);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray12 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis11 };
        categoryPlot10.setDomainAxes(categoryAxisArray12);
        java.awt.Stroke stroke14 = categoryPlot10.getOutlineStroke();
        categoryPlot10.clearRangeMarkers();
        float float16 = categoryPlot10.getBackgroundAlpha();
        java.awt.Stroke stroke17 = categoryPlot10.getRangeCrosshairStroke();
        categoryPlot0.setDomainGridlineStroke(stroke17);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot0.getDomainAxis();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(categoryAxis19);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        java.lang.Object obj7 = categoryPlot0.clone();
        categoryPlot0.setRangeCrosshairValue((double) 10);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        categoryPlot0.setOutlineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(valueAxis8);
        java.awt.Paint paint10 = categoryPlot0.getDomainGridlinePaint();
        categoryPlot0.setAnchorValue((double) (short) 100);
        java.awt.Font font13 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        org.jfree.chart.plot.CategoryMarker categoryMarker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 1, categoryMarker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.removeChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot0.markerChanged(markerChangeEvent15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        categoryPlot0.setDataset(categoryDataset17);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.configureRangeAxes();
        categoryPlot21.clearRangeMarkers();
        categoryPlot21.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke27 = categoryPlot21.getRangeGridlineStroke();
        double double28 = categoryPlot21.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        categoryPlot21.drawBackgroundImage(graphics2D29, rectangle2D30);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray33 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer32 };
        categoryPlot21.setRenderers(categoryItemRendererArray33);
        java.awt.Paint paint35 = categoryPlot21.getOutlinePaint();
        org.jfree.chart.util.SortOrder sortOrder36 = categoryPlot21.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder36);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(sortOrder36);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = categoryPlot11.getDataset((int) (short) 1);
        categoryPlot11.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor16 = categoryPlot11.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor16);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        categoryPlot0.notifyListeners(plotChangeEvent18);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryAnchor16);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        categoryPlot0.setBackgroundImageAlignment(1);
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray13 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray13);
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean5 = categoryPlot0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer7, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray12 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis11 };
        categoryPlot10.setDomainAxes(categoryAxisArray12);
        java.awt.Stroke stroke14 = categoryPlot10.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot10.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot10.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot10.markerChanged(markerChangeEvent17);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot10.getRangeAxisEdge((int) (short) 10);
        java.awt.Paint paint21 = categoryPlot10.getRangeGridlinePaint();
        categoryPlot0.setRangeCrosshairPaint(paint21);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list24 = categoryPlot23.getAnnotations();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.configureRangeAxes();
        categoryPlot25.clearRangeMarkers();
        categoryPlot25.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke31 = categoryPlot25.getRangeGridlineStroke();
        double double32 = categoryPlot25.getRangeCrosshairValue();
        java.awt.Paint paint33 = categoryPlot25.getBackgroundPaint();
        categoryPlot23.setNoDataMessagePaint(paint33);
        categoryPlot0.setDomainGridlinePaint(paint33);
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        java.awt.geom.Point2D point2D38 = null;
        org.jfree.chart.plot.PlotState plotState39 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D36, rectangle2D37, point2D38, plotState39, plotRenderingInfo40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean5 = categoryPlot4.isRangeZoomable();
        org.jfree.chart.plot.Plot plot6 = categoryPlot4.getParent();
        categoryPlot4.setNoDataMessage("hi!");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        categoryPlot4.notifyListeners(plotChangeEvent9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot4.getDomainAxis((int) 'a');
        categoryPlot4.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot4.getColumnRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder15);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertNotNull(sortOrder15);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomDomainAxes((double) (-1.0f), (double) 100.0f, plotRenderingInfo6, point2D7);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10, false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer9, true);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        categoryPlot14.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        categoryPlot14.setDataset(categoryDataset17);
        categoryPlot14.setWeight(10);
        java.awt.Paint paint21 = categoryPlot14.getOutlinePaint();
        categoryPlot0.setOutlinePaint(paint21);
        org.jfree.chart.plot.Marker marker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker23, layer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent2 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent2);
        java.awt.Font font4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font4);
        int int6 = categoryPlot0.getRangeAxisCount();
        java.lang.String str7 = categoryPlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Category Plot" + "'", str7, "Category Plot");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        int int16 = categoryPlot0.getWeight();
        boolean boolean17 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot18.setRangeAxis((int) (byte) 100, valueAxis20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        boolean boolean26 = categoryPlot18.render(graphics2D22, rectangle2D23, (int) (byte) 100, plotRenderingInfo25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        categoryPlot18.setRenderer(0, categoryItemRenderer28, true);
        float float31 = categoryPlot18.getForegroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot18.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation32, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation32);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        categoryPlot0.axisChanged(axisChangeEvent17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        categoryPlot0.setOutlineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(valueAxis8);
        java.awt.Paint paint10 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(axisSpace11);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.configureRangeAxes();
        categoryPlot5.clearDomainMarkers();
        categoryPlot5.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot5.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot5.removeChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = categoryPlot5.getBackgroundPaint();
        categoryPlot0.setRangeGridlinePaint(paint14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        categoryPlot0.notifyListeners(plotChangeEvent16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace18);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((-1));
        java.awt.Stroke stroke7 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setForegroundAlpha((float) 0);
        boolean boolean10 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        categoryPlot0.setAnchorValue(0.0d);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        java.util.List list12 = categoryPlot7.getCategoriesForAxis(categoryAxis11);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        categoryPlot7.axisChanged(axisChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot7.getInsets();
        categoryPlot0.setAxisOffset(rectangleInsets15);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor17 = categoryPlot0.getDomainGridlinePosition();
        java.awt.Stroke stroke18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeCrosshairStroke(stroke18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(categoryAnchor17);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis19 };
        categoryPlot18.setDomainAxes(categoryAxisArray20);
        categoryPlot18.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot18.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean27 = categoryPlot26.isRangeZoomable();
        org.jfree.chart.plot.Plot plot28 = categoryPlot26.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation29 = categoryPlot26.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation25, plotOrientation29);
        categoryPlot0.setOrientation(plotOrientation29);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor32 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        categoryPlot0.notifyListeners(plotChangeEvent33);
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        categoryPlot0.setDomainAxis(categoryAxis35);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(plot28);
        org.junit.Assert.assertNotNull(plotOrientation29);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertNotNull(categoryAnchor32);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo4, point2D5, false);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.CategoryMarker categoryMarker9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(axisSpace8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        int int4 = categoryPlot0.getDatasetCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.configureRangeAxes();
        categoryPlot5.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot5.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot5.zoomRangeAxes((double) 0L, plotRenderingInfo10, point2D11);
        int int13 = categoryPlot5.getWeight();
        categoryPlot5.setBackgroundImageAlignment((int) (byte) -1);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot5);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        categoryPlot5.datasetChanged(datasetChangeEvent17);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer9, true);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot0.markerChanged(markerChangeEvent12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.axis.AxisSpace axisSpace6 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        int int8 = categoryPlot0.getWeight();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = categoryPlot0.removeAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        categoryPlot0.setAnchorValue(0.0d);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        java.util.List list12 = categoryPlot7.getCategoriesForAxis(categoryAxis11);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        categoryPlot7.axisChanged(axisChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot7.getInsets();
        categoryPlot0.setAxisOffset(rectangleInsets15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot0.zoomRangeAxes((double) ' ', plotRenderingInfo18, point2D19, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot0.setRenderer(categoryItemRenderer22);
        double double24 = categoryPlot0.getAnchorValue();
        java.awt.Paint paint25 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.plot.CategoryMarker categoryMarker27 = null;
        org.jfree.chart.util.Layer layer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((-1), categoryMarker27, layer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot4.configureRangeAxes();
        categoryPlot4.clearDomainMarkers();
        categoryPlot4.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot9.setDomainAxes(categoryAxisArray11);
        java.awt.Stroke stroke13 = categoryPlot9.getOutlineStroke();
        categoryPlot4.setRangeCrosshairStroke(stroke13);
        categoryPlot0.setRangeCrosshairStroke(stroke13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot0.getRendererForDataset(categoryDataset16);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean20 = categoryPlot19.isRangeZoomable();
        categoryPlot19.setAnchorValue(100.0d, false);
        float float24 = categoryPlot19.getForegroundAlpha();
        int int25 = categoryPlot19.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot19.setRangeAxis((int) (byte) 100, valueAxis27, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray32 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis31 };
        categoryPlot30.setDomainAxes(categoryAxisArray32);
        categoryPlot30.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot30.getDomainAxisLocation(100);
        categoryPlot19.setRangeAxisLocation(axisLocation37, false);
        float float40 = categoryPlot19.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray44 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis43 };
        categoryPlot42.setDomainAxes(categoryAxisArray44);
        float float46 = categoryPlot42.getBackgroundAlpha();
        categoryPlot42.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis51 = categoryPlot42.getDomainAxisForDataset((int) '#');
        boolean boolean52 = categoryPlot42.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation54 = categoryPlot42.getDomainAxisLocation((int) (byte) -1);
        categoryPlot19.setRangeAxisLocation(0, axisLocation54);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (byte) -1, axisLocation54, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray32);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.5f + "'", float40 == 0.5f);
        org.junit.Assert.assertNotNull(categoryAxisArray44);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.0f + "'", float46 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(axisLocation54);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        java.awt.Paint paint14 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryMarker categoryMarker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(0, categoryMarker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot7.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean13 = categoryPlot12.isRangeZoomable();
        categoryPlot12.setAnchorValue(100.0d, false);
        float float17 = categoryPlot12.getForegroundAlpha();
        int int18 = categoryPlot12.getWeight();
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot12.getRangeMarkers((int) 'a', layer20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryPlot12.getAxisOffset();
        categoryPlot7.setInsets(rectangleInsets22, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.configureRangeAxes();
        categoryPlot25.clearDomainMarkers();
        categoryPlot25.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot25.setNoDataMessagePaint(paint30);
        java.awt.Image image32 = categoryPlot25.getBackgroundImage();
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot25.getDomainAxisLocation();
        categoryPlot7.setDomainAxisLocation(axisLocation33, false);
        boolean boolean36 = categoryPlot7.getDrawSharedDomainAxis();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Image image4 = null;
        categoryPlot0.setBackgroundImage(image4);
        categoryPlot0.setWeight((-1));
        java.awt.Paint paint8 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot0.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 1, (double) '#', plotRenderingInfo15, point2D16);
        categoryPlot0.setWeight(15);
        categoryPlot0.configureDomainAxes();
        java.lang.Class<?> wildcardClass21 = categoryPlot0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        categoryPlot0.notifyListeners(plotChangeEvent13);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getDomainMarkers((int) '#', layer16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(collection17);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        boolean boolean11 = categoryPlot0.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset(categoryDataset12);
        java.awt.Paint paint14 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryAxis7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        java.awt.Paint paint14 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearRangeMarkers();
        boolean boolean18 = categoryPlot15.isOutlineVisible();
        categoryPlot15.setRangeGridlinesVisible(false);
        categoryPlot15.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        categoryPlot23.clearRangeMarkers();
        categoryPlot23.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke29 = categoryPlot23.getRangeGridlineStroke();
        double double30 = categoryPlot23.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        categoryPlot23.drawBackgroundImage(graphics2D31, rectangle2D32);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray35 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer34 };
        categoryPlot23.setRenderers(categoryItemRendererArray35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = categoryPlot23.getDrawingSupplier();
        categoryPlot15.setDrawingSupplier(drawingSupplier37);
        categoryPlot0.setDrawingSupplier(drawingSupplier37);
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        int int41 = categoryPlot0.getDomainAxisIndex(categoryAxis40);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        java.awt.geom.Point2D point2D44 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) -1, plotRenderingInfo43, point2D44, false);
        java.awt.Stroke stroke47 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray35);
        org.junit.Assert.assertNotNull(drawingSupplier37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(stroke47);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        java.awt.Paint paint11 = categoryPlot0.getRangeGridlinePaint();
        java.util.List list12 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer(0);
        double double11 = categoryPlot0.getAnchorValue();
        org.jfree.chart.axis.AxisSpace axisSpace12 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(axisSpace12);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke10 = categoryPlot9.getRangeGridlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getDomainMarkers(layer15);
        java.util.List list17 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder10 = categoryPlot7.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot7.zoomRangeAxes((double) 0L, plotRenderingInfo12, point2D13);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot7.setDomainAxes(categoryAxisArray15);
        categoryPlot7.setRangeCrosshairValue((double) (-1.0f), false);
        java.awt.Paint paint20 = categoryPlot7.getRangeCrosshairPaint();
        categoryPlot0.setBackgroundPaint(paint20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot0.getDomainAxisForDataset((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(categoryAxis23);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getDomainMarkers((int) '4', layer10);
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray16 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis15 };
        categoryPlot14.setDomainAxes(categoryAxisArray16);
        float float18 = categoryPlot14.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        categoryPlot19.clearDomainMarkers();
        categoryPlot19.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot19.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        categoryPlot19.removeChangeListener(plotChangeListener26);
        java.awt.Paint paint28 = categoryPlot19.getBackgroundPaint();
        categoryPlot14.setRangeGridlinePaint(paint28);
        categoryPlot0.setDomainGridlinePaint(paint28);
        java.lang.String str31 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        int int11 = categoryPlot7.getRangeAxisCount();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        categoryPlot0.setDrawSharedDomainAxis(false);
        boolean boolean11 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot0.setRangeAxis(100, valueAxis12);
        float float14 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearRangeMarkers();
        boolean boolean11 = categoryPlot8.isOutlineVisible();
        categoryPlot8.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot8.setRenderer(categoryItemRenderer14);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot8.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation16);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray21 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis20 };
        categoryPlot19.setDomainAxes(categoryAxisArray21);
        categoryPlot19.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot19.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        categoryPlot27.setRangeAxis((int) (byte) 100, valueAxis29);
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = categoryPlot27.getDomainMarkers((int) (byte) 10, layer32);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean35 = categoryPlot34.isRangeZoomable();
        categoryPlot34.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation39 = categoryPlot34.getOrientation();
        categoryPlot27.setOrientation(plotOrientation39);
        org.jfree.chart.util.RectangleEdge rectangleEdge41 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation26, plotOrientation39);
        categoryPlot0.setRangeAxisLocation((int) (short) 0, axisLocation26);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer44 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer44);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(plotOrientation39);
        org.junit.Assert.assertNotNull(rectangleEdge41);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        categoryPlot0.setRangeCrosshairValue((double) (-1));
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.configureDomainAxes();
        java.awt.Stroke stroke5 = categoryPlot0.getOutlineStroke();
        java.awt.Stroke stroke6 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        categoryPlot13.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot13.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection16);
        int int18 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getFixedLegendItems();
        categoryPlot0.clearRangeAxes();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(legendItemCollection7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomDomainAxes((double) (-1.0f), (double) 100.0f, plotRenderingInfo6, point2D7);
        categoryPlot0.configureDomainAxes();
        java.awt.Paint paint10 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        int int8 = categoryPlot0.getDomainAxisIndex(categoryAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot11.zoomRangeAxes((-1.0d), plotRenderingInfo14, point2D15, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot11.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setDomainAxisLocation((int) (byte) 0, axisLocation19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot0.zoomRangeAxes(0.0d, plotRenderingInfo22, point2D23, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot0.zoomDomainAxes((double) 10, plotRenderingInfo27, point2D28);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        java.awt.Paint paint14 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearRangeMarkers();
        boolean boolean18 = categoryPlot15.isOutlineVisible();
        categoryPlot15.setRangeGridlinesVisible(false);
        categoryPlot15.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        categoryPlot23.clearRangeMarkers();
        categoryPlot23.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke29 = categoryPlot23.getRangeGridlineStroke();
        double double30 = categoryPlot23.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        categoryPlot23.drawBackgroundImage(graphics2D31, rectangle2D32);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray35 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer34 };
        categoryPlot23.setRenderers(categoryItemRendererArray35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = categoryPlot23.getDrawingSupplier();
        categoryPlot15.setDrawingSupplier(drawingSupplier37);
        categoryPlot0.setDrawingSupplier(drawingSupplier37);
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        int int41 = categoryPlot0.getDomainAxisIndex(categoryAxis40);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        java.awt.geom.Point2D point2D44 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) -1, plotRenderingInfo43, point2D44, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(101, 0, plotRenderingInfo49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray35);
        org.junit.Assert.assertNotNull(drawingSupplier37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes((double) 0.0f, plotRenderingInfo9, point2D10);
        categoryPlot0.mapDatasetToDomainAxis((int) '4', (int) '4');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot0.getRenderer();
        categoryPlot0.setForegroundAlpha((float) 0L);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(categoryItemRenderer15);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent2 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((-1), categoryAxis5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        int int8 = categoryPlot0.getDomainAxisIndex(categoryAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getRangeAxisLocation((int) (short) 1);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        int int16 = categoryPlot0.getWeight();
        boolean boolean17 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        int int19 = categoryPlot0.getIndexOf(categoryItemRenderer18);
        java.awt.Paint paint20 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo7, point2D8);
        double double10 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor11 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(categoryAnchor11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        java.awt.Paint paint14 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearRangeMarkers();
        boolean boolean18 = categoryPlot15.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot15.setDomainAxis(categoryAxis19);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        categoryPlot21.zoomRangeAxes((-1.0d), plotRenderingInfo24, point2D25, false);
        org.jfree.chart.axis.AxisLocation axisLocation29 = categoryPlot21.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray30 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot21.setRangeAxes(valueAxisArray30);
        categoryPlot15.setRangeAxes(valueAxisArray30);
        categoryPlot0.setRangeAxes(valueAxisArray30);
        categoryPlot0.setAnchorValue((double) (short) 0, false);
        categoryPlot0.clearRangeAxes();
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        java.awt.geom.Point2D point2D40 = null;
        org.jfree.chart.plot.PlotState plotState41 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D38, rectangle2D39, point2D40, plotState41, plotRenderingInfo42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(valueAxisArray30);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        categoryPlot0.setRangeGridlinesVisible(false);
        java.util.List list17 = categoryPlot0.getAnnotations();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Point2D point2D20 = null;
        org.jfree.chart.plot.PlotState plotState21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D18, rectangle2D19, point2D20, plotState21, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot3.setRangeAxis((int) (byte) 100, valueAxis5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot3.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation7);
        categoryPlot0.clearRangeMarkers();
        int int10 = categoryPlot0.getDatasetCount();
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getRangeAxisEdge(8);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        categoryPlot0.clearDomainMarkers();
        boolean boolean14 = categoryPlot0.isRangeCrosshairVisible();
        java.awt.Stroke stroke15 = categoryPlot0.getDomainGridlineStroke();
        java.lang.String str16 = categoryPlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Category Plot" + "'", str16, "Category Plot");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 100);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot4.configureRangeAxes();
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = categoryPlot4.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset((int) '4', categoryDataset10);
        categoryPlot0.setRangeCrosshairValue((double) 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.util.SortOrder sortOrder7 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(sortOrder7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        float float8 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(axisSpace9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot0.getDomainAxis(15);
        java.awt.Stroke stroke15 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot10.zoomRangeAxes((-1.0d), plotRenderingInfo13, point2D14, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor17 = categoryPlot10.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot10.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = categoryPlot10.getAxisOffset();
        categoryPlot0.setInsets(rectangleInsets20);
        categoryPlot0.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset24 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor25 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot0.getRenderer(10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        categoryPlot0.setRenderer((int) (short) 0, categoryItemRenderer29);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(categoryAnchor25);
        org.junit.Assert.assertNull(categoryItemRenderer27);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
        java.awt.Image image11 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray16 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis15 };
        categoryPlot14.setDomainAxes(categoryAxisArray16);
        categoryPlot14.setAnchorValue(10.0d);
        categoryPlot14.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean23 = categoryPlot22.isRangeZoomable();
        categoryPlot22.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder27 = categoryPlot22.getDatasetRenderingOrder();
        categoryPlot14.setDatasetRenderingOrder(datasetRenderingOrder27);
        java.awt.Paint paint29 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot14.setNoDataMessagePaint(paint29);
        categoryPlot0.setBackgroundPaint(paint29);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) 10, (int) (byte) 1, plotRenderingInfo34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder27);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray13 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray13);
        java.lang.Object obj15 = categoryPlot0.clone();
        categoryPlot0.setBackgroundImageAlignment(15);
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer10, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot13.render(graphics2D17, rectangle2D18, (int) (byte) 100, plotRenderingInfo20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot13.getRenderer((int) (short) 10);
        java.awt.Stroke stroke24 = categoryPlot13.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = categoryPlot13.getInsets();
        categoryPlot0.setInsets(rectangleInsets25, false);
        boolean boolean28 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean29 = categoryPlot0.isDomainZoomable();
        java.lang.Object obj30 = categoryPlot0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryItemRenderer23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        float float13 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        categoryPlot9.clearRangeMarkers();
        boolean boolean12 = categoryPlot9.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        categoryPlot13.clearDomainMarkers();
        categoryPlot13.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis19 };
        categoryPlot18.setDomainAxes(categoryAxisArray20);
        java.awt.Stroke stroke22 = categoryPlot18.getOutlineStroke();
        categoryPlot13.setRangeCrosshairStroke(stroke22);
        categoryPlot9.setRangeCrosshairStroke(stroke22);
        categoryPlot0.setRangeCrosshairStroke(stroke22);
        org.jfree.data.category.CategoryDataset categoryDataset27 = categoryPlot0.getDataset((int) '4');
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNull(categoryDataset27);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray13 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray13);
        categoryPlot0.setRangeCrosshairValue(100.0d);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis12 };
        categoryPlot11.setDomainAxes(categoryAxisArray13);
        java.awt.Stroke stroke15 = categoryPlot11.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot11.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot11.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot11.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot11.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) '#', axisLocation20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot0.setRenderer(categoryItemRenderer22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        categoryPlot0.zoomRangeAxes((double) (-1L), plotRenderingInfo25, point2D26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot0.getDataset((int) (short) 0);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(categoryDataset29);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        categoryPlot0.setAnchorValue(0.0d);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        java.util.List list12 = categoryPlot7.getCategoriesForAxis(categoryAxis11);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        categoryPlot7.axisChanged(axisChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot7.getInsets();
        categoryPlot0.setAxisOffset(rectangleInsets15);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor17 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(categoryAnchor17);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getRangeAxisEdge(10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot0.zoomRangeAxes((double) (-1L), (double) 100, plotRenderingInfo16, point2D17);
        org.jfree.chart.plot.Marker marker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) 100, marker20, layer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot11.setRangeAxis((int) (byte) 100, valueAxis13);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot11.getRangeAxisLocation();
        categoryPlot11.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean19 = categoryPlot18.isRangeZoomable();
        categoryPlot18.setAnchorValue(100.0d, false);
        float float23 = categoryPlot18.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray26 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis25 };
        categoryPlot24.setDomainAxes(categoryAxisArray26);
        java.awt.Stroke stroke28 = categoryPlot24.getOutlineStroke();
        categoryPlot18.setRangeCrosshairStroke(stroke28);
        categoryPlot11.setRangeGridlineStroke(stroke28);
        categoryPlot0.setRangeCrosshairStroke(stroke28);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot0.getRangeAxisEdge((int) (byte) -1);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(rectangleEdge33);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        java.awt.Paint paint14 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearRangeMarkers();
        boolean boolean18 = categoryPlot15.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot15.setDomainAxis(categoryAxis19);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        categoryPlot21.zoomRangeAxes((-1.0d), plotRenderingInfo24, point2D25, false);
        org.jfree.chart.axis.AxisLocation axisLocation29 = categoryPlot21.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray30 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot21.setRangeAxes(valueAxisArray30);
        categoryPlot15.setRangeAxes(valueAxisArray30);
        categoryPlot0.setRangeAxes(valueAxisArray30);
        java.awt.Paint paint34 = categoryPlot0.getOutlinePaint();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(valueAxisArray30);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        org.jfree.data.general.DatasetGroup datasetGroup5 = categoryPlot0.getDatasetGroup();
        float float6 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        int int8 = categoryPlot0.getDomainAxisIndex(categoryAxis7);
        categoryPlot0.setWeight((int) 'a');
        java.awt.Stroke stroke11 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        categoryPlot0.setDomainAxis(categoryAxis4);
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = categoryPlot0.getRangeMarkers(layer6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearDomainMarkers();
        categoryPlot8.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot8.setNoDataMessagePaint(paint13);
        java.awt.Image image15 = categoryPlot8.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot8.zoomDomainAxes((double) 0.0f, plotRenderingInfo17, point2D18);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot20.zoomRangeAxes((-1.0d), plotRenderingInfo23, point2D24, false);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot20.setRangeAxis(valueAxis27);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        categoryPlot20.setRangeAxis(valueAxis29);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset33 = categoryPlot31.getDataset((int) (short) 1);
        categoryPlot31.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor36 = categoryPlot31.getDomainGridlinePosition();
        categoryPlot20.setDomainGridlinePosition(categoryAnchor36);
        categoryPlot8.setParent((org.jfree.chart.plot.Plot) categoryPlot20);
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean40 = categoryPlot39.isRangeZoomable();
        categoryPlot39.setAnchorValue(100.0d, false);
        float float44 = categoryPlot39.getForegroundAlpha();
        int int45 = categoryPlot39.getWeight();
        org.jfree.chart.plot.Plot plot46 = categoryPlot39.getRootPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot47.configureRangeAxes();
        categoryPlot47.clearDomainMarkers();
        categoryPlot47.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset53 = categoryPlot47.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent54 = null;
        categoryPlot47.rendererChanged(rendererChangeEvent54);
        java.awt.Font font56 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot47.setNoDataMessageFont(font56);
        categoryPlot39.setNoDataMessageFont(font56);
        categoryPlot20.setNoDataMessageFont(font56);
        categoryPlot0.setNoDataMessageFont(font56);
        categoryPlot0.setAnchorValue((double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNull(categoryDataset33);
        org.junit.Assert.assertNotNull(categoryAnchor36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(plot46);
        org.junit.Assert.assertNull(categoryDataset53);
        org.junit.Assert.assertNotNull(font56);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot4.getRangeAxisLocation();
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot4.getFixedDomainAxisSpace();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNull(axisSpace7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Paint paint11 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot0.setRangeCrosshairPaint(paint11);
        java.awt.Paint paint13 = categoryPlot0.getOutlinePaint();
        java.awt.Stroke stroke14 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getRangeAxisLocation((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        categoryPlot0.setAnchorValue(0.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = categoryPlot0.getInsets();
        java.lang.Class<?> wildcardClass8 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Paint paint8 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        categoryPlot0.axisChanged(axisChangeEvent9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) 1L, (double) 100, plotRenderingInfo13, point2D14);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getDomainMarkers(layer16);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(collection17);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getRangeAxisLocation();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(axisLocation7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent7);
        java.awt.Font font9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font9);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace12);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(axisSpace6);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot4.configureRangeAxes();
        categoryPlot4.clearRangeMarkers();
        boolean boolean7 = categoryPlot4.isOutlineVisible();
        categoryPlot4.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot4.setRenderer(categoryItemRenderer10);
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot4.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation((int) (short) 0, axisLocation12, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) 100, (int) '#', plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis12 };
        categoryPlot11.setDomainAxes(categoryAxisArray13);
        java.awt.Stroke stroke15 = categoryPlot11.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot11.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot11.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot11.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot11.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) '#', axisLocation20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot0.setRenderer(categoryItemRenderer22);
        int int24 = categoryPlot0.getBackgroundImageAlignment();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis10, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean14 = categoryPlot13.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot13.setRangeAxis((int) (byte) 1, valueAxis16, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = categoryPlot13.getInsets();
        categoryPlot0.setInsets(rectangleInsets19);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((-1));
        java.awt.Stroke stroke7 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setForegroundAlpha((float) 0);
        java.awt.Paint paint10 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean5 = categoryPlot0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer7, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray12 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis11 };
        categoryPlot10.setDomainAxes(categoryAxisArray12);
        java.awt.Stroke stroke14 = categoryPlot10.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot10.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot10.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot10.markerChanged(markerChangeEvent17);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot10.getRangeAxisEdge((int) (short) 10);
        java.awt.Paint paint21 = categoryPlot10.getRangeGridlinePaint();
        categoryPlot0.setRangeCrosshairPaint(paint21);
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        categoryPlot0.setRangeAxis(valueAxis23);
        java.awt.Paint paint25 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        float float22 = categoryPlot17.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder23 = categoryPlot17.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder23);
        org.jfree.chart.axis.AxisSpace axisSpace25 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation28 = null;
        categoryPlot0.setDomainAxisLocation(100, axisLocation28);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder23);
        org.junit.Assert.assertNull(axisSpace25);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer12, false);
        java.lang.String str15 = categoryPlot0.getPlotType();
        org.jfree.chart.plot.Plot plot16 = categoryPlot0.getParent();
        java.awt.Paint paint17 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomRangeAxes(100.0d, plotRenderingInfo19, point2D20, true);
        boolean boolean23 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Category Plot" + "'", str15, "Category Plot");
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot8.zoomRangeAxes((-1.0d), plotRenderingInfo11, point2D12, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor15 = categoryPlot8.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Point2D point2D19 = null;
        org.jfree.chart.plot.PlotState plotState20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D17, rectangle2D18, point2D19, plotState20, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(categoryAnchor15);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) '4', categoryItemRenderer12);
        categoryPlot0.setForegroundAlpha((float) 10);
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.lang.Object obj4 = categoryPlot0.clone();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer12, false);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        float float22 = categoryPlot17.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray25 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis24 };
        categoryPlot23.setDomainAxes(categoryAxisArray25);
        java.awt.Stroke stroke27 = categoryPlot23.getOutlineStroke();
        categoryPlot17.setRangeCrosshairStroke(stroke27);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder29 = categoryPlot17.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.data.Range range32 = categoryPlot0.getDataRange(valueAxis31);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
        org.junit.Assert.assertNull(range32);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.plot.Plot plot7 = categoryPlot0.getRootPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearRangeMarkers();
        categoryPlot8.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke14 = categoryPlot8.getRangeGridlineStroke();
        double double15 = categoryPlot8.getRangeCrosshairValue();
        java.awt.Paint paint16 = categoryPlot8.getBackgroundPaint();
        categoryPlot0.setRangeCrosshairPaint(paint16);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot0.getDomainAxis((int) (short) 10);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent20 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryAxis19);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        categoryPlot0.setRangeAxis(valueAxis4);
        categoryPlot0.setWeight((int) (short) 10);
        java.awt.Font font8 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        int int11 = categoryPlot0.getWeight();
        int int12 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke10);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis14);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(legendItemCollection12);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 100, (double) 100L, plotRenderingInfo12, point2D13);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(rectangleEdge9);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        categoryPlot5.setAnchorValue(10.0d);
        categoryPlot5.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean14 = categoryPlot13.isRangeZoomable();
        categoryPlot13.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder18 = categoryPlot13.getDatasetRenderingOrder();
        categoryPlot5.setDatasetRenderingOrder(datasetRenderingOrder18);
        java.awt.Paint paint20 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot5.setNoDataMessagePaint(paint20);
        categoryPlot0.setRangeCrosshairPaint(paint20);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray25 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis24 };
        categoryPlot23.setDomainAxes(categoryAxisArray25);
        categoryPlot23.setAnchorValue((double) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        categoryPlot29.setRangeAxis((int) (byte) 100, valueAxis31);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot29.getRangeAxisLocation();
        categoryPlot29.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean37 = categoryPlot36.isRangeZoomable();
        categoryPlot36.setAnchorValue(100.0d, false);
        float float41 = categoryPlot36.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray44 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis43 };
        categoryPlot42.setDomainAxes(categoryAxisArray44);
        java.awt.Stroke stroke46 = categoryPlot42.getOutlineStroke();
        categoryPlot36.setRangeCrosshairStroke(stroke46);
        categoryPlot29.setRangeGridlineStroke(stroke46);
        org.jfree.chart.axis.AxisSpace axisSpace49 = null;
        categoryPlot29.setFixedRangeAxisSpace(axisSpace49);
        categoryPlot29.setDomainGridlinesVisible(true);
        org.jfree.chart.LegendItemCollection legendItemCollection53 = categoryPlot29.getLegendItems();
        categoryPlot23.setFixedLegendItems(legendItemCollection53);
        categoryPlot0.setFixedLegendItems(legendItemCollection53);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray44);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(legendItemCollection53);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes((double) 0.0f, plotRenderingInfo9, point2D10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot14.setRangeAxis((int) (byte) 100, valueAxis16);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot14.getDomainMarkers((int) (byte) 10, layer19);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.configureRangeAxes();
        categoryPlot21.clearDomainMarkers();
        boolean boolean24 = categoryPlot14.equals((java.lang.Object) categoryPlot21);
        java.awt.Image image25 = categoryPlot14.getBackgroundImage();
        categoryPlot14.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray30 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis29 };
        categoryPlot28.setDomainAxes(categoryAxisArray30);
        categoryPlot28.setAnchorValue(10.0d);
        categoryPlot28.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean37 = categoryPlot36.isRangeZoomable();
        categoryPlot36.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder41 = categoryPlot36.getDatasetRenderingOrder();
        categoryPlot28.setDatasetRenderingOrder(datasetRenderingOrder41);
        java.awt.Paint paint43 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot28.setNoDataMessagePaint(paint43);
        categoryPlot14.setBackgroundPaint(paint43);
        categoryPlot0.setRangeCrosshairPaint(paint43);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        java.awt.geom.Point2D point2D49 = null;
        categoryPlot0.zoomRangeAxes((double) (short) -1, plotRenderingInfo48, point2D49);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertNotNull(categoryAxisArray30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder41);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.Plot plot7 = categoryPlot0.getParent();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot7.notifyListeners(plotChangeEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(plot7);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        java.util.List list6 = categoryPlot0.getCategoriesForAxis(categoryAxis5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray9 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot0.setRenderers(categoryItemRendererArray9);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.configureRangeAxes();
        categoryPlot12.clearRangeMarkers();
        boolean boolean15 = categoryPlot12.isOutlineVisible();
        categoryPlot12.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot12.setRenderer(categoryItemRenderer18);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot12.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (short) 0, axisLocation20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot0.getRenderer();
        float float23 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = categoryPlot0.getDomainMarkers((int) (short) 0, layer25);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        categoryPlot0.notifyListeners(plotChangeEvent27);
        java.awt.Paint paint29 = categoryPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        float float7 = categoryPlot0.getForegroundAlpha();
        int int8 = categoryPlot0.getWeight();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        boolean boolean18 = categoryPlot10.render(graphics2D14, rectangle2D15, (int) (byte) 100, plotRenderingInfo17);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot10.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot10.setRenderer((int) 'a', categoryItemRenderer22, false);
        categoryPlot10.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot10.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation27);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot0.getRangeAxisLocation((int) '#');
        categoryPlot0.setForegroundAlpha(0.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(legendItemCollection9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(axisLocation30);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 0, valueAxis10);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getDomainAxisEdge(15);
        java.util.List list14 = categoryPlot0.getAnnotations();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = categoryPlot0.getRangeAxisIndex(valueAxis6);
        categoryPlot0.clearDomainMarkers((int) (byte) 0);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxes(categoryAxisArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue(10.0d);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isRangeZoomable();
        categoryPlot8.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder13 = categoryPlot8.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder13);
        java.awt.Paint paint15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint15);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = categoryPlot0.getAxisOffset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent18 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent18);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis3 = categoryPlot0.getRangeAxis(0);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.junit.Assert.assertNull(valueAxis3);
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        categoryPlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        categoryPlot0.setRangeCrosshairValue((double) 'a', true);
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlinePosition(categoryAnchor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        java.util.List list9 = categoryPlot0.getCategories();
        java.lang.String str10 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo12, point2D13, false);
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 1, marker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke9 = plot8.getOutlineStroke();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        java.lang.String str11 = categoryPlot0.getNoDataMessage();
        categoryPlot0.clearDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        categoryPlot0.setDataset((int) (byte) 10, categoryDataset14);
        java.awt.Image image16 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list18 = categoryPlot0.getCategoriesForAxis(categoryAxis17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer(0);
        double double11 = categoryPlot0.getAnchorValue();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) 1.0f, (double) (byte) 0, plotRenderingInfo14, point2D15);
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearRangeMarkers();
        boolean boolean11 = categoryPlot8.isOutlineVisible();
        categoryPlot8.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot8.setRenderer(categoryItemRenderer14);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot8.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation16);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot0.getDomainAxisIndex(categoryAxis18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        boolean boolean10 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(8, marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue(10.0d);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isRangeZoomable();
        categoryPlot8.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder13 = categoryPlot8.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot15.setRangeAxis((int) (byte) 100, valueAxis17);
        boolean boolean19 = categoryPlot15.isOutlineVisible();
        categoryPlot15.setRangeCrosshairLockedOnData(true);
        boolean boolean22 = categoryPlot15.isDomainZoomable();
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot15.getDomainMarkers((int) (byte) 0, layer24);
        java.awt.Paint paint26 = categoryPlot15.getNoDataMessagePaint();
        categoryPlot0.setDomainGridlinePaint(paint26);
        org.jfree.chart.plot.CategoryMarker categoryMarker28 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        java.lang.Object obj6 = categoryPlot4.clone();
        int int7 = categoryPlot4.getRangeAxisCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 0, valueAxis10);
        java.awt.Paint paint12 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.Plot plot13 = categoryPlot0.getRootPlot();
        java.awt.Paint paint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setNoDataMessagePaint(paint14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        float float8 = categoryPlot0.getBackgroundAlpha();
        java.lang.Object obj9 = categoryPlot0.clone();
        categoryPlot0.setBackgroundAlpha((-1.0f));
        double double12 = categoryPlot0.getAnchorValue();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = categoryPlot0.removeAnnotation(categoryAnnotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.isRangeGridlinesVisible();
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray7 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis6 };
        categoryPlot5.setDomainAxes(categoryAxisArray7);
        java.awt.Stroke stroke9 = categoryPlot5.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.removeChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        boolean boolean18 = categoryPlot10.render(graphics2D14, rectangle2D15, (int) (byte) 100, plotRenderingInfo17);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot10.getRenderer((int) (short) 10);
        java.awt.Stroke stroke21 = categoryPlot10.getDomainGridlineStroke();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor22 = categoryPlot10.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor22);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(categoryAnchor22);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        int int4 = categoryPlot0.getDatasetCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        java.util.List list6 = categoryPlot0.getCategoriesForAxis(categoryAxis5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot7.zoomRangeAxes((-1.0d), plotRenderingInfo10, point2D11, false);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot7.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot7.getRangeMarkers(0, layer17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = categoryPlot7.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier19);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(drawingSupplier19);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        int int4 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis10, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        categoryPlot14.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup17 = categoryPlot14.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot14.setRenderer((int) (byte) 1, categoryItemRenderer19);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot14.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (byte) 1, axisLocation21);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.Marker marker24 = null;
        org.jfree.chart.util.Layer layer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker24, layer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(legendItemCollection23);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue((double) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot6.setRangeAxis((int) (byte) 100, valueAxis8);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot6.getRangeAxisLocation();
        categoryPlot6.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean14 = categoryPlot13.isRangeZoomable();
        categoryPlot13.setAnchorValue(100.0d, false);
        float float18 = categoryPlot13.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray21 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis20 };
        categoryPlot19.setDomainAxes(categoryAxisArray21);
        java.awt.Stroke stroke23 = categoryPlot19.getOutlineStroke();
        categoryPlot13.setRangeCrosshairStroke(stroke23);
        categoryPlot6.setRangeGridlineStroke(stroke23);
        org.jfree.chart.axis.AxisSpace axisSpace26 = null;
        categoryPlot6.setFixedRangeAxisSpace(axisSpace26);
        categoryPlot6.setDomainGridlinesVisible(true);
        org.jfree.chart.LegendItemCollection legendItemCollection30 = categoryPlot6.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection30);
        java.awt.Paint paint32 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset33 = categoryPlot0.getDataset();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(legendItemCollection30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(categoryDataset33);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        boolean boolean10 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        int int12 = categoryPlot0.getRangeAxisIndex(valueAxis11);
        org.jfree.chart.plot.Plot plot13 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(plot13);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot0.setRenderers(categoryItemRendererArray12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.clearDomainMarkers((int) ' ');
        double double17 = categoryPlot0.getAnchorValue();
        categoryPlot0.clearDomainMarkers(0);
        org.jfree.chart.plot.Plot plot20 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        boolean boolean7 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.configureRangeAxes();
        java.awt.Stroke stroke9 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.plot.Marker marker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 100, marker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo11, point2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo16, point2D17, false);
        java.awt.Image image20 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        categoryPlot0.notifyListeners(plotChangeEvent21);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(image20);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        float float8 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot4.getRangeAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge8 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation6, plotOrientation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(axisLocation6);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        boolean boolean11 = categoryPlot0.isDomainZoomable();
        categoryPlot0.setBackgroundImageAlignment(1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

