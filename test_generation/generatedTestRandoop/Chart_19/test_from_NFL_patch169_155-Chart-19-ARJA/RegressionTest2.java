import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        java.awt.Paint paint22 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis24 = categoryPlot0.getRangeAxis((int) '4');
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(valueAxis24);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearRangeMarkers();
        categoryPlot8.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke14 = categoryPlot8.getRangeGridlineStroke();
        double double15 = categoryPlot8.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        categoryPlot8.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray20 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer19 };
        categoryPlot8.setRenderers(categoryItemRendererArray20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = categoryPlot8.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier22);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray20);
        org.junit.Assert.assertNotNull(drawingSupplier22);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor5 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot0.getDomainAxis();
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot0.setOutlineStroke(stroke7);
        org.jfree.chart.plot.Marker marker9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(categoryAnchor5);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        java.util.List list7 = categoryPlot0.getCategories();
        boolean boolean8 = categoryPlot0.isRangeCrosshairVisible();
        categoryPlot0.setAnchorValue(100.0d);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder8 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer((int) (short) 0, categoryItemRenderer10);
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot0.getRangeAxis((int) (byte) 0);
        categoryPlot0.configureDomainAxes();
        java.awt.Stroke stroke15 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        boolean boolean3 = categoryPlot0.isRangeZoomable();
        boolean boolean4 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.configureRangeAxes();
        categoryPlot5.clearRangeMarkers();
        categoryPlot5.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke11 = categoryPlot5.getRangeGridlineStroke();
        double double12 = categoryPlot5.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        categoryPlot5.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray17 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer16 };
        categoryPlot5.setRenderers(categoryItemRendererArray17);
        java.awt.Paint paint19 = categoryPlot5.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis22, categoryItemRenderer23);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = categoryPlot24.getDomainAxis();
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot24.getDomainAxisLocation(0);
        categoryPlot5.setDomainAxisLocation(axisLocation27, false);
        categoryPlot0.setRangeAxisLocation(axisLocation27, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(categoryAxis25);
        org.junit.Assert.assertNotNull(axisLocation27);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(plotOrientation13);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        categoryPlot17.setRangeGridlinesVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot17.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray37 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis36 };
        categoryPlot35.setDomainAxes(categoryAxisArray37);
        categoryPlot35.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot35.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean44 = categoryPlot43.isRangeZoomable();
        org.jfree.chart.plot.Plot plot45 = categoryPlot43.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation46 = categoryPlot43.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge47 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation42, plotOrientation46);
        categoryPlot17.setOrientation(plotOrientation46);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor49 = categoryPlot17.getDomainGridlinePosition();
        categoryPlot5.setDomainGridlinePosition(categoryAnchor49);
        categoryPlot5.setAnchorValue((double) 10);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(collection23);
        org.junit.Assert.assertNull(categoryDataset31);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertNotNull(categoryAxisArray37);
        org.junit.Assert.assertNotNull(axisLocation42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(plot45);
        org.junit.Assert.assertNotNull(plotOrientation46);
        org.junit.Assert.assertNotNull(rectangleEdge47);
        org.junit.Assert.assertNotNull(categoryAnchor49);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        categoryPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = categoryPlot0.getAxisOffset();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        categoryPlot21.setRangeAxis((int) (byte) 100, valueAxis23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        boolean boolean29 = categoryPlot21.render(graphics2D25, rectangle2D26, (int) (byte) 100, plotRenderingInfo28);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = categoryPlot21.getRenderer((int) (short) 10);
        java.awt.Stroke stroke32 = categoryPlot21.getDomainGridlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke32);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(categoryItemRenderer31);
        org.junit.Assert.assertNotNull(stroke32);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = categoryPlot0.getDataset();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertNull(categoryDataset19);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        categoryPlot0.setDomainGridlinesVisible(false);
        java.awt.Font font34 = categoryPlot0.getNoDataMessageFont();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        java.awt.geom.Point2D point2D37 = null;
        org.jfree.chart.plot.PlotState plotState38 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D35, rectangle2D36, point2D37, plotState38, plotRenderingInfo39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(rectangleEdge31);
        org.junit.Assert.assertNotNull(font34);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRenderer((int) '#');
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(categoryItemRenderer21);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        org.jfree.chart.axis.AxisSpace axisSpace32 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(axisSpace32);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = categoryPlot0.getDataset();
        boolean boolean22 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot0.getRendererForDataset(categoryDataset23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(categoryItemRenderer24);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        float float22 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.jfree.chart.axis.ValueAxis valueAxis31 = categoryPlot12.getRangeAxis();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation32 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot12.addAnnotation(categoryAnnotation32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryAnchor28);
        org.junit.Assert.assertNull(valueAxis31);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        categoryPlot0.setAnchorValue((double) (-1.0f), false);
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace36);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setBackgroundImageAlignment((int) (byte) 1);
        categoryPlot0.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot0.getFixedLegendItems();
        int int11 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(legendItemCollection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = categoryPlot0.getDrawingSupplier();
        java.awt.Paint paint37 = categoryPlot0.getOutlinePaint();
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
        org.junit.Assert.assertNotNull(drawingSupplier36);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        boolean boolean26 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        categoryPlot0.addChangeListener(plotChangeListener27);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(sortOrder15);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        java.awt.Image image16 = null;
        categoryPlot0.setBackgroundImage(image16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = categoryPlot18.getDataset((int) (short) 1);
        categoryPlot18.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot18.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = categoryPlot18.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection23);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertNotNull(legendItemCollection23);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setWeight((-1));
        java.util.List list5 = categoryPlot0.getCategories();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = categoryPlot6.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot6.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot6.markerChanged(markerChangeEvent13);
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot6.getRangeAxisEdge((int) (short) 10);
        java.awt.Paint paint17 = categoryPlot6.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = categoryPlot0.getDataset();
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(categoryDataset19);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent6);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        categoryPlot0.setDomainAxis(categoryAxis4);
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        org.jfree.data.Range range7 = categoryPlot0.getDataRange(valueAxis6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup11 = categoryPlot8.getDatasetGroup();
        categoryPlot8.setRangeCrosshairVisible(false);
        java.awt.Paint paint14 = categoryPlot8.getRangeGridlinePaint();
        categoryPlot0.setRangeGridlinePaint(paint14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        categoryPlot0.setDomainGridlinesVisible(true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(valueAxisArray30);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor5 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot6.setRangeAxis((int) (byte) 100, valueAxis8);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot6.getRangeAxisLocation();
        categoryPlot6.setBackgroundAlpha((float) (byte) 1);
        categoryPlot6.clearDomainMarkers(0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot6.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        categoryPlot6.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = categoryPlot6.getOutlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint18);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(categoryAnchor5);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot0.getDomainAxisForDataset((int) ' ');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot0.zoomDomainAxes((double) 1.0f, plotRenderingInfo22, point2D23);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertNull(legendItemCollection18);
        org.junit.Assert.assertNull(categoryAxis20);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        java.awt.Paint paint4 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) ' ', categoryDataset6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer9, true);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        boolean boolean16 = categoryPlot0.render(graphics2D12, rectangle2D13, (int) 'a', plotRenderingInfo15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Paint paint8 = categoryPlot0.getBackgroundPaint();
        java.awt.Stroke stroke9 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset();
        categoryPlot0.setBackgroundAlpha((float) '4');
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        java.awt.Image image7 = null;
        categoryPlot0.setBackgroundImage(image7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick(0, (int) '#', plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        categoryPlot0.setDomainAxis(categoryAxis4);
        boolean boolean6 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendItemCollection7);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        org.jfree.chart.axis.AxisSpace axisSpace39 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace39);
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset(categoryDataset12);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot0.getRenderer(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray23 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis22 };
        categoryPlot21.setDomainAxes(categoryAxisArray23);
        categoryPlot21.setAnchorValue(10.0d);
        categoryPlot21.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean30 = categoryPlot29.isRangeZoomable();
        categoryPlot29.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder34 = categoryPlot29.getDatasetRenderingOrder();
        categoryPlot21.setDatasetRenderingOrder(datasetRenderingOrder34);
        java.awt.Paint paint36 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        categoryPlot21.setNoDataMessagePaint(paint36);
        categoryPlot0.setRangeCrosshairPaint(paint36);
        org.jfree.chart.util.Layer layer40 = null;
        java.util.Collection collection41 = categoryPlot0.getRangeMarkers((int) (short) 1, layer40);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sortOrder15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(categoryAxisArray23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder34);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNull(collection41);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setBackgroundImageAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean44 = categoryPlot43.isRangeZoomable();
        categoryPlot43.setAnchorValue(100.0d, false);
        float float48 = categoryPlot43.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder49 = categoryPlot43.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder49);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 1.0f + "'", float48 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder49);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        java.awt.Paint paint12 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryMarker categoryMarker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer(0);
        float float11 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        int int17 = categoryPlot5.getDomainAxisCount();
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        int int3 = categoryPlot0.getRangeAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        categoryPlot0.setDataset(categoryDataset4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        int int14 = categoryPlot0.getIndexOf(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        java.awt.Paint paint14 = categoryPlot0.getRangeGridlinePaint();
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
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.util.List list8 = categoryPlot0.getCategories();
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        categoryPlot0.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo5, point2D6, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (byte) 10);
        boolean boolean11 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent12);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        boolean boolean35 = categoryPlot0.isRangeZoomable();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer(categoryItemRenderer12, false);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        boolean boolean27 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis(categoryAxis17);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryAxis7);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        int int9 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        float float7 = categoryPlot0.getBackgroundAlpha();
        java.lang.String str8 = categoryPlot0.getPlotType();
        java.lang.Object obj9 = categoryPlot0.clone();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        categoryPlot0.setRangeAxis((int) (byte) 10, valueAxis11);
        org.jfree.chart.axis.AxisLocation axisLocation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation(axisLocation13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Category Plot" + "'", str8, "Category Plot");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 0);
        float float8 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo10, point2D11);
        categoryPlot0.clearDomainMarkers((int) (short) 10);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis19 };
        categoryPlot18.setDomainAxes(categoryAxisArray20);
        categoryPlot18.configureDomainAxes();
        java.awt.Stroke stroke23 = categoryPlot18.getOutlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke23);
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        java.awt.Paint paint13 = categoryPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(0);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        categoryPlot0.axisChanged(axisChangeEvent12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor12 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAnchor12);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        categoryPlot0.axisChanged(axisChangeEvent20);
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.setNoDataMessage("");
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis19 = categoryPlot0.getRangeAxisForDataset(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(valueAxis19);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxes(categoryAxisArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        categoryPlot24.setRangeAxis((int) (byte) 100, valueAxis26);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = categoryPlot24.getDomainMarkers((int) (byte) 10, layer29);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean32 = categoryPlot31.isRangeZoomable();
        categoryPlot31.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation36 = categoryPlot31.getOrientation();
        categoryPlot24.setOrientation(plotOrientation36);
        boolean boolean38 = categoryPlot24.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray41 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis40 };
        categoryPlot39.setDomainAxes(categoryAxisArray41);
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        categoryPlot39.setRangeAxis(valueAxis43);
        categoryPlot39.setWeight((int) (short) 10);
        java.awt.Paint paint47 = categoryPlot39.getOutlinePaint();
        categoryPlot24.setOutlinePaint(paint47);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder49 = categoryPlot24.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder49);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(plotOrientation36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray41);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(datasetRenderingOrder49);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray6 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis5 };
        categoryPlot4.setDomainAxes(categoryAxisArray6);
        float float8 = categoryPlot4.getBackgroundAlpha();
        categoryPlot4.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot4.getDomainAxisForDataset((int) '#');
        boolean boolean14 = categoryPlot4.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot4.setRenderer((int) '4', categoryItemRenderer16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis19 };
        categoryPlot18.setDomainAxes(categoryAxisArray20);
        float float22 = categoryPlot18.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        categoryPlot23.clearDomainMarkers();
        categoryPlot23.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot23.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        categoryPlot23.removeChangeListener(plotChangeListener30);
        java.awt.Paint paint32 = categoryPlot23.getBackgroundPaint();
        categoryPlot18.setRangeGridlinePaint(paint32);
        categoryPlot4.setOutlinePaint(paint32);
        categoryPlot0.setRangeGridlinePaint(paint32);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        categoryPlot36.setRangeAxis((int) (byte) 100, valueAxis38);
        org.jfree.chart.util.Layer layer41 = null;
        java.util.Collection collection42 = categoryPlot36.getDomainMarkers((int) (byte) 10, layer41);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot43.configureRangeAxes();
        categoryPlot43.clearDomainMarkers();
        boolean boolean46 = categoryPlot36.equals((java.lang.Object) categoryPlot43);
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot47.configureRangeAxes();
        categoryPlot47.clearRangeMarkers();
        categoryPlot47.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke53 = categoryPlot47.getRangeGridlineStroke();
        double double54 = categoryPlot47.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        categoryPlot47.drawBackgroundImage(graphics2D55, rectangle2D56);
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = categoryPlot47.getInsets();
        categoryPlot36.setAxisOffset(rectangleInsets58);
        categoryPlot0.setInsets(rectangleInsets58);
        org.jfree.chart.axis.AxisLocation axisLocation62 = categoryPlot0.getDomainAxisLocation((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray6);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets58);
        org.junit.Assert.assertNotNull(axisLocation62);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot0.getDomainMarkers((int) (short) 100, layer20);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(collection21);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
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
        boolean boolean23 = categoryPlot9.isRangeCrosshairVisible();
        java.awt.Stroke stroke24 = categoryPlot9.getDomainGridlineStroke();
        categoryPlot9.setBackgroundImageAlignment(100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor27 = categoryPlot9.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor27);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(categoryAnchor27);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.Plot plot7 = categoryPlot0.getParent();
        categoryPlot0.setWeight((-1));
        int int10 = categoryPlot0.getWeight();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        java.util.List list4 = categoryPlot0.getCategories();
        categoryPlot0.setAnchorValue((double) 1L, false);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot9.zoomRangeAxes((-1.0d), plotRenderingInfo12, point2D13, false);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot9.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot9.setRangeAxes(valueAxisArray18);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        java.util.List list21 = categoryPlot9.getCategoriesForAxis(categoryAxis20);
        categoryPlot9.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot23.configureRangeAxes();
        categoryPlot23.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = categoryPlot23.getLegendItems();
        categoryPlot9.setFixedLegendItems(legendItemCollection26);
        categoryPlot0.setFixedLegendItems(legendItemCollection26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(legendItemCollection26);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        categoryPlot0.setRenderer((int) '4', categoryItemRenderer31);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder24);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        categoryPlot3.setRangeAxis((int) (byte) 100, valueAxis5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot3.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation7);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        categoryPlot0.notifyListeners(plotChangeEvent10);
        org.junit.Assert.assertNotNull(axisLocation7);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.setForegroundAlpha((float) (short) 100);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor5 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getDomainMarkers((int) 'a', layer8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        boolean boolean14 = categoryPlot0.render(graphics2D10, rectangle2D11, (int) (short) 10, plotRenderingInfo13);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(categoryAnchor5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        boolean boolean5 = categoryPlot0.isRangeZoomable();
        boolean boolean6 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.addChangeListener(plotChangeListener7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot0.setRenderer(categoryItemRenderer17);
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
        categoryPlot0.setOrientation(plotOrientation31);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(plotOrientation31);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        boolean boolean23 = categoryPlot0.isOutlineVisible();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot0.getDomainAxisLocation();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(axisLocation26);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot0.getDataset();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(15, valueAxis7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier9);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 100, plotRenderingInfo33, point2D34, true);
        java.awt.Paint paint37 = categoryPlot0.getBackgroundPaint();
        categoryPlot0.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(categoryAnchor31);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot19.setRangeAxis((int) (byte) 100, valueAxis21);
        boolean boolean24 = categoryPlot19.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder25 = categoryPlot19.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder25);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(sortOrder25);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        org.jfree.chart.axis.AxisSpace axisSpace35 = categoryPlot10.getFixedDomainAxisSpace();
        categoryPlot10.clearRangeMarkers();
        categoryPlot10.clearDomainMarkers(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = categoryPlot10.getInsets();
        categoryPlot0.setAxisOffset(rectangleInsets39);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
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
        org.junit.Assert.assertNull(axisSpace35);
        org.junit.Assert.assertNotNull(rectangleInsets39);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.String str15 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace5);
        java.lang.String str7 = categoryPlot0.getNoDataMessage();
        java.util.List list8 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(drawingSupplier4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        categoryPlot0.clearDomainMarkers();
        java.util.List list7 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset((int) (byte) -1);
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(categoryAxis9);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        boolean boolean7 = categoryPlot0.isRangeCrosshairLockedOnData();
        boolean boolean8 = categoryPlot0.isRangeGridlinesVisible();
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
        java.awt.Paint paint23 = categoryPlot9.getOutlinePaint();
        org.jfree.chart.util.SortOrder sortOrder24 = categoryPlot9.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(sortOrder24);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Image image4 = null;
        categoryPlot0.setBackgroundImage(image4);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getRangeMarkers(8, layer7);
        int int9 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomRangeAxes((double) 10, plotRenderingInfo7, point2D8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNull(axisSpace12);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation18 = categoryPlot0.getOrientation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertNotNull(plotOrientation18);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(categoryItemRenderer17);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray21 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis20 };
        categoryPlot19.setDomainAxes(categoryAxisArray21);
        categoryPlot19.configureDomainAxes();
        java.awt.Stroke stroke24 = categoryPlot19.getOutlineStroke();
        java.util.List list25 = categoryPlot19.getCategories();
        org.jfree.chart.util.SortOrder sortOrder26 = categoryPlot19.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder26);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(list25);
        org.junit.Assert.assertNotNull(sortOrder26);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.addChangeListener(plotChangeListener23);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 100, plotRenderingInfo33, point2D34, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot37.configureRangeAxes();
        categoryPlot37.clearDomainMarkers();
        categoryPlot37.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint42 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot37.setNoDataMessagePaint(paint42);
        java.awt.Image image44 = categoryPlot37.getBackgroundImage();
        java.awt.Paint paint45 = categoryPlot37.getDomainGridlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint45);
        categoryPlot0.mapDatasetToRangeAxis(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(categoryAnchor31);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        org.jfree.data.general.DatasetGroup datasetGroup5 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot6.setRangeAxis((int) (byte) 100, valueAxis8);
        boolean boolean10 = categoryPlot6.isOutlineVisible();
        categoryPlot6.setRangeCrosshairLockedOnData(true);
        categoryPlot6.setOutlineVisible(true);
        org.jfree.chart.axis.AxisSpace axisSpace15 = categoryPlot6.getFixedRangeAxisSpace();
        float float16 = categoryPlot6.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot17 = categoryPlot6.getParent();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot6);
        categoryPlot6.setOutlineVisible(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(axisSpace15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNull(plot17);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        org.jfree.data.category.CategoryDataset categoryDataset20 = categoryPlot0.getDataset((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot22.configureRangeAxes();
        categoryPlot22.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup25 = categoryPlot22.getDatasetGroup();
        categoryPlot22.setRangeCrosshairVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot22.getDomainAxisEdge((int) (byte) 0);
        org.jfree.chart.util.Layer layer31 = null;
        java.util.Collection collection32 = categoryPlot22.getRangeMarkers(1, layer31);
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot22.getRangeAxisLocation((int) (byte) 10);
        categoryPlot0.setRangeAxisLocation(0, axisLocation34, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNull(axisSpace17);
        org.junit.Assert.assertNotNull(plotOrientation18);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNull(collection32);
        org.junit.Assert.assertNotNull(axisLocation34);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        java.awt.Paint paint9 = categoryPlot0.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset();
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        float float7 = categoryPlot0.getForegroundAlpha();
        int int8 = categoryPlot0.getWeight();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = categoryPlot0.getFixedLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(legendItemCollection9);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setBackgroundImageAlignment((int) (byte) 1);
        categoryPlot0.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getRangeAxisEdge((int) '#');
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge14);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        categoryPlot0.setDataset(10, categoryDataset19);
        categoryPlot0.setForegroundAlpha((float) 100L);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot0.getRangeMarkers(0, layer24);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNull(collection25);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        boolean boolean13 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 100, valueAxis10, false);
        boolean boolean13 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        categoryPlot0.setDataset((int) (short) 0, categoryDataset15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, (int) (short) 1, plotRenderingInfo20);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent22);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(0);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot0.getInsets();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        boolean boolean18 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRenderer((int) (short) -1, categoryItemRenderer38);
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
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(rectangleEdge36);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis((int) '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean8 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getDomainMarkers((int) (byte) 100, layer10);
        java.lang.String str12 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        java.awt.geom.Point2D point2D44 = null;
        org.jfree.chart.plot.PlotState plotState45 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D42, rectangle2D43, point2D44, plotState45, plotRenderingInfo46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.configureRangeAxes();
        java.lang.String str10 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Category Plot" + "'", str10, "Category Plot");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent2 = null;
        categoryPlot0.axisChanged(axisChangeEvent2);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomRangeAxes((double) (short) -1, plotRenderingInfo6, point2D7);
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge2 = categoryPlot0.getDomainAxisEdge();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 10);
        org.junit.Assert.assertNotNull(rectangleEdge2);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        java.awt.Paint paint35 = categoryPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(categoryDataset26);
        org.junit.Assert.assertNotNull(plotOrientation32);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot0.getInsets();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot0.getRangeAxisEdge((int) 'a');
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(rectangleEdge18);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = categoryPlot0.getOrientation();
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setRangeCrosshairValue(100.0d, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(plotOrientation5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis8 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(valueAxis8);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 100, (int) (byte) -1);
        categoryPlot0.setRangeCrosshairValue((double) (short) 100, false);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(sortOrder20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(axisLocation25);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        boolean boolean11 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection12 = categoryPlot0.getLegendItems();
        categoryPlot0.setAnchorValue((double) 100L);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(legendItemCollection12);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot25.configureRangeAxes();
        categoryPlot25.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        categoryPlot25.setDataset(categoryDataset28);
        categoryPlot25.setAnchorValue(0.0d);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean33 = categoryPlot32.isRangeZoomable();
        categoryPlot32.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        java.util.List list37 = categoryPlot32.getCategoriesForAxis(categoryAxis36);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent38 = null;
        categoryPlot32.axisChanged(axisChangeEvent38);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = categoryPlot32.getInsets();
        categoryPlot25.setAxisOffset(rectangleInsets40);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        java.awt.geom.Point2D point2D44 = null;
        categoryPlot25.zoomRangeAxes((double) ' ', plotRenderingInfo43, point2D44, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer47 = null;
        categoryPlot25.setRenderer(categoryItemRenderer47);
        double double49 = categoryPlot25.getAnchorValue();
        java.awt.Paint paint50 = categoryPlot25.getBackgroundPaint();
        categoryPlot0.setNoDataMessagePaint(paint50);
        java.awt.Stroke stroke52 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        categoryPlot0.setDomainGridlinesVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset33 = categoryPlot0.getDataset();
        java.awt.Paint paint34 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.util.Layer layer36 = null;
        java.util.Collection collection37 = categoryPlot0.getDomainMarkers((int) (byte) -1, layer36);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(legendItemCollection28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(categoryDataset33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(collection37);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = categoryPlot0.getAxisOffset();
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot0.getFixedRangeAxisSpace();
        categoryPlot0.setBackgroundImageAlpha((float) (short) 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(axisSpace11);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        java.lang.Object obj6 = categoryPlot0.clone();
        java.awt.Paint paint7 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        java.awt.Paint paint15 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        categoryPlot0.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        categoryPlot0.setNoDataMessage("");
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
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer10, true);
        int int13 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset26);
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
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomDomainAxes((double) (-1.0f), (double) 100.0f, plotRenderingInfo6, point2D7);
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setBackgroundImageAlignment((-1));
        org.junit.Assert.assertNotNull(categoryAxisArray2);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((-1));
        org.jfree.chart.axis.ValueAxis valueAxis8 = categoryPlot0.getRangeAxis(0);
        java.awt.Font font9 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getDomainMarkers(layer10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) (byte) 10, layer5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot7.configureRangeAxes();
        categoryPlot7.clearDomainMarkers();
        boolean boolean10 = categoryPlot0.equals((java.lang.Object) categoryPlot7);
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
        categoryPlot0.setAxisOffset(rectangleInsets22);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent24 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent24);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        java.awt.Image image10 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNull(range9);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(15, valueAxis7);
        categoryPlot0.clearDomainMarkers((int) (byte) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot0.getRenderer((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(categoryItemRenderer12);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        java.awt.Paint paint14 = categoryPlot0.getRangeCrosshairPaint();
        java.awt.Paint paint15 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        categoryPlot15.setDataset(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot15.getRendererForDataset(categoryDataset20);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray24 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis23 };
        categoryPlot22.setDomainAxes(categoryAxisArray24);
        categoryPlot22.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation29 = categoryPlot22.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        categoryPlot30.setRangeAxis((int) (byte) 100, valueAxis32);
        org.jfree.chart.util.Layer layer35 = null;
        java.util.Collection collection36 = categoryPlot30.getDomainMarkers((int) (byte) 10, layer35);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean38 = categoryPlot37.isRangeZoomable();
        categoryPlot37.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation42 = categoryPlot37.getOrientation();
        categoryPlot30.setOrientation(plotOrientation42);
        org.jfree.chart.util.RectangleEdge rectangleEdge44 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation29, plotOrientation42);
        categoryPlot15.setOrientation(plotOrientation42);
        java.awt.Paint paint46 = categoryPlot15.getRangeGridlinePaint();
        org.jfree.chart.util.SortOrder sortOrder47 = categoryPlot15.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder47);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(categoryAxisArray24);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(plotOrientation42);
        org.junit.Assert.assertNotNull(rectangleEdge44);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(sortOrder47);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor5 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        org.jfree.data.Range range7 = categoryPlot0.getDataRange(valueAxis6);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(categoryAnchor5);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDataset((int) (short) -1, categoryDataset18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
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
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
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
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        float float21 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        java.util.List list29 = categoryPlot0.getCategoriesForAxis(categoryAxis28);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(categoryAxisArray11);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(plotOrientation20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers((int) (short) 0, layer16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot18.configureRangeAxes();
        categoryPlot18.clearDomainMarkers();
        categoryPlot18.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot18.setNoDataMessagePaint(paint23);
        java.awt.Image image25 = categoryPlot18.getBackgroundImage();
        java.awt.Paint paint26 = categoryPlot18.getDomainGridlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint26);
        org.jfree.chart.plot.CategoryMarker categoryMarker28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker28, layer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        boolean boolean6 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Paint paint7 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearRangeMarkers();
        boolean boolean11 = categoryPlot8.isOutlineVisible();
        categoryPlot8.setRangeGridlinesVisible(false);
        categoryPlot8.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        categoryPlot16.clearRangeMarkers();
        boolean boolean19 = categoryPlot16.isOutlineVisible();
        categoryPlot16.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot16.setRenderer(categoryItemRenderer22);
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot16.getDomainAxisLocation();
        categoryPlot8.setRangeAxisLocation(axisLocation24);
        java.util.List list26 = categoryPlot8.getCategories();
        java.awt.Paint paint27 = categoryPlot8.getDomainGridlinePaint();
        categoryPlot0.setRangeCrosshairPaint(paint27);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNull(list26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        float float7 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearDomainMarkers();
        categoryPlot8.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot8.setNoDataMessagePaint(paint13);
        java.awt.Image image15 = categoryPlot8.getBackgroundImage();
        java.awt.Image image16 = categoryPlot8.getBackgroundImage();
        java.awt.Stroke stroke17 = categoryPlot8.getRangeCrosshairStroke();
        categoryPlot0.setDomainGridlineStroke(stroke17);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = categoryPlot0.getLegendItems();
        int int4 = categoryPlot0.getDatasetCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        java.util.List list6 = categoryPlot0.getCategoriesForAxis(categoryAxis5);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getDomainMarkers(layer7);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation30 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder24);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot6.configureRangeAxes();
        categoryPlot6.clearDomainMarkers();
        categoryPlot6.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset12 = categoryPlot6.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        categoryPlot6.removeChangeListener(plotChangeListener13);
        java.awt.Paint paint15 = categoryPlot6.getBackgroundPaint();
        org.jfree.chart.axis.AxisSpace axisSpace16 = null;
        categoryPlot6.setFixedRangeAxisSpace(axisSpace16);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot6.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) 'a', axisLocation18, false);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.awt.Paint paint18 = categoryPlot0.getDomainGridlinePaint();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D19, rectangle2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.setRangeGridlinesVisible(true);
        java.awt.Paint paint35 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(range31);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNull(categoryAxis17);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo5, point2D6, true);
        java.awt.Font font9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font9);
        categoryPlot0.setBackgroundImageAlignment(10);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        boolean boolean17 = categoryPlot0.render(graphics2D13, rectangle2D14, (int) (short) -1, plotRenderingInfo16);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot0.getRangeAxisLocation(0);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        java.awt.Font font7 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(15, categoryMarker30, layer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot0.setRenderer(categoryItemRenderer16, true);
        categoryPlot0.setRangeCrosshairValue((double) (byte) 0);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray16 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot0.setDomainAxes(categoryAxisArray16);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        categoryPlot20.clearRangeMarkers();
        boolean boolean23 = categoryPlot20.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot24.configureRangeAxes();
        categoryPlot24.clearDomainMarkers();
        categoryPlot24.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray31 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis30 };
        categoryPlot29.setDomainAxes(categoryAxisArray31);
        java.awt.Stroke stroke33 = categoryPlot29.getOutlineStroke();
        categoryPlot24.setRangeCrosshairStroke(stroke33);
        categoryPlot20.setRangeCrosshairStroke(stroke33);
        categoryPlot0.setOutlineStroke(stroke33);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray31);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers(0, layer16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = categoryPlot0.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis20 = categoryPlot0.getRangeAxis(1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNull(valueAxis20);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot0.setRenderer(categoryItemRenderer17);
        categoryPlot0.setRangeCrosshairValue((double) (-1L), true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot20.getRangeAxisLocation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot20.setRenderer((int) (short) -1, categoryItemRenderer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(axisLocation32);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.LegendItemCollection legendItemCollection24 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(legendItemCollection24);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        categoryPlot0.removeChangeListener(plotChangeListener26);
        java.util.List list28 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        float float7 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        boolean boolean22 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.removeChangeListener(plotChangeListener23);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        float float6 = categoryPlot0.getBackgroundAlpha();
        java.awt.Stroke stroke7 = categoryPlot0.getRangeCrosshairStroke();
        categoryPlot0.setBackgroundImageAlignment((-1));
        org.jfree.chart.plot.Plot plot10 = categoryPlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke11 = plot10.getOutlineStroke();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot19.setRangeAxis((int) (byte) 100, valueAxis21);
        boolean boolean23 = categoryPlot19.isOutlineVisible();
        categoryPlot19.setRangeCrosshairLockedOnData(true);
        boolean boolean26 = categoryPlot19.isDomainZoomable();
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = categoryPlot19.getDomainMarkers((int) (byte) 0, layer28);
        org.jfree.chart.plot.PlotOrientation plotOrientation30 = categoryPlot19.getOrientation();
        categoryPlot0.setOrientation(plotOrientation30);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertNotNull(plotOrientation30);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        categoryPlot0.setDomainAxis((int) 'a', categoryAxis18);
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setAnchorValue((double) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Category Plot" + "'", str15, "Category Plot");
        org.junit.Assert.assertNull(plot16);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = categoryPlot0.getAxisOffset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer30);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNull(categoryItemRenderer27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        categoryPlot0.setRenderer(categoryItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        categoryPlot11.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        categoryPlot11.setDataset(categoryDataset14);
        categoryPlot11.setWeight(10);
        org.jfree.chart.util.SortOrder sortOrder18 = categoryPlot11.getColumnRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(sortOrder18);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomDomainAxes((double) (-1.0f), (double) 100.0f, plotRenderingInfo6, point2D7);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        categoryPlot9.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot9.setDataset(categoryDataset12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot9.getRendererForDataset(categoryDataset14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray18 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis17 };
        categoryPlot16.setDomainAxes(categoryAxisArray18);
        categoryPlot16.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot16.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        categoryPlot24.setRangeAxis((int) (byte) 100, valueAxis26);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = categoryPlot24.getDomainMarkers((int) (byte) 10, layer29);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean32 = categoryPlot31.isRangeZoomable();
        categoryPlot31.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation36 = categoryPlot31.getOrientation();
        categoryPlot24.setOrientation(plotOrientation36);
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation23, plotOrientation36);
        categoryPlot9.setOrientation(plotOrientation36);
        java.awt.Paint paint40 = categoryPlot9.getRangeGridlinePaint();
        categoryPlot0.setDomainGridlinePaint(paint40);
        org.jfree.chart.plot.Marker marker43 = null;
        org.jfree.chart.util.Layer layer44 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 100, marker43, layer44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(categoryAxisArray18);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(plotOrientation36);
        org.junit.Assert.assertNotNull(rectangleEdge38);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot20.zoomRangeAxes((-1.0d), plotRenderingInfo23, point2D24, false);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        categoryPlot20.setRangeAxis(valueAxis27);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray29 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot20.setRenderers(categoryItemRendererArray29);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot32.configureRangeAxes();
        categoryPlot32.clearRangeMarkers();
        boolean boolean35 = categoryPlot32.isOutlineVisible();
        categoryPlot32.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        categoryPlot32.setRenderer(categoryItemRenderer38);
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot32.getDomainAxisLocation();
        categoryPlot20.setDomainAxisLocation((int) (short) 0, axisLocation40);
        categoryPlot0.setDomainAxisLocation((int) (byte) 10, axisLocation40);
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        java.awt.geom.Point2D point2D45 = null;
        org.jfree.chart.plot.PlotState plotState46 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D43, rectangle2D44, point2D45, plotState46, plotRenderingInfo47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(categoryItemRendererArray29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(axisLocation40);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = categoryPlot0.getRenderer((int) (byte) 1);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(categoryItemRenderer28);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        categoryPlot0.clearDomainMarkers();
        float float9 = categoryPlot0.getBackgroundAlpha();
        java.awt.Paint paint10 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (byte) 100);
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(sortOrder16);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.awt.Paint paint25 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray26 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer25 };
        categoryPlot0.setRenderers(categoryItemRendererArray26);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(categoryItemRendererArray26);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        java.lang.Object obj30 = categoryPlot16.clone();
        categoryPlot16.clearAnnotations();
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        categoryPlot32.setRangeAxis((int) (byte) 100, valueAxis34);
        org.jfree.chart.util.Layer layer37 = null;
        java.util.Collection collection38 = categoryPlot32.getDomainMarkers((int) (byte) 10, layer37);
        org.jfree.chart.axis.AxisSpace axisSpace39 = null;
        categoryPlot32.setFixedRangeAxisSpace(axisSpace39);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        java.awt.geom.Point2D point2D44 = null;
        categoryPlot32.zoomRangeAxes((double) (short) 10, 10.0d, plotRenderingInfo43, point2D44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = categoryPlot32.getDataset();
        org.jfree.chart.axis.AxisLocation axisLocation47 = categoryPlot32.getRangeAxisLocation();
        categoryPlot16.setRangeAxisLocation(axisLocation47, false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (byte) -1, axisLocation47, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(collection38);
        org.junit.Assert.assertNull(categoryDataset46);
        org.junit.Assert.assertNotNull(axisLocation47);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot0.getRendererForDataset(categoryDataset14);
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNull(categoryItemRenderer15);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearDomainMarkers();
        java.awt.Paint paint6 = null;
        categoryPlot0.setOutlinePaint(paint6);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        categoryPlot19.clearDomainMarkers();
        categoryPlot19.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot19.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent26 = null;
        categoryPlot19.rendererChanged(rendererChangeEvent26);
        java.awt.Font font28 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot19.setNoDataMessageFont(font28);
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = categoryPlot19.getDomainAxisEdge();
        boolean boolean31 = categoryPlot0.equals((java.lang.Object) rectangleEdge30);
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
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        java.lang.Object obj12 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Category Plot" + "'", str8, "Category Plot");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D32, rectangle2D33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        org.jfree.chart.plot.Plot plot14 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        categoryPlot0.clearRangeMarkers((int) 'a');
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray10 = new org.jfree.chart.axis.ValueAxis[] { valueAxis9 };
        categoryPlot0.setRangeAxes(valueAxisArray10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(valueAxisArray10);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean30 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(sortOrder20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray9 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis8 };
        categoryPlot7.setDomainAxes(categoryAxisArray9);
        categoryPlot7.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot7.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot15.setRangeAxis((int) (byte) 100, valueAxis17);
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot15.getDomainMarkers((int) (byte) 10, layer20);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean23 = categoryPlot22.isRangeZoomable();
        categoryPlot22.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation27 = categoryPlot22.getOrientation();
        categoryPlot15.setOrientation(plotOrientation27);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation14, plotOrientation27);
        categoryPlot0.setOrientation(plotOrientation27);
        org.jfree.chart.plot.Plot plot31 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(categoryAxisArray9);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(plotOrientation27);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(plot31);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sortOrder11);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray9 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis8 };
        categoryPlot7.setDomainAxes(categoryAxisArray9);
        categoryPlot7.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot7.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot15.setRangeAxis((int) (byte) 100, valueAxis17);
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot15.getDomainMarkers((int) (byte) 10, layer20);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean23 = categoryPlot22.isRangeZoomable();
        categoryPlot22.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation27 = categoryPlot22.getOrientation();
        categoryPlot15.setOrientation(plotOrientation27);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation14, plotOrientation27);
        categoryPlot0.setOrientation(plotOrientation27);
        categoryPlot0.setRangeCrosshairValue(0.0d);
        categoryPlot0.setAnchorValue((double) 101);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(categoryAxisArray9);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(plotOrientation27);
        org.junit.Assert.assertNotNull(rectangleEdge29);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = categoryPlot0.getRangeMarkers((int) (short) 10, layer12);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertNull(collection13);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot0.getDomainMarkers(layer14);
        float float16 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker25, layer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        categoryPlot0.setDataset(0, categoryDataset55);
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
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot0.getLegendItems();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.configureRangeAxes();
        categoryPlot17.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        categoryPlot20.setRangeAxis((int) (byte) 100, valueAxis22);
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot20.getRangeAxisLocation();
        categoryPlot17.setDomainAxisLocation(axisLocation24);
        categoryPlot17.clearRangeMarkers();
        int int27 = categoryPlot17.getDatasetCount();
        java.awt.Image image28 = null;
        categoryPlot17.setBackgroundImage(image28);
        org.jfree.chart.LegendItemCollection legendItemCollection30 = categoryPlot17.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection30);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(legendItemCollection30);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        categoryPlot0.setAnchorValue((double) 101, true);
        java.awt.Paint paint31 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        categoryPlot0.setWeight((int) '4');
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryItemRenderer18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Category Plot" + "'", str23, "Category Plot");
        org.junit.Assert.assertNull(plot24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        java.awt.geom.Point2D point2D38 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 100, (double) 100L, plotRenderingInfo37, point2D38);
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        categoryPlot0.setDomainAxis(categoryAxis40);
        boolean boolean42 = categoryPlot0.isSubplot();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        java.awt.Paint paint24 = categoryPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(categoryAxisArray18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        boolean boolean9 = categoryPlot0.isRangeZoomable();
        java.lang.String str10 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        java.awt.Paint paint37 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        java.lang.String str22 = categoryPlot0.getPlotType();
        org.jfree.chart.axis.AxisSpace axisSpace23 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace23);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Category Plot" + "'", str22, "Category Plot");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        float float16 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(axisSpace15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        java.awt.Stroke stroke5 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot6.configureRangeAxes();
        categoryPlot6.clearRangeMarkers();
        categoryPlot6.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke12 = categoryPlot6.getRangeGridlineStroke();
        double double13 = categoryPlot6.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot6.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray18 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer17 };
        categoryPlot6.setRenderers(categoryItemRendererArray18);
        java.awt.Paint paint20 = categoryPlot6.getOutlinePaint();
        org.jfree.chart.util.SortOrder sortOrder21 = categoryPlot6.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder21);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean24 = categoryPlot23.isRangeZoomable();
        categoryPlot23.setAnchorValue(100.0d, false);
        float float28 = categoryPlot23.getForegroundAlpha();
        int int29 = categoryPlot23.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        categoryPlot23.setRangeAxis((int) (byte) 100, valueAxis31, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray36 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis35 };
        categoryPlot34.setDomainAxes(categoryAxisArray36);
        categoryPlot34.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation41 = categoryPlot34.getDomainAxisLocation(100);
        categoryPlot23.setRangeAxisLocation(axisLocation41, false);
        float float44 = categoryPlot23.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot45.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        java.awt.geom.Point2D point2D49 = null;
        categoryPlot45.zoomRangeAxes((-1.0d), plotRenderingInfo48, point2D49, false);
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        categoryPlot45.setRangeAxis(valueAxis52);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray54 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot45.setRenderers(categoryItemRendererArray54);
        categoryPlot23.setRenderers(categoryItemRendererArray54);
        categoryPlot0.setRenderers(categoryItemRendererArray54);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(sortOrder21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray36);
        org.junit.Assert.assertNotNull(axisLocation41);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.5f + "'", float44 == 0.5f);
        org.junit.Assert.assertNotNull(categoryItemRendererArray54);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = categoryPlot0.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot0.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        org.jfree.chart.plot.Plot plot21 = categoryPlot0.getRootPlot();
        java.awt.Paint paint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeGridlinePaint(paint22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
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
        org.junit.Assert.assertNotNull(plot21);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        categoryPlot0.setForegroundAlpha((float) (byte) -1);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        categoryPlot0.setWeight(10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot0.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        categoryPlot0.clearDomainMarkers((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.configureRangeAxes();
        categoryPlot21.clearRangeMarkers();
        categoryPlot21.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke27 = categoryPlot21.getRangeGridlineStroke();
        double double28 = categoryPlot21.getRangeCrosshairValue();
        java.util.List list29 = categoryPlot21.getCategories();
        java.awt.Image image30 = null;
        categoryPlot21.setBackgroundImage(image30);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray34 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis33 };
        categoryPlot32.setDomainAxes(categoryAxisArray34);
        categoryPlot32.setAnchorValue(10.0d);
        categoryPlot32.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean41 = categoryPlot40.isRangeZoomable();
        categoryPlot40.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder45 = categoryPlot40.getDatasetRenderingOrder();
        categoryPlot32.setDatasetRenderingOrder(datasetRenderingOrder45);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder47 = categoryPlot32.getDatasetRenderingOrder();
        categoryPlot21.setDatasetRenderingOrder(datasetRenderingOrder47);
        categoryPlot21.setRangeCrosshairValue((double) 0.5f);
        categoryPlot21.clearDomainMarkers((int) (byte) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot54 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        categoryPlot54.setRangeAxis((int) (byte) 100, valueAxis56);
        java.awt.Graphics2D graphics2D58 = null;
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo61 = null;
        boolean boolean62 = categoryPlot54.render(graphics2D58, rectangle2D59, (int) (byte) 100, plotRenderingInfo61);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer64 = categoryPlot54.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer66 = null;
        categoryPlot54.setRenderer((int) 'a', categoryItemRenderer66, false);
        categoryPlot54.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation72 = categoryPlot54.getRangeAxisLocation((int) ' ');
        categoryPlot21.setDomainAxisLocation(0, axisLocation72, false);
        categoryPlot0.setRangeAxisLocation(axisLocation72, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(list29);
        org.junit.Assert.assertNotNull(categoryAxisArray34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder45);
        org.junit.Assert.assertNotNull(datasetRenderingOrder47);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(categoryItemRenderer64);
        org.junit.Assert.assertNotNull(axisLocation72);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) -1, (double) 1L, plotRenderingInfo9, point2D10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot0.markerChanged(markerChangeEvent8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        categoryPlot0.setWeight(10);
        org.jfree.chart.util.SortOrder sortOrder7 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis8 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomDomainAxes((double) 'a', 10.0d, plotRenderingInfo11, point2D12);
        org.junit.Assert.assertNotNull(sortOrder7);
        org.junit.Assert.assertNull(valueAxis8);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = categoryPlot0.getDomainAxisForDataset((int) '4');
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
        org.junit.Assert.assertNull(categoryAxis38);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot15.configureRangeAxes();
        categoryPlot15.clearDomainMarkers();
        categoryPlot15.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset21 = categoryPlot15.getDataset((int) (byte) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent22 = null;
        categoryPlot15.rendererChanged(rendererChangeEvent22);
        java.awt.Font font24 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot15.setNoDataMessageFont(font24);
        categoryPlot0.setNoDataMessageFont(font24);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNotNull(font24);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        org.jfree.chart.LegendItemCollection legendItemCollection29 = categoryPlot0.getFixedLegendItems();
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
        org.junit.Assert.assertNull(legendItemCollection29);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot11.zoomRangeAxes((-1.0d), plotRenderingInfo14, point2D15, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor18 = categoryPlot11.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot19 = categoryPlot11.getParent();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        categoryPlot20.clearRangeMarkers();
        boolean boolean23 = categoryPlot20.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot24.configureRangeAxes();
        categoryPlot24.clearDomainMarkers();
        categoryPlot24.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray31 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis30 };
        categoryPlot29.setDomainAxes(categoryAxisArray31);
        java.awt.Stroke stroke33 = categoryPlot29.getOutlineStroke();
        categoryPlot24.setRangeCrosshairStroke(stroke33);
        categoryPlot20.setRangeCrosshairStroke(stroke33);
        categoryPlot11.setRangeCrosshairStroke(stroke33);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder37 = categoryPlot11.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder37);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(categoryAnchor18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(datasetRenderingOrder37);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        java.awt.Paint paint12 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = categoryPlot0.getDataRange(valueAxis16);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(range17);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke6 = categoryPlot0.getRangeGridlineStroke();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.util.List list8 = categoryPlot0.getCategories();
        java.awt.Image image9 = null;
        categoryPlot0.setBackgroundImage(image9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo12, point2D13, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot0.setRenderer(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation(1);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) '#', categoryAxis11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(axisLocation6);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        categoryPlot0.setAnchorValue(0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        categoryPlot0.setDataset(1, categoryDataset8);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot8.configureRangeAxes();
        categoryPlot8.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        categoryPlot8.setDataset(categoryDataset11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot8.getRendererForDataset(categoryDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = categoryPlot8.getDataset();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = categoryPlot16.getDataset((int) (short) 1);
        categoryPlot16.clearRangeAxes();
        int int20 = categoryPlot16.getWeight();
        categoryPlot16.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean24 = categoryPlot23.isRangeZoomable();
        org.jfree.chart.plot.Plot plot25 = categoryPlot23.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation26 = categoryPlot23.getOrientation();
        categoryPlot16.setOrientation(plotOrientation26);
        categoryPlot8.setOrientation(plotOrientation26);
        categoryPlot0.setOrientation(plotOrientation26);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(plot25);
        org.junit.Assert.assertNotNull(plotOrientation26);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        categoryPlot20.zoomDomainAxes((double) 10L, plotRenderingInfo33, point2D34);
        categoryPlot20.clearRangeMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace37 = null;
        categoryPlot20.setFixedRangeAxisSpace(axisSpace37);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        java.awt.Paint paint32 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.setBackgroundAlpha((float) '4');
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(sortOrder26);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 100, (int) (byte) -1);
        org.jfree.chart.util.SortOrder sortOrder31 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = categoryPlot0.getRenderer(10);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(sortOrder20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(sortOrder31);
        org.junit.Assert.assertNull(categoryItemRenderer33);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        java.awt.Stroke stroke18 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        java.awt.Stroke stroke15 = categoryPlot0.getRangeGridlineStroke();
        java.awt.Stroke stroke16 = categoryPlot0.getRangeCrosshairStroke();
        java.awt.Paint paint17 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis((int) 'a');
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
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot23.setRangeAxis((int) (byte) 100, valueAxis25);
        boolean boolean27 = categoryPlot23.isOutlineVisible();
        categoryPlot23.setRangeCrosshairLockedOnData(true);
        float float30 = categoryPlot23.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean32 = categoryPlot31.isRangeZoomable();
        categoryPlot31.setWeight(0);
        java.awt.Paint paint35 = categoryPlot31.getBackgroundPaint();
        categoryPlot23.setRangeGridlinePaint(paint35);
        categoryPlot9.setRangeGridlinePaint(paint35);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot9);
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = categoryPlot9.getRangeAxisEdge();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(rectangleEdge39);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        float float7 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = categoryPlot0.removeAnnotation(categoryAnnotation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        categoryPlot16.clearRangeMarkers();
        categoryPlot16.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke22 = categoryPlot16.getRangeGridlineStroke();
        double double23 = categoryPlot16.getRangeCrosshairValue();
        java.util.List list24 = categoryPlot16.getCategories();
        java.awt.Image image25 = null;
        categoryPlot16.setBackgroundImage(image25);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        categoryPlot16.setDomainAxis((int) (byte) 100, categoryAxis28);
        categoryPlot16.setRangeCrosshairValue((double) ' ', false);
        categoryPlot16.setAnchorValue((double) ' ', false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray39 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis38 };
        categoryPlot37.setDomainAxes(categoryAxisArray39);
        java.awt.Stroke stroke41 = categoryPlot37.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection42 = categoryPlot37.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = categoryPlot37.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        int int45 = categoryPlot37.getDomainAxisIndex(categoryAxis44);
        org.jfree.chart.axis.AxisLocation axisLocation46 = categoryPlot37.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot48.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        java.awt.geom.Point2D point2D52 = null;
        categoryPlot48.zoomRangeAxes((-1.0d), plotRenderingInfo51, point2D52, false);
        org.jfree.chart.axis.AxisLocation axisLocation56 = categoryPlot48.getRangeAxisLocation((int) (byte) 10);
        categoryPlot37.setDomainAxisLocation((int) (byte) 0, axisLocation56);
        categoryPlot16.setDomainAxisLocation(15, axisLocation56, false);
        categoryPlot0.setDomainAxisLocation(axisLocation56, true);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(axisSpace15);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNotNull(categoryAxisArray39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(legendItemCollection42);
        org.junit.Assert.assertNull(categoryItemRenderer43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(axisLocation46);
        org.junit.Assert.assertNotNull(axisLocation56);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        java.lang.Class<?> wildcardClass15 = categoryPlot7.getClass();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(sortOrder12);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(plotOrientation17);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge((int) (short) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot0.getDomainAxis();
        categoryPlot0.setRangeCrosshairValue((double) (byte) 10, false);
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(categoryAxis7);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers((int) (short) 0, layer16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot18.configureRangeAxes();
        categoryPlot18.clearDomainMarkers();
        categoryPlot18.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot18.setNoDataMessagePaint(paint23);
        java.awt.Image image25 = categoryPlot18.getBackgroundImage();
        java.awt.Paint paint26 = categoryPlot18.getDomainGridlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint26);
        boolean boolean28 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        org.jfree.chart.LegendItemCollection legendItemCollection32 = categoryPlot20.getFixedLegendItems();
        java.awt.Stroke stroke33 = categoryPlot20.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot20.getRangeAxisEdge(0);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNull(legendItemCollection32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(rectangleEdge35);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        categoryPlot0.axisChanged(axisChangeEvent20);
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot0.getDomainAxis();
        boolean boolean24 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        boolean boolean5 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getDomainMarkers((int) '#', layer7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setAxisOffset(rectangleInsets9);
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
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(legendItemCollection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        categoryPlot0.setDataset(categoryDataset20);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D8, rectangle2D9, 15, plotRenderingInfo11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot0.markerChanged(markerChangeEvent13);
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sortOrder15);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot0.setRangeAxis(valueAxis18);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        java.awt.Paint paint2 = categoryPlot0.getBackgroundPaint();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        categoryPlot0.drawBackgroundImage(graphics2D3, rectangle2D4);
        java.awt.Paint paint6 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        java.lang.Class<?> wildcardClass13 = rectangleEdge12.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        boolean boolean25 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
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
        categoryPlot7.setRenderers(categoryItemRendererArray30);
        categoryPlot0.setRenderers(categoryItemRendererArray30);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(categoryAxisArray14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray30);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        java.awt.Stroke stroke15 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) 'a', (int) (short) 0, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(datasetRenderingOrder11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        java.awt.Stroke stroke31 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        categoryPlot0.axisChanged(axisChangeEvent32);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        int int7 = categoryPlot0.getRangeAxisIndex(valueAxis6);
        categoryPlot0.setForegroundAlpha((float) ' ');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(categoryItemRenderer10);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor29 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot0.getDomainAxis((int) (short) 100);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(categoryAnchor29);
        org.junit.Assert.assertNull(categoryAxis31);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = categoryPlot0.getDataset();
        boolean boolean4 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNull(categoryDataset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        categoryPlot0.setWeight((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection14);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation42 = categoryPlot0.getOrientation();
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
        org.junit.Assert.assertNotNull(plotOrientation42);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        java.util.List list7 = categoryPlot0.getCategories();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        categoryPlot0.removeChangeListener(plotChangeListener8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(categoryItemRenderer10);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation11 = categoryPlot0.getOrientation();
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(plotOrientation11);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((-1), 10, plotRenderingInfo21);
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        int int14 = categoryPlot0.getWeight();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot16.setRangeAxis((int) (byte) 100, valueAxis18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        boolean boolean24 = categoryPlot16.render(graphics2D20, rectangle2D21, (int) (byte) 100, plotRenderingInfo23);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        categoryPlot16.setRangeAxis((int) (short) 0, valueAxis26);
        java.awt.Paint paint28 = categoryPlot16.getRangeCrosshairPaint();
        categoryPlot0.setOutlinePaint(paint28);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        org.jfree.chart.plot.Plot plot12 = categoryPlot0.getParent();
        boolean boolean13 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (byte) 1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.setRangeGridlinesVisible(true);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        boolean boolean27 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNull(plot26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        org.jfree.chart.plot.Marker marker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker38 = null;
        org.jfree.chart.util.Layer layer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker38, layer39);
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
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder23);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(drawingSupplier34);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo4, point2D5, false);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        categoryPlot0.axisChanged(axisChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot0.getRangeAxis((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNull(valueAxis13);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        categoryPlot0.setRenderer(categoryItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setForegroundAlpha(0.5f);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(rectangleEdge8);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot0.getRangeAxisLocation((int) ' ');
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(axisLocation27);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = null;
        int int38 = categoryPlot0.getIndexOf(categoryItemRenderer37);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot9.zoomRangeAxes((-1.0d), plotRenderingInfo12, point2D13, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor16 = categoryPlot9.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot9.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot19.zoomRangeAxes((-1.0d), plotRenderingInfo22, point2D23, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor26 = categoryPlot19.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot19.getDomainAxisEdge((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryPlot19.getAxisOffset();
        categoryPlot9.setInsets(rectangleInsets29);
        categoryPlot0.setInsets(rectangleInsets29, true);
        org.jfree.data.category.CategoryDataset categoryDataset34 = categoryPlot0.getDataset((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(categoryAnchor16);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertNotNull(categoryAnchor26);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNull(categoryDataset34);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((int) (short) -1, valueAxis28, false);
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot18.setRangeAxis((int) (byte) 100, valueAxis20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        boolean boolean26 = categoryPlot18.render(graphics2D22, rectangle2D23, (int) (byte) 100, plotRenderingInfo25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = categoryPlot18.getRenderer((int) (short) 10);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        categoryPlot18.setRangeAxis(100, valueAxis30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = categoryPlot18.getDrawingSupplier();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder33 = categoryPlot18.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder33);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(categoryItemRenderer28);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertNotNull(datasetRenderingOrder33);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        boolean boolean7 = categoryPlot0.isRangeCrosshairLockedOnData();
        boolean boolean8 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.plot.Plot plot7 = categoryPlot0.getRootPlot();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        java.lang.Class<?> wildcardClass10 = categoryPlot0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setWeight((int) (short) -1);
        java.awt.Paint paint9 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        java.util.List list7 = categoryPlot0.getCategories();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        categoryPlot0.removeChangeListener(plotChangeListener8);
        boolean boolean10 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge40 = categoryPlot0.getDomainAxisEdge();
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
        org.junit.Assert.assertNotNull(rectangleEdge40);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        boolean boolean31 = categoryPlot17.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        categoryPlot32.setRangeAxis((int) (byte) 100, valueAxis34);
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        boolean boolean40 = categoryPlot32.render(graphics2D36, rectangle2D37, (int) (byte) 100, plotRenderingInfo39);
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        categoryPlot32.setRangeAxis((int) (short) 0, valueAxis42);
        java.awt.Paint paint44 = categoryPlot32.getRangeGridlinePaint();
        categoryPlot17.setBackgroundPaint(paint44);
        categoryPlot0.setDomainGridlinePaint(paint44);
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(categoryItemRenderer27);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getDomainAxisLocation(1);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
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
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = categoryPlot10.getRangeMarkers(layer25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = categoryPlot10.getFixedRangeAxisSpace();
        org.jfree.chart.plot.PlotOrientation plotOrientation28 = categoryPlot10.getOrientation();
        org.jfree.data.category.CategoryDataset categoryDataset30 = categoryPlot10.getDataset((int) (byte) -1);
        org.jfree.chart.util.Layer layer31 = null;
        java.util.Collection collection32 = categoryPlot10.getRangeMarkers(layer31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = categoryPlot10.getDrawingSupplier();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot34.configureRangeAxes();
        categoryPlot34.clearDomainMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        categoryPlot34.setDataset(categoryDataset37);
        categoryPlot34.setWeight(10);
        java.awt.Paint paint41 = categoryPlot34.getOutlinePaint();
        categoryPlot10.setNoDataMessagePaint(paint41);
        categoryPlot0.setRangeGridlinePaint(paint41);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNull(legendItemCollection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertNull(axisSpace27);
        org.junit.Assert.assertNotNull(plotOrientation28);
        org.junit.Assert.assertNull(categoryDataset30);
        org.junit.Assert.assertNull(collection32);
        org.junit.Assert.assertNotNull(drawingSupplier33);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        int int14 = categoryPlot0.getBackgroundImageAlignment();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        int int30 = categoryPlot0.getIndexOf(categoryItemRenderer29);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation31 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Category Plot" + "'", str28, "Category Plot");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        double double7 = categoryPlot0.getAnchorValue();
        boolean boolean8 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        org.jfree.chart.plot.Plot plot18 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNull(plot18);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D31, rectangle2D32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray27);
        org.junit.Assert.assertNotNull(drawingSupplier29);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        org.jfree.chart.axis.AxisLocation axisLocation19 = null;
        categoryPlot0.setRangeAxisLocation((int) (short) 100, axisLocation19);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot0.getRangeAxisEdge(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(rectangleEdge22);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        boolean boolean3 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        categoryPlot0.setDomainAxis(categoryAxis4);
        boolean boolean6 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge();
        java.awt.Stroke stroke8 = categoryPlot0.getRangeCrosshairStroke();
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
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot30.configureRangeAxes();
        categoryPlot30.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        categoryPlot33.setRangeAxis((int) (byte) 100, valueAxis35);
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot33.getRangeAxisLocation();
        categoryPlot30.setDomainAxisLocation(axisLocation37);
        categoryPlot30.clearRangeMarkers();
        categoryPlot10.setParent((org.jfree.chart.plot.Plot) categoryPlot30);
        boolean boolean41 = categoryPlot30.isRangeCrosshairLockedOnData();
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot30.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) '4', axisLocation42, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray22);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(axisLocation42);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        double double27 = categoryPlot0.getAnchorValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer29, false);
        org.jfree.chart.plot.CategoryMarker categoryMarker32 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = categoryPlot16.getDataset((int) (short) 1);
        categoryPlot16.setWeight((int) (byte) 100);
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
        categoryPlot16.setRangeAxes(valueAxisArray34);
        categoryPlot0.setRangeAxes(valueAxisArray34);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNotNull(categoryAxisArray23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(valueAxisArray34);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        categoryPlot0.mapDatasetToRangeAxis(101, (int) (short) 10);
        java.awt.Image image17 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(image17);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        categoryPlot0.setAnchorValue(0.0d, true);
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
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        categoryPlot0.setNoDataMessage("hi!");
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        categoryPlot0.addChangeListener(plotChangeListener28);
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
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        categoryPlot0.setRangeGridlinesVisible(true);
        categoryPlot0.setAnchorValue((double) 100.0f);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        categoryPlot22.configureRangeAxes();
        categoryPlot22.clearDomainMarkers();
        categoryPlot22.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset28 = categoryPlot22.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        categoryPlot22.removeChangeListener(plotChangeListener29);
        java.awt.Paint paint31 = categoryPlot22.getBackgroundPaint();
        org.jfree.chart.axis.AxisSpace axisSpace32 = null;
        categoryPlot22.setFixedRangeAxisSpace(axisSpace32);
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot22.getRangeAxisLocation();
        org.jfree.chart.util.SortOrder sortOrder35 = categoryPlot22.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder35);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(categoryDataset28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNotNull(sortOrder35);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot5.configureRangeAxes();
        categoryPlot5.clearDomainMarkers();
        categoryPlot5.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot5.setNoDataMessagePaint(paint10);
        java.awt.Image image12 = categoryPlot5.getBackgroundImage();
        java.awt.Image image13 = categoryPlot5.getBackgroundImage();
        java.awt.Stroke stroke14 = categoryPlot5.getRangeCrosshairStroke();
        java.awt.Font font15 = categoryPlot5.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot5.getInsets();
        categoryPlot0.setAxisOffset(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        categoryPlot0.configureRangeAxes();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        categoryPlot7.setBackgroundAlpha((float) 8);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(sortOrder12);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list1 = categoryPlot0.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot0.markerChanged(markerChangeEvent6);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        categoryPlot0.setDomainGridlinesVisible(false);
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot0.getDomainAxisLocation();
        java.util.List list27 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNull(list27);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        categoryPlot0.setAnchorValue((double) 0.0f);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(sortOrder22);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        categoryPlot0.setOutlineVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(valueAxis8);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1);
        boolean boolean12 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo5, point2D6, true);
        java.awt.Font font9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font9);
        categoryPlot0.setBackgroundImageAlignment(10);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        boolean boolean17 = categoryPlot0.render(graphics2D13, rectangle2D14, (int) (short) -1, plotRenderingInfo16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot18.setRangeAxis((int) (byte) 100, valueAxis20);
        boolean boolean23 = categoryPlot18.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        categoryPlot18.setRenderer((int) (byte) 10, categoryItemRenderer25, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray30 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis29 };
        categoryPlot28.setDomainAxes(categoryAxisArray30);
        float float32 = categoryPlot28.getBackgroundAlpha();
        categoryPlot28.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = categoryPlot28.getDomainAxisForDataset((int) '#');
        boolean boolean38 = categoryPlot28.isOutlineVisible();
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot28.getDomainAxisLocation((int) (byte) -1);
        categoryPlot18.setRangeAxisLocation(axisLocation40);
        categoryPlot0.setDomainAxisLocation(axisLocation40, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        java.awt.geom.Point2D point2D46 = null;
        categoryPlot0.zoomRangeAxes(0.0d, plotRenderingInfo45, point2D46, true);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(categoryAxisArray30);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(axisLocation40);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        float float7 = categoryPlot0.getForegroundAlpha();
        int int8 = categoryPlot0.getWeight();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis((int) 'a', categoryAxis10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot17.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        java.awt.geom.Point2D point2D21 = null;
        categoryPlot17.zoomRangeAxes((-1.0d), plotRenderingInfo20, point2D21, false);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot17.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = categoryPlot17.getRangeAxisEdge(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        categoryPlot17.axisChanged(axisChangeEvent28);
        java.awt.Stroke stroke30 = categoryPlot17.getOutlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke30);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(rectangleEdge27);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer12);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setNoDataMessagePaint(paint5);
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setBackgroundAlpha((float) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer(categoryItemRenderer12, false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        org.jfree.chart.util.SortOrder sortOrder18 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(sortOrder18);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        int int9 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Paint paint10 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        java.lang.Class<?> wildcardClass21 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        categoryPlot0.setAnchorValue((double) 101, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        categoryPlot0.zoomDomainAxes((double) 0L, plotRenderingInfo15, point2D16, false);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(legendItemCollection13);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        java.lang.String str5 = categoryPlot0.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot0.getRendererForDataset(categoryDataset6);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.data.Range range9 = categoryPlot0.getDataRange(valueAxis8);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Category Plot" + "'", str5, "Category Plot");
        org.junit.Assert.assertNull(categoryItemRenderer7);
        org.junit.Assert.assertNull(range9);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(sortOrder15);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(legendItemCollection8);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        java.awt.Image image36 = null;
        categoryPlot0.setBackgroundImage(image36);
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
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot0.getLegendItems();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot0.setRangeAxis((int) '#', valueAxis18, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        int int22 = categoryPlot0.getDomainAxisIndex(categoryAxis21);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        categoryPlot0.setAnchorValue((double) (byte) 10);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        categoryPlot0.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot0.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean14 = categoryPlot13.isRangeZoomable();
        categoryPlot13.setAnchorValue(100.0d, false);
        float float18 = categoryPlot13.getForegroundAlpha();
        int int19 = categoryPlot13.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot13.setRangeAxis((int) (byte) 100, valueAxis21, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray26 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis25 };
        categoryPlot24.setDomainAxes(categoryAxisArray26);
        categoryPlot24.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot24.getDomainAxisLocation(100);
        categoryPlot13.setRangeAxisLocation(axisLocation31, false);
        float float34 = categoryPlot13.getBackgroundImageAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot35.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        java.awt.geom.Point2D point2D39 = null;
        categoryPlot35.zoomRangeAxes((-1.0d), plotRenderingInfo38, point2D39, false);
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        categoryPlot35.setRangeAxis(valueAxis42);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray44 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot35.setRenderers(categoryItemRendererArray44);
        categoryPlot13.setRenderers(categoryItemRendererArray44);
        org.jfree.chart.util.RectangleEdge rectangleEdge48 = categoryPlot13.getDomainAxisEdge((int) (short) 0);
        categoryPlot13.configureDomainAxes();
        categoryPlot13.setBackgroundAlpha(0.0f);
        categoryPlot13.clearRangeMarkers();
        java.awt.Stroke stroke53 = categoryPlot13.getOutlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke53);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray26);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(categoryItemRendererArray44);
        org.junit.Assert.assertNotNull(rectangleEdge48);
        org.junit.Assert.assertNotNull(stroke53);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot0.getInsets();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(axisSpace9);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        categoryPlot0.setAnchorValue((double) 10L);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
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
        org.junit.Assert.assertNotNull(rectangleEdge33);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToDomainAxis((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        categoryPlot21.zoomRangeAxes((-1.0d), plotRenderingInfo24, point2D25, false);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        categoryPlot21.setRangeAxis(valueAxis28);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray30 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot21.setRenderers(categoryItemRendererArray30);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot33.configureRangeAxes();
        categoryPlot33.clearRangeMarkers();
        boolean boolean36 = categoryPlot33.isOutlineVisible();
        categoryPlot33.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        categoryPlot33.setRenderer(categoryItemRenderer39);
        org.jfree.chart.axis.AxisLocation axisLocation41 = categoryPlot33.getDomainAxisLocation();
        categoryPlot21.setDomainAxisLocation((int) (short) 0, axisLocation41);
        categoryPlot0.setRangeAxisLocation(axisLocation41);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(categoryItemRendererArray30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(axisLocation41);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        categoryPlot20.clearRangeMarkers();
        boolean boolean23 = categoryPlot20.isOutlineVisible();
        categoryPlot20.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray28 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis27 };
        categoryPlot26.setDomainAxes(categoryAxisArray28);
        float float30 = categoryPlot26.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot31.configureRangeAxes();
        categoryPlot31.clearDomainMarkers();
        categoryPlot31.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset37 = categoryPlot31.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        categoryPlot31.removeChangeListener(plotChangeListener38);
        java.awt.Paint paint40 = categoryPlot31.getBackgroundPaint();
        categoryPlot26.setRangeGridlinePaint(paint40);
        categoryPlot20.setOutlinePaint(paint40);
        categoryPlot0.setRangeGridlinePaint(paint40);
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        categoryPlot0.drawBackgroundImage(graphics2D44, rectangle2D45);
        org.jfree.chart.axis.AxisSpace axisSpace47 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(categoryAxisArray28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(axisSpace47);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D8, rectangle2D9, 15, plotRenderingInfo11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot13.configureRangeAxes();
        categoryPlot13.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        categoryPlot13.setDataset(categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot13.getRendererForDataset(categoryDataset18);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray22 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis21 };
        categoryPlot20.setDomainAxes(categoryAxisArray22);
        categoryPlot20.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot20.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        categoryPlot28.setRangeAxis((int) (byte) 100, valueAxis30);
        org.jfree.chart.util.Layer layer33 = null;
        java.util.Collection collection34 = categoryPlot28.getDomainMarkers((int) (byte) 10, layer33);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean36 = categoryPlot35.isRangeZoomable();
        categoryPlot35.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation40 = categoryPlot35.getOrientation();
        categoryPlot28.setOrientation(plotOrientation40);
        org.jfree.chart.util.RectangleEdge rectangleEdge42 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation27, plotOrientation40);
        categoryPlot13.setOrientation(plotOrientation40);
        java.awt.Paint paint44 = categoryPlot13.getRangeGridlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint44);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNotNull(categoryAxisArray22);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(plotOrientation40);
        org.junit.Assert.assertNotNull(rectangleEdge42);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        categoryPlot0.setRenderer(8, categoryItemRenderer36, false);
        java.util.List list39 = categoryPlot0.getCategories();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(categoryDataset26);
        org.junit.Assert.assertNotNull(plotOrientation32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(list39);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (byte) 100);
        java.awt.Stroke stroke16 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot16.configureRangeAxes();
        categoryPlot16.clearDomainMarkers();
        categoryPlot16.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray23 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis22 };
        categoryPlot21.setDomainAxes(categoryAxisArray23);
        java.awt.Stroke stroke25 = categoryPlot21.getOutlineStroke();
        categoryPlot16.setRangeCrosshairStroke(stroke25);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot27.configureRangeAxes();
        categoryPlot27.clearRangeMarkers();
        categoryPlot27.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke33 = categoryPlot27.getRangeGridlineStroke();
        double double34 = categoryPlot27.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        categoryPlot27.drawBackgroundImage(graphics2D35, rectangle2D36);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray39 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer38 };
        categoryPlot27.setRenderers(categoryItemRendererArray39);
        categoryPlot16.setRenderers(categoryItemRendererArray39);
        categoryPlot0.setRenderers(categoryItemRendererArray39);
        org.jfree.chart.LegendItemCollection legendItemCollection43 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(sortOrder15);
        org.junit.Assert.assertNotNull(categoryAxisArray23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray39);
        org.junit.Assert.assertNotNull(legendItemCollection43);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot0.zoomRangeAxes((double) 'a', plotRenderingInfo18, point2D19);
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureRangeAxes();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        boolean boolean5 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(valueAxis7);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        categoryPlot0.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = categoryPlot0.getAxisOffset();
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot0.getRangeAxis((int) (byte) -1);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNull(categoryItemRenderer27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNull(valueAxis30);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot0.getRenderer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryItemRenderer7);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        int int14 = categoryPlot0.getWeight();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        org.jfree.chart.axis.AxisSpace axisSpace16 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        categoryPlot0.setDataset(categoryDataset31);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNotNull(rectangleEdge28);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        categoryPlot0.axisChanged(axisChangeEvent20);
        categoryPlot0.clearRangeMarkers();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        boolean boolean27 = categoryPlot0.render(graphics2D23, rectangle2D24, 0, plotRenderingInfo26);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        categoryPlot0.setRangeCrosshairValue((double) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(rectangleEdge31);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean7 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxisForDataset(0);
        categoryPlot0.setDrawSharedDomainAxis(true);
        java.awt.Paint paint12 = categoryPlot0.getDomainGridlinePaint();
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
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder29 = categoryPlot14.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot14.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation30);
        double double32 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder27);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
        org.junit.Assert.assertNotNull(axisLocation30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot16.setRangeAxis((int) (byte) 100, valueAxis18);
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot16.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(0, axisLocation20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot0.setRenderer(categoryItemRenderer22, true);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        boolean boolean29 = categoryPlot0.render(graphics2D25, rectangle2D26, (int) (byte) 10, plotRenderingInfo28);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot0.getDomainAxisForDataset((int) ' ');
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = categoryPlot21.getDataset((int) (short) 1);
        categoryPlot21.clearRangeAxes();
        int int25 = categoryPlot21.getWeight();
        categoryPlot21.setRangeCrosshairVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean29 = categoryPlot28.isRangeZoomable();
        org.jfree.chart.plot.Plot plot30 = categoryPlot28.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation31 = categoryPlot28.getOrientation();
        categoryPlot21.setOrientation(plotOrientation31);
        java.awt.Font font33 = categoryPlot21.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font33);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertNull(legendItemCollection18);
        org.junit.Assert.assertNull(categoryAxis20);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(plot30);
        org.junit.Assert.assertNotNull(plotOrientation31);
        org.junit.Assert.assertNotNull(font33);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getParent();
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 100, (int) (byte) -1);
        org.jfree.chart.util.SortOrder sortOrder31 = categoryPlot0.getColumnRenderingOrder();
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(categoryAxisArray16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(sortOrder20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(sortOrder31);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset(100);
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
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        categoryPlot0.clearDomainMarkers((int) (short) 1);
        org.jfree.chart.axis.AxisLocation axisLocation11 = null;
        categoryPlot0.setRangeAxisLocation((int) (byte) 10, axisLocation11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        java.awt.Stroke stroke7 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomDomainAxes((double) 1.0f, (double) 100.0f, plotRenderingInfo10, point2D11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        java.awt.Font font9 = categoryPlot0.getNoDataMessageFont();
        float float10 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        categoryPlot12.setRangeAxis((int) (byte) 100, valueAxis14);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot12.getRangeAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (short) -1, axisLocation16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray6 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis5 };
        categoryPlot4.setDomainAxes(categoryAxisArray6);
        java.awt.Stroke stroke8 = categoryPlot4.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = categoryPlot4.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot4.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot4.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot4.getRangeAxisEdge((int) (short) 10);
        java.awt.Paint paint15 = categoryPlot4.getRangeGridlinePaint();
        categoryPlot0.setRangeCrosshairPaint(paint15);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((int) (byte) -1, valueAxis18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNotNull(categoryAxisArray6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(0, categoryMarker28, layer29);
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
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder23);
        org.junit.Assert.assertNull(axisSpace25);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        org.jfree.chart.util.SortOrder sortOrder20 = categoryPlot0.getRowRenderingOrder();
        java.awt.Stroke stroke21 = categoryPlot0.getRangeCrosshairStroke();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(sortOrder20);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        java.awt.Stroke stroke13 = categoryPlot0.getRangeCrosshairStroke();
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
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot34.configureRangeAxes();
        categoryPlot34.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        categoryPlot37.setRangeAxis((int) (byte) 100, valueAxis39);
        org.jfree.chart.axis.AxisLocation axisLocation41 = categoryPlot37.getRangeAxisLocation();
        categoryPlot34.setDomainAxisLocation(axisLocation41);
        categoryPlot34.clearRangeMarkers();
        categoryPlot14.setParent((org.jfree.chart.plot.Plot) categoryPlot34);
        org.jfree.chart.axis.AxisLocation axisLocation45 = categoryPlot34.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation45, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray26);
        org.junit.Assert.assertNotNull(drawingSupplier28);
        org.junit.Assert.assertNull(valueAxis33);
        org.junit.Assert.assertNotNull(axisLocation41);
        org.junit.Assert.assertNotNull(axisLocation45);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge2 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        categoryPlot0.setRenderer((int) (short) 0, categoryItemRenderer4);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor6 = categoryPlot0.getDomainGridlinePosition();
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
        categoryPlot0.setDomainGridlinePaint(paint19);
        org.junit.Assert.assertNotNull(rectangleEdge2);
        org.junit.Assert.assertNotNull(categoryAnchor6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        boolean boolean4 = categoryPlot0.isOutlineVisible();
        java.awt.Paint paint5 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.setBackgroundAlpha((float) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        categoryPlot0.setForegroundAlpha((float) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        java.util.List list15 = categoryPlot14.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot14.setRenderer(categoryItemRenderer16, true);
        java.awt.Paint paint19 = categoryPlot14.getRangeCrosshairPaint();
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot14.getDomainAxisLocation();
        boolean boolean21 = categoryPlot0.equals((java.lang.Object) axisLocation20);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        categoryPlot0.clearDomainMarkers((int) (byte) 100);
        int int30 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot16.setRangeAxis((int) (byte) 100, valueAxis18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        boolean boolean24 = categoryPlot16.render(graphics2D20, rectangle2D21, (int) (byte) 100, plotRenderingInfo23);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot16.getRenderer((int) (short) 10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        categoryPlot16.setRenderer((int) 'a', categoryItemRenderer28, false);
        categoryPlot16.setRangeCrosshairVisible(true);
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
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder45 = categoryPlot33.getDatasetRenderingOrder();
        categoryPlot16.setDatasetRenderingOrder(datasetRenderingOrder45);
        java.awt.Image image47 = null;
        categoryPlot16.setBackgroundImage(image47);
        java.awt.Paint paint49 = categoryPlot16.getNoDataMessagePaint();
        categoryPlot0.setRangeCrosshairPaint(paint49);
        org.jfree.chart.util.RectangleEdge rectangleEdge52 = categoryPlot0.getDomainAxisEdge(8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(categoryItemRenderer26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray41);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(datasetRenderingOrder45);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(rectangleEdge52);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        org.jfree.chart.axis.ValueAxis valueAxis38 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(valueAxisArray30);
        org.junit.Assert.assertNull(valueAxis38);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot0.zoomDomainAxes((double) (-1.0f), (double) 100.0f, plotRenderingInfo6, point2D7);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot9.configureRangeAxes();
        categoryPlot9.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot9.setDataset(categoryDataset12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot9.getRendererForDataset(categoryDataset14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray18 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis17 };
        categoryPlot16.setDomainAxes(categoryAxisArray18);
        categoryPlot16.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot16.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        categoryPlot24.setRangeAxis((int) (byte) 100, valueAxis26);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = categoryPlot24.getDomainMarkers((int) (byte) 10, layer29);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean32 = categoryPlot31.isRangeZoomable();
        categoryPlot31.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation36 = categoryPlot31.getOrientation();
        categoryPlot24.setOrientation(plotOrientation36);
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation23, plotOrientation36);
        categoryPlot9.setOrientation(plotOrientation36);
        java.awt.Paint paint40 = categoryPlot9.getRangeGridlinePaint();
        categoryPlot0.setDomainGridlinePaint(paint40);
        categoryPlot0.setAnchorValue((double) 10.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(categoryAxisArray18);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(plotOrientation36);
        org.junit.Assert.assertNotNull(rectangleEdge38);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot0.getLegendItems();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot0.setRangeAxis((int) '#', valueAxis18, true);
        org.jfree.data.general.DatasetGroup datasetGroup21 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        categoryPlot0.axisChanged(axisChangeEvent22);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNull(datasetGroup21);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(range12);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        boolean boolean14 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.configureDomainAxes();
        int int4 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Image image5 = null;
        categoryPlot0.setBackgroundImage(image5);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getRangeMarkers(layer7);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getDomainMarkers((int) (short) -1, layer10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.awt.Paint paint13 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge((int) (short) 100);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot0.getDomainAxisEdge();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        categoryPlot0.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot4.configureRangeAxes();
        categoryPlot4.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = categoryPlot4.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder7);
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
        org.junit.Assert.assertNull(axisSpace9);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 100, 8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = categoryPlot0.getDrawingSupplier();
        boolean boolean10 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.awt.Font font11 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot0.getRenderer((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(axisSpace24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(categoryItemRenderer27);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        boolean boolean7 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes((double) 1, (double) 1L, plotRenderingInfo10, point2D11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot6.configureRangeAxes();
        categoryPlot6.clearDomainMarkers();
        categoryPlot6.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot6.setNoDataMessagePaint(paint11);
        java.awt.Image image13 = categoryPlot6.getBackgroundImage();
        java.awt.Paint paint14 = categoryPlot6.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray17 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis16 };
        categoryPlot15.setDomainAxes(categoryAxisArray17);
        categoryPlot15.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot15.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean24 = categoryPlot23.isRangeZoomable();
        org.jfree.chart.plot.Plot plot25 = categoryPlot23.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation26 = categoryPlot23.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation22, plotOrientation26);
        categoryPlot6.setDomainAxisLocation(axisLocation22);
        categoryPlot6.mapDatasetToDomainAxis((int) (byte) 1, (int) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation32 = categoryPlot6.getOrientation();
        categoryPlot0.setOrientation(plotOrientation32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(categoryAxisArray17);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(plot25);
        org.junit.Assert.assertNotNull(plotOrientation26);
        org.junit.Assert.assertNotNull(rectangleEdge27);
        org.junit.Assert.assertNotNull(plotOrientation32);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        categoryPlot17.setRangeGridlinesVisible(false);
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot17.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray37 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis36 };
        categoryPlot35.setDomainAxes(categoryAxisArray37);
        categoryPlot35.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot35.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean44 = categoryPlot43.isRangeZoomable();
        org.jfree.chart.plot.Plot plot45 = categoryPlot43.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation46 = categoryPlot43.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge47 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation42, plotOrientation46);
        categoryPlot17.setOrientation(plotOrientation46);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor49 = categoryPlot17.getDomainGridlinePosition();
        categoryPlot5.setDomainGridlinePosition(categoryAnchor49);
        org.jfree.chart.axis.CategoryAxis categoryAxis51 = null;
        int int52 = categoryPlot5.getDomainAxisIndex(categoryAxis51);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(collection23);
        org.junit.Assert.assertNull(categoryDataset31);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertNotNull(categoryAxisArray37);
        org.junit.Assert.assertNotNull(axisLocation42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(plot45);
        org.junit.Assert.assertNotNull(plotOrientation46);
        org.junit.Assert.assertNotNull(rectangleEdge47);
        org.junit.Assert.assertNotNull(categoryAnchor49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNull(range9);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(101, categoryMarker16, layer17);
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers((int) (short) 0, layer16);
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
        categoryPlot0.setRangeAxisLocation(axisLocation25, true);
        org.jfree.chart.util.SortOrder sortOrder33 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = categoryPlot0.getRendererForDataset(categoryDataset34);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(plot28);
        org.junit.Assert.assertNotNull(plotOrientation29);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertNotNull(sortOrder33);
        org.junit.Assert.assertNull(categoryItemRenderer35);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer(0);
        double double11 = categoryPlot0.getAnchorValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        categoryPlot0.setDataset((int) 'a', categoryDataset6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot0.getDomainAxis((int) ' ');
        java.awt.Paint paint23 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo4, point2D5, false);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        categoryPlot0.axisChanged(axisChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getDomainAxisEdge();
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
        categoryPlot12.setRangeGridlinesVisible(false);
        java.util.List list29 = categoryPlot12.getAnnotations();
        categoryPlot12.setRangeGridlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = categoryPlot12.getAxisOffset();
        categoryPlot0.setInsets(rectangleInsets32, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(categoryDataset26);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(rectangleInsets32);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        categoryPlot0.clearRangeMarkers();
        boolean boolean6 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Paint paint7 = categoryPlot0.getDomainGridlinePaint();
        boolean boolean8 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis3 = categoryPlot0.getRangeAxis(0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        org.junit.Assert.assertNull(valueAxis3);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        boolean boolean17 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendItemCollection18);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        int int31 = categoryPlot12.getRangeAxisCount();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNotNull(categoryAnchor28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRendererForDataset(categoryDataset9);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxisForDataset((-1));
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        java.util.List list14 = categoryPlot0.getCategoriesForAxis(categoryAxis13);
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setRangeCrosshairVisible(false);
        boolean boolean6 = categoryPlot0.isSubplot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        categoryPlot0.notifyListeners(plotChangeEvent7);
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot0.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = categoryPlot0.getDomainAxisForDataset((int) (byte) 100);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNull(categoryAxis18);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot0.setRenderer(categoryItemRenderer13);
        categoryPlot0.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        org.jfree.chart.LegendItemCollection legendItemCollection21 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot0.getDomainAxis((int) (short) 0);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertNull(categoryAxis23);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        java.awt.Stroke stroke9 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.AxisSpace axisSpace10 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(axisSpace10);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        boolean boolean8 = categoryPlot0.render(graphics2D4, rectangle2D5, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (short) 10);
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer5);
        categoryPlot0.clearAnnotations();
        org.junit.Assert.assertNull(datasetGroup3);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        int int22 = categoryPlot0.getRangeAxisIndex(valueAxis21);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        java.util.List list19 = categoryPlot0.getCategories();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.configureRangeAxes();
        categoryPlot21.clearRangeMarkers();
        boolean boolean24 = categoryPlot21.isOutlineVisible();
        categoryPlot21.setRangeGridlinesVisible(false);
        categoryPlot21.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot29.configureRangeAxes();
        categoryPlot29.clearRangeMarkers();
        boolean boolean32 = categoryPlot29.isOutlineVisible();
        categoryPlot29.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot29.setRenderer(categoryItemRenderer35);
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot29.getDomainAxisLocation();
        categoryPlot21.setRangeAxisLocation(axisLocation37);
        categoryPlot0.setRangeAxisLocation((int) '4', axisLocation37, false);
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(list19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(axisLocation37);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        categoryPlot0.setAnchorValue((double) (byte) -1);
        categoryPlot0.setRangeCrosshairLockedOnData(false);
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
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        java.lang.String str54 = categoryPlot0.getNoDataMessage();
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
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomRangeAxes((double) 0L, plotRenderingInfo5, point2D6);
        int int8 = categoryPlot0.getWeight();
        categoryPlot0.setWeight((int) (short) 1);
        float float11 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        boolean boolean12 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(categoryAxis5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        categoryPlot0.setDomainAxis((int) (short) 1, categoryAxis15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = categoryPlot0.getDrawingSupplier();
        int int33 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis((int) 'a');
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(valueAxis9);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        java.awt.Paint paint12 = categoryPlot7.getRangeCrosshairPaint();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = categoryPlot0.getDomainAxis();
        java.awt.Paint paint45 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.5f + "'", float29 == 0.5f);
        org.junit.Assert.assertNotNull(categoryItemRendererArray39);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNull(categoryAxis44);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer((int) (short) -1);
        boolean boolean12 = categoryPlot0.isRangeZoomable();
        java.awt.Image image13 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        org.jfree.chart.plot.Plot plot24 = categoryPlot0.getRootPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot0.getRangeAxisEdge((-1));
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
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertNotNull(rectangleEdge26);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot0.getRangeAxisLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(categoryDataset26);
        org.junit.Assert.assertNotNull(plotOrientation32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(axisLocation35);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace17);
        int int19 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = categoryPlot0.getOrientation();
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(plotOrientation5);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent2 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent2);
        java.awt.Font font4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font4);
        int int6 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getDomainAxisEdge();
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        boolean boolean19 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(categoryAnchor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        java.awt.Stroke stroke17 = categoryPlot0.getRangeCrosshairStroke();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        java.lang.String str15 = categoryPlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Category Plot" + "'", str15, "Category Plot");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        categoryPlot12.configureRangeAxes();
        categoryPlot12.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot12.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder15);
        int int17 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.SortOrder sortOrder6 = categoryPlot0.getRowRenderingOrder();
        boolean boolean7 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.configureRangeAxes();
        java.awt.Stroke stroke9 = categoryPlot0.getOutlineStroke();
        boolean boolean10 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(sortOrder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        float float4 = categoryPlot0.getBackgroundAlpha();
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, 10);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis((int) ' ', valueAxis9);
        boolean boolean11 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (byte) 100);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        boolean boolean39 = categoryPlot0.isRangeZoomable();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder10 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxisForDataset((int) '#');
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder16 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertNotNull(datasetRenderingOrder16);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getFixedLegendItems();
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes(0.0d, (double) (short) 0, plotRenderingInfo11, point2D12);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNull(legendItemCollection7);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        categoryPlot0.setRangeCrosshairValue((double) '4', false);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(axisSpace15);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray2 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis1 };
        categoryPlot0.setDomainAxes(categoryAxisArray2);
        java.awt.Stroke stroke4 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRenderer();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset(100);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) (short) 0, valueAxis10, false);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        categoryPlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot0.getRendererForDataset(categoryDataset5);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray9 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis8 };
        categoryPlot7.setDomainAxes(categoryAxisArray9);
        categoryPlot7.setAnchorValue(10.0d);
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot7.getDomainAxisLocation(100);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot15.setRangeAxis((int) (byte) 100, valueAxis17);
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot15.getDomainMarkers((int) (byte) 10, layer20);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean23 = categoryPlot22.isRangeZoomable();
        categoryPlot22.setAnchorValue(100.0d, false);
        org.jfree.chart.plot.PlotOrientation plotOrientation27 = categoryPlot22.getOrientation();
        categoryPlot15.setOrientation(plotOrientation27);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation14, plotOrientation27);
        categoryPlot0.setOrientation(plotOrientation27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) (byte) 1, plotRenderingInfo33, point2D34);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(categoryAxisArray9);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(plotOrientation27);
        org.junit.Assert.assertNotNull(rectangleEdge29);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((-1.0d), plotRenderingInfo3, point2D4, false);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray9);
        float float11 = categoryPlot0.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset(categoryDataset12);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        categoryPlot0.setDomainAxis((int) (byte) 100, categoryAxis15);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot19.configureRangeAxes();
        categoryPlot19.clearDomainMarkers();
        categoryPlot19.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray26 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis25 };
        categoryPlot24.setDomainAxes(categoryAxisArray26);
        java.awt.Stroke stroke28 = categoryPlot24.getOutlineStroke();
        categoryPlot19.setRangeCrosshairStroke(stroke28);
        org.jfree.chart.util.SortOrder sortOrder30 = categoryPlot19.getRowRenderingOrder();
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        categoryPlot19.removeChangeListener(plotChangeListener31);
        org.jfree.chart.util.Layer layer34 = null;
        java.util.Collection collection35 = categoryPlot19.getRangeMarkers(15, layer34);
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        int int37 = categoryPlot19.getRangeAxisIndex(valueAxis36);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot38.configureRangeAxes();
        categoryPlot38.clearRangeMarkers();
        categoryPlot38.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke44 = categoryPlot38.getRangeGridlineStroke();
        double double45 = categoryPlot38.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        categoryPlot38.drawBackgroundImage(graphics2D46, rectangle2D47);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer49 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray50 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { categoryItemRenderer49 };
        categoryPlot38.setRenderers(categoryItemRendererArray50);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier52 = categoryPlot38.getDrawingSupplier();
        categoryPlot19.setDrawingSupplier(drawingSupplier52);
        org.jfree.chart.LegendItemCollection legendItemCollection54 = categoryPlot19.getFixedLegendItems();
        java.awt.Paint paint55 = categoryPlot19.getOutlinePaint();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(categoryAxisArray26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(sortOrder30);
        org.junit.Assert.assertNull(collection35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray50);
        org.junit.Assert.assertNotNull(drawingSupplier52);
        org.junit.Assert.assertNull(legendItemCollection54);
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot0.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        categoryPlot0.setDataset((int) (short) 0, categoryDataset15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        categoryPlot0.notifyListeners(plotChangeEvent17);
        org.junit.Assert.assertNull(collection6);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        java.awt.Graphics2D graphics2D86 = null;
        java.awt.geom.Rectangle2D rectangle2D87 = null;
        categoryPlot0.drawBackgroundImage(graphics2D86, rectangle2D87);
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
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        java.util.List list20 = categoryPlot0.getCategoriesForAxis(categoryAxis19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        java.awt.Paint paint17 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        java.awt.Stroke stroke24 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(categoryAxisArray18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        java.awt.geom.Point2D point2D24 = null;
        org.jfree.chart.plot.PlotState plotState25 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D22, rectangle2D23, point2D24, plotState25, plotRenderingInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sortOrder15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        int int15 = categoryPlot0.getDatasetCount();
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        double double13 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.data.Range range15 = categoryPlot0.getDataRange(valueAxis14);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(range15);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot0.markerChanged(markerChangeEvent16);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(categoryItemRenderer15);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        categoryPlot0.zoomRangeAxes((double) ' ', plotRenderingInfo31, point2D32, true);
        categoryPlot0.mapDatasetToDomainAxis(10, 10);
        org.jfree.chart.plot.Plot plot38 = categoryPlot0.getParent();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryItemRenderer23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(plot38);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.configureDomainAxes();
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
        org.junit.Assert.assertNotNull(axisLocation40);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        java.awt.Paint paint37 = null;
        categoryPlot0.setBackgroundPaint(paint37);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        java.awt.Stroke stroke25 = categoryPlot0.getRangeCrosshairStroke();
        categoryPlot0.setNoDataMessage("");
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        categoryPlot0.clearDomainMarkers(0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot0.getRangeAxis();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNull(valueAxis10);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot0.getRendererForDataset(categoryDataset11);
        categoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer12);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        boolean boolean14 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        int int16 = categoryPlot0.getRangeAxisIndex(valueAxis15);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        categoryPlot0.setRangeCrosshairValue((double) (-1.0f), true);
        org.jfree.chart.util.Layer layer42 = null;
        java.util.Collection collection43 = categoryPlot0.getRangeMarkers(layer42);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) 100, 1, plotRenderingInfo46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(collection43);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis8, false);
        categoryPlot0.setNoDataMessage("");
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = categoryPlot0.removeAnnotation(categoryAnnotation14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(plotOrientation13);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        categoryPlot20.setBackgroundImageAlignment((int) (byte) 100);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNotNull(axisLocation27);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        boolean boolean18 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        categoryPlot0.removeChangeListener(plotChangeListener21);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = categoryPlot0.getDomainAxis((int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot0.getRendererForDataset(categoryDataset25);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNull(categoryAxis24);
        org.junit.Assert.assertNull(categoryItemRenderer26);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo4 = null;
        java.awt.geom.Point2D point2D5 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo4, point2D5, false);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        float float9 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot0.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.configureRangeAxes();
        categoryPlot12.clearRangeMarkers();
        categoryPlot12.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke18 = categoryPlot12.getRangeGridlineStroke();
        double double19 = categoryPlot12.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        categoryPlot12.drawBackgroundImage(graphics2D20, rectangle2D21);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot12.getRangeAxisEdge();
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryPlot12.getDatasetGroup();
        org.jfree.chart.util.SortOrder sortOrder25 = categoryPlot12.getColumnRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder25);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertNotNull(sortOrder25);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        categoryPlot0.setRangeCrosshairValue((double) (byte) 1);
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
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot10.setRangeAxis((int) (byte) -1, valueAxis29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        boolean boolean23 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        categoryPlot0.setRenderer((int) (short) 0, categoryItemRenderer25, false);
        org.jfree.chart.plot.CategoryMarker categoryMarker28 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(categoryAxisArray13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3, true);
        java.lang.String str6 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray10 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis9 };
        categoryPlot8.setDomainAxes(categoryAxisArray10);
        java.awt.Stroke stroke12 = categoryPlot8.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot8.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot8.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot8.markerChanged(markerChangeEvent15);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        categoryPlot8.setRangeAxis((int) (byte) 100, valueAxis18, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot21.configureRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        categoryPlot21.zoomRangeAxes((-1.0d), plotRenderingInfo24, point2D25, false);
        org.jfree.chart.axis.AxisLocation axisLocation29 = categoryPlot21.getRangeAxisLocation((int) (byte) 10);
        categoryPlot8.setRangeAxisLocation(axisLocation29, true);
        java.awt.Stroke stroke32 = categoryPlot8.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        java.awt.geom.Point2D point2D35 = null;
        categoryPlot8.zoomRangeAxes((double) (byte) 10, plotRenderingInfo34, point2D35);
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot8.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation((int) (byte) 10, axisLocation37, true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(categoryAxisArray10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(axisLocation37);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        int int11 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(categoryAxisArray7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot0.setRangeAxis(0, valueAxis17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNull(categoryAxis15);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        org.jfree.chart.util.SortOrder sortOrder24 = categoryPlot0.getColumnRenderingOrder();
        java.lang.Object obj25 = null;
        boolean boolean26 = categoryPlot0.equals(obj25);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(sortOrder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearRangeMarkers();
        int int3 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.SortOrder sortOrder4 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(sortOrder4);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((int) (byte) -1);
        double double15 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 0, plotRenderingInfo5, point2D6, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = categoryPlot0.getRenderer((int) (byte) 10);
        boolean boolean11 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot0.setRenderer((int) '#', categoryItemRenderer13, true);
        boolean boolean16 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getRangeMarkers(layer11);
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNull(axisSpace10);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        boolean boolean5 = categoryPlot0.isRangeZoomable();
        double double6 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(legendItemCollection7);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = null;
        categoryPlot0.setRenderer(categoryItemRenderer39);
        org.jfree.chart.plot.Marker marker42 = null;
        org.jfree.chart.util.Layer layer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 10, marker42, layer43);
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer13, true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        categoryPlot0.setBackgroundImageAlignment((int) (byte) 1);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (short) -1, plotRenderingInfo12, point2D13, false);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis3, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = categoryPlot0.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomDomainAxes((double) 10, plotRenderingInfo8, point2D9, true);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        boolean boolean16 = categoryPlot0.render(graphics2D12, rectangle2D13, (int) (short) -1, plotRenderingInfo15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot0.zoomRangeAxes((double) 10.0f, plotRenderingInfo28, point2D29, true);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis2);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setBackgroundAlpha((float) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        categoryPlot0.mapDatasetToDomainAxis((int) 'a', (int) (short) 10);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.junit.Assert.assertNotNull(axisLocation4);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 100, plotRenderingInfo33, point2D34, true);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        categoryPlot0.setRangeAxis(valueAxis37);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(categoryAnchor31);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray37 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis36 };
        categoryPlot35.setDomainAxes(categoryAxisArray37);
        java.awt.Stroke stroke39 = categoryPlot35.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection40 = categoryPlot35.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge41 = categoryPlot35.getRangeAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot35.getRangeAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((int) (short) -1, axisLocation42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(categoryAxisArray37);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(legendItemCollection40);
        org.junit.Assert.assertNotNull(rectangleEdge41);
        org.junit.Assert.assertNotNull(axisLocation42);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        categoryPlot0.setRenderer(categoryItemRenderer3, true);
        java.lang.String str6 = categoryPlot0.getNoDataMessage();
        double double7 = categoryPlot0.getAnchorValue();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getRangeAxisLocation(15);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.Plot plot11 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setAnchorValue(100.0d, false);
        float float5 = categoryPlot0.getForegroundAlpha();
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) 'a', layer8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean12 = categoryPlot11.isRangeZoomable();
        categoryPlot11.setAnchorValue(100.0d, false);
        float float16 = categoryPlot11.getForegroundAlpha();
        int int17 = categoryPlot11.getWeight();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot11.setRangeAxis((int) (byte) 100, valueAxis19, false);
        categoryPlot11.setNoDataMessage("");
        boolean boolean24 = categoryPlot11.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean26 = categoryPlot25.isRangeZoomable();
        org.jfree.chart.plot.Plot plot27 = categoryPlot25.getParent();
        org.jfree.chart.plot.PlotOrientation plotOrientation28 = categoryPlot25.getOrientation();
        categoryPlot11.setOrientation(plotOrientation28);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(plot27);
        org.junit.Assert.assertNotNull(plotOrientation28);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        boolean boolean22 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        java.awt.geom.Point2D point2D38 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 100, (double) 100L, plotRenderingInfo37, point2D38);
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        categoryPlot0.setDomainAxis(categoryAxis40);
        java.awt.Image image42 = categoryPlot0.getBackgroundImage();
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
        org.junit.Assert.assertNull(image42);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean1 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.Plot plot2 = categoryPlot0.getParent();
        categoryPlot0.setNoDataMessage("hi!");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        categoryPlot0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis((int) 'a');
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.Marker marker10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNull(categoryAxis9);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge43 = categoryPlot0.getDomainAxisEdge((int) ' ');
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
        org.junit.Assert.assertNotNull(rectangleEdge43);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        java.awt.geom.Point2D point2D38 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 100, (double) 100L, plotRenderingInfo37, point2D38);
        java.awt.Paint paint40 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.util.Layer layer42 = null;
        java.util.Collection collection43 = categoryPlot0.getRangeMarkers((int) '#', layer42);
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
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(collection43);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        java.awt.Paint paint37 = null;
        categoryPlot0.setBackgroundPaint(paint37);
        java.lang.Class<?> wildcardClass39 = categoryPlot0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        categoryPlot0.axisChanged(axisChangeEvent23);
        java.awt.Paint paint25 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder3 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        java.util.List list5 = categoryPlot0.getCategoriesForAxis(categoryAxis4);
        java.lang.String str6 = categoryPlot0.getPlotType();
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers((int) (short) 10, layer8);
        boolean boolean10 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNotNull(datasetRenderingOrder3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Category Plot" + "'", str6, "Category Plot");
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = categoryPlot0.getDataset();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(legendItemCollection22);
        org.junit.Assert.assertNull(categoryDataset23);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot0.markerChanged(markerChangeEvent20);
        java.awt.Stroke stroke22 = categoryPlot0.getRangeCrosshairStroke();
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((int) (short) -1, valueAxis18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        boolean boolean14 = categoryPlot0.isSubplot();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean16 = categoryPlot15.isRangeZoomable();
        categoryPlot15.setAnchorValue(100.0d, false);
        float float20 = categoryPlot15.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray23 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis22 };
        categoryPlot21.setDomainAxes(categoryAxisArray23);
        java.awt.Stroke stroke25 = categoryPlot21.getOutlineStroke();
        categoryPlot15.setRangeCrosshairStroke(stroke25);
        categoryPlot0.setOutlineStroke(stroke25);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray23);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = categoryPlot0.getRenderer();
        java.lang.String str5 = categoryPlot0.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = categoryPlot0.getRendererForDataset(categoryDataset6);
        java.awt.Stroke stroke8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlineStroke(stroke8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertNull(categoryItemRenderer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Category Plot" + "'", str5, "Category Plot");
        org.junit.Assert.assertNull(categoryItemRenderer7);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        boolean boolean3 = categoryPlot0.isDomainGridlinesVisible();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot5.getDataset((int) (short) 1);
        categoryPlot5.clearRangeAxes();
        int int9 = categoryPlot5.getWeight();
        categoryPlot5.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor12 = categoryPlot5.getDomainGridlinePosition();
        categoryPlot5.setRangeCrosshairValue((double) 10.0f, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot5.setRenderer(0, categoryItemRenderer17);
        boolean boolean19 = categoryPlot5.getDrawSharedDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot20.configureRangeAxes();
        categoryPlot20.clearRangeMarkers();
        categoryPlot20.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke26 = categoryPlot20.getRangeGridlineStroke();
        double double27 = categoryPlot20.getRangeCrosshairValue();
        java.awt.Paint paint28 = categoryPlot20.getBackgroundPaint();
        boolean boolean29 = categoryPlot20.getDrawSharedDomainAxis();
        org.jfree.chart.LegendItemCollection legendItemCollection30 = categoryPlot20.getLegendItems();
        categoryPlot5.setFixedLegendItems(legendItemCollection30);
        categoryPlot0.setFixedLegendItems(legendItemCollection30);
        org.jfree.chart.axis.AxisSpace axisSpace33 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace33);
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(legendItemCollection30);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge18 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation16, plotOrientation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(sortOrder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation16);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = categoryPlot0.getDataRange(valueAxis16);
        org.jfree.chart.plot.Plot plot18 = categoryPlot0.getParent();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot19.setRangeAxis((int) (byte) 100, valueAxis21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        boolean boolean27 = categoryPlot19.render(graphics2D23, rectangle2D24, (int) (byte) 100, plotRenderingInfo26);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = categoryPlot19.getRenderer((int) (short) 10);
        java.awt.Stroke stroke30 = categoryPlot19.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = categoryPlot19.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        java.awt.geom.Point2D point2D35 = null;
        categoryPlot19.zoomRangeAxes((double) (byte) 1, (double) '#', plotRenderingInfo34, point2D35);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder37 = categoryPlot19.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder37);
        java.awt.Stroke stroke39 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNull(plot18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(categoryItemRenderer29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(datasetRenderingOrder37);
        org.junit.Assert.assertNotNull(stroke39);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        categoryPlot0.setRangeCrosshairValue((double) 0.0f, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        org.jfree.chart.axis.ValueAxis valueAxis33 = categoryPlot0.getRangeAxisForDataset((int) (byte) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        categoryPlot34.setRangeAxis((int) (byte) 100, valueAxis36);
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        boolean boolean42 = categoryPlot34.render(graphics2D38, rectangle2D39, (int) (byte) 100, plotRenderingInfo41);
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        categoryPlot34.setRangeAxis((int) (short) 0, valueAxis44);
        java.awt.Paint paint46 = categoryPlot34.getRangeCrosshairPaint();
        categoryPlot0.setRangeGridlinePaint(paint46);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(categoryItemRendererArray23);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNull(valueAxis33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot7.getRendererForDataset(categoryDataset15);
        int int17 = categoryPlot7.getWeight();
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(sortOrder12);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomDomainAxes((double) 0.5f, (double) (byte) 0, plotRenderingInfo19, point2D20);
        org.junit.Assert.assertNotNull(categoryAxisArray2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray13);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot0.getDomainAxisLocation((int) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset30 = categoryPlot0.getDataset((int) (short) -1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(categoryAxisArray15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNull(categoryDataset30);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        org.jfree.data.general.DatasetGroup datasetGroup3 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot0.getAxisOffset();
        org.junit.Assert.assertNull(datasetGroup3);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D29, rectangle2D30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryItemRenderer23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        org.jfree.data.category.CategoryDataset categoryDataset28 = categoryPlot0.getDataset((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNull(categoryDataset28);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        org.jfree.chart.axis.AxisSpace axisSpace14 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot0.getRangeAxisEdge(101);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemRenderer10);
        org.junit.Assert.assertNull(axisSpace14);
        org.junit.Assert.assertNotNull(rectangleEdge16);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setWeight((-1));
        java.util.List list5 = categoryPlot0.getCategories();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray8 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis7 };
        categoryPlot6.setDomainAxes(categoryAxisArray8);
        java.awt.Stroke stroke10 = categoryPlot6.getOutlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = categoryPlot6.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot6.getRenderer();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot6.markerChanged(markerChangeEvent13);
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot6.getRangeAxisEdge((int) (short) 10);
        java.awt.Paint paint17 = categoryPlot6.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint17);
        boolean boolean19 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(categoryAxisArray8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.data.category.CategoryDataset categoryDataset2 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.clearRangeAxes();
        int int4 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor7 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, false);
        java.awt.Paint paint11 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNull(categoryDataset2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor7);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot0.configureRangeAxes();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot12.configureRangeAxes();
        categoryPlot12.clearDomainMarkers();
        categoryPlot12.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot12.setNoDataMessagePaint(paint17);
        java.awt.Image image19 = categoryPlot12.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot12.zoomDomainAxes((double) 0.0f, plotRenderingInfo21, point2D22);
        categoryPlot12.mapDatasetToDomainAxis((int) '4', (int) '4');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        int int28 = categoryPlot12.getIndexOf(categoryItemRenderer27);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        categoryPlot29.configureRangeAxes();
        categoryPlot29.clearRangeMarkers();
        categoryPlot29.mapDatasetToRangeAxis((int) 'a', (int) (byte) 1);
        java.awt.Stroke stroke35 = categoryPlot29.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = categoryPlot29.getDomainAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        java.awt.geom.Point2D point2D39 = null;
        categoryPlot29.zoomRangeAxes((double) 0L, plotRenderingInfo38, point2D39, false);
        java.awt.Image image42 = null;
        categoryPlot29.setBackgroundImage(image42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        categoryPlot29.setDataset(categoryDataset44);
        org.jfree.chart.axis.AxisLocation axisLocation46 = categoryPlot29.getRangeAxisLocation();
        categoryPlot12.setRangeAxisLocation(axisLocation46, true);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation((int) (short) -1, axisLocation46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNull(categoryAxis36);
        org.junit.Assert.assertNotNull(axisLocation46);
    }
}

