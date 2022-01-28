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
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        boolean boolean6 = xYPlot4.isRangeZoomable();
        xYPlot4.setDomainCrosshairValue((double) (byte) 10);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        xYPlot4.datasetChanged(datasetChangeEvent9);
        xYPlot4.configureDomainAxes();
        xYPlot4.setRangeCrosshairValue(0.0d, true);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.axis.AxisLocation axisLocation7 = null;
        xYPlot4.setDomainAxisLocation((int) (byte) 10, axisLocation7);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer9 = xYPlot4.getRenderer();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(xYItemRenderer9);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        xYPlot4.zoomRangeAxes((double) (byte) 1, (double) (-1), plotRenderingInfo7, point2D8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot14.getDomainAxisLocation((int) (short) 0);
        java.awt.Paint paint17 = categoryPlot14.getDomainGridlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot14.getRangeAxisLocation(100);
        xYPlot4.setDomainAxisLocation(axisLocation19);
        java.awt.Stroke stroke21 = xYPlot4.getRangeCrosshairStroke();
        java.lang.String str22 = xYPlot4.getNoDataMessage();
        java.awt.Stroke stroke23 = xYPlot4.getDomainGridlineStroke();
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot4.getInsets();
        categoryPlot4.setAnchorValue((double) (-1.0f));
        categoryPlot4.setRangeGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot4.getDataset((int) (byte) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot4.zoomRangeAxes((-1.0d), plotRenderingInfo13, point2D14);
        double double16 = categoryPlot4.getAnchorValue();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset18, categoryAxis19, valueAxis20, categoryItemRenderer21);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = categoryPlot22.getDomainAxisForDataset((int) (byte) 100);
        java.awt.Stroke stroke25 = categoryPlot22.getDomainGridlineStroke();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        boolean boolean30 = categoryPlot22.render(graphics2D26, rectangle2D27, (int) (short) 1, plotRenderingInfo29);
        categoryPlot22.setNoDataMessage("Category Plot");
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot22.getDomainAxisEdge();
        org.jfree.data.xy.XYDataset xYDataset35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer38 = null;
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot(xYDataset35, valueAxis36, valueAxis37, xYItemRenderer38);
        java.awt.Stroke stroke40 = xYPlot39.getRangeCrosshairStroke();
        boolean boolean41 = xYPlot39.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder42 = xYPlot39.getDatasetRenderingOrder();
        xYPlot39.zoom((double) 10L);
        int int45 = xYPlot39.getSeriesCount();
        org.jfree.chart.axis.AxisLocation axisLocation46 = xYPlot39.getDomainAxisLocation();
        categoryPlot22.setDomainAxisLocation((int) (short) 100, axisLocation46);
        categoryPlot4.setDomainAxisLocation((int) (short) 10, axisLocation46);
        categoryPlot4.setDrawSharedDomainAxis(true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNull(categoryAxis24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(axisLocation46);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot4.getInsets();
        categoryPlot4.setAnchorValue((double) (-1.0f));
        categoryPlot4.setRangeGridlinesVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot4.getDomainAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot4.getRangeAxis((int) 'a');
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNull(valueAxis12);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        boolean boolean6 = xYPlot4.isRangeZoomable();
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        boolean boolean10 = xYPlot4.removeDomainMarker((int) 'a', marker8, layer9);
        java.awt.Paint paint11 = xYPlot4.getDomainTickBandPaint();
        java.awt.Image image12 = xYPlot4.getBackgroundImage();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(image12);
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
        boolean boolean5 = xYPlot4.isDomainGridlinesVisible();
        java.lang.String str6 = xYPlot4.getPlotType();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot4.getDomainAxis((int) (byte) -1);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = xYPlot4.getDomainMarkers(1, layer11);
        boolean boolean13 = xYPlot4.isDomainZoomable();
        xYPlot4.configureDomainAxes();
        boolean boolean15 = xYPlot4.isDomainCrosshairLockedOnData();
        double double16 = xYPlot4.getDomainCrosshairValue();
        boolean boolean17 = xYPlot4.isRangeZeroBaselineVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "XY Plot" + "'", str6, "XY Plot");
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
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
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot4.setDomainZeroBaselineStroke(stroke6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        org.jfree.chart.plot.CrosshairState crosshairState12 = null;
        boolean boolean13 = xYPlot4.render(graphics2D8, rectangle2D9, 1, plotRenderingInfo11, crosshairState12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace14, true);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        java.awt.Stroke stroke22 = xYPlot21.getRangeCrosshairStroke();
        java.awt.Stroke stroke23 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot21.setDomainZeroBaselineStroke(stroke23);
        java.awt.Paint paint25 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        xYPlot21.setOutlinePaint(paint25);
        java.awt.Stroke stroke27 = xYPlot21.getDomainGridlineStroke();
        xYPlot4.setOutlineStroke(stroke27);
        java.awt.Paint paint29 = xYPlot4.getRangeTickBandPaint();
        xYPlot4.mapDatasetToRangeAxis((int) (byte) 100, (int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis33 = xYPlot4.getRangeAxis();
        xYPlot4.setWeight((int) '4');
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNull(valueAxis33);
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
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        boolean boolean6 = xYPlot4.isDomainZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        xYPlot4.setDomainAxis(100, valueAxis8, false);
        org.jfree.data.xy.XYDataset xYDataset11 = xYPlot4.getDataset();
        boolean boolean12 = xYPlot4.isRangeCrosshairVisible();
        java.lang.String str13 = xYPlot4.getPlotType();
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        java.awt.Stroke stroke19 = xYPlot18.getRangeCrosshairStroke();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot18.setDomainZeroBaselineStroke(stroke20);
        java.awt.Paint paint22 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        xYPlot18.setOutlinePaint(paint22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = xYPlot18.getFixedDomainAxisSpace();
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = xYPlot18.getDomainMarkers((int) (short) 10, layer26);
        boolean boolean28 = xYPlot18.isDomainGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        categoryPlot34.markerChanged(markerChangeEvent35);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        java.awt.geom.Point2D point2D40 = null;
        categoryPlot34.zoomDomainAxes((double) (short) -1, (double) 100, plotRenderingInfo39, point2D40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis43, valueAxis44, categoryItemRenderer45);
        org.jfree.chart.axis.AxisLocation axisLocation48 = categoryPlot46.getDomainAxisLocation((int) (short) 0);
        categoryPlot34.setRangeAxisLocation(axisLocation48);
        java.awt.Paint paint50 = categoryPlot34.getDomainGridlinePaint();
        xYPlot18.setQuadrantPaint(2, paint50);
        xYPlot4.setDomainCrosshairPaint(paint50);
        xYPlot4.clearDomainMarkers((int) (byte) 10);
        xYPlot4.clearAnnotations();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(xYDataset11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "XY Plot" + "'", str13, "XY Plot");
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(axisSpace24);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(axisLocation48);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        xYPlot4.zoomRangeAxes((double) (byte) 1, (double) (-1), plotRenderingInfo7, point2D8);
        xYPlot4.setDomainCrosshairVisible(true);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace12);
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
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = categoryPlot4.getInsets();
        categoryPlot4.setAnchorValue((double) (-1.0f));
        categoryPlot4.setRangeCrosshairVisible(false);
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
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        java.awt.Stroke stroke25 = xYPlot24.getRangeCrosshairStroke();
        java.awt.Stroke stroke26 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot24.setDomainZeroBaselineStroke(stroke26);
        java.awt.Paint paint28 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        xYPlot24.setOutlinePaint(paint28);
        categoryPlot14.setRangeCrosshairPaint(paint28);
        categoryPlot4.setRangeGridlinePaint(paint28);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        categoryPlot4.setDataset((int) (short) 10, categoryDataset33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        categoryPlot4.setDataset(categoryDataset35);
        org.jfree.chart.plot.Marker marker37 = null;
        org.jfree.chart.util.Layer layer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = categoryPlot4.removeRangeMarker(marker37, layer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        boolean boolean6 = xYPlot4.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = xYPlot4.getDatasetRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        java.awt.Stroke stroke13 = xYPlot12.getRangeCrosshairStroke();
        org.jfree.chart.axis.AxisLocation axisLocation15 = null;
        xYPlot12.setDomainAxisLocation((int) (byte) 10, axisLocation15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        xYPlot12.drawBackgroundImage(graphics2D17, rectangle2D18);
        java.awt.Stroke stroke20 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot12.setDomainZeroBaselineStroke(stroke20);
        org.jfree.chart.plot.Marker marker22 = null;
        boolean boolean23 = xYPlot12.removeDomainMarker(marker22);
        xYPlot12.clearDomainMarkers(100);
        java.awt.Paint paint26 = xYPlot12.getDomainZeroBaselinePaint();
        xYPlot4.setDomainGridlinePaint(paint26);
        xYPlot4.setRangeZeroBaselineVisible(false);
        org.jfree.chart.axis.AxisSpace axisSpace30 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace30, false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint26);
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        categoryPlot4.markerChanged(markerChangeEvent5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot4.getFixedRangeAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace8 = null;
        categoryPlot4.setFixedRangeAxisSpace(axisSpace8, false);
        categoryPlot4.clearDomainMarkers();
        org.junit.Assert.assertNull(axisSpace7);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot4.setDomainZeroBaselineStroke(stroke6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace8, false);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = xYPlot4.getRenderer((int) (short) 10);
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addRangeMarker(0, marker14, layer15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(xYItemRenderer12);
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
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis((int) (short) 1, categoryAxis6);
        java.awt.Image image8 = null;
        categoryPlot4.setBackgroundImage(image8);
        boolean boolean10 = categoryPlot4.getDrawSharedDomainAxis();
        java.awt.Stroke stroke11 = categoryPlot4.getRangeCrosshairStroke();
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        java.awt.Stroke stroke17 = xYPlot16.getRangeCrosshairStroke();
        boolean boolean18 = xYPlot16.isRangeZoomable();
        xYPlot16.setDomainCrosshairValue((double) (byte) 10);
        xYPlot16.clearDomainAxes();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        java.awt.Stroke stroke27 = xYPlot26.getRangeCrosshairStroke();
        java.awt.Stroke stroke28 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot26.setDomainZeroBaselineStroke(stroke28);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        org.jfree.chart.plot.CrosshairState crosshairState34 = null;
        boolean boolean35 = xYPlot26.render(graphics2D30, rectangle2D31, 1, plotRenderingInfo33, crosshairState34);
        java.awt.Paint paint36 = xYPlot26.getRangeGridlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection37 = xYPlot26.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot(categoryDataset39, categoryAxis40, valueAxis41, categoryItemRenderer42);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = categoryPlot43.getInsets();
        boolean boolean45 = categoryPlot43.isRangeCrosshairVisible();
        java.awt.Paint paint46 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot43.setDomainGridlinePaint(paint46);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = null;
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer51 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot52 = new org.jfree.chart.plot.CategoryPlot(categoryDataset48, categoryAxis49, valueAxis50, categoryItemRenderer51);
        org.jfree.chart.axis.AxisLocation axisLocation54 = categoryPlot52.getDomainAxisLocation((int) (short) 0);
        categoryPlot43.setRangeAxisLocation(axisLocation54);
        xYPlot26.setRangeAxisLocation((int) (short) 0, axisLocation54);
        xYPlot26.setDomainGridlinesVisible(true);
        java.awt.Paint paint59 = xYPlot26.getRangeGridlinePaint();
        xYPlot16.setDomainZeroBaselinePaint(paint59);
        categoryPlot4.setRangeCrosshairPaint(paint59);
        categoryPlot4.clearRangeMarkers();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(legendItemCollection37);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(axisLocation54);
        org.junit.Assert.assertNotNull(paint59);
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
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot4.setDomainAxis((int) (short) 1, categoryAxis6);
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        java.awt.Stroke stroke13 = xYPlot12.getRangeCrosshairStroke();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot12.setDomainZeroBaselineStroke(stroke14);
        boolean boolean16 = categoryPlot4.equals((java.lang.Object) xYPlot12);
        boolean boolean17 = categoryPlot4.isOutlineVisible();
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        categoryPlot4.markerChanged(markerChangeEvent5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot4.zoomDomainAxes((double) (short) -1, (double) 100, plotRenderingInfo9, point2D10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis14, categoryItemRenderer15);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot16.getDomainAxisLocation((int) (short) 0);
        categoryPlot4.setRangeAxisLocation(axisLocation18);
        java.awt.Paint paint20 = categoryPlot4.getDomainGridlinePaint();
        categoryPlot4.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        java.util.List list24 = categoryPlot4.getCategoriesForAxis(categoryAxis23);
        org.jfree.chart.plot.CategoryMarker categoryMarker25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.addDomainMarker(categoryMarker25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(list24);
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
        org.jfree.chart.axis.AxisLocation axisLocation7 = null;
        xYPlot4.setDomainAxisLocation((int) (byte) 10, axisLocation7);
        boolean boolean9 = xYPlot4.isSubplot();
        xYPlot4.clearDomainAxes();
        org.jfree.chart.axis.AxisSpace axisSpace11 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace11);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYPlot4.setDomainZeroBaselineStroke(stroke6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        org.jfree.chart.plot.CrosshairState crosshairState12 = null;
        boolean boolean13 = xYPlot4.render(graphics2D8, rectangle2D9, 1, plotRenderingInfo11, crosshairState12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace14, true);
        org.jfree.data.xy.XYDataset xYDataset18 = xYPlot4.getDataset((int) 'a');
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot4.getIndexOf(xYItemRenderer19);
        org.jfree.chart.plot.Marker marker21 = null;
        boolean boolean22 = xYPlot4.removeDomainMarker(marker21);
        java.awt.Paint paint23 = xYPlot4.getRangeZeroBaselinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot(categoryDataset25, categoryAxis26, valueAxis27, categoryItemRenderer28);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot29.getDomainAxisLocation((int) (short) 0);
        java.awt.Paint paint32 = categoryPlot29.getDomainGridlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot29.getRangeAxisLocation(100);
        java.awt.Paint paint35 = categoryPlot29.getDomainGridlinePaint();
        xYPlot4.setQuadrantPaint((int) (byte) 0, paint35);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(xYDataset18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNotNull(paint35);
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
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        boolean boolean6 = xYPlot4.isRangeZoomable();
        xYPlot4.setDomainCrosshairValue((double) (byte) 10);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        xYPlot4.datasetChanged(datasetChangeEvent9);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = xYPlot4.getRangeMarkers(layer11);
        org.jfree.chart.plot.Plot plot13 = xYPlot4.getParent();
        boolean boolean14 = xYPlot4.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}

