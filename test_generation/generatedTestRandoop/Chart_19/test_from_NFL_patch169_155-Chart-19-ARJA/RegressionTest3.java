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
        java.awt.Paint paint15 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setWeight((int) (short) -1);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        categoryPlot0.setAnchorValue((double) (short) 100);
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(sortOrder6);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        int int8 = categoryPlot0.getWeight();
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        categoryPlot0.clearDomainMarkers((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot0.getDomainAxisLocation(0);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent19 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent19);
        categoryPlot0.mapDatasetToDomainAxis(15, (int) (short) -1);
        boolean boolean24 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(100, valueAxis8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 100, plotRenderingInfo11, point2D12, false);
        float float15 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryMarker categoryMarker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(100, categoryMarker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        categoryPlot0.markerChanged(markerChangeEvent10);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace13);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNull(categoryAxis12);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(axisSpace8);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        categoryPlot0.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer23);
        java.awt.Paint paint25 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        org.jfree.data.category.CategoryDataset categoryDataset35 = categoryPlot0.getDataset();
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace36);
        java.awt.Stroke stroke38 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset39 = categoryPlot0.getDataset();
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
        org.junit.Assert.assertNull(categoryDataset35);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNull(categoryDataset39);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(0, layer10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.setForegroundAlpha((float) '4');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRenderer((-1), categoryItemRenderer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        categoryPlot0.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot0.getRangeAxisLocation(100);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot4.zoomRangeAxes((double) 8, plotRenderingInfo7, point2D8, false);
        org.jfree.data.general.DatasetGroup datasetGroup11 = categoryPlot4.getDatasetGroup();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot4.getDomainAxisLocation(8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent14 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent14);
        int int16 = categoryPlot0.getWeight();
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot0.getRangeAxisEdge((int) '#');
        categoryPlot0.setAnchorValue((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge20);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        org.jfree.data.general.DatasetGroup datasetGroup22 = categoryPlot0.getDatasetGroup();
        int int23 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier24);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer((int) (short) -1);
        float float12 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        categoryPlot13.clearRangeMarkers();
        boolean boolean16 = categoryPlot13.isOutlineVisible();
        categoryPlot13.setRangeGridlinesVisible(false);
        boolean boolean19 = categoryPlot13.isDomainGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot20.zoomRangeAxes((-1.0d), plotRenderingInfo23, point2D24, false);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot20.setRangeAxis(valueAxis27);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray29 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot20.setRenderers(categoryItemRendererArray29);
        categoryPlot13.setRenderers(categoryItemRendererArray29);
        categoryPlot0.setRenderers(categoryItemRendererArray29);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(categoryItemRendererArray29);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean5 = categoryPlot0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer7, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent10);
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        categoryPlot0.setDomainAxis(categoryAxis4);
        boolean boolean6 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        java.util.List list12 = categoryPlot7.getCategoriesForAxis(categoryAxis11);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        categoryPlot7.axisChanged(axisChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot7.getInsets();
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot7.getColumnRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomRangeAxes(0.0d, plotRenderingInfo19, point2D20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(sortOrder16);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot0.zoomRangeAxes(0.0d, plotRenderingInfo23, point2D24, true);
        double double27 = categoryPlot0.getRangeCrosshairValue();
        int int28 = categoryPlot0.getRangeAxisCount();
        categoryPlot0.mapDatasetToDomainAxis((int) ' ', (int) (short) 100);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot0.getDomainAxisLocation((int) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        categoryPlot0.setRenderer(categoryItemRenderer34, false);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent37 = null;
        categoryPlot0.notifyListeners(plotChangeEvent37);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(axisLocation33);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = categoryPlot0.getDomainMarkers(layer27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        java.awt.geom.Point2D point2D31 = null;
        org.jfree.chart.plot.PlotState plotState32 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D29, rectangle2D30, point2D31, plotState32, plotRenderingInfo33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(collection28);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis10, false);
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot15.setRangeAxis((int) (byte) 100, valueAxis17);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot15.getRangeAxisLocation();
        categoryPlot15.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean23 = categoryPlot22.isRangeZoomable();
        categoryPlot22.setAnchorValue(100.0d, false);
        float float27 = categoryPlot22.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray30 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis29 };
        categoryPlot28.setDomainAxes(categoryAxisArray30);
        java.awt.Stroke stroke32 = categoryPlot28.getOutlineStroke();
        categoryPlot22.setRangeCrosshairStroke(stroke32);
        categoryPlot15.setRangeGridlineStroke(stroke32);
        org.jfree.chart.axis.AxisSpace axisSpace35 = null;
        categoryPlot15.setFixedRangeAxisSpace(axisSpace35);
        categoryPlot15.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        int int40 = categoryPlot15.getDomainAxisIndex(categoryAxis39);
        org.jfree.chart.plot.Plot plot41 = categoryPlot15.getRootPlot();
        boolean boolean42 = categoryPlot0.equals((java.lang.Object) plot41);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot43.configureRangeAxes();
        categoryPlot43.clearDomainMarkers();
        categoryPlot43.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset49 = categoryPlot43.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener50 = null;
        categoryPlot43.removeChangeListener(plotChangeListener50);
        java.awt.Paint paint52 = categoryPlot43.getBackgroundPaint();
        categoryPlot0.setRangeCrosshairPaint(paint52);
        categoryPlot0.setAnchorValue((double) 0.5f);
        boolean boolean56 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(categoryDataset49);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = null;
        java.util.List list48 = categoryPlot0.getCategoriesForAxis(categoryAxis47);
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
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getDomainMarkers(layer8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        java.lang.Object obj14 = categoryPlot0.clone();
        boolean boolean15 = categoryPlot0.isRangeZoomable();
        java.awt.Paint paint16 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot0.getRangeAxisEdge((int) (short) -1);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot0.setRangeAxis((int) (short) 10, valueAxis20);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleEdge18);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.configureRangeAxes();
        categoryPlot21.clearDomainMarkers();
        categoryPlot21.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray28 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis27 };
        categoryPlot26.setDomainAxes(categoryAxisArray28);
        java.awt.Stroke stroke30 = categoryPlot26.getOutlineStroke();
        categoryPlot21.setRangeCrosshairStroke(stroke30);
        org.jfree.chart.util.SortOrder sortOrder32 = categoryPlot21.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        categoryPlot21.removeChangeListener(plotChangeListener33);
        java.awt.Paint paint35 = categoryPlot21.getNoDataMessagePaint();
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot21.getRangeAxisLocation((int) (short) 10);
        categoryPlot0.setRangeAxisLocation(axisLocation37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.setOutlineVisible(false);
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(categoryAxisArray28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(sortOrder32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertNotNull(drawingSupplier39);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, (int) (short) -1, plotRenderingInfo20);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        java.util.List list9 = categoryPlot0.getCategories();
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getRangeMarkers(1, layer11);
        java.lang.Class<?> wildcardClass13 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        categoryPlot0.clearAnnotations();
        categoryPlot0.setWeight(1);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot23.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean27 = categoryPlot26.isRangeZoomable();
        categoryPlot26.setAnchorValue(100.0d, false);
        float float31 = categoryPlot26.getForegroundAlpha();
        int int32 = categoryPlot26.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        categoryPlot26.setRangeAxis((int) (byte) 100, valueAxis34, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray39 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis38 };
        categoryPlot37.setDomainAxes(categoryAxisArray39);
        categoryPlot37.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation44 = categoryPlot37.getDomainAxisLocation(100);
        categoryPlot26.setRangeAxisLocation(axisLocation44, false);
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        int int48 = categoryPlot26.getRangeAxisIndex(valueAxis47);
        org.jfree.chart.util.Layer layer49 = null;
        java.util.Collection collection50 = categoryPlot26.getRangeMarkers(layer49);
        org.jfree.chart.plot.PlotOrientation plotOrientation51 = categoryPlot26.getOrientation();
        categoryPlot23.setOrientation(plotOrientation51);
        categoryPlot0.setOrientation(plotOrientation51);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray39);
        org.junit.Assert.assertNotNull(axisLocation44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(collection50);
        org.junit.Assert.assertNotNull(plotOrientation51);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Paint paint11 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot0.setRenderer((int) '4', categoryItemRenderer13);
        boolean boolean15 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean13 = categoryPlot12.isRangeZoomable();
        categoryPlot12.setWeight(0);
        java.awt.Paint paint16 = categoryPlot12.getBackgroundPaint();
        categoryPlot0.setDomainGridlinePaint(paint16);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(axisSpace11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        int int9 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        int int24 = categoryPlot0.getDomainAxisIndex(categoryAxis23);
        categoryPlot0.setRangeCrosshairValue((double) '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        categoryPlot0.setRangeCrosshairValue((double) (short) -1, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot0.getRenderer((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(categoryItemRenderer17);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) 1, (double) (byte) 10, plotRenderingInfo8, point2D9);
        float float11 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        categoryPlot0.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        java.awt.Paint paint8 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot9.setDomainAxes(categoryAxisArray11);
        categoryPlot9.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot9.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        org.jfree.chart.plot.Plot plot19 = categoryPlot17.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation20 = categoryPlot17.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation16, plotOrientation20);
        categoryPlot0.setDomainAxisLocation(axisLocation16);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, (int) 'a');
        java.awt.Image image26 = null;
        categoryPlot0.setBackgroundImage(image26);
        org.jfree.chart.plot.Marker marker28 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(plotOrientation20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        java.awt.Stroke stroke15 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(0, layer10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer(categoryItemRenderer12, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 1, (double) '#', plotRenderingInfo17, point2D18);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3, true);
        java.lang.String str6 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.util.SortOrder sortOrder7 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(sortOrder7);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers(1, layer9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer12, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 100, plotRenderingInfo16, point2D17);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(collection10);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = categoryPlot0.getDrawingSupplier();
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        categoryPlot7.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot7.setNoDataMessagePaint(paint12);
        java.awt.Image image14 = categoryPlot7.getBackgroundImage();
        categoryPlot7.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis19 };
        categoryPlot18.setDomainAxes(categoryAxisArray20);
        java.awt.Stroke stroke22 = categoryPlot18.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = categoryPlot18.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot18.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        int int26 = categoryPlot18.getDomainAxisIndex(categoryAxis25);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot18.getDomainAxisLocation();
        categoryPlot7.setDomainAxisLocation((int) '#', axisLocation27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot7.zoomRangeAxes(10.0d, plotRenderingInfo30, point2D31, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation34 = categoryPlot7.getOrientation();
        categoryPlot0.setOrientation(plotOrientation34);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(plotOrientation34);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        categoryPlot14.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot17.setRangeAxis((int) (byte) 100, valueAxis19);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot17.getRangeAxisLocation();
        categoryPlot14.setDomainAxisLocation(axisLocation21);
        categoryPlot14.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot14.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot0.setDomainAxis((int) (byte) 100, categoryAxis27, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(axisLocation24);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        categoryPlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        categoryPlot0.setDataset(categoryDataset14);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot0.getRenderer((int) (byte) 1);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemRenderer13);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot0.getRangeAxisLocation();
        java.awt.Image image21 = null;
        categoryPlot0.setBackgroundImage(image21);
        java.awt.Paint paint23 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(categoryItemRenderer24);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        java.lang.String str30 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor31 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = categoryPlot0.getRangeMarkers(layer32);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray36 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis35 };
        categoryPlot34.setDomainAxes(categoryAxisArray36);
        categoryPlot34.setAnchorValue(10.0d);
        categoryPlot34.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean43 = categoryPlot42.isRangeZoomable();
        categoryPlot42.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder47 = categoryPlot42.getDatasetRenderingOrder();
        categoryPlot34.setDatasetRenderingOrder(datasetRenderingOrder47);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder49 = categoryPlot34.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder49);
        org.jfree.chart.util.SortOrder sortOrder51 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(categoryAnchor31);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertNotNull(categoryAxisArray36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder47);
        org.junit.Assert.assertNotNull(datasetRenderingOrder49);
        org.junit.Assert.assertNotNull(sortOrder51);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        java.awt.Stroke stroke15 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot0.getDomainMarkers(0, layer17);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot0.setDomainAxis(categoryAxis19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(collection18);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        float float7 = categoryPlot0.getBackgroundAlpha();
        java.lang.String str8 = categoryPlot0.getPlotType();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        categoryPlot9.clearRangeMarkers();
        boolean boolean12 = categoryPlot9.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot9.setDomainAxis(categoryAxis13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot9.getRangeMarkers(layer15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.configureRangeAxes();
        categoryPlot17.clearDomainMarkers();
        categoryPlot17.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot17.setNoDataMessagePaint(paint22);
        java.awt.Image image24 = categoryPlot17.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot17.zoomDomainAxes((double) 0.0f, plotRenderingInfo26, point2D27);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot29.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        categoryPlot29.zoomRangeAxes((-1.0d), plotRenderingInfo32, point2D33, false);
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        categoryPlot29.setRangeAxis(valueAxis36);
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        categoryPlot29.setRangeAxis(valueAxis38);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset42 = categoryPlot40.getDataset((int) (short) 1);
        categoryPlot40.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor45 = categoryPlot40.getDomainGridlinePosition();
        categoryPlot29.setDomainGridlinePosition(categoryAnchor45);
        categoryPlot17.setParent((org.jfree.chart.plot.Plot) categoryPlot29);
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean49 = categoryPlot48.isRangeZoomable();
        categoryPlot48.setAnchorValue(100.0d, false);
        float float53 = categoryPlot48.getForegroundAlpha();
        int int54 = categoryPlot48.getWeight();
        org.jfree.chart.plot.Plot plot55 = categoryPlot48.getRootPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot56 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot56.configureRangeAxes();
        categoryPlot56.clearDomainMarkers();
        categoryPlot56.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset62 = categoryPlot56.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent63 = null;
        categoryPlot56.rendererChanged(rendererChangeEvent63);
        java.awt.Font font65 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot56.setNoDataMessageFont(font65);
        categoryPlot48.setNoDataMessageFont(font65);
        categoryPlot29.setNoDataMessageFont(font65);
        categoryPlot9.setNoDataMessageFont(font65);
        categoryPlot0.setNoDataMessageFont(font65);
        org.jfree.chart.axis.CategoryAxis categoryAxis71 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Category Plot" + "'", str8, "Category Plot");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertNull(categoryDataset42);
        org.junit.Assert.assertNotNull(categoryAnchor45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.0f + "'", float53 == 1.0f);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(plot55);
        org.junit.Assert.assertNull(categoryDataset62);
        org.junit.Assert.assertNotNull(font65);
        org.junit.Assert.assertNull(categoryAxis71);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.Plot plot7 = categoryPlot0.getParent();
        categoryPlot0.setWeight((-1));
        java.awt.Paint paint10 = null;
        categoryPlot0.setOutlinePaint(paint10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(plot7);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        categoryPlot0.markerChanged(markerChangeEvent10);
        categoryPlot0.clearDomainMarkers((int) (byte) 10);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot0.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot0.setDomainAxis((int) '#', categoryAxis18, false);
        categoryPlot0.setRangeCrosshairValue((double) (short) 100, true);
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        boolean boolean37 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot38.configureRangeAxes();
        categoryPlot38.clearRangeMarkers();
        boolean boolean41 = categoryPlot38.isOutlineVisible();
        categoryPlot38.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        categoryPlot44.setRangeAxis((int) (byte) 100, valueAxis46);
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        boolean boolean52 = categoryPlot44.render(graphics2D48, rectangle2D49, (int) (byte) 100, plotRenderingInfo51);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer54 = categoryPlot44.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer56 = null;
        categoryPlot44.setRenderer((int) 'a', categoryItemRenderer56, false);
        categoryPlot44.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation61 = categoryPlot44.getDomainAxisLocation();
        categoryPlot38.setRangeAxisLocation(axisLocation61);
        java.awt.Stroke stroke63 = categoryPlot38.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke63);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer65 = null;
        categoryPlot0.setRenderer(categoryItemRenderer65, true);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(categoryItemRenderer54);
        org.junit.Assert.assertNotNull(axisLocation61);
        org.junit.Assert.assertNotNull(stroke63);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        java.awt.Paint paint15 = categoryPlot0.getOutlinePaint();
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 1, 100);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot0.setRenderer(categoryItemRenderer17, true);
        float float20 = categoryPlot0.getBackgroundAlpha();
        boolean boolean21 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot18.configureRangeAxes();
        categoryPlot18.clearDomainMarkers();
        categoryPlot18.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset24 = categoryPlot18.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        categoryPlot18.removeChangeListener(plotChangeListener25);
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = categoryPlot18.getDomainMarkers((int) '4', layer28);
        java.awt.Paint paint30 = categoryPlot18.getNoDataMessagePaint();
        categoryPlot0.setBackgroundPaint(paint30);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        boolean boolean8 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer((int) (byte) 1);
        float float12 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.Plot plot7 = categoryPlot0.getParent();
        categoryPlot0.setWeight((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot11.zoomRangeAxes((-1.0d), plotRenderingInfo14, point2D15, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor18 = categoryPlot11.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot19 = categoryPlot11.getParent();
        boolean boolean20 = categoryPlot11.getDrawSharedDomainAxis();
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot11.getRangeAxisLocation(101);
        categoryPlot0.setDomainAxisLocation((int) (short) 10, axisLocation22, true);
        java.util.List list25 = categoryPlot0.getCategories();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertNotNull(categoryAnchor18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNull(list25);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        java.util.List list24 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        int int26 = categoryPlot0.getIndexOf(categoryItemRenderer25);
        categoryPlot0.setBackgroundImageAlignment(0);
        float float29 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray14 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis13 };
        categoryPlot12.setDomainAxes(categoryAxisArray14);
        categoryPlot12.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot12.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        categoryPlot20.setRangeAxis((int) (byte) 100, valueAxis22);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = categoryPlot20.getDomainMarkers((int) (byte) 10, layer25);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean28 = categoryPlot27.isRangeZoomable();
        categoryPlot27.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation32 = categoryPlot27.getOrientation();
        categoryPlot20.setOrientation(plotOrientation32);
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation19, plotOrientation32);
        categoryPlot0.setDomainAxisLocation(axisLocation19, false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent37 = null;
        categoryPlot0.axisChanged(axisChangeEvent37);
        categoryPlot0.clearDomainAxes();
        int int40 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent41 = null;
        categoryPlot0.notifyListeners(plotChangeEvent41);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(plotOrientation32);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        categoryPlot22.zoomRangeAxes((-1.0d), plotRenderingInfo25, point2D26, false);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        categoryPlot22.setRangeAxis(valueAxis29);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray31 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot22.setRenderers(categoryItemRendererArray31);
        categoryPlot0.setRenderers(categoryItemRendererArray31);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        categoryPlot0.configureDomainAxes();
        boolean boolean37 = categoryPlot0.isSubplot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        categoryPlot0.addChangeListener(plotChangeListener38);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(categoryItemRendererArray31);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers(layer9);
        int int11 = categoryPlot0.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getDomainAxisLocation();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        categoryPlot0.setDataset((int) '4', categoryDataset14);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(axisLocation12);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        categoryPlot0.clearDomainMarkers();
        java.util.List list7 = categoryPlot0.getAnnotations();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        categoryPlot8.setDataset(categoryDataset11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot8.getRendererForDataset(categoryDataset13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis16 };
        categoryPlot15.setDomainAxes(categoryAxisArray17);
        categoryPlot15.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot15.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot23.setRangeAxis((int) (byte) 100, valueAxis25);
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = categoryPlot23.getDomainMarkers((int) (byte) 10, layer28);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean31 = categoryPlot30.isRangeZoomable();
        categoryPlot30.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation35 = categoryPlot30.getOrientation();
        categoryPlot23.setOrientation(plotOrientation35);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation22, plotOrientation35);
        categoryPlot8.setOrientation(plotOrientation35);
        categoryPlot0.setOrientation(plotOrientation35);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = categoryPlot0.getRenderer((int) '#');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(plotOrientation35);
        org.junit.Assert.assertNotNull(rectangleEdge37);
        org.junit.Assert.assertNull(categoryItemRenderer41);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer5);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup3);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D8, rectangle2D9, 0, plotRenderingInfo11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getRangeAxisEdge((int) (short) 10);
        java.lang.String str15 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot0.getDataset();
        boolean boolean13 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        categoryPlot0.clearAnnotations();
        boolean boolean21 = categoryPlot0.isRangeCrosshairVisible();
        float float22 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Image image4 = null;
        categoryPlot0.setBackgroundImage(image4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot6.configureRangeAxes();
        categoryPlot6.clearDomainMarkers();
        categoryPlot6.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot6.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot6.rendererChanged(rendererChangeEvent13);
        java.awt.Font font15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot6.setNoDataMessageFont(font15);
        categoryPlot0.setNoDataMessageFont(font15);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        java.util.List list21 = categoryPlot0.getCategoriesForAxis(categoryAxis20);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) '#', plotRenderingInfo8, point2D9, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis14 };
        categoryPlot13.setDomainAxes(categoryAxisArray15);
        categoryPlot13.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot13.getDomainAxisLocation(100);
        categoryPlot0.setRangeAxisLocation((int) 'a', axisLocation20);
        java.awt.Paint paint22 = categoryPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        java.awt.Font font9 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot0.getRendererForDataset(categoryDataset16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot18.setRangeAxis((int) (byte) 100, valueAxis20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        boolean boolean26 = categoryPlot18.render(graphics2D22, rectangle2D23, (int) (byte) 100, plotRenderingInfo25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = categoryPlot18.getRenderer((int) (short) 10);
        java.awt.Stroke stroke29 = categoryPlot18.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = categoryPlot18.getRangeAxisEdge();
        java.awt.Stroke stroke31 = categoryPlot18.getRangeCrosshairStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke31);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer34);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(categoryItemRenderer28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        categoryPlot0.setOutlineVisible(true);
        categoryPlot0.mapDatasetToDomainAxis((int) ' ', 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot19.setRangeAxis((int) (byte) 100, valueAxis21);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot19.getDomainMarkers((int) (byte) 10, layer24);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean27 = categoryPlot26.isRangeZoomable();
        categoryPlot26.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation31 = categoryPlot26.getOrientation();
        categoryPlot19.setOrientation(plotOrientation31);
        boolean boolean33 = categoryPlot19.isRangeGridlinesVisible();
        org.jfree.chart.LegendItemCollection legendItemCollection34 = categoryPlot19.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection34);
        java.lang.String str36 = categoryPlot0.getPlotType();
        org.jfree.chart.plot.Marker marker38 = null;
        org.jfree.chart.util.Layer layer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 100, marker38, layer39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(plotOrientation31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(legendItemCollection34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Category Plot" + "'", str36, "Category Plot");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot0.setRangeAxis(valueAxis11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot13.zoomRangeAxes((-1.0d), plotRenderingInfo16, point2D17, false);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot13.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot13.getRendererForDataset(categoryDataset22);
        org.jfree.chart.axis.ValueAxis valueAxis25 = categoryPlot13.getRangeAxisForDataset((-1));
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = categoryPlot13.getDomainAxisForDataset(0);
        categoryPlot13.setRangeCrosshairValue((double) (short) 1, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot31.setRangeAxis((int) (byte) 100, valueAxis33);
        org.jfree.chart.util.Layer layer36 = null;
        java.util.Collection collection37 = categoryPlot31.getDomainMarkers((int) (byte) 10, layer36);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot38.configureRangeAxes();
        categoryPlot38.clearDomainMarkers();
        boolean boolean41 = categoryPlot31.equals((java.lang.Object) categoryPlot38);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot42.configureRangeAxes();
        categoryPlot42.clearRangeMarkers();
        categoryPlot42.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke48 = categoryPlot42.getRangeGridlineStroke();
        double double49 = categoryPlot42.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D50 = null;
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        categoryPlot42.drawBackgroundImage(graphics2D50, rectangle2D51);
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = categoryPlot42.getInsets();
        categoryPlot31.setAxisOffset(rectangleInsets53);
        categoryPlot13.setInsets(rectangleInsets53);
        categoryPlot0.setAxisOffset(rectangleInsets53);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNull(categoryItemRenderer23);
        org.junit.Assert.assertNull(valueAxis25);
        org.junit.Assert.assertNull(categoryAxis27);
        org.junit.Assert.assertNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets53);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot9.setRangeAxis((int) (byte) 100, valueAxis11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        boolean boolean17 = categoryPlot9.render(graphics2D13, rectangle2D14, (int) (byte) 100, plotRenderingInfo16);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot9.setRenderer(0, categoryItemRenderer19, true);
        float float22 = categoryPlot9.getForegroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot9.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation(100, axisLocation23);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = categoryPlot0.removeAnnotation(categoryAnnotation25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setRangeCrosshairValue((double) 10L, false);
        java.awt.Font font28 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        categoryPlot0.setRangeAxis(0, valueAxis30, false);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        double double15 = categoryPlot0.getAnchorValue();
        categoryPlot0.setBackgroundAlpha((float) 0L);
        boolean boolean18 = categoryPlot0.isRangeZoomable();
        int int19 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        float float8 = categoryPlot0.getBackgroundAlpha();
        java.lang.Object obj9 = categoryPlot0.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 1, (double) (short) 10, plotRenderingInfo12, point2D13);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRenderer((int) (byte) -1, categoryItemRenderer16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        categoryPlot0.setRenderer(10, categoryItemRenderer27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot0.getInsets();
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 0, valueAxis10);
        java.awt.Paint paint12 = categoryPlot0.getRangeCrosshairPaint();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        boolean boolean17 = categoryPlot0.render(graphics2D13, rectangle2D14, (int) (short) 0, plotRenderingInfo16);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot0.getDomainAxis((int) (short) 1);
        org.jfree.chart.plot.Marker marker20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryAxis19);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        categoryPlot0.setRangeCrosshairValue((double) ' ', false);
        categoryPlot0.setNoDataMessage("Category Plot");
        categoryPlot0.setRangeGridlinesVisible(true);
        boolean boolean21 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers(1, layer9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer12, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis16 };
        categoryPlot15.setDomainAxes(categoryAxisArray17);
        java.awt.Stroke stroke19 = categoryPlot15.getOutlineStroke();
        categoryPlot15.clearRangeMarkers();
        java.awt.Paint paint21 = categoryPlot15.getRangeGridlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint21);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        java.lang.String str30 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor31 = categoryPlot0.getDomainGridlinePosition();
        java.lang.Object obj32 = categoryPlot0.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(categoryAnchor31);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        org.jfree.chart.plot.Plot plot26 = categoryPlot0.getParent();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean28 = categoryPlot27.isRangeZoomable();
        categoryPlot27.setAnchorValue(100.0d, false);
        float float32 = categoryPlot27.getForegroundAlpha();
        int int33 = categoryPlot27.getWeight();
        org.jfree.chart.plot.Plot plot34 = categoryPlot27.getRootPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot35.configureRangeAxes();
        categoryPlot35.clearDomainMarkers();
        categoryPlot35.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset41 = categoryPlot35.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent42 = null;
        categoryPlot35.rendererChanged(rendererChangeEvent42);
        java.awt.Font font44 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot35.setNoDataMessageFont(font44);
        categoryPlot27.setNoDataMessageFont(font44);
        categoryPlot0.setNoDataMessageFont(font44);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNull(plot26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(plot34);
        org.junit.Assert.assertNull(categoryDataset41);
        org.junit.Assert.assertNotNull(font44);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        boolean boolean31 = categoryPlot0.getDrawSharedDomainAxis();
        categoryPlot0.setOutlineVisible(true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot0.getRangeMarkers(layer14);
        org.jfree.chart.plot.CategoryMarker categoryMarker16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(collection15);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean10 = categoryPlot0.isDomainZoomable();
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray14 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis13 };
        categoryPlot12.setDomainAxes(categoryAxisArray14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot12.setRangeAxis(valueAxis16);
        categoryPlot12.setWeight((int) (short) 10);
        java.awt.Paint paint20 = categoryPlot12.getOutlinePaint();
        categoryPlot0.setRangeGridlinePaint(paint20);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        categoryPlot0.clearDomainMarkers(15);
        categoryPlot0.setBackgroundAlpha((float) (short) 100);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        int int19 = categoryPlot0.getWeight();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot0.zoomDomainAxes((double) 101, plotRenderingInfo21, point2D22, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getRangeMarkers(layer11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge(10);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(rectangleEdge14);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge(0);
        categoryPlot0.setAnchorValue((double) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = categoryPlot4.getDomainAxis();
        double double6 = categoryPlot4.getAnchorValue();
        org.junit.Assert.assertNull(categoryAxis5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        java.awt.Font font9 = categoryPlot0.getNoDataMessageFont();
        float float10 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        categoryPlot0.axisChanged(axisChangeEvent11);
        float float13 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.AxisSpace axisSpace15 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot0.setRangeAxis(valueAxis16);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(axisSpace15);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        float float6 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.clearRangeAxes();
        java.util.List list8 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        categoryPlot0.notifyListeners(plotChangeEvent9);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = categoryPlot0.getInsets();
        categoryPlot0.setAnchorValue((double) '#');
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        categoryPlot0.setForegroundAlpha((float) (short) 10);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(categoryAxis33);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis10, false);
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot15.setRangeAxis((int) (byte) 100, valueAxis17);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot15.getRangeAxisLocation();
        categoryPlot15.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean23 = categoryPlot22.isRangeZoomable();
        categoryPlot22.setAnchorValue(100.0d, false);
        float float27 = categoryPlot22.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray30 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis29 };
        categoryPlot28.setDomainAxes(categoryAxisArray30);
        java.awt.Stroke stroke32 = categoryPlot28.getOutlineStroke();
        categoryPlot22.setRangeCrosshairStroke(stroke32);
        categoryPlot15.setRangeGridlineStroke(stroke32);
        org.jfree.chart.axis.AxisSpace axisSpace35 = null;
        categoryPlot15.setFixedRangeAxisSpace(axisSpace35);
        categoryPlot15.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        int int40 = categoryPlot15.getDomainAxisIndex(categoryAxis39);
        org.jfree.chart.plot.Plot plot41 = categoryPlot15.getRootPlot();
        boolean boolean42 = categoryPlot0.equals((java.lang.Object) plot41);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot43.configureRangeAxes();
        categoryPlot43.clearDomainMarkers();
        categoryPlot43.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset49 = categoryPlot43.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener50 = null;
        categoryPlot43.removeChangeListener(plotChangeListener50);
        java.awt.Paint paint52 = categoryPlot43.getBackgroundPaint();
        categoryPlot0.setRangeCrosshairPaint(paint52);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent54 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent54);
        boolean boolean56 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(categoryDataset49);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder5 = categoryPlot0.getDatasetRenderingOrder();
        int int6 = categoryPlot0.getDatasetCount();
        java.util.List list7 = categoryPlot0.getCategories();
        boolean boolean8 = categoryPlot0.isRangeCrosshairVisible();
        categoryPlot0.setWeight((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot25.setRangeAxis((int) (byte) 100, valueAxis27);
        org.jfree.chart.axis.AxisLocation axisLocation29 = categoryPlot25.getRangeAxisLocation();
        categoryPlot25.setBackgroundAlpha((float) (byte) 1);
        categoryPlot25.clearDomainMarkers(0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = categoryPlot25.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier34);
        categoryPlot0.clearRangeMarkers();
        java.lang.Object obj37 = categoryPlot0.clone();
        java.lang.String str38 = categoryPlot0.getPlotType();
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
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(drawingSupplier34);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Category Plot" + "'", str38, "Category Plot");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        java.lang.Object obj7 = categoryPlot0.clone();
        float float8 = categoryPlot0.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        categoryPlot0.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.chart.plot.Marker marker12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        categoryPlot0.setWeight(10);
        org.jfree.chart.util.SortOrder sortOrder7 = categoryPlot0.getColumnRenderingOrder();
        float float8 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(sortOrder7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo7, point2D8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) 0.5f, plotRenderingInfo11, point2D12);
        org.jfree.chart.util.SortOrder sortOrder14 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = categoryPlot15.getDataset((int) (short) 1);
        categoryPlot15.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor20 = categoryPlot15.getDomainGridlinePosition();
        org.jfree.chart.util.SortOrder sortOrder21 = categoryPlot15.getColumnRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder21);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryAnchor20);
        org.junit.Assert.assertNotNull(sortOrder21);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        java.lang.Object obj14 = categoryPlot0.clone();
        categoryPlot0.setWeight((int) '4');
        double double17 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot0.getDomainAxisIndex(categoryAxis18);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        boolean boolean6 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.Marker marker7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot4.setRangeAxis((int) (byte) 100, valueAxis6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot4.render(graphics2D8, rectangle2D9, (int) (byte) 100, plotRenderingInfo11);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot4.getRenderer((int) (short) 10);
        java.awt.Stroke stroke15 = categoryPlot4.getDomainGridlineStroke();
        java.awt.Stroke stroke16 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomRangeAxes(100.0d, plotRenderingInfo19, point2D20);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        int int20 = categoryPlot0.getDomainAxisIndex(categoryAxis19);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis((int) 'a');
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getColumnRenderingOrder();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNotNull(sortOrder11);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis((int) ' ', valueAxis9);
        double double11 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        java.awt.Stroke stroke21 = categoryPlot0.getDomainGridlineStroke();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = categoryPlot0.getDomainMarkers(layer23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        categoryPlot0.setDataset(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(collection24);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        org.jfree.chart.plot.Plot plot9 = categoryPlot7.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = categoryPlot7.getOrientation();
        categoryPlot0.setOrientation(plotOrientation10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getDomainAxisLocation((int) (byte) 1);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNotNull(plotOrientation10);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomDomainAxes((double) 0.0f, plotRenderingInfo10, point2D11);
        boolean boolean13 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis((int) (byte) 0, categoryAxis13);
        categoryPlot0.clearAnnotations();
        java.lang.String str16 = categoryPlot0.getPlotType();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot0.setRangeAxis(valueAxis17);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Category Plot" + "'", str16, "Category Plot");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue(10.0d);
        categoryPlot0.clearDomainMarkers((int) (short) -1);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation((int) (short) 10);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomDomainAxes((double) (-1.0f), (double) 100.0f, plotRenderingInfo6, point2D7);
        categoryPlot0.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getDomainAxisLocation((int) (byte) 100);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot0.getDomainMarkers(layer14);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNull(collection15);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo35, point2D36, true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(valueAxisArray30);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer9, true);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getRangeAxisEdge(1);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        categoryPlot14.clearRangeMarkers();
        categoryPlot14.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke20 = categoryPlot14.getRangeGridlineStroke();
        double double21 = categoryPlot14.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        categoryPlot14.drawBackgroundImage(graphics2D22, rectangle2D23);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray26 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer25 };
        categoryPlot14.setRenderers(categoryItemRendererArray26);
        org.jfree.chart.LegendItemCollection legendItemCollection28 = categoryPlot14.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection28);
        categoryPlot0.mapDatasetToRangeAxis(100, 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray26);
        org.junit.Assert.assertNotNull(legendItemCollection28);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        java.lang.Object obj14 = categoryPlot0.clone();
        boolean boolean15 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation22 = categoryPlot17.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean24 = categoryPlot23.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        categoryPlot23.setRangeAxis((int) (byte) 1, valueAxis26, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot23.getInsets();
        categoryPlot17.setInsets(rectangleInsets29, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot32.configureRangeAxes();
        categoryPlot32.clearRangeMarkers();
        boolean boolean35 = categoryPlot32.isOutlineVisible();
        categoryPlot32.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        categoryPlot38.setRangeAxis((int) (byte) 100, valueAxis40);
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        boolean boolean46 = categoryPlot38.render(graphics2D42, rectangle2D43, (int) (byte) 100, plotRenderingInfo45);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer48 = categoryPlot38.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer50 = null;
        categoryPlot38.setRenderer((int) 'a', categoryItemRenderer50, false);
        categoryPlot38.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation55 = categoryPlot38.getDomainAxisLocation();
        categoryPlot32.setRangeAxisLocation(axisLocation55);
        categoryPlot17.setDomainAxisLocation(axisLocation55);
        categoryPlot0.setDomainAxisLocation((int) ' ', axisLocation55, true);
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        categoryPlot0.setDataset((int) (byte) 100, categoryDataset61);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(plotOrientation22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(categoryItemRenderer48);
        org.junit.Assert.assertNotNull(axisLocation55);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (short) 1);
        int int16 = categoryPlot0.getDatasetCount();
        java.awt.Stroke stroke17 = categoryPlot0.getRangeCrosshairStroke();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        categoryPlot0.notifyListeners(plotChangeEvent25);
        java.lang.String str27 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        boolean boolean24 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = categoryPlot0.getDomainMarkers(layer25);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(collection26);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        categoryPlot0.setRangeCrosshairValue((double) ' ', false);
        categoryPlot0.setNoDataMessage("Category Plot");
        categoryPlot0.setRangeGridlinesVisible(true);
        boolean boolean21 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        categoryPlot0.setRenderer((int) (byte) 100, categoryItemRenderer23, true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        int int6 = categoryPlot0.getRangeAxisIndex(valueAxis5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setAnchorValue(100.0d, false);
        float float12 = categoryPlot7.getForegroundAlpha();
        int int13 = categoryPlot7.getWeight();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        categoryPlot14.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder17 = categoryPlot14.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot14.zoomRangeAxes((double) 0L, plotRenderingInfo19, point2D20);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray22 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot14.setDomainAxes(categoryAxisArray22);
        categoryPlot14.setRangeCrosshairValue((double) (-1.0f), false);
        java.awt.Paint paint27 = categoryPlot14.getRangeCrosshairPaint();
        categoryPlot7.setBackgroundPaint(paint27);
        org.jfree.chart.plot.Plot plot29 = categoryPlot7.getParent();
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot7.getDomainAxisLocation((int) (short) 10);
        categoryPlot0.setRangeAxisLocation(axisLocation31);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent33 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent33);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder17);
        org.junit.Assert.assertNotNull(categoryAxisArray22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(plot29);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot0.setRenderer(categoryItemRenderer16);
        categoryPlot0.setBackgroundImageAlignment((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 10, plotRenderingInfo26, point2D27);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot0.getDomainAxisLocation((int) (byte) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo33, point2D34, true);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNull(categoryItemRenderer31);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot11.setRangeAxis((int) (byte) 100, valueAxis13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        boolean boolean19 = categoryPlot11.render(graphics2D15, rectangle2D16, (int) (byte) 100, plotRenderingInfo18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot11.getRenderer((int) (short) 10);
        java.awt.Stroke stroke22 = categoryPlot11.getDomainGridlineStroke();
        java.awt.Stroke stroke23 = categoryPlot11.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection24 = categoryPlot11.getFixedLegendItems();
        boolean boolean25 = categoryPlot11.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = categoryPlot11.getDatasetRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.data.Range range28 = categoryPlot11.getDataRange(valueAxis27);
        org.jfree.chart.plot.Plot plot29 = categoryPlot11.getParent();
        java.awt.Stroke stroke30 = categoryPlot11.getRangeGridlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke30);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(legendItemCollection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertNull(range28);
        org.junit.Assert.assertNull(plot29);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.configureRangeAxes();
        categoryPlot21.clearDomainMarkers();
        categoryPlot21.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray28 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis27 };
        categoryPlot26.setDomainAxes(categoryAxisArray28);
        java.awt.Stroke stroke30 = categoryPlot26.getOutlineStroke();
        categoryPlot21.setRangeCrosshairStroke(stroke30);
        org.jfree.chart.util.SortOrder sortOrder32 = categoryPlot21.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        categoryPlot21.removeChangeListener(plotChangeListener33);
        java.awt.Paint paint35 = categoryPlot21.getNoDataMessagePaint();
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot21.getRangeAxisLocation((int) (short) 10);
        categoryPlot0.setRangeAxisLocation(axisLocation37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent40 = null;
        categoryPlot0.notifyListeners(plotChangeEvent40);
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = categoryPlot0.getDomainAxis(0);
        int int44 = categoryPlot0.getWeight();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(categoryAxisArray28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(sortOrder32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertNotNull(drawingSupplier39);
        org.junit.Assert.assertNull(categoryAxis43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 1, plotRenderingInfo14, point2D15);
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(legendItemCollection12);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        java.lang.String str4 = categoryPlot0.getNoDataMessage();
        java.awt.Paint paint5 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        categoryPlot0.setRangeCrosshairVisible(true);
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
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        org.jfree.data.general.DatasetGroup datasetGroup13 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(datasetGroup13);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        float float6 = categoryPlot0.getBackgroundAlpha();
        java.awt.Stroke stroke7 = categoryPlot0.getRangeCrosshairStroke();
        java.util.List list8 = categoryPlot0.getAnnotations();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        categoryPlot9.clearRangeMarkers();
        categoryPlot9.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke15 = categoryPlot9.getRangeGridlineStroke();
        double double16 = categoryPlot9.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        categoryPlot9.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray21 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer20 };
        categoryPlot9.setRenderers(categoryItemRendererArray21);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = categoryPlot9.getLegendItems();
        categoryPlot9.clearDomainMarkers((int) (short) 100);
        categoryPlot9.setAnchorValue((double) 1L, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        categoryPlot29.setRangeAxis((int) (byte) 100, valueAxis31);
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        boolean boolean37 = categoryPlot29.render(graphics2D33, rectangle2D34, (int) (byte) 100, plotRenderingInfo36);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = categoryPlot29.getRenderer((int) (short) 10);
        java.awt.Stroke stroke40 = categoryPlot29.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = categoryPlot29.getInsets();
        categoryPlot9.setAxisOffset(rectangleInsets41);
        categoryPlot0.setAxisOffset(rectangleInsets41);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray21);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(categoryItemRenderer39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(rectangleInsets41);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        java.lang.String str4 = categoryPlot0.getNoDataMessage();
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot0.getRendererForDataset(categoryDataset15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categoryItemRenderer16);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        int int20 = categoryPlot0.getDomainAxisIndex(categoryAxis19);
        java.awt.Stroke stroke21 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot0.setDataset(categoryDataset22);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearRangeMarkers();
        categoryPlot15.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke21 = categoryPlot15.getRangeGridlineStroke();
        double double22 = categoryPlot15.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        categoryPlot15.drawBackgroundImage(graphics2D23, rectangle2D24);
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot15.getRangeAxisEdge();
        categoryPlot15.clearDomainMarkers((int) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation29 = categoryPlot15.getOrientation();
        categoryPlot0.setOrientation(plotOrientation29);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertNotNull(plotOrientation29);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1, false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getDomainMarkers(layer15);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 100, plotRenderingInfo17, point2D18, true);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(categoryAxis15);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        java.util.List list7 = categoryPlot0.getCategories();
        org.jfree.chart.plot.Marker marker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(8, marker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        float float7 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearRangeMarkers();
        boolean boolean11 = categoryPlot8.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot8.setDomainAxis(categoryAxis12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot14.zoomRangeAxes((-1.0d), plotRenderingInfo17, point2D18, false);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot14.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray23 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot14.setRangeAxes(valueAxisArray23);
        categoryPlot8.setRangeAxes(valueAxisArray23);
        categoryPlot0.setRangeAxes(valueAxisArray23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(valueAxisArray23);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot0.getDomainAxis((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNull(categoryAxis20);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) 'a', layer8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        boolean boolean31 = categoryPlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = categoryPlot4.getDomainAxisEdge();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot4.setRenderer((int) (short) 0, categoryItemRenderer7, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray12 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis11 };
        categoryPlot10.setDomainAxes(categoryAxisArray12);
        java.awt.Stroke stroke14 = categoryPlot10.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot10.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot10.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot10.markerChanged(markerChangeEvent17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis20, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot23.zoomRangeAxes((-1.0d), plotRenderingInfo26, point2D27, false);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot23.getRangeAxisLocation((int) (byte) 10);
        categoryPlot10.setRangeAxisLocation(axisLocation31, true);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor34 = categoryPlot10.getDomainGridlinePosition();
        categoryPlot4.setDomainGridlinePosition(categoryAnchor34);
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNotNull(categoryAnchor34);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        int int16 = categoryPlot0.getRangeAxisCount();
        java.awt.Font font17 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        int int24 = categoryPlot0.getDomainAxisIndex(categoryAxis23);
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.setWeight((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge(0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomRangeAxes((double) (short) -1, plotRenderingInfo12, point2D13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = categoryPlot15.getDataset((int) (short) 1);
        categoryPlot15.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor20 = categoryPlot15.getDomainGridlinePosition();
        org.jfree.chart.util.SortOrder sortOrder21 = categoryPlot15.getColumnRenderingOrder();
        boolean boolean22 = categoryPlot0.equals((java.lang.Object) categoryPlot15);
        categoryPlot0.setWeight(8);
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(categoryAnchor20);
        org.junit.Assert.assertNotNull(sortOrder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        float float7 = categoryPlot0.getForegroundAlpha();
        java.awt.Paint paint8 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation(1);
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = categoryPlot11.getDrawingSupplier();
        categoryPlot11.clearDomainMarkers((int) ' ');
        categoryPlot11.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot11.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot31.configureRangeAxes();
        categoryPlot31.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        categoryPlot34.setRangeAxis((int) (byte) 100, valueAxis36);
        org.jfree.chart.axis.AxisLocation axisLocation38 = categoryPlot34.getRangeAxisLocation();
        categoryPlot31.setDomainAxisLocation(axisLocation38);
        categoryPlot31.clearRangeMarkers();
        categoryPlot11.setParent((org.jfree.chart.plot.Plot) categoryPlot31);
        boolean boolean42 = categoryPlot31.isRangeCrosshairLockedOnData();
        java.awt.Stroke stroke43 = categoryPlot31.getDomainGridlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke43);
        boolean boolean45 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(drawingSupplier25);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(axisLocation38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation20 = categoryPlot0.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(plotOrientation20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        int int21 = categoryPlot0.getIndexOf(categoryItemRenderer20);
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot0.getRangeAxisEdge();
        java.awt.Font font25 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge24);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        org.jfree.chart.LegendItemCollection legendItemCollection35 = categoryPlot0.getFixedLegendItems();
        java.awt.Paint paint36 = categoryPlot0.getOutlinePaint();
        categoryPlot0.setRangeCrosshairValue((double) 8);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray31);
        org.junit.Assert.assertNotNull(drawingSupplier33);
        org.junit.Assert.assertNull(legendItemCollection35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        java.lang.Object obj15 = categoryPlot0.clone();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((-1));
        java.awt.Stroke stroke7 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot0.getRangeAxisForDataset(100);
        categoryPlot0.setRangeCrosshairValue((double) 15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(valueAxis10);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot6.setRangeAxis((int) (byte) 100, valueAxis8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        boolean boolean14 = categoryPlot6.render(graphics2D10, rectangle2D11, (int) (byte) 100, plotRenderingInfo13);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot6.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot6.setRenderer((int) 'a', categoryItemRenderer18, false);
        categoryPlot6.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot6.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation23);
        boolean boolean25 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        java.util.List list29 = categoryPlot0.getCategoriesForAxis(categoryAxis28);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        boolean boolean24 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.Plot plot25 = null;
        categoryPlot0.setParent(plot25);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation27 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset(categoryDataset6);
        boolean boolean8 = categoryPlot0.isDomainGridlinesVisible();
        java.util.List list9 = categoryPlot0.getCategories();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(list9);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot0.setRenderer(categoryItemRenderer13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot0.getFixedDomainAxisSpace();
        boolean boolean8 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(axisSpace7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        categoryPlot0.markerChanged(markerChangeEvent10);
        java.awt.Paint paint12 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer11);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getDomainMarkers(layer13);
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(axisSpace9);
        org.junit.Assert.assertNull(collection14);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes((double) 0.0f, plotRenderingInfo15, point2D16, false);
        categoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray6 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis5 };
        categoryPlot4.setDomainAxes(categoryAxisArray6);
        java.awt.Stroke stroke8 = categoryPlot4.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = categoryPlot4.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot4.getRenderer();
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot4.getDataset(100);
        boolean boolean13 = categoryPlot0.equals((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToDomainAxis((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAxisArray6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace4);
        boolean boolean6 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.ValueAxis valueAxis8 = categoryPlot0.getRangeAxis(1);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(valueAxis8);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        boolean boolean22 = categoryPlot0.render(graphics2D18, rectangle2D19, (int) ' ', plotRenderingInfo21);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray9);
        float float11 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot12 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(plot12);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        org.jfree.chart.plot.Plot plot22 = categoryPlot0.getParent();
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot0.getDomainAxisLocation((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot25.zoomRangeAxes((-1.0d), plotRenderingInfo28, point2D29, false);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot25.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        categoryPlot25.setRangeAxis((int) (short) 100, valueAxis35, false);
        org.jfree.chart.axis.AxisSpace axisSpace38 = null;
        categoryPlot25.setFixedRangeAxisSpace(axisSpace38);
        categoryPlot25.setRangeCrosshairValue((double) 'a', false);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset45 = categoryPlot43.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot47.configureRangeAxes();
        categoryPlot47.clearRangeMarkers();
        boolean boolean50 = categoryPlot47.isOutlineVisible();
        categoryPlot47.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer53 = null;
        categoryPlot47.setRenderer(categoryItemRenderer53);
        org.jfree.chart.axis.AxisLocation axisLocation55 = categoryPlot47.getDomainAxisLocation();
        categoryPlot43.setRangeAxisLocation((int) (short) 0, axisLocation55, false);
        categoryPlot25.setDomainAxisLocation(axisLocation55, true);
        categoryPlot0.setRangeAxisLocation(axisLocation55, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(plot22);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNull(categoryDataset45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(axisLocation55);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent2 = null;
        categoryPlot0.axisChanged(axisChangeEvent2);
        categoryPlot0.clearRangeMarkers();
        java.awt.Paint paint5 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot0.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.configureRangeAxes();
        categoryPlot17.clearDomainMarkers();
        categoryPlot17.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray24 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis23 };
        categoryPlot22.setDomainAxes(categoryAxisArray24);
        java.awt.Stroke stroke26 = categoryPlot22.getOutlineStroke();
        categoryPlot17.setRangeCrosshairStroke(stroke26);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot28.configureRangeAxes();
        categoryPlot28.clearRangeMarkers();
        categoryPlot28.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke34 = categoryPlot28.getRangeGridlineStroke();
        double double35 = categoryPlot28.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        categoryPlot28.drawBackgroundImage(graphics2D36, rectangle2D37);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray40 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer39 };
        categoryPlot28.setRenderers(categoryItemRendererArray40);
        categoryPlot17.setRenderers(categoryItemRendererArray40);
        categoryPlot0.setRenderers(categoryItemRendererArray40);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer44 = categoryPlot0.getRenderer();
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(categoryAxisArray24);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray40);
        org.junit.Assert.assertNull(categoryItemRenderer44);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        java.awt.Stroke stroke20 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.data.Range range22 = categoryPlot0.getDataRange(valueAxis21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        boolean boolean27 = categoryPlot0.render(graphics2D23, rectangle2D24, (int) '4', plotRenderingInfo26);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(range22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(0);
        java.awt.Paint paint10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot0.setRangeGridlinePaint(paint10);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent12);
        boolean boolean14 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        categoryPlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        categoryPlot19.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot19.setDataset(categoryDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = categoryPlot19.getRendererForDataset(categoryDataset24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = categoryPlot19.getDataset();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot27.configureRangeAxes();
        categoryPlot27.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder30 = categoryPlot27.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        categoryPlot27.zoomRangeAxes((double) 0L, plotRenderingInfo32, point2D33);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray35 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot27.setDomainAxes(categoryAxisArray35);
        categoryPlot27.setRangeCrosshairValue((double) (-1.0f), false);
        java.awt.Paint paint40 = categoryPlot27.getRangeCrosshairPaint();
        categoryPlot19.setOutlinePaint(paint40);
        categoryPlot0.setOutlinePaint(paint40);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(legendItemCollection18);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNull(categoryDataset26);
        org.junit.Assert.assertNotNull(datasetRenderingOrder30);
        org.junit.Assert.assertNotNull(categoryAxisArray35);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getDomainMarkers((int) (byte) -1, layer15);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis(categoryAxis17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNull(axisSpace19);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        categoryPlot0.setRangeCrosshairVisible(false);
        java.awt.Stroke stroke14 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot12.zoomRangeAxes((-1.0d), plotRenderingInfo15, point2D16, false);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot12.setRangeAxis(valueAxis19);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot12.setRangeAxis(valueAxis21);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot23.getDataset((int) (short) 1);
        categoryPlot23.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor28 = categoryPlot23.getDomainGridlinePosition();
        categoryPlot12.setDomainGridlinePosition(categoryAnchor28);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot12);
        java.util.List list31 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        int int33 = categoryPlot0.getDomainAxisIndex(categoryAxis32);
        float float34 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryAnchor28);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        categoryPlot0.clearRangeMarkers((int) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset28);
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
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot9.setDomainAxes(categoryAxisArray11);
        java.awt.Stroke stroke13 = categoryPlot9.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = categoryPlot9.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot9.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot9.markerChanged(markerChangeEvent16);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot9.setRangeAxis((int) (byte) 100, valueAxis19, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        categoryPlot22.zoomRangeAxes((-1.0d), plotRenderingInfo25, point2D26, false);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot22.getRangeAxisLocation((int) (byte) 10);
        categoryPlot9.setRangeAxisLocation(axisLocation30, true);
        categoryPlot0.setRangeAxisLocation(axisLocation30, false);
        org.jfree.chart.axis.AxisSpace axisSpace35 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = categoryPlot0.getRenderer((int) (short) -1);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNull(axisSpace35);
        org.junit.Assert.assertNull(categoryItemRenderer37);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        java.lang.String str30 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor31 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = categoryPlot0.getRangeMarkers(layer32);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray36 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis35 };
        categoryPlot34.setDomainAxes(categoryAxisArray36);
        categoryPlot34.setAnchorValue(10.0d);
        categoryPlot34.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean43 = categoryPlot42.isRangeZoomable();
        categoryPlot42.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder47 = categoryPlot42.getDatasetRenderingOrder();
        categoryPlot34.setDatasetRenderingOrder(datasetRenderingOrder47);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder49 = categoryPlot34.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder49);
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot51.configureRangeAxes();
        categoryPlot51.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        categoryPlot51.setDataset(categoryDataset54);
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer57 = categoryPlot51.getRendererForDataset(categoryDataset56);
        org.jfree.data.category.CategoryDataset categoryDataset58 = categoryPlot51.getDataset();
        org.jfree.chart.plot.CategoryPlot categoryPlot59 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot59.configureRangeAxes();
        categoryPlot59.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder62 = categoryPlot59.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo64 = null;
        java.awt.geom.Point2D point2D65 = null;
        categoryPlot59.zoomRangeAxes((double) 0L, plotRenderingInfo64, point2D65);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray67 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot59.setDomainAxes(categoryAxisArray67);
        categoryPlot59.setRangeCrosshairValue((double) (-1.0f), false);
        java.awt.Paint paint72 = categoryPlot59.getRangeCrosshairPaint();
        categoryPlot51.setOutlinePaint(paint72);
        categoryPlot0.setRangeCrosshairPaint(paint72);
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(categoryAnchor31);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertNotNull(categoryAxisArray36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder47);
        org.junit.Assert.assertNotNull(datasetRenderingOrder49);
        org.junit.Assert.assertNull(categoryItemRenderer57);
        org.junit.Assert.assertNull(categoryDataset58);
        org.junit.Assert.assertNotNull(datasetRenderingOrder62);
        org.junit.Assert.assertNotNull(categoryAxisArray67);
        org.junit.Assert.assertNotNull(paint72);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot4.getRangeAxisLocation();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot4.getRangeMarkers(layer7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        categoryPlot4.setDrawingSupplier(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer(15);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean13 = categoryPlot12.isRangeZoomable();
        categoryPlot12.setWeight(0);
        java.awt.Paint paint16 = categoryPlot12.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        categoryPlot12.setDataset((int) ' ', categoryDataset18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot12.setRenderer((int) 'a', categoryItemRenderer21, true);
        java.awt.Stroke stroke24 = categoryPlot12.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke24);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset26 = categoryPlot0.getDataset((int) (short) 1);
        float float27 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.setAnchorValue((double) (short) 10);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(categoryDataset26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        java.lang.String str6 = categoryPlot0.getPlotType();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) (short) 10, layer8);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Category Plot" + "'", str6, "Category Plot");
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.setBackgroundAlpha((float) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        boolean boolean11 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes((double) 1, plotRenderingInfo15, point2D16);
        categoryPlot0.configureRangeAxes();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean21 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = categoryPlot0.getAxisOffset();
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot0.getRangeMarkers(layer26);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(sortOrder18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(categoryAxis24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNull(collection27);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        categoryPlot0.setRenderer(categoryItemRenderer4, true);
        categoryPlot0.clearDomainMarkers();
        boolean boolean8 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        int int28 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        categoryPlot0.setRenderer(categoryItemRenderer29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryItemRenderer23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxisForDataset((-1));
        java.awt.Font font13 = categoryPlot0.getNoDataMessageFont();
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        categoryPlot0.setRenderer(categoryItemRenderer4, true);
        categoryPlot0.setNoDataMessage("hi!");
        org.junit.Assert.assertNotNull(legendItemCollection3);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.setOutlineVisible(true);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        categoryPlot0.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (short) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        java.util.List list17 = categoryPlot0.getCategoriesForAxis(categoryAxis16);
        java.awt.Paint paint18 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        categoryPlot0.markerChanged(markerChangeEvent19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        boolean boolean13 = categoryPlot9.isOutlineVisible();
        categoryPlot9.setRangeCrosshairLockedOnData(true);
        float float16 = categoryPlot9.getForegroundAlpha();
        int int17 = categoryPlot9.getWeight();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis19 };
        categoryPlot18.setDomainAxes(categoryAxisArray20);
        categoryPlot18.setAnchorValue(10.0d);
        categoryPlot18.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean27 = categoryPlot26.isRangeZoomable();
        categoryPlot26.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder31 = categoryPlot26.getDatasetRenderingOrder();
        categoryPlot18.setDatasetRenderingOrder(datasetRenderingOrder31);
        categoryPlot9.setDatasetRenderingOrder(datasetRenderingOrder31);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot34.configureRangeAxes();
        categoryPlot34.clearRangeMarkers();
        categoryPlot34.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke40 = categoryPlot34.getRangeGridlineStroke();
        double double41 = categoryPlot34.getRangeCrosshairValue();
        java.util.List list42 = categoryPlot34.getCategories();
        java.awt.Image image43 = null;
        categoryPlot34.setBackgroundImage(image43);
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = null;
        categoryPlot34.setDomainAxis((int) (byte) 100, categoryAxis46);
        java.awt.Stroke stroke48 = categoryPlot34.getRangeGridlineStroke();
        categoryPlot9.setRangeGridlineStroke(stroke48);
        categoryPlot0.setDomainGridlineStroke(stroke48);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder31);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNull(list42);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(15, valueAxis7);
        categoryPlot0.clearDomainMarkers((int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearRangeMarkers();
        categoryPlot11.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot11.zoomRangeAxes((double) 10, plotRenderingInfo18, point2D19);
        double double21 = categoryPlot11.getRangeCrosshairValue();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryPlot11.getInsets();
        categoryPlot0.setInsets(rectangleInsets22, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot25.zoomRangeAxes((-1.0d), plotRenderingInfo28, point2D29, false);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot25.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray34 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot25.setRangeAxes(valueAxisArray34);
        java.awt.Paint paint36 = categoryPlot25.getRangeGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis38 = categoryPlot25.getRangeAxisForDataset((int) '#');
        java.awt.Paint paint39 = categoryPlot25.getRangeGridlinePaint();
        boolean boolean40 = categoryPlot25.isOutlineVisible();
        boolean boolean41 = categoryPlot0.equals((java.lang.Object) boolean40);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(valueAxisArray34);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNull(valueAxis38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        int int4 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNull(categoryAxis7);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot0.setRenderer(8, categoryItemRenderer20, false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToRangeAxis((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer9);
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.util.SortOrder sortOrder12 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        int int14 = categoryPlot0.getIndexOf(categoryItemRenderer13);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getDomainAxisLocation((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(sortOrder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        categoryPlot0.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis((int) 'a');
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNull(categoryAxis7);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 100, plotRenderingInfo17, point2D18, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = categoryPlot0.getRangeMarkers((int) '#', layer23);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot0.getRangeAxisLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertNotNull(axisLocation25);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        int int4 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Image image5 = null;
        categoryPlot0.setBackgroundImage(image5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset(categoryDataset7);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((int) (short) -1, categoryAxis10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        categoryPlot10.clearDomainMarkers();
        categoryPlot10.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis16 };
        categoryPlot15.setDomainAxes(categoryAxisArray17);
        java.awt.Stroke stroke19 = categoryPlot15.getOutlineStroke();
        categoryPlot10.setRangeCrosshairStroke(stroke19);
        java.lang.String str21 = categoryPlot10.getNoDataMessage();
        categoryPlot10.clearDomainAxes();
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot10.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(15, axisLocation23);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.lang.String str28 = categoryPlot0.getPlotType();
        int int29 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Category Plot" + "'", str28, "Category Plot");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        categoryPlot0.setRangeAxis(valueAxis4);
        categoryPlot0.setWeight((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        boolean boolean16 = categoryPlot8.render(graphics2D12, rectangle2D13, (int) (byte) 100, plotRenderingInfo15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot8.getRenderer((int) (short) 10);
        java.awt.Stroke stroke19 = categoryPlot8.getDomainGridlineStroke();
        java.awt.Stroke stroke20 = categoryPlot8.getDomainGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        categoryPlot0.setRangeAxis(valueAxis22);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryItemRenderer18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot0.getInsets();
        categoryPlot0.clearDomainMarkers(15);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot0.zoomRangeAxes((double) 1.0f, plotRenderingInfo21, point2D22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace24);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(axisSpace4);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot0.getRenderer((int) (short) 100);
        categoryPlot0.setAnchorValue((-1.0d), true);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        categoryPlot0.setDataset(15, categoryDataset32);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNull(categoryItemRenderer27);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        int int6 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo8, point2D9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot4.setRangeAxis((int) (byte) 100, valueAxis6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot4.render(graphics2D8, rectangle2D9, (int) (byte) 100, plotRenderingInfo11);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot4.getRenderer((int) (short) 10);
        java.awt.Stroke stroke15 = categoryPlot4.getDomainGridlineStroke();
        java.awt.Stroke stroke16 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke16);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor18 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace19);
        java.awt.Paint paint21 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot0.getDomainAxisEdge((int) ' ');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder24 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(categoryAnchor18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(datasetRenderingOrder24);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer((int) (short) 0, categoryItemRenderer15, false);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer(0);
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomRangeAxes(10.0d, plotRenderingInfo13, point2D14, false);
        int int17 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(axisSpace11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot0.setDomainAxis(10, categoryAxis8);
        org.jfree.chart.axis.AxisSpace axisSpace10 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(datasetGroup12);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = categoryPlot4.getDomainAxisEdge();
        categoryPlot4.setRangeCrosshairLockedOnData(false);
        categoryPlot4.clearDomainAxes();
        org.junit.Assert.assertNotNull(rectangleEdge5);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        java.awt.Stroke stroke37 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot0.setDomainGridlineStroke(stroke37);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        categoryPlot0.notifyListeners(plotChangeEvent39);
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
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(0);
        boolean boolean10 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.configureRangeAxes();
        categoryPlot12.clearDomainMarkers();
        categoryPlot12.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray19 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis18 };
        categoryPlot17.setDomainAxes(categoryAxisArray19);
        java.awt.Stroke stroke21 = categoryPlot17.getOutlineStroke();
        categoryPlot12.setRangeCrosshairStroke(stroke21);
        org.jfree.chart.util.SortOrder sortOrder23 = categoryPlot12.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        categoryPlot12.removeChangeListener(plotChangeListener24);
        java.awt.Paint paint26 = categoryPlot12.getNoDataMessagePaint();
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot12.getRangeAxisLocation((int) (short) 10);
        categoryPlot0.setDomainAxisLocation((int) (short) 10, axisLocation28, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = categoryPlot0.getRenderer();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D32, rectangle2D33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(sortOrder23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNull(categoryItemRenderer31);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        java.awt.Paint paint8 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot9.setDomainAxes(categoryAxisArray11);
        categoryPlot9.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot9.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        org.jfree.chart.plot.Plot plot19 = categoryPlot17.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation20 = categoryPlot17.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation16, plotOrientation20);
        categoryPlot0.setDomainAxisLocation(axisLocation16);
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = categoryPlot0.getRangeMarkers(layer23);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(plotOrientation20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNull(collection24);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        int int21 = categoryPlot0.getIndexOf(categoryItemRenderer20);
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        categoryPlot0.notifyListeners(plotChangeEvent25);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge24);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        categoryPlot0.setRangeCrosshairValue((double) ' ', false);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.plot.PlotOrientation plotOrientation18 = categoryPlot0.getOrientation();
        java.lang.String str19 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(plotOrientation18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot4.setRangeAxis((int) (byte) 100, valueAxis6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot4.render(graphics2D8, rectangle2D9, (int) (byte) 100, plotRenderingInfo11);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot4.getRenderer((int) (short) 10);
        java.awt.Stroke stroke15 = categoryPlot4.getDomainGridlineStroke();
        java.awt.Stroke stroke16 = categoryPlot4.getDomainGridlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke16);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor18 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace19);
        java.awt.Paint paint21 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot0.getDomainAxisEdge((int) ' ');
        categoryPlot0.setBackgroundAlpha((float) (-1L));
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(categoryAnchor18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleEdge23);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot7.getOrientation();
        categoryPlot0.setOrientation(plotOrientation12);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer((int) (short) 0, categoryItemRenderer15);
        java.awt.Paint paint17 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        java.util.List list7 = categoryPlot0.getCategories();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot9.zoomRangeAxes((-1.0d), plotRenderingInfo12, point2D13, false);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot9.getRangeAxisLocation((int) (byte) 10);
        java.awt.Stroke stroke18 = categoryPlot9.getRangeCrosshairStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot9);
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot0.getRangeMarkers(layer20);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(collection21);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setWeight((int) (short) -1);
        java.awt.Paint paint9 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot10.getDataset((int) (short) 1);
        categoryPlot10.clearRangeAxes();
        java.awt.Paint paint14 = categoryPlot10.getRangeGridlinePaint();
        categoryPlot0.setRangeGridlinePaint(paint14);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        categoryPlot0.clearDomainMarkers(0);
        org.jfree.chart.plot.Plot plot9 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis((int) (byte) 0, categoryAxis13);
        categoryPlot0.clearAnnotations();
        java.lang.String str16 = categoryPlot0.getPlotType();
        double double17 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        categoryPlot0.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Category Plot" + "'", str16, "Category Plot");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot6.setRangeAxis((int) (byte) 100, valueAxis8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        boolean boolean14 = categoryPlot6.render(graphics2D10, rectangle2D11, (int) (byte) 100, plotRenderingInfo13);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot6.getRenderer((int) (short) 10);
        java.awt.Stroke stroke17 = categoryPlot6.getDomainGridlineStroke();
        java.awt.Stroke stroke18 = categoryPlot6.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = categoryPlot6.getFixedLegendItems();
        boolean boolean20 = categoryPlot6.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder21 = categoryPlot6.getDatasetRenderingOrder();
        int int22 = categoryPlot6.getWeight();
        java.awt.Paint paint23 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot6.setRangeCrosshairPaint(paint23);
        categoryPlot0.setRangeCrosshairPaint(paint23);
        java.awt.Stroke stroke26 = categoryPlot0.getRangeCrosshairStroke();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(legendItemCollection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge((int) (short) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        categoryPlot0.setRangeCrosshairValue((double) (byte) 10, false);
        org.jfree.chart.axis.AxisSpace axisSpace11 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace11);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(categoryAxis7);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 0, 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo11, point2D12, true);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        int int4 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Image image5 = null;
        categoryPlot0.setBackgroundImage(image5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, (double) 100.0f, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) ' ', (int) (byte) 10, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        java.awt.Stroke stroke37 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(valueAxisArray30);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(rectangleEdge38);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace4);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder5 = categoryPlot0.getDatasetRenderingOrder();
        int int6 = categoryPlot0.getDatasetCount();
        java.awt.Stroke stroke7 = categoryPlot0.getDomainGridlineStroke();
        int int8 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertNull(collection6);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        int int9 = categoryPlot0.getBackgroundImageAlignment();
        double double10 = categoryPlot0.getAnchorValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot0.getRenderer(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot13.render(graphics2D17, rectangle2D18, (int) (byte) 100, plotRenderingInfo20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot13.getRenderer((int) (short) 10);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        categoryPlot13.drawBackgroundImage(graphics2D24, rectangle2D25);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryItemRenderer23);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        java.awt.geom.Point2D point2D21 = null;
        categoryPlot0.zoomDomainAxes((double) 101, 10.0d, plotRenderingInfo20, point2D21);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setAxisOffset(rectangleInsets17);
        java.awt.Stroke stroke19 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        categoryPlot0.setDomainAxis(categoryAxis20);
        boolean boolean22 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.lang.Object obj23 = categoryPlot0.clone();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sortOrder15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        java.awt.Stroke stroke13 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomRangeAxes((double) (-1.0f), plotRenderingInfo6, point2D7);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis16 };
        categoryPlot15.setDomainAxes(categoryAxisArray17);
        java.awt.Stroke stroke19 = categoryPlot15.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = categoryPlot15.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot15.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        categoryPlot15.markerChanged(markerChangeEvent22);
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot15.getRangeAxisEdge((int) (short) 10);
        java.awt.Paint paint26 = categoryPlot15.getRangeGridlinePaint();
        java.awt.Font font27 = categoryPlot15.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font27);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(font27);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot0.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.configureRangeAxes();
        categoryPlot17.clearDomainMarkers();
        categoryPlot17.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray24 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis23 };
        categoryPlot22.setDomainAxes(categoryAxisArray24);
        java.awt.Stroke stroke26 = categoryPlot22.getOutlineStroke();
        categoryPlot17.setRangeCrosshairStroke(stroke26);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot28.configureRangeAxes();
        categoryPlot28.clearRangeMarkers();
        categoryPlot28.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke34 = categoryPlot28.getRangeGridlineStroke();
        double double35 = categoryPlot28.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        categoryPlot28.drawBackgroundImage(graphics2D36, rectangle2D37);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray40 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer39 };
        categoryPlot28.setRenderers(categoryItemRendererArray40);
        categoryPlot17.setRenderers(categoryItemRendererArray40);
        categoryPlot0.setRenderers(categoryItemRendererArray40);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer44 = categoryPlot0.getRenderer();
        categoryPlot0.setRangeCrosshairValue((double) 0.0f, false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(categoryAxisArray24);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray40);
        org.junit.Assert.assertNull(categoryItemRenderer44);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent2 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent2);
        java.awt.Paint paint4 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        categoryPlot0.setOutlineVisible(true);
        categoryPlot0.mapDatasetToDomainAxis((int) ' ', 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot19.setRangeAxis((int) (byte) 100, valueAxis21);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot19.getDomainMarkers((int) (byte) 10, layer24);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean27 = categoryPlot26.isRangeZoomable();
        categoryPlot26.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation31 = categoryPlot26.getOrientation();
        categoryPlot19.setOrientation(plotOrientation31);
        boolean boolean33 = categoryPlot19.isRangeGridlinesVisible();
        org.jfree.chart.LegendItemCollection legendItemCollection34 = categoryPlot19.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection34);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot37.configureRangeAxes();
        categoryPlot37.clearDomainMarkers();
        categoryPlot37.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint42 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot37.setNoDataMessagePaint(paint42);
        java.awt.Image image44 = categoryPlot37.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        java.awt.geom.Point2D point2D47 = null;
        categoryPlot37.zoomDomainAxes((double) 0.0f, plotRenderingInfo46, point2D47);
        java.awt.Paint paint49 = categoryPlot37.getDomainGridlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation50 = categoryPlot37.getRangeAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((-1), axisLocation50, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(plotOrientation31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(legendItemCollection34);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(axisLocation50);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getRangeMarkers(layer11);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent35 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        categoryPlot0.setDataset(categoryDataset37);
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
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(0, layer10);
        int int12 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(axisSpace13);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        boolean boolean5 = categoryPlot0.isRangeZoomable();
        double double6 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot0.setDomainAxis(10, categoryAxis8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        categoryPlot0.setDataset(15, categoryDataset13);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot0.setRangeAxis((int) (short) 0, valueAxis16, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot0.zoomDomainAxes((double) ' ', (double) 101, plotRenderingInfo21, point2D22);
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Image image4 = null;
        categoryPlot0.setBackgroundImage(image4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot6.configureRangeAxes();
        categoryPlot6.clearDomainMarkers();
        categoryPlot6.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot6.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot6.rendererChanged(rendererChangeEvent13);
        java.awt.Font font15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot6.setNoDataMessageFont(font15);
        categoryPlot0.setNoDataMessageFont(font15);
        categoryPlot0.setRangeGridlinesVisible(true);
        double double20 = categoryPlot0.getAnchorValue();
        categoryPlot0.setOutlineVisible(false);
        boolean boolean23 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo5, point2D6, true);
        java.awt.Font font9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font9);
        double double11 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot23.zoomRangeAxes((-1.0d), plotRenderingInfo26, point2D27, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor30 = categoryPlot23.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge31 = categoryPlot23.getRangeAxisEdge();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot23);
        float float33 = categoryPlot23.getForegroundAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot23.zoomDomainAxes(0.0d, plotRenderingInfo35, point2D36, false);
        java.awt.Paint paint39 = categoryPlot23.getRangeCrosshairPaint();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(categoryAnchor30);
        org.junit.Assert.assertNotNull(rectangleEdge31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        float float7 = categoryPlot0.getBackgroundAlpha();
        java.lang.String str8 = categoryPlot0.getPlotType();
        java.lang.Object obj9 = categoryPlot0.clone();
        java.awt.Stroke stroke10 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.data.general.DatasetGroup datasetGroup11 = categoryPlot0.getDatasetGroup();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Category Plot" + "'", str8, "Category Plot");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(datasetGroup11);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        categoryPlot0.setNoDataMessage("");
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plotOrientation13);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        java.lang.String str6 = categoryPlot0.getPlotType();
        java.lang.Object obj7 = categoryPlot0.clone();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Category Plot" + "'", str6, "Category Plot");
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) 0.5f, plotRenderingInfo13, point2D14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot16.setRangeAxis((int) (byte) 100, valueAxis18);
        boolean boolean20 = categoryPlot16.isOutlineVisible();
        categoryPlot16.setRangeCrosshairLockedOnData(true);
        double double23 = categoryPlot16.getAnchorValue();
        org.jfree.chart.axis.AxisSpace axisSpace24 = categoryPlot16.getFixedRangeAxisSpace();
        boolean boolean25 = categoryPlot0.equals((java.lang.Object) categoryPlot16);
        categoryPlot16.clearAnnotations();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(axisSpace24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Paint paint8 = categoryPlot0.getBackgroundPaint();
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean10 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        int int31 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.Layer layer33 = null;
        java.util.Collection collection34 = categoryPlot0.getRangeMarkers(15, layer33);
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        categoryPlot0.removeChangeListener(plotChangeListener35);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(collection34);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        categoryPlot0.setRangeCrosshairValue((double) ' ', false);
        java.awt.Paint paint17 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot0.setRenderer(categoryItemRenderer18, false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        categoryPlot0.axisChanged(axisChangeEvent8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.configureRangeAxes();
        categoryPlot12.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot12.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot12.zoomRangeAxes((double) 0L, plotRenderingInfo17, point2D18);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot12.setDomainAxes(categoryAxisArray20);
        categoryPlot0.setDomainAxes(categoryAxisArray20);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        float float8 = categoryPlot0.getBackgroundAlpha();
        java.lang.Object obj9 = categoryPlot0.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 1, (double) (short) 10, plotRenderingInfo12, point2D13);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot0.setRenderer((int) (short) 10, categoryItemRenderer16);
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        java.awt.Paint paint9 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.AxisSpace axisSpace10 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace10);
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.util.SortOrder sortOrder13 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor14 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(sortOrder13);
        org.junit.Assert.assertNotNull(categoryAnchor14);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        java.lang.Object obj7 = categoryPlot0.clone();
        float float8 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        categoryPlot0.markerChanged(markerChangeEvent25);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot0.getDomainAxisLocation(101);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(axisLocation28);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        categoryPlot19.configureRangeAxes();
        categoryPlot19.clearRangeMarkers();
        categoryPlot19.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke25 = categoryPlot19.getRangeGridlineStroke();
        double double26 = categoryPlot19.getRangeCrosshairValue();
        java.awt.Paint paint27 = categoryPlot19.getBackgroundPaint();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        categoryPlot19.setRangeAxis(valueAxis28);
        boolean boolean30 = categoryPlot19.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot19.getRangeAxisLocation(1);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray35 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis34 };
        categoryPlot33.setDomainAxes(categoryAxisArray35);
        categoryPlot33.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot33.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean42 = categoryPlot41.isRangeZoomable();
        org.jfree.chart.plot.Plot plot43 = categoryPlot41.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation44 = categoryPlot41.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge45 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation40, plotOrientation44);
        org.jfree.chart.util.RectangleEdge rectangleEdge46 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation32, plotOrientation44);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((-1), axisLocation32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(axisLocation32);
        org.junit.Assert.assertNotNull(categoryAxisArray35);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(plot43);
        org.junit.Assert.assertNotNull(plotOrientation44);
        org.junit.Assert.assertNotNull(rectangleEdge45);
        org.junit.Assert.assertNotNull(rectangleEdge46);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        categoryPlot0.clearDomainMarkers((int) 'a');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(0, 0, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray19 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis18 };
        categoryPlot17.setDomainAxes(categoryAxisArray19);
        float float21 = categoryPlot17.getBackgroundAlpha();
        categoryPlot17.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = categoryPlot17.getDomainAxisForDataset((int) '#');
        boolean boolean27 = categoryPlot17.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        categoryPlot17.setRenderer((int) '4', categoryItemRenderer29);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray33 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis32 };
        categoryPlot31.setDomainAxes(categoryAxisArray33);
        float float35 = categoryPlot31.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot36.configureRangeAxes();
        categoryPlot36.clearDomainMarkers();
        categoryPlot36.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset42 = categoryPlot36.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        categoryPlot36.removeChangeListener(plotChangeListener43);
        java.awt.Paint paint45 = categoryPlot36.getBackgroundPaint();
        categoryPlot31.setRangeGridlinePaint(paint45);
        categoryPlot17.setOutlinePaint(paint45);
        categoryPlot0.setOutlinePaint(paint45);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        categoryPlot0.markerChanged(markerChangeEvent49);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(categoryAnchor15);
        org.junit.Assert.assertNotNull(categoryAxisArray19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray33);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset42);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        java.awt.Stroke stroke7 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getDomainAxisLocation((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        int int14 = categoryPlot0.getIndexOf(categoryItemRenderer13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean5 = categoryPlot0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer7, true);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRendererForDataset(categoryDataset10);
        java.awt.Font font12 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor11 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot14.setRangeAxis((int) (byte) 100, valueAxis16);
        boolean boolean18 = categoryPlot14.isOutlineVisible();
        categoryPlot14.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot14.getDomainAxis(8);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor23 = categoryPlot14.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor23);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(categoryAnchor11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertNotNull(categoryAnchor23);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot20.getDomainAxisLocation();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = categoryPlot20.getAxisOffset();
        org.jfree.chart.util.Layer layer34 = null;
        java.util.Collection collection35 = categoryPlot20.getRangeMarkers((int) (short) 0, layer34);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNull(collection35);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(rectangleEdge18);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(true);
        categoryPlot0.setRangeCrosshairValue(0.0d, false);
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(valueAxis10);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        categoryPlot0.setDomainAxis((int) '#', categoryAxis38);
        boolean boolean40 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        boolean boolean16 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = categoryPlot0.getDomainAxisForDataset((int) (byte) -1);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(categoryAxis18);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        categoryPlot20.setRangeCrosshairValue((double) (-1));
        categoryPlot20.setOutlineVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot20.setRenderer(categoryItemRenderer35);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        categoryPlot20.setRangeAxis(valueAxis37);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        float float7 = categoryPlot0.getBackgroundAlpha();
        java.lang.String str8 = categoryPlot0.getPlotType();
        java.lang.Object obj9 = categoryPlot0.clone();
        java.awt.Stroke stroke10 = categoryPlot0.getRangeCrosshairStroke();
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Category Plot" + "'", str8, "Category Plot");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        categoryPlot21.setRangeAxis((int) (byte) 100, valueAxis23);
        boolean boolean25 = categoryPlot21.isOutlineVisible();
        categoryPlot21.setRangeCrosshairLockedOnData(true);
        boolean boolean28 = categoryPlot21.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = categoryPlot21.getDomainAxisForDataset(0);
        java.awt.Paint paint31 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot21.setRangeGridlinePaint(paint31);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset34, categoryAxis35, valueAxis36, categoryItemRenderer37);
        int int39 = categoryPlot38.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot38.getRangeAxisLocation();
        categoryPlot21.setDomainAxisLocation((int) (short) 100, axisLocation40, false);
        categoryPlot0.setDomainAxisLocation(axisLocation40, false);
        boolean boolean45 = categoryPlot0.isOutlineVisible();
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(categoryAxis30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo5, point2D6, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (byte) 10);
        boolean boolean11 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.LegendItemCollection legendItemCollection12 = categoryPlot0.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        categoryPlot0.axisChanged(axisChangeEvent13);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(legendItemCollection12);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        java.awt.geom.Point2D point2D21 = null;
        categoryPlot17.zoomRangeAxes((-1.0d), plotRenderingInfo20, point2D21, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor24 = categoryPlot17.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot17.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot27.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot27.zoomRangeAxes((-1.0d), plotRenderingInfo30, point2D31, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor34 = categoryPlot27.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge36 = categoryPlot27.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = categoryPlot27.getAxisOffset();
        categoryPlot17.setInsets(rectangleInsets37);
        categoryPlot0.setAxisOffset(rectangleInsets37);
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = null;
        categoryPlot0.setDomainAxis((int) (byte) 0, categoryAxis41, false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNotNull(categoryAnchor24);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertNotNull(categoryAnchor34);
        org.junit.Assert.assertNotNull(rectangleEdge36);
        org.junit.Assert.assertNotNull(rectangleInsets37);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearRangeMarkers();
        categoryPlot8.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke14 = categoryPlot8.getRangeGridlineStroke();
        double double15 = categoryPlot8.getRangeCrosshairValue();
        java.util.List list16 = categoryPlot8.getCategories();
        java.awt.Image image17 = null;
        categoryPlot8.setBackgroundImage(image17);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        categoryPlot8.setDomainAxis((int) (byte) 100, categoryAxis20);
        categoryPlot8.setRangeCrosshairValue((double) ' ', false);
        categoryPlot8.setBackgroundImageAlignment((int) 'a');
        java.awt.Paint paint27 = categoryPlot8.getNoDataMessagePaint();
        categoryPlot0.setRangeGridlinePaint(paint27);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        java.awt.Font font9 = categoryPlot0.getNoDataMessageFont();
        float float10 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        categoryPlot0.axisChanged(axisChangeEvent11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        categoryPlot13.clearRangeMarkers();
        categoryPlot13.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke19 = categoryPlot13.getRangeGridlineStroke();
        double double20 = categoryPlot13.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        categoryPlot13.drawBackgroundImage(graphics2D21, rectangle2D22);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray25 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer24 };
        categoryPlot13.setRenderers(categoryItemRendererArray25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = categoryPlot13.getDrawingSupplier();
        categoryPlot13.clearDomainMarkers((int) ' ');
        categoryPlot13.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis32 = categoryPlot13.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot33.configureRangeAxes();
        categoryPlot33.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        categoryPlot36.setRangeAxis((int) (byte) 100, valueAxis38);
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot36.getRangeAxisLocation();
        categoryPlot33.setDomainAxisLocation(axisLocation40);
        categoryPlot33.clearRangeMarkers();
        categoryPlot13.setParent((org.jfree.chart.plot.Plot) categoryPlot33);
        org.jfree.chart.axis.AxisLocation axisLocation44 = categoryPlot33.getDomainAxisLocation();
        org.jfree.chart.LegendItemCollection legendItemCollection45 = categoryPlot33.getFixedLegendItems();
        java.awt.Stroke stroke46 = categoryPlot33.getDomainGridlineStroke();
        categoryPlot0.setOutlineStroke(stroke46);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray25);
        org.junit.Assert.assertNotNull(drawingSupplier27);
        org.junit.Assert.assertNull(valueAxis32);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertNotNull(axisLocation44);
        org.junit.Assert.assertNull(legendItemCollection45);
        org.junit.Assert.assertNotNull(stroke46);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot0.setDomainAxis((int) ' ', categoryAxis18, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot0.getRenderer(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(categoryAnchor15);
        org.junit.Assert.assertNull(categoryItemRenderer22);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        categoryPlot0.axisChanged(axisChangeEvent8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        java.util.List list11 = categoryPlot0.getCategoriesForAxis(categoryAxis10);
        java.util.List list12 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo7, point2D8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list11 = categoryPlot10.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot10.setRenderer(categoryItemRenderer12, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot10.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier15);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setRangeCrosshairValue((double) 15);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D8, rectangle2D9, 0, plotRenderingInfo11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getRangeAxisEdge((int) (short) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomDomainAxes((double) 10.0f, (double) '#', plotRenderingInfo17, point2D18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rectangleEdge14);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        org.jfree.chart.plot.Plot plot10 = categoryPlot0.getRootPlot();
        categoryPlot0.setWeight((int) (short) 10);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        categoryPlot0.setDomainAxis(categoryAxis4);
        boolean boolean6 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge();
        float float8 = categoryPlot0.getBackgroundAlpha();
        java.awt.Paint paint9 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        java.lang.String str30 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.util.RectangleEdge rectangleEdge31 = categoryPlot0.getRangeAxisEdge();
        java.awt.Paint paint32 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot0.getRangeAxisEdge(15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        int int36 = categoryPlot0.getIndexOf(categoryItemRenderer35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(rectangleEdge31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        float float19 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor18 = categoryPlot0.getDomainGridlinePosition();
        java.awt.Stroke stroke19 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(categoryAnchor18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        categoryPlot0.configureRangeAxes();
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        categoryPlot0.setRenderer(categoryItemRenderer29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot0.setDomainAxis(categoryAxis9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomRangeAxes((double) 8, 100.0d, plotRenderingInfo13, point2D14);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        categoryPlot0.clearRangeMarkers((int) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset(8);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot12.getDataset((int) (short) 1);
        categoryPlot12.clearRangeAxes();
        int int16 = categoryPlot12.getWeight();
        categoryPlot12.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor19 = categoryPlot12.getDomainGridlinePosition();
        boolean boolean20 = categoryPlot12.isRangeGridlinesVisible();
        java.awt.Stroke stroke21 = categoryPlot12.getRangeGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke21);
        org.jfree.chart.axis.ValueAxis valueAxis23 = categoryPlot0.getRangeAxis();
        boolean boolean24 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot7.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean14 = categoryPlot13.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot13.setRangeAxis((int) (byte) 1, valueAxis16, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = categoryPlot13.getInsets();
        categoryPlot7.setInsets(rectangleInsets19, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.configureRangeAxes();
        categoryPlot22.clearRangeMarkers();
        boolean boolean25 = categoryPlot22.isOutlineVisible();
        categoryPlot22.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        categoryPlot28.setRangeAxis((int) (byte) 100, valueAxis30);
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        boolean boolean36 = categoryPlot28.render(graphics2D32, rectangle2D33, (int) (byte) 100, plotRenderingInfo35);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = categoryPlot28.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        categoryPlot28.setRenderer((int) 'a', categoryItemRenderer40, false);
        categoryPlot28.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation45 = categoryPlot28.getDomainAxisLocation();
        categoryPlot22.setRangeAxisLocation(axisLocation45);
        categoryPlot7.setDomainAxisLocation(axisLocation45);
        categoryPlot0.setRangeAxisLocation(axisLocation45, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis50 = null;
        categoryPlot0.setDomainAxis(categoryAxis50);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(categoryItemRenderer38);
        org.junit.Assert.assertNotNull(axisLocation45);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(legendItemCollection13);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        float float11 = categoryPlot0.getForegroundAlpha();
        float float12 = categoryPlot0.getBackgroundImageAlpha();
        categoryPlot0.setForegroundAlpha((float) (short) -1);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot0.getDomainAxisEdge(8);
        java.lang.Object obj25 = categoryPlot0.clone();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(legendItemCollection22);
        org.junit.Assert.assertNotNull(rectangleEdge24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        boolean boolean35 = categoryPlot0.isRangeCrosshairVisible();
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNotNull(categoryAnchor12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNotNull(valueAxisArray29);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.setBackgroundAlpha(1.0f);
        java.util.List list4 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((-1));
        java.awt.Stroke stroke7 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(101, (int) ' ', plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge((int) (short) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot0.getDatasetRenderingOrder();
        java.awt.Stroke stroke9 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        categoryPlot0.clearDomainMarkers(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot0.getInsets();
        int int30 = categoryPlot0.getWeight();
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
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setBackgroundAlpha((float) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        java.lang.Object obj14 = categoryPlot0.clone();
        boolean boolean15 = categoryPlot0.isRangeZoomable();
        java.awt.Paint paint16 = categoryPlot0.getBackgroundPaint();
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        int int8 = categoryPlot0.getWeight();
        categoryPlot0.setWeight((int) (short) 1);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        boolean boolean15 = categoryPlot0.render(graphics2D11, rectangle2D12, (int) (short) 10, plotRenderingInfo14);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        java.awt.Paint paint8 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot9.setDomainAxes(categoryAxisArray11);
        categoryPlot9.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot9.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        org.jfree.chart.plot.Plot plot19 = categoryPlot17.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation20 = categoryPlot17.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation16, plotOrientation20);
        categoryPlot0.setDomainAxisLocation(axisLocation16);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, (int) 'a');
        categoryPlot0.setOutlineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis29 = categoryPlot0.getRangeAxisForDataset((int) (byte) -1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(plotOrientation20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNull(valueAxis29);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        java.awt.Stroke stroke25 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean10 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer(categoryItemRenderer11, true);
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = categoryPlot16.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        categoryPlot20.clearRangeMarkers();
        boolean boolean23 = categoryPlot20.isOutlineVisible();
        categoryPlot20.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot20.setRenderer(categoryItemRenderer26);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot20.getDomainAxisLocation();
        categoryPlot16.setRangeAxisLocation((int) (short) 0, axisLocation28, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset33 = categoryPlot31.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean35 = categoryPlot34.isRangeZoomable();
        categoryPlot34.setAnchorValue(100.0d, false);
        float float39 = categoryPlot34.getForegroundAlpha();
        int int40 = categoryPlot34.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        categoryPlot34.setRangeAxis((int) (byte) 100, valueAxis42, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray47 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis46 };
        categoryPlot45.setDomainAxes(categoryAxisArray47);
        categoryPlot45.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation52 = categoryPlot45.getDomainAxisLocation(100);
        categoryPlot34.setRangeAxisLocation(axisLocation52, false);
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        int int56 = categoryPlot34.getRangeAxisIndex(valueAxis55);
        org.jfree.chart.util.Layer layer57 = null;
        java.util.Collection collection58 = categoryPlot34.getRangeMarkers(layer57);
        org.jfree.chart.plot.PlotOrientation plotOrientation59 = categoryPlot34.getOrientation();
        categoryPlot31.setOrientation(plotOrientation59);
        org.jfree.chart.util.RectangleEdge rectangleEdge61 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation28, plotOrientation59);
        categoryPlot0.setOrientation(plotOrientation59);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNull(categoryDataset33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray47);
        org.junit.Assert.assertNotNull(axisLocation52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(collection58);
        org.junit.Assert.assertNotNull(plotOrientation59);
        org.junit.Assert.assertNotNull(rectangleEdge61);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        java.awt.Image image8 = categoryPlot0.getBackgroundImage();
        java.awt.Stroke stroke9 = categoryPlot0.getRangeCrosshairStroke();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        categoryPlot0.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.util.List list13 = categoryPlot0.getAnnotations();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        boolean boolean18 = categoryPlot0.render(graphics2D14, rectangle2D15, (int) (short) 10, plotRenderingInfo17);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace4);
        categoryPlot0.clearDomainMarkers((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer9);
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis15);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot13.getRangeAxisLocation();
        categoryPlot13.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot13.setRangeAxis(valueAxis20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot13.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(10, axisLocation22, false);
        categoryPlot0.setRangeGridlinesVisible(true);
        java.awt.Paint paint27 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 100, (double) 101, plotRenderingInfo30, point2D31);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = categoryPlot0.getInsets();
        java.lang.String str7 = categoryPlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Category Plot" + "'", str7, "Category Plot");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        categoryPlot0.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot0.setRenderer(categoryItemRenderer22);
        categoryPlot0.setDomainGridlinesVisible(true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        categoryPlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot19.setRangeAxis((int) (byte) 100, valueAxis21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        boolean boolean27 = categoryPlot19.render(graphics2D23, rectangle2D24, (int) (byte) 100, plotRenderingInfo26);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = categoryPlot19.getRenderer((int) (short) 10);
        java.awt.Stroke stroke30 = categoryPlot19.getDomainGridlineStroke();
        java.awt.Stroke stroke31 = categoryPlot19.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection32 = categoryPlot19.getFixedLegendItems();
        boolean boolean33 = categoryPlot19.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder34 = categoryPlot19.getDatasetRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection35 = categoryPlot19.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean37 = categoryPlot36.isRangeZoomable();
        categoryPlot36.setAnchorValue(100.0d, false);
        float float41 = categoryPlot36.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder42 = categoryPlot36.getRowRenderingOrder();
        categoryPlot19.setRowRenderingOrder(sortOrder42);
        org.jfree.chart.axis.AxisSpace axisSpace44 = categoryPlot19.getFixedDomainAxisSpace();
        java.awt.Stroke stroke45 = categoryPlot19.getOutlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(legendItemCollection18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(categoryItemRenderer29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(legendItemCollection32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder34);
        org.junit.Assert.assertNotNull(legendItemCollection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder42);
        org.junit.Assert.assertNull(axisSpace44);
        org.junit.Assert.assertNotNull(stroke45);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot0.zoomRangeAxes((double) '#', plotRenderingInfo16, point2D17);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot19.zoomRangeAxes((-1.0d), plotRenderingInfo22, point2D23, false);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        categoryPlot19.setRangeAxis(valueAxis26);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray28 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot19.setRenderers(categoryItemRendererArray28);
        categoryPlot0.setRenderers(categoryItemRendererArray28);
        org.jfree.chart.LegendItemCollection legendItemCollection31 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryItemRendererArray28);
        org.junit.Assert.assertNotNull(legendItemCollection31);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (short) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        java.util.List list17 = categoryPlot0.getCategoriesForAxis(categoryAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot0.setRangeAxis(8, valueAxis19, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot23.zoomRangeAxes((-1.0d), plotRenderingInfo26, point2D27, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor30 = categoryPlot23.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge31 = categoryPlot23.getRangeAxisEdge();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot23);
        float float33 = categoryPlot23.getForegroundAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot23.zoomDomainAxes(0.0d, plotRenderingInfo35, point2D36, false);
        java.lang.String str39 = categoryPlot23.getNoDataMessage();
        java.awt.Paint paint40 = categoryPlot23.getRangeGridlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent41 = null;
        categoryPlot23.notifyListeners(plotChangeEvent41);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(categoryAnchor30);
        org.junit.Assert.assertNotNull(rectangleEdge31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo4, point2D5, false);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        boolean boolean9 = categoryPlot0.isDomainZoomable();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.setRangeCrosshairValue((double) 10L, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot17.setRangeAxis((int) (byte) 100, valueAxis19);
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = categoryPlot17.getDomainMarkers((int) (byte) 10, layer22);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean25 = categoryPlot24.isRangeZoomable();
        categoryPlot24.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation29 = categoryPlot24.getOrientation();
        categoryPlot17.setOrientation(plotOrientation29);
        boolean boolean31 = categoryPlot17.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray34 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis33 };
        categoryPlot32.setDomainAxes(categoryAxisArray34);
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        categoryPlot32.setRangeAxis(valueAxis36);
        categoryPlot32.setWeight((int) (short) 10);
        java.awt.Paint paint40 = categoryPlot32.getOutlinePaint();
        categoryPlot17.setOutlinePaint(paint40);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder42 = categoryPlot17.getDatasetRenderingOrder();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(plotOrientation29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray34);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(datasetRenderingOrder42);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = categoryPlot0.getAxisOffset();
        categoryPlot0.clearAnnotations();
        java.awt.Paint paint21 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot1.setRangeAxis((int) (byte) 100, valueAxis3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        boolean boolean9 = categoryPlot1.render(graphics2D5, rectangle2D6, (int) (byte) 100, plotRenderingInfo8);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot1.setRangeAxis((int) (short) 0, valueAxis11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot1.getDomainAxisEdge(15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot1.getDrawingSupplier();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        categoryPlot16.clearRangeMarkers();
        categoryPlot16.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke22 = categoryPlot16.getRangeGridlineStroke();
        double double23 = categoryPlot16.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        categoryPlot16.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = categoryPlot16.getRangeAxisEdge();
        categoryPlot16.clearDomainMarkers((int) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation30 = categoryPlot16.getOrientation();
        categoryPlot1.setOrientation(plotOrientation30);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge32 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge27);
        org.junit.Assert.assertNotNull(plotOrientation30);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setWeight((-1));
        java.util.List list5 = categoryPlot0.getCategories();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        boolean boolean7 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge((int) (short) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getInsets();
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        java.lang.String str5 = categoryPlot0.getPlotType();
        categoryPlot0.setForegroundAlpha((float) '4');
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Category Plot" + "'", str5, "Category Plot");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        float float6 = categoryPlot0.getBackgroundAlpha();
        java.awt.Stroke stroke7 = categoryPlot0.getRangeCrosshairStroke();
        categoryPlot0.setBackgroundImageAlignment((-1));
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis15);
        boolean boolean17 = categoryPlot13.isOutlineVisible();
        categoryPlot13.setRangeCrosshairLockedOnData(true);
        float float20 = categoryPlot13.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean22 = categoryPlot21.isRangeZoomable();
        categoryPlot21.setWeight(0);
        java.awt.Paint paint25 = categoryPlot21.getBackgroundPaint();
        categoryPlot13.setRangeGridlinePaint(paint25);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent27 = null;
        categoryPlot13.rendererChanged(rendererChangeEvent27);
        int int29 = categoryPlot13.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot13.getRangeAxisLocation(0);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (byte) -1, axisLocation31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        int int10 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot0.setRangeAxis((int) '#', valueAxis12);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer(0);
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomRangeAxes(10.0d, plotRenderingInfo13, point2D14, false);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(axisSpace11);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot0.getDomainAxisForDataset((int) (byte) 0);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(categoryAxis23);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        categoryPlot0.clearRangeMarkers(10);
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
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        boolean boolean11 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes((double) 1, plotRenderingInfo15, point2D16);
        categoryPlot0.configureRangeAxes();
        boolean boolean19 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot20.zoomRangeAxes((-1.0d), plotRenderingInfo23, point2D24, false);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot20.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        categoryPlot20.setRangeAxis((int) (short) 100, valueAxis30, false);
        org.jfree.chart.axis.AxisSpace axisSpace33 = null;
        categoryPlot20.setFixedRangeAxisSpace(axisSpace33);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray37 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis36 };
        categoryPlot35.setDomainAxes(categoryAxisArray37);
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        categoryPlot35.setRangeAxis(valueAxis39);
        categoryPlot35.setWeight((int) (short) 10);
        java.awt.Paint paint43 = categoryPlot35.getOutlinePaint();
        categoryPlot20.setDomainGridlinePaint(paint43);
        categoryPlot0.setDomainGridlinePaint(paint43);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNotNull(categoryAxisArray37);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean10 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer(categoryItemRenderer11, true);
        java.lang.String str14 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot0.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot0.getRangeMarkers(layer17);
        java.awt.Paint paint19 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.Plot plot20 = categoryPlot0.getRootPlot();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(plot20);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        java.awt.Image image31 = null;
        categoryPlot0.setBackgroundImage(image31);
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        categoryPlot0.setRangeAxis(0, valueAxis34);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent36 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent36);
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        categoryPlot0.setRangeAxis(0, valueAxis39);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getInsets();
        java.awt.Paint paint12 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot0.getRangeAxisEdge(100);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNotNull(rectangleEdge16);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        boolean boolean10 = categoryPlot0.isRangeCrosshairVisible();
        boolean boolean11 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot9.zoomRangeAxes((-1.0d), plotRenderingInfo12, point2D13, false);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot9.getRangeAxisLocation((int) (byte) 10);
        java.awt.Stroke stroke18 = categoryPlot9.getRangeCrosshairStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot0.zoomRangeAxes((double) (-1), plotRenderingInfo21, point2D22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = categoryPlot0.getRendererForDataset(categoryDataset24);
        org.jfree.chart.LegendItemCollection legendItemCollection26 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNull(legendItemCollection26);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.util.List list4 = categoryPlot0.getCategories();
        categoryPlot0.setAnchorValue((double) 1L, false);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers(layer9);
        categoryPlot0.setBackgroundAlpha((float) ' ');
        categoryPlot0.setRangeCrosshairValue((double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(collection10);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot0.getInsets();
        categoryPlot0.clearDomainMarkers(15);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = categoryPlot0.getInsets();
        java.awt.Font font20 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        java.util.List list8 = categoryPlot0.getAnnotations();
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
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes((double) 1L, plotRenderingInfo15, point2D16, true);
        java.awt.Image image19 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        double double7 = categoryPlot0.getAnchorValue();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isRangeZoomable();
        categoryPlot8.setAnchorValue(100.0d, false);
        float float13 = categoryPlot8.getForegroundAlpha();
        int int14 = categoryPlot8.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis16, false);
        categoryPlot8.setNoDataMessage("");
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = categoryPlot21.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.configureRangeAxes();
        categoryPlot25.clearRangeMarkers();
        boolean boolean28 = categoryPlot25.isOutlineVisible();
        categoryPlot25.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        categoryPlot25.setRenderer(categoryItemRenderer31);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot25.getDomainAxisLocation();
        categoryPlot21.setRangeAxisLocation((int) (short) 0, axisLocation33, false);
        categoryPlot8.setRangeAxisLocation(axisLocation33, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        categoryPlot38.setRangeAxis((int) (byte) 100, valueAxis40);
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        boolean boolean46 = categoryPlot38.render(graphics2D42, rectangle2D43, (int) (byte) 100, plotRenderingInfo45);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer48 = categoryPlot38.getRenderer((int) (short) 10);
        java.awt.Paint paint49 = categoryPlot38.getDomainGridlinePaint();
        categoryPlot8.setRangeCrosshairPaint(paint49);
        categoryPlot0.setRangeGridlinePaint(paint49);
        boolean boolean52 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge53 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(categoryItemRenderer48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(rectangleEdge53);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
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
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot0.setRangeAxis((int) ' ', valueAxis19);
        org.jfree.chart.axis.ValueAxis valueAxis22 = categoryPlot0.getRangeAxis(10);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNull(valueAxis22);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation20 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot0.getDomainAxisForDataset((int) (byte) 100);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(plotOrientation20);
        org.junit.Assert.assertNull(categoryAxis22);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(100, valueAxis8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 100, plotRenderingInfo11, point2D12, false);
        float float15 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot0.setRenderer(categoryItemRenderer16, true);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        java.util.List list9 = categoryPlot0.getCategories();
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getRangeMarkers(1, layer11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        categoryPlot0.notifyListeners(plotChangeEvent13);
        java.awt.Paint paint15 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer9);
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis((int) (byte) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomRangeAxes(10.0d, plotRenderingInfo19, point2D20, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        categoryPlot23.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = categoryPlot23.getDatasetRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = categoryPlot23.getDrawingSupplier();
        org.jfree.chart.axis.AxisSpace axisSpace28 = null;
        categoryPlot23.setFixedRangeAxisSpace(axisSpace28);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        categoryPlot23.setRangeAxis((int) (byte) 100, valueAxis31);
        java.awt.Paint paint33 = categoryPlot23.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot34.configureRangeAxes();
        categoryPlot34.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        categoryPlot34.setDataset(categoryDataset37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = categoryPlot34.getRendererForDataset(categoryDataset39);
        categoryPlot34.clearRangeMarkers((int) 'a');
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray44 = new org.jfree.chart.axis.ValueAxis[] { valueAxis43 };
        categoryPlot34.setRangeAxes(valueAxisArray44);
        categoryPlot23.setRangeAxes(valueAxisArray44);
        categoryPlot0.setRangeAxes(valueAxisArray44);
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        categoryPlot0.setRangeAxis(0, valueAxis49, true);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertNotNull(drawingSupplier27);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(categoryItemRenderer40);
        org.junit.Assert.assertNotNull(valueAxisArray44);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean8 = categoryPlot7.isRangeZoomable();
        categoryPlot7.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot7.getOrientation();
        categoryPlot0.setOrientation(plotOrientation12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot0.drawBackgroundImage(graphics2D14, rectangle2D15);
        categoryPlot0.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        categoryPlot19.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot19.setDataset(categoryDataset22);
        categoryPlot19.setWeight(10);
        java.awt.Paint paint26 = categoryPlot19.getOutlinePaint();
        categoryPlot0.setBackgroundPaint(paint26);
        org.jfree.chart.axis.AxisSpace axisSpace28 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace28);
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleEdge30);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor12 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        categoryPlot14.clearRangeMarkers();
        categoryPlot14.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke20 = categoryPlot14.getRangeGridlineStroke();
        double double21 = categoryPlot14.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        categoryPlot14.drawBackgroundImage(graphics2D22, rectangle2D23);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray26 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer25 };
        categoryPlot14.setRenderers(categoryItemRendererArray26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = categoryPlot14.getDrawingSupplier();
        categoryPlot14.clearDomainMarkers((int) ' ');
        categoryPlot14.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis33 = categoryPlot14.getRangeAxis();
        categoryPlot14.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot14.getRangeAxisLocation(100);
        categoryPlot0.setDomainAxisLocation((int) (short) 100, axisLocation37, true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(categoryAnchor12);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray26);
        org.junit.Assert.assertNotNull(drawingSupplier28);
        org.junit.Assert.assertNull(valueAxis33);
        org.junit.Assert.assertNotNull(axisLocation37);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot0.getRangeAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot0.getDomainAxis((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        boolean boolean15 = categoryPlot0.isDomainZoomable();
        int int16 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToRangeAxis((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        org.jfree.chart.axis.AxisSpace axisSpace37 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = categoryPlot0.getDomainAxisForDataset((int) '4');
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        categoryPlot0.markerChanged(markerChangeEvent40);
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
        org.junit.Assert.assertNull(axisSpace37);
        org.junit.Assert.assertNull(categoryAxis39);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        java.lang.Object obj7 = categoryPlot0.clone();
        float float8 = categoryPlot0.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        categoryPlot0.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(0, marker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getDomainMarkers((int) '4', layer10);
        java.awt.Paint paint12 = categoryPlot0.getNoDataMessagePaint();
        boolean boolean13 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        int int15 = categoryPlot0.getRangeAxisIndex(valueAxis14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        double double15 = categoryPlot0.getAnchorValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        int int17 = categoryPlot0.getIndexOf(categoryItemRenderer16);
        categoryPlot0.setForegroundAlpha(10.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        int int15 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot16.zoomRangeAxes((-1.0d), plotRenderingInfo19, point2D20, false);
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot16.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        categoryPlot16.setRangeAxis((int) (short) 100, valueAxis26, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray31 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis30 };
        categoryPlot29.setDomainAxes(categoryAxisArray31);
        categoryPlot29.configureDomainAxes();
        java.awt.Stroke stroke34 = categoryPlot29.getOutlineStroke();
        categoryPlot16.setRangeCrosshairStroke(stroke34);
        int int36 = categoryPlot16.getBackgroundImageAlignment();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNotNull(categoryAxisArray31);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        categoryPlot0.setRangeCrosshairValue((double) ' ', false);
        categoryPlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot19.zoomRangeAxes((-1.0d), plotRenderingInfo22, point2D23, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor26 = categoryPlot19.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot19.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot19.getAxisOffset();
        boolean boolean30 = categoryPlot19.isDomainZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection31 = categoryPlot19.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection31);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(categoryAnchor26);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(legendItemCollection31);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (short) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        java.util.List list17 = categoryPlot0.getCategoriesForAxis(categoryAxis16);
        categoryPlot0.setAnchorValue(0.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation21 = categoryPlot0.getOrientation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(plotOrientation21);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        int int9 = categoryPlot0.getRangeAxisIndex(valueAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot0.setRangeAxis(0, valueAxis11, true);
        org.jfree.chart.axis.AxisSpace axisSpace14 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(axisSpace14);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 0, (int) ' ');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        org.jfree.chart.axis.AxisSpace axisSpace22 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        categoryPlot0.axisChanged(axisChangeEvent23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNull(axisSpace22);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot18.configureRangeAxes();
        categoryPlot18.clearRangeMarkers();
        categoryPlot18.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke24 = categoryPlot18.getRangeGridlineStroke();
        double double25 = categoryPlot18.getRangeCrosshairValue();
        java.awt.Paint paint26 = categoryPlot18.getBackgroundPaint();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot18.setRangeAxis(valueAxis27);
        boolean boolean29 = categoryPlot18.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot18.getRangeAxisLocation(1);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray34 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis33 };
        categoryPlot32.setDomainAxes(categoryAxisArray34);
        categoryPlot32.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation39 = categoryPlot32.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean41 = categoryPlot40.isRangeZoomable();
        org.jfree.chart.plot.Plot plot42 = categoryPlot40.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation43 = categoryPlot40.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge44 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation39, plotOrientation43);
        org.jfree.chart.util.RectangleEdge rectangleEdge45 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation31, plotOrientation43);
        categoryPlot0.setRangeAxisLocation(axisLocation31);
        categoryPlot0.clearRangeMarkers(0);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNotNull(categoryAxisArray34);
        org.junit.Assert.assertNotNull(axisLocation39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(plot42);
        org.junit.Assert.assertNotNull(plotOrientation43);
        org.junit.Assert.assertNotNull(rectangleEdge44);
        org.junit.Assert.assertNotNull(rectangleEdge45);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        boolean boolean5 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getDomainMarkers((int) '#', layer7);
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray14 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis13 };
        categoryPlot12.setDomainAxes(categoryAxisArray14);
        float float16 = categoryPlot12.getBackgroundAlpha();
        categoryPlot12.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = categoryPlot12.getDomainAxisForDataset((int) '#');
        boolean boolean22 = categoryPlot12.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot12.setRenderer((int) '4', categoryItemRenderer24);
        categoryPlot12.setForegroundAlpha((float) 10);
        java.awt.Stroke stroke28 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot12.setDomainGridlineStroke(stroke28);
        org.jfree.chart.axis.AxisSpace axisSpace30 = null;
        categoryPlot12.setFixedRangeAxisSpace(axisSpace30);
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        java.util.List list33 = categoryPlot12.getCategoriesForAxis(categoryAxis32);
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot12.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(8, axisLocation34);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(axisLocation34);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        boolean boolean22 = categoryPlot0.getDrawSharedDomainAxis();
        categoryPlot0.setWeight(0);
        java.lang.String str25 = categoryPlot0.getPlotType();
        categoryPlot0.mapDatasetToRangeAxis((int) '#', 10);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Category Plot" + "'", str25, "Category Plot");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers(layer9);
        int int11 = categoryPlot0.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(axisLocation12);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation(1);
        java.awt.Paint paint14 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        boolean boolean22 = categoryPlot0.getDrawSharedDomainAxis();
        float float23 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        double double18 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer9, true);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((int) (short) -1, valueAxis13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(valueAxis7);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        java.lang.Class<?> wildcardClass18 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis10, false);
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis16 };
        categoryPlot15.setDomainAxes(categoryAxisArray17);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot15.setRangeAxis(valueAxis19);
        categoryPlot15.setWeight((int) (short) 10);
        java.awt.Paint paint23 = categoryPlot15.getOutlinePaint();
        categoryPlot0.setDomainGridlinePaint(paint23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomRangeAxes((double) 100L, plotRenderingInfo26, point2D27, false);
        java.awt.Stroke stroke30 = categoryPlot0.getRangeCrosshairStroke();
        java.awt.Paint paint31 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.util.Layer layer33 = null;
        java.util.Collection collection34 = categoryPlot0.getRangeMarkers((int) (short) 0, layer33);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(collection34);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D8, rectangle2D9, (int) (byte) 1, plotRenderingInfo11);
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
        org.jfree.chart.util.SortOrder sortOrder24 = categoryPlot13.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        categoryPlot13.removeChangeListener(plotChangeListener25);
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = categoryPlot13.getRangeMarkers(15, layer28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        categoryPlot13.zoomDomainAxes((double) ' ', plotRenderingInfo31, point2D32);
        java.awt.Font font34 = categoryPlot13.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(sortOrder24);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertNotNull(font34);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot16.setRangeAxis((int) (byte) 100, valueAxis18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        boolean boolean24 = categoryPlot16.render(graphics2D20, rectangle2D21, (int) (byte) 100, plotRenderingInfo23);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot16.getRenderer((int) (short) 10);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        categoryPlot16.drawBackgroundImage(graphics2D27, rectangle2D28);
        categoryPlot16.setRangeCrosshairValue((double) 'a', true);
        categoryPlot16.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        int int36 = categoryPlot16.getDomainAxisIndex(categoryAxis35);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        categoryPlot37.setRangeAxis((int) (byte) 100, valueAxis39);
        org.jfree.chart.axis.AxisLocation axisLocation41 = categoryPlot37.getRangeAxisLocation();
        categoryPlot37.setBackgroundAlpha((float) (byte) 1);
        categoryPlot37.clearDomainMarkers(0);
        categoryPlot37.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer47 = null;
        categoryPlot37.setRenderer(categoryItemRenderer47);
        float float49 = categoryPlot37.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot50.configureRangeAxes();
        categoryPlot50.clearRangeMarkers();
        categoryPlot50.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke56 = categoryPlot50.getRangeGridlineStroke();
        double double57 = categoryPlot50.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D58 = null;
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        categoryPlot50.drawBackgroundImage(graphics2D58, rectangle2D59);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer61 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray62 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer61 };
        categoryPlot50.setRenderers(categoryItemRendererArray62);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier64 = categoryPlot50.getDrawingSupplier();
        categoryPlot50.clearDomainMarkers((int) ' ');
        categoryPlot50.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis69 = categoryPlot50.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot70 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot70.configureRangeAxes();
        categoryPlot70.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot73 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis75 = null;
        categoryPlot73.setRangeAxis((int) (byte) 100, valueAxis75);
        org.jfree.chart.axis.AxisLocation axisLocation77 = categoryPlot73.getRangeAxisLocation();
        categoryPlot70.setDomainAxisLocation(axisLocation77);
        categoryPlot70.clearRangeMarkers();
        categoryPlot50.setParent((org.jfree.chart.plot.Plot) categoryPlot70);
        boolean boolean81 = categoryPlot70.isRangeCrosshairLockedOnData();
        java.awt.Stroke stroke82 = categoryPlot70.getDomainGridlineStroke();
        categoryPlot37.setOutlineStroke(stroke82);
        categoryPlot16.setRangeCrosshairStroke(stroke82);
        categoryPlot0.setDomainGridlineStroke(stroke82);
        boolean boolean86 = categoryPlot0.isSubplot();
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(categoryItemRenderer26);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(axisLocation41);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray62);
        org.junit.Assert.assertNotNull(drawingSupplier64);
        org.junit.Assert.assertNull(valueAxis69);
        org.junit.Assert.assertNotNull(axisLocation77);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(stroke82);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot0.getRangeAxisForDataset((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(valueAxis15);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        categoryPlot0.clearRangeMarkers((int) 'a');
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent2 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent2);
        java.awt.Paint paint4 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.configureRangeAxes();
        categoryPlot5.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup8 = categoryPlot5.getDatasetGroup();
        categoryPlot5.setRangeCrosshairVisible(false);
        java.awt.Paint paint11 = categoryPlot5.getRangeGridlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = categoryPlot5.getDrawingSupplier();
        java.awt.Paint paint13 = categoryPlot5.getNoDataMessagePaint();
        categoryPlot0.setDomainGridlinePaint(paint13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        float float6 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier8);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        int int4 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        categoryPlot0.mapDatasetToRangeAxis((int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer9);
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis15);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot13.getRangeAxisLocation();
        categoryPlot13.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot13.setRangeAxis(valueAxis20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot13.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(10, axisLocation22, false);
        categoryPlot0.setRangeGridlinesVisible(true);
        java.awt.Paint paint27 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(0, (int) ' ', plotRenderingInfo30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = categoryPlot0.getRenderer(10);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryItemRenderer3);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray9);
        java.awt.Paint paint11 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot0.getRangeAxisForDataset((int) '#');
        java.awt.Paint paint14 = categoryPlot0.getRangeGridlinePaint();
        int int15 = categoryPlot0.getRangeAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset17 = categoryPlot0.getDataset((int) (short) -1);
        java.lang.Object obj18 = categoryPlot0.clone();
        java.lang.String str19 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        java.awt.Stroke stroke15 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot0.getRenderer();
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
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(categoryItemRenderer16);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        boolean boolean7 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot0.markerChanged(markerChangeEvent8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        categoryPlot0.setNoDataMessage("");
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = categoryPlot13.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.configureRangeAxes();
        categoryPlot17.clearRangeMarkers();
        boolean boolean20 = categoryPlot17.isOutlineVisible();
        categoryPlot17.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        categoryPlot17.setRenderer(categoryItemRenderer23);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot17.getDomainAxisLocation();
        categoryPlot13.setRangeAxisLocation((int) (short) 0, axisLocation25, false);
        categoryPlot0.setRangeAxisLocation(axisLocation25, false);
        org.jfree.chart.plot.Marker marker31 = null;
        org.jfree.chart.util.Layer layer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) -1, marker31, layer32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(axisLocation25);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        java.awt.Font font9 = categoryPlot0.getNoDataMessageFont();
        float float10 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        categoryPlot0.axisChanged(axisChangeEvent11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot13.zoomRangeAxes((-1.0d), plotRenderingInfo16, point2D17, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor20 = categoryPlot13.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot13.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = categoryPlot13.getAxisOffset();
        boolean boolean24 = categoryPlot13.isDomainZoomable();
        categoryPlot13.setBackgroundImageAlignment(1);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot13.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation27, false);
        boolean boolean30 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAnchor20);
        org.junit.Assert.assertNotNull(rectangleEdge22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        java.awt.Image image20 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = categoryPlot0.getAxisOffset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        categoryPlot0.notifyListeners(plotChangeEvent22);
        org.jfree.chart.plot.Plot plot24 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(plot24);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        int int5 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        java.awt.Font font22 = categoryPlot0.getNoDataMessageFont();
        java.lang.String str23 = categoryPlot0.getNoDataMessage();
        categoryPlot0.clearRangeMarkers(1);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent26 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent26);
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        float float8 = categoryPlot0.getBackgroundAlpha();
        java.lang.Object obj9 = categoryPlot0.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 1, (double) (short) 10, plotRenderingInfo12, point2D13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot0.getDrawingSupplier();
        boolean boolean16 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        java.awt.Stroke stroke12 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        boolean boolean8 = categoryPlot0.isSubplot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot0.setRenderer(categoryItemRenderer9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer9);
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis15);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot13.getRangeAxisLocation();
        categoryPlot13.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot13.setRangeAxis(valueAxis20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot13.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(10, axisLocation22, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean26 = categoryPlot25.isRangeZoomable();
        categoryPlot25.setAnchorValue(100.0d, false);
        float float30 = categoryPlot25.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder31 = categoryPlot25.getRowRenderingOrder();
        boolean boolean32 = categoryPlot25.isRangeCrosshairLockedOnData();
        boolean boolean33 = categoryPlot0.equals((java.lang.Object) boolean32);
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        categoryPlot0.setRangeAxis(valueAxis34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        int int10 = categoryPlot0.getIndexOf(categoryItemRenderer9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot0.setRangeAxis(valueAxis11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent13);
        java.awt.Paint paint15 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Paint paint8 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot0.getRendererForDataset(categoryDataset11);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryItemRenderer12);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) '4', plotRenderingInfo11, point2D12, false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot0.setRenderer(categoryItemRenderer14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        categoryPlot16.clearRangeMarkers();
        categoryPlot16.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke22 = categoryPlot16.getRangeGridlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke22);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        categoryPlot12.setRangeAxis((int) (byte) 100, valueAxis14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        boolean boolean20 = categoryPlot12.render(graphics2D16, rectangle2D17, (int) (byte) 100, plotRenderingInfo19);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot12.getRenderer((int) (short) 10);
        java.awt.Stroke stroke23 = categoryPlot12.getDomainGridlineStroke();
        java.awt.Stroke stroke24 = categoryPlot12.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = categoryPlot12.getFixedLegendItems();
        java.awt.Paint paint26 = categoryPlot12.getRangeGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot27.configureRangeAxes();
        categoryPlot27.clearRangeMarkers();
        boolean boolean30 = categoryPlot27.isOutlineVisible();
        categoryPlot27.setRangeGridlinesVisible(false);
        categoryPlot27.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot35.configureRangeAxes();
        categoryPlot35.clearRangeMarkers();
        categoryPlot35.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke41 = categoryPlot35.getRangeGridlineStroke();
        double double42 = categoryPlot35.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        categoryPlot35.drawBackgroundImage(graphics2D43, rectangle2D44);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray47 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer46 };
        categoryPlot35.setRenderers(categoryItemRendererArray47);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier49 = categoryPlot35.getDrawingSupplier();
        categoryPlot27.setDrawingSupplier(drawingSupplier49);
        categoryPlot12.setDrawingSupplier(drawingSupplier49);
        categoryPlot0.setDrawingSupplier(drawingSupplier49);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(legendItemCollection25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray47);
        org.junit.Assert.assertNotNull(drawingSupplier49);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot0.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        categoryPlot0.setDomainAxis(categoryAxis26);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(categoryDataset25);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo6, point2D7, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        categoryPlot10.clearDomainMarkers();
        categoryPlot10.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot10.setNoDataMessagePaint(paint15);
        java.awt.Image image17 = categoryPlot10.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot10.zoomDomainAxes((double) 0.0f, plotRenderingInfo19, point2D20);
        categoryPlot10.mapDatasetToDomainAxis((int) '4', (int) '4');
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot25.setRangeAxis((int) (byte) 100, valueAxis27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        boolean boolean33 = categoryPlot25.render(graphics2D29, rectangle2D30, (int) (byte) 100, plotRenderingInfo32);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = categoryPlot25.getRenderer((int) (short) 10);
        java.awt.Stroke stroke36 = categoryPlot25.getDomainGridlineStroke();
        java.awt.Stroke stroke37 = categoryPlot25.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection38 = categoryPlot25.getFixedLegendItems();
        java.awt.Paint paint39 = categoryPlot25.getRangeGridlinePaint();
        categoryPlot10.setOutlinePaint(paint39);
        categoryPlot10.setDomainGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset43 = categoryPlot10.getDataset();
        java.awt.Paint paint44 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot0.setRangeGridlinePaint(paint44);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(categoryItemRenderer35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNull(legendItemCollection38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(categoryDataset43);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.Plot plot11 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getDomainMarkers((int) (byte) -1, layer15);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        categoryPlot0.axisChanged(axisChangeEvent17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo7, point2D8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        java.util.List list11 = categoryPlot0.getCategoriesForAxis(categoryAxis10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) '#', plotRenderingInfo8, point2D9, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis14 };
        categoryPlot13.setDomainAxes(categoryAxisArray15);
        categoryPlot13.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot13.getDomainAxisLocation(100);
        categoryPlot0.setRangeAxisLocation((int) 'a', axisLocation20);
        boolean boolean22 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 0, (int) ' ');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(legendItemCollection22);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        categoryPlot0.notifyListeners(plotChangeEvent14);
        double double16 = categoryPlot0.getAnchorValue();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = categoryPlot0.getFixedLegendItems();
        java.awt.Font font18 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(legendItemCollection17);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot0.getDomainAxis((int) (short) 0);
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation(1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot7.setRangeAxis((int) (byte) 100, valueAxis9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        boolean boolean15 = categoryPlot7.render(graphics2D11, rectangle2D12, (int) (byte) 100, plotRenderingInfo14);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot7.setRangeAxis((int) (short) 0, valueAxis17);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot7.getDomainAxisEdge(15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = categoryPlot7.getDrawingSupplier();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.configureRangeAxes();
        categoryPlot22.clearRangeMarkers();
        categoryPlot22.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke28 = categoryPlot22.getRangeGridlineStroke();
        double double29 = categoryPlot22.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        categoryPlot22.drawBackgroundImage(graphics2D30, rectangle2D31);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot22.getRangeAxisEdge();
        categoryPlot22.clearDomainMarkers((int) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation36 = categoryPlot22.getOrientation();
        categoryPlot7.setOrientation(plotOrientation36);
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation6, plotOrientation36);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(plotOrientation36);
        org.junit.Assert.assertNotNull(rectangleEdge38);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(axisLocation6);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        categoryPlot0.setRangeCrosshairValue((double) ' ', false);
        categoryPlot0.setAnchorValue((double) ' ', false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray23 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis22 };
        categoryPlot21.setDomainAxes(categoryAxisArray23);
        java.awt.Stroke stroke25 = categoryPlot21.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = categoryPlot21.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        int int29 = categoryPlot21.getDomainAxisIndex(categoryAxis28);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot21.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot32.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot32.zoomRangeAxes((-1.0d), plotRenderingInfo35, point2D36, false);
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot32.getRangeAxisLocation((int) (byte) 10);
        categoryPlot21.setDomainAxisLocation((int) (byte) 0, axisLocation40);
        categoryPlot0.setDomainAxisLocation(15, axisLocation40, false);
        org.jfree.chart.axis.ValueAxis valueAxis44 = categoryPlot0.getRangeAxis();
        categoryPlot0.setWeight((int) (short) 0);
        int int47 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(categoryAxisArray23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(legendItemCollection26);
        org.junit.Assert.assertNull(categoryItemRenderer27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertNull(valueAxis44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        categoryPlot20.setRangeCrosshairValue((double) (-1));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = categoryPlot20.getRenderer();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNull(categoryItemRenderer33);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot0.getInsets();
        categoryPlot0.clearDomainMarkers(15);
        categoryPlot0.setRangeCrosshairValue((double) (-1L), false);
        boolean boolean22 = categoryPlot0.isRangeGridlinesVisible();
        float float23 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer9);
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis15);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot13.getRangeAxisLocation();
        categoryPlot13.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot13.setRangeAxis(valueAxis20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot13.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(10, axisLocation22, false);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        categoryPlot0.setDomainAxis(8, categoryAxis28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        categoryPlot20.clearDomainMarkers();
        categoryPlot20.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot20.setNoDataMessagePaint(paint25);
        java.awt.Image image27 = categoryPlot20.getBackgroundImage();
        java.awt.Image image28 = categoryPlot20.getBackgroundImage();
        java.awt.Paint paint29 = categoryPlot20.getNoDataMessagePaint();
        categoryPlot0.setRangeCrosshairPaint(paint29);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(image27);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        java.lang.Object obj14 = categoryPlot0.clone();
        categoryPlot0.setWeight((int) '4');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot0.zoomRangeAxes((double) 0.0f, plotRenderingInfo18, point2D19);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis((int) (byte) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomRangeAxes(10.0d, plotRenderingInfo19, point2D20, true);
        org.jfree.chart.axis.AxisSpace axisSpace23 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNull(axisSpace23);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot0.getRangeAxisLocation(15);
        org.jfree.chart.axis.ValueAxis valueAxis32 = categoryPlot0.getRangeAxis(100);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder33 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNull(valueAxis32);
        org.junit.Assert.assertNotNull(datasetRenderingOrder33);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        java.awt.Paint paint8 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomDomainAxes(1.0d, plotRenderingInfo10, point2D11);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = categoryPlot0.removeAnnotation(categoryAnnotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        java.lang.String str6 = categoryPlot0.getPlotType();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getDomainMarkers((int) (short) 1, layer8);
        categoryPlot0.mapDatasetToDomainAxis((int) ' ', (int) ' ');
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxisForDataset((int) ' ');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Category Plot" + "'", str6, "Category Plot");
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        float float11 = categoryPlot0.getForegroundAlpha();
        float float12 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(10, categoryItemRenderer15, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) 'a', (int) ' ', plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        categoryPlot0.configureRangeAxes();
        int int13 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.isRangeGridlinesVisible();
        categoryPlot0.clearDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        org.jfree.chart.util.SortOrder sortOrder35 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray31);
        org.junit.Assert.assertNotNull(drawingSupplier33);
        org.junit.Assert.assertNotNull(sortOrder35);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray14 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis13 };
        categoryPlot12.setDomainAxes(categoryAxisArray14);
        categoryPlot12.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot12.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        categoryPlot20.setRangeAxis((int) (byte) 100, valueAxis22);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = categoryPlot20.getDomainMarkers((int) (byte) 10, layer25);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean28 = categoryPlot27.isRangeZoomable();
        categoryPlot27.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation32 = categoryPlot27.getOrientation();
        categoryPlot20.setOrientation(plotOrientation32);
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation19, plotOrientation32);
        categoryPlot0.setDomainAxisLocation(axisLocation19, false);
        org.jfree.chart.axis.AxisSpace axisSpace37 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace37);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(plotOrientation32);
        org.junit.Assert.assertNotNull(rectangleEdge34);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        categoryPlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getInsets();
        int int12 = categoryPlot0.getBackgroundImageAlignment();
        java.util.List list13 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNull(list13);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        categoryPlot0.zoomDomainAxes((-1.0d), plotRenderingInfo33, point2D34);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        categoryPlot0.axisChanged(axisChangeEvent23);
        boolean boolean25 = categoryPlot0.isDomainGridlinesVisible();
        java.awt.Paint paint26 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((-1), valueAxis28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent14 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent14);
        int int16 = categoryPlot0.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot0.getRangeAxisLocation(0);
        categoryPlot0.setDomainGridlinesVisible(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot0.getFixedLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset20);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertNull(legendItemCollection18);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        java.awt.Paint paint35 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge36 = categoryPlot0.getDomainAxisEdge();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset38);
        java.lang.Class<?> wildcardClass40 = categoryPlot0.getClass();
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
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(rectangleEdge36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(0, layer10);
        int int12 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getRangeMarkers(layer13);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(collection14);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        java.awt.Stroke stroke6 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        categoryPlot0.axisChanged(axisChangeEvent13);
        org.jfree.chart.plot.Marker marker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        java.lang.String str5 = categoryPlot0.getPlotType();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset9);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getRangeMarkers(layer11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRendererForDataset(categoryDataset13);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Category Plot" + "'", str5, "Category Plot");
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(categoryItemRenderer14);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor5 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxis();
        float float7 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis10);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot8.getDomainMarkers((int) (byte) 10, layer13);
        org.jfree.chart.axis.AxisSpace axisSpace15 = null;
        categoryPlot8.setFixedRangeAxisSpace(axisSpace15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot8.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo19, point2D20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = categoryPlot8.getDataset();
        categoryPlot8.setRangeGridlinesVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot8.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray28 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis27 };
        categoryPlot26.setDomainAxes(categoryAxisArray28);
        categoryPlot26.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot26.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean35 = categoryPlot34.isRangeZoomable();
        org.jfree.chart.plot.Plot plot36 = categoryPlot34.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation37 = categoryPlot34.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation33, plotOrientation37);
        categoryPlot8.setOrientation(plotOrientation37);
        categoryPlot0.setOrientation(plotOrientation37);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(categoryAnchor5);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(categoryAxisArray28);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(plot36);
        org.junit.Assert.assertNotNull(plotOrientation37);
        org.junit.Assert.assertNotNull(rectangleEdge38);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        double double15 = categoryPlot0.getAnchorValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        int int17 = categoryPlot0.getIndexOf(categoryItemRenderer16);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot0.setRangeAxis(0, valueAxis20);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection18);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot0.getDomainAxisLocation();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertNotNull(drawingSupplier27);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        categoryPlot0.setBackgroundImageAlignment(100);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        categoryPlot0.drawBackgroundImage(graphics2D28, rectangle2D29);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis((int) (short) 1, categoryAxis17, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = categoryPlot0.getInsets();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        categoryPlot0.setBackgroundImageAlignment(8);
        categoryPlot0.clearDomainMarkers((int) (short) 10);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryAnchor16);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(0);
        java.awt.Paint paint10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot0.setRangeGridlinePaint(paint10);
        java.awt.Paint paint12 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = categoryPlot0.removeAnnotation(categoryAnnotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis3 = categoryPlot0.getRangeAxis((int) (short) 10);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(valueAxis3);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge(0);
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        categoryPlot20.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = categoryPlot20.getDomainAxis((int) (byte) -1);
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        categoryPlot20.drawBackgroundImage(graphics2D37, rectangle2D38);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNull(categoryAxis36);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        org.jfree.data.general.DatasetGroup datasetGroup22 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean24 = categoryPlot23.isRangeZoomable();
        categoryPlot23.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder28 = categoryPlot23.getDatasetRenderingOrder();
        int int29 = categoryPlot23.getDatasetCount();
        java.util.List list30 = categoryPlot23.getCategories();
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot23.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation31);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(list30);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset();
        java.awt.Stroke stroke9 = categoryPlot0.getOutlineStroke();
        java.lang.String str10 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Category Plot" + "'", str10, "Category Plot");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        categoryPlot0.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot0.setRenderer(categoryItemRenderer22);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent26 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent26);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        categoryPlot0.notifyListeners(plotChangeEvent14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot16.setRangeAxis((int) (byte) 100, valueAxis18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        boolean boolean24 = categoryPlot16.render(graphics2D20, rectangle2D21, (int) (byte) 100, plotRenderingInfo23);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot16.getRenderer((int) (short) 10);
        java.awt.Stroke stroke27 = categoryPlot16.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = categoryPlot16.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        categoryPlot16.zoomRangeAxes((double) (byte) 1, (double) '#', plotRenderingInfo31, point2D32);
        categoryPlot16.setWeight(15);
        categoryPlot16.clearAnnotations();
        boolean boolean37 = categoryPlot16.isRangeCrosshairVisible();
        java.awt.Font font38 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot16.setNoDataMessageFont(font38);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = categoryPlot16.getAxisOffset();
        categoryPlot0.setAxisOffset(rectangleInsets40);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(categoryItemRenderer26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(rectangleInsets40);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis10, false);
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace13);
        categoryPlot0.setRangeCrosshairValue((double) 'a', false);
        boolean boolean18 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis20 = categoryPlot0.getRangeAxisForDataset((int) 'a');
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(valueAxis20);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        java.lang.String str28 = categoryPlot0.getNoDataMessage();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categoryDataset27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((-1));
        java.awt.Stroke stroke7 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder11 = categoryPlot8.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot8.zoomRangeAxes((double) 0L, plotRenderingInfo13, point2D14);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray16 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot8.setDomainAxes(categoryAxisArray16);
        categoryPlot0.setDomainAxes(categoryAxisArray16);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot19.setRangeAxis((int) (byte) 100, valueAxis21);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot19.getDomainMarkers((int) (byte) 10, layer24);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean27 = categoryPlot26.isRangeZoomable();
        categoryPlot26.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation31 = categoryPlot26.getOrientation();
        categoryPlot19.setOrientation(plotOrientation31);
        boolean boolean33 = categoryPlot19.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray36 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis35 };
        categoryPlot34.setDomainAxes(categoryAxisArray36);
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        categoryPlot34.setRangeAxis(valueAxis38);
        categoryPlot34.setWeight((int) (short) 10);
        java.awt.Paint paint42 = categoryPlot34.getOutlinePaint();
        categoryPlot19.setOutlinePaint(paint42);
        boolean boolean44 = categoryPlot0.equals((java.lang.Object) categoryPlot19);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer46 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot19.setRenderer((-1), categoryItemRenderer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(plotOrientation31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray36);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        boolean boolean23 = categoryPlot0.render(graphics2D19, rectangle2D20, 10, plotRenderingInfo22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis((int) (byte) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomRangeAxes(10.0d, plotRenderingInfo19, point2D20, true);
        java.awt.Stroke stroke23 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setDomainGridlineStroke(stroke23);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        boolean boolean18 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean20 = categoryPlot19.isRangeZoomable();
        categoryPlot19.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        java.util.List list24 = categoryPlot19.getCategoriesForAxis(categoryAxis23);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot25.setRangeAxis((int) (byte) 100, valueAxis27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        boolean boolean33 = categoryPlot25.render(graphics2D29, rectangle2D30, (int) (byte) 100, plotRenderingInfo32);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = categoryPlot25.getRenderer((int) (short) 10);
        java.awt.Stroke stroke36 = categoryPlot25.getDomainGridlineStroke();
        categoryPlot19.setOutlineStroke(stroke36);
        categoryPlot0.setRangeCrosshairStroke(stroke36);
        org.jfree.chart.axis.ValueAxis valueAxis39 = categoryPlot0.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = categoryPlot0.getRendererForDataset(categoryDataset40);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(categoryItemRenderer35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertNull(categoryItemRenderer41);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        java.awt.Font font22 = categoryPlot0.getNoDataMessageFont();
        java.awt.Image image23 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        categoryPlot0.setRangeCrosshairValue((double) ' ', false);
        categoryPlot0.setNoDataMessage("Category Plot");
        categoryPlot0.setRangeGridlinesVisible(true);
        boolean boolean21 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot0.getDomainAxisLocation();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer11);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getDomainMarkers(layer13);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getDomainAxisLocation();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(axisSpace9);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo7, point2D8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) 0.5f, plotRenderingInfo11, point2D12);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot0.getDomainAxis();
        categoryPlot0.clearDomainMarkers(8);
        org.junit.Assert.assertNull(categoryAxis14);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent7);
        java.lang.Object obj9 = categoryPlot0.clone();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 0, valueAxis10);
        java.awt.Paint paint12 = categoryPlot0.getRangeCrosshairPaint();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        boolean boolean17 = categoryPlot0.render(graphics2D13, rectangle2D14, (int) (short) 0, plotRenderingInfo16);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot0.getDomainAxis((int) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        int int21 = categoryPlot0.getIndexOf(categoryItemRenderer20);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairValue((double) 100L, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomRangeAxes(100.0d, plotRenderingInfo8, point2D9, false);
        int int12 = categoryPlot0.getBackgroundImageAlignment();
        int int13 = categoryPlot0.getWeight();
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray19 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis18 };
        categoryPlot17.setDomainAxes(categoryAxisArray19);
        float float21 = categoryPlot17.getBackgroundAlpha();
        categoryPlot17.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = categoryPlot17.getDomainAxisForDataset((int) '#');
        boolean boolean27 = categoryPlot17.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation29 = categoryPlot17.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray30 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot17.setRangeAxes(valueAxisArray30);
        categoryPlot5.setRangeAxes(valueAxisArray30);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(valueAxisArray30);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        boolean boolean8 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer((int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.configureRangeAxes();
        categoryPlot12.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup15 = categoryPlot12.getDatasetGroup();
        categoryPlot12.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot12.getDomainAxisEdge((int) (byte) 0);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder20 = categoryPlot12.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(datasetRenderingOrder20);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        java.awt.Paint paint2 = categoryPlot0.getBackgroundPaint();
        double double3 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        java.awt.Font font14 = categoryPlot0.getNoDataMessageFont();
        int int15 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        categoryPlot22.zoomRangeAxes((-1.0d), plotRenderingInfo25, point2D26, false);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        categoryPlot22.setRangeAxis(valueAxis29);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray31 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot22.setRenderers(categoryItemRendererArray31);
        categoryPlot0.setRenderers(categoryItemRendererArray31);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        int int36 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(categoryItemRendererArray31);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(categoryAxis13);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        java.awt.Font font9 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.data.Range range15 = categoryPlot0.getDataRange(valueAxis14);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertNull(range15);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes((double) 0.0f, plotRenderingInfo15, point2D16, false);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D19, rectangle2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        categoryPlot0.clearRangeMarkers((int) (short) 0);
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot0.setRenderer(categoryItemRenderer16);
        org.jfree.chart.plot.CategoryMarker categoryMarker18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo5, point2D6, true);
        java.awt.Font font9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font9);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(sortOrder11);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        int int22 = categoryPlot0.getRangeAxisIndex(valueAxis21);
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = categoryPlot0.getRangeMarkers(layer23);
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = categoryPlot0.getOrientation();
        double double26 = categoryPlot0.getAnchorValue();
        java.awt.Image image27 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertNotNull(plotOrientation25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertNull(image27);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer10, true);
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer9);
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis15);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot13.getRangeAxisLocation();
        categoryPlot13.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot13.setRangeAxis(valueAxis20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot13.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(10, axisLocation22, false);
        categoryPlot0.setAnchorValue((double) 0.5f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        int int9 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 1, categoryAxis11, true);
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (short) 10, categoryMarker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getRangeMarkers((int) (short) 100, layer13);
        int int15 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(categoryAxis5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = categoryPlot0.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) 10, plotRenderingInfo8, point2D9, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean13 = categoryPlot12.isRangeZoomable();
        org.jfree.chart.plot.Plot plot14 = categoryPlot12.getParent();
        categoryPlot12.configureDomainAxes();
        java.util.List list16 = categoryPlot12.getCategories();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder22 = categoryPlot17.getDatasetRenderingOrder();
        categoryPlot12.setDatasetRenderingOrder(datasetRenderingOrder22);
        java.awt.Paint paint24 = categoryPlot12.getOutlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder22);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        categoryPlot0.notifyListeners(plotChangeEvent7);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer10, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot0.setRenderer(categoryItemRenderer13);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        float float16 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer((int) (byte) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearRangeMarkers();
        categoryPlot15.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke21 = categoryPlot15.getRangeGridlineStroke();
        double double22 = categoryPlot15.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        categoryPlot15.drawBackgroundImage(graphics2D23, rectangle2D24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray27 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer26 };
        categoryPlot15.setRenderers(categoryItemRendererArray27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = categoryPlot15.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier29);
        org.jfree.chart.LegendItemCollection legendItemCollection31 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray27);
        org.junit.Assert.assertNotNull(drawingSupplier29);
        org.junit.Assert.assertNull(legendItemCollection31);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        int int19 = categoryPlot0.getDomainAxisCount();
        java.util.List list20 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot0.setRenderer(categoryItemRenderer21, true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot0.setDomainAxis((int) ' ', categoryAxis18, false);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace21);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((int) (byte) -1, categoryAxis24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(categoryAnchor15);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot9.zoomRangeAxes((-1.0d), plotRenderingInfo12, point2D13, false);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot9.getRangeAxisLocation((int) (byte) 10);
        java.awt.Stroke stroke18 = categoryPlot9.getRangeCrosshairStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot9);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot9.setDomainAxis((int) (byte) 100, categoryAxis21);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
        org.jfree.chart.plot.Plot plot22 = categoryPlot0.getParent();
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot0.getDomainAxisLocation((int) (short) 10);
        double double25 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis27 = categoryPlot0.getRangeAxisForDataset((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(plot22);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNull(valueAxis27);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot6.setRangeAxis((int) (byte) 100, valueAxis8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        boolean boolean14 = categoryPlot6.render(graphics2D10, rectangle2D11, (int) (byte) 100, plotRenderingInfo13);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot6.getRenderer((int) (short) 10);
        java.awt.Stroke stroke17 = categoryPlot6.getDomainGridlineStroke();
        categoryPlot0.setOutlineStroke(stroke17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        boolean boolean23 = categoryPlot0.render(graphics2D19, rectangle2D20, 10, plotRenderingInfo22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 1, plotRenderingInfo9, point2D10);
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 100, (int) '#');
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(legendItemCollection7);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        java.util.List list7 = categoryPlot0.getCategories();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        categoryPlot0.removeChangeListener(plotChangeListener8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes(0.0d, plotRenderingInfo11, point2D12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        java.lang.String str6 = categoryPlot0.getPlotType();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Category Plot" + "'", str6, "Category Plot");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor12 = categoryPlot0.getDomainGridlinePosition();
        java.lang.String str13 = categoryPlot0.getPlotType();
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot0.getRangeAxis((int) (byte) 100);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(categoryAnchor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Category Plot" + "'", str13, "Category Plot");
        org.junit.Assert.assertNull(valueAxis15);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        double double15 = categoryPlot0.getAnchorValue();
        categoryPlot0.setNoDataMessage("");
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
        org.jfree.chart.LegendItemCollection legendItemCollection32 = categoryPlot18.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray30);
        org.junit.Assert.assertNotNull(legendItemCollection32);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxisForDataset((-1));
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        categoryPlot0.clearDomainMarkers(0);
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getDomainAxisLocation(0);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        categoryPlot0.setRenderer(categoryItemRenderer6, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

