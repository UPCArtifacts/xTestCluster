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
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        org.jfree.data.general.DatasetGroup datasetGroup10 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNull(datasetGroup10);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryPlot0.getInsets();
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot17.setRangeAxis((int) (byte) 100, valueAxis19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        boolean boolean25 = categoryPlot17.render(graphics2D21, rectangle2D22, (int) (byte) 100, plotRenderingInfo24);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot17.setRangeAxis((int) (short) 0, valueAxis27);
        java.awt.Paint paint29 = categoryPlot17.getRangeGridlinePaint();
        categoryPlot0.setDomainGridlinePaint(paint29);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.util.List list8 = categoryPlot0.getCategories();
        org.jfree.chart.plot.CategoryMarker categoryMarker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        categoryPlot0.setRangeCrosshairValue((double) 0.0f, true);
        java.lang.Object obj17 = categoryPlot0.clone();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getRootPlot();
        org.jfree.chart.axis.ValueAxis valueAxis4 = categoryPlot0.getRangeAxisForDataset(101);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNull(valueAxis4);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        categoryPlot0.clearDomainMarkers((int) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset18 = categoryPlot0.getDataset();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categoryDataset18);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace14);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder5 = categoryPlot0.getDatasetRenderingOrder();
        int int6 = categoryPlot0.getDatasetCount();
        java.util.List list7 = categoryPlot0.getCategories();
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.setWeight((int) (byte) 10);
        float float11 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot0.setRangeAxis((int) (short) 0, valueAxis13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setWeight((-1));
        java.util.List list5 = categoryPlot0.getCategories();
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.plot.CategoryMarker categoryMarker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list5);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        java.awt.Paint paint16 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot0.zoomRangeAxes((double) 100, plotRenderingInfo18, point2D19, false);
        org.jfree.chart.plot.Marker marker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) 1, marker23, layer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray9);
        java.awt.Paint paint11 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getDomainAxisLocation(101);
        float float14 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        java.util.List list7 = categoryPlot0.getCategories();
        double double8 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        java.awt.Image image8 = categoryPlot0.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset9 = categoryPlot0.getDataset();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNull(categoryDataset9);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = categoryPlot0.getLegendItems();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection6);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean9 = categoryPlot8.isRangeZoomable();
        categoryPlot8.setAnchorValue(100.0d, false);
        float float13 = categoryPlot8.getForegroundAlpha();
        int int14 = categoryPlot8.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis16, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray21 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis20 };
        categoryPlot19.setDomainAxes(categoryAxisArray21);
        categoryPlot19.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot19.getDomainAxisLocation(100);
        categoryPlot8.setRangeAxisLocation(axisLocation26, false);
        float float29 = categoryPlot8.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        categoryPlot30.zoomRangeAxes((-1.0d), plotRenderingInfo33, point2D34, false);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        categoryPlot30.setRangeAxis(valueAxis37);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray39 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot30.setRenderers(categoryItemRendererArray39);
        categoryPlot8.setRenderers(categoryItemRendererArray39);
        categoryPlot0.setRenderers(categoryItemRendererArray39);
        java.awt.Stroke stroke43 = categoryPlot0.getOutlineStroke();
        java.awt.Image image44 = null;
        categoryPlot0.setBackgroundImage(image44);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.5f + "'", float29 == 0.5f);
        org.junit.Assert.assertNotNull(categoryItemRendererArray39);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        int int26 = categoryPlot0.getRangeAxisIndex(valueAxis25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(0);
        int int10 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis(categoryAxis11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) 1L, plotRenderingInfo14, point2D15, false);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot0.getRangeMarkers(1, layer19);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.data.Range range22 = categoryPlot0.getDataRange(valueAxis21);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNull(range22);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(categoryAnchor7);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.lang.Class<?> wildcardClass13 = paint12.getClass();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis(categoryAxis11);
        boolean boolean13 = categoryPlot0.isDomainZoomable();
        categoryPlot0.setRangeCrosshairValue((double) '#', false);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        int int12 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNull(categoryDataset14);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        categoryPlot0.setBackgroundImageAlpha((float) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomDomainAxes(1.0d, plotRenderingInfo17, point2D18);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        categoryPlot9.zoomDomainAxes(1.0d, plotRenderingInfo21, point2D22);
        int int24 = categoryPlot9.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot24.configureRangeAxes();
        categoryPlot24.clearRangeMarkers();
        boolean boolean27 = categoryPlot24.isOutlineVisible();
        categoryPlot24.setRangeGridlinesVisible(false);
        categoryPlot24.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot32.configureRangeAxes();
        categoryPlot32.clearRangeMarkers();
        boolean boolean35 = categoryPlot32.isOutlineVisible();
        categoryPlot32.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        categoryPlot32.setRenderer(categoryItemRenderer38);
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot32.getDomainAxisLocation();
        categoryPlot24.setRangeAxisLocation(axisLocation40);
        categoryPlot0.setRangeAxisLocation(8, axisLocation40, false);
        org.jfree.chart.util.SortOrder sortOrder44 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(sortOrder18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertNotNull(sortOrder44);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot0.getDomainAxisLocation();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo4, point2D5, false);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        categoryPlot0.axisChanged(axisChangeEvent9);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.removeChangeListener(plotChangeListener11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(axisSpace8);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        int int11 = categoryPlot0.getWeight();
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(0);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNull(collection14);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        int int20 = categoryPlot0.getIndexOf(categoryItemRenderer19);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.awt.Image image23 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(image23);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        categoryPlot0.setOutlineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(valueAxis8);
        java.util.List list10 = categoryPlot0.getAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset(1, categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        categoryPlot0.setAnchorValue((double) '#', false);
        org.junit.Assert.assertNull(collection6);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.plot.Plot plot7 = categoryPlot0.getRootPlot();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes(1.0d, plotRenderingInfo11, point2D12, false);
        categoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plot7);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getAxisOffset();
        boolean boolean12 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot0.getDomainAxisForDataset((int) ' ');
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(categoryAxis14);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        java.awt.Paint paint2 = categoryPlot0.getBackgroundPaint();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        categoryPlot0.drawBackgroundImage(graphics2D3, rectangle2D4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        categoryPlot0.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        int int10 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean12 = categoryPlot11.isRangeZoomable();
        categoryPlot11.setAnchorValue(100.0d, false);
        float float16 = categoryPlot11.getForegroundAlpha();
        int int17 = categoryPlot11.getWeight();
        org.jfree.chart.plot.Plot plot18 = categoryPlot11.getRootPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        categoryPlot19.clearDomainMarkers();
        categoryPlot19.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot19.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent26 = null;
        categoryPlot19.rendererChanged(rendererChangeEvent26);
        java.awt.Font font28 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot19.setNoDataMessageFont(font28);
        categoryPlot11.setNoDataMessageFont(font28);
        categoryPlot0.setNoDataMessageFont(font28);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getDomainAxisLocation(100);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        categoryPlot0.zoomRangeAxes((double) 8, plotRenderingInfo15, point2D16);
        org.junit.Assert.assertNull(collection6);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        float float6 = categoryPlot0.getBackgroundAlpha();
        java.awt.Stroke stroke7 = categoryPlot0.getRangeCrosshairStroke();
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
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        java.awt.Stroke stroke36 = categoryPlot0.getRangeCrosshairStroke();
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
        org.junit.Assert.assertNotNull(stroke36);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        org.jfree.chart.plot.Plot plot15 = categoryPlot0.getParent();
        java.awt.Paint paint16 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxes(valueAxisArray17);
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
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot0.setRangeAxis((int) '#', valueAxis6, false);
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        java.awt.geom.Point2D point2D38 = null;
        categoryPlot0.zoomDomainAxes((double) 100.0f, (double) 0.0f, plotRenderingInfo37, point2D38);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(categoryDataset26);
        org.junit.Assert.assertNotNull(plotOrientation32);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot0.getFixedRangeAxisSpace();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(axisSpace9);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        categoryPlot0.setNoDataMessage("");
        boolean boolean13 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot0.setDomainAxis(categoryAxis14);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getDomainMarkers(layer16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(collection17);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        boolean boolean18 = categoryPlot0.render(graphics2D14, rectangle2D15, (int) '#', plotRenderingInfo17);
        java.awt.Image image19 = null;
        categoryPlot0.setBackgroundImage(image19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        java.awt.Paint paint7 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        boolean boolean21 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.configureRangeAxes();
        categoryPlot5.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis10);
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot8.getRangeAxisLocation();
        categoryPlot5.setDomainAxisLocation(axisLocation12);
        categoryPlot5.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis16 };
        categoryPlot15.setDomainAxes(categoryAxisArray17);
        java.awt.Stroke stroke19 = categoryPlot15.getOutlineStroke();
        categoryPlot15.clearRangeMarkers();
        float float21 = categoryPlot15.getBackgroundAlpha();
        java.awt.Stroke stroke22 = categoryPlot15.getRangeCrosshairStroke();
        categoryPlot5.setDomainGridlineStroke(stroke22);
        categoryPlot0.setRangeGridlineStroke(stroke22);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray28 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis27 };
        categoryPlot26.setDomainAxes(categoryAxisArray28);
        java.awt.Stroke stroke30 = categoryPlot26.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection31 = categoryPlot26.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge32 = categoryPlot26.getRangeAxisEdge();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        java.awt.geom.Point2D point2D35 = null;
        categoryPlot26.zoomDomainAxes((double) '#', plotRenderingInfo34, point2D35, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray41 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis40 };
        categoryPlot39.setDomainAxes(categoryAxisArray41);
        categoryPlot39.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation46 = categoryPlot39.getDomainAxisLocation(100);
        categoryPlot26.setRangeAxisLocation((int) 'a', axisLocation46);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (short) -1, axisLocation46, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(categoryAxisArray28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(legendItemCollection31);
        org.junit.Assert.assertNotNull(rectangleEdge32);
        org.junit.Assert.assertNotNull(categoryAxisArray41);
        org.junit.Assert.assertNotNull(axisLocation46);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        categoryPlot0.setDomainAxis((int) ' ', categoryAxis15);
        java.awt.Paint paint17 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(legendItemCollection18);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot0.setDomainAxis((int) (byte) 10, categoryAxis25);
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes(0.0d, (double) (short) 1, plotRenderingInfo11, point2D12);
        java.lang.Object obj14 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertNotNull(plotOrientation25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        java.lang.String str5 = categoryPlot0.getPlotType();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 100);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Category Plot" + "'", str5, "Category Plot");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot0.getRangeAxis((int) 'a');
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(valueAxis13);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        categoryPlot0.setDataset(categoryDataset19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot2.configureRangeAxes();
        categoryPlot2.clearRangeMarkers();
        categoryPlot2.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke8 = categoryPlot2.getRangeGridlineStroke();
        double double9 = categoryPlot2.getRangeCrosshairValue();
        java.awt.Paint paint10 = categoryPlot2.getBackgroundPaint();
        categoryPlot0.setNoDataMessagePaint(paint10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis((int) (byte) 10, categoryAxis13, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis((int) '4', categoryAxis17, false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.data.Range range16 = categoryPlot0.getDataRange(valueAxis15);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(range16);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        java.lang.String str17 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sortOrder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(axisSpace18);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        categoryPlot0.axisChanged(axisChangeEvent15);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
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
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.util.List list4 = categoryPlot0.getCategories();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset6, categoryAxis7, valueAxis8, categoryItemRenderer9);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot10.getDomainAxis();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot10.getDomainAxisLocation(0);
        categoryPlot0.setRangeAxisLocation(1, axisLocation13);
        boolean boolean15 = categoryPlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(categoryAxis11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        categoryPlot0.removeChangeListener(plotChangeListener3);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot0.getRenderer(15);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(categoryItemRenderer27);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.util.SortOrder sortOrder7 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(sortOrder7);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        categoryPlot0.setDataset((int) (byte) 1, categoryDataset19);
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        java.awt.Stroke stroke25 = categoryPlot0.getRangeGridlineStroke();
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        categoryPlot0.clearRangeMarkers((int) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset(8);
        boolean boolean11 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer9, true);
        org.jfree.chart.axis.AxisSpace axisSpace12 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(axisSpace12);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.util.List list4 = categoryPlot0.getCategories();
        categoryPlot0.setAnchorValue((double) 1L, false);
        categoryPlot0.clearAnnotations();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.data.Range range10 = categoryPlot0.getDataRange(valueAxis9);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNull(range10);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor29 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNotNull(categoryAnchor29);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor31 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
        org.junit.Assert.assertNotNull(categoryAnchor31);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        float float25 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        float float18 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        org.jfree.chart.plot.Marker marker24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        boolean boolean17 = categoryPlot0.isSubplot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot0.getRenderer();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryItemRenderer18);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        org.jfree.chart.plot.Marker marker26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryAxis13);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        org.jfree.chart.plot.Plot plot15 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        int int16 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        java.awt.Stroke stroke5 = null;
        categoryPlot0.setOutlineStroke(stroke5);
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(categoryAnchor18);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent2 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent2);
        java.awt.Paint paint4 = categoryPlot0.getRangeGridlinePaint();
        java.util.List list5 = categoryPlot0.getAnnotations();
        java.awt.Image image6 = null;
        categoryPlot0.setBackgroundImage(image6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(100, valueAxis8);
        java.awt.Stroke stroke10 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list16 = categoryPlot15.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot15.setRenderer(categoryItemRenderer17, true);
        java.awt.Paint paint20 = categoryPlot15.getRangeCrosshairPaint();
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot15.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation((int) (short) 0, axisLocation21);
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot0.getRangeAxisEdge((int) '4');
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(rectangleEdge24);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot0.getRangeMarkers(15, layer17);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(collection18);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot16.setRangeAxis((int) (byte) 100, valueAxis18);
        boolean boolean20 = categoryPlot16.isOutlineVisible();
        categoryPlot16.setRangeCrosshairLockedOnData(true);
        float float23 = categoryPlot16.getForegroundAlpha();
        int int24 = categoryPlot16.getWeight();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = categoryPlot16.getFixedLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        categoryPlot26.setRangeAxis((int) (byte) 100, valueAxis28);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        boolean boolean34 = categoryPlot26.render(graphics2D30, rectangle2D31, (int) (byte) 100, plotRenderingInfo33);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = categoryPlot26.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        categoryPlot26.setRenderer((int) 'a', categoryItemRenderer38, false);
        categoryPlot26.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation43 = categoryPlot26.getDomainAxisLocation();
        categoryPlot16.setDomainAxisLocation(axisLocation43);
        org.jfree.chart.axis.AxisLocation axisLocation46 = categoryPlot16.getRangeAxisLocation((int) '#');
        categoryPlot0.setRangeAxisLocation(15, axisLocation46, true);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(legendItemCollection25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(categoryItemRenderer36);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertNotNull(axisLocation46);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) '#');
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        float float11 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), plotRenderingInfo13, point2D14, false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        java.lang.String str11 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Category Plot" + "'", str11, "Category Plot");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        categoryPlot0.setRangeCrosshairValue((double) 'a');
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot0.getRangeAxisEdge();
        float float35 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(rectangleEdge31);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge11 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation9, plotOrientation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot23.setRangeAxis((int) (byte) 100, valueAxis25);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot23.getRangeAxisLocation();
        categoryPlot23.setBackgroundAlpha((float) (byte) 1);
        categoryPlot23.clearDomainMarkers(0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = categoryPlot23.getDrawingSupplier();
        boolean boolean33 = categoryPlot0.equals((java.lang.Object) drawingSupplier32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        categoryPlot0.clearAnnotations();
        categoryPlot0.setNoDataMessage("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 100, plotRenderingInfo27, point2D28);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.awt.Paint paint16 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot0.setRenderer(categoryItemRenderer17, true);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((int) (short) -1, valueAxis21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot0.zoomDomainAxes((double) 0L, (double) 0, plotRenderingInfo30, point2D31);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder24);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.util.List list4 = categoryPlot0.getCategories();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset6, categoryAxis7, valueAxis8, categoryItemRenderer9);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot10.getDomainAxis();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot10.getDomainAxisLocation(0);
        categoryPlot0.setRangeAxisLocation(1, axisLocation13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = categoryPlot0.getDataset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(categoryAxis11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNull(categoryDataset15);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        categoryPlot0.clearDomainMarkers(0);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis12);
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot10.getRangeAxisLocation();
        categoryPlot10.setBackgroundAlpha((float) (byte) 1);
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
        categoryPlot10.setRangeGridlineStroke(stroke27);
        org.jfree.chart.axis.AxisSpace axisSpace30 = null;
        categoryPlot10.setFixedRangeAxisSpace(axisSpace30);
        categoryPlot10.setDomainGridlinesVisible(true);
        org.jfree.chart.LegendItemCollection legendItemCollection34 = categoryPlot10.getLegendItems();
        java.awt.Stroke stroke35 = categoryPlot10.getDomainGridlineStroke();
        categoryPlot0.setOutlineStroke(stroke35);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(legendItemCollection34);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        categoryPlot0.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearDomainMarkers();
        categoryPlot11.setWeight((-1));
        java.util.List list16 = categoryPlot11.getCategories();
        org.jfree.chart.util.SortOrder sortOrder17 = categoryPlot11.getRowRenderingOrder();
        boolean boolean18 = categoryPlot11.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean20 = categoryPlot19.isRangeZoomable();
        categoryPlot19.setAnchorValue(100.0d, false);
        float float24 = categoryPlot19.getForegroundAlpha();
        int int25 = categoryPlot19.getWeight();
        org.jfree.chart.plot.Plot plot26 = categoryPlot19.getRootPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot27.configureRangeAxes();
        categoryPlot27.clearDomainMarkers();
        categoryPlot27.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset33 = categoryPlot27.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent34 = null;
        categoryPlot27.rendererChanged(rendererChangeEvent34);
        java.awt.Font font36 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot27.setNoDataMessageFont(font36);
        categoryPlot19.setNoDataMessageFont(font36);
        categoryPlot11.setNoDataMessageFont(font36);
        categoryPlot0.setNoDataMessageFont(font36);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNotNull(sortOrder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNull(categoryDataset33);
        org.junit.Assert.assertNotNull(font36);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomRangeAxes((double) 0, plotRenderingInfo19, point2D20, false);
        java.util.List list23 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        categoryPlot0.clearRangeMarkers((int) (short) 100);
        org.jfree.chart.axis.ValueAxis valueAxis19 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(valueAxis19);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        float float14 = categoryPlot10.getBackgroundAlpha();
        categoryPlot10.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot10.getDomainAxisForDataset((int) '#');
        boolean boolean20 = categoryPlot10.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot10.getDomainAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeAxisLocation(axisLocation22);
        org.jfree.chart.plot.CategoryMarker categoryMarker24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        int int22 = categoryPlot0.getDomainAxisIndex(categoryAxis21);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace7);
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getDomainMarkers(layer10);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxisForDataset((-1));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomRangeAxes((double) 100.0f, plotRenderingInfo14, point2D15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder22 = categoryPlot17.getDatasetRenderingOrder();
        int int23 = categoryPlot17.getDatasetCount();
        java.util.List list24 = categoryPlot17.getCategories();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot17.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation25);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot0.getDomainAxisEdge((int) ' ');
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(rectangleEdge28);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot0.getRenderer(8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(categoryItemRenderer9);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor5 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxis();
        boolean boolean7 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(categoryAnchor5);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        org.jfree.chart.axis.AxisSpace axisSpace17 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.PlotOrientation plotOrientation18 = categoryPlot0.getOrientation();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        categoryPlot0.removeChangeListener(plotChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNull(axisSpace17);
        org.junit.Assert.assertNotNull(plotOrientation18);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        categoryPlot0.clearDomainMarkers((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer19);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        float float8 = categoryPlot0.getBackgroundAlpha();
        java.lang.Object obj9 = categoryPlot0.clone();
        java.awt.Stroke stroke10 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot0.getRangeAxisEdge((int) (short) 1);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        categoryPlot0.setRangeCrosshairValue((double) '4', true);
        java.awt.Font font33 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(font33);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot0.getDomainMarkers(layer19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNull(collection20);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 100, plotRenderingInfo21, point2D22, true);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        categoryPlot0.notifyListeners(plotChangeEvent22);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(axisLocation20);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = categoryPlot0.removeAnnotation(categoryAnnotation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        boolean boolean7 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearRangeMarkers();
        categoryPlot11.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke17 = categoryPlot11.getRangeGridlineStroke();
        double double18 = categoryPlot11.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        categoryPlot11.drawBackgroundImage(graphics2D19, rectangle2D20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryPlot11.getInsets();
        plot10.setInsets(rectangleInsets22, false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = categoryPlot0.getDomainMarkers(layer25);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(collection26);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        java.awt.Image image19 = null;
        categoryPlot0.setBackgroundImage(image19);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray15 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis14 };
        categoryPlot13.setDomainAxes(categoryAxisArray15);
        float float17 = categoryPlot13.getBackgroundAlpha();
        categoryPlot13.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot13.getDomainAxisForDataset((int) '#');
        boolean boolean23 = categoryPlot13.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot13.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray26 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot13.setRangeAxes(valueAxisArray26);
        categoryPlot13.setRangeCrosshairValue(100.0d);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        categoryPlot30.zoomRangeAxes((-1.0d), plotRenderingInfo33, point2D34, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor37 = categoryPlot30.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = categoryPlot30.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot40.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        java.awt.geom.Point2D point2D44 = null;
        categoryPlot40.zoomRangeAxes((-1.0d), plotRenderingInfo43, point2D44, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor47 = categoryPlot40.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge49 = categoryPlot40.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = categoryPlot40.getAxisOffset();
        categoryPlot30.setInsets(rectangleInsets50);
        categoryPlot13.setAxisOffset(rectangleInsets50);
        categoryPlot0.setInsets(rectangleInsets50, true);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(valueAxisArray26);
        org.junit.Assert.assertNotNull(categoryAnchor37);
        org.junit.Assert.assertNotNull(rectangleEdge39);
        org.junit.Assert.assertNotNull(categoryAnchor47);
        org.junit.Assert.assertNotNull(rectangleEdge49);
        org.junit.Assert.assertNotNull(rectangleInsets50);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        boolean boolean18 = categoryPlot10.render(graphics2D14, rectangle2D15, (int) (byte) 100, plotRenderingInfo17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot10.setRangeAxis((int) (short) 0, valueAxis20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot10.getDomainAxisEdge(15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = categoryPlot10.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier24);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(drawingSupplier24);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers(layer9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        categoryPlot11.setDataset(categoryDataset14);
        categoryPlot11.setAnchorValue(0.0d);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean19 = categoryPlot18.isRangeZoomable();
        categoryPlot18.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        java.util.List list23 = categoryPlot18.getCategoriesForAxis(categoryAxis22);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent24 = null;
        categoryPlot18.axisChanged(axisChangeEvent24);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = categoryPlot18.getInsets();
        categoryPlot11.setAxisOffset(rectangleInsets26);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor28 = categoryPlot11.getDomainGridlinePosition();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor29 = categoryPlot11.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(categoryAnchor28);
        org.junit.Assert.assertNotNull(categoryAnchor29);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot0.setDomainAxis((int) '#', categoryAxis12);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder18 = categoryPlot15.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        java.awt.geom.Point2D point2D21 = null;
        categoryPlot15.zoomRangeAxes((double) 0L, plotRenderingInfo20, point2D21);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray23 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot15.setDomainAxes(categoryAxisArray23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = categoryPlot15.getDatasetGroup();
        java.awt.Paint paint26 = categoryPlot15.getBackgroundPaint();
        categoryPlot0.setNoDataMessagePaint(paint26);
        org.junit.Assert.assertNotNull(datasetRenderingOrder18);
        org.junit.Assert.assertNotNull(categoryAxisArray23);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D28, rectangle2D29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDataset((-1), categoryDataset29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
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
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categoryDataset27);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot0.getDomainAxis((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(categoryAxis17);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot0.zoomRangeAxes((double) 0.0f, plotRenderingInfo29, point2D30);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot0.setRenderer(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        categoryPlot0.clearDomainMarkers();
        java.util.List list7 = categoryPlot0.getAnnotations();
        categoryPlot0.setDrawSharedDomainAxis(false);
        java.awt.Font font10 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = categoryPlot0.getDomainMarkers((int) 'a', layer12);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(collection13);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        categoryPlot0.addChangeListener(plotChangeListener22);
        java.util.List list24 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        categoryPlot14.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot17.setRangeAxis((int) (byte) 100, valueAxis19);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot17.getRangeAxisLocation();
        categoryPlot14.setDomainAxisLocation(axisLocation21);
        categoryPlot14.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray26 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis25 };
        categoryPlot24.setDomainAxes(categoryAxisArray26);
        java.awt.Stroke stroke28 = categoryPlot24.getOutlineStroke();
        categoryPlot24.clearRangeMarkers();
        float float30 = categoryPlot24.getBackgroundAlpha();
        java.awt.Stroke stroke31 = categoryPlot24.getRangeCrosshairStroke();
        categoryPlot14.setDomainGridlineStroke(stroke31);
        categoryPlot0.setRangeCrosshairStroke(stroke31);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(categoryAxisArray26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean15 = categoryPlot14.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot14.setRangeAxis((int) (byte) 1, valueAxis17, false);
        categoryPlot14.clearRangeMarkers((int) (byte) -1);
        boolean boolean22 = categoryPlot0.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        categoryPlot0.setDomainAxis(categoryAxis4);
        boolean boolean6 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge();
        java.awt.Stroke stroke8 = categoryPlot0.getRangeCrosshairStroke();
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        org.jfree.chart.util.Layer layer39 = null;
        java.util.Collection collection40 = categoryPlot23.getDomainMarkers(layer39);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(categoryAnchor30);
        org.junit.Assert.assertNotNull(rectangleEdge31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertNull(collection40);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder5 = categoryPlot0.getDatasetRenderingOrder();
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
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent19 = null;
        categoryPlot7.rendererChanged(rendererChangeEvent19);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list23 = categoryPlot22.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot22.setRenderer(categoryItemRenderer24, true);
        java.awt.Paint paint27 = categoryPlot22.getRangeCrosshairPaint();
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot22.getDomainAxisLocation();
        categoryPlot7.setRangeAxisLocation((int) (short) 0, axisLocation28);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (byte) -1, axisLocation28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(axisLocation28);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        categoryPlot0.setRangeCrosshairValue((double) '4', true);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        java.util.List list34 = categoryPlot0.getCategoriesForAxis(categoryAxis33);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        categoryPlot0.addChangeListener(plotChangeListener22);
        java.util.List list24 = categoryPlot0.getCategories();
        java.lang.Object obj25 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        categoryPlot0.setRangeCrosshairValue((double) 1L);
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryMarker categoryMarker4 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray10 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis9 };
        categoryPlot8.setDomainAxes(categoryAxisArray10);
        java.awt.Stroke stroke12 = categoryPlot8.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot8.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot8.getRangeAxisEdge();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot8.zoomDomainAxes((double) '#', plotRenderingInfo16, point2D17, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray23 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis22 };
        categoryPlot21.setDomainAxes(categoryAxisArray23);
        categoryPlot21.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot21.getDomainAxisLocation(100);
        categoryPlot8.setRangeAxisLocation((int) 'a', axisLocation28);
        categoryPlot0.setDomainAxisLocation(axisLocation28, false);
        float float32 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNotNull(categoryAxisArray10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(categoryAxisArray23);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        boolean boolean9 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = categoryPlot0.removeAnnotation(categoryAnnotation26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(sortOrder18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(categoryAxis24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        categoryPlot0.clearDomainMarkers(15);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        java.awt.Stroke stroke9 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis(valueAxis10);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        java.awt.Stroke stroke25 = categoryPlot0.getDomainGridlineStroke();
        java.lang.Class<?> wildcardClass26 = stroke25.getClass();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(legendItemCollection24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        org.jfree.chart.util.Layer layer43 = null;
        java.util.Collection collection44 = categoryPlot0.getRangeMarkers((int) (short) 0, layer43);
        org.jfree.chart.axis.AxisSpace axisSpace45 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace45);
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
        org.junit.Assert.assertNull(collection44);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis10);
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot8.getRangeAxisLocation();
        categoryPlot8.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot8.setRangeAxis(valueAxis15);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot8.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        boolean boolean19 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        int int21 = categoryPlot0.getRangeAxisIndex(valueAxis20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo7, point2D8);
        double double10 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Image image11 = categoryPlot0.getBackgroundImage();
        java.awt.Paint paint12 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        org.jfree.chart.util.Layer layer34 = null;
        java.util.Collection collection35 = categoryPlot19.getRangeMarkers(layer34);
        categoryPlot19.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot38.configureRangeAxes();
        categoryPlot38.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        categoryPlot38.setDataset(categoryDataset41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer44 = categoryPlot38.getRendererForDataset(categoryDataset43);
        categoryPlot38.clearRangeMarkers((int) 'a');
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray48 = new org.jfree.chart.axis.ValueAxis[] { valueAxis47 };
        categoryPlot38.setRangeAxes(valueAxisArray48);
        categoryPlot19.setRangeAxes(valueAxisArray48);
        categoryPlot0.setRangeAxes(valueAxisArray48);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertNull(legendItemCollection18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(categoryItemRenderer29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(legendItemCollection32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(collection35);
        org.junit.Assert.assertNull(categoryItemRenderer44);
        org.junit.Assert.assertNotNull(valueAxisArray48);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        int int5 = categoryPlot4.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot4.getRangeAxisLocation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot4.getRenderer();
        categoryPlot4.setBackgroundAlpha((float) (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNull(categoryItemRenderer7);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        boolean boolean27 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot0.zoomDomainAxes((double) 101, plotRenderingInfo28, point2D29, false);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer53 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRenderer((-1), categoryItemRenderer53, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        categoryPlot9.clearDomainMarkers();
        categoryPlot9.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray16 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis15 };
        categoryPlot14.setDomainAxes(categoryAxisArray16);
        java.awt.Stroke stroke18 = categoryPlot14.getOutlineStroke();
        categoryPlot9.setRangeCrosshairStroke(stroke18);
        org.jfree.chart.util.SortOrder sortOrder20 = categoryPlot9.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        categoryPlot9.removeChangeListener(plotChangeListener21);
        java.awt.Paint paint23 = categoryPlot9.getNoDataMessagePaint();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot9.getRangeAxisLocation((int) (short) 10);
        categoryPlot0.setDomainAxisLocation((int) '#', axisLocation25, false);
        int int28 = categoryPlot0.getWeight();
        org.jfree.chart.plot.CategoryMarker categoryMarker29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(sortOrder20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        org.jfree.chart.util.SortOrder sortOrder13 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.Marker marker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNotNull(sortOrder13);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation24 = categoryPlot0.getOrientation();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(plotOrientation24);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        java.awt.Image image26 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = categoryPlot0.getDomainMarkers(layer27);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.configureRangeAxes();
        categoryPlot30.clearDomainMarkers();
        categoryPlot30.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray37 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis36 };
        categoryPlot35.setDomainAxes(categoryAxisArray37);
        java.awt.Stroke stroke39 = categoryPlot35.getOutlineStroke();
        categoryPlot30.setRangeCrosshairStroke(stroke39);
        java.lang.String str41 = categoryPlot30.getNoDataMessage();
        categoryPlot30.clearDomainAxes();
        org.jfree.chart.axis.AxisLocation axisLocation43 = categoryPlot30.getRangeAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((-1), axisLocation43, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
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
        org.junit.Assert.assertNull(image26);
        org.junit.Assert.assertNull(collection28);
        org.junit.Assert.assertNotNull(categoryAxisArray37);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(axisLocation43);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.setOutlineVisible(true);
        boolean boolean9 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset();
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot0.getRangeAxis((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertNull(valueAxis10);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) -1, plotRenderingInfo12, point2D13, false);
        java.awt.Stroke stroke16 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomDomainAxes((double) 1.0f, (double) 1.0f, plotRenderingInfo19, point2D20);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        categoryPlot0.clearDomainMarkers(0);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.configureRangeAxes();
        categoryPlot5.clearRangeMarkers();
        boolean boolean8 = categoryPlot5.isOutlineVisible();
        categoryPlot5.setRangeGridlinesVisible(false);
        categoryPlot5.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        categoryPlot13.clearRangeMarkers();
        boolean boolean16 = categoryPlot13.isOutlineVisible();
        categoryPlot13.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot13.setRenderer(categoryItemRenderer19);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot13.getDomainAxisLocation();
        categoryPlot5.setRangeAxisLocation(axisLocation21);
        categoryPlot0.setRangeAxisLocation((int) (short) 100, axisLocation21, true);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot0.getRangeMarkers(101, layer26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNull(collection27);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        boolean boolean26 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(sortOrder18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(categoryAxis24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        int int40 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray35);
        org.junit.Assert.assertNotNull(drawingSupplier37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor29 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(legendItemCollection9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(categoryAnchor29);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot0.setRenderer(categoryItemRenderer18, true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        categoryPlot0.setWeight((int) '#');
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        categoryPlot0.setDomainAxis((int) '#', categoryAxis15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        boolean boolean5 = categoryPlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot0.setDomainAxis((int) (byte) 10, categoryAxis25);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent27 = null;
        categoryPlot0.axisChanged(axisChangeEvent27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        categoryPlot0.setDataset(categoryDataset29);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        boolean boolean22 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        categoryPlot0.setAnchorValue((double) 1.0f, true);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        boolean boolean36 = categoryPlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.util.List list4 = categoryPlot0.getCategories();
        categoryPlot0.setAnchorValue((double) 1L, false);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 0, marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        categoryPlot20.clearDomainMarkers();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis(categoryAxis11);
        boolean boolean13 = categoryPlot0.isDomainZoomable();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer(categoryItemRenderer12);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        org.jfree.chart.util.SortOrder sortOrder27 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = categoryPlot0.getDomainMarkers(layer28);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNotNull(sortOrder27);
        org.junit.Assert.assertNull(collection29);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot11.setDomainAxis((int) '#', categoryAxis27);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis10, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes(10.0d, 0.0d, plotRenderingInfo15, point2D16);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        categoryPlot0.clearRangeMarkers(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot4.configureRangeAxes();
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = categoryPlot4.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder7);
        categoryPlot0.setWeight((int) (short) 10);
        int int11 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot0.setDomainAxis(categoryAxis12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        categoryPlot20.clearDomainMarkers();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot20.drawOutline(graphics2D37, rectangle2D38);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot0.setDomainAxis(categoryAxis8);
        java.lang.String str10 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Category Plot" + "'", str10, "Category Plot");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = categoryPlot15.getDataset((int) (short) 1);
        categoryPlot15.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = categoryPlot15.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier20);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(drawingSupplier20);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot15.zoomRangeAxes((-1.0d), plotRenderingInfo18, point2D19, false);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        categoryPlot15.setRangeAxis(valueAxis22);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        categoryPlot15.setRangeAxis(valueAxis24);
        categoryPlot15.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = categoryPlot15.getInsets();
        categoryPlot0.setAxisOffset(rectangleInsets27);
        float float29 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) 10L, plotRenderingInfo8, point2D9, false);
        categoryPlot0.configureDomainAxes();
        categoryPlot0.mapDatasetToDomainAxis(15, (int) (short) -1);
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.CategoryMarker categoryMarker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(100, categoryMarker20, layer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        int int9 = categoryPlot0.getRangeAxisIndex(valueAxis8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        categoryPlot10.clearDomainMarkers();
        categoryPlot10.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset16 = categoryPlot10.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        categoryPlot10.removeChangeListener(plotChangeListener17);
        java.awt.Paint paint19 = categoryPlot10.getBackgroundPaint();
        categoryPlot0.setNoDataMessagePaint(paint19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge((int) ' ');
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(rectangleEdge6);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(categoryAnchor17);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), plotRenderingInfo13, point2D14);
        java.lang.Object obj16 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset((int) (byte) 100);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = categoryPlot0.getRangeMarkers(layer12);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace15 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(collection13);
        org.junit.Assert.assertNull(axisSpace15);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        java.awt.Paint paint10 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(valueAxis11);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.util.List list18 = categoryPlot0.getCategories();
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
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        categoryPlot19.drawBackgroundImage(graphics2D33, rectangle2D34);
        categoryPlot19.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot38.configureRangeAxes();
        categoryPlot38.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        categoryPlot38.setDataset(categoryDataset41);
        categoryPlot38.setWeight(10);
        java.awt.Paint paint45 = categoryPlot38.getOutlinePaint();
        categoryPlot19.setBackgroundPaint(paint45);
        java.awt.Paint paint47 = categoryPlot19.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint47);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNull(list18);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(plotOrientation31);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        boolean boolean14 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis16 };
        categoryPlot15.setDomainAxes(categoryAxisArray17);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot15.setRangeAxis(valueAxis19);
        categoryPlot15.setWeight((int) (short) 10);
        java.awt.Paint paint23 = categoryPlot15.getOutlinePaint();
        categoryPlot0.setOutlinePaint(paint23);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder25 = categoryPlot0.getDatasetRenderingOrder();
        categoryPlot0.setAnchorValue((double) (short) -1, true);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(datasetRenderingOrder25);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        categoryPlot0.setOutlineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(valueAxis8);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.configureRangeAxes();
        categoryPlot12.clearRangeMarkers();
        categoryPlot12.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke18 = categoryPlot12.getRangeGridlineStroke();
        double double19 = categoryPlot12.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        categoryPlot12.drawBackgroundImage(graphics2D20, rectangle2D21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = categoryPlot12.getInsets();
        java.awt.Paint paint24 = categoryPlot12.getOutlinePaint();
        categoryPlot0.setDomainGridlinePaint(paint24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        categoryPlot0.setAnchorValue((double) 1.0f, false);
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        boolean boolean13 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        java.awt.geom.Point2D point2D38 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 10, plotRenderingInfo37, point2D38);
        int int40 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(categoryAxis33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace4);
        boolean boolean6 = categoryPlot0.isRangeGridlinesVisible();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        categoryPlot0.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.data.Range range18 = categoryPlot0.getDataRange(valueAxis17);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        categoryPlot0.setDomainAxis(10, categoryAxis20);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean23 = categoryPlot22.isRangeZoomable();
        org.jfree.chart.plot.Plot plot24 = categoryPlot22.getParent();
        categoryPlot22.configureRangeAxes();
        org.jfree.chart.axis.AxisSpace axisSpace26 = null;
        categoryPlot22.setFixedDomainAxisSpace(axisSpace26);
        boolean boolean28 = categoryPlot22.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot29.configureRangeAxes();
        categoryPlot29.clearDomainMarkers();
        categoryPlot29.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray36 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis35 };
        categoryPlot34.setDomainAxes(categoryAxisArray36);
        java.awt.Stroke stroke38 = categoryPlot34.getOutlineStroke();
        categoryPlot29.setRangeCrosshairStroke(stroke38);
        categoryPlot22.setDomainGridlineStroke(stroke38);
        categoryPlot0.setRangeGridlineStroke(stroke38);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray36);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        org.jfree.chart.axis.ValueAxis valueAxis16 = categoryPlot0.getRangeAxis((int) (byte) -1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(valueAxis16);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(categoryItemRenderer24);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = categoryPlot0.getInsets();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor5 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getDomainMarkers((int) 'a', layer8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(categoryAnchor5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation43 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = categoryPlot0.removeAnnotation(categoryAnnotation43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder28 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        categoryPlot0.setRangeCrosshairValue((double) 8);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(categoryDataset25);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        categoryPlot16.clearRangeMarkers();
        categoryPlot16.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke22 = categoryPlot16.getRangeGridlineStroke();
        double double23 = categoryPlot16.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        categoryPlot16.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray28 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer27 };
        categoryPlot16.setRenderers(categoryItemRendererArray28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = categoryPlot16.getDrawingSupplier();
        categoryPlot16.clearDomainMarkers((int) ' ');
        java.awt.Stroke stroke33 = categoryPlot16.getRangeGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke33);
        boolean boolean35 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray28);
        org.junit.Assert.assertNotNull(drawingSupplier30);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        java.awt.Paint paint29 = categoryPlot15.getRangeGridlinePaint();
        categoryPlot0.setOutlinePaint(paint29);
        java.lang.String str31 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(legendItemCollection28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Category Plot" + "'", str31, "Category Plot");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        categoryPlot0.addChangeListener(plotChangeListener22);
        categoryPlot0.setForegroundAlpha((-1.0f));
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        float float6 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.clearRangeAxes();
        java.util.List list8 = categoryPlot0.getAnnotations();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot9.setRangeAxis((int) (byte) 100, valueAxis11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        categoryPlot13.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder16 = categoryPlot13.getDatasetRenderingOrder();
        categoryPlot9.setDatasetRenderingOrder(datasetRenderingOrder16);
        categoryPlot9.setWeight((int) (short) 10);
        boolean boolean20 = categoryPlot0.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(datasetRenderingOrder16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        java.awt.Font font9 = categoryPlot0.getNoDataMessageFont();
        float float10 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder14 = categoryPlot11.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot11.zoomRangeAxes((double) 0L, plotRenderingInfo16, point2D17);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray19 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot11.setDomainAxes(categoryAxisArray19);
        categoryPlot0.setDomainAxes(categoryAxisArray19);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(datasetRenderingOrder14);
        org.junit.Assert.assertNotNull(categoryAxisArray19);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot1.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        categoryPlot1.zoomRangeAxes((-1.0d), plotRenderingInfo4, point2D5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot1.setRangeAxis(valueAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot1.setRangeAxis(valueAxis10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot12.getDataset((int) (short) 1);
        categoryPlot12.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor17 = categoryPlot12.getDomainGridlinePosition();
        categoryPlot1.setDomainGridlinePosition(categoryAnchor17);
        org.jfree.chart.axis.ValueAxis valueAxis19 = categoryPlot1.getRangeAxis();
        org.jfree.chart.axis.AxisSpace axisSpace20 = categoryPlot1.getFixedRangeAxisSpace();
        org.jfree.chart.plot.PlotOrientation plotOrientation21 = categoryPlot1.getOrientation();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge22 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNull(axisSpace20);
        org.junit.Assert.assertNotNull(plotOrientation21);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        java.lang.Class<?> wildcardClass18 = list17.getClass();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 1, plotRenderingInfo7, point2D8, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot0.setDomainAxis((int) '4', categoryAxis18, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = categoryPlot0.getRenderer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(categoryItemRenderer5);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        categoryPlot0.clearDomainMarkers(0);
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        java.awt.Paint paint19 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) 'a', layer8);
        categoryPlot0.clearRangeMarkers();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer9);
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        java.lang.Class<?> wildcardClass12 = paint11.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = null;
        categoryPlot0.setDomainAxis(10, categoryAxis42);
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
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot0.setDomainAxis((int) (byte) 10, categoryAxis25);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent27 = null;
        categoryPlot0.axisChanged(axisChangeEvent27);
        org.jfree.chart.plot.Plot plot29 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(plot29);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        int int29 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        float float7 = categoryPlot0.getBackgroundAlpha();
        java.lang.String str8 = categoryPlot0.getPlotType();
        java.lang.Object obj9 = categoryPlot0.clone();
        double double10 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Category Plot" + "'", str8, "Category Plot");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.AxisLocation axisLocation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation(axisLocation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(axisSpace9);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace4);
        boolean boolean6 = categoryPlot0.isRangeGridlinesVisible();
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
        categoryPlot0.setDomainGridlineStroke(stroke16);
        java.awt.Image image19 = null;
        categoryPlot0.setBackgroundImage(image19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        categoryPlot0.setRangeCrosshairValue(10.0d, false);
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairValue((double) 100L, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomRangeAxes(100.0d, plotRenderingInfo8, point2D9, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) ' ', plotRenderingInfo13, point2D14);
        org.junit.Assert.assertNull(datasetGroup3);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        java.lang.Object obj7 = categoryPlot0.clone();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        java.awt.Paint paint19 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Category Plot" + "'", str15, "Category Plot");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 10, categoryMarker19, layer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        java.lang.String str26 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(axisSpace24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        java.util.List list11 = categoryPlot0.getCategoriesForAxis(categoryAxis10);
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(axisSpace9);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers(1, layer9);
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo14, point2D15);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(axisLocation12);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray9 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot0.setRenderers(categoryItemRendererArray9);
        org.jfree.chart.axis.AxisSpace axisSpace11 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace11);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.util.List list8 = categoryPlot0.getCategories();
        java.util.List list9 = categoryPlot0.getCategories();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(list9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.awt.Paint paint33 = categoryPlot0.getNoDataMessagePaint();
        float float34 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot15.setRangeAxis((int) (byte) 100, valueAxis17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        boolean boolean23 = categoryPlot15.render(graphics2D19, rectangle2D20, (int) (byte) 100, plotRenderingInfo22);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot15.setRangeAxis((int) (short) 0, valueAxis25);
        java.awt.Paint paint27 = categoryPlot15.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint27);
        java.awt.Paint paint29 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis(categoryAxis11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) 1L, plotRenderingInfo14, point2D15, false);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot0.getRangeMarkers(1, layer19);
        org.jfree.chart.plot.Plot plot21 = categoryPlot0.getRootPlot();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = categoryPlot0.removeAnnotation(categoryAnnotation22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNotNull(plot21);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot0.getRangeAxisEdge(8);
        org.jfree.chart.axis.AxisSpace axisSpace29 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace29);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        categoryPlot0.setRangeAxis(valueAxis32);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        categoryPlot20.setWeight((int) (short) 1);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot0.getRangeAxisEdge(15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleEdge18);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        categoryPlot0.setDataset(categoryDataset27);
        org.jfree.chart.plot.Marker marker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) 100, marker30, layer31);
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        categoryPlot0.setRenderer(categoryItemRenderer27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        categoryPlot0.setDataset(categoryDataset29);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(axisLocation25);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        java.awt.Paint paint32 = categoryPlot20.getRangeCrosshairPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        float float7 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        categoryPlot0.setDomainAxis(categoryAxis8);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (short) 10, 0, plotRenderingInfo27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categoryAxis20);
        org.junit.Assert.assertNotNull(axisLocation22);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        categoryPlot7.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot7.setNoDataMessagePaint(paint12);
        java.awt.Image image14 = categoryPlot7.getBackgroundImage();
        java.awt.Paint paint15 = categoryPlot7.getDomainGridlinePaint();
        categoryPlot0.setDomainGridlinePaint(paint15);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent2 = null;
        categoryPlot0.axisChanged(axisChangeEvent2);
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
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot4.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        categoryPlot4.removeChangeListener(plotChangeListener16);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot4.getRangeMarkers(15, layer19);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        int int22 = categoryPlot4.getRangeAxisIndex(valueAxis21);
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
        categoryPlot4.setDrawingSupplier(drawingSupplier37);
        categoryPlot0.setDrawingSupplier(drawingSupplier37);
        org.jfree.chart.LegendItemCollection legendItemCollection40 = categoryPlot0.getLegendItems();
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        categoryPlot0.drawBackgroundImage(graphics2D41, rectangle2D42);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(sortOrder15);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray35);
        org.junit.Assert.assertNotNull(drawingSupplier37);
        org.junit.Assert.assertNotNull(legendItemCollection40);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot22.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot32.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot32.zoomRangeAxes((-1.0d), plotRenderingInfo35, point2D36, false);
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot32.getRangeAxisLocation((int) (byte) 10);
        categoryPlot22.setDomainAxisLocation((int) (short) 1, axisLocation40, true);
        boolean boolean44 = categoryPlot22.equals((java.lang.Object) "hi!");
        boolean boolean45 = categoryPlot0.equals((java.lang.Object) categoryPlot22);
        java.awt.Stroke stroke46 = categoryPlot22.getRangeCrosshairStroke();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(stroke46);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        categoryPlot0.setOutlineVisible(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        boolean boolean15 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        categoryPlot19.setOutlineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot19.setRangeAxis(valueAxis27);
        java.awt.Paint paint29 = categoryPlot19.getDomainGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint29);
        categoryPlot0.clearRangeMarkers(100);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = categoryPlot0.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) 10, plotRenderingInfo8, point2D9, true);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getDomainMarkers((int) (short) 100, layer13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(collection14);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        java.lang.Class<?> wildcardClass19 = stroke17.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        float float8 = categoryPlot0.getBackgroundAlpha();
        java.lang.Object obj9 = categoryPlot0.clone();
        java.awt.Stroke stroke10 = categoryPlot0.getRangeCrosshairStroke();
        double double11 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        categoryPlot0.removeChangeListener(plotChangeListener13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        categoryPlot0.setDataset(categoryDataset15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        java.awt.Paint paint15 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getDomainAxisEdge(8);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(rectangleEdge8);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = categoryPlot0.getDataset(1);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(categoryDataset14);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = categoryPlot0.getRendererForDataset(categoryDataset32);
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot0.getDomainAxisLocation(15);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(categoryItemRenderer33);
        org.junit.Assert.assertNotNull(axisLocation35);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        categoryPlot0.mapDatasetToDomainAxis((int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        categoryPlot0.clearRangeMarkers((int) (short) 100);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.Point2D point2D21 = null;
        org.jfree.chart.plot.PlotState plotState22 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D19, rectangle2D20, point2D21, plotState22, plotRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        org.jfree.chart.plot.Plot plot22 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(plot22);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.data.Range range9 = categoryPlot0.getDataRange(valueAxis8);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getDomainAxisEdge(101);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNull(categoryItemRenderer12);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        double double7 = categoryPlot0.getAnchorValue();
        java.awt.Paint paint8 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Paint paint8 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        int int11 = categoryPlot0.getWeight();
        categoryPlot0.setAnchorValue((double) 1L);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        java.util.List list27 = categoryPlot0.getAnnotations();
        java.awt.Image image28 = null;
        categoryPlot0.setBackgroundImage(image28);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace4);
        boolean boolean6 = categoryPlot0.isRangeGridlinesVisible();
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
        categoryPlot0.setDomainGridlineStroke(stroke16);
        org.jfree.chart.plot.Marker marker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(1, marker20, layer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        categoryPlot0.clearRangeMarkers(15);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(axisSpace15);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) -1, plotRenderingInfo12, point2D13, false);
        java.awt.Stroke stroke16 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot0.getRangeAxis((int) ' ');
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot19.zoomRangeAxes((-1.0d), plotRenderingInfo22, point2D23, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor26 = categoryPlot19.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot19.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot29.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        categoryPlot29.zoomRangeAxes((-1.0d), plotRenderingInfo32, point2D33, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor36 = categoryPlot29.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = categoryPlot29.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = categoryPlot29.getAxisOffset();
        categoryPlot19.setInsets(rectangleInsets39);
        categoryPlot0.setInsets(rectangleInsets39, false);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        categoryPlot0.notifyListeners(plotChangeEvent43);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNotNull(categoryAnchor26);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(categoryAnchor36);
        org.junit.Assert.assertNotNull(rectangleEdge38);
        org.junit.Assert.assertNotNull(rectangleInsets39);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation26 = categoryPlot0.getOrientation();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(plotOrientation20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(plotOrientation26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        org.jfree.chart.axis.AxisSpace axisSpace25 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(plot22);
        org.junit.Assert.assertNotNull(axisLocation24);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        categoryPlot0.addChangeListener(plotChangeListener17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        org.jfree.chart.axis.ValueAxis valueAxis33 = categoryPlot0.getRangeAxisForDataset(0);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(legendItemCollection30);
        org.junit.Assert.assertNull(valueAxis33);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent5 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent5);
        java.awt.Font font7 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(15);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(categoryAxis9);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo30, point2D31);
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        java.lang.Class<?> wildcardClass14 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setBackgroundAlpha((float) 1);
        java.util.List list10 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(list10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean17 = categoryPlot16.isRangeZoomable();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent18 = null;
        categoryPlot16.datasetChanged(datasetChangeEvent18);
        java.awt.Paint paint20 = categoryPlot16.getRangeGridlinePaint();
        categoryPlot0.setRangeGridlinePaint(paint20);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = categoryPlot0.getDomainAxisForDataset(15);
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot0.getRangeAxis((int) (byte) 100);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot0.getDomainMarkers(layer19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(categoryAxis16);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNull(collection20);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.setOutlineVisible(false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToDomainAxis((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(axisLocation7);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        categoryPlot0.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.data.Range range18 = categoryPlot0.getDataRange(valueAxis17);
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot0.getDomainAxisLocation(0);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot0.getRendererForDataset(categoryDataset22);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNull(categoryItemRenderer23);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray25 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis24 };
        categoryPlot23.setDomainAxes(categoryAxisArray25);
        categoryPlot23.setAnchorValue(10.0d);
        categoryPlot23.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean32 = categoryPlot31.isRangeZoomable();
        categoryPlot31.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder36 = categoryPlot31.getDatasetRenderingOrder();
        categoryPlot23.setDatasetRenderingOrder(datasetRenderingOrder36);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder38 = categoryPlot23.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder38);
        org.jfree.chart.LegendItemCollection legendItemCollection40 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder36);
        org.junit.Assert.assertNotNull(datasetRenderingOrder38);
        org.junit.Assert.assertNull(legendItemCollection40);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        categoryPlot23.setDataset(categoryDataset39);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(categoryAnchor30);
        org.junit.Assert.assertNotNull(rectangleEdge31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        categoryPlot0.clearDomainMarkers();
        java.lang.String str33 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(legendItemCollection30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Category Plot" + "'", str33, "Category Plot");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getDomainAxisLocation();
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 0.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(legendItemCollection30);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(100, valueAxis8);
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot0.getRangeAxisLocation(0);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(axisLocation11);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomRangeAxes((double) 0, plotRenderingInfo19, point2D20, false);
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(categoryAxis15);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        boolean boolean45 = categoryPlot0.isDomainGridlinesVisible();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot4.setRangeAxis((int) (byte) 100, valueAxis6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot4.render(graphics2D8, rectangle2D9, (int) (byte) 100, plotRenderingInfo11);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot4.setRenderer(0, categoryItemRenderer14, true);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot4.getRangeAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot18.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot18.zoomRangeAxes((-1.0d), plotRenderingInfo21, point2D22, false);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot18.setRangeAxis(valueAxis25);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot18.setRangeAxis(valueAxis27);
        categoryPlot18.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = categoryPlot18.getInsets();
        categoryPlot4.setAxisOffset(rectangleInsets30);
        categoryPlot0.setInsets(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(rectangleInsets30);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        boolean boolean6 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) (short) -1, plotRenderingInfo8, point2D9, false);
        org.jfree.chart.plot.CategoryMarker categoryMarker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        categoryPlot16.clearRangeMarkers();
        categoryPlot16.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke22 = categoryPlot16.getRangeGridlineStroke();
        double double23 = categoryPlot16.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        categoryPlot16.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray28 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer27 };
        categoryPlot16.setRenderers(categoryItemRendererArray28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = categoryPlot16.getDrawingSupplier();
        categoryPlot16.clearDomainMarkers((int) ' ');
        java.awt.Stroke stroke33 = categoryPlot16.getRangeGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke33);
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray28);
        org.junit.Assert.assertNotNull(drawingSupplier30);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        org.jfree.chart.LegendItemCollection legendItemCollection17 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        java.awt.Paint paint39 = categoryPlot23.getDomainGridlinePaint();
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor12 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(categoryAnchor12);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        float float7 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.setForegroundAlpha(1.0f);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(layer10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.removeChangeListener(plotChangeListener12);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = categoryPlot0.getRangeAxisIndex(valueAxis6);
        categoryPlot0.setForegroundAlpha((float) ' ');
        categoryPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        float float14 = categoryPlot0.getBackgroundAlpha();
        int int15 = categoryPlot0.getWeight();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.setBackgroundAlpha(0.0f);
        int int9 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        boolean boolean18 = categoryPlot10.render(graphics2D14, rectangle2D15, (int) (byte) 100, plotRenderingInfo17);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot10.getRenderer((int) (short) 10);
        java.awt.Stroke stroke21 = categoryPlot10.getDomainGridlineStroke();
        java.awt.Stroke stroke22 = categoryPlot10.getDomainGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = categoryPlot10.getFixedLegendItems();
        boolean boolean24 = categoryPlot10.isDomainZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder25 = categoryPlot10.getDatasetRenderingOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = categoryPlot10.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean28 = categoryPlot27.isRangeZoomable();
        categoryPlot27.setAnchorValue(100.0d, false);
        float float32 = categoryPlot27.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder33 = categoryPlot27.getRowRenderingOrder();
        categoryPlot10.setRowRenderingOrder(sortOrder33);
        categoryPlot0.setColumnRenderingOrder(sortOrder33);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRenderer((int) (byte) -1, categoryItemRenderer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNull(legendItemCollection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder25);
        org.junit.Assert.assertNotNull(legendItemCollection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder33);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        org.jfree.chart.axis.AxisSpace axisSpace36 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNull(axisSpace36);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        categoryPlot0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        double double14 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        categoryPlot0.setDomainAxis(10, categoryAxis16, true);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer15);
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot10.configureRangeAxes();
        categoryPlot10.clearRangeMarkers();
        categoryPlot10.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke16 = categoryPlot10.getRangeGridlineStroke();
        double double17 = categoryPlot10.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        categoryPlot10.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray22 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer21 };
        categoryPlot10.setRenderers(categoryItemRendererArray22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = categoryPlot10.getDrawingSupplier();
        categoryPlot10.clearDomainMarkers((int) ' ');
        categoryPlot10.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis29 = categoryPlot10.getRangeAxis();
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot10.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot31.configureRangeAxes();
        categoryPlot31.clearDomainMarkers();
        categoryPlot31.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray38 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis37 };
        categoryPlot36.setDomainAxes(categoryAxisArray38);
        java.awt.Stroke stroke40 = categoryPlot36.getOutlineStroke();
        categoryPlot31.setRangeCrosshairStroke(stroke40);
        org.jfree.chart.util.SortOrder sortOrder42 = categoryPlot31.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        categoryPlot31.removeChangeListener(plotChangeListener43);
        java.awt.Paint paint45 = categoryPlot31.getNoDataMessagePaint();
        org.jfree.chart.axis.AxisLocation axisLocation47 = categoryPlot31.getRangeAxisLocation((int) (short) 10);
        categoryPlot10.setRangeAxisLocation(axisLocation47);
        categoryPlot0.setRangeAxisLocation(axisLocation47);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(axisSpace9);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray22);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertNotNull(categoryAxisArray38);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(sortOrder42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(axisLocation47);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray9);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        java.util.List list12 = categoryPlot0.getCategoriesForAxis(categoryAxis11);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot14.configureRangeAxes();
        categoryPlot14.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = categoryPlot14.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = categoryPlot0.getDataset();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(legendItemCollection17);
        org.junit.Assert.assertNull(categoryDataset19);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean23 = categoryPlot22.isRangeZoomable();
        categoryPlot22.setAnchorValue(100.0d, false);
        float float27 = categoryPlot22.getForegroundAlpha();
        int int28 = categoryPlot22.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        categoryPlot22.setRangeAxis((int) (byte) 100, valueAxis30, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray35 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis34 };
        categoryPlot33.setDomainAxes(categoryAxisArray35);
        categoryPlot33.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot33.getDomainAxisLocation(100);
        categoryPlot22.setRangeAxisLocation(axisLocation40, false);
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        int int44 = categoryPlot22.getRangeAxisIndex(valueAxis43);
        org.jfree.chart.util.Layer layer45 = null;
        java.util.Collection collection46 = categoryPlot22.getRangeMarkers(layer45);
        org.jfree.chart.plot.PlotOrientation plotOrientation47 = categoryPlot22.getOrientation();
        categoryPlot0.setOrientation(plotOrientation47);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray35);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(collection46);
        org.junit.Assert.assertNotNull(plotOrientation47);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        org.jfree.chart.plot.Marker marker13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        boolean boolean30 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        categoryPlot15.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        categoryPlot15.setDataset(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot15.getRendererForDataset(categoryDataset20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = categoryPlot15.getDataset();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot23.getDataset((int) (short) 1);
        categoryPlot23.clearRangeAxes();
        int int27 = categoryPlot23.getWeight();
        categoryPlot23.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean31 = categoryPlot30.isRangeZoomable();
        org.jfree.chart.plot.Plot plot32 = categoryPlot30.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation33 = categoryPlot30.getOrientation();
        categoryPlot23.setOrientation(plotOrientation33);
        categoryPlot15.setOrientation(plotOrientation33);
        org.jfree.chart.util.RectangleEdge rectangleEdge36 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation14, plotOrientation33);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(plot32);
        org.junit.Assert.assertNotNull(plotOrientation33);
        org.junit.Assert.assertNotNull(rectangleEdge36);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        boolean boolean14 = categoryPlot0.render(graphics2D10, rectangle2D11, 1, plotRenderingInfo13);
        org.jfree.chart.plot.CategoryMarker categoryMarker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 1, categoryMarker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset((int) (byte) 100);
        double double11 = categoryPlot0.getRangeCrosshairValue();
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        categoryPlot0.setDomainAxis((int) (byte) 1, categoryAxis16);
        java.awt.Font font18 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(legendItemCollection19);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.data.Range range30 = categoryPlot0.getDataRange(valueAxis29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNull(range30);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray16 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis15 };
        categoryPlot0.setDomainAxes(categoryAxisArray16);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertNotNull(rectangleEdge18);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        org.jfree.chart.plot.Plot plot15 = categoryPlot0.getParent();
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        categoryPlot0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer12);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        float float22 = categoryPlot17.getForegroundAlpha();
        int int23 = categoryPlot17.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot17.setRangeAxis((int) (byte) 100, valueAxis25, false);
        categoryPlot17.setNoDataMessage("");
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset32 = categoryPlot30.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot34.configureRangeAxes();
        categoryPlot34.clearRangeMarkers();
        boolean boolean37 = categoryPlot34.isOutlineVisible();
        categoryPlot34.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        categoryPlot34.setRenderer(categoryItemRenderer40);
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot34.getDomainAxisLocation();
        categoryPlot30.setRangeAxisLocation((int) (short) 0, axisLocation42, false);
        categoryPlot17.setRangeAxisLocation(axisLocation42, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        categoryPlot47.setRangeAxis((int) (byte) 100, valueAxis49);
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = null;
        boolean boolean55 = categoryPlot47.render(graphics2D51, rectangle2D52, (int) (byte) 100, plotRenderingInfo54);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer57 = categoryPlot47.getRenderer((int) (short) 10);
        java.awt.Paint paint58 = categoryPlot47.getDomainGridlinePaint();
        categoryPlot17.setRangeCrosshairPaint(paint58);
        categoryPlot0.setBackgroundPaint(paint58);
        categoryPlot0.setForegroundAlpha((float) 'a');
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(categoryDataset32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(axisLocation42);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(categoryItemRenderer57);
        org.junit.Assert.assertNotNull(paint58);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis10);
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot8.getRangeAxisLocation();
        categoryPlot8.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot8.setRangeAxis(valueAxis15);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot8.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        boolean boolean19 = categoryPlot0.isSubplot();
        java.awt.Image image20 = null;
        categoryPlot0.setBackgroundImage(image20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        java.lang.String str6 = categoryPlot0.getPlotType();
        java.awt.Paint paint7 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Category Plot" + "'", str6, "Category Plot");
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot18.setRangeAxis((int) (byte) 100, valueAxis20);
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = categoryPlot18.getDomainMarkers((int) (byte) 10, layer23);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.configureRangeAxes();
        categoryPlot25.clearDomainMarkers();
        boolean boolean28 = categoryPlot18.equals((java.lang.Object) categoryPlot25);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot29.configureRangeAxes();
        categoryPlot29.clearRangeMarkers();
        categoryPlot29.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke35 = categoryPlot29.getRangeGridlineStroke();
        double double36 = categoryPlot29.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        categoryPlot29.drawBackgroundImage(graphics2D37, rectangle2D38);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = categoryPlot29.getInsets();
        categoryPlot18.setAxisOffset(rectangleInsets40);
        categoryPlot0.setInsets(rectangleInsets40);
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (short) 1, (int) (byte) 1, plotRenderingInfo47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets40);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        int int18 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(true);
        float float7 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        int int25 = categoryPlot0.getRangeAxisIndex(valueAxis24);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        java.awt.Stroke stroke42 = categoryPlot0.getOutlineStroke();
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
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        boolean boolean34 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(valueAxisArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        java.awt.Paint paint16 = categoryPlot0.getRangeCrosshairPaint();
        java.awt.Paint paint17 = categoryPlot0.getOutlinePaint();
        java.awt.Paint paint18 = categoryPlot0.getBackgroundPaint();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D19, rectangle2D20);
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
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        categoryPlot0.zoomDomainAxes((double) '#', plotRenderingInfo4, point2D5, true);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        categoryPlot0.setDomainAxis((int) (byte) 1, categoryAxis16);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot0.getRangeAxisLocation();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer((int) (byte) 0, categoryItemRenderer5);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        float float11 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        boolean boolean39 = categoryPlot0.render(graphics2D35, rectangle2D36, (int) (byte) 0, plotRenderingInfo38);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace5);
        java.lang.String str7 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.plot.Marker marker8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(drawingSupplier4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace4 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace4);
        boolean boolean6 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        float float7 = categoryPlot0.getBackgroundAlpha();
        java.lang.String str8 = categoryPlot0.getPlotType();
        java.lang.Object obj9 = categoryPlot0.clone();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Category Plot" + "'", str8, "Category Plot");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        categoryPlot0.axisChanged(axisChangeEvent12);
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot0.getRangeAxisForDataset(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(valueAxis15);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        categoryPlot0.removeChangeListener(plotChangeListener25);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        java.awt.Paint paint33 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        int int35 = categoryPlot0.getDomainAxisIndex(categoryAxis34);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent2 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent2);
        java.awt.Paint paint4 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.configureRangeAxes();
        categoryPlot5.clearRangeMarkers();
        boolean boolean8 = categoryPlot5.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray11 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis10 };
        categoryPlot9.setDomainAxes(categoryAxisArray11);
        float float13 = categoryPlot9.getBackgroundAlpha();
        categoryPlot9.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = categoryPlot9.getDomainAxisForDataset((int) '#');
        boolean boolean19 = categoryPlot9.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot9.setRenderer((int) '4', categoryItemRenderer21);
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
        categoryPlot9.setOutlinePaint(paint37);
        categoryPlot5.setRangeGridlinePaint(paint37);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        categoryPlot41.setRangeAxis((int) (byte) 100, valueAxis43);
        org.jfree.chart.util.Layer layer46 = null;
        java.util.Collection collection47 = categoryPlot41.getDomainMarkers((int) (byte) 10, layer46);
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot48.configureRangeAxes();
        categoryPlot48.clearDomainMarkers();
        boolean boolean51 = categoryPlot41.equals((java.lang.Object) categoryPlot48);
        org.jfree.chart.plot.CategoryPlot categoryPlot52 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot52.configureRangeAxes();
        categoryPlot52.clearRangeMarkers();
        categoryPlot52.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke58 = categoryPlot52.getRangeGridlineStroke();
        double double59 = categoryPlot52.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D60 = null;
        java.awt.geom.Rectangle2D rectangle2D61 = null;
        categoryPlot52.drawBackgroundImage(graphics2D60, rectangle2D61);
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = categoryPlot52.getInsets();
        categoryPlot41.setAxisOffset(rectangleInsets63);
        categoryPlot5.setInsets(rectangleInsets63);
        categoryPlot0.setAxisOffset(rectangleInsets63);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset34);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets63);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        categoryPlot0.setAnchorValue(100.0d);
        boolean boolean14 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 0, plotRenderingInfo8, point2D9, false);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.plot.Plot plot9 = null;
        categoryPlot0.setParent(plot9);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(sortOrder16);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        java.util.List list7 = categoryPlot0.getCategories();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        categoryPlot0.removeChangeListener(plotChangeListener8);
        double double10 = categoryPlot0.getAnchorValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRenderer((int) (short) -1, categoryItemRenderer12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        org.jfree.chart.LegendItemCollection legendItemCollection14 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        categoryPlot0.setBackgroundImageAlignment(0);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        java.util.List list25 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categoryAxis20);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis((int) ' ', categoryAxis13);
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(0, marker16, layer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(axisSpace11);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        int int37 = categoryPlot0.getRangeAxisIndex(valueAxis36);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(plotOrientation31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(legendItemCollection34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(drawingSupplier4);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.configureDomainAxes();
        java.awt.Stroke stroke5 = categoryPlot0.getOutlineStroke();
        java.util.List list6 = categoryPlot0.getCategories();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes(0.0d, plotRenderingInfo8, point2D9, false);
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        float float12 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean4 = categoryPlot3.isRangeZoomable();
        categoryPlot3.setAnchorValue(100.0d, false);
        float float8 = categoryPlot3.getForegroundAlpha();
        int int9 = categoryPlot3.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot3.setRangeAxis((int) (byte) 100, valueAxis11, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray16 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis15 };
        categoryPlot14.setDomainAxes(categoryAxisArray16);
        categoryPlot14.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot14.getDomainAxisLocation(100);
        categoryPlot3.setRangeAxisLocation(axisLocation21, false);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        int int25 = categoryPlot3.getRangeAxisIndex(valueAxis24);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot3.getRangeMarkers(layer26);
        org.jfree.chart.plot.PlotOrientation plotOrientation28 = categoryPlot3.getOrientation();
        categoryPlot0.setOrientation(plotOrientation28);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.configureRangeAxes();
        categoryPlot30.clearDomainMarkers();
        categoryPlot30.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset36 = categoryPlot30.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        categoryPlot30.removeChangeListener(plotChangeListener37);
        categoryPlot30.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.PlotOrientation plotOrientation41 = categoryPlot30.getOrientation();
        categoryPlot0.setOrientation(plotOrientation41);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(plotOrientation28);
        org.junit.Assert.assertNull(categoryDataset36);
        org.junit.Assert.assertNotNull(plotOrientation41);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        categoryPlot0.clearDomainMarkers((int) (short) 1);
        org.jfree.chart.axis.AxisSpace axisSpace10 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (short) 10, marker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(sortOrder12);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor11 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot12.zoomRangeAxes((-1.0d), plotRenderingInfo15, point2D16, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor19 = categoryPlot12.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean21 = categoryPlot20.isRangeZoomable();
        categoryPlot20.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder25 = categoryPlot20.getDatasetRenderingOrder();
        categoryPlot12.setDatasetRenderingOrder(datasetRenderingOrder25);
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder25);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(categoryAnchor11);
        org.junit.Assert.assertNotNull(categoryAnchor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder25);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        java.awt.Paint paint16 = categoryPlot0.getRangeCrosshairPaint();
        java.awt.Paint paint17 = categoryPlot0.getOutlinePaint();
        java.awt.Paint paint18 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        categoryPlot19.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot19.setDataset(categoryDataset22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = categoryPlot19.getRendererForDataset(categoryDataset24);
        categoryPlot19.clearRangeMarkers((int) 'a');
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray29 = new org.jfree.chart.axis.ValueAxis[] { valueAxis28 };
        categoryPlot19.setRangeAxes(valueAxisArray29);
        categoryPlot0.setRangeAxes(valueAxisArray29);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNotNull(valueAxisArray29);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        categoryPlot0.clearDomainMarkers((int) (byte) -1);
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
        categoryPlot0.setDrawingSupplier(drawingSupplier28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray26);
        org.junit.Assert.assertNotNull(drawingSupplier28);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers((int) (byte) -1, layer9);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot0.setRangeAxis((int) ' ', valueAxis12, true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNull(collection10);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        categoryPlot0.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        java.awt.Stroke stroke5 = null;
        categoryPlot0.setOutlineStroke(stroke5);
        org.jfree.chart.plot.CategoryMarker categoryMarker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        categoryPlot0.axisChanged(axisChangeEvent12);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) '#');
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((int) (short) -1, valueAxis25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot0.getDomainMarkers(layer17);
        org.jfree.chart.plot.Plot plot19 = categoryPlot0.getParent();
        java.awt.Stroke stroke20 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder5 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = categoryPlot0.getDomainMarkers(layer6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder5);
        org.junit.Assert.assertNull(collection7);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer44 = categoryPlot0.getRenderer();
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
        org.junit.Assert.assertNull(categoryItemRenderer44);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNotNull(drawingSupplier24);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list11 = categoryPlot10.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot10.setRenderer(categoryItemRenderer12, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot10.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier15);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis((int) '4');
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace18);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset(categoryDataset7);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot9.zoomRangeAxes((-1.0d), plotRenderingInfo12, point2D13, false);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot9.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot19.zoomRangeAxes((-1.0d), plotRenderingInfo22, point2D23, false);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot19.getRangeAxisLocation((int) (byte) 10);
        categoryPlot9.setDomainAxisLocation((int) (short) 1, axisLocation27, true);
        boolean boolean31 = categoryPlot9.equals((java.lang.Object) "hi!");
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder32 = categoryPlot9.getDatasetRenderingOrder();
        java.util.List list33 = categoryPlot9.getAnnotations();
        org.jfree.chart.util.Layer layer35 = null;
        java.util.Collection collection36 = categoryPlot9.getRangeMarkers(101, layer35);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot37.configureRangeAxes();
        categoryPlot37.clearRangeMarkers();
        boolean boolean40 = categoryPlot37.isOutlineVisible();
        categoryPlot37.setRangeGridlinesVisible(false);
        boolean boolean43 = categoryPlot37.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        categoryPlot37.setRangeAxis(valueAxis44);
        java.awt.Stroke stroke46 = categoryPlot37.getOutlineStroke();
        categoryPlot9.setRangeCrosshairStroke(stroke46);
        categoryPlot0.setDomainGridlineStroke(stroke46);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(stroke46);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset((int) (byte) 100);
        double double11 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.data.Range range13 = categoryPlot0.getDataRange(valueAxis12);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        float float22 = categoryPlot17.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder23 = categoryPlot17.getRowRenderingOrder();
        boolean boolean24 = categoryPlot17.isRangeCrosshairLockedOnData();
        categoryPlot17.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean28 = categoryPlot27.isRangeZoomable();
        categoryPlot27.setAnchorValue(100.0d, false);
        float float32 = categoryPlot27.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray35 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis34 };
        categoryPlot33.setDomainAxes(categoryAxisArray35);
        java.awt.Stroke stroke37 = categoryPlot33.getOutlineStroke();
        categoryPlot27.setRangeCrosshairStroke(stroke37);
        categoryPlot27.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = categoryPlot27.getRenderer((int) (byte) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot42.configureRangeAxes();
        categoryPlot42.clearRangeMarkers();
        categoryPlot42.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke48 = categoryPlot42.getRangeGridlineStroke();
        double double49 = categoryPlot42.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D50 = null;
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        categoryPlot42.drawBackgroundImage(graphics2D50, rectangle2D51);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer53 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray54 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer53 };
        categoryPlot42.setRenderers(categoryItemRendererArray54);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier56 = categoryPlot42.getDrawingSupplier();
        categoryPlot27.setDrawingSupplier(drawingSupplier56);
        categoryPlot17.setDrawingSupplier(drawingSupplier56);
        categoryPlot0.setDrawingSupplier(drawingSupplier56);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray35);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNull(categoryItemRenderer41);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray54);
        org.junit.Assert.assertNotNull(drawingSupplier56);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot0.getInsets();
        java.awt.Paint paint9 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot0.getRangeMarkers(1, layer19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.Point2D point2D23 = null;
        org.jfree.chart.plot.PlotState plotState24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D21, rectangle2D22, point2D23, plotState24, plotRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertNull(collection20);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxisForDataset((-1));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomRangeAxes((double) 100.0f, plotRenderingInfo14, point2D15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot0.getRendererForDataset(categoryDataset17);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryItemRenderer18);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        categoryPlot0.clearDomainMarkers();
        boolean boolean19 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = categoryPlot0.removeAnnotation(categoryAnnotation20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(0);
        categoryPlot0.setDrawSharedDomainAxis(true);
        boolean boolean12 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        org.jfree.chart.util.SortOrder sortOrder21 = categoryPlot9.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(categoryAnchor20);
        org.junit.Assert.assertNotNull(sortOrder21);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) 'a', layer8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot0.getLegendItems();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent11 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        categoryPlot0.clearDomainMarkers();
        float float9 = categoryPlot0.getBackgroundAlpha();
        java.awt.Stroke stroke10 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        org.jfree.chart.plot.Plot plot36 = categoryPlot0.getParent();
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
        org.junit.Assert.assertNull(plot36);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.awt.Paint paint27 = categoryPlot0.getBackgroundPaint();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D28, rectangle2D29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.plot.Plot plot7 = categoryPlot0.getRootPlot();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plot7);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Paint paint11 = categoryPlot0.getDomainGridlinePaint();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        boolean boolean16 = categoryPlot0.render(graphics2D12, rectangle2D13, (int) (byte) 100, plotRenderingInfo15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.configureRangeAxes();
        categoryPlot12.clearRangeMarkers();
        categoryPlot12.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke18 = categoryPlot12.getRangeGridlineStroke();
        double double19 = categoryPlot12.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        categoryPlot12.drawBackgroundImage(graphics2D20, rectangle2D21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = categoryPlot12.getInsets();
        categoryPlot0.setInsets(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        categoryPlot0.setRenderer(categoryItemRenderer23);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        categoryPlot0.setBackgroundAlpha(1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRendererForDataset(categoryDataset18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(categoryItemRenderer19);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot20.getDomainAxisEdge((int) (short) 0);
        double double35 = categoryPlot20.getAnchorValue();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot0.setRenderer(8, categoryItemRenderer19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(axisLocation17);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        double double47 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.5f + "'", float33 == 0.5f);
        org.junit.Assert.assertNotNull(categoryItemRendererArray43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(categoryItemRenderer8);
        org.jfree.chart.axis.AxisSpace axisSpace10 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNull(axisSpace10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset();
        java.lang.String str9 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        java.util.List list11 = categoryPlot0.getCategoriesForAxis(categoryAxis10);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        int int29 = categoryPlot0.getDomainAxisCount();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 10, 101);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        int int6 = categoryPlot0.getRangeAxisIndex(valueAxis5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot7.zoomRangeAxes((-1.0d), plotRenderingInfo10, point2D11, false);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot7.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray16 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot7.setRangeAxes(valueAxisArray16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = categoryPlot7.getAxisOffset();
        categoryPlot0.setAxisOffset(rectangleInsets18);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(valueAxisArray16);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(categoryAxis33);
        org.junit.Assert.assertNotNull(rectangleEdge34);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = categoryPlot0.getDataRange(valueAxis11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        categoryPlot0.setDataset(categoryDataset13);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(range12);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setBackgroundImageAlignment((int) (byte) 1);
        categoryPlot0.setBackgroundImageAlignment((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.configureRangeAxes();
        categoryPlot5.clearRangeMarkers();
        boolean boolean8 = categoryPlot5.isOutlineVisible();
        categoryPlot5.setRangeGridlinesVisible(false);
        categoryPlot5.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        categoryPlot13.clearRangeMarkers();
        boolean boolean16 = categoryPlot13.isOutlineVisible();
        categoryPlot13.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot13.setRenderer(categoryItemRenderer19);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot13.getDomainAxisLocation();
        categoryPlot5.setRangeAxisLocation(axisLocation21);
        categoryPlot0.setRangeAxisLocation((int) (short) 100, axisLocation21, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray27 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis26 };
        categoryPlot25.setDomainAxes(categoryAxisArray27);
        java.awt.Stroke stroke29 = categoryPlot25.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection30 = categoryPlot25.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = categoryPlot25.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        int int33 = categoryPlot25.getDomainAxisIndex(categoryAxis32);
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot25.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot36.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        java.awt.geom.Point2D point2D40 = null;
        categoryPlot36.zoomRangeAxes((-1.0d), plotRenderingInfo39, point2D40, false);
        org.jfree.chart.axis.AxisLocation axisLocation44 = categoryPlot36.getRangeAxisLocation((int) (byte) 10);
        categoryPlot25.setDomainAxisLocation((int) (byte) 0, axisLocation44);
        java.awt.Paint paint46 = categoryPlot25.getRangeCrosshairPaint();
        categoryPlot0.setRangeCrosshairPaint(paint46);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier48 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(categoryAxisArray27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(legendItemCollection30);
        org.junit.Assert.assertNull(categoryItemRenderer31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNotNull(axisLocation44);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(drawingSupplier48);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis16 };
        categoryPlot15.setDomainAxes(categoryAxisArray17);
        java.awt.Stroke stroke19 = categoryPlot15.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = categoryPlot15.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot15.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        int int23 = categoryPlot15.getDomainAxisIndex(categoryAxis22);
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot15.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot26.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot26.zoomRangeAxes((-1.0d), plotRenderingInfo29, point2D30, false);
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot26.getRangeAxisLocation((int) (byte) 10);
        categoryPlot15.setDomainAxisLocation((int) (byte) 0, axisLocation34);
        java.awt.Stroke stroke36 = categoryPlot15.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = categoryPlot15.getInsets();
        categoryPlot0.setInsets(rectangleInsets37, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(sortOrder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(rectangleInsets37);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        categoryPlot0.setRangeAxis(valueAxis4);
        categoryPlot0.setWeight((int) (short) 10);
        java.awt.Paint paint8 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot9.setRangeAxis((int) (byte) 100, valueAxis11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        boolean boolean17 = categoryPlot9.render(graphics2D13, rectangle2D14, (int) (byte) 100, plotRenderingInfo16);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot9.getRenderer((int) (short) 10);
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot9.getDomainMarkers(layer20);
        categoryPlot9.clearDomainMarkers();
        java.lang.Object obj23 = categoryPlot9.clone();
        categoryPlot9.clearRangeAxes();
        categoryPlot9.setBackgroundAlpha((-1.0f));
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = categoryPlot9.getAxisOffset();
        categoryPlot0.setAxisOffset(rectangleInsets27);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = categoryPlot0.getInsets();
        boolean boolean7 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        categoryPlot0.setAnchorValue(0.0d);
        categoryPlot0.clearDomainMarkers();
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        categoryPlot5.setBackgroundImageAlignment(100);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        float float7 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(categoryItemRenderer8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = categoryPlot4.getDomainAxis();
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot4.getDomainAxisLocation(0);
        org.jfree.chart.plot.Plot plot8 = categoryPlot4.getParent();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        categoryPlot9.clearDomainMarkers();
        categoryPlot9.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint14 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot9.setNoDataMessagePaint(paint14);
        java.awt.Image image16 = categoryPlot9.getBackgroundImage();
        categoryPlot9.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray22 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis21 };
        categoryPlot20.setDomainAxes(categoryAxisArray22);
        java.awt.Stroke stroke24 = categoryPlot20.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = categoryPlot20.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot20.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        int int28 = categoryPlot20.getDomainAxisIndex(categoryAxis27);
        org.jfree.chart.axis.AxisLocation axisLocation29 = categoryPlot20.getDomainAxisLocation();
        categoryPlot9.setDomainAxisLocation((int) '#', axisLocation29);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        categoryPlot9.zoomRangeAxes(10.0d, plotRenderingInfo32, point2D33, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation36 = categoryPlot9.getOrientation();
        categoryPlot4.setOrientation(plotOrientation36);
        org.junit.Assert.assertNull(categoryAxis5);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertNotNull(categoryAxisArray22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNull(categoryItemRenderer26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(plotOrientation36);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        categoryPlot0.notifyListeners(plotChangeEvent21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) 'a', layer8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot0.getLegendItems();
        java.awt.Image image11 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        categoryPlot0.setAnchorValue((double) 0, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset();
        boolean boolean9 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot0.getRenderer(101);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(categoryItemRenderer15);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        categoryPlot0.addChangeListener(plotChangeListener37);
        java.awt.Paint paint39 = categoryPlot0.getRangeGridlinePaint();
        boolean boolean40 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(valueAxisArray30);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo4, point2D5, false);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        categoryPlot0.axisChanged(axisChangeEvent9);
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) 'a');
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        categoryPlot0.notifyListeners(plotChangeEvent13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(axisLocation12);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = categoryPlot0.getDataRange(valueAxis11);
        boolean boolean13 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers((int) (byte) -1, layer9);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        int int12 = categoryPlot0.getDomainAxisIndex(categoryAxis11);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot0.getRangeAxisEdge(8);
        org.jfree.chart.axis.AxisSpace axisSpace29 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace29);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot0.getRangeAxisLocation();
        org.jfree.data.category.CategoryDataset categoryDataset32 = categoryPlot0.getDataset();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNull(categoryDataset32);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        categoryPlot0.setDataset(categoryDataset27);
        int int29 = categoryPlot0.getDomainAxisCount();
        float float30 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getDomainAxisLocation(100);
        org.jfree.chart.plot.Plot plot17 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(plot17);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot0.getDomainMarkers(layer17);
        org.jfree.chart.plot.Plot plot19 = categoryPlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint20 = plot19.getBackgroundPaint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(plot19);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot23.setRangeAxis((int) (byte) 100, valueAxis25);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        boolean boolean31 = categoryPlot23.render(graphics2D27, rectangle2D28, (int) (byte) 100, plotRenderingInfo30);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        categoryPlot23.setRangeAxis((int) (short) 0, valueAxis33);
        java.awt.Paint paint35 = categoryPlot23.getRangeGridlinePaint();
        categoryPlot0.setOutlinePaint(paint35);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(legendItemCollection22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        java.lang.String str5 = categoryPlot0.getPlotType();
        categoryPlot0.clearAnnotations();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset9);
        categoryPlot0.setOutlineVisible(true);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Category Plot" + "'", str5, "Category Plot");
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        float float13 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(101, categoryMarker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairValue((double) 100L, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomRangeAxes(100.0d, plotRenderingInfo8, point2D9, false);
        int int12 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        categoryPlot0.setRangeCrosshairValue((double) 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        categoryPlot0.setBackgroundImageAlignment((int) (short) -1);
        java.awt.Paint paint17 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(categoryAxis23);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = categoryPlot0.getDomainAxisForDataset(15);
        boolean boolean17 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(categoryAxis16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot12.zoomRangeAxes((-1.0d), plotRenderingInfo15, point2D16, false);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot12.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray21 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot12.setRangeAxes(valueAxisArray21);
        java.awt.Paint paint23 = categoryPlot12.getRangeGridlinePaint();
        categoryPlot12.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 1);
        boolean boolean27 = categoryPlot0.equals((java.lang.Object) categoryPlot12);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(valueAxisArray21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        categoryPlot0.axisChanged(axisChangeEvent11);
        java.awt.Stroke stroke13 = categoryPlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot0.getRendererForDataset(categoryDataset14);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(categoryItemRenderer15);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        boolean boolean18 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.AxisSpace axisSpace19 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(axisSpace19);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot0.setRenderer(categoryItemRenderer19, false);
        org.jfree.chart.plot.Marker marker22 = null;
        org.jfree.chart.util.Layer layer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker22, layer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sortOrder15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot0.getDomainAxisForDataset((int) ' ');
        categoryPlot0.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNull(categoryAxis17);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        java.awt.Stroke stroke14 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.util.List list8 = categoryPlot0.getCategories();
        categoryPlot0.setRangeGridlinesVisible(false);
        java.awt.Paint paint11 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        int int4 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot5.setRangeAxis((int) (byte) 100, valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot5.getRangeAxisLocation();
        categoryPlot5.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean13 = categoryPlot12.isRangeZoomable();
        categoryPlot12.setAnchorValue(100.0d, false);
        float float17 = categoryPlot12.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis19 };
        categoryPlot18.setDomainAxes(categoryAxisArray20);
        java.awt.Stroke stroke22 = categoryPlot18.getOutlineStroke();
        categoryPlot12.setRangeCrosshairStroke(stroke22);
        categoryPlot5.setRangeGridlineStroke(stroke22);
        categoryPlot0.setRangeCrosshairStroke(stroke22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor19 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(categoryAxisArray12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(categoryAnchor19);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        boolean boolean15 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = categoryPlot0.getDataRange(valueAxis16);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(range17);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        java.awt.Stroke stroke5 = null;
        categoryPlot0.setOutlineStroke(stroke5);
        boolean boolean7 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        boolean boolean15 = categoryPlot0.isDomainGridlinesVisible();
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        categoryPlot19.setOutlineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot19.setRangeAxis(valueAxis27);
        java.awt.Paint paint29 = categoryPlot19.getDomainGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint29);
        categoryPlot0.clearRangeMarkers(100);
        org.jfree.chart.axis.AxisSpace axisSpace33 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace33);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        boolean boolean5 = categoryPlot0.isRangeZoomable();
        double double6 = categoryPlot0.getRangeCrosshairValue();
        categoryPlot0.setAnchorValue((double) 1L, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot10.setRangeAxis((int) (byte) 100, valueAxis12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        boolean boolean18 = categoryPlot10.render(graphics2D14, rectangle2D15, (int) (byte) 100, plotRenderingInfo17);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot10.getRenderer((int) (short) 10);
        java.awt.Stroke stroke21 = categoryPlot10.getDomainGridlineStroke();
        java.awt.Stroke stroke22 = categoryPlot10.getDomainGridlineStroke();
        float float23 = categoryPlot10.getBackgroundAlpha();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot10.setDomainAxis((int) ' ', categoryAxis25);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        boolean boolean21 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot0.setRangeAxis(valueAxis19);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray23 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis22 };
        categoryPlot21.setDomainAxes(categoryAxisArray23);
        float float25 = categoryPlot21.getBackgroundAlpha();
        categoryPlot21.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = categoryPlot21.getDomainAxisForDataset((int) '#');
        boolean boolean31 = categoryPlot21.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot21.getDomainAxisLocation((int) (byte) -1);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray34 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot21.setRangeAxes(valueAxisArray34);
        categoryPlot21.setRangeCrosshairValue(100.0d);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot38.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        java.awt.geom.Point2D point2D42 = null;
        categoryPlot38.zoomRangeAxes((-1.0d), plotRenderingInfo41, point2D42, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor45 = categoryPlot38.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge47 = categoryPlot38.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot48.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        java.awt.geom.Point2D point2D52 = null;
        categoryPlot48.zoomRangeAxes((-1.0d), plotRenderingInfo51, point2D52, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor55 = categoryPlot48.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge57 = categoryPlot48.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = categoryPlot48.getAxisOffset();
        categoryPlot38.setInsets(rectangleInsets58);
        categoryPlot21.setAxisOffset(rectangleInsets58);
        categoryPlot0.setInsets(rectangleInsets58, false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(categoryAxisArray23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(valueAxisArray34);
        org.junit.Assert.assertNotNull(categoryAnchor45);
        org.junit.Assert.assertNotNull(rectangleEdge47);
        org.junit.Assert.assertNotNull(categoryAnchor55);
        org.junit.Assert.assertNotNull(rectangleEdge57);
        org.junit.Assert.assertNotNull(rectangleInsets58);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        org.jfree.data.general.DatasetGroup datasetGroup12 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(datasetGroup12);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        java.util.List list8 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot0.markerChanged(markerChangeEvent13);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(categoryItemRenderer15);
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
        categoryPlot0.setDomainAxisLocation((int) (byte) 0, axisLocation31, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer(0);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = categoryPlot0.getDataRange(valueAxis11);
        boolean boolean13 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setBackgroundAlpha((float) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (short) 10, (int) (byte) -1, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        categoryPlot0.setDataset(categoryDataset27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = categoryPlot0.getRendererForDataset(categoryDataset29);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNull(categoryItemRenderer30);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        boolean boolean17 = categoryPlot16.isRangeZoomable();
        categoryPlot16.setAnchorValue(100.0d, false);
        float float21 = categoryPlot16.getForegroundAlpha();
        int int22 = categoryPlot16.getWeight();
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot16.getRangeMarkers((int) 'a', layer24);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = categoryPlot16.getAxisOffset();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot27.configureRangeAxes();
        categoryPlot27.clearDomainMarkers();
        categoryPlot27.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray34 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis33 };
        categoryPlot32.setDomainAxes(categoryAxisArray34);
        java.awt.Stroke stroke36 = categoryPlot32.getOutlineStroke();
        categoryPlot27.setRangeCrosshairStroke(stroke36);
        org.jfree.chart.util.SortOrder sortOrder38 = categoryPlot27.getRowRenderingOrder();
        categoryPlot16.setRowRenderingOrder(sortOrder38);
        categoryPlot0.setRowRenderingOrder(sortOrder38);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(categoryAxisArray34);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(sortOrder38);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNull(categoryAxis19);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent38 = null;
        categoryPlot0.notifyListeners(plotChangeEvent38);
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
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getDomainMarkers(layer15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot0.getDomainAxisIndex(categoryAxis18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        float float8 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getDomainMarkers((int) (short) -1, layer10);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset();
        categoryPlot0.setBackgroundImageAlignment(0);
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot0.getDataset(100);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(categoryDataset8);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomDomainAxes((-1.0d), (-1.0d), plotRenderingInfo19, point2D20);
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
        categoryPlot0.setDomainGridlinePaint(paint37);
        org.jfree.chart.event.PlotChangeListener plotChangeListener40 = null;
        categoryPlot0.removeChangeListener(plotChangeListener40);
        org.jfree.chart.axis.ValueAxis valueAxis43 = categoryPlot0.getRangeAxis((int) (byte) -1);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(categoryAxisArray24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(valueAxis43);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomRangeAxes((double) 'a', plotRenderingInfo15, point2D16);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(legendItemCollection13);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        boolean boolean7 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean11 = categoryPlot10.isRangeZoomable();
        categoryPlot10.setAnchorValue(100.0d, false);
        float float15 = categoryPlot10.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray18 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis17 };
        categoryPlot16.setDomainAxes(categoryAxisArray18);
        java.awt.Stroke stroke20 = categoryPlot16.getOutlineStroke();
        categoryPlot10.setRangeCrosshairStroke(stroke20);
        categoryPlot10.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot10.getRenderer((int) (byte) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.configureRangeAxes();
        categoryPlot25.clearRangeMarkers();
        categoryPlot25.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke31 = categoryPlot25.getRangeGridlineStroke();
        double double32 = categoryPlot25.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        categoryPlot25.drawBackgroundImage(graphics2D33, rectangle2D34);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray37 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer36 };
        categoryPlot25.setRenderers(categoryItemRendererArray37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = categoryPlot25.getDrawingSupplier();
        categoryPlot10.setDrawingSupplier(drawingSupplier39);
        categoryPlot0.setDrawingSupplier(drawingSupplier39);
        java.awt.Stroke stroke42 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(categoryItemRenderer24);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray37);
        org.junit.Assert.assertNotNull(drawingSupplier39);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(true);
        boolean boolean7 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxisForDataset((-1));
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomRangeAxes((double) 100.0f, plotRenderingInfo14, point2D15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean18 = categoryPlot17.isRangeZoomable();
        categoryPlot17.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder22 = categoryPlot17.getDatasetRenderingOrder();
        int int23 = categoryPlot17.getDatasetCount();
        java.util.List list24 = categoryPlot17.getCategories();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot17.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation25);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot0.getDomainAxisLocation((int) 'a');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        categoryPlot0.setRenderer(categoryItemRenderer29, true);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(axisLocation28);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        int int52 = categoryPlot0.getRangeAxisIndex(valueAxis51);
        org.jfree.chart.util.RectangleEdge rectangleEdge53 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo56 = null;
        java.awt.geom.Point2D point2D57 = null;
        categoryPlot0.zoomRangeAxes((double) '4', (double) 0.0f, plotRenderingInfo56, point2D57);
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge53);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = categoryPlot0.getInsets();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
        org.junit.Assert.assertNotNull(rectangleInsets34);
    }
}

