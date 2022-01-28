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
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeMinorGridlinesVisible(true);
        java.util.List list7 = categoryPlot4.getCategories();
        categoryPlot4.setRangeCrosshairValue((double) '#');
        org.jfree.chart.axis.AxisSpace axisSpace10 = categoryPlot4.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        java.awt.Paint paint16 = categoryPlot15.getRangeCrosshairPaint();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        categoryPlot21.setRangeMinorGridlinesVisible(true);
        java.awt.Stroke stroke24 = categoryPlot21.getRangeGridlineStroke();
        categoryPlot15.setRangeZeroBaselineStroke(stroke24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        categoryPlot15.drawBackgroundImage(graphics2D26, rectangle2D27);
        categoryPlot15.setRangeGridlinesVisible(false);
        boolean boolean31 = categoryPlot4.equals((java.lang.Object) categoryPlot15);
        double double32 = categoryPlot15.getRangeCrosshairValue();
        categoryPlot15.setDomainCrosshairRowKey((java.lang.Comparable) 10.0f, false);
        java.awt.Paint paint36 = categoryPlot15.getRangeMinorGridlinePaint();
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(axisSpace10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(paint36);
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
        java.awt.Paint paint5 = categoryPlot4.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot4.getRangeAxisEdge();
        java.awt.Paint paint7 = categoryPlot4.getRangeCrosshairPaint();
        boolean boolean8 = categoryPlot4.canSelectByRegion();
        java.awt.Stroke stroke9 = categoryPlot4.getOutlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot4.getRangeAxisEdge();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot4.setRenderer(0, categoryItemRenderer12);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot4.getRenderer(10);
        categoryPlot4.setNotify(true);
        categoryPlot4.clearSelection();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot4.setDataset(categoryDataset10);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        categoryPlot4.setRangeGridlinePaint(paint12);
        java.awt.Paint paint14 = categoryPlot4.getRangeCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        categoryPlot4.setRangeAxis((int) 'a', valueAxis16);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
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
        java.awt.Paint paint5 = categoryPlot4.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot4.getRangeAxisEdge();
        double double7 = categoryPlot4.getAnchorValue();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot4.getAxisOffset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot4.markerChanged(markerChangeEvent9);
        int int11 = categoryPlot4.getRangeAxisCount();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        categoryPlot4.axisChanged(axisChangeEvent12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        categoryPlot4.setFixedDomainAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot4.setDomainAxis(0, categoryAxis18);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = categoryPlot4.getDomainAxisForDataset(10);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState26 = null;
        boolean boolean27 = categoryPlot4.render(graphics2D22, rectangle2D23, (int) (byte) 0, plotRenderingInfo25, categoryCrosshairState26);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(categoryAxis21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
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
        categoryPlot4.setDomainCrosshairRowKey((java.lang.Comparable) 1, true);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor8 = categoryPlot4.getDomainGridlinePosition();
        java.awt.Paint paint9 = categoryPlot4.getNoDataMessagePaint();
        boolean boolean10 = categoryPlot4.canSelectByRegion();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        java.awt.Paint paint16 = categoryPlot15.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot15.getRangeAxisEdge();
        java.awt.Paint paint18 = categoryPlot15.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        java.util.List list20 = categoryPlot15.getCategoriesForAxis(categoryAxis19);
        java.awt.Font font21 = categoryPlot15.getNoDataMessageFont();
        boolean boolean22 = categoryPlot15.isRangeGridlinesVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot15.setRenderer((int) (byte) 10, categoryItemRenderer24, true);
        java.awt.Paint paint27 = categoryPlot15.getRangeGridlinePaint();
        categoryPlot4.setDomainCrosshairPaint(paint27);
        org.jfree.chart.plot.PlotOrientation plotOrientation29 = categoryPlot4.getOrientation();
        org.junit.Assert.assertNotNull(categoryAnchor8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(plotOrientation29);
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
        categoryPlot4.setRangeMinorGridlinesVisible(true);
        boolean boolean7 = categoryPlot4.isRangeZeroBaselineVisible();
        org.jfree.chart.plot.Marker marker8 = null;
        boolean boolean9 = categoryPlot4.removeDomainMarker(marker8);
        java.awt.Paint paint10 = categoryPlot4.getDomainCrosshairPaint();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot15.getRenderer(10);
        double double18 = categoryPlot15.getRangeCrosshairValue();
        categoryPlot15.mapDatasetToDomainAxis(10, 100);
        java.awt.Paint paint22 = categoryPlot15.getNoDataMessagePaint();
        categoryPlot4.setRangeGridlinePaint(paint22);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot4.getRenderer(10);
        double double7 = categoryPlot4.getRangeCrosshairValue();
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.RenderingSource renderingSource11 = null;
        categoryPlot4.select((double) 0.0f, (double) ' ', rectangle2D10, renderingSource11);
        categoryPlot4.setNotify(false);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        java.awt.Paint paint20 = categoryPlot19.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot19.getRangeAxisEdge();
        java.awt.Paint paint22 = categoryPlot19.getRangeCrosshairPaint();
        categoryPlot19.setDomainCrosshairRowKey((java.lang.Comparable) '4');
        int int25 = categoryPlot19.getBackgroundImageAlignment();
        java.awt.Paint paint26 = categoryPlot19.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        java.awt.Paint paint32 = categoryPlot31.getRangeCrosshairPaint();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset33, categoryAxis34, valueAxis35, categoryItemRenderer36);
        categoryPlot37.setRangeMinorGridlinesVisible(true);
        categoryPlot37.setDomainCrosshairColumnKey((java.lang.Comparable) 100.0f);
        java.awt.Paint paint42 = categoryPlot37.getRangeMinorGridlinePaint();
        categoryPlot31.setRangeMinorGridlinePaint(paint42);
        java.awt.Paint paint44 = categoryPlot31.getRangeZeroBaselinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = categoryPlot31.getInsets();
        java.lang.String str46 = categoryPlot31.getPlotType();
        org.jfree.chart.axis.AxisLocation axisLocation47 = categoryPlot31.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation48 = categoryPlot31.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation49 = categoryPlot31.getRangeAxisLocation();
        categoryPlot19.setDomainAxisLocation(axisLocation49, true);
        categoryPlot4.setRangeAxisLocation(axisLocation49, false);
        java.awt.Paint paint54 = categoryPlot4.getNoDataMessagePaint();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Category Plot" + "'", str46, "Category Plot");
        org.junit.Assert.assertNotNull(axisLocation47);
        org.junit.Assert.assertNotNull(axisLocation48);
        org.junit.Assert.assertNotNull(axisLocation49);
        org.junit.Assert.assertNotNull(paint54);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot4.getRenderer(10);
        categoryPlot4.setNotify(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = categoryPlot4.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        categoryPlot14.setRangeMinorGridlinesVisible(true);
        categoryPlot14.setDomainCrosshairColumnKey((java.lang.Comparable) 100.0f);
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.RenderingSource renderingSource22 = null;
        categoryPlot14.select((double) (-1L), (double) (short) -1, rectangle2D21, renderingSource22);
        categoryPlot14.setDomainCrosshairRowKey((java.lang.Comparable) (byte) 10);
        java.awt.Stroke stroke26 = categoryPlot14.getRangeMinorGridlineStroke();
        categoryPlot4.setDomainCrosshairStroke(stroke26);
        boolean boolean28 = categoryPlot4.canSelectByPoint();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset29, categoryAxis30, valueAxis31, categoryItemRenderer32);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = categoryPlot33.getRenderer(10);
        double double36 = categoryPlot33.getRangeCrosshairValue();
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        org.jfree.chart.RenderingSource renderingSource40 = null;
        categoryPlot33.select((double) 0.0f, (double) ' ', rectangle2D39, renderingSource40);
        java.awt.Paint paint42 = categoryPlot33.getRangeZeroBaselinePaint();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor43 = categoryPlot33.getDomainGridlinePosition();
        java.awt.Font font44 = categoryPlot33.getNoDataMessageFont();
        categoryPlot4.setNoDataMessageFont(font44);
        categoryPlot4.setDomainCrosshairRowKey((java.lang.Comparable) (short) 1);
        java.lang.Comparable comparable48 = categoryPlot4.getDomainCrosshairRowKey();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(categoryItemRenderer35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(categoryAnchor43);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertEquals("'" + comparable48 + "' != '" + (short) 1 + "'", comparable48, (short) 1);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getRangeCrosshairPaint();
        categoryPlot4.setOutlineVisible(true);
        java.awt.Stroke stroke8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot4.setRangeCrosshairStroke(stroke8);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder10 = categoryPlot4.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot4.setDataset(0, categoryDataset12);
        java.awt.Font font14 = categoryPlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot19.getRenderer(10);
        categoryPlot19.setNotify(true);
        java.awt.Paint paint24 = categoryPlot19.getRangeMinorGridlinePaint();
        categoryPlot19.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        categoryPlot31.setRangeMinorGridlinesVisible(true);
        java.util.List list34 = categoryPlot31.getCategories();
        categoryPlot31.setRangeCrosshairValue((double) '#');
        categoryPlot31.configureDomainAxes();
        java.awt.Paint paint38 = categoryPlot31.getDomainCrosshairPaint();
        categoryPlot19.setRangeGridlinePaint(paint38);
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = null;
        categoryPlot19.setDomainAxis(0, categoryAxis41, true);
        boolean boolean44 = categoryPlot19.isRangeCrosshairLockedOnData();
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer48 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = new org.jfree.chart.plot.CategoryPlot(categoryDataset45, categoryAxis46, valueAxis47, categoryItemRenderer48);
        java.awt.Paint paint50 = categoryPlot49.getRangeCrosshairPaint();
        boolean boolean51 = categoryPlot49.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        categoryPlot49.setDataset(categoryDataset52);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray54 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot49.setRenderers(categoryItemRendererArray54);
        categoryPlot19.setRenderers(categoryItemRendererArray54);
        categoryPlot4.setRenderers(categoryItemRendererArray54);
        categoryPlot4.setRangeZeroBaselineVisible(true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(datasetRenderingOrder10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(list34);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(categoryItemRendererArray54);
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
        categoryPlot4.setRangeCrosshairValue((double) (byte) 1, true);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        java.awt.Paint paint13 = categoryPlot12.getRangeCrosshairPaint();
        categoryPlot12.setOutlineVisible(true);
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot12.setRangeCrosshairStroke(stroke16);
        categoryPlot12.configureDomainAxes();
        categoryPlot12.setDomainCrosshairColumnKey((java.lang.Comparable) (byte) 100);
        java.awt.Stroke stroke21 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot12.setDomainCrosshairStroke(stroke21);
        double double23 = categoryPlot12.getAnchorValue();
        categoryPlot4.setParent((org.jfree.chart.plot.Plot) categoryPlot12);
        java.awt.Paint paint25 = categoryPlot12.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis29, categoryItemRenderer30);
        java.awt.Paint paint32 = categoryPlot31.getRangeCrosshairPaint();
        categoryPlot31.setOutlineVisible(true);
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot31.setRangeCrosshairStroke(stroke35);
        categoryPlot31.setRangePannable(true);
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot31.getRangeAxisLocation((int) (byte) -1);
        categoryPlot12.setRangeAxisLocation((int) (short) 0, axisLocation40);
        java.util.List list42 = categoryPlot12.getAnnotations();
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertNotNull(list42);
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
        categoryPlot4.setDomainCrosshairRowKey((java.lang.Comparable) 1, true);
        boolean boolean8 = categoryPlot4.isRangePannable();
        org.jfree.chart.util.SortOrder sortOrder9 = categoryPlot4.getColumnRenderingOrder();
        java.awt.Stroke stroke10 = categoryPlot4.getRangeCrosshairStroke();
        boolean boolean11 = categoryPlot4.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sortOrder9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot4.getRenderer(10);
        categoryPlot4.setNotify(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        categoryPlot4.addChangeListener(plotChangeListener10);
        int int12 = categoryPlot4.getBackgroundImageAlignment();
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot4.getRangeMarkers((int) (short) 1, layer14);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNull(collection15);
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
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = categoryPlot4.getDomainAxis();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset6, categoryAxis7, valueAxis8, categoryItemRenderer9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot10.getRenderer(10);
        categoryPlot10.setNotify(true);
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        boolean boolean18 = categoryPlot10.removeDomainMarker((int) (short) 10, marker16, layer17);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        categoryPlot10.addChangeListener(plotChangeListener19);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot10.getDomainAxisForDataset(0);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis24, valueAxis25, categoryItemRenderer26);
        categoryPlot27.setRangeMinorGridlinesVisible(true);
        boolean boolean30 = categoryPlot27.isRangeZeroBaselineVisible();
        org.jfree.chart.util.Layer layer31 = null;
        java.util.Collection collection32 = categoryPlot27.getDomainMarkers(layer31);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray34 = new org.jfree.chart.axis.ValueAxis[] { valueAxis33 };
        categoryPlot27.setRangeAxes(valueAxisArray34);
        categoryPlot10.setRangeAxes(valueAxisArray34);
        categoryPlot4.setRangeAxes(valueAxisArray34);
        org.junit.Assert.assertNull(categoryAxis5);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(collection32);
        org.junit.Assert.assertNotNull(valueAxisArray34);
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
        categoryPlot4.setRangeMinorGridlinesVisible(true);
        java.util.List list7 = categoryPlot4.getCategories();
        categoryPlot4.setRangeCrosshairValue((double) '#');
        org.jfree.chart.axis.AxisSpace axisSpace10 = categoryPlot4.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        java.awt.Paint paint16 = categoryPlot15.getRangeCrosshairPaint();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis19, categoryItemRenderer20);
        categoryPlot21.setRangeMinorGridlinesVisible(true);
        java.awt.Stroke stroke24 = categoryPlot21.getRangeGridlineStroke();
        categoryPlot15.setRangeZeroBaselineStroke(stroke24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        categoryPlot15.drawBackgroundImage(graphics2D26, rectangle2D27);
        categoryPlot15.setRangeGridlinesVisible(false);
        boolean boolean31 = categoryPlot4.equals((java.lang.Object) categoryPlot15);
        categoryPlot15.setRangeCrosshairValue((-1.0d));
        categoryPlot15.setOutlineVisible(false);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(axisSpace10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot4.getRenderer(10);
        categoryPlot4.setNotify(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot4.panDomainAxes((double) (short) 0, plotRenderingInfo11, point2D12);
        int int14 = categoryPlot4.getCrosshairDatasetIndex();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        java.awt.Paint paint20 = categoryPlot19.getRangeCrosshairPaint();
        categoryPlot19.setOutlineVisible(true);
        java.awt.Image image23 = categoryPlot19.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        categoryPlot28.setRangeMinorGridlinesVisible(true);
        java.util.List list31 = categoryPlot28.getCategories();
        categoryPlot28.setRangeCrosshairValue((double) '#');
        categoryPlot28.configureRangeAxes();
        org.jfree.chart.plot.Marker marker36 = null;
        org.jfree.chart.util.Layer layer37 = null;
        boolean boolean39 = categoryPlot28.removeDomainMarker((int) (byte) 0, marker36, layer37, false);
        categoryPlot28.setDomainGridlinesVisible(false);
        java.awt.Paint paint42 = categoryPlot28.getRangeGridlinePaint();
        categoryPlot19.setOutlinePaint(paint42);
        categoryPlot4.setRangeZeroBaselinePaint(paint42);
        categoryPlot4.mapDatasetToDomainAxis((int) (byte) 1, 1);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNull(list31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(paint42);
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot4.getRenderer(10);
        double double7 = categoryPlot4.getRangeCrosshairValue();
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.RenderingSource renderingSource11 = null;
        categoryPlot4.select((double) 0.0f, (double) ' ', rectangle2D10, renderingSource11);
        java.awt.Paint paint13 = categoryPlot4.getRangeZeroBaselinePaint();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor14 = categoryPlot4.getDomainGridlinePosition();
        java.awt.Font font15 = categoryPlot4.getNoDataMessageFont();
        org.jfree.chart.axis.AxisSpace axisSpace16 = categoryPlot4.getFixedRangeAxisSpace();
        org.jfree.chart.util.SortOrder sortOrder17 = categoryPlot4.getColumnRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis19 = categoryPlot4.getRangeAxisForDataset(100);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.data.Range range21 = categoryPlot4.getDataRange(valueAxis20);
        categoryPlot4.setWeight(100);
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(categoryAnchor14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(axisSpace16);
        org.junit.Assert.assertNotNull(sortOrder17);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNull(range21);
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
        categoryPlot4.setRangeMinorGridlinesVisible(true);
        java.util.List list7 = categoryPlot4.getCategories();
        categoryPlot4.setRangeCrosshairValue((double) '#');
        categoryPlot4.configureRangeAxes();
        float float11 = categoryPlot4.getForegroundAlpha();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = categoryPlot4.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        categoryPlot4.setFixedDomainAxisSpace(axisSpace13);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getRangeCrosshairPaint();
        categoryPlot4.setOutlineVisible(true);
        java.awt.Stroke stroke8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot4.setRangeCrosshairStroke(stroke8);
        categoryPlot4.setRangePannable(true);
        boolean boolean12 = categoryPlot4.canSelectByPoint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis14, valueAxis15, categoryItemRenderer16);
        categoryPlot17.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.util.ShadowGenerator shadowGenerator20 = categoryPlot17.getShadowGenerator();
        boolean boolean21 = categoryPlot17.isDomainZoomable();
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot17.getRangeAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot17.getDomainAxisLocation();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis25, valueAxis26, categoryItemRenderer27);
        java.awt.Paint paint29 = categoryPlot28.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = categoryPlot28.getRangeAxisEdge();
        java.awt.Paint paint31 = categoryPlot28.getRangeCrosshairPaint();
        org.jfree.chart.plot.PlotOrientation plotOrientation32 = categoryPlot28.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation23, plotOrientation32);
        categoryPlot4.setRangeAxisLocation(axisLocation23, false);
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.data.Range range37 = categoryPlot4.getDataRange(valueAxis36);
        boolean boolean38 = categoryPlot4.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(shadowGenerator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(plotOrientation32);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.util.ShadowGenerator shadowGenerator7 = categoryPlot4.getShadowGenerator();
        boolean boolean8 = categoryPlot4.isDomainZoomable();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot4.getRangeAxisLocation();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        java.awt.Paint paint15 = categoryPlot14.getRangeCrosshairPaint();
        categoryPlot14.setOutlineVisible(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot14.getDomainAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot14.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot14.getDomainAxisLocation();
        categoryPlot4.setRangeAxisLocation(axisLocation20, false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot4.removeChangeListener(plotChangeListener23);
        org.junit.Assert.assertNotNull(shadowGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(axisLocation20);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getRangeCrosshairPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset6, categoryAxis7, valueAxis8, categoryItemRenderer9);
        categoryPlot10.setRangeMinorGridlinesVisible(true);
        categoryPlot10.setDomainCrosshairColumnKey((java.lang.Comparable) 100.0f);
        java.awt.Paint paint15 = categoryPlot10.getRangeMinorGridlinePaint();
        categoryPlot4.setRangeMinorGridlinePaint(paint15);
        java.awt.Paint paint17 = categoryPlot4.getRangeZeroBaselinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = categoryPlot4.getInsets();
        java.awt.Stroke stroke19 = categoryPlot4.getRangeZeroBaselineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis22, categoryItemRenderer23);
        java.awt.Paint paint25 = categoryPlot24.getRangeCrosshairPaint();
        boolean boolean26 = categoryPlot24.isSubplot();
        boolean boolean27 = categoryPlot4.equals((java.lang.Object) categoryPlot24);
        float float28 = categoryPlot24.getBackgroundImageAlpha();
        int int29 = categoryPlot24.getBackgroundImageAlignment();
        categoryPlot24.setDomainCrosshairRowKey((java.lang.Comparable) '#', false);
        categoryPlot24.clearSelection();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot24.setRenderer((int) 'a', categoryItemRenderer35, true);
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.data.Range range39 = categoryPlot24.getDataRange(valueAxis38);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.5f + "'", float28 == 0.5f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertNull(range39);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getRangeCrosshairPaint();
        categoryPlot4.setOutlineVisible(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot4.getDomainAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot4.getDomainAxisLocation();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        categoryPlot15.setRangeCrosshairValue((double) (byte) 1, true);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis20, valueAxis21, categoryItemRenderer22);
        java.awt.Paint paint24 = categoryPlot23.getRangeCrosshairPaint();
        categoryPlot23.setOutlineVisible(true);
        java.awt.Stroke stroke27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot23.setRangeCrosshairStroke(stroke27);
        categoryPlot23.configureDomainAxes();
        categoryPlot23.setDomainCrosshairColumnKey((java.lang.Comparable) (byte) 100);
        java.awt.Stroke stroke32 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot23.setDomainCrosshairStroke(stroke32);
        double double34 = categoryPlot23.getAnchorValue();
        categoryPlot15.setParent((org.jfree.chart.plot.Plot) categoryPlot23);
        java.awt.Paint paint36 = categoryPlot23.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset38, categoryAxis39, valueAxis40, categoryItemRenderer41);
        java.awt.Paint paint43 = categoryPlot42.getRangeCrosshairPaint();
        categoryPlot42.setOutlineVisible(true);
        java.awt.Stroke stroke46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot42.setRangeCrosshairStroke(stroke46);
        categoryPlot42.setRangePannable(true);
        org.jfree.chart.axis.AxisLocation axisLocation51 = categoryPlot42.getRangeAxisLocation((int) (byte) -1);
        categoryPlot23.setRangeAxisLocation((int) (short) 0, axisLocation51);
        categoryPlot4.setRangeAxisLocation(0, axisLocation51);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(axisLocation51);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Paint paint5 = categoryPlot4.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot4.getRangeAxisEdge();
        java.awt.Paint paint7 = categoryPlot4.getRangeCrosshairPaint();
        categoryPlot4.setDomainCrosshairRowKey((java.lang.Comparable) '4');
        categoryPlot4.mapDatasetToDomainAxis((int) 'a', (int) (byte) 0);
        double double13 = categoryPlot4.getAnchorValue();
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot4.getRangeAxis();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot4.setRenderer(categoryItemRenderer15, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        int int19 = categoryPlot4.getIndexOf(categoryItemRenderer18);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot4.getRenderer(10);
        categoryPlot4.setNotify(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = categoryPlot4.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        categoryPlot4.addChangeListener(plotChangeListener10);
        int int12 = categoryPlot4.getBackgroundImageAlignment();
        boolean boolean13 = categoryPlot4.isRangeMinorGridlinesVisible();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}

