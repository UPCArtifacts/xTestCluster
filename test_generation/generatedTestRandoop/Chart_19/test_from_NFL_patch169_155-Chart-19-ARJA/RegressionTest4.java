import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        double double13 = categoryPlot0.getAnchorValue();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.axis.AxisLocation axisLocation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (short) -1, axisLocation10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 100, plotRenderingInfo26, point2D27);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot29.configureRangeAxes();
        categoryPlot29.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder32 = categoryPlot29.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        java.awt.geom.Point2D point2D35 = null;
        categoryPlot29.zoomRangeAxes((double) 0L, plotRenderingInfo34, point2D35);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray37 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot29.setDomainAxes(categoryAxisArray37);
        categoryPlot0.setDomainAxes(categoryAxisArray37);
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge42 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder22);
        org.junit.Assert.assertNotNull(datasetRenderingOrder32);
        org.junit.Assert.assertNotNull(categoryAxisArray37);
        org.junit.Assert.assertNotNull(rectangleEdge42);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        int int18 = categoryPlot0.getDomainAxisIndex(categoryAxis17);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis20, true);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        categoryPlot0.axisChanged(axisChangeEvent18);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray22 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis21 };
        categoryPlot20.setDomainAxes(categoryAxisArray22);
        java.awt.Stroke stroke24 = categoryPlot20.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = categoryPlot20.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot20.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        categoryPlot20.markerChanged(markerChangeEvent27);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        categoryPlot20.setRangeAxis((int) (byte) 100, valueAxis30, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot33.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        java.awt.geom.Point2D point2D37 = null;
        categoryPlot33.zoomRangeAxes((-1.0d), plotRenderingInfo36, point2D37, false);
        org.jfree.chart.axis.AxisLocation axisLocation41 = categoryPlot33.getRangeAxisLocation((int) (byte) 10);
        categoryPlot20.setRangeAxisLocation(axisLocation41, true);
        java.awt.Stroke stroke44 = categoryPlot20.getRangeCrosshairStroke();
        categoryPlot0.setRangeGridlineStroke(stroke44);
        org.jfree.chart.LegendItemCollection legendItemCollection46 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(categoryAxisArray22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNull(categoryItemRenderer26);
        org.junit.Assert.assertNotNull(axisLocation41);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(legendItemCollection46);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        int int4 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot0.setRangeAxis(valueAxis6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(rectangleEdge5);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot0.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        categoryPlot0.setDataset((int) (byte) 100, categoryDataset18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        boolean boolean34 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot0.setDomainAxis((int) '4', categoryAxis18, false);
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer22);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Category Plot" + "'", str15, "Category Plot");
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNull(collection23);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent2 = null;
        categoryPlot0.axisChanged(axisChangeEvent2);
        boolean boolean4 = categoryPlot0.isRangeGridlinesVisible();
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot14.setRangeAxis((int) (byte) 100, valueAxis16);
        boolean boolean18 = categoryPlot14.isOutlineVisible();
        categoryPlot14.setRangeCrosshairLockedOnData(true);
        boolean boolean21 = categoryPlot14.isDomainZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        categoryPlot22.zoomRangeAxes((-1.0d), plotRenderingInfo25, point2D26, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor29 = categoryPlot22.getDomainGridlinePosition();
        categoryPlot14.setDomainGridlinePosition(categoryAnchor29);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray33 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis32 };
        categoryPlot31.setDomainAxes(categoryAxisArray33);
        float float35 = categoryPlot31.getBackgroundAlpha();
        categoryPlot31.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = categoryPlot31.getDomainAxisForDataset((int) '#');
        boolean boolean41 = categoryPlot31.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = null;
        categoryPlot31.setRenderer((int) '4', categoryItemRenderer43);
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray47 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis46 };
        categoryPlot45.setDomainAxes(categoryAxisArray47);
        float float49 = categoryPlot45.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot50.configureRangeAxes();
        categoryPlot50.clearDomainMarkers();
        categoryPlot50.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset56 = categoryPlot50.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener57 = null;
        categoryPlot50.removeChangeListener(plotChangeListener57);
        java.awt.Paint paint59 = categoryPlot50.getBackgroundPaint();
        categoryPlot45.setRangeGridlinePaint(paint59);
        categoryPlot31.setOutlinePaint(paint59);
        categoryPlot14.setOutlinePaint(paint59);
        org.jfree.chart.axis.AxisLocation axisLocation64 = categoryPlot14.getDomainAxisLocation((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (byte) -1, axisLocation64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(categoryAnchor29);
        org.junit.Assert.assertNotNull(categoryAxisArray33);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray47);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset56);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(axisLocation64);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge44 = categoryPlot0.getRangeAxisEdge((int) '4');
        org.jfree.chart.plot.CategoryMarker categoryMarker46 = null;
        org.jfree.chart.util.Layer layer47 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(10, categoryMarker46, layer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(plotOrientation39);
        org.junit.Assert.assertNotNull(rectangleEdge41);
        org.junit.Assert.assertNotNull(rectangleEdge44);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNull(legendItemCollection15);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        categoryPlot0.mapDatasetToRangeAxis(8, (int) ' ');
        categoryPlot0.mapDatasetToRangeAxis(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot15.setRangeAxis((int) (byte) 100, valueAxis17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        boolean boolean23 = categoryPlot15.render(graphics2D19, rectangle2D20, (int) (byte) 100, plotRenderingInfo22);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = categoryPlot15.getRenderer((int) (short) 10);
        java.awt.Stroke stroke26 = categoryPlot15.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = categoryPlot15.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot15.zoomRangeAxes((double) (byte) 1, (double) '#', plotRenderingInfo30, point2D31);
        java.awt.Paint paint33 = categoryPlot15.getDomainGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint33);
        org.jfree.chart.plot.CategoryMarker categoryMarker35 = null;
        org.jfree.chart.util.Layer layer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker35, layer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        boolean boolean9 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean11 = categoryPlot10.isRangeZoomable();
        categoryPlot10.setAnchorValue(100.0d, false);
        float float15 = categoryPlot10.getForegroundAlpha();
        int int16 = categoryPlot10.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis18, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray23 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis22 };
        categoryPlot21.setDomainAxes(categoryAxisArray23);
        categoryPlot21.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot21.getDomainAxisLocation(100);
        categoryPlot10.setRangeAxisLocation(axisLocation28, false);
        float float31 = categoryPlot10.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot32.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot32.zoomRangeAxes((-1.0d), plotRenderingInfo35, point2D36, false);
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        categoryPlot32.setRangeAxis(valueAxis39);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray41 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot32.setRenderers(categoryItemRendererArray41);
        categoryPlot10.setRenderers(categoryItemRendererArray41);
        org.jfree.chart.util.RectangleEdge rectangleEdge45 = categoryPlot10.getDomainAxisEdge((int) (short) 0);
        categoryPlot10.configureDomainAxes();
        categoryPlot10.setBackgroundAlpha(0.0f);
        categoryPlot10.clearRangeMarkers();
        java.awt.Stroke stroke50 = categoryPlot10.getOutlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke50);
        org.jfree.chart.plot.Plot plot52 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray23);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
        org.junit.Assert.assertNotNull(categoryItemRendererArray41);
        org.junit.Assert.assertNotNull(rectangleEdge45);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(plot52);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        java.awt.Font font23 = categoryPlot0.getNoDataMessageFont();
        java.awt.Image image24 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNull(image24);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        float float15 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        categoryPlot0.setRangeCrosshairValue(0.0d, true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot0.getRangeMarkers(101, layer26);
        org.jfree.chart.axis.ValueAxis valueAxis29 = categoryPlot0.getRangeAxis((int) (byte) 0);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        categoryPlot0.setRenderer(categoryItemRenderer30, true);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNull(valueAxis29);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.jfree.chart.LegendItemCollection legendItemCollection24 = categoryPlot0.getLegendItems();
        java.awt.Font font25 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        categoryPlot26.setRangeAxis((int) (byte) 100, valueAxis28);
        boolean boolean30 = categoryPlot26.isOutlineVisible();
        categoryPlot26.setRangeCrosshairLockedOnData(true);
        boolean boolean33 = categoryPlot26.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = categoryPlot26.getDomainAxisForDataset(0);
        categoryPlot26.setDrawSharedDomainAxis(true);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        categoryPlot26.setDataset(categoryDataset38);
        org.jfree.chart.axis.ValueAxis valueAxis40 = categoryPlot26.getRangeAxis();
        int int41 = categoryPlot26.getDatasetCount();
        org.jfree.chart.util.SortOrder sortOrder42 = categoryPlot26.getColumnRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder42);
        int int44 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(legendItemCollection24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(categoryAxis35);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(sortOrder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 101 + "'", int44 == 101);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.configureDomainAxes();
        java.awt.Stroke stroke5 = categoryPlot0.getOutlineStroke();
        java.util.List list6 = categoryPlot0.getCategories();
        categoryPlot0.setAnchorValue(0.0d);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.jfree.chart.axis.AxisSpace axisSpace19 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.PlotOrientation plotOrientation20 = categoryPlot0.getOrientation();
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = categoryPlot0.getDomainMarkers(100, layer22);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryAnchor16);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNull(axisSpace19);
        org.junit.Assert.assertNotNull(plotOrientation20);
        org.junit.Assert.assertNull(collection23);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        categoryPlot0.setDomainAxis(100, categoryAxis16);
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean5 = categoryPlot0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer7, true);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRendererForDataset(categoryDataset10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean13 = categoryPlot12.isRangeZoomable();
        categoryPlot12.setAnchorValue(100.0d, false);
        float float17 = categoryPlot12.getForegroundAlpha();
        int int18 = categoryPlot12.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot12.setRangeAxis((int) (byte) 100, valueAxis20, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray25 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis24 };
        categoryPlot23.setDomainAxes(categoryAxisArray25);
        categoryPlot23.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot23.getDomainAxisLocation(100);
        categoryPlot12.setRangeAxisLocation(axisLocation30, false);
        float float33 = categoryPlot12.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot34.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        java.awt.geom.Point2D point2D38 = null;
        categoryPlot34.zoomRangeAxes((-1.0d), plotRenderingInfo37, point2D38, false);
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        categoryPlot34.setRangeAxis(valueAxis41);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray43 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot34.setRenderers(categoryItemRendererArray43);
        categoryPlot12.setRenderers(categoryItemRendererArray43);
        categoryPlot0.setRenderers(categoryItemRendererArray43);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 0, (int) (byte) -1);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent50 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.5f + "'", float33 == 0.5f);
        org.junit.Assert.assertNotNull(categoryItemRendererArray43);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertNotNull(rectangleEdge26);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertNull(datasetGroup9);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot0.getFixedRangeAxisSpace();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(axisSpace9);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        boolean boolean6 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Paint paint7 = categoryPlot0.getBackgroundPaint();
        boolean boolean8 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        categoryPlot14.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        categoryPlot14.setDataset(categoryDataset17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot14.getRendererForDataset(categoryDataset19);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray23 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis22 };
        categoryPlot21.setDomainAxes(categoryAxisArray23);
        categoryPlot21.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot21.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        categoryPlot29.setRangeAxis((int) (byte) 100, valueAxis31);
        org.jfree.chart.util.Layer layer34 = null;
        java.util.Collection collection35 = categoryPlot29.getDomainMarkers((int) (byte) 10, layer34);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean37 = categoryPlot36.isRangeZoomable();
        categoryPlot36.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation41 = categoryPlot36.getOrientation();
        categoryPlot29.setOrientation(plotOrientation41);
        org.jfree.chart.util.RectangleEdge rectangleEdge43 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation28, plotOrientation41);
        categoryPlot14.setOrientation(plotOrientation41);
        java.awt.Paint paint45 = categoryPlot14.getRangeGridlinePaint();
        categoryPlot0.setRangeGridlinePaint(paint45);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        java.awt.geom.Point2D point2D49 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 100, plotRenderingInfo48, point2D49, true);
        java.awt.Stroke stroke52 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot0.setRangeGridlineStroke(stroke52);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(categoryAxisArray23);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(plotOrientation41);
        org.junit.Assert.assertNotNull(rectangleEdge43);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot4.getRangeAxisLocation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer();
        categoryPlot4.configureRangeAxes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNull(categoryItemRenderer7);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.util.List list4 = categoryPlot0.getCategories();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean6 = categoryPlot5.isRangeZoomable();
        categoryPlot5.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder10 = categoryPlot5.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder10);
        java.awt.Image image12 = null;
        categoryPlot0.setBackgroundImage(image12);
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.configureRangeAxes();
        categoryPlot17.clearRangeMarkers();
        boolean boolean20 = categoryPlot17.isOutlineVisible();
        categoryPlot17.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray25 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis24 };
        categoryPlot23.setDomainAxes(categoryAxisArray25);
        float float27 = categoryPlot23.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot28.configureRangeAxes();
        categoryPlot28.clearDomainMarkers();
        categoryPlot28.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset34 = categoryPlot28.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        categoryPlot28.removeChangeListener(plotChangeListener35);
        java.awt.Paint paint37 = categoryPlot28.getBackgroundPaint();
        categoryPlot23.setRangeGridlinePaint(paint37);
        categoryPlot17.setOutlinePaint(paint37);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = categoryPlot17.getRenderer();
        org.jfree.chart.plot.PlotOrientation plotOrientation41 = categoryPlot17.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge42 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation16, plotOrientation41);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset34);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(categoryItemRenderer40);
        org.junit.Assert.assertNotNull(plotOrientation41);
        org.junit.Assert.assertNotNull(rectangleEdge42);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.awt.Stroke stroke15 = categoryPlot0.getOutlineStroke();
        boolean boolean16 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot0.setRangeAxis((int) (short) 1, valueAxis19);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, false);
        double double11 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, (double) 0.5f, plotRenderingInfo14, point2D15);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        categoryPlot0.setRangeCrosshairValue(0.0d, true);
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        boolean boolean24 = categoryPlot0.getDrawSharedDomainAxis();
        java.awt.Font font25 = categoryPlot0.getNoDataMessageFont();
        boolean boolean26 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        java.awt.Paint paint19 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent20 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent20);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot15.setRangeAxis((int) (byte) 100, valueAxis17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        boolean boolean23 = categoryPlot15.render(graphics2D19, rectangle2D20, (int) (byte) 100, plotRenderingInfo22);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = categoryPlot15.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        categoryPlot15.setRenderer((int) 'a', categoryItemRenderer27, false);
        categoryPlot15.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot15.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation((int) (short) 100, axisLocation33, false);
        boolean boolean36 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        int int14 = categoryPlot0.getWeight();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        int int4 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis(categoryAxis5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((-1));
        java.awt.Stroke stroke7 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        int int13 = categoryPlot12.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot12.getRangeAxisLocation();
        java.awt.Stroke stroke15 = categoryPlot12.getDomainGridlineStroke();
        categoryPlot0.setOutlineStroke(stroke15);
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        int int9 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        boolean boolean14 = categoryPlot0.render(graphics2D10, rectangle2D11, 101, plotRenderingInfo13);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        categoryPlot0.markerChanged(markerChangeEvent28);
        org.jfree.chart.util.Layer layer31 = null;
        java.util.Collection collection32 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer31);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(plotOrientation20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNull(collection32);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = categoryPlot0.getDomainMarkers(layer22);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNull(collection23);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        java.util.List list34 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(categoryAxis33);
        org.junit.Assert.assertNull(list34);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        categoryPlot0.setWeight((int) 'a');
        boolean boolean42 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer44 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer44);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3, true);
        boolean boolean6 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        categoryPlot0.setRenderer(categoryItemRenderer4, true);
        categoryPlot0.clearDomainMarkers();
        float float8 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 0, plotRenderingInfo10, point2D11, true);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.util.List list8 = categoryPlot0.getCategories();
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis12 };
        categoryPlot11.setDomainAxes(categoryAxisArray13);
        categoryPlot11.setAnchorValue(10.0d);
        categoryPlot11.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean20 = categoryPlot19.isRangeZoomable();
        categoryPlot19.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder24 = categoryPlot19.getDatasetRenderingOrder();
        categoryPlot11.setDatasetRenderingOrder(datasetRenderingOrder24);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = categoryPlot11.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder26);
        categoryPlot0.setRangeCrosshairValue((double) 0.5f);
        int int30 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder24);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        categoryPlot0.setRangeAxis(valueAxis4);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getDomainMarkers((int) (short) -1, layer7);
        java.awt.Stroke stroke9 = categoryPlot0.getDomainGridlineStroke();
        float float10 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent11 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent11);
        org.jfree.chart.plot.Plot plot13 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer((int) (short) -1);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(categoryItemRenderer21);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        categoryPlot0.mapDatasetToRangeAxis((int) ' ', (int) (short) -1);
        org.junit.Assert.assertNull(collection6);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        java.awt.Font font23 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.Marker marker24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker24);
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
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setWeight((-1));
        java.util.List list5 = categoryPlot0.getCategories();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        boolean boolean7 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isRangeZoomable();
        categoryPlot8.setAnchorValue(100.0d, false);
        float float13 = categoryPlot8.getForegroundAlpha();
        int int14 = categoryPlot8.getWeight();
        org.jfree.chart.plot.Plot plot15 = categoryPlot8.getRootPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        categoryPlot16.clearDomainMarkers();
        categoryPlot16.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset22 = categoryPlot16.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent23 = null;
        categoryPlot16.rendererChanged(rendererChangeEvent23);
        java.awt.Font font25 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot16.setNoDataMessageFont(font25);
        categoryPlot8.setNoDataMessageFont(font25);
        categoryPlot0.setNoDataMessageFont(font25);
        float float29 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        org.jfree.chart.axis.ValueAxis[] valueAxisArray13 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray13);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor15 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNotNull(categoryAnchor15);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.configureRangeAxes();
        categoryPlot25.clearRangeMarkers();
        boolean boolean28 = categoryPlot25.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray31 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis30 };
        categoryPlot29.setDomainAxes(categoryAxisArray31);
        float float33 = categoryPlot29.getBackgroundAlpha();
        categoryPlot29.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = categoryPlot29.getDomainAxisForDataset((int) '#');
        boolean boolean39 = categoryPlot29.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        categoryPlot29.setRenderer((int) '4', categoryItemRenderer41);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray45 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis44 };
        categoryPlot43.setDomainAxes(categoryAxisArray45);
        float float47 = categoryPlot43.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot48.configureRangeAxes();
        categoryPlot48.clearDomainMarkers();
        categoryPlot48.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset54 = categoryPlot48.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener55 = null;
        categoryPlot48.removeChangeListener(plotChangeListener55);
        java.awt.Paint paint57 = categoryPlot48.getBackgroundPaint();
        categoryPlot43.setRangeGridlinePaint(paint57);
        categoryPlot29.setOutlinePaint(paint57);
        categoryPlot25.setRangeGridlinePaint(paint57);
        categoryPlot0.setRangeCrosshairPaint(paint57);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray45);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 1.0f + "'", float47 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset54);
        org.junit.Assert.assertNotNull(paint57);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.jfree.chart.plot.Plot plot12 = categoryPlot0.getParent();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis33);
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
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot0.getDomainAxisEdge((int) (byte) 100);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.LegendItemCollection legendItemCollection21 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(legendItemCollection21);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        categoryPlot0.configureDomainAxes();
        int int19 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot0.getDomainMarkers(15, layer21);
        java.util.List list23 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertNull(list23);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(legendItemCollection22);
        org.junit.Assert.assertNotNull(rectangleEdge23);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer9, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        categoryPlot12.setRangeAxis((int) (byte) 100, valueAxis14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        boolean boolean20 = categoryPlot12.render(graphics2D16, rectangle2D17, (int) (byte) 100, plotRenderingInfo19);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot12.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = categoryPlot12.getDomainMarkers(layer23);
        categoryPlot12.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset26 = categoryPlot12.getDataset();
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = categoryPlot12.getRangeAxisEdge();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = categoryPlot12.getAxisOffset();
        categoryPlot0.setAxisOffset(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertNull(categoryDataset26);
        org.junit.Assert.assertNotNull(rectangleEdge27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        categoryPlot0.setBackgroundImageAlignment(1);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(valueAxisArray30);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) (byte) -1, layer9);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertNull(collection10);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        java.awt.Font font14 = categoryPlot0.getNoDataMessageFont();
        categoryPlot0.setNoDataMessage("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        categoryPlot0.clearRangeMarkers(8);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot18.setRangeAxis((int) (byte) 100, valueAxis20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        boolean boolean26 = categoryPlot18.render(graphics2D22, rectangle2D23, (int) (byte) 100, plotRenderingInfo25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = categoryPlot18.getRenderer((int) (short) 10);
        java.awt.Paint paint29 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot18.setRangeCrosshairPaint(paint29);
        categoryPlot0.setRangeGridlinePaint(paint29);
        java.awt.Paint paint32 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(axisSpace15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(categoryItemRenderer28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        categoryPlot0.setRenderer(categoryItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getRangeAxisEdge(101);
        categoryPlot0.setRangeCrosshairValue((double) '4', false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(rectangleEdge9);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation(101);
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis16 };
        categoryPlot0.setDomainAxes(categoryAxisArray17);
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
        java.awt.Paint paint33 = categoryPlot19.getRangeGridlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection34 = categoryPlot19.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection34);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(categoryItemRenderer29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(legendItemCollection32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(legendItemCollection34);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        boolean boolean8 = categoryPlot0.isSubplot();
        java.awt.Paint paint9 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot4.getDrawingSupplier();
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        double double15 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        float float6 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray9 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis8 };
        categoryPlot7.setDomainAxes(categoryAxisArray9);
        categoryPlot0.setDomainAxes(categoryAxisArray9);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getDomainAxisLocation(0);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(categoryAxisArray9);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        categoryPlot16.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        categoryPlot16.setDataset(categoryDataset19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot16.getRendererForDataset(categoryDataset21);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray25 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis24 };
        categoryPlot23.setDomainAxes(categoryAxisArray25);
        categoryPlot23.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot23.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot31.setRangeAxis((int) (byte) 100, valueAxis33);
        org.jfree.chart.util.Layer layer36 = null;
        java.util.Collection collection37 = categoryPlot31.getDomainMarkers((int) (byte) 10, layer36);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean39 = categoryPlot38.isRangeZoomable();
        categoryPlot38.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation43 = categoryPlot38.getOrientation();
        categoryPlot31.setOrientation(plotOrientation43);
        org.jfree.chart.util.RectangleEdge rectangleEdge45 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation30, plotOrientation43);
        categoryPlot16.setOrientation(plotOrientation43);
        java.awt.Paint paint47 = categoryPlot16.getRangeGridlinePaint();
        categoryPlot0.setRangeCrosshairPaint(paint47);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(plotOrientation43);
        org.junit.Assert.assertNotNull(rectangleEdge45);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = categoryPlot4.getDomainAxis();
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot4.getDomainAxisLocation(0);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot4.getRangeAxis((-1));
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot4.getDomainAxisEdge((int) '#');
        org.junit.Assert.assertNull(categoryAxis5);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        org.jfree.chart.axis.ValueAxis valueAxis28 = categoryPlot0.getRangeAxis((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot29.configureRangeAxes();
        categoryPlot29.clearRangeMarkers();
        boolean boolean32 = categoryPlot29.isOutlineVisible();
        categoryPlot29.setRangeGridlinesVisible(false);
        categoryPlot29.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot37.configureRangeAxes();
        categoryPlot37.clearRangeMarkers();
        boolean boolean40 = categoryPlot37.isOutlineVisible();
        categoryPlot37.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = null;
        categoryPlot37.setRenderer(categoryItemRenderer43);
        org.jfree.chart.axis.AxisLocation axisLocation45 = categoryPlot37.getDomainAxisLocation();
        categoryPlot29.setRangeAxisLocation(axisLocation45);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot29);
        java.lang.String str48 = categoryPlot29.getNoDataMessage();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(axisLocation45);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        org.jfree.chart.axis.AxisLocation axisLocation39 = categoryPlot0.getDomainAxisLocation((int) (byte) 0);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(valueAxisArray30);
        org.junit.Assert.assertNotNull(axisLocation39);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent2 = null;
        categoryPlot0.axisChanged(axisChangeEvent2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer5);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        boolean boolean16 = categoryPlot8.render(graphics2D12, rectangle2D13, (int) (byte) 100, plotRenderingInfo15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot8.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot8.setRenderer((int) 'a', categoryItemRenderer20, false);
        java.lang.String str23 = categoryPlot8.getPlotType();
        org.jfree.chart.plot.Plot plot24 = categoryPlot8.getParent();
        java.awt.Paint paint25 = categoryPlot8.getOutlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint25);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.data.Range range28 = categoryPlot0.getDataRange(valueAxis27);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryItemRenderer18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Category Plot" + "'", str23, "Category Plot");
        org.junit.Assert.assertNull(plot24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(range28);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis10, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis14 };
        categoryPlot13.setDomainAxes(categoryAxisArray15);
        categoryPlot13.configureDomainAxes();
        java.awt.Stroke stroke18 = categoryPlot13.getOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke18);
        categoryPlot0.setNoDataMessage("Category Plot");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot0.zoomRangeAxes(1.0d, plotRenderingInfo23, point2D24, false);
        org.jfree.chart.axis.ValueAxis valueAxis27 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(valueAxis27);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot0.zoomDomainAxes((double) 1, plotRenderingInfo27, point2D28, true);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot23.getDomainAxisEdge((int) '#');
        categoryPlot23.setForegroundAlpha((float) '4');
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(categoryAnchor30);
        org.junit.Assert.assertNotNull(rectangleEdge31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge35);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        categoryPlot13.clearDomainMarkers();
        categoryPlot13.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot13.setNoDataMessagePaint(paint18);
        java.awt.Image image20 = categoryPlot13.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot13.zoomDomainAxes((double) 0.0f, plotRenderingInfo22, point2D23);
        categoryPlot13.mapDatasetToDomainAxis((int) '4', (int) '4');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        int int29 = categoryPlot13.getIndexOf(categoryItemRenderer28);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.configureRangeAxes();
        categoryPlot30.clearRangeMarkers();
        categoryPlot30.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke36 = categoryPlot30.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = categoryPlot30.getDomainAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        java.awt.geom.Point2D point2D40 = null;
        categoryPlot30.zoomRangeAxes((double) 0L, plotRenderingInfo39, point2D40, false);
        java.awt.Image image43 = null;
        categoryPlot30.setBackgroundImage(image43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        categoryPlot30.setDataset(categoryDataset45);
        org.jfree.chart.axis.AxisLocation axisLocation47 = categoryPlot30.getRangeAxisLocation();
        categoryPlot13.setRangeAxisLocation(axisLocation47, true);
        categoryPlot0.setRangeAxisLocation(axisLocation47);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNull(categoryAxis37);
        org.junit.Assert.assertNotNull(axisLocation47);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo7, point2D8);
        double double10 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        categoryPlot0.setDataset(categoryDataset11);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(0, marker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(plotOrientation14);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace18);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        java.util.List list21 = categoryPlot0.getCategoriesForAxis(categoryAxis20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.mapDatasetToRangeAxis((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot0.zoomRangeAxes((double) 100L, plotRenderingInfo21, point2D22, false);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(categoryAnchor16);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearRangeMarkers();
        boolean boolean18 = categoryPlot15.isOutlineVisible();
        categoryPlot15.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        categoryPlot21.setRangeAxis((int) (byte) 100, valueAxis23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        boolean boolean29 = categoryPlot21.render(graphics2D25, rectangle2D26, (int) (byte) 100, plotRenderingInfo28);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = categoryPlot21.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        categoryPlot21.setRenderer((int) 'a', categoryItemRenderer33, false);
        categoryPlot21.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation38 = categoryPlot21.getDomainAxisLocation();
        categoryPlot15.setRangeAxisLocation(axisLocation38);
        categoryPlot0.setDomainAxisLocation(axisLocation38);
        org.jfree.chart.util.RectangleEdge rectangleEdge42 = categoryPlot0.getRangeAxisEdge(8);
        boolean boolean43 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(plotOrientation5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(categoryItemRenderer31);
        org.junit.Assert.assertNotNull(axisLocation38);
        org.junit.Assert.assertNotNull(rectangleEdge42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        boolean boolean10 = categoryPlot0.isRangeGridlinesVisible();
        categoryPlot0.configureDomainAxes();
        categoryPlot0.configureRangeAxes();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        categoryPlot0.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        java.lang.String str5 = categoryPlot0.getPlotType();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean9 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Category Plot" + "'", str5, "Category Plot");
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot11.zoomRangeAxes((-1.0d), plotRenderingInfo14, point2D15, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot11.getRangeAxisLocation((int) (byte) 10);
        java.awt.Stroke stroke20 = categoryPlot11.getRangeCrosshairStroke();
        categoryPlot0.setOutlineStroke(stroke20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        boolean boolean26 = categoryPlot0.render(graphics2D22, rectangle2D23, (int) (byte) -1, plotRenderingInfo25);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        int int28 = categoryPlot0.getDomainAxisIndex(categoryAxis27);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot0.getRangeAxisForDataset(8);
        org.jfree.chart.axis.AxisSpace axisSpace31 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace31);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(valueAxis30);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset((int) (byte) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearRangeMarkers();
        boolean boolean14 = categoryPlot11.isOutlineVisible();
        categoryPlot11.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot17.setRangeAxis((int) (byte) 100, valueAxis19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        boolean boolean25 = categoryPlot17.render(graphics2D21, rectangle2D22, (int) (byte) 100, plotRenderingInfo24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot17.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        categoryPlot17.setRenderer((int) 'a', categoryItemRenderer29, false);
        categoryPlot17.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot17.getDomainAxisLocation();
        categoryPlot11.setRangeAxisLocation(axisLocation34);
        categoryPlot0.setRangeAxisLocation(axisLocation34);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot37.configureRangeAxes();
        categoryPlot37.clearDomainMarkers();
        categoryPlot37.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint42 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot37.setNoDataMessagePaint(paint42);
        java.awt.Image image44 = categoryPlot37.getBackgroundImage();
        java.awt.Paint paint45 = categoryPlot37.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray48 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis47 };
        categoryPlot46.setDomainAxes(categoryAxisArray48);
        categoryPlot46.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation53 = categoryPlot46.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot54 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean55 = categoryPlot54.isRangeZoomable();
        org.jfree.chart.plot.Plot plot56 = categoryPlot54.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation57 = categoryPlot54.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge58 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation53, plotOrientation57);
        categoryPlot37.setDomainAxisLocation(axisLocation53);
        categoryPlot37.mapDatasetToDomainAxis((int) (byte) 1, (int) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation63 = categoryPlot37.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge64 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation34, plotOrientation63);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(categoryItemRenderer27);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(categoryAxisArray48);
        org.junit.Assert.assertNotNull(axisLocation53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(plot56);
        org.junit.Assert.assertNotNull(plotOrientation57);
        org.junit.Assert.assertNotNull(rectangleEdge58);
        org.junit.Assert.assertNotNull(plotOrientation63);
        org.junit.Assert.assertNotNull(rectangleEdge64);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = categoryPlot0.getRenderer((int) '#');
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
        org.junit.Assert.assertNull(categoryItemRenderer43);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        categoryPlot0.mapDatasetToDomainAxis((int) 'a', (int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot0.setRenderer((int) (byte) 100, categoryItemRenderer13, true);
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        categoryPlot0.clearDomainMarkers();
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
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        categoryPlot0.setOutlineVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean13 = categoryPlot12.isRangeZoomable();
        categoryPlot12.setAnchorValue(100.0d, false);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot12.getDomainAxisLocation(1);
        categoryPlot0.setRangeAxisLocation((int) (short) 10, axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        int int15 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot0.getDomainAxisEdge((-1));
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleEdge18);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        org.jfree.chart.LegendItemCollection legendItemCollection14 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot15.getDomainAxisEdge();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot15.setRenderer((int) (short) 0, categoryItemRenderer19);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor21 = categoryPlot15.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(categoryAnchor21);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        java.util.List list8 = categoryPlot0.getCategories();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        java.awt.Font font12 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace4);
        boolean boolean6 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getRangeAxisLocation();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(axisLocation7);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3, true);
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = categoryPlot0.getRangeMarkers(layer6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo9, point2D10, false);
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
        int int29 = categoryPlot13.getWeight();
        java.awt.Paint paint30 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot13.setRangeCrosshairPaint(paint30);
        categoryPlot0.setBackgroundPaint(paint30);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        categoryPlot34.setRangeAxis((int) (byte) 100, valueAxis36);
        boolean boolean39 = categoryPlot34.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        categoryPlot34.setRenderer((int) (byte) 10, categoryItemRenderer41, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray46 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis45 };
        categoryPlot44.setDomainAxes(categoryAxisArray46);
        float float48 = categoryPlot44.getBackgroundAlpha();
        categoryPlot44.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis53 = categoryPlot44.getDomainAxisForDataset((int) '#');
        boolean boolean54 = categoryPlot44.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation56 = categoryPlot44.getDomainAxisLocation((int) (byte) -1);
        categoryPlot34.setRangeAxisLocation(axisLocation56);
        categoryPlot0.setRangeAxisLocation((int) (short) 1, axisLocation56);
        java.lang.String str59 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryItemRenderer23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(legendItemCollection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray46);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 1.0f + "'", float48 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(axisLocation56);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(categoryAxis7);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertNotNull(rectangleEdge20);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(0, layer10);
        int int12 = categoryPlot0.getRangeAxisCount();
        double double13 = categoryPlot0.getAnchorValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot0.getRenderer((int) (short) 0);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer15);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        categoryPlot0.mapDatasetToRangeAxis(8, (int) ' ');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot0.setRenderer(categoryItemRenderer17, true);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent21 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent21);
        java.awt.Paint paint23 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot15.setRangeAxis((int) (byte) 100, valueAxis17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        boolean boolean23 = categoryPlot15.render(graphics2D19, rectangle2D20, (int) (byte) 100, plotRenderingInfo22);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = categoryPlot15.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        categoryPlot15.setRenderer((int) 'a', categoryItemRenderer27, false);
        categoryPlot15.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot15.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation((int) (short) 100, axisLocation33, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        int int37 = categoryPlot0.getDomainAxisIndex(categoryAxis36);
        boolean boolean38 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot11.setRangeAxis((int) (byte) 100, valueAxis13);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot11.getDomainMarkers((int) (byte) 10, layer16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        categoryPlot11.setFixedRangeAxisSpace(axisSpace18);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        categoryPlot20.setRangeAxis((int) (byte) 100, valueAxis22);
        boolean boolean25 = categoryPlot20.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder26 = categoryPlot20.getRowRenderingOrder();
        categoryPlot11.setRowRenderingOrder(sortOrder26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setAxisOffset(rectangleInsets28);
        categoryPlot0.setInsets(rectangleInsets28, true);
        boolean boolean32 = categoryPlot0.isDomainZoomable();
        java.awt.Paint paint33 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(sortOrder26);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis((int) 'a');
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean11 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        categoryPlot0.setDataset(1, categoryDataset15);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot0.getRangeAxisLocation();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        categoryPlot0.setDataset((int) (short) 10, categoryDataset19);
        boolean boolean21 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean5 = categoryPlot0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer7, true);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRendererForDataset(categoryDataset10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean13 = categoryPlot12.isRangeZoomable();
        categoryPlot12.setAnchorValue(100.0d, false);
        float float17 = categoryPlot12.getForegroundAlpha();
        int int18 = categoryPlot12.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot12.setRangeAxis((int) (byte) 100, valueAxis20, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray25 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis24 };
        categoryPlot23.setDomainAxes(categoryAxisArray25);
        categoryPlot23.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot23.getDomainAxisLocation(100);
        categoryPlot12.setRangeAxisLocation(axisLocation30, false);
        float float33 = categoryPlot12.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot34.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        java.awt.geom.Point2D point2D38 = null;
        categoryPlot34.zoomRangeAxes((-1.0d), plotRenderingInfo37, point2D38, false);
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        categoryPlot34.setRangeAxis(valueAxis41);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray43 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot34.setRenderers(categoryItemRendererArray43);
        categoryPlot12.setRenderers(categoryItemRendererArray43);
        categoryPlot0.setRenderers(categoryItemRendererArray43);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 0, (int) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup50 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.5f + "'", float33 == 0.5f);
        org.junit.Assert.assertNotNull(categoryItemRendererArray43);
        org.junit.Assert.assertNull(datasetGroup50);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot0.zoomDomainAxes((double) 0, plotRenderingInfo21, point2D22, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        float float7 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = categoryPlot0.getDomainAxisForDataset((int) (byte) 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categoryAxis16);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        java.awt.Stroke stroke12 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        int int4 = categoryPlot0.getDatasetCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        java.util.List list6 = categoryPlot0.getCategoriesForAxis(categoryAxis5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        boolean boolean17 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset21 = categoryPlot19.getDataset((int) (short) 1);
        categoryPlot19.clearRangeAxes();
        int int23 = categoryPlot19.getWeight();
        categoryPlot19.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor26 = categoryPlot19.getDomainGridlinePosition();
        categoryPlot19.setRangeCrosshairValue((double) 10.0f, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot31.configureRangeAxes();
        categoryPlot31.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        categoryPlot31.setDataset(categoryDataset34);
        categoryPlot31.setWeight(10);
        org.jfree.chart.util.SortOrder sortOrder38 = categoryPlot31.getColumnRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis39 = categoryPlot31.getRangeAxis();
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot31.getRangeAxisLocation();
        categoryPlot19.setDomainAxisLocation(15, axisLocation40);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (byte) -1, axisLocation40, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor26);
        org.junit.Assert.assertNotNull(sortOrder38);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertNotNull(axisLocation40);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot0.getDomainAxisForDataset((int) (byte) 1);
        org.junit.Assert.assertNull(categoryAxis17);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        categoryPlot0.setRangeAxis(valueAxis4);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getDomainMarkers((int) (short) -1, layer7);
        java.awt.Stroke stroke9 = categoryPlot0.getDomainGridlineStroke();
        boolean boolean10 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot0.getDomainAxisEdge(8);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot3.setRangeAxis((int) (byte) 100, valueAxis5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot3.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation7);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        int int10 = categoryPlot0.getDomainAxisIndex(categoryAxis9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getInsets();
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        org.jfree.chart.LegendItemCollection legendItemCollection28 = categoryPlot15.getFixedLegendItems();
        boolean boolean29 = categoryPlot15.isDomainZoomable();
        org.jfree.chart.util.Layer layer30 = null;
        java.util.Collection collection31 = categoryPlot15.getRangeMarkers(layer30);
        categoryPlot15.setBackgroundImageAlignment((int) (short) 0);
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
        categoryPlot15.setRangeAxes(valueAxisArray44);
        categoryPlot0.setRangeAxes(valueAxisArray44);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(legendItemCollection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(collection31);
        org.junit.Assert.assertNull(categoryItemRenderer40);
        org.junit.Assert.assertNotNull(valueAxisArray44);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers(1, layer9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.axis.AxisSpace axisSpace14 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNull(axisSpace14);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setAxisOffset(rectangleInsets14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean10 = categoryPlot0.isDomainZoomable();
        java.lang.Object obj11 = null;
        boolean boolean12 = categoryPlot0.equals(obj11);
        org.jfree.chart.plot.Plot plot13 = categoryPlot0.getRootPlot();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        boolean boolean18 = categoryPlot0.render(graphics2D14, rectangle2D15, (int) (short) 1, plotRenderingInfo17);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        categoryPlot0.removeChangeListener(plotChangeListener8);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(axisLocation7);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        categoryPlot0.setRangeCrosshairValue((double) '4', false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        categoryPlot0.removeChangeListener(plotChangeListener18);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        categoryPlot21.setRangeAxis((int) (byte) 100, valueAxis23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        boolean boolean29 = categoryPlot21.render(graphics2D25, rectangle2D26, (int) (byte) 100, plotRenderingInfo28);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = categoryPlot21.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = categoryPlot21.getDomainMarkers(layer32);
        categoryPlot21.clearDomainMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot21.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation((int) 'a', axisLocation35, true);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(categoryItemRenderer31);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertNotNull(axisLocation35);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.util.List list4 = categoryPlot0.getCategories();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean6 = categoryPlot5.isRangeZoomable();
        categoryPlot5.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder10 = categoryPlot5.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder10);
        java.awt.Paint paint12 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        java.util.List list14 = categoryPlot0.getCategoriesForAxis(categoryAxis13);
        boolean boolean15 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot16.setRangeAxis((int) (byte) 100, valueAxis18);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot16.getDomainMarkers((int) (byte) 10, layer21);
        org.jfree.chart.axis.AxisSpace axisSpace23 = null;
        categoryPlot16.setFixedRangeAxisSpace(axisSpace23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot16.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo27, point2D28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = categoryPlot16.getDataset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        categoryPlot16.zoomDomainAxes((double) (byte) 0, plotRenderingInfo32, point2D33, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation36 = categoryPlot16.getOrientation();
        categoryPlot0.setOrientation(plotOrientation36);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertNull(categoryDataset30);
        org.junit.Assert.assertNotNull(plotOrientation36);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        categoryPlot0.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        categoryPlot16.clearRangeMarkers();
        categoryPlot16.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke22 = categoryPlot16.getRangeGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        java.awt.geom.Point2D point2D41 = null;
        categoryPlot0.zoomRangeAxes((double) (-1L), plotRenderingInfo40, point2D41, false);
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
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        categoryPlot0.clearRangeMarkers((int) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset(8);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot0.setRangeAxis(101, valueAxis12, true);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo4, point2D5, false);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        boolean boolean9 = categoryPlot0.isDomainZoomable();
        categoryPlot0.clearRangeMarkers();
        int int11 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        categoryPlot0.notifyListeners(plotChangeEvent17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot0.setRangeAxis(15, valueAxis20);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        categoryPlot22.setRangeAxis((int) (byte) 100, valueAxis24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        boolean boolean30 = categoryPlot22.render(graphics2D26, rectangle2D27, (int) (byte) 100, plotRenderingInfo29);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = categoryPlot22.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer33 = null;
        java.util.Collection collection34 = categoryPlot22.getDomainMarkers(layer33);
        categoryPlot22.clearDomainMarkers();
        java.lang.Object obj36 = categoryPlot22.clone();
        categoryPlot22.clearRangeAxes();
        categoryPlot22.setBackgroundAlpha((-1.0f));
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = categoryPlot22.getAxisOffset();
        categoryPlot0.setInsets(rectangleInsets40);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(categoryItemRenderer32);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(rectangleInsets40);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot0.zoomDomainAxes((double) 8, (double) 10, plotRenderingInfo28, point2D29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation25);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor20 = categoryPlot9.getDomainGridlinePosition();
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot9.getRangeAxisLocation();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(categoryAnchor20);
        org.junit.Assert.assertNotNull(axisLocation21);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent29 = null;
        categoryPlot0.axisChanged(axisChangeEvent29);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        categoryPlot0.setDataset((int) (byte) 1, categoryDataset15);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        categoryPlot0.setOutlineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(valueAxis8);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getRangeMarkers((int) (byte) -1, layer13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(collection14);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot0.drawBackgroundImage(graphics2D14, rectangle2D15);
        categoryPlot0.configureRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset19 = categoryPlot0.getDataset((int) '4');
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = categoryPlot0.getDomainAxisForDataset((int) '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNull(categoryAxis21);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        categoryPlot0.clearRangeMarkers((int) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset(8);
        float float11 = categoryPlot0.getBackgroundImageAlpha();
        boolean boolean12 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        int int9 = categoryPlot0.getRangeAxisIndex(valueAxis8);
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        categoryPlot0.removeChangeListener(plotChangeListener10);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        categoryPlot0.notifyListeners(plotChangeEvent13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        categoryPlot15.setDataset(categoryDataset18);
        categoryPlot15.setWeight(10);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot15.getColumnRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder22);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot24.configureRangeAxes();
        categoryPlot24.clearDomainMarkers();
        categoryPlot24.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset30 = categoryPlot24.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent31 = null;
        categoryPlot24.rendererChanged(rendererChangeEvent31);
        java.awt.Font font33 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot24.setNoDataMessageFont(font33);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot36.configureRangeAxes();
        categoryPlot36.clearRangeMarkers();
        categoryPlot36.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke42 = categoryPlot36.getRangeGridlineStroke();
        double double43 = categoryPlot36.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        categoryPlot36.drawBackgroundImage(graphics2D44, rectangle2D45);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer47 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray48 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer47 };
        categoryPlot36.setRenderers(categoryItemRendererArray48);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier50 = categoryPlot36.getDrawingSupplier();
        categoryPlot36.clearDomainMarkers((int) ' ');
        categoryPlot36.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis55 = categoryPlot36.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot56 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot56.configureRangeAxes();
        categoryPlot56.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot59 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        categoryPlot59.setRangeAxis((int) (byte) 100, valueAxis61);
        org.jfree.chart.axis.AxisLocation axisLocation63 = categoryPlot59.getRangeAxisLocation();
        categoryPlot56.setDomainAxisLocation(axisLocation63);
        categoryPlot56.clearRangeMarkers();
        categoryPlot36.setParent((org.jfree.chart.plot.Plot) categoryPlot56);
        org.jfree.chart.axis.AxisLocation axisLocation67 = categoryPlot56.getDomainAxisLocation();
        categoryPlot24.setRangeAxisLocation(1, axisLocation67);
        categoryPlot0.setRangeAxisLocation(axisLocation67);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertNull(categoryDataset30);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray48);
        org.junit.Assert.assertNotNull(drawingSupplier50);
        org.junit.Assert.assertNull(valueAxis55);
        org.junit.Assert.assertNotNull(axisLocation63);
        org.junit.Assert.assertNotNull(axisLocation67);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(0);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset(categoryDataset12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxis();
        int int15 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot0.getColumnRenderingOrder();
        java.awt.Paint paint17 = categoryPlot0.getRangeCrosshairPaint();
        float float18 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(collection28);
        org.junit.Assert.assertNotNull(drawingSupplier31);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        categoryPlot0.axisChanged(axisChangeEvent7);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        categoryPlot0.clearAnnotations();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        int int22 = categoryPlot0.getRangeAxisIndex(valueAxis21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder5 = categoryPlot0.getDatasetRenderingOrder();
        int int6 = categoryPlot0.getDatasetCount();
        categoryPlot0.setBackgroundImageAlignment((int) ' ');
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(10, valueAxis15, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot18.configureRangeAxes();
        categoryPlot18.clearRangeMarkers();
        categoryPlot18.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke24 = categoryPlot18.getRangeGridlineStroke();
        double double25 = categoryPlot18.getRangeCrosshairValue();
        java.util.List list26 = categoryPlot18.getCategories();
        java.awt.Image image27 = null;
        categoryPlot18.setBackgroundImage(image27);
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        categoryPlot18.setDomainAxis((int) (byte) 100, categoryAxis30);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent32 = null;
        categoryPlot18.rendererChanged(rendererChangeEvent32);
        org.jfree.chart.axis.ValueAxis valueAxis35 = categoryPlot18.getRangeAxis((int) '4');
        java.awt.Paint paint36 = categoryPlot18.getDomainGridlinePaint();
        categoryPlot0.setOutlinePaint(paint36);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNull(list26);
        org.junit.Assert.assertNull(valueAxis35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        categoryPlot15.setDataset(categoryDataset18);
        categoryPlot15.setWeight(10);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot15.getColumnRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder22);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot0.markerChanged(markerChangeEvent24);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(sortOrder22);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo8, point2D9, false);
        categoryPlot0.setWeight((int) (byte) -1);
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        categoryPlot0.clearRangeMarkers((int) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset(8);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis12 };
        categoryPlot11.setDomainAxes(categoryAxisArray13);
        float float15 = categoryPlot11.getBackgroundAlpha();
        categoryPlot11.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot11.getDomainAxisForDataset((int) '#');
        boolean boolean21 = categoryPlot11.isOutlineVisible();
        float float22 = categoryPlot11.getForegroundAlpha();
        java.awt.Image image23 = null;
        categoryPlot11.setBackgroundImage(image23);
        boolean boolean25 = categoryPlot0.equals((java.lang.Object) categoryPlot11);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot0.getRendererForDataset(categoryDataset26);
        org.jfree.chart.axis.AxisSpace axisSpace28 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace28);
        org.jfree.chart.axis.AxisSpace axisSpace30 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(categoryItemRenderer27);
        org.junit.Assert.assertNull(axisSpace30);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((int) (short) 10);
        java.lang.Object obj15 = categoryPlot0.clone();
        categoryPlot0.setAnchorValue((double) (short) 10, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 0, 1);
        org.jfree.chart.util.SortOrder sortOrder10 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(sortOrder10);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (-1L), plotRenderingInfo11, point2D12, true);
        java.awt.Paint paint15 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.util.List list4 = categoryPlot0.getCategories();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean6 = categoryPlot5.isRangeZoomable();
        categoryPlot5.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder10 = categoryPlot5.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder10);
        java.awt.Image image12 = null;
        categoryPlot0.setBackgroundImage(image12);
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        categoryPlot0.mapDatasetToDomainAxis((int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        categoryPlot14.clearDomainMarkers();
        categoryPlot14.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset20 = categoryPlot14.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        categoryPlot14.removeChangeListener(plotChangeListener21);
        java.awt.Paint paint23 = categoryPlot14.getBackgroundPaint();
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        categoryPlot14.setFixedRangeAxisSpace(axisSpace24);
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot14.getRangeAxisLocation();
        org.jfree.chart.util.SortOrder sortOrder27 = categoryPlot14.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder27);
        java.awt.Image image29 = null;
        categoryPlot0.setBackgroundImage(image29);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNotNull(sortOrder27);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        java.awt.Paint paint11 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace5);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8);
        categoryPlot0.setDomainGridlinesVisible(true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(drawingSupplier4);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean10 = categoryPlot0.isDomainZoomable();
        boolean boolean11 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = categoryPlot18.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.configureRangeAxes();
        categoryPlot22.clearRangeMarkers();
        boolean boolean25 = categoryPlot22.isOutlineVisible();
        categoryPlot22.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        categoryPlot22.setRenderer(categoryItemRenderer28);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot22.getDomainAxisLocation();
        categoryPlot18.setRangeAxisLocation((int) (short) 0, axisLocation30, false);
        categoryPlot0.setDomainAxisLocation(axisLocation30, true);
        org.jfree.chart.util.Layer layer36 = null;
        java.util.Collection collection37 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer36);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNull(collection37);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        java.awt.Stroke stroke15 = categoryPlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        categoryPlot0.setDataset(categoryDataset16);
        double double18 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        boolean boolean24 = categoryPlot0.getDrawSharedDomainAxis();
        java.awt.Paint paint25 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        org.jfree.data.category.CategoryDataset categoryDataset33 = categoryPlot20.getDataset();
        categoryPlot20.clearDomainMarkers((int) (byte) -1);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNull(categoryDataset33);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        boolean boolean5 = categoryPlot0.isRangeZoomable();
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        int int16 = categoryPlot0.getWeight();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        float float22 = categoryPlot17.getForegroundAlpha();
        int int23 = categoryPlot17.getWeight();
        org.jfree.chart.plot.Plot plot24 = categoryPlot17.getRootPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.configureRangeAxes();
        categoryPlot25.clearDomainMarkers();
        categoryPlot25.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset31 = categoryPlot25.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent32 = null;
        categoryPlot25.rendererChanged(rendererChangeEvent32);
        java.awt.Font font34 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot25.setNoDataMessageFont(font34);
        categoryPlot17.setNoDataMessageFont(font34);
        categoryPlot0.setNoDataMessageFont(font34);
        java.lang.Object obj38 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertNull(categoryDataset31);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getRangeAxisLocation();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(axisLocation7);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray9);
        java.awt.Paint paint11 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 1);
        org.jfree.chart.axis.AxisSpace axisSpace15 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(axisSpace15);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        java.util.List list28 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categoryDataset27);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Paint paint11 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        categoryPlot12.setRangeAxis((int) (byte) 100, valueAxis14);
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot12.getDomainMarkers((int) (byte) 10, layer17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        categoryPlot12.setFixedRangeAxisSpace(axisSpace19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot12.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo23, point2D24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = categoryPlot12.getDataset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot12.zoomDomainAxes((double) (byte) 0, plotRenderingInfo28, point2D29, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation32 = categoryPlot12.getOrientation();
        categoryPlot0.setOrientation(plotOrientation32);
        boolean boolean34 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge36 = categoryPlot0.getDomainAxisEdge(15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(categoryDataset26);
        org.junit.Assert.assertNotNull(plotOrientation32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(rectangleEdge36);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        org.jfree.chart.plot.Marker marker16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot19.getDomainAxis();
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot19.getDomainAxisLocation(0);
        categoryPlot0.setDomainAxisLocation(axisLocation22, false);
        float float25 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categoryAxis20);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((int) (short) 10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        categoryPlot0.addChangeListener(plotChangeListener15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleEdge14);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = categoryPlot0.getRangeAxisIndex(valueAxis16);
        java.awt.Stroke stroke18 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        boolean boolean8 = categoryPlot0.isDomainZoomable();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        int int15 = categoryPlot14.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot14.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (byte) 100, axisLocation16, true);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        boolean boolean16 = categoryPlot8.render(graphics2D12, rectangle2D13, (int) (byte) 100, plotRenderingInfo15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot8.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot8.setRenderer((int) 'a', categoryItemRenderer20, false);
        categoryPlot8.setRangeCrosshairVisible(true);
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
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder37 = categoryPlot25.getDatasetRenderingOrder();
        categoryPlot8.setDatasetRenderingOrder(datasetRenderingOrder37);
        java.awt.Image image39 = null;
        categoryPlot8.setBackgroundImage(image39);
        boolean boolean41 = categoryPlot0.equals((java.lang.Object) categoryPlot8);
        java.awt.Paint paint42 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryItemRenderer18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(datasetRenderingOrder37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) 10L, plotRenderingInfo8, point2D9, false);
        categoryPlot0.clearRangeMarkers();
        boolean boolean13 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer(0);
        java.awt.Font font11 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        categoryPlot0.axisChanged(axisChangeEvent14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        categoryPlot0.addChangeListener(plotChangeListener16);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        categoryPlot0.setRenderer(categoryItemRenderer6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearDomainMarkers();
        categoryPlot8.setWeight((-1));
        java.util.List list13 = categoryPlot8.getCategories();
        org.jfree.chart.util.SortOrder sortOrder14 = categoryPlot8.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot15.zoomRangeAxes((-1.0d), plotRenderingInfo18, point2D19, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor22 = categoryPlot15.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot15.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = categoryPlot15.getAxisOffset();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        categoryPlot26.setRangeAxis((int) (byte) 100, valueAxis28);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot26.getRangeAxisLocation();
        categoryPlot26.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean34 = categoryPlot33.isRangeZoomable();
        categoryPlot33.setAnchorValue(100.0d, false);
        float float38 = categoryPlot33.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray41 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis40 };
        categoryPlot39.setDomainAxes(categoryAxisArray41);
        java.awt.Stroke stroke43 = categoryPlot39.getOutlineStroke();
        categoryPlot33.setRangeCrosshairStroke(stroke43);
        categoryPlot26.setRangeGridlineStroke(stroke43);
        categoryPlot15.setRangeCrosshairStroke(stroke43);
        categoryPlot8.setRangeGridlineStroke(stroke43);
        categoryPlot0.setOutlineStroke(stroke43);
        java.awt.Paint paint49 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNotNull(categoryAnchor22);
        org.junit.Assert.assertNotNull(rectangleEdge24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray41);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        java.awt.Paint paint11 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 10, plotRenderingInfo13, point2D14, false);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        org.jfree.chart.axis.ValueAxis[] valueAxisArray13 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray13);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor15 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNotNull(categoryAnchor15);
        org.junit.Assert.assertNull(legendItemCollection16);
        org.junit.Assert.assertNull(legendItemCollection17);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        int int8 = categoryPlot0.getWeight();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot9.getDataset((int) (short) 1);
        categoryPlot9.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot9.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = categoryPlot9.getInsets();
        categoryPlot0.setInsets(rectangleInsets14, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = categoryPlot0.removeAnnotation(categoryAnnotation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        categoryPlot0.setWeight((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation();
        boolean boolean7 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent8 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent8);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.data.Range range15 = categoryPlot0.getDataRange(valueAxis14);
        categoryPlot0.mapDatasetToDomainAxis(15, (int) 'a');
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNull(range15);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        java.util.List list9 = categoryPlot0.getCategories();
        java.lang.String str10 = categoryPlot0.getNoDataMessage();
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.clearDomainMarkers((int) (byte) 100);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot0.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        categoryPlot0.addChangeListener(plotChangeListener17);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        java.util.List list20 = categoryPlot0.getCategoriesForAxis(categoryAxis19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot0.setRenderer(categoryItemRenderer19, false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(0);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset(categoryDataset12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxis();
        int int15 = categoryPlot0.getDatasetCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        categoryPlot16.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot19.setRangeAxis((int) (byte) 100, valueAxis21);
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot19.getRangeAxisLocation();
        categoryPlot16.setDomainAxisLocation(axisLocation23);
        categoryPlot16.clearRangeMarkers();
        int int26 = categoryPlot16.getDatasetCount();
        java.awt.Image image27 = null;
        categoryPlot16.setBackgroundImage(image27);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray29 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot16.setRangeAxes(valueAxisArray29);
        categoryPlot0.setRangeAxes(valueAxisArray29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray29);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer(15);
        boolean boolean12 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        categoryPlot0.setDomainAxis(categoryAxis15);
        org.junit.Assert.assertNull(categoryAxis14);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation();
        java.awt.Paint paint16 = null;
        categoryPlot0.setOutlinePaint(paint16);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        boolean boolean9 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean11 = categoryPlot10.isRangeZoomable();
        categoryPlot10.setAnchorValue(100.0d, false);
        float float15 = categoryPlot10.getForegroundAlpha();
        int int16 = categoryPlot10.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis18, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray23 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis22 };
        categoryPlot21.setDomainAxes(categoryAxisArray23);
        categoryPlot21.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot21.getDomainAxisLocation(100);
        categoryPlot10.setRangeAxisLocation(axisLocation28, false);
        float float31 = categoryPlot10.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot32.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot32.zoomRangeAxes((-1.0d), plotRenderingInfo35, point2D36, false);
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        categoryPlot32.setRangeAxis(valueAxis39);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray41 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot32.setRenderers(categoryItemRendererArray41);
        categoryPlot10.setRenderers(categoryItemRendererArray41);
        org.jfree.chart.util.RectangleEdge rectangleEdge45 = categoryPlot10.getDomainAxisEdge((int) (short) 0);
        categoryPlot10.configureDomainAxes();
        categoryPlot10.setBackgroundAlpha(0.0f);
        categoryPlot10.clearRangeMarkers();
        java.awt.Stroke stroke50 = categoryPlot10.getOutlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke50);
        org.jfree.chart.axis.ValueAxis valueAxis53 = categoryPlot0.getRangeAxisForDataset((int) (short) 0);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray23);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
        org.junit.Assert.assertNotNull(categoryItemRendererArray41);
        org.junit.Assert.assertNotNull(rectangleEdge45);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNull(valueAxis53);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        int int11 = categoryPlot0.getWeight();
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
        boolean boolean26 = categoryPlot12.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder27 = categoryPlot12.getDatasetRenderingOrder();
        int int28 = categoryPlot12.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot12.getRangeAxisLocation((int) '#');
        categoryPlot0.setDomainAxisLocation(axisLocation30, true);
        org.jfree.chart.plot.Marker marker33 = null;
        org.jfree.chart.util.Layer layer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker33, layer34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(legendItemCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(axisLocation30);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot0.getInsets();
        int int9 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(legendItemCollection14);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        java.awt.Paint paint11 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getDomainAxisLocation(100);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getDomainMarkers((int) 'a', layer15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        int int24 = categoryPlot0.getWeight();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(categoryAnchor18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setBackgroundImageAlignment((int) (byte) 1);
        categoryPlot0.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(legendItemCollection10);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot0.setDomainAxis(100, categoryAxis12);
        categoryPlot0.setBackgroundImageAlpha((float) 1);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot17.setRangeAxis((int) (byte) 100, valueAxis19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        boolean boolean25 = categoryPlot17.render(graphics2D21, rectangle2D22, (int) (byte) 100, plotRenderingInfo24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot17.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = categoryPlot17.getDomainMarkers(layer28);
        categoryPlot17.clearDomainMarkers();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        categoryPlot17.drawBackgroundImage(graphics2D31, rectangle2D32);
        categoryPlot17.configureRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset36 = categoryPlot17.getDataset((int) '4');
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        categoryPlot37.setRangeAxis((int) (byte) 100, valueAxis39);
        boolean boolean41 = categoryPlot37.isOutlineVisible();
        categoryPlot37.setRangeCrosshairLockedOnData(true);
        boolean boolean44 = categoryPlot37.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = categoryPlot37.getDomainAxisForDataset(0);
        categoryPlot37.setDrawSharedDomainAxis(true);
        java.awt.Paint paint49 = categoryPlot37.getDomainGridlinePaint();
        categoryPlot17.setDomainGridlinePaint(paint49);
        categoryPlot0.setBackgroundPaint(paint49);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(categoryItemRenderer27);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertNull(categoryDataset36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(categoryAxis46);
        org.junit.Assert.assertNotNull(paint49);
    }
}

