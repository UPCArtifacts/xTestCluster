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
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        xYPlot4.clearRangeMarkers();
        java.awt.Paint paint7 = xYPlot4.getRangeGridlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = xYPlot4.getLegendItems();
        xYPlot4.setDomainCrosshairLockedOnData(false);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) '#', xYDataset12);
        java.awt.geom.Point2D point2D14 = xYPlot4.getQuadrantOrigin();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder15 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addRangeMarker((int) ' ', marker17, layer18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNotNull(point2D14);
        org.junit.Assert.assertNotNull(seriesRenderingOrder15);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot4.getDomainAxisForDataset((int) (byte) 100);
        java.awt.Stroke stroke7 = categoryPlot4.getDomainGridlineStroke();
        java.awt.Paint paint8 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot4.setRangeCrosshairPaint(paint8);
        categoryPlot4.clearRangeMarkers();
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis((int) (short) 1, categoryAxis6);
        categoryPlot4.mapDatasetToRangeAxis((int) (short) 10, (int) '4');
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = categoryPlot4.getDrawingSupplier();
        java.awt.Paint paint12 = categoryPlot4.getDomainGridlinePaint();
        boolean boolean13 = categoryPlot4.isOutlineVisible();
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.axis.AxisLocation axisLocation7 = null;
        xYPlot4.setDomainAxisLocation((int) (byte) 10, axisLocation7);
        float float9 = xYPlot4.getForegroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        java.awt.Stroke stroke15 = xYPlot14.getRangeCrosshairStroke();
        java.lang.Object obj16 = xYPlot14.clone();
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = xYPlot14.getDomainMarkers((int) (short) 100, layer18);
        java.awt.Paint paint20 = xYPlot14.getDomainZeroBaselinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis23, categoryItemRenderer24);
        java.awt.Stroke stroke26 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot25.setRangeCrosshairStroke(stroke26);
        org.jfree.chart.axis.ValueAxis valueAxis28 = categoryPlot25.getRangeAxis();
        boolean boolean29 = categoryPlot25.getDrawSharedDomainAxis();
        java.awt.Stroke stroke30 = categoryPlot25.getRangeCrosshairStroke();
        xYPlot14.setDomainCrosshairStroke(stroke30);
        xYPlot4.setRangeZeroBaselineStroke(stroke30);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(collection19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = xYPlot4.getRangeAxisEdge();
        java.awt.Stroke stroke6 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        xYPlot4.setRangeAxis(valueAxis7);
        xYPlot4.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot14.getInsets();
        boolean boolean16 = categoryPlot14.isRangeCrosshairVisible();
        java.awt.Paint paint17 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot14.setNoDataMessagePaint(paint17);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot14.getDomainAxis();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        categoryPlot14.addChangeListener(plotChangeListener20);
        int int22 = categoryPlot14.getDomainAxisCount();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        categoryPlot14.datasetChanged(datasetChangeEvent23);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot14.setRenderer(10, categoryItemRenderer26);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot14.getDomainAxisLocation();
        xYPlot4.setRangeAxisLocation(axisLocation28);
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(axisLocation28);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot4.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot4.zoomRangeAxes((double) (short) 100, (double) (byte) 1, plotRenderingInfo8, point2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot4.setRenderers(categoryItemRendererArray12);
        categoryPlot4.clearDomainAxes();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot4.getRangeAxisLocation((int) (byte) 100);
        categoryPlot4.mapDatasetToRangeAxis(100, (int) ' ');
        categoryPlot4.setRangeCrosshairVisible(false);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.lang.String str5 = xYPlot4.getPlotType();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        xYPlot4.setDomainAxis(100, valueAxis7, false);
        xYPlot4.clearAnnotations();
        org.jfree.data.xy.XYDataset xYDataset12 = xYPlot4.getDataset(0);
        int int13 = xYPlot4.getRangeAxisCount();
        xYPlot4.setDomainGridlinesVisible(true);
        boolean boolean16 = xYPlot4.isDomainZeroBaselineVisible();
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "XY Plot" + "'", str5, "XY Plot");
        org.junit.Assert.assertNull(xYDataset12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        xYPlot4.setDomainCrosshairValue((double) (byte) 10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = null;
        xYPlot4.setRenderer(10, xYItemRenderer8);
        boolean boolean10 = xYPlot4.isRangeCrosshairVisible();
        xYPlot4.clearAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis14, valueAxis15, categoryItemRenderer16);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot17.getDomainAxisLocation((int) (short) 0);
        boolean boolean20 = categoryPlot17.isSubplot();
        double double21 = categoryPlot17.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        categoryPlot17.setRangeAxis(valueAxis22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        categoryPlot17.setFixedRangeAxisSpace(axisSpace24);
        org.jfree.data.xy.XYDataset xYDataset26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot(xYDataset26, valueAxis27, valueAxis28, xYItemRenderer29);
        java.lang.String str31 = xYPlot30.getPlotType();
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        xYPlot30.setDomainAxis(100, valueAxis33, false);
        boolean boolean36 = xYPlot30.isOutlineVisible();
        java.awt.Paint paint37 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        xYPlot30.setBackgroundPaint(paint37);
        categoryPlot17.setRangeCrosshairPaint(paint37);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setQuadrantPaint((-1), paint37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (-1) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "XY Plot" + "'", str31, "XY Plot");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        xYPlot4.clearRangeMarkers();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        xYPlot4.datasetChanged(datasetChangeEvent7);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = xYPlot4.getRangeMarkers((-1), layer10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        xYPlot4.notifyListeners(plotChangeEvent12);
        int int14 = xYPlot4.getSeriesCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = xYPlot4.getRenderer((int) (byte) -1);
        int int17 = xYPlot4.getWeight();
        boolean boolean18 = xYPlot4.isRangeCrosshairVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(xYItemRenderer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot4.getDataset((int) (byte) 10);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.isRangeZoomable();
        boolean boolean6 = categoryPlot4.isDomainZoomable();
        categoryPlot4.clearRangeAxes();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot4.render(graphics2D8, rectangle2D9, (int) (short) 10, plotRenderingInfo11);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot4.setRenderer((int) '4', categoryItemRenderer14, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        categoryPlot4.setFixedRangeAxisSpace(axisSpace19);
        int int21 = categoryPlot4.getWeight();
        org.jfree.data.category.CategoryDataset categoryDataset22 = categoryPlot4.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot28.getInsets();
        boolean boolean30 = categoryPlot28.isRangeCrosshairVisible();
        java.awt.Paint paint31 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot28.setNoDataMessagePaint(paint31);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = categoryPlot28.getDomainAxis();
        java.util.List list34 = categoryPlot28.getCategories();
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = categoryPlot28.getDomainAxisForDataset((-1));
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset37, categoryAxis38, valueAxis39, categoryItemRenderer40);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        categoryPlot41.markerChanged(markerChangeEvent42);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        categoryPlot41.setRenderer(0, categoryItemRenderer45);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer50 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot(categoryDataset47, categoryAxis48, valueAxis49, categoryItemRenderer50);
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = categoryPlot51.getInsets();
        categoryPlot51.setAnchorValue((double) (-1.0f));
        java.awt.Stroke stroke55 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot51.setRangeCrosshairStroke(stroke55);
        categoryPlot41.setRangeCrosshairStroke(stroke55);
        categoryPlot28.setRangeGridlineStroke(stroke55);
        org.jfree.data.xy.XYDataset xYDataset59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer62 = null;
        org.jfree.chart.plot.XYPlot xYPlot63 = new org.jfree.chart.plot.XYPlot(xYDataset59, valueAxis60, valueAxis61, xYItemRenderer62);
        java.awt.Stroke stroke64 = xYPlot63.getRangeCrosshairStroke();
        boolean boolean65 = xYPlot63.isRangeZoomable();
        java.awt.Paint paint66 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        xYPlot63.setOutlinePaint(paint66);
        xYPlot63.zoom((double) 10L);
        java.awt.Paint paint70 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot63.setNoDataMessagePaint(paint70);
        xYPlot63.clearDomainMarkers((-1));
        org.jfree.data.xy.XYDataset xYDataset74 = null;
        org.jfree.chart.axis.ValueAxis valueAxis75 = null;
        org.jfree.chart.axis.ValueAxis valueAxis76 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer77 = null;
        org.jfree.chart.plot.XYPlot xYPlot78 = new org.jfree.chart.plot.XYPlot(xYDataset74, valueAxis75, valueAxis76, xYItemRenderer77);
        boolean boolean79 = xYPlot78.isDomainGridlinesVisible();
        java.awt.Graphics2D graphics2D80 = null;
        java.awt.geom.Rectangle2D rectangle2D81 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo83 = null;
        org.jfree.chart.plot.CrosshairState crosshairState84 = null;
        boolean boolean85 = xYPlot78.render(graphics2D80, rectangle2D81, 1, plotRenderingInfo83, crosshairState84);
        java.awt.Paint paint86 = xYPlot78.getRangeGridlinePaint();
        xYPlot63.setRangeTickBandPaint(paint86);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer88 = xYPlot63.getRenderer();
        org.jfree.chart.axis.AxisLocation axisLocation89 = xYPlot63.getDomainAxisLocation();
        categoryPlot28.setDomainAxisLocation(axisLocation89, false);
        categoryPlot4.setRangeAxisLocation(1, axisLocation89);
        org.jfree.chart.axis.ValueAxis valueAxis94 = categoryPlot4.getRangeAxisForDataset((int) '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(categoryAxis33);
        org.junit.Assert.assertNull(list34);
        org.junit.Assert.assertNull(categoryAxis36);
        org.junit.Assert.assertNotNull(rectangleInsets52);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(stroke64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(paint86);
        org.junit.Assert.assertNull(xYItemRenderer88);
        org.junit.Assert.assertNotNull(axisLocation89);
        org.junit.Assert.assertNull(valueAxis94);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        boolean boolean5 = categoryPlot4.isRangeZoomable();
        java.lang.String str6 = categoryPlot4.getPlotType();
        java.lang.Object obj7 = categoryPlot4.clone();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot4.getDatasetRenderingOrder();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Category Plot" + "'", str6, "Category Plot");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot4.getDomainAxisLocation((int) (short) 0);
        categoryPlot4.clearDomainMarkers();
        categoryPlot4.setRangeCrosshairValue((double) 0.0f, false);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        xYPlot16.setDomainCrosshairValue((double) (byte) 10);
        java.awt.Stroke stroke19 = xYPlot16.getDomainCrosshairStroke();
        java.awt.Image image20 = null;
        xYPlot16.setBackgroundImage(image20);
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = xYPlot16.getDomainMarkers((int) (short) 10, layer23);
        java.awt.Paint paint25 = xYPlot16.getDomainTickBandPaint();
        org.jfree.data.xy.XYDataset xYDataset26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot(xYDataset26, valueAxis27, valueAxis28, xYItemRenderer29);
        org.jfree.chart.util.RectangleEdge rectangleEdge31 = xYPlot30.getRangeAxisEdge();
        java.awt.Stroke stroke32 = xYPlot30.getDomainGridlineStroke();
        xYPlot16.setRangeZeroBaselineStroke(stroke32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset34, categoryAxis35, valueAxis36, categoryItemRenderer37);
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = categoryPlot38.getDomainAxisForDataset((int) (byte) 100);
        org.jfree.chart.axis.AxisSpace axisSpace41 = null;
        categoryPlot38.setFixedDomainAxisSpace(axisSpace41);
        org.jfree.data.xy.XYDataset xYDataset43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer46 = null;
        org.jfree.chart.plot.XYPlot xYPlot47 = new org.jfree.chart.plot.XYPlot(xYDataset43, valueAxis44, valueAxis45, xYItemRenderer46);
        java.awt.Stroke stroke48 = xYPlot47.getRangeCrosshairStroke();
        boolean boolean49 = xYPlot47.isRangeZoomable();
        java.awt.Paint paint50 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        xYPlot47.setOutlinePaint(paint50);
        categoryPlot38.setRangeCrosshairPaint(paint50);
        xYPlot16.setDomainZeroBaselinePaint(paint50);
        org.jfree.chart.axis.AxisLocation axisLocation54 = xYPlot16.getDomainAxisLocation();
        categoryPlot4.setDomainAxisLocation((int) '4', axisLocation54, true);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertNotNull(rectangleEdge31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNull(categoryAxis40);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(axisLocation54);
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
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot4.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot4.zoomRangeAxes((double) (short) 100, (double) (byte) 1, plotRenderingInfo8, point2D9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray12 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer11 };
        categoryPlot4.setRenderers(categoryItemRendererArray12);
        java.awt.Stroke stroke14 = categoryPlot4.getDomainGridlineStroke();
        boolean boolean15 = categoryPlot4.isDomainZoomable();
        java.awt.Stroke stroke16 = categoryPlot4.getRangeGridlineStroke();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent17 = null;
        categoryPlot4.rendererChanged(rendererChangeEvent17);
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        boolean boolean21 = categoryPlot4.removeDomainMarker(marker19, layer20);
        java.util.List list22 = categoryPlot4.getAnnotations();
        int int23 = categoryPlot4.getRangeAxisCount();
        categoryPlot4.setWeight(1);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Stroke stroke5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot4.setRangeCrosshairStroke(stroke5);
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot4.getRangeAxis();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot4.setRenderer(0, categoryItemRenderer9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        boolean boolean17 = categoryPlot16.isRangeZoomable();
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot16.getDomainAxisLocation();
        categoryPlot4.setDomainAxisLocation((int) (byte) 1, axisLocation18, false);
        categoryPlot4.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        java.util.List list24 = categoryPlot4.getCategoriesForAxis(categoryAxis23);
        categoryPlot4.clearRangeAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = categoryPlot4.getDomainAxisEdge((int) 'a');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = categoryPlot4.getRenderer();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(rectangleEdge27);
        org.junit.Assert.assertNull(categoryItemRenderer28);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot4.getInsets();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot4.axisChanged(axisChangeEvent6);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot4.getInsets();
        java.awt.Paint paint6 = categoryPlot4.getDomainGridlinePaint();
        org.jfree.chart.util.SortOrder sortOrder7 = categoryPlot4.getColumnRenderingOrder();
        categoryPlot4.mapDatasetToRangeAxis((int) (byte) 0, 100);
        java.awt.Stroke stroke11 = categoryPlot4.getRangeGridlineStroke();
        boolean boolean12 = categoryPlot4.isSubplot();
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(sortOrder7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        java.lang.Object obj6 = xYPlot4.clone();
        java.awt.Paint paint7 = xYPlot4.getNoDataMessagePaint();
        xYPlot4.clearDomainMarkers((int) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot14.getInsets();
        boolean boolean16 = categoryPlot14.isRangeCrosshairVisible();
        java.awt.Paint paint17 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot14.setNoDataMessagePaint(paint17);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot14.getDomainAxis();
        java.util.List list20 = categoryPlot14.getCategories();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot14.getDomainAxisForDataset((-1));
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        boolean boolean29 = categoryPlot28.isRangeZoomable();
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot28.getDomainAxisLocation();
        categoryPlot14.setDomainAxisLocation(10, axisLocation30);
        categoryPlot14.setRangeGridlinesVisible(false);
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot14.getDomainAxisLocation();
        xYPlot4.setDomainAxisLocation(axisLocation34);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertNull(list20);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNotNull(axisLocation34);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        xYPlot4.setDomainCrosshairValue((double) (byte) 10);
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        xYPlot4.setBackgroundPaint(paint7);
        float float9 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray10 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot4.setRenderers(xYItemRendererArray10);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot4.setRangeAxis((int) '#', valueAxis13);
        org.jfree.chart.axis.AxisLocation axisLocation15 = xYPlot4.getDomainAxisLocation();
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        xYPlot21.setDomainCrosshairValue((double) (byte) 10);
        java.awt.Stroke stroke24 = xYPlot21.getDomainCrosshairStroke();
        java.awt.Image image25 = null;
        xYPlot21.setBackgroundImage(image25);
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = xYPlot21.getDomainMarkers((int) (short) 10, layer28);
        boolean boolean30 = xYPlot21.isDomainGridlinesVisible();
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = xYPlot21.getRendererForDataset(xYDataset31);
        java.awt.Paint paint33 = xYPlot21.getDomainCrosshairPaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setQuadrantPaint((int) (byte) -1, paint33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (-1) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(xYItemRendererArray10);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(xYItemRenderer32);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.plot.Marker marker6 = null;
        boolean boolean7 = xYPlot4.removeDomainMarker(marker6);
        xYPlot4.configureDomainAxes();
        xYPlot4.clearRangeAxes();
        java.awt.Paint paint10 = xYPlot4.getDomainTickBandPaint();
        org.jfree.data.xy.XYDataset xYDataset11 = null;
        xYPlot4.setDataset(xYDataset11);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.lang.String str18 = xYPlot17.getPlotType();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot17.setDomainAxis(100, valueAxis20, false);
        org.jfree.chart.axis.AxisSpace axisSpace23 = xYPlot17.getFixedDomainAxisSpace();
        float float24 = xYPlot17.getBackgroundImageAlpha();
        boolean boolean25 = xYPlot17.isRangeZoomable();
        xYPlot17.setRangeGridlinesVisible(true);
        boolean boolean28 = xYPlot17.isDomainCrosshairVisible();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray29 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot17.setRangeAxes(valueAxisArray29);
        xYPlot4.setDomainAxes(valueAxisArray29);
        java.awt.Paint paint32 = xYPlot4.getBackgroundPaint();
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "XY Plot" + "'", str18, "XY Plot");
        org.junit.Assert.assertNull(axisSpace23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(valueAxisArray29);
        org.junit.Assert.assertNotNull(paint32);
    }
}

