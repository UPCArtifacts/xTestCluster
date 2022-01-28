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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset5 = categoryPlot0.getDataset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) (-1.0f), plotRenderingInfo8, point2D9);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(categoryDataset5);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot1.setInsets(rectangleInsets2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = null;
        categoryPlot1.setFixedLegendItems(legendItemCollection4);
        java.awt.Paint paint6 = categoryPlot1.getNoDataMessagePaint();
        categoryPlot0.setBackgroundPaint(paint6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (short) 0);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge9);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot0.getDomainAxisForDataset((int) '#');
        java.lang.Object obj12 = categoryPlot0.clone();
        org.jfree.chart.util.SortOrder sortOrder13 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.Plot plot14 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(categoryAxis11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(sortOrder13);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray9 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot0.setRenderers(categoryItemRendererArray9);
        org.jfree.chart.plot.Plot plot11 = categoryPlot0.getParent();
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getDomainMarkers(1, layer13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Paint paint9 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge();
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        boolean boolean13 = categoryPlot0.getDrawSharedDomainAxis();
        int int14 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Paint paint15 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot0.getDomainAxisForDataset((int) (short) 1);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.AxisSpace axisSpace19 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(axisSpace19);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        categoryPlot0.drawBackgroundImage(graphics2D10, rectangle2D11);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 0, 100);
        org.jfree.chart.plot.Plot plot16 = categoryPlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Image image17 = plot16.getBackgroundImage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(plot16);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        int int21 = categoryPlot18.getDomainAxisIndex(categoryAxis20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot18.setDomainAxis((int) (short) 100, categoryAxis23, false);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot18.getRangeMarkers(layer26);
        categoryPlot18.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder30 = categoryPlot18.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder30);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = categoryPlot0.getRenderer();
        java.awt.Paint paint33 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.CategoryMarker categoryMarker35 = null;
        org.jfree.chart.util.Layer layer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (short) 1, categoryMarker35, layer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(sortOrder30);
        org.junit.Assert.assertNull(categoryItemRenderer32);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 10, (-1));
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(rectangleEdge3);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = categoryPlot0.getDomainAxisForDataset((int) (byte) 0);
        java.lang.String str4 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertNull(categoryAxis3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.AxisSpace axisSpace12 = categoryPlot0.getFixedDomainAxisSpace();
        java.awt.Paint paint13 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(axisSpace12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot6.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot6.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot6.setDomainAxis((int) (short) 100, categoryAxis11, false);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot6.getRangeMarkers(layer14);
        categoryPlot6.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot6.getDomainAxisIndex(categoryAxis18);
        categoryPlot6.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis23 = categoryPlot6.getRangeAxis();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot6);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = categoryPlot26.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor29 = categoryPlot26.getDomainGridlinePosition();
        categoryPlot26.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        categoryPlot26.clearAnnotations();
        org.jfree.chart.axis.AxisSpace axisSpace34 = null;
        categoryPlot26.setFixedRangeAxisSpace(axisSpace34);
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot26.getDomainAxisLocation(100);
        categoryPlot0.setDomainAxisLocation((int) '4', axisLocation37, true);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNull(categoryItemRenderer28);
        org.junit.Assert.assertNotNull(categoryAnchor29);
        org.junit.Assert.assertNotNull(axisLocation37);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(categoryAxis14);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        java.awt.Stroke stroke16 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot18 = categoryPlot10.getRootPlot();
        double double19 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot10.getRangeAxisEdge();
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot10.getRangeAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot10.getDomainAxisLocation();
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(rectangleEdge22);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot27 = categoryPlot19.getRootPlot();
        double double28 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot19.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        categoryPlot19.setDomainAxis(10, categoryAxis31, false);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        java.util.List list35 = categoryPlot19.getAnnotations();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        java.awt.Stroke stroke10 = categoryPlot7.getRangeGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke10);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxis();
        int int13 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis();
        categoryPlot0.setAnchorValue((double) 100L, false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        categoryPlot0.setDrawingSupplier(drawingSupplier12);
        float float14 = categoryPlot0.getBackgroundImageAlpha();
        java.awt.Paint paint15 = categoryPlot0.getOutlinePaint();
        java.lang.String str16 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot18 = categoryPlot10.getRootPlot();
        double double19 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot10.getRangeAxisEdge();
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot10.getRangeAxisEdge();
        categoryPlot10.clearDomainMarkers((int) (byte) 0);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(rectangleEdge22);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent15);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(axisSpace13);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset();
        int int8 = categoryPlot0.getWeight();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        categoryPlot0.clearRangeMarkers(100);
        boolean boolean12 = categoryPlot0.isDomainZoomable();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Point2D point2D15 = null;
        org.jfree.chart.plot.PlotState plotState16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D13, rectangle2D14, point2D15, plotState16, plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.Plot plot5 = categoryPlot0.getRootPlot();
        categoryPlot0.setForegroundAlpha((float) ' ');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) '4', (int) (byte) 0, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(plot5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot0.setRangeAxis(valueAxis6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(categoryItemRenderer8);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        java.awt.Paint paint9 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        categoryPlot0.notifyListeners(plotChangeEvent10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.mapDatasetToRangeAxis((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setAnchorValue((double) (-1.0f), false);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        categoryPlot17.setAnchorValue((double) (short) 1);
        double double24 = categoryPlot17.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot25 = categoryPlot17.getRootPlot();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot17);
        org.jfree.data.general.DatasetGroup datasetGroup27 = categoryPlot17.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot17.zoomDomainAxes((double) (byte) 100, (double) (byte) 1, plotRenderingInfo30, point2D31);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNull(datasetGroup27);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        float float11 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        java.awt.Paint paint4 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis((int) ' ', valueAxis7, false);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(axisLocation5);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        float float5 = categoryPlot0.getForegroundAlpha();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        int int10 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Paint paint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeCrosshairPaint(paint11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = categoryPlot0.getRendererForDataset(categoryDataset4);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getRangeAxisLocation(100);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer5);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.clearAnnotations();
        java.awt.Paint paint11 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) 0.0f, plotRenderingInfo14, point2D15);
        java.awt.Paint paint17 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot19.setInsets(rectangleInsets20);
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot19.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup24 = categoryPlot19.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        categoryPlot25.markerChanged(markerChangeEvent26);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray29 = new org.jfree.chart.axis.ValueAxis[] { valueAxis28 };
        categoryPlot25.setRangeAxes(valueAxisArray29);
        categoryPlot25.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean34 = categoryPlot25.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot25.getDomainAxisLocation();
        categoryPlot19.setRangeAxisLocation(axisLocation35, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        categoryPlot38.markerChanged(markerChangeEvent39);
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray42 = new org.jfree.chart.axis.ValueAxis[] { valueAxis41 };
        categoryPlot38.setRangeAxes(valueAxisArray42);
        categoryPlot38.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot38.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.PlotOrientation plotOrientation50 = categoryPlot38.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge51 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation35, plotOrientation50);
        categoryPlot0.setRangeAxisLocation((int) (short) 100, axisLocation35);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertNotNull(valueAxisArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNotNull(valueAxisArray42);
        org.junit.Assert.assertNotNull(plotOrientation50);
        org.junit.Assert.assertNotNull(rectangleEdge51);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedRangeAxisSpace();
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        categoryPlot0.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) '#', (int) '#', plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace6);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge1 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis2 = categoryPlot0.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset4 = categoryPlot0.getDataset((int) (short) -1);
        org.junit.Assert.assertNotNull(rectangleEdge1);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNull(categoryDataset4);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomDomainAxes((double) 0L, (-1.0d), plotRenderingInfo17, point2D18);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        java.util.List list21 = categoryPlot0.getCategoriesForAxis(categoryAxis20);
        java.awt.Image image22 = null;
        categoryPlot0.setBackgroundImage(image22);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearRangeMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot7.getDomainAxisEdge((int) '4');
        categoryPlot7.setAnchorValue((double) (short) 1);
        double double14 = categoryPlot7.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot15 = categoryPlot7.getRootPlot();
        double double16 = categoryPlot7.getRangeCrosshairValue();
        int int17 = categoryPlot7.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot7.getRangeAxisLocation((int) ' ');
        categoryPlot4.setRangeAxisLocation((int) '4', axisLocation19, false);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        categoryPlot4.setDataset((int) '4', categoryDataset23);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.addChangeListener(plotChangeListener12);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(categoryItemRenderer14);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        double double14 = categoryPlot5.getRangeCrosshairValue();
        int int15 = categoryPlot5.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot5.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        categoryPlot0.setBackgroundAlpha((float) 15);
        java.awt.Font font21 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font21);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        categoryPlot27.markerChanged(markerChangeEvent28);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray31 = new org.jfree.chart.axis.ValueAxis[] { valueAxis30 };
        categoryPlot27.setRangeAxes(valueAxisArray31);
        categoryPlot27.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean36 = categoryPlot27.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot27.getDomainAxisLocation();
        categoryPlot23.setDomainAxisLocation((int) (byte) 1, axisLocation37, false);
        java.awt.Paint paint40 = categoryPlot23.getOutlinePaint();
        categoryPlot0.setRangeCrosshairPaint(paint40);
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = null;
        int int43 = categoryPlot0.getDomainAxisIndex(categoryAxis42);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(valueAxisArray31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        java.awt.Paint paint15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = categoryPlot17.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        int int20 = categoryPlot17.getDomainAxisIndex(categoryAxis19);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        categoryPlot17.setDomainAxis((int) (short) 100, categoryAxis22, false);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = categoryPlot17.getRangeMarkers(layer25);
        categoryPlot17.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        int int30 = categoryPlot17.getDomainAxisIndex(categoryAxis29);
        categoryPlot17.setAnchorValue((double) 10L, true);
        java.awt.Image image34 = null;
        categoryPlot17.setBackgroundImage(image34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        categoryPlot17.setDataset(categoryDataset36);
        org.jfree.chart.util.SortOrder sortOrder38 = categoryPlot17.getRowRenderingOrder();
        boolean boolean39 = categoryPlot0.equals((java.lang.Object) categoryPlot17);
        java.awt.Stroke stroke40 = categoryPlot17.getOutlineStroke();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryAxis18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(sortOrder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(stroke40);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        categoryPlot19.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot19.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo29, point2D30);
        org.jfree.chart.axis.AxisSpace axisSpace32 = categoryPlot19.getFixedDomainAxisSpace();
        categoryPlot19.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot19.getRangeAxisLocation((int) (byte) -1);
        categoryPlot0.setRangeAxisLocation(101, axisLocation35, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        categoryPlot38.markerChanged(markerChangeEvent39);
        org.jfree.chart.util.RectangleEdge rectangleEdge42 = categoryPlot38.getDomainAxisEdge((int) '4');
        categoryPlot38.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        categoryPlot38.setRenderer(categoryItemRenderer45);
        categoryPlot38.setAnchorValue((double) 10.0f);
        java.awt.Paint paint49 = categoryPlot38.getRangeCrosshairPaint();
        categoryPlot0.setOutlinePaint(paint49);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNull(axisSpace32);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNotNull(rectangleEdge42);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis(100, categoryAxis17, true);
        boolean boolean20 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairValue(0.0d, true);
        java.awt.Stroke stroke24 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        categoryPlot25.markerChanged(markerChangeEvent26);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot25.getDomainAxisEdge((int) '4');
        categoryPlot25.setAnchorValue((double) (short) 1);
        categoryPlot25.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot25.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo35, point2D36);
        int int38 = categoryPlot25.getDatasetCount();
        double double39 = categoryPlot25.getAnchorValue();
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        categoryPlot25.setRangeAxis(valueAxis40);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor42 = categoryPlot25.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor42);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(categoryAnchor42);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.awt.Paint paint5 = categoryPlot0.getNoDataMessagePaint();
        java.awt.Paint paint6 = categoryPlot0.getDomainGridlinePaint();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.PlotOrientation plotOrientation8 = categoryPlot0.getOrientation();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plotOrientation8);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxis();
        java.awt.Image image15 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot0.setRangeAxis((int) (byte) 10, valueAxis17, false);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.Plot plot5 = categoryPlot0.getRootPlot();
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(legendItemCollection8);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        boolean boolean10 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisSpace axisSpace11 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace13);
        java.util.List list15 = categoryPlot0.getCategories();
        org.jfree.chart.plot.Plot plot16 = categoryPlot0.getParent();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertNull(plot16);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getWeight();
        org.jfree.data.general.DatasetGroup datasetGroup2 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot3.setInsets(rectangleInsets4);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot3.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup8 = categoryPlot3.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        categoryPlot9.markerChanged(markerChangeEvent10);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray13 = new org.jfree.chart.axis.ValueAxis[] { valueAxis12 };
        categoryPlot9.setRangeAxes(valueAxisArray13);
        categoryPlot9.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean18 = categoryPlot9.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot9.getDomainAxisLocation();
        categoryPlot3.setRangeAxisLocation(axisLocation19, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        categoryPlot22.markerChanged(markerChangeEvent23);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray26 = new org.jfree.chart.axis.ValueAxis[] { valueAxis25 };
        categoryPlot22.setRangeAxes(valueAxisArray26);
        categoryPlot22.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot22.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.PlotOrientation plotOrientation34 = categoryPlot22.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation19, plotOrientation34);
        categoryPlot0.setOrientation(plotOrientation34);
        org.jfree.chart.plot.Marker marker38 = null;
        org.jfree.chart.util.Layer layer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(101, marker38, layer39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(valueAxisArray13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(valueAxisArray26);
        org.junit.Assert.assertNotNull(plotOrientation34);
        org.junit.Assert.assertNotNull(rectangleEdge35);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        int int11 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.mapDatasetToDomainAxis((int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.Plot plot18 = categoryPlot0.getRootPlot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        categoryPlot0.removeChangeListener(plotChangeListener19);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.data.Range range23 = categoryPlot0.getDataRange(valueAxis22);
        float float24 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.Marker marker26 = null;
        org.jfree.chart.util.Layer layer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 100, marker26, layer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(range23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        boolean boolean7 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomRangeAxes((double) 1, 0.0d, plotRenderingInfo17, point2D18);
        java.awt.Stroke stroke20 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.data.Range range22 = categoryPlot0.getDataRange(valueAxis21);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(range22);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot0.setDataset(10, categoryDataset22);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot0.setRangeAxis((int) '4', valueAxis25, true);
        categoryPlot0.setBackgroundImageAlpha((float) 1);
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot0.getDomainAxisLocation();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent31 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent31);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(axisLocation30);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis((int) '#', valueAxis7, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) 15, plotRenderingInfo11, point2D12);
        float float14 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot0.getOrientation();
        java.awt.Paint paint13 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis(10);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(axisSpace11);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(categoryAxis15);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (short) 100);
        categoryPlot0.setRangeCrosshairValue((double) ' ', false);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.data.category.CategoryDataset categoryDataset6 = categoryPlot0.getDataset((int) '#');
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getRangeAxisEdge((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) '#', (double) 15, plotRenderingInfo12, point2D13);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNull(axisSpace7);
        org.junit.Assert.assertNotNull(rectangleEdge9);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.String str5 = categoryPlot0.getPlotType();
        boolean boolean6 = categoryPlot0.isSubplot();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot7.getDomainAxisEdge((int) '4');
        categoryPlot7.setAnchorValue((double) (short) 1);
        categoryPlot7.clearRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot15.setInsets(rectangleInsets16);
        java.awt.Stroke stroke18 = categoryPlot15.getRangeGridlineStroke();
        categoryPlot7.setRangeCrosshairStroke(stroke18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = categoryPlot7.getAxisOffset();
        categoryPlot0.setInsets(rectangleInsets20, true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Category Plot" + "'", str5, "Category Plot");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = categoryPlot0.getDomainAxisForDataset((int) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        categoryPlot0.setDataset(categoryDataset4);
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertNull(categoryAxis3);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        java.lang.String str16 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot0.zoomRangeAxes((double) 10.0f, plotRenderingInfo18, point2D19);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot21.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        int int24 = categoryPlot21.getDomainAxisIndex(categoryAxis23);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        categoryPlot21.setDomainAxis((int) (short) 100, categoryAxis26, false);
        java.awt.Image image29 = null;
        categoryPlot21.setBackgroundImage(image29);
        categoryPlot21.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection34 = null;
        categoryPlot21.setFixedLegendItems(legendItemCollection34);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = categoryPlot21.getRendererForDataset(categoryDataset36);
        boolean boolean38 = categoryPlot21.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection39 = categoryPlot21.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection39);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(categoryItemRenderer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(legendItemCollection39);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomDomainAxes((double) 0L, (-1.0d), plotRenderingInfo17, point2D18);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        java.util.List list21 = categoryPlot0.getCategoriesForAxis(categoryAxis20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        int int23 = categoryPlot0.getIndexOf(categoryItemRenderer22);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation9 = categoryPlot0.getOrientation();
        java.awt.Paint paint10 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot12.markerChanged(markerChangeEvent13);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray20 = new org.jfree.chart.axis.ValueAxis[] { valueAxis19 };
        categoryPlot16.setRangeAxes(valueAxisArray20);
        categoryPlot16.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean25 = categoryPlot16.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot16.getDomainAxisLocation();
        categoryPlot12.setDomainAxisLocation((int) (byte) 1, axisLocation26, false);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray29 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot12.setDomainAxes(categoryAxisArray29);
        categoryPlot0.setDomainAxes(categoryAxisArray29);
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        categoryPlot0.removeChangeListener(plotChangeListener32);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNotNull(plotOrientation9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(valueAxisArray20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNotNull(categoryAxisArray29);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis((int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        categoryPlot0.setDataset(categoryDataset13);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        categoryPlot0.axisChanged(axisChangeEvent15);
        java.awt.Stroke stroke17 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, (int) (byte) 10, plotRenderingInfo20);
        java.awt.Image image22 = null;
        categoryPlot0.setBackgroundImage(image22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomDomainAxes(0.0d, (double) (-1L), plotRenderingInfo26, point2D27);
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.clearDomainMarkers(0);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        int int13 = categoryPlot0.getWeight();
        float float14 = categoryPlot0.getBackgroundImageAlpha();
        java.awt.Stroke stroke15 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxisForDataset((int) ' ');
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot0.setRangeAxis(0, valueAxis19);
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        categoryPlot0.removeChangeListener(plotChangeListener21);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Point2D point2D18 = null;
        org.jfree.chart.plot.PlotState plotState19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.draw(graphics2D16, rectangle2D17, point2D18, plotState19, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        int int15 = categoryPlot0.getWeight();
        java.awt.Paint paint16 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = categoryPlot0.getDataset((int) (short) -1);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNull(categoryDataset17);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace6);
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        int int13 = categoryPlot0.getWeight();
        float float14 = categoryPlot0.getBackgroundImageAlpha();
        categoryPlot0.setAnchorValue((double) 1L);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.data.Range range18 = categoryPlot0.getDataRange(valueAxis17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = categoryPlot0.getFixedRangeAxisSpace();
        categoryPlot0.clearDomainMarkers();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNull(axisSpace19);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis((int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        categoryPlot0.setDataset(categoryDataset13);
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis12);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge1 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        int int4 = categoryPlot0.getIndexOf(categoryItemRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis6 = categoryPlot0.getRangeAxis(0);
        org.junit.Assert.assertNotNull(rectangleEdge1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(valueAxis6);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) ' ');
        boolean boolean13 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        categoryPlot0.axisChanged(axisChangeEvent16);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRenderer((-1));
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNull(categoryItemRenderer19);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.awt.Paint paint5 = categoryPlot0.getNoDataMessagePaint();
        java.awt.Paint paint6 = categoryPlot0.getDomainGridlinePaint();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D8, rectangle2D9, 15, plotRenderingInfo11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot13.getRenderer((int) '4');
        java.util.List list16 = categoryPlot13.getAnnotations();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot13.getRenderer((int) (short) 10);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(categoryItemRenderer18);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = null;
        categoryPlot7.setFixedLegendItems(legendItemCollection10);
        java.awt.Paint paint12 = categoryPlot7.getNoDataMessagePaint();
        categoryPlot6.setBackgroundPaint(paint12);
        categoryPlot0.setRangeCrosshairPaint(paint12);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers(10, layer16);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor18 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.Marker marker19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(categoryAnchor18);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot0.getRangeAxisEdge();
        double double19 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = categoryPlot1.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = null;
        int int4 = categoryPlot1.getDomainAxisIndex(categoryAxis3);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot1.setDomainAxis((int) (short) 100, categoryAxis6, false);
        java.awt.Image image9 = null;
        categoryPlot1.setBackgroundImage(image9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot12.setInsets(rectangleInsets13);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = null;
        categoryPlot12.setFixedLegendItems(legendItemCollection15);
        java.awt.Paint paint17 = categoryPlot12.getNoDataMessagePaint();
        categoryPlot11.setBackgroundPaint(paint17);
        categoryPlot1.setBackgroundPaint(paint17);
        categoryPlot1.setDrawSharedDomainAxis(false);
        categoryPlot1.mapDatasetToDomainAxis((int) '4', (int) '4');
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = categoryPlot1.getOrientation();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge26 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(plotOrientation25);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent17);
        boolean boolean19 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean20 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent21 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent21);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        categoryPlot0.setRangeCrosshairValue((double) 100.0f, true);
        java.awt.Paint paint15 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot16.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot16.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot16.setDomainAxis((int) (short) 100, categoryAxis21, false);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot16.getRangeMarkers(layer24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot16.setRenderer(categoryItemRenderer26, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        categoryPlot29.markerChanged(markerChangeEvent30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot29.getDomainAxisEdge((int) '4');
        categoryPlot29.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        categoryPlot29.setRenderer(categoryItemRenderer36);
        java.awt.Paint paint38 = categoryPlot29.getRangeCrosshairPaint();
        categoryPlot16.setRangeCrosshairPaint(paint38);
        categoryPlot0.setOutlinePaint(paint38);
        boolean boolean41 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation43 = categoryPlot0.getDomainAxisLocation((int) (byte) 0);
        java.awt.Paint paint44 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.axis.AxisLocation axisLocation45 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation(axisLocation45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray21 = new org.jfree.chart.axis.ValueAxis[] { valueAxis20 };
        categoryPlot17.setRangeAxes(valueAxisArray21);
        categoryPlot17.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot17.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot17.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot17.getRangeAxisLocation((int) '#');
        categoryPlot17.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder35 = categoryPlot17.getDatasetRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        categoryPlot17.setRangeAxis(10, valueAxis37);
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot39.setInsets(rectangleInsets40);
        org.jfree.chart.axis.AxisLocation axisLocation43 = categoryPlot39.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup44 = categoryPlot39.getDatasetGroup();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = categoryPlot39.getInsets();
        categoryPlot17.setInsets(rectangleInsets45, true);
        categoryPlot0.setAxisOffset(rectangleInsets45);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(valueAxisArray21);
        org.junit.Assert.assertNotNull(axisLocation32);
        org.junit.Assert.assertNotNull(datasetRenderingOrder35);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertNull(datasetGroup44);
        org.junit.Assert.assertNotNull(rectangleInsets45);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot8.setInsets(rectangleInsets9);
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot8.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup13 = categoryPlot8.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot14.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor17 = categoryPlot14.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot14.getRendererForDataset(categoryDataset18);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot14.getRangeAxisLocation(100);
        categoryPlot8.setDomainAxisLocation(axisLocation21);
        categoryPlot0.setDomainAxisLocation(axisLocation21);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        categoryPlot0.setRenderer((int) (byte) 0, categoryItemRenderer25, true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNotNull(axisLocation21);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        categoryPlot0.mapDatasetToRangeAxis(0, 0);
        categoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 100);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        categoryPlot0.setRangeAxis(10, valueAxis13, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot0.setRenderer(categoryItemRenderer16);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot14.getDomainAxisEdge((int) '4');
        categoryPlot14.setAnchorValue((double) (short) 1);
        double double21 = categoryPlot14.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot22 = categoryPlot14.getRootPlot();
        double double23 = categoryPlot14.getRangeCrosshairValue();
        int int24 = categoryPlot14.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot14.getRangeAxisLocation((int) ' ');
        java.awt.Paint paint27 = categoryPlot14.getOutlinePaint();
        categoryPlot14.setWeight((int) (short) -1);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot14.getDomainAxisLocation(10);
        categoryPlot0.setDomainAxisLocation(axisLocation31);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint13 = categoryPlot12.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint13);
        categoryPlot0.setBackgroundImageAlpha(0.5f);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        categoryPlot17.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot17.setRenderer(categoryItemRenderer24);
        java.awt.Stroke stroke26 = categoryPlot17.getDomainGridlineStroke();
        categoryPlot0.setOutlineStroke(stroke26);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleEdge28);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        double double14 = categoryPlot5.getRangeCrosshairValue();
        int int15 = categoryPlot5.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot5.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        categoryPlot0.setBackgroundAlpha((float) 15);
        boolean boolean21 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        java.awt.Stroke stroke10 = categoryPlot7.getRangeGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot12.markerChanged(markerChangeEvent13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot12.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo17, point2D18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot12.getRenderer();
        categoryPlot12.setBackgroundAlpha(0.0f);
        boolean boolean23 = categoryPlot12.isRangeGridlinesVisible();
        java.awt.Paint paint24 = categoryPlot12.getRangeGridlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint24);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) ' ');
        java.awt.Paint paint13 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation((int) (short) 0);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent16 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent16);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.clearDomainAxes();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Paint paint4 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Stroke stroke9 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getDomainAxisEdge((int) (byte) 10);
        org.jfree.chart.plot.CategoryMarker categoryMarker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge11);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray5 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot0.setRenderers(categoryItemRendererArray5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getRangeAxisLocation();
        java.lang.String str8 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(categoryItemRendererArray5);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray14 = new org.jfree.chart.axis.ValueAxis[] { valueAxis13 };
        categoryPlot10.setRangeAxes(valueAxisArray14);
        categoryPlot0.setRangeAxes(valueAxisArray14);
        java.lang.Object obj17 = categoryPlot0.clone();
        categoryPlot0.setAnchorValue((double) '#', true);
        boolean boolean21 = categoryPlot0.isRangeGridlinesVisible();
        categoryPlot0.setForegroundAlpha((float) (short) 10);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        float float5 = categoryPlot0.getForegroundAlpha();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge((int) (byte) -1);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge9);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray14 = new org.jfree.chart.axis.ValueAxis[] { valueAxis13 };
        categoryPlot10.setRangeAxes(valueAxisArray14);
        categoryPlot0.setRangeAxes(valueAxisArray14);
        double double17 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot0.setRangeAxis((int) 'a', valueAxis19, false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot0.markerChanged(markerChangeEvent16);
        org.jfree.chart.plot.Marker marker18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot0.getDomainMarkers(layer21);
        float float23 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        categoryPlot0.mapDatasetToDomainAxis((int) '4', (int) '4');
        categoryPlot0.setRangeCrosshairVisible(false);
        categoryPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot0.setDomainAxis((int) '4', categoryAxis9);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset(1, categoryDataset12);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot0.setDomainAxis(categoryAxis14);
        categoryPlot0.clearDomainMarkers((int) (byte) 0);
        categoryPlot0.setRangeCrosshairValue((double) 1, false);
        java.awt.Paint paint21 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis((int) (byte) 1);
        int int13 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 101 + "'", int13 == 101);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis(valueAxis8);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        boolean boolean18 = categoryPlot0.isDomainZoomable();
        categoryPlot0.clearAnnotations();
        java.awt.Paint paint20 = categoryPlot0.getOutlinePaint();
        org.jfree.data.general.DatasetGroup datasetGroup21 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(datasetGroup21);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot15.setRangeAxes(valueAxisArray19);
        categoryPlot15.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean24 = categoryPlot15.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot15.getDomainAxisLocation();
        categoryPlot11.setDomainAxisLocation((int) (byte) 1, axisLocation25, false);
        categoryPlot0.setDomainAxisLocation((int) 'a', axisLocation25);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder30 = categoryPlot0.getColumnRenderingOrder();
        java.lang.Class<?> wildcardClass31 = categoryPlot0.getClass();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(sortOrder30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        java.awt.Stroke stroke10 = categoryPlot7.getRangeGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke10);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot0.getRangeAxis();
        categoryPlot0.clearDomainMarkers((int) ' ');
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot16.setInsets(rectangleInsets17);
        org.jfree.chart.LegendItemCollection legendItemCollection19 = null;
        categoryPlot16.setFixedLegendItems(legendItemCollection19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        categoryPlot16.zoomDomainAxes((double) ' ', (double) (short) 10, plotRenderingInfo23, point2D24);
        categoryPlot16.clearAnnotations();
        categoryPlot16.setRangeCrosshairVisible(true);
        categoryPlot16.setBackgroundAlpha((float) 'a');
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        categoryPlot31.markerChanged(markerChangeEvent32);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot31.getDomainAxisEdge((int) '4');
        categoryPlot31.setAnchorValue((double) (short) 1);
        categoryPlot31.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        java.awt.geom.Point2D point2D42 = null;
        categoryPlot31.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo41, point2D42);
        org.jfree.chart.axis.AxisSpace axisSpace44 = categoryPlot31.getFixedDomainAxisSpace();
        categoryPlot31.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation47 = categoryPlot31.getRangeAxisLocation((int) (byte) -1);
        categoryPlot16.setDomainAxisLocation(axisLocation47, false);
        boolean boolean50 = categoryPlot16.isRangeGridlinesVisible();
        org.jfree.chart.util.SortOrder sortOrder51 = categoryPlot16.getColumnRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder51);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertNull(axisSpace44);
        org.junit.Assert.assertNotNull(axisLocation47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(sortOrder51);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation((int) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot0.setRenderer(categoryItemRenderer16);
        boolean boolean18 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(drawingSupplier19);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer11);
        categoryPlot0.clearRangeMarkers(0);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers((int) (short) 1, layer16);
        categoryPlot0.setForegroundAlpha(1.0f);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = categoryPlot0.getDomainAxisForDataset((int) (short) 100);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNull(categoryAxis21);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot10.getRangeMarkers(layer19);
        categoryPlot10.mapDatasetToRangeAxis((int) (short) 0, 101);
        boolean boolean24 = categoryPlot10.isOutlineVisible();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        categoryPlot0.mapDatasetToDomainAxis((int) '4', (int) '4');
        org.jfree.chart.axis.ValueAxis[] valueAxisArray24 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray24);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(valueAxisArray24);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset5 = categoryPlot0.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxis((int) (short) -1, categoryAxis7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(categoryDataset5);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = null;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) '#', layer2);
        java.awt.Stroke stroke4 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot5.setRenderer(categoryItemRenderer12);
        java.awt.Paint paint14 = categoryPlot5.getRangeCrosshairPaint();
        categoryPlot0.setNoDataMessagePaint(paint14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot16.setInsets(rectangleInsets17);
        org.jfree.chart.LegendItemCollection legendItemCollection19 = null;
        categoryPlot16.setFixedLegendItems(legendItemCollection19);
        java.lang.Object obj21 = categoryPlot16.clone();
        categoryPlot16.setDrawSharedDomainAxis(true);
        java.awt.Paint paint24 = categoryPlot16.getDomainGridlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint24);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot0.getRangeMarkers(layer26);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        categoryPlot28.markerChanged(markerChangeEvent29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray32 = new org.jfree.chart.axis.ValueAxis[] { valueAxis31 };
        categoryPlot28.setRangeAxes(valueAxisArray32);
        categoryPlot28.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot28.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot28.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation43 = categoryPlot28.getRangeAxisLocation((int) '#');
        categoryPlot28.setWeight((int) (byte) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier46 = categoryPlot28.getDrawingSupplier();
        java.awt.Stroke stroke47 = categoryPlot28.getDomainGridlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke47);
        java.awt.Image image49 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(valueAxisArray32);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertNotNull(drawingSupplier46);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNull(image49);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) ' ', (double) (short) 10, plotRenderingInfo7, point2D8);
        categoryPlot0.clearAnnotations();
        categoryPlot0.setRangeCrosshairVisible(true);
        categoryPlot0.configureDomainAxes();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, categoryItemRenderer17);
        categoryPlot18.clearRangeMarkers();
        java.awt.Paint paint20 = categoryPlot18.getOutlinePaint();
        categoryPlot0.setRangeGridlinePaint(paint20);
        categoryPlot0.setWeight(1);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot0.getDomainAxisForDataset((int) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(categoryAxis11);
        org.junit.Assert.assertNull(categoryItemRenderer12);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent8 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent8);
        int int10 = categoryPlot0.getDatasetCount();
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        categoryPlot13.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = categoryPlot13.getOrientation();
        categoryPlot0.setOrientation(plotOrientation19);
        categoryPlot0.setBackgroundAlpha((float) (short) -1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(plotOrientation19);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        java.awt.Paint paint17 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot0.getDomainAxisLocation((int) 'a');
        categoryPlot0.setAnchorValue(1.0d, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        categoryPlot0.zoomRangeAxes((double) 1L, plotRenderingInfo24, point2D25);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setNoDataMessage("hi!");
        categoryPlot0.clearRangeAxes();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        boolean boolean13 = categoryPlot0.render(graphics2D9, rectangle2D10, (int) (byte) 100, plotRenderingInfo12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot14.getDomainAxisEdge((int) '4');
        float float19 = categoryPlot14.getForegroundAlpha();
        categoryPlot14.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot14.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        categoryPlot27.markerChanged(markerChangeEvent28);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray31 = new org.jfree.chart.axis.ValueAxis[] { valueAxis30 };
        categoryPlot27.setRangeAxes(valueAxisArray31);
        categoryPlot27.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean36 = categoryPlot27.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot27.getDomainAxisLocation();
        categoryPlot23.setDomainAxisLocation((int) (byte) 1, axisLocation37, false);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray40 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot23.setDomainAxes(categoryAxisArray40);
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot23.getDomainAxisLocation();
        categoryPlot14.setDomainAxisLocation(axisLocation42, false);
        categoryPlot0.setRangeAxisLocation(axisLocation42);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        java.awt.geom.Point2D point2D49 = null;
        categoryPlot0.zoomRangeAxes(0.0d, (double) 100L, plotRenderingInfo48, point2D49);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(valueAxisArray31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertNotNull(categoryAxisArray40);
        org.junit.Assert.assertNotNull(axisLocation42);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        categoryPlot0.clearRangeMarkers(100);
        boolean boolean12 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.Plot plot13 = null;
        categoryPlot0.setParent(plot13);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder6 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        java.util.List list8 = categoryPlot0.getCategoriesForAxis(categoryAxis7);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertNotNull(datasetRenderingOrder6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot0.getOrientation();
        categoryPlot0.setRangeCrosshairVisible(false);
        double double15 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((int) (short) -1, valueAxis17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.Plot plot18 = categoryPlot0.getRootPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        categoryPlot0.setDomainAxis((int) (short) 1, categoryAxis20);
        org.jfree.chart.plot.CategoryMarker categoryMarker22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot10.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation15, true);
        org.jfree.chart.plot.CategoryMarker categoryMarker18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getDomainMarkers(layer16);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(collection17);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor13 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean14 = categoryPlot0.isDomainZoomable();
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot0.getRangeMarkers((int) (byte) 1, layer17);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(collection18);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis13, true);
        int int16 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = categoryPlot0.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRendererForDataset(categoryDataset18);
        categoryPlot0.setAnchorValue(100.0d);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.data.Range range23 = categoryPlot0.getDataRange(valueAxis22);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNull(range23);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        double double14 = categoryPlot5.getRangeCrosshairValue();
        int int15 = categoryPlot5.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot5.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        categoryPlot0.notifyListeners(plotChangeEvent19);
        java.awt.Stroke stroke21 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setNoDataMessage("Category Plot");
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot0.getRenderer((int) (short) 1);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(categoryItemRenderer9);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot0.markerChanged(markerChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot0.getInsets();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        categoryPlot0.removeChangeListener(plotChangeListener16);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot0.setDomainAxis(categoryAxis18);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent20 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent20);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        categoryPlot0.clearAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(100, categoryDataset9);
        org.jfree.chart.plot.Plot plot11 = categoryPlot0.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        categoryPlot0.notifyListeners(plotChangeEvent12);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getRangeAxisEdge(0);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot0.getDomainAxisForDataset((int) (short) 0);
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertNull(axisSpace18);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), plotRenderingInfo21, point2D22);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge(0);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        categoryPlot0.setAnchorValue((double) 10.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray15 = new org.jfree.chart.axis.ValueAxis[] { valueAxis14 };
        categoryPlot11.setRangeAxes(valueAxisArray15);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot11.setDomainGridlinePaint(paint17);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot19.getRangeAxisLocation();
        java.awt.Stroke stroke25 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot19.setRangeCrosshairStroke(stroke25);
        categoryPlot11.setRangeCrosshairStroke(stroke25);
        categoryPlot0.setRangeCrosshairStroke(stroke25);
        categoryPlot0.setRangeCrosshairValue((double) (byte) 100);
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(valueAxisArray15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(categoryAxis31);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        boolean boolean10 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisSpace axisSpace11 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace11);
        categoryPlot0.setRangeCrosshairValue((double) '#', true);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot16.getDomainAxisEdge((int) '4');
        float float21 = categoryPlot16.getForegroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis23 = categoryPlot16.getRangeAxis((int) '4');
        boolean boolean24 = categoryPlot0.equals((java.lang.Object) valueAxis23);
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = categoryPlot0.getOrientation();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(plotOrientation25);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot0.setDataset(10, categoryDataset22);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        categoryPlot0.setRangeAxis(valueAxis24);
        boolean boolean26 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer11);
        categoryPlot0.clearRangeMarkers(0);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers((int) (short) 1, layer16);
        categoryPlot0.clearRangeMarkers((int) ' ');
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(drawingSupplier20);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        float float12 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 0, 15);
        java.awt.Image image10 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(15, valueAxis9, true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        double double14 = categoryPlot5.getRangeCrosshairValue();
        int int15 = categoryPlot5.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot5.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        categoryPlot0.notifyListeners(plotChangeEvent19);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot0.setRangeAxis(valueAxis21);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation17);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.addChangeListener(plotChangeListener12);
        categoryPlot0.clearRangeMarkers((int) (short) 10);
        categoryPlot0.mapDatasetToDomainAxis(101, (int) '4');
        org.junit.Assert.assertNotNull(valueAxisArray4);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        java.awt.Image image8 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis10);
        org.jfree.chart.plot.Plot plot12 = categoryPlot0.getParent();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder13 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot14.getDomainAxisEdge((int) '4');
        categoryPlot14.setAnchorValue((double) (short) 1);
        categoryPlot14.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        categoryPlot14.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo24, point2D25);
        int int27 = categoryPlot14.getDatasetCount();
        double double28 = categoryPlot14.getAnchorValue();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        categoryPlot14.setRangeAxis(valueAxis29);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor31 = categoryPlot14.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor31);
        boolean boolean33 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(categoryAnchor31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis((int) '4');
        org.jfree.chart.plot.Marker marker8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(valueAxis7);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot12.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot12.getDomainAxisIndex(categoryAxis14);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot12.setDomainAxis((int) (short) 100, categoryAxis17, false);
        java.awt.Image image20 = null;
        categoryPlot12.setBackgroundImage(image20);
        float float22 = categoryPlot12.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot23.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo28, point2D29);
        categoryPlot23.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        categoryPlot33.markerChanged(markerChangeEvent34);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = categoryPlot33.getDomainAxisEdge((int) '4');
        categoryPlot33.setAnchorValue((double) (short) 1);
        double double40 = categoryPlot33.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot41 = categoryPlot33.getRootPlot();
        double double42 = categoryPlot33.getRangeCrosshairValue();
        categoryPlot23.setParent((org.jfree.chart.plot.Plot) categoryPlot33);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = categoryPlot23.getInsets();
        categoryPlot12.setAxisOffset(rectangleInsets44);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot12);
        org.jfree.chart.axis.AxisSpace axisSpace47 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace47);
        categoryPlot0.setNoDataMessage("");
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis52 = categoryPlot51.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis53 = null;
        int int54 = categoryPlot51.getDomainAxisIndex(categoryAxis53);
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = null;
        categoryPlot51.setDomainAxis((int) (short) 100, categoryAxis56, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer59 = null;
        int int60 = categoryPlot51.getIndexOf(categoryItemRenderer59);
        org.jfree.chart.axis.CategoryAxis categoryAxis61 = null;
        categoryPlot51.setDomainAxis(categoryAxis61);
        categoryPlot51.setWeight(15);
        org.jfree.chart.util.RectangleInsets rectangleInsets65 = categoryPlot51.getAxisOffset();
        categoryPlot0.setAxisOffset(rectangleInsets65);
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = categoryPlot0.getInsets();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNull(categoryAxis52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets65);
        org.junit.Assert.assertNotNull(rectangleInsets67);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset();
        java.awt.Stroke stroke11 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset(categoryDataset12);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset((int) '#', categoryDataset9);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = categoryPlot0.getLegendItems();
        categoryPlot0.setAnchorValue(0.0d, false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(legendItemCollection11);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot1.setInsets(rectangleInsets2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = null;
        categoryPlot1.setFixedLegendItems(legendItemCollection4);
        java.awt.Paint paint6 = categoryPlot1.getNoDataMessagePaint();
        categoryPlot0.setBackgroundPaint(paint6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot0.getRenderer((int) (short) 100);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        boolean boolean16 = categoryPlot0.render(graphics2D12, rectangle2D13, (int) ' ', plotRenderingInfo15);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sortOrder8);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        int int13 = categoryPlot0.getWeight();
        java.awt.Font font14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = categoryPlot0.getDataset((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        int int21 = categoryPlot18.getDomainAxisIndex(categoryAxis20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot18.setDomainAxis((int) (short) 100, categoryAxis23, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        int int27 = categoryPlot18.getIndexOf(categoryItemRenderer26);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        categoryPlot18.drawBackgroundImage(graphics2D28, rectangle2D29);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        categoryPlot31.markerChanged(markerChangeEvent32);
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray35 = new org.jfree.chart.axis.ValueAxis[] { valueAxis34 };
        categoryPlot31.setRangeAxes(valueAxisArray35);
        categoryPlot31.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot31.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot31.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation46 = categoryPlot31.getRangeAxisLocation((int) '#');
        categoryPlot31.setWeight((int) (byte) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier49 = categoryPlot31.getDrawingSupplier();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder50 = categoryPlot31.getDatasetRenderingOrder();
        categoryPlot18.setDatasetRenderingOrder(datasetRenderingOrder50);
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder50);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(valueAxisArray35);
        org.junit.Assert.assertNotNull(axisLocation46);
        org.junit.Assert.assertNotNull(drawingSupplier49);
        org.junit.Assert.assertNotNull(datasetRenderingOrder50);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot6.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot6.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot6.setDomainAxis((int) (short) 100, categoryAxis11, false);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot6.getRangeMarkers(layer14);
        categoryPlot6.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot6.getDomainAxisIndex(categoryAxis18);
        categoryPlot6.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis23 = categoryPlot6.getRangeAxis();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot6);
        categoryPlot6.setBackgroundImageAlpha((float) (short) 0);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        categoryPlot6.markerChanged(markerChangeEvent27);
        org.jfree.data.category.CategoryDataset categoryDataset30 = categoryPlot6.getDataset((int) '4');
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNull(categoryDataset30);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.AxisSpace axisSpace11 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace13);
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot0.getDomainAxisEdge((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = categoryPlot17.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        int int20 = categoryPlot17.getDomainAxisIndex(categoryAxis19);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        categoryPlot17.setDomainAxis((int) (short) 100, categoryAxis22, false);
        java.awt.Image image25 = null;
        categoryPlot17.setBackgroundImage(image25);
        categoryPlot17.mapDatasetToDomainAxis((int) '#', 1);
        int int30 = categoryPlot17.getWeight();
        java.awt.Font font31 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot17.setNoDataMessageFont(font31);
        categoryPlot0.setNoDataMessageFont(font31);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(axisSpace11);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertNull(categoryAxis18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(font31);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        categoryPlot4.markerChanged(markerChangeEvent5);
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray8 = new org.jfree.chart.axis.ValueAxis[] { valueAxis7 };
        categoryPlot4.setRangeAxes(valueAxisArray8);
        categoryPlot4.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean13 = categoryPlot4.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot4.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (byte) 1, axisLocation14, false);
        java.awt.Paint paint17 = categoryPlot0.getOutlinePaint();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        boolean boolean22 = categoryPlot0.render(graphics2D18, rectangle2D19, 0, plotRenderingInfo21);
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNotNull(valueAxisArray8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = categoryPlot0.getRendererForDataset(categoryDataset4);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 1, (int) (short) -1);
        int int9 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer11, false);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 10, (int) 'a');
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation9 = categoryPlot0.getOrientation();
        java.awt.Paint paint10 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        org.jfree.chart.util.Layer layer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker11, layer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNotNull(plotOrientation9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        float float10 = categoryPlot0.getBackgroundAlpha();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis((int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        categoryPlot0.setDataset(categoryDataset13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        categoryPlot0.notifyListeners(plotChangeEvent15);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis12);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot8.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        int int11 = categoryPlot8.getDomainAxisIndex(categoryAxis10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot8.setDomainAxis((int) (short) 100, categoryAxis13, false);
        java.awt.Image image16 = null;
        categoryPlot8.setBackgroundImage(image16);
        categoryPlot8.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = null;
        categoryPlot8.setFixedLegendItems(legendItemCollection21);
        java.awt.Paint paint23 = categoryPlot8.getDomainGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        categoryPlot8.setDomainAxis(100, categoryAxis25, true);
        boolean boolean28 = categoryPlot8.isRangeCrosshairLockedOnData();
        categoryPlot8.setRangeCrosshairValue(0.0d, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = categoryPlot8.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier32);
        categoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(drawingSupplier32);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot27 = categoryPlot19.getRootPlot();
        double double28 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot19.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        categoryPlot19.setDomainAxis(10, categoryAxis31, false);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent35 = null;
        categoryPlot19.axisChanged(axisChangeEvent35);
        int int37 = categoryPlot19.getRangeAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis39 = categoryPlot19.getRangeAxisForDataset((int) '#');
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(valueAxis39);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup5 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray10 = new org.jfree.chart.axis.ValueAxis[] { valueAxis9 };
        categoryPlot6.setRangeAxes(valueAxisArray10);
        categoryPlot6.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean15 = categoryPlot6.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot6.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation16, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = categoryPlot0.getInsets();
        org.jfree.chart.plot.Marker marker21 = null;
        org.jfree.chart.util.Layer layer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(0, marker21, layer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(valueAxisArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot5.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation10, false);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot0.markerChanged(markerChangeEvent14);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] { valueAxis17 };
        categoryPlot14.setRangeAxes(valueAxisArray18);
        java.awt.Paint paint20 = categoryPlot14.getNoDataMessagePaint();
        categoryPlot0.setRangeCrosshairPaint(paint20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot0.setRenderer(categoryItemRenderer22);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        categoryPlot0.removeChangeListener(plotChangeListener24);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        boolean boolean9 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.plot.CategoryMarker categoryMarker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) (byte) 0, categoryMarker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot0.getRangeMarkers(10, layer17);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot27 = categoryPlot19.getRootPlot();
        double double28 = categoryPlot19.getRangeCrosshairValue();
        int int29 = categoryPlot19.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot30.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        int int33 = categoryPlot30.getDomainAxisIndex(categoryAxis32);
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        categoryPlot30.setDomainAxis((int) (short) 100, categoryAxis35, false);
        org.jfree.chart.util.Layer layer38 = null;
        java.util.Collection collection39 = categoryPlot30.getRangeMarkers(layer38);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        categoryPlot30.setRenderer(categoryItemRenderer40, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        categoryPlot43.markerChanged(markerChangeEvent44);
        org.jfree.chart.util.RectangleEdge rectangleEdge47 = categoryPlot43.getDomainAxisEdge((int) '4');
        categoryPlot43.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer50 = null;
        categoryPlot43.setRenderer(categoryItemRenderer50);
        java.awt.Paint paint52 = categoryPlot43.getRangeCrosshairPaint();
        categoryPlot30.setRangeCrosshairPaint(paint52);
        categoryPlot19.setRangeGridlinePaint(paint52);
        categoryPlot0.setNoDataMessagePaint(paint52);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent56 = null;
        categoryPlot0.notifyListeners(plotChangeEvent56);
        java.awt.Image image58 = null;
        categoryPlot0.setBackgroundImage(image58);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(categoryAxis31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(collection39);
        org.junit.Assert.assertNotNull(rectangleEdge47);
        org.junit.Assert.assertNotNull(paint52);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        java.lang.Object obj14 = categoryPlot0.clone();
        double double15 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.Plot plot18 = categoryPlot0.getRootPlot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        categoryPlot0.removeChangeListener(plotChangeListener19);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.data.Range range23 = categoryPlot0.getDataRange(valueAxis22);
        org.jfree.data.category.CategoryDataset categoryDataset25 = categoryPlot0.getDataset(15);
        categoryPlot0.clearRangeAxes();
        boolean boolean27 = categoryPlot0.isRangeCrosshairVisible();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(range23);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.clearAnnotations();
        java.awt.Paint paint11 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) 0.0f, plotRenderingInfo14, point2D15);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 0, (int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        java.util.List list21 = categoryPlot0.getCategoriesForAxis(categoryAxis20);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        java.awt.Stroke stroke10 = categoryPlot7.getRangeGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke10);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot0.getRangeAxis();
        categoryPlot0.clearDomainMarkers((int) ' ');
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(rectangleEdge16);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent17);
        boolean boolean19 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean20 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis23 = categoryPlot0.getRangeAxisForDataset(100);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNull(valueAxis23);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot1.setInsets(rectangleInsets2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = null;
        categoryPlot1.setFixedLegendItems(legendItemCollection4);
        java.awt.Paint paint6 = categoryPlot1.getNoDataMessagePaint();
        categoryPlot0.setBackgroundPaint(paint6);
        java.awt.Stroke stroke8 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot0.markerChanged(markerChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot0.getInsets();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        categoryPlot0.removeChangeListener(plotChangeListener16);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot0.setDomainAxis(categoryAxis18);
        boolean boolean20 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairValue((double) 10, false);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers((int) (short) -1, layer10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 100, plotRenderingInfo13, point2D14);
        categoryPlot0.setNoDataMessage("");
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Image image4 = null;
        categoryPlot0.setBackgroundImage(image4);
        boolean boolean6 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis(valueAxis7);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset5 = categoryPlot0.getDataset();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot0.markerChanged(markerChangeEvent6);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(categoryDataset5);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot27 = categoryPlot19.getRootPlot();
        double double28 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot19.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        categoryPlot19.setDomainAxis(10, categoryAxis31, false);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        categoryPlot0.mapDatasetToDomainAxis((int) 'a', (int) (byte) 10);
        org.jfree.chart.axis.AxisSpace axisSpace38 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertNull(axisSpace38);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(axisSpace13);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation9 = categoryPlot0.getOrientation();
        java.awt.Paint paint10 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = categoryPlot0.getInsets();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot0.setDomainAxis(categoryAxis12);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNotNull(plotOrientation9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean14 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) ' ', (double) (short) 10, plotRenderingInfo7, point2D8);
        categoryPlot0.clearAnnotations();
        categoryPlot0.setRangeCrosshairVisible(true);
        categoryPlot0.setBackgroundAlpha((float) 'a');
        categoryPlot0.setAnchorValue((double) (short) 100);
        java.awt.Paint paint17 = categoryPlot0.getNoDataMessagePaint();
        categoryPlot0.clearDomainMarkers((int) (short) -1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot0.zoomDomainAxes(0.0d, (double) 100, plotRenderingInfo22, point2D23);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Paint paint9 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge();
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        boolean boolean13 = categoryPlot0.getDrawSharedDomainAxis();
        int int14 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Paint paint15 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot0.getDomainAxisForDataset((int) (short) 1);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        categoryPlot0.mapDatasetToDomainAxis((int) ' ', (int) '4');
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        categoryPlot0.markerChanged(markerChangeEvent22);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Paint paint9 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge();
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        boolean boolean13 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = categoryPlot0.getLegendItems();
        double double15 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation((int) '#');
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder18 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        categoryPlot0.setRangeAxis(10, valueAxis20);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot22.setInsets(rectangleInsets23);
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot22.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup27 = categoryPlot22.getDatasetGroup();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = categoryPlot22.getInsets();
        categoryPlot0.setInsets(rectangleInsets28, true);
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(datasetRenderingOrder18);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        int int13 = categoryPlot0.getWeight();
        float float14 = categoryPlot0.getBackgroundImageAlpha();
        java.awt.Stroke stroke15 = categoryPlot0.getRangeCrosshairStroke();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        categoryPlot0.drawBackgroundImage(graphics2D16, rectangle2D17);
        double double19 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent17);
        boolean boolean19 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean20 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot0.getDomainAxis((-1));
        org.jfree.chart.plot.PlotOrientation plotOrientation23 = categoryPlot0.getOrientation();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertNotNull(plotOrientation23);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray5 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot0.setRenderers(categoryItemRendererArray5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(categoryItemRendererArray5);
        org.junit.Assert.assertNull(axisSpace7);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis13, true);
        int int16 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot0.getRangeAxisEdge((int) (short) -1);
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 0, (int) (short) 1);
        java.awt.Paint paint22 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        categoryPlot0.setDataset(categoryDataset23);
        org.jfree.chart.axis.ValueAxis valueAxis25 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(valueAxis25);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot0.getDatasetGroup();
        categoryPlot0.mapDatasetToRangeAxis(10, (int) '4');
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
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge1 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = categoryPlot2.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = null;
        int int5 = categoryPlot2.getDomainAxisIndex(categoryAxis4);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        categoryPlot2.setDomainAxis((int) (short) 100, categoryAxis7, false);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot2.getRangeMarkers(layer10);
        categoryPlot2.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot2.getDomainAxisIndex(categoryAxis14);
        boolean boolean16 = categoryPlot2.isOutlineVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder17 = categoryPlot2.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = categoryPlot0.getRangeAxis(15);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(rectangleEdge1);
        org.junit.Assert.assertNull(categoryAxis3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder17);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        int int21 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot0.setDomainAxis((int) (byte) 0, categoryAxis23, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = categoryPlot0.removeAnnotation(categoryAnnotation26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRendererForDataset(categoryDataset18);
        java.awt.Paint paint20 = categoryPlot0.getRangeCrosshairPaint();
        int int21 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((int) (byte) -1, valueAxis10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation9 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot10.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot10.getDomainAxisIndex(categoryAxis12);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        int int15 = categoryPlot10.getIndexOf(categoryItemRenderer14);
        org.jfree.chart.plot.Plot plot16 = categoryPlot10.getParent();
        java.awt.Font font17 = categoryPlot10.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font17);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 0, 101);
        boolean boolean22 = categoryPlot0.isRangeZoomable();
        double double23 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNotNull(plotOrientation9);
        org.junit.Assert.assertNull(categoryAxis11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot0.markerChanged(markerChangeEvent16);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        float float9 = categoryPlot0.getBackgroundAlpha();
        boolean boolean10 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray15 = new org.jfree.chart.axis.ValueAxis[] { valueAxis14 };
        categoryPlot11.setRangeAxes(valueAxisArray15);
        categoryPlot11.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        java.lang.String str20 = categoryPlot11.getNoDataMessage();
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot11.getRangeMarkers(layer21);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = categoryPlot23.getDomainAxisEdge((int) '4');
        categoryPlot23.setAnchorValue((double) (short) 1);
        categoryPlot23.setRangeCrosshairValue((double) (byte) -1, true);
        categoryPlot23.setWeight((int) (byte) -1);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = categoryPlot23.getInsets();
        categoryPlot11.setAxisOffset(rectangleInsets35);
        categoryPlot0.setInsets(rectangleInsets35, false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(valueAxisArray15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertNotNull(rectangleEdge27);
        org.junit.Assert.assertNotNull(rectangleInsets35);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot0.getRendererForDataset(categoryDataset16);
        java.lang.String str18 = categoryPlot0.getPlotType();
        boolean boolean19 = categoryPlot0.isOutlineVisible();
        java.lang.String str20 = categoryPlot0.getNoDataMessage();
        boolean boolean21 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Category Plot" + "'", str18, "Category Plot");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getWeight();
        java.util.List list2 = categoryPlot0.getCategories();
        categoryPlot0.clearRangeMarkers(1);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        categoryPlot0.setDomainAxis((int) (byte) 1, categoryAxis6, false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(list2);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        java.util.List list7 = categoryPlot0.getAnnotations();
        categoryPlot0.clearDomainMarkers(101);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getDomainMarkers((int) ' ', layer5);
        org.jfree.chart.plot.CategoryMarker categoryMarker7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(collection6);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot7.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot7.getRangeAxisEdge();
        categoryPlot7.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) (short) 100, categoryAxis18, false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot13.getRangeMarkers(layer21);
        categoryPlot13.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        int int26 = categoryPlot13.getDomainAxisIndex(categoryAxis25);
        categoryPlot13.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot13.getRangeAxis();
        categoryPlot7.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        double double33 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairValue((double) 10, false);
        org.jfree.chart.plot.CategoryMarker categoryMarker9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.clearAnnotations();
        java.awt.Paint paint11 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) 0.0f, plotRenderingInfo14, point2D15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, 0, plotRenderingInfo20);
        double double22 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setDomainGridlinesVisible(true);
        double double6 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        categoryPlot0.axisChanged(axisChangeEvent7);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis13, true);
        int int16 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot0.getRangeAxisEdge((int) (short) -1);
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 0, (int) (short) 1);
        java.awt.Paint paint22 = categoryPlot0.getDomainGridlinePaint();
        double double23 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers(layer16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        java.awt.geom.Point2D point2D21 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) 10, (double) 0, plotRenderingInfo20, point2D21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = categoryPlot0.getDataset((int) (byte) 100);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNull(categoryDataset24);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot0.setOutlinePaint(paint16);
        java.awt.Stroke stroke18 = categoryPlot0.getDomainGridlineStroke();
        int int19 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace20);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        categoryPlot0.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer14);
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot0.getRangeAxisLocation((int) (byte) 0);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot0.getDomainAxisLocation();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearRangeMarkers();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        categoryPlot4.drawBackgroundImage(graphics2D6, rectangle2D7);
        java.awt.Paint paint9 = categoryPlot4.getDomainGridlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = null;
        categoryPlot7.setFixedLegendItems(legendItemCollection10);
        java.awt.Paint paint12 = categoryPlot7.getNoDataMessagePaint();
        categoryPlot6.setBackgroundPaint(paint12);
        categoryPlot0.setRangeCrosshairPaint(paint12);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers(10, layer16);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor18 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.setBackgroundAlpha((float) (short) 100);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(categoryAnchor18);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot15.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation19, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot22.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        int int25 = categoryPlot22.getDomainAxisIndex(categoryAxis24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot22.setDomainAxis((int) (short) 100, categoryAxis27, false);
        org.jfree.chart.util.Layer layer30 = null;
        java.util.Collection collection31 = categoryPlot22.getRangeMarkers(layer30);
        categoryPlot22.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot22.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder34);
        org.jfree.chart.axis.AxisSpace axisSpace36 = categoryPlot0.getFixedRangeAxisSpace();
        java.awt.Paint paint37 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(collection31);
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertNull(axisSpace36);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.Plot plot5 = categoryPlot0.getRootPlot();
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedDomainAxisSpace();
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        java.awt.Paint paint8 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot0.getRenderer();
        categoryPlot0.setBackgroundAlpha(0.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomRangeAxes(100.0d, plotRenderingInfo12, point2D13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = categoryPlot0.getDatasetGroup();
        org.junit.Assert.assertNull(categoryItemRenderer8);
        org.junit.Assert.assertNull(datasetGroup15);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = categoryPlot0.getDomainAxis();
        boolean boolean4 = categoryPlot0.isRangeCrosshairLockedOnData();
        int int5 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(categoryAxis3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup5 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 1, marker7, layer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(datasetGroup5);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) 10.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot7.setRangeAxes(valueAxisArray11);
        categoryPlot7.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean16 = categoryPlot7.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot7.setDomainAxis((int) (short) 0, categoryAxis18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets20, true);
        categoryPlot0.setAxisOffset(rectangleInsets20);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        categoryPlot0.setDomainGridlinesVisible(false);
        java.awt.Stroke stroke9 = categoryPlot0.getDomainGridlineStroke();
        categoryPlot0.setOutlineVisible(true);
        java.awt.Paint paint12 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        categoryPlot0.notifyListeners(plotChangeEvent12);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot0.getDomainMarkers(layer14);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNull(collection15);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.awt.Paint paint5 = categoryPlot0.getNoDataMessagePaint();
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomRangeAxes((double) 10L, (double) '4', plotRenderingInfo9, point2D10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot6.setInsets(rectangleInsets7);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot6.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot11.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot11.getRangeAxisLocation();
        categoryPlot6.setDomainAxisLocation(axisLocation16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot6.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation19, false);
        int int22 = categoryPlot0.getWeight();
        java.awt.Stroke stroke23 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot0.setDataset(10, categoryDataset22);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot0.setRangeAxis((int) '4', valueAxis25, true);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.data.Range range29 = categoryPlot0.getDataRange(valueAxis28);
        boolean boolean30 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        categoryPlot0.setRenderer(categoryItemRenderer31);
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = categoryPlot0.getDomainAxisForDataset((int) (short) 1);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(categoryAxis34);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot0.markerChanged(markerChangeEvent16);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent13);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        java.util.List list16 = categoryPlot0.getCategoriesForAxis(categoryAxis15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot0.zoomDomainAxes(10.0d, plotRenderingInfo18, point2D19);
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot1.setInsets(rectangleInsets2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = null;
        categoryPlot1.setFixedLegendItems(legendItemCollection4);
        java.awt.Paint paint6 = categoryPlot1.getNoDataMessagePaint();
        categoryPlot0.setBackgroundPaint(paint6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot0.getRenderer((int) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        double double12 = categoryPlot0.getRangeCrosshairValue();
        boolean boolean13 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) 'a', categoryMarker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot5.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation10, false);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers((int) '4', layer15);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot0.getDomainAxis();
        double double11 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        categoryPlot0.mapDatasetToRangeAxis(0, 0);
        categoryPlot0.setDomainGridlinesVisible(true);
        categoryPlot0.setBackgroundAlpha((float) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot0.getDomainAxisForDataset((int) '#');
        java.awt.Font font18 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        int int17 = categoryPlot0.getDatasetCount();
        java.lang.Object obj18 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        java.lang.String str9 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(layer10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation((int) '4');
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.util.SortOrder sortOrder15 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot16.getDomainAxisEdge((int) '4');
        categoryPlot16.setAnchorValue((double) (short) 1);
        double double23 = categoryPlot16.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot24 = categoryPlot16.getRootPlot();
        double double25 = categoryPlot16.getRangeCrosshairValue();
        int int26 = categoryPlot16.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot16.getRangeAxisLocation((int) ' ');
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent29 = null;
        categoryPlot16.datasetChanged(datasetChangeEvent29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        categoryPlot16.setRangeAxis(valueAxis31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = categoryPlot16.getDrawingSupplier();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        categoryPlot34.markerChanged(markerChangeEvent35);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray38 = new org.jfree.chart.axis.ValueAxis[] { valueAxis37 };
        categoryPlot34.setRangeAxes(valueAxisArray38);
        java.awt.Paint paint40 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot34.setDomainGridlinePaint(paint40);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent43 = null;
        categoryPlot42.markerChanged(markerChangeEvent43);
        org.jfree.chart.util.RectangleEdge rectangleEdge46 = categoryPlot42.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation47 = categoryPlot42.getRangeAxisLocation();
        java.awt.Stroke stroke48 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot42.setRangeCrosshairStroke(stroke48);
        categoryPlot34.setRangeCrosshairStroke(stroke48);
        boolean boolean51 = categoryPlot34.isRangeGridlinesVisible();
        boolean boolean52 = categoryPlot34.isDomainZoomable();
        java.awt.Stroke stroke53 = categoryPlot34.getRangeGridlineStroke();
        java.awt.Paint paint54 = categoryPlot34.getOutlinePaint();
        categoryPlot16.setDomainGridlinePaint(paint54);
        categoryPlot0.setBackgroundPaint(paint54);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(sortOrder15);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNotNull(drawingSupplier33);
        org.junit.Assert.assertNotNull(valueAxisArray38);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(rectangleEdge46);
        org.junit.Assert.assertNotNull(axisLocation47);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(paint54);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint13 = categoryPlot12.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint13);
        java.util.List list15 = categoryPlot0.getAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        categoryPlot0.setDataset(categoryDataset16);
        int int18 = categoryPlot0.getRangeAxisCount();
        boolean boolean19 = categoryPlot0.isOutlineVisible();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = categoryPlot0.getInsets();
        categoryPlot0.clearRangeMarkers((int) 'a');
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        categoryPlot18.markerChanged(markerChangeEvent19);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        categoryPlot22.markerChanged(markerChangeEvent23);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray26 = new org.jfree.chart.axis.ValueAxis[] { valueAxis25 };
        categoryPlot22.setRangeAxes(valueAxisArray26);
        categoryPlot22.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean31 = categoryPlot22.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot22.getDomainAxisLocation();
        categoryPlot18.setDomainAxisLocation((int) (byte) 1, axisLocation32, false);
        java.awt.Paint paint35 = categoryPlot18.getOutlinePaint();
        categoryPlot0.setDomainGridlinePaint(paint35);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(valueAxisArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(axisLocation32);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis();
        categoryPlot0.setAnchorValue((double) 100L, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot0.getRenderer((int) (short) 0);
        float float14 = categoryPlot0.getForegroundAlpha();
        java.awt.Image image15 = null;
        categoryPlot0.setBackgroundImage(image15);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray23 = new org.jfree.chart.axis.ValueAxis[] { valueAxis22 };
        categoryPlot19.setRangeAxes(valueAxisArray23);
        categoryPlot19.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot29.setInsets(rectangleInsets30);
        org.jfree.chart.LegendItemCollection legendItemCollection32 = null;
        categoryPlot29.setFixedLegendItems(legendItemCollection32);
        java.awt.Paint paint34 = categoryPlot29.getNoDataMessagePaint();
        categoryPlot28.setBackgroundPaint(paint34);
        categoryPlot19.setRangeCrosshairPaint(paint34);
        categoryPlot0.setNoDataMessagePaint(paint34);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        java.awt.geom.Point2D point2D41 = null;
        categoryPlot0.zoomRangeAxes((double) 10L, 0.0d, plotRenderingInfo40, point2D41);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(valueAxisArray23);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomDomainAxes((double) 0L, (-1.0d), plotRenderingInfo17, point2D18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.plot.Plot plot21 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNotNull(plot21);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent17);
        boolean boolean19 = categoryPlot0.getDrawSharedDomainAxis();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawBackground(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        java.lang.String str9 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(layer10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot0.getDomainAxis((int) '#');
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNull(categoryAxis13);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, (int) (byte) 10, plotRenderingInfo20);
        java.awt.Paint paint22 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = categoryPlot0.getDrawingSupplier();
        float float11 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        categoryPlot20.markerChanged(markerChangeEvent21);
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot20.getDomainAxisEdge((int) '4');
        categoryPlot20.setAnchorValue((double) (short) 1);
        double double27 = categoryPlot20.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot28 = categoryPlot20.getRootPlot();
        double double29 = categoryPlot20.getRangeCrosshairValue();
        int int30 = categoryPlot20.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot20.getRangeAxisLocation((int) ' ');
        java.awt.Paint paint33 = categoryPlot20.getOutlinePaint();
        categoryPlot20.setWeight((int) (short) -1);
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot20.getDomainAxisLocation(10);
        categoryPlot0.setDomainAxisLocation(101, axisLocation37);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(axisSpace18);
        org.junit.Assert.assertNotNull(rectangleEdge24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(axisLocation32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(axisLocation37);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        java.lang.String str9 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(layer10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation((int) '4');
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        categoryPlot20.markerChanged(markerChangeEvent21);
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray24 = new org.jfree.chart.axis.ValueAxis[] { valueAxis23 };
        categoryPlot20.setRangeAxes(valueAxisArray24);
        categoryPlot20.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean29 = categoryPlot20.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation30 = categoryPlot20.getDomainAxisLocation();
        categoryPlot16.setDomainAxisLocation((int) (byte) 1, axisLocation30, false);
        categoryPlot0.setRangeAxisLocation((int) ' ', axisLocation30, true);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(valueAxisArray24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(axisLocation30);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        boolean boolean18 = categoryPlot0.isDomainZoomable();
        java.awt.Stroke stroke19 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = categoryPlot0.getDomainAxis((int) (byte) 1);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(categoryAxis21);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot0.zoomRangeAxes((double) 1, 0.0d, plotRenderingInfo17, point2D18);
        java.awt.Stroke stroke20 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot21.setInsets(rectangleInsets22);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot21.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        categoryPlot26.markerChanged(markerChangeEvent27);
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = categoryPlot26.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot26.getRangeAxisLocation();
        categoryPlot21.setDomainAxisLocation(axisLocation31, false);
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot21.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation34);
        java.awt.Stroke stroke36 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNotNull(stroke36);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot0.setDomainAxis(10, categoryAxis12, false);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        boolean boolean17 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        categoryPlot0.setRangeCrosshairValue((double) 100.0f, true);
        java.awt.Paint paint15 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot16.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot16.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot16.setDomainAxis((int) (short) 100, categoryAxis21, false);
        org.jfree.chart.util.Layer layer24 = null;
        java.util.Collection collection25 = categoryPlot16.getRangeMarkers(layer24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot16.setRenderer(categoryItemRenderer26, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        categoryPlot29.markerChanged(markerChangeEvent30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot29.getDomainAxisEdge((int) '4');
        categoryPlot29.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = null;
        categoryPlot29.setRenderer(categoryItemRenderer36);
        java.awt.Paint paint38 = categoryPlot29.getRangeCrosshairPaint();
        categoryPlot16.setRangeCrosshairPaint(paint38);
        categoryPlot0.setOutlinePaint(paint38);
        boolean boolean41 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation43 = categoryPlot0.getDomainAxisLocation((int) (byte) 0);
        org.jfree.chart.plot.PlotOrientation plotOrientation44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge45 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation43, plotOrientation44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(collection25);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(axisLocation43);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        java.awt.Image image13 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes((double) '#', plotRenderingInfo15, point2D16);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot19.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        int int22 = categoryPlot19.getDomainAxisIndex(categoryAxis21);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        categoryPlot19.setDomainAxis((int) (short) 100, categoryAxis24, false);
        java.awt.Image image27 = null;
        categoryPlot19.setBackgroundImage(image27);
        categoryPlot19.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection32 = null;
        categoryPlot19.setFixedLegendItems(legendItemCollection32);
        java.awt.Paint paint34 = categoryPlot19.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = categoryPlot19.getRendererForDataset(categoryDataset35);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        categoryPlot37.markerChanged(markerChangeEvent38);
        org.jfree.chart.util.RectangleEdge rectangleEdge41 = categoryPlot37.getDomainAxisEdge((int) '4');
        categoryPlot37.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer44 = null;
        categoryPlot37.setRenderer(categoryItemRenderer44);
        int int46 = categoryPlot37.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        java.awt.geom.Point2D point2D50 = null;
        categoryPlot37.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo49, point2D50);
        org.jfree.chart.util.Layer layer52 = null;
        java.util.Collection collection53 = categoryPlot37.getRangeMarkers(layer52);
        java.awt.Paint paint54 = categoryPlot37.getBackgroundPaint();
        org.jfree.chart.axis.AxisLocation axisLocation56 = categoryPlot37.getDomainAxisLocation((int) 'a');
        categoryPlot19.setRangeAxisLocation(axisLocation56);
        categoryPlot0.setRangeAxisLocation((int) ' ', axisLocation56, false);
        boolean boolean60 = categoryPlot0.getDrawSharedDomainAxis();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(categoryAxis20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categoryItemRenderer36);
        org.junit.Assert.assertNotNull(rectangleEdge41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNull(collection53);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(axisLocation56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot0.setDomainGridlineStroke(stroke8);
        org.jfree.chart.axis.AxisSpace axisSpace10 = categoryPlot0.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot12.setInsets(rectangleInsets13);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = null;
        categoryPlot12.setFixedLegendItems(legendItemCollection15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        categoryPlot17.setAnchorValue((double) (short) 1);
        double double24 = categoryPlot17.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot25 = categoryPlot17.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray26 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot17.setRenderers(categoryItemRendererArray26);
        categoryPlot12.setRenderers(categoryItemRendererArray26);
        categoryPlot0.setRenderers(categoryItemRendererArray26);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(axisSpace10);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNotNull(categoryItemRendererArray26);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot0.setRenderer((int) (byte) 0, categoryItemRenderer17, true);
        java.lang.String str20 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Category Plot" + "'", str20, "Category Plot");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRendererForDataset(categoryDataset18);
        boolean boolean20 = categoryPlot0.isRangeZoomable();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D21, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot17.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo22, point2D23);
        categoryPlot17.clearRangeMarkers((int) (short) -1);
        categoryPlot17.clearAnnotations();
        boolean boolean28 = categoryPlot0.equals((java.lang.Object) categoryPlot17);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        categoryPlot31.markerChanged(markerChangeEvent32);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot31.getDomainAxisEdge((int) '4');
        categoryPlot31.setAnchorValue((double) (short) 1);
        categoryPlot31.setRangeCrosshairValue((double) (byte) -1, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = categoryPlot31.getDomainAxis();
        int int42 = categoryPlot31.getRangeAxisCount();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor43 = categoryPlot31.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor43);
        int int45 = categoryPlot0.getWeight();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertNull(categoryAxis41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(categoryAnchor43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = categoryPlot0.getFixedLegendItems();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNull(legendItemCollection11);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = categoryPlot0.getRendererForDataset(categoryDataset4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot6.getDomainAxisEdge((int) '4');
        categoryPlot6.setAnchorValue((double) (short) 1);
        java.awt.Paint paint13 = categoryPlot6.getRangeCrosshairPaint();
        categoryPlot0.setRangeCrosshairPaint(paint13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot15.setInsets(rectangleInsets16);
        java.awt.Stroke stroke18 = categoryPlot15.getRangeGridlineStroke();
        categoryPlot15.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot15.getRangeAxisLocation((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray27 = new org.jfree.chart.axis.ValueAxis[] { valueAxis26 };
        categoryPlot23.setRangeAxes(valueAxisArray27);
        categoryPlot23.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot23.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.PlotOrientation plotOrientation35 = categoryPlot23.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge36 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation22, plotOrientation35);
        categoryPlot0.setRangeAxisLocation(axisLocation22, true);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1);
        categoryPlot0.setRangeCrosshairValue((double) 100.0f);
        boolean boolean43 = categoryPlot0.isRangeGridlinesVisible();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer5);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(valueAxisArray27);
        org.junit.Assert.assertNotNull(plotOrientation35);
        org.junit.Assert.assertNotNull(rectangleEdge36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        int int13 = categoryPlot0.getWeight();
        float float14 = categoryPlot0.getBackgroundImageAlpha();
        categoryPlot0.setAnchorValue((double) 1L);
        java.awt.Image image17 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNull(image17);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup5 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot6.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor9 = categoryPlot6.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot6.getRendererForDataset(categoryDataset10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot6.getRangeAxisLocation(100);
        categoryPlot0.setDomainAxisLocation(axisLocation13);
        boolean boolean15 = categoryPlot0.isDomainZoomable();
        categoryPlot0.clearRangeAxes();
        java.awt.Image image17 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNull(categoryItemRenderer8);
        org.junit.Assert.assertNotNull(categoryAnchor9);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(image17);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer(categoryItemRenderer11, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot15.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot15.getRangeAxisLocation();
        java.awt.Stroke stroke21 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot15.setRangeCrosshairStroke(stroke21);
        java.awt.Stroke stroke23 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot15.setDomainGridlineStroke(stroke23);
        org.jfree.chart.axis.AxisSpace axisSpace25 = categoryPlot15.getFixedDomainAxisSpace();
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot15.getRangeAxisLocation();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxisLocation((-1), axisLocation26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(axisSpace25);
        org.junit.Assert.assertNotNull(axisLocation26);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        categoryPlot0.setRangeAxis(valueAxis12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = categoryPlot0.getInsets();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot0.setDataset(10, categoryDataset22);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot0.setRangeAxis((int) '4', valueAxis25, true);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.data.Range range29 = categoryPlot0.getDataRange(valueAxis28);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        categoryPlot0.setRangeAxis(10, valueAxis31, false);
        java.awt.Paint paint34 = categoryPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        categoryPlot0.notifyListeners(plotChangeEvent10);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.mapDatasetToDomainAxis((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) ' ');
        boolean boolean13 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        categoryPlot0.axisChanged(axisChangeEvent16);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRenderer((-1));
        double double20 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        boolean boolean7 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot8.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        int int11 = categoryPlot8.getDomainAxisIndex(categoryAxis10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot8.setDomainAxis((int) (short) 100, categoryAxis13, false);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot8.getRangeMarkers(layer16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot8.setRangeAxes(valueAxisArray19);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray21 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot8.setDomainAxes(categoryAxisArray21);
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot8.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation23, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = categoryPlot0.getDomainAxis(100);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertNotNull(categoryAxisArray21);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNull(categoryAxis27);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        java.util.List list10 = categoryPlot0.getCategoriesForAxis(categoryAxis9);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        categoryPlot0.setRangeAxis((int) '#', valueAxis7, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) 15, plotRenderingInfo11, point2D12);
        java.awt.Stroke stroke14 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        boolean boolean14 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.data.Range range18 = categoryPlot0.getDataRange(valueAxis17);
        org.jfree.chart.axis.AxisLocation axisLocation20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainAxisLocation(0, axisLocation20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot0.setDataset(10, categoryDataset22);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        categoryPlot0.setRangeAxis((int) '4', valueAxis25, true);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.data.Range range29 = categoryPlot0.getDataRange(valueAxis28);
        java.awt.Paint paint30 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        float float5 = categoryPlot0.getForegroundAlpha();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation();
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setRangeCrosshairPaint(paint9);
        categoryPlot0.setRangeCrosshairValue((double) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot0.getDomainAxis((int) (short) -1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryAxis14);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        categoryPlot0.setNoDataMessage("hi!");
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        categoryPlot9.markerChanged(markerChangeEvent10);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot9.setDomainAxis(categoryAxis12);
        java.awt.Paint paint14 = categoryPlot9.getRangeCrosshairPaint();
        categoryPlot0.setRangeCrosshairPaint(paint14);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot0.setOutlinePaint(paint16);
        java.awt.Stroke stroke18 = categoryPlot0.getDomainGridlineStroke();
        categoryPlot0.setWeight(15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer22);
        java.awt.Stroke stroke24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setDomainGridlineStroke(stroke24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot0.setDomainAxis((int) (byte) 100, categoryAxis18);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot7.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot7.getRangeAxisLocation();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot7.setRangeCrosshairStroke(stroke13);
        java.awt.Stroke stroke15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot7.setDomainGridlineStroke(stroke15);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        java.awt.Stroke stroke18 = categoryPlot7.getOutlineStroke();
        categoryPlot7.setRangeCrosshairVisible(true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge1 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis2 = categoryPlot0.getRangeAxis();
        java.awt.Paint paint3 = categoryPlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(rectangleEdge1);
        org.junit.Assert.assertNull(valueAxis2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot6.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot6.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        int int11 = categoryPlot6.getIndexOf(categoryItemRenderer10);
        org.jfree.chart.plot.Plot plot12 = categoryPlot6.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot6.setRenderer(100, categoryItemRenderer14, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot6.setRenderer((int) (byte) 1, categoryItemRenderer18);
        int int20 = categoryPlot6.getDatasetCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        categoryPlot21.markerChanged(markerChangeEvent22);
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot21.getDomainAxisEdge((int) '4');
        categoryPlot21.setAnchorValue((double) (short) 1);
        double double28 = categoryPlot21.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot29 = categoryPlot21.getRootPlot();
        double double30 = categoryPlot21.getRangeCrosshairValue();
        int int31 = categoryPlot21.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot21.getRangeAxisLocation((int) ' ');
        java.awt.Paint paint34 = categoryPlot21.getOutlinePaint();
        categoryPlot6.setNoDataMessagePaint(paint34);
        categoryPlot0.setDomainGridlinePaint(paint34);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        java.awt.Stroke stroke10 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis((int) (short) 0);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryAxis12);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot7.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot7.getRangeAxisEdge();
        categoryPlot7.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) (short) 100, categoryAxis18, false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot13.getRangeMarkers(layer21);
        categoryPlot13.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        int int26 = categoryPlot13.getDomainAxisIndex(categoryAxis25);
        categoryPlot13.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot13.getRangeAxis();
        categoryPlot7.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        org.jfree.chart.plot.Plot plot33 = categoryPlot0.getRootPlot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        categoryPlot0.addChangeListener(plotChangeListener34);
        boolean boolean36 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(plot33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        float float8 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge(10);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = categoryPlot0.removeAnnotation(categoryAnnotation11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot6.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot6.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot6.setDomainAxis((int) (short) 100, categoryAxis11, false);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot6.getRangeMarkers(layer14);
        categoryPlot6.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot6.getDomainAxisIndex(categoryAxis18);
        categoryPlot6.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis23 = categoryPlot6.getRangeAxis();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot6);
        org.jfree.chart.util.SortOrder sortOrder25 = categoryPlot6.getColumnRenderingOrder();
        java.awt.Image image26 = categoryPlot6.getBackgroundImage();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNotNull(sortOrder25);
        org.junit.Assert.assertNull(image26);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.Plot plot18 = categoryPlot0.getRootPlot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        categoryPlot0.removeChangeListener(plotChangeListener19);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.data.Range range23 = categoryPlot0.getDataRange(valueAxis22);
        float float24 = categoryPlot0.getForegroundAlpha();
        categoryPlot0.setBackgroundImageAlignment(10);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(range23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, (int) (byte) 10, plotRenderingInfo20);
        java.awt.Image image22 = null;
        categoryPlot0.setBackgroundImage(image22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomDomainAxes(0.0d, (double) (-1L), plotRenderingInfo26, point2D27);
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] { valueAxis16 };
        categoryPlot13.setRangeAxes(valueAxisArray17);
        categoryPlot13.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean22 = categoryPlot13.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        categoryPlot13.setDomainAxis((int) (short) 0, categoryAxis24);
        org.jfree.chart.plot.PlotOrientation plotOrientation26 = categoryPlot13.getOrientation();
        categoryPlot0.setOrientation(plotOrientation26);
        org.jfree.chart.plot.Marker marker28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker28, layer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(plotOrientation26);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint13 = categoryPlot12.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint13);
        java.util.List list15 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot0.getDomainAxisEdge();
        org.jfree.data.category.CategoryDataset categoryDataset19 = categoryPlot0.getDataset(100);
        java.awt.Stroke stroke20 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot6.setInsets(rectangleInsets7);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot6.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot11.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot11.getRangeAxisLocation();
        categoryPlot6.setDomainAxisLocation(axisLocation16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot6.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation19, false);
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setRangeCrosshairValue((double) (byte) 100);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        categoryPlot0.setRenderer(categoryItemRenderer25);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        categoryPlot0.notifyListeners(plotChangeEvent27);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        categoryPlot0.clearAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(100, categoryDataset9);
        org.jfree.chart.plot.Plot plot11 = categoryPlot0.getRootPlot();
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        categoryPlot2.markerChanged(markerChangeEvent3);
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot2.getDomainAxisEdge((int) '4');
        categoryPlot2.setAnchorValue((double) (short) 1);
        double double9 = categoryPlot2.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot10 = categoryPlot2.getRootPlot();
        double double11 = categoryPlot2.getRangeCrosshairValue();
        int int12 = categoryPlot2.getRangeAxisCount();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot2.setInsets(rectangleInsets13, true);
        categoryPlot0.setInsets(rectangleInsets13, true);
        float float18 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis13, true);
        int int16 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = categoryPlot0.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRendererForDataset(categoryDataset18);
        categoryPlot0.setAnchorValue(100.0d);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNotNull(rectangleEdge22);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot0.getRendererForDataset(categoryDataset16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertNull(axisSpace18);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxis((int) (byte) 1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        categoryPlot0.addChangeListener(plotChangeListener15);
        categoryPlot0.clearAnnotations();
        categoryPlot0.setBackgroundAlpha(0.0f);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot15.setRangeAxes(valueAxisArray19);
        categoryPlot15.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean24 = categoryPlot15.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot15.getDomainAxisLocation();
        categoryPlot11.setDomainAxisLocation((int) (byte) 1, axisLocation25, false);
        categoryPlot0.setDomainAxisLocation((int) 'a', axisLocation25);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.util.SortOrder sortOrder30 = categoryPlot0.getColumnRenderingOrder();
        int int31 = categoryPlot0.getWeight();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(sortOrder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        categoryPlot0.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Stroke stroke16 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot0.zoomDomainAxes((double) 1, (double) (short) -1, plotRenderingInfo19, point2D20);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        int int21 = categoryPlot18.getDomainAxisIndex(categoryAxis20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot18.setDomainAxis((int) (short) 100, categoryAxis23, false);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot18.getRangeMarkers(layer26);
        categoryPlot18.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder30 = categoryPlot18.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder30);
        org.jfree.chart.axis.ValueAxis valueAxis33 = categoryPlot0.getRangeAxisForDataset((int) (byte) 0);
        boolean boolean34 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        categoryPlot35.markerChanged(markerChangeEvent36);
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = categoryPlot35.getDomainAxisEdge((int) '4');
        categoryPlot35.setAnchorValue((double) (short) 1);
        double double42 = categoryPlot35.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = categoryPlot35.getDomainAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation44 = categoryPlot35.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = categoryPlot45.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = null;
        int int48 = categoryPlot45.getDomainAxisIndex(categoryAxis47);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer49 = null;
        int int50 = categoryPlot45.getIndexOf(categoryItemRenderer49);
        org.jfree.chart.plot.Plot plot51 = categoryPlot45.getParent();
        java.awt.Font font52 = categoryPlot45.getNoDataMessageFont();
        categoryPlot35.setNoDataMessageFont(font52);
        categoryPlot0.setNoDataMessageFont(font52);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(sortOrder30);
        org.junit.Assert.assertNull(valueAxis33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(rectangleEdge39);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis43);
        org.junit.Assert.assertNotNull(plotOrientation44);
        org.junit.Assert.assertNull(categoryAxis46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(plot51);
        org.junit.Assert.assertNotNull(font52);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRendererForDataset(categoryDataset18);
        java.awt.Paint paint20 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot0.setDomainAxis(categoryAxis21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        categoryPlot0.setDataset(categoryDataset23);
        categoryPlot0.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot0.setDomainAxis(categoryAxis27);
        org.jfree.chart.util.SortOrder sortOrder29 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(sortOrder29);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairValue((double) 10, false);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers((int) (short) -1, layer10);
        int int12 = categoryPlot0.getWeight();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        categoryPlot0.configureRangeAxes();
        categoryPlot0.setRangeGridlinesVisible(true);
        org.jfree.chart.axis.AxisSpace axisSpace16 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace16);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot13.getDomainAxisEdge((int) '4');
        categoryPlot13.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot13.setRenderer(categoryItemRenderer20);
        java.awt.Paint paint22 = categoryPlot13.getRangeCrosshairPaint();
        categoryPlot0.setRangeCrosshairPaint(paint22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace24);
        java.awt.Font font26 = categoryPlot0.getNoDataMessageFont();
        java.lang.Object obj27 = categoryPlot0.clone();
        categoryPlot0.setBackgroundAlpha((float) '#');
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset10 = categoryPlot0.getDataset();
        java.awt.Paint paint11 = categoryPlot0.getBackgroundPaint();
        java.util.List list12 = categoryPlot0.getCategories();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getLegendItems();
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.clearAnnotations();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot0.getRenderer();
        org.jfree.data.category.CategoryDataset categoryDataset13 = categoryPlot0.getDataset();
        org.jfree.chart.plot.Marker marker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertNull(categoryDataset13);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairValue((double) 10, false);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(categoryDataset9);
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        float float12 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) ' ');
        boolean boolean13 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        categoryPlot0.axisChanged(axisChangeEvent16);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRenderer((-1));
        float float20 = categoryPlot0.getForegroundAlpha();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        categoryPlot0.drawBackgroundImage(graphics2D21, rectangle2D22);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets11, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) 10.0f);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot0.getRangeAxisForDataset(0);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(valueAxis10);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot0.getRenderer();
        boolean boolean9 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNull(categoryItemRenderer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation11 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] { valueAxis16 };
        categoryPlot13.setRangeAxes(valueAxisArray17);
        categoryPlot13.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot13.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot13.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot13.getRangeAxisLocation((int) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot29.setInsets(rectangleInsets30);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot29.getDomainAxisLocation((-1));
        categoryPlot13.setRangeAxisLocation(axisLocation33, false);
        categoryPlot0.setDomainAxisLocation((int) ' ', axisLocation33, true);
        org.jfree.data.category.CategoryDataset categoryDataset38 = categoryPlot0.getDataset();
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        boolean boolean43 = categoryPlot0.render(graphics2D39, rectangle2D40, (int) (byte) 0, plotRenderingInfo42);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(plotOrientation11);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNull(categoryDataset38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation((int) '#');
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot0.setRenderer(categoryItemRenderer16);
        categoryPlot0.setWeight((int) (byte) 1);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder20 = categoryPlot0.getDatasetRenderingOrder();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D21, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(datasetRenderingOrder20);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        categoryPlot0.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean15 = categoryPlot0.isSubplot();
        java.awt.Paint paint16 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder17 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        categoryPlot0.setDataset((int) (short) 100, categoryDataset19);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(datasetRenderingOrder17);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        int int13 = categoryPlot0.getWeight();
        float float14 = categoryPlot0.getBackgroundImageAlpha();
        java.awt.Stroke stroke15 = categoryPlot0.getRangeCrosshairStroke();
        int int16 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(legendItemCollection8);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        java.awt.Paint paint15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        categoryPlot0.setBackgroundPaint(paint15);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        categoryPlot0.removeChangeListener(plotChangeListener17);
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = categoryPlot0.getDataset();
        org.jfree.chart.plot.CategoryMarker categoryMarker14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(categoryDataset13);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = null;
        categoryPlot7.setFixedLegendItems(legendItemCollection10);
        java.awt.Paint paint12 = categoryPlot7.getNoDataMessagePaint();
        categoryPlot6.setBackgroundPaint(paint12);
        categoryPlot0.setRangeCrosshairPaint(paint12);
        java.util.List list15 = categoryPlot0.getCategories();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot0.markerChanged(markerChangeEvent16);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        int int19 = categoryPlot0.getIndexOf(categoryItemRenderer18);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer11);
        categoryPlot0.clearRangeMarkers(0);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers((int) (short) 1, layer16);
        boolean boolean18 = categoryPlot0.isOutlineVisible();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot12.markerChanged(markerChangeEvent13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray16 = new org.jfree.chart.axis.ValueAxis[] { valueAxis15 };
        categoryPlot12.setRangeAxes(valueAxisArray16);
        categoryPlot12.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean21 = categoryPlot12.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot12.getDomainAxisLocation();
        categoryPlot8.setDomainAxisLocation((int) (byte) 1, axisLocation22, false);
        java.awt.Paint paint25 = categoryPlot8.getOutlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = categoryPlot0.getDrawingSupplier();
        categoryPlot0.mapDatasetToRangeAxis(100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(valueAxisArray16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(axisSpace27);
        org.junit.Assert.assertNotNull(drawingSupplier28);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.addChangeListener(plotChangeListener12);
        float float14 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        java.awt.Paint paint7 = categoryPlot0.getRangeCrosshairPaint();
        categoryPlot0.setRangeCrosshairValue((double) 1L, false);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxisForDataset(0);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot0.markerChanged(markerChangeEvent14);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(legendItemCollection13);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot0.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo12, point2D13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(layer15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent17);
        boolean boolean19 = categoryPlot0.getDrawSharedDomainAxis();
        boolean boolean20 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairVisible(true);
        categoryPlot0.setDrawSharedDomainAxis(true);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearRangeMarkers();
        java.lang.String str6 = categoryPlot4.getNoDataMessage();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot12.getRenderer((int) '4');
        java.util.List list15 = categoryPlot12.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot12.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection16);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        categoryPlot0.notifyListeners(plotChangeEvent18);
        java.lang.Object obj20 = categoryPlot0.clone();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset((int) '#', categoryDataset9);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = categoryPlot0.getLegendItems();
        int int12 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot12.markerChanged(markerChangeEvent13);
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot12.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        categoryPlot12.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent20 = null;
        categoryPlot12.rendererChanged(rendererChangeEvent20);
        java.awt.Stroke stroke22 = categoryPlot12.getRangeGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke22);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup5 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot6.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor9 = categoryPlot6.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot6.getRendererForDataset(categoryDataset10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot6.getRangeAxisLocation(100);
        categoryPlot0.setDomainAxisLocation(axisLocation13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getDomainMarkers(layer15);
        int int17 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNull(categoryItemRenderer8);
        org.junit.Assert.assertNotNull(categoryAnchor9);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(categoryItemRenderer8, false);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup5 = categoryPlot0.getDatasetGroup();
        categoryPlot0.setBackgroundAlpha(0.5f);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        categoryPlot0.axisChanged(axisChangeEvent8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (-1L), plotRenderingInfo11, point2D12);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(datasetGroup5);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) 100, 0.0d, plotRenderingInfo14, point2D15);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot14.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor17 = categoryPlot14.getDomainGridlinePosition();
        categoryPlot14.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        categoryPlot14.mapDatasetToDomainAxis((int) (short) 0, 15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        categoryPlot14.zoomDomainAxes((double) (-1L), plotRenderingInfo25, point2D26);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        categoryPlot28.markerChanged(markerChangeEvent29);
        org.jfree.chart.util.RectangleEdge rectangleEdge32 = categoryPlot28.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot28.getRangeAxisLocation();
        java.awt.Stroke stroke34 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot28.setRangeCrosshairStroke(stroke34);
        java.awt.Stroke stroke36 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot28.setDomainGridlineStroke(stroke36);
        categoryPlot14.setDomainGridlineStroke(stroke36);
        categoryPlot0.setDomainGridlineStroke(stroke36);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertNotNull(categoryAnchor17);
        org.junit.Assert.assertNotNull(rectangleEdge32);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(stroke36);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        int int7 = categoryPlot0.getWeight();
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 100, 1);
        categoryPlot0.setNoDataMessage("");
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(legendItemCollection13);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot0.setRenderer((int) ' ', categoryItemRenderer18, true);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] { valueAxis8 };
        categoryPlot5.setRangeAxes(valueAxisArray9);
        categoryPlot5.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        java.lang.String str14 = categoryPlot5.getNoDataMessage();
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot5.getRangeMarkers(layer15);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot5.getRangeAxisLocation((int) '4');
        categoryPlot4.setDomainAxisLocation(axisLocation18);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        categoryPlot17.setAnchorValue((double) (short) 1);
        double double24 = categoryPlot17.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot25 = categoryPlot17.getRootPlot();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot17);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = categoryPlot17.getDomainAxisForDataset((int) (byte) -1);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        categoryPlot17.setRangeAxis(valueAxis29);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNull(categoryAxis28);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.awt.Image image17 = null;
        categoryPlot0.setBackgroundImage(image17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        categoryPlot0.setDataset(categoryDataset19);
        int int21 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot12.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot12.getDomainAxisIndex(categoryAxis14);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot12.setDomainAxis((int) (short) 100, categoryAxis17, false);
        java.awt.Image image20 = null;
        categoryPlot12.setBackgroundImage(image20);
        float float22 = categoryPlot12.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot23.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo28, point2D29);
        categoryPlot23.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        categoryPlot33.markerChanged(markerChangeEvent34);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = categoryPlot33.getDomainAxisEdge((int) '4');
        categoryPlot33.setAnchorValue((double) (short) 1);
        double double40 = categoryPlot33.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot41 = categoryPlot33.getRootPlot();
        double double42 = categoryPlot33.getRangeCrosshairValue();
        categoryPlot23.setParent((org.jfree.chart.plot.Plot) categoryPlot33);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = categoryPlot23.getInsets();
        categoryPlot12.setAxisOffset(rectangleInsets44);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot12);
        org.jfree.chart.axis.AxisSpace axisSpace47 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace47);
        org.jfree.chart.axis.AxisLocation axisLocation49 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.util.RectangleEdge rectangleEdge50 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent52 = null;
        categoryPlot51.markerChanged(markerChangeEvent52);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo56 = null;
        java.awt.geom.Point2D point2D57 = null;
        categoryPlot51.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo56, point2D57);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer59 = categoryPlot51.getRenderer();
        categoryPlot51.setBackgroundAlpha(0.0f);
        boolean boolean62 = categoryPlot51.isRangeGridlinesVisible();
        java.awt.Paint paint63 = categoryPlot51.getRangeGridlinePaint();
        categoryPlot0.setRangeGridlinePaint(paint63);
        java.util.List list65 = categoryPlot0.getCategories();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(axisLocation49);
        org.junit.Assert.assertNotNull(rectangleEdge50);
        org.junit.Assert.assertNull(categoryItemRenderer59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertNull(list65);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) ' ', (double) (short) 10, plotRenderingInfo7, point2D8);
        categoryPlot0.clearAnnotations();
        categoryPlot0.setRangeCrosshairVisible(true);
        categoryPlot0.setBackgroundAlpha((float) 'a');
        java.awt.Stroke stroke15 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot16.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot16.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        int int21 = categoryPlot16.getIndexOf(categoryItemRenderer20);
        int int22 = categoryPlot16.getWeight();
        org.jfree.chart.util.SortOrder sortOrder23 = categoryPlot16.getColumnRenderingOrder();
        java.awt.Stroke stroke24 = categoryPlot16.getDomainGridlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke24);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(sortOrder23);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets13, true);
        boolean boolean16 = categoryPlot0.isRangeZoomable();
        float float17 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1, true);
        categoryPlot0.setWeight((int) (byte) -1);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot0.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        categoryPlot0.setDataset((int) (short) 0, categoryDataset14);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) ' ');
        boolean boolean13 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] { valueAxis17 };
        categoryPlot14.setRangeAxes(valueAxisArray18);
        categoryPlot14.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        java.lang.String str23 = categoryPlot14.getNoDataMessage();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        categoryPlot24.markerChanged(markerChangeEvent25);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray28 = new org.jfree.chart.axis.ValueAxis[] { valueAxis27 };
        categoryPlot24.setRangeAxes(valueAxisArray28);
        categoryPlot24.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean33 = categoryPlot24.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot24.getDomainAxisLocation();
        categoryPlot14.setRangeAxisLocation(axisLocation34);
        categoryPlot0.setDomainAxisLocation(axisLocation34, true);
        org.jfree.chart.axis.AxisSpace axisSpace38 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(valueAxisArray28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNull(axisSpace38);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot0.getRenderer();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = categoryPlot0.getLegendItems();
        java.awt.Paint paint10 = categoryPlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(categoryItemRenderer8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot5.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo10, point2D11);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot5.getRenderer();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot5);
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot5.getRangeAxis();
        categoryPlot5.setAnchorValue((double) 0L);
        java.awt.Font font18 = categoryPlot5.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        java.awt.Image image21 = null;
        categoryPlot0.setBackgroundImage(image21);
        java.lang.Object obj23 = categoryPlot0.clone();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis((int) (byte) -1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.data.Range range19 = categoryPlot0.getDataRange(valueAxis18);
        float float20 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertNull(range19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        categoryPlot0.setRangeAxis((int) '4', valueAxis10, false);
        java.awt.Stroke stroke13 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (byte) 10, 10, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        java.awt.Paint paint10 = categoryPlot0.getOutlinePaint();
        categoryPlot0.setAnchorValue((double) 100L, true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        int int11 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot0.getRenderer();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer12);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation9 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot10.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot10.getDomainAxisIndex(categoryAxis12);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        int int15 = categoryPlot10.getIndexOf(categoryItemRenderer14);
        org.jfree.chart.plot.Plot plot16 = categoryPlot10.getParent();
        java.awt.Font font17 = categoryPlot10.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font17);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 0, 101);
        double double22 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNotNull(plotOrientation9);
        org.junit.Assert.assertNull(categoryAxis11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        double double14 = categoryPlot5.getRangeCrosshairValue();
        int int15 = categoryPlot5.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot5.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        categoryPlot0.setBackgroundAlpha((float) 15);
        java.awt.Font font21 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font21);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        categoryPlot27.markerChanged(markerChangeEvent28);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray31 = new org.jfree.chart.axis.ValueAxis[] { valueAxis30 };
        categoryPlot27.setRangeAxes(valueAxisArray31);
        categoryPlot27.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean36 = categoryPlot27.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot27.getDomainAxisLocation();
        categoryPlot23.setDomainAxisLocation((int) (byte) 1, axisLocation37, false);
        java.awt.Paint paint40 = categoryPlot23.getOutlinePaint();
        categoryPlot0.setRangeCrosshairPaint(paint40);
        categoryPlot0.clearDomainMarkers((int) (short) -1);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(valueAxisArray31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray23 = new org.jfree.chart.axis.ValueAxis[] { valueAxis22 };
        categoryPlot19.setRangeAxes(valueAxisArray23);
        categoryPlot19.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot29.setInsets(rectangleInsets30);
        org.jfree.chart.LegendItemCollection legendItemCollection32 = null;
        categoryPlot29.setFixedLegendItems(legendItemCollection32);
        java.awt.Paint paint34 = categoryPlot29.getNoDataMessagePaint();
        categoryPlot28.setBackgroundPaint(paint34);
        categoryPlot19.setRangeCrosshairPaint(paint34);
        categoryPlot0.setNoDataMessagePaint(paint34);
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        categoryPlot0.removeChangeListener(plotChangeListener38);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(valueAxisArray23);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot13.setInsets(rectangleInsets14);
        java.awt.Stroke stroke16 = categoryPlot13.getDomainGridlineStroke();
        categoryPlot0.setDomainGridlineStroke(stroke16);
        int int18 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) '4', 100, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        categoryPlot0.mapDatasetToDomainAxis((int) '4', (int) '4');
        org.jfree.chart.plot.PlotOrientation plotOrientation24 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot0.setRenderer(categoryItemRenderer26);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(plotOrientation24);
        org.junit.Assert.assertNotNull(drawingSupplier25);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        java.awt.Image image8 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis10);
        org.jfree.chart.plot.Plot plot12 = categoryPlot0.getParent();
        java.lang.String str13 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        boolean boolean10 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisSpace axisSpace11 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace13);
        float float15 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot0.setDomainGridlinePaint(paint6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot8.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot8.getRangeAxisLocation();
        java.awt.Stroke stroke14 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot8.setRangeCrosshairStroke(stroke14);
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        boolean boolean17 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRendererForDataset(categoryDataset18);
        java.awt.Paint paint20 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot0.setDomainAxis(categoryAxis21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        categoryPlot0.setDataset(categoryDataset23);
        float float25 = categoryPlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryItemRenderer19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis13, true);
        int int16 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace17);
        java.lang.String str19 = categoryPlot0.getNoDataMessage();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setRangeGridlinesVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        int int12 = categoryPlot0.getIndexOf(categoryItemRenderer11);
        boolean boolean13 = categoryPlot0.isSubplot();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot0.setDataset(categoryDataset10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        categoryPlot0.addChangeListener(plotChangeListener12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge((int) ' ');
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers(layer16);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNull(collection17);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        categoryPlot0.setRangeAxis(valueAxis9);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemRenderer20);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.util.SortOrder sortOrder7 = categoryPlot0.getColumnRenderingOrder();
        java.awt.Stroke stroke8 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge((int) (byte) 0);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sortOrder7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.Plot plot18 = categoryPlot0.getRootPlot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        categoryPlot0.removeChangeListener(plotChangeListener19);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.axis.ValueAxis valueAxis22 = categoryPlot0.getRangeAxis();
        float float23 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) -1, (double) (short) 100, plotRenderingInfo26, point2D27);
        org.jfree.chart.LegendItemCollection legendItemCollection29 = categoryPlot0.getFixedLegendItems();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNull(legendItemCollection29);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        java.awt.Image image13 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes((double) '#', plotRenderingInfo15, point2D16);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot19.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        int int22 = categoryPlot19.getDomainAxisIndex(categoryAxis21);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        categoryPlot19.setDomainAxis((int) (short) 100, categoryAxis24, false);
        java.awt.Image image27 = null;
        categoryPlot19.setBackgroundImage(image27);
        categoryPlot19.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection32 = null;
        categoryPlot19.setFixedLegendItems(legendItemCollection32);
        java.awt.Paint paint34 = categoryPlot19.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = categoryPlot19.getRendererForDataset(categoryDataset35);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        categoryPlot37.markerChanged(markerChangeEvent38);
        org.jfree.chart.util.RectangleEdge rectangleEdge41 = categoryPlot37.getDomainAxisEdge((int) '4');
        categoryPlot37.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer44 = null;
        categoryPlot37.setRenderer(categoryItemRenderer44);
        int int46 = categoryPlot37.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        java.awt.geom.Point2D point2D50 = null;
        categoryPlot37.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo49, point2D50);
        org.jfree.chart.util.Layer layer52 = null;
        java.util.Collection collection53 = categoryPlot37.getRangeMarkers(layer52);
        java.awt.Paint paint54 = categoryPlot37.getBackgroundPaint();
        org.jfree.chart.axis.AxisLocation axisLocation56 = categoryPlot37.getDomainAxisLocation((int) 'a');
        categoryPlot19.setRangeAxisLocation(axisLocation56);
        categoryPlot0.setRangeAxisLocation((int) ' ', axisLocation56, false);
        java.awt.Graphics2D graphics2D60 = null;
        java.awt.geom.Rectangle2D rectangle2D61 = null;
        categoryPlot0.drawBackgroundImage(graphics2D60, rectangle2D61);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(categoryAxis20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categoryItemRenderer36);
        org.junit.Assert.assertNotNull(rectangleEdge41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNull(collection53);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(axisLocation56);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (short) 100, categoryItemRenderer11);
        categoryPlot0.clearRangeMarkers(0);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot0.getRangeMarkers((int) (short) 1, layer16);
        categoryPlot0.setRangeGridlinesVisible(false);
        java.awt.Paint paint20 = categoryPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor4 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = null;
        categoryPlot0.setRenderer((int) (byte) 0, categoryItemRenderer6);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(categoryAnchor4);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation((int) '#');
        categoryPlot0.setWeight((int) (byte) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = categoryPlot0.getDrawingSupplier();
        java.awt.Stroke stroke19 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot0.setRenderer(15, categoryItemRenderer21, false);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        java.awt.Image image8 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis10);
        org.jfree.chart.plot.Plot plot12 = categoryPlot0.getParent();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder13 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot14.getDomainAxisEdge((int) '4');
        categoryPlot14.setAnchorValue((double) (short) 1);
        categoryPlot14.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        categoryPlot14.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo24, point2D25);
        int int27 = categoryPlot14.getDatasetCount();
        double double28 = categoryPlot14.getAnchorValue();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        categoryPlot14.setRangeAxis(valueAxis29);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor31 = categoryPlot14.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor31);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = categoryPlot33.getRenderer((int) '4');
        java.util.List list36 = categoryPlot33.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection37 = categoryPlot33.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray38 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot33.setRenderers(categoryItemRendererArray38);
        categoryPlot0.setRenderers(categoryItemRendererArray38);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNotNull(datasetRenderingOrder13);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(categoryAnchor31);
        org.junit.Assert.assertNull(categoryItemRenderer35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(legendItemCollection37);
        org.junit.Assert.assertNotNull(categoryItemRendererArray38);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        java.lang.Object obj10 = categoryPlot0.clone();
        java.awt.Paint paint11 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot0.getDomainAxis(11);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(categoryAxis13);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        java.awt.geom.Point2D point2D8 = null;
        categoryPlot0.zoomDomainAxes((double) ' ', (double) (short) 10, plotRenderingInfo7, point2D8);
        org.jfree.chart.util.SortOrder sortOrder10 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(sortOrder10);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup5 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot6.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor9 = categoryPlot6.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot6.getRendererForDataset(categoryDataset10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot6.getRangeAxisLocation(100);
        categoryPlot0.setDomainAxisLocation(axisLocation13);
        boolean boolean15 = categoryPlot0.isDomainZoomable();
        categoryPlot0.setBackgroundAlpha((float) (short) 0);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNull(categoryItemRenderer8);
        org.junit.Assert.assertNotNull(categoryAnchor9);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis13, true);
        int int16 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = categoryPlot0.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot0.getRendererForDataset(categoryDataset18);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot0.setRangeAxis((int) (byte) 100, valueAxis21, false);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(categoryItemRenderer19);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        categoryPlot17.setAnchorValue((double) (short) 1);
        double double24 = categoryPlot17.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot25 = categoryPlot17.getRootPlot();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot17);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot0.setDomainAxis(categoryAxis27);
        int int29 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        categoryPlot0.notifyListeners(plotChangeEvent13);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = categoryPlot15.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        int int18 = categoryPlot15.getDomainAxisIndex(categoryAxis17);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        categoryPlot15.setDomainAxis((int) (short) 100, categoryAxis20, false);
        java.awt.Image image23 = null;
        categoryPlot15.setBackgroundImage(image23);
        float float25 = categoryPlot15.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        categoryPlot26.markerChanged(markerChangeEvent27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        categoryPlot26.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo31, point2D32);
        categoryPlot26.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        categoryPlot36.markerChanged(markerChangeEvent37);
        org.jfree.chart.util.RectangleEdge rectangleEdge40 = categoryPlot36.getDomainAxisEdge((int) '4');
        categoryPlot36.setAnchorValue((double) (short) 1);
        double double43 = categoryPlot36.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot44 = categoryPlot36.getRootPlot();
        double double45 = categoryPlot36.getRangeCrosshairValue();
        categoryPlot26.setParent((org.jfree.chart.plot.Plot) categoryPlot36);
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = categoryPlot26.getInsets();
        categoryPlot15.setAxisOffset(rectangleInsets47);
        categoryPlot0.setInsets(rectangleInsets47, false);
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D51, rectangle2D52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(categoryAxis16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge40);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(plot44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets47);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.util.Layer layer17 = null;
        java.util.Collection collection18 = categoryPlot0.getRangeMarkers(10, layer17);
        java.util.List list19 = categoryPlot0.getCategories();
        org.jfree.data.category.CategoryDataset categoryDataset20 = categoryPlot0.getDataset();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot21.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        int int24 = categoryPlot21.getDomainAxisIndex(categoryAxis23);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        categoryPlot21.setDomainAxis((int) (short) 100, categoryAxis26, false);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = categoryPlot21.getRangeMarkers(layer29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray32 = new org.jfree.chart.axis.ValueAxis[] { valueAxis31 };
        categoryPlot21.setRangeAxes(valueAxisArray32);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray34 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot21.setDomainAxes(categoryAxisArray34);
        categoryPlot0.setDomainAxes(categoryAxisArray34);
        java.awt.Stroke stroke37 = categoryPlot0.getRangeGridlineStroke();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(list19);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertNotNull(valueAxisArray32);
        org.junit.Assert.assertNotNull(categoryAxisArray34);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot0.getRangeAxisEdge(0);
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(15, categoryItemRenderer10);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(rectangleEdge6);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot0.getRangeAxisLocation((int) '#');
        categoryPlot0.setWeight((int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis19 = categoryPlot0.getRangeAxis(0);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNull(valueAxis19);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.getFixedDomainAxisSpace();
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        int int16 = categoryPlot0.getIndexOf(categoryItemRenderer15);
        org.jfree.chart.axis.AxisSpace axisSpace17 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        int int21 = categoryPlot18.getDomainAxisIndex(categoryAxis20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot18.setDomainAxis((int) (short) 100, categoryAxis23, false);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot18.getRangeMarkers(layer26);
        categoryPlot18.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        int int31 = categoryPlot18.getDomainAxisIndex(categoryAxis30);
        categoryPlot18.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        boolean boolean39 = categoryPlot18.render(graphics2D35, rectangle2D36, (int) (byte) 10, plotRenderingInfo38);
        categoryPlot18.setRangeCrosshairLockedOnData(true);
        boolean boolean42 = categoryPlot18.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot43.setInsets(rectangleInsets44);
        org.jfree.chart.LegendItemCollection legendItemCollection46 = null;
        categoryPlot43.setFixedLegendItems(legendItemCollection46);
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        categoryPlot48.markerChanged(markerChangeEvent49);
        org.jfree.chart.util.RectangleEdge rectangleEdge52 = categoryPlot48.getDomainAxisEdge((int) '4');
        categoryPlot48.setAnchorValue((double) (short) 1);
        double double55 = categoryPlot48.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot56 = categoryPlot48.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray57 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot48.setRenderers(categoryItemRendererArray57);
        categoryPlot43.setRenderers(categoryItemRendererArray57);
        categoryPlot18.setRenderers(categoryItemRendererArray57);
        categoryPlot0.setRenderers(categoryItemRendererArray57);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent62 = null;
        categoryPlot0.markerChanged(markerChangeEvent62);
        org.jfree.chart.axis.AxisLocation axisLocation65 = categoryPlot0.getRangeAxisLocation((int) '4');
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(axisSpace17);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(rectangleEdge52);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(plot56);
        org.junit.Assert.assertNotNull(categoryItemRendererArray57);
        org.junit.Assert.assertNotNull(axisLocation65);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint1 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.setAnchorValue((double) (short) 10, true);
        categoryPlot0.mapDatasetToRangeAxis(0, 1);
        org.junit.Assert.assertNotNull(paint1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getDomainAxisEdge((-1));
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot17.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo22, point2D23);
        categoryPlot17.clearRangeMarkers((int) (short) -1);
        categoryPlot17.clearAnnotations();
        boolean boolean28 = categoryPlot0.equals((java.lang.Object) categoryPlot17);
        int int29 = categoryPlot17.getDatasetCount();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint1 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.setAnchorValue((double) (short) 10, true);
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset((int) '#', categoryDataset9);
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot18 = categoryPlot10.getRootPlot();
        double double19 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = categoryPlot0.getInsets();
        java.awt.Font font22 = categoryPlot0.getNoDataMessageFont();
        boolean boolean23 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10, false);
        java.lang.String str13 = categoryPlot0.getPlotType();
        categoryPlot0.setWeight((int) (byte) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray20 = new org.jfree.chart.axis.ValueAxis[] { valueAxis19 };
        categoryPlot16.setRangeAxes(valueAxisArray20);
        categoryPlot16.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot16.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint29 = categoryPlot28.getRangeGridlinePaint();
        categoryPlot16.setBackgroundPaint(paint29);
        java.util.List list31 = categoryPlot16.getAnnotations();
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot16.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation32, true);
        java.lang.String str35 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Category Plot" + "'", str13, "Category Plot");
        org.junit.Assert.assertNotNull(valueAxisArray20);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(axisLocation32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Category Plot" + "'", str35, "Category Plot");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot6.setInsets(rectangleInsets7);
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot6.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot11.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot11.getRangeAxisLocation();
        categoryPlot6.setDomainAxisLocation(axisLocation16, false);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot6.getRangeAxisLocation();
        categoryPlot0.setDomainAxisLocation(axisLocation19, false);
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setRangeCrosshairValue((double) (byte) 100);
        org.jfree.chart.plot.Plot plot25 = categoryPlot0.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        categoryPlot0.setDataset(categoryDataset26);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(plot25);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.setRangeCrosshairValue((double) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot0.getInsets();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        categoryPlot0.addChangeListener(plotChangeListener17);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot0.setRenderer((int) (short) 1, categoryItemRenderer20);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = categoryPlot0.getRangeAxisEdge((int) (short) 0);
        java.awt.Paint paint6 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearRangeMarkers();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        categoryPlot4.drawBackgroundImage(graphics2D6, rectangle2D7);
        categoryPlot4.setForegroundAlpha((float) 0L);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        java.util.List list10 = categoryPlot0.getCategories();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot11.getDomainAxisEdge((int) '4');
        categoryPlot11.setAnchorValue((double) (short) 1);
        double double18 = categoryPlot11.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot19 = categoryPlot11.getRootPlot();
        double double20 = categoryPlot11.getRangeCrosshairValue();
        int int21 = categoryPlot11.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot11.getRangeAxisLocation((int) ' ');
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        categoryPlot11.datasetChanged(datasetChangeEvent24);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        categoryPlot11.setRangeAxis(valueAxis26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = categoryPlot11.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier28);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNotNull(drawingSupplier28);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        categoryPlot0.addChangeListener(plotChangeListener11);
        java.util.List list13 = categoryPlot0.getCategories();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot0.getDomainAxisIndex(categoryAxis14);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot0.setRangeAxis(0, valueAxis17);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = null;
        categoryPlot0.setDomainAxis(categoryAxis3);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairValue((double) 10, false);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(categoryDataset9);
        boolean boolean11 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        categoryPlot0.notifyListeners(plotChangeEvent13);
        categoryPlot0.setDomainGridlinesVisible(true);
        categoryPlot0.setDomainGridlinesVisible(true);
        java.awt.Paint paint19 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        int int15 = categoryPlot0.getWeight();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis((int) (short) 1, categoryAxis17);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 1, (int) (byte) -1);
        categoryPlot0.setWeight((int) (byte) 100);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        java.lang.Object obj10 = categoryPlot0.clone();
        java.awt.Paint paint11 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        categoryPlot0.notifyListeners(plotChangeEvent12);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(categoryItemRenderer14);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        boolean boolean10 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisSpace axisSpace11 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace11);
        categoryPlot0.setRangeCrosshairValue((double) '#', true);
        categoryPlot0.setNoDataMessage("Category Plot");
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearRangeMarkers();
        java.awt.Paint paint6 = categoryPlot4.getOutlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis8 = categoryPlot4.getRangeAxis((int) (byte) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        categoryPlot9.markerChanged(markerChangeEvent10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot9.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo14, point2D15);
        categoryPlot9.clearRangeMarkers((int) (short) -1);
        categoryPlot9.clearAnnotations();
        categoryPlot9.clearRangeMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot9.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        categoryPlot23.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        categoryPlot23.addChangeListener(plotChangeListener27);
        categoryPlot23.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        categoryPlot31.markerChanged(markerChangeEvent32);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot31.getDomainAxisEdge((int) '4');
        categoryPlot31.setAnchorValue((double) (short) 1);
        categoryPlot31.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        java.awt.geom.Point2D point2D42 = null;
        categoryPlot31.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo41, point2D42);
        java.awt.Image image44 = categoryPlot31.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        java.awt.geom.Point2D point2D47 = null;
        categoryPlot31.zoomDomainAxes((double) '#', plotRenderingInfo46, point2D47);
        org.jfree.chart.axis.AxisLocation axisLocation50 = categoryPlot31.getRangeAxisLocation((int) '#');
        categoryPlot23.setDomainAxisLocation((int) 'a', axisLocation50, true);
        categoryPlot9.setDomainAxisLocation((int) (byte) 100, axisLocation50, false);
        categoryPlot4.setDomainAxisLocation(axisLocation50, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot57.setInsets(rectangleInsets58);
        org.jfree.chart.axis.AxisLocation axisLocation61 = categoryPlot57.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup62 = categoryPlot57.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot63 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent64 = null;
        categoryPlot63.markerChanged(markerChangeEvent64);
        org.jfree.chart.axis.ValueAxis valueAxis66 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray67 = new org.jfree.chart.axis.ValueAxis[] { valueAxis66 };
        categoryPlot63.setRangeAxes(valueAxisArray67);
        categoryPlot63.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean72 = categoryPlot63.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation73 = categoryPlot63.getDomainAxisLocation();
        categoryPlot57.setRangeAxisLocation(axisLocation73, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets76 = categoryPlot57.getInsets();
        categoryPlot4.setAxisOffset(rectangleInsets76);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertNotNull(axisLocation50);
        org.junit.Assert.assertNotNull(rectangleInsets58);
        org.junit.Assert.assertNotNull(axisLocation61);
        org.junit.Assert.assertNull(datasetGroup62);
        org.junit.Assert.assertNotNull(valueAxisArray67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(axisLocation73);
        org.junit.Assert.assertNotNull(rectangleInsets76);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot7.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        int int10 = categoryPlot7.getDomainAxisIndex(categoryAxis9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot7.setDomainAxis((int) (short) 100, categoryAxis12, false);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot7.getRangeMarkers(layer15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] { valueAxis17 };
        categoryPlot7.setRangeAxes(valueAxisArray18);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot7.setDomainAxes(categoryAxisArray20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot7.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation22, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor25 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot0.setRenderer(categoryItemRenderer26, true);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(categoryAnchor25);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray23 = new org.jfree.chart.axis.ValueAxis[] { valueAxis22 };
        categoryPlot19.setRangeAxes(valueAxisArray23);
        categoryPlot19.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot19.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot19.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot19.getRangeAxisLocation((int) '#');
        categoryPlot19.setWeight((int) (byte) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = categoryPlot19.getDrawingSupplier();
        java.awt.Stroke stroke38 = categoryPlot19.getDomainGridlineStroke();
        categoryPlot0.setOutlineStroke(stroke38);
        categoryPlot0.mapDatasetToRangeAxis(0, 15);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(valueAxisArray23);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNotNull(drawingSupplier37);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot10.getRangeMarkers(layer19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot10.getRendererForDataset(categoryDataset21);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNull(categoryItemRenderer22);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        categoryPlot0.setAnchorValue((double) 10.0f);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        boolean boolean13 = categoryPlot0.isRangeCrosshairVisible();
        double double14 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        java.lang.String str16 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot0.zoomRangeAxes((double) 10.0f, plotRenderingInfo18, point2D19);
        java.lang.Object obj21 = categoryPlot0.clone();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        categoryPlot0.addChangeListener(plotChangeListener22);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        org.jfree.chart.axis.AxisSpace axisSpace15 = categoryPlot0.getFixedDomainAxisSpace();
        java.awt.Paint paint16 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(axisSpace15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray14 = new org.jfree.chart.axis.ValueAxis[] { valueAxis13 };
        categoryPlot10.setRangeAxes(valueAxisArray14);
        categoryPlot10.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean19 = categoryPlot10.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation20 = categoryPlot10.getDomainAxisLocation();
        categoryPlot6.setDomainAxisLocation((int) (byte) 1, axisLocation20, false);
        categoryPlot0.setDomainAxisLocation(axisLocation20);
        org.jfree.chart.axis.AxisSpace axisSpace24 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = categoryPlot0.getDomainAxisForDataset((int) (byte) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection27 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNotNull(valueAxisArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(axisSpace24);
        org.junit.Assert.assertNull(categoryAxis26);
        org.junit.Assert.assertNotNull(legendItemCollection27);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation11 = categoryPlot0.getOrientation();
        double double12 = categoryPlot0.getAnchorValue();
        categoryPlot0.setNoDataMessage("Category Plot");
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(plotOrientation11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot15.setInsets(rectangleInsets16);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = null;
        categoryPlot15.setFixedLegendItems(legendItemCollection18);
        java.awt.Paint paint20 = categoryPlot15.getNoDataMessagePaint();
        categoryPlot14.setBackgroundPaint(paint20);
        categoryPlot0.setRangeGridlinePaint(paint20);
        categoryPlot0.setAnchorValue((double) 1);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation9 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot10.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot10.getDomainAxisIndex(categoryAxis12);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        int int15 = categoryPlot10.getIndexOf(categoryItemRenderer14);
        org.jfree.chart.plot.Plot plot16 = categoryPlot10.getParent();
        java.awt.Font font17 = categoryPlot10.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font17);
        boolean boolean19 = categoryPlot0.isDomainZoomable();
        org.jfree.chart.plot.CategoryMarker categoryMarker20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNotNull(plotOrientation9);
        org.junit.Assert.assertNull(categoryAxis11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot12.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot12.getDomainAxisIndex(categoryAxis14);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot12.setDomainAxis((int) (short) 100, categoryAxis17, false);
        java.awt.Image image20 = null;
        categoryPlot12.setBackgroundImage(image20);
        float float22 = categoryPlot12.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot23.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo28, point2D29);
        categoryPlot23.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        categoryPlot33.markerChanged(markerChangeEvent34);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = categoryPlot33.getDomainAxisEdge((int) '4');
        categoryPlot33.setAnchorValue((double) (short) 1);
        double double40 = categoryPlot33.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot41 = categoryPlot33.getRootPlot();
        double double42 = categoryPlot33.getRangeCrosshairValue();
        categoryPlot23.setParent((org.jfree.chart.plot.Plot) categoryPlot33);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = categoryPlot23.getInsets();
        categoryPlot12.setAxisOffset(rectangleInsets44);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot12);
        org.jfree.chart.axis.AxisSpace axisSpace47 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace47);
        categoryPlot0.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        categoryPlot0.setDataset(categoryDataset51);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets44);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets11, true);
        categoryPlot0.setWeight((int) (short) 0);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Paint paint9 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge();
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        categoryPlot0.mapDatasetToDomainAxis((int) 'a', 11);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        float float5 = categoryPlot0.getForegroundAlpha();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis9 = categoryPlot0.getRangeAxis();
        int int10 = categoryPlot0.getBackgroundImageAlignment();
        java.awt.Paint paint11 = categoryPlot0.getBackgroundPaint();
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = plot6.isSubplot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot18 = categoryPlot10.getRootPlot();
        double double19 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = categoryPlot0.getInsets();
        java.awt.Font font22 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setInsets(rectangleInsets23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot7.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        int int10 = categoryPlot7.getDomainAxisIndex(categoryAxis9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot7.setDomainAxis((int) (short) 100, categoryAxis12, false);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot7.getRangeMarkers(layer15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] { valueAxis17 };
        categoryPlot7.setRangeAxes(valueAxisArray18);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot7.setDomainAxes(categoryAxisArray20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot7.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation22, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor25 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.data.Range range27 = categoryPlot0.getDataRange(valueAxis26);
        float float28 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(categoryAnchor25);
        org.junit.Assert.assertNull(range27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot10.getRenderer((int) '4');
        java.util.List list13 = categoryPlot10.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = categoryPlot10.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot15.getDomainAxisEdge((int) '4');
        categoryPlot15.setAnchorValue((double) (short) 1);
        double double22 = categoryPlot15.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot23 = categoryPlot15.getRootPlot();
        double double24 = categoryPlot15.getRangeCrosshairValue();
        int int25 = categoryPlot15.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot15.getRangeAxisLocation((int) ' ');
        categoryPlot10.setDomainAxisLocation(axisLocation27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        categoryPlot10.notifyListeners(plotChangeEvent29);
        java.awt.Stroke stroke31 = categoryPlot10.getRangeGridlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke31);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = null;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) '#', layer2);
        java.awt.Stroke stroke4 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot5.setRenderer(categoryItemRenderer12);
        java.awt.Paint paint14 = categoryPlot5.getRangeCrosshairPaint();
        categoryPlot0.setNoDataMessagePaint(paint14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot16.setInsets(rectangleInsets17);
        org.jfree.chart.LegendItemCollection legendItemCollection19 = null;
        categoryPlot16.setFixedLegendItems(legendItemCollection19);
        java.lang.Object obj21 = categoryPlot16.clone();
        categoryPlot16.setDrawSharedDomainAxis(true);
        java.awt.Paint paint24 = categoryPlot16.getDomainGridlinePaint();
        categoryPlot0.setNoDataMessagePaint(paint24);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot0.getRangeMarkers(layer26);
        boolean boolean28 = categoryPlot0.isDomainGridlinesVisible();
        java.awt.Paint paint29 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray14 = new org.jfree.chart.axis.ValueAxis[] { valueAxis13 };
        categoryPlot10.setRangeAxes(valueAxisArray14);
        categoryPlot0.setRangeAxes(valueAxisArray14);
        java.lang.Object obj17 = categoryPlot0.clone();
        categoryPlot0.setAnchorValue((double) '#', true);
        java.awt.Paint paint21 = categoryPlot0.getBackgroundPaint();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        double double13 = categoryPlot0.getAnchorValue();
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers(100, layer15);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.String str5 = categoryPlot0.getPlotType();
        boolean boolean6 = categoryPlot0.isSubplot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        categoryPlot0.removeChangeListener(plotChangeListener7);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Category Plot" + "'", str5, "Category Plot");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getRangeAxisLocation((int) (byte) -1);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        int int18 = categoryPlot0.getDomainAxisIndex(categoryAxis17);
        java.util.List list19 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(list19);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent10 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent10);
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = categoryPlot0.getRangeMarkers(layer12);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection13);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.awt.Paint paint5 = categoryPlot0.getNoDataMessagePaint();
        java.awt.Paint paint6 = categoryPlot0.getDomainGridlinePaint();
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.AxisSpace axisSpace9 = categoryPlot0.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(axisSpace9);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        categoryPlot0.drawBackgroundImage(graphics2D10, rectangle2D11);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 0, 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray20 = new org.jfree.chart.axis.ValueAxis[] { valueAxis19 };
        categoryPlot16.setRangeAxes(valueAxisArray20);
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        categoryPlot16.setDomainGridlinePaint(paint22);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        categoryPlot24.markerChanged(markerChangeEvent25);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot24.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation29 = categoryPlot24.getRangeAxisLocation();
        java.awt.Stroke stroke30 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot24.setRangeCrosshairStroke(stroke30);
        categoryPlot16.setRangeCrosshairStroke(stroke30);
        categoryPlot0.setOutlineStroke(stroke30);
        org.jfree.chart.util.Layer layer35 = null;
        java.util.Collection collection36 = categoryPlot0.getRangeMarkers(100, layer35);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(valueAxisArray20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(collection36);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.clearAnnotations();
        categoryPlot0.clearRangeMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot0.getRenderer();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        categoryPlot0.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot16.getRenderer((int) '4');
        java.util.List list19 = categoryPlot16.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = categoryPlot16.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = categoryPlot16.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier21);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertNull(categoryItemRenderer18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertNotNull(drawingSupplier21);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = null;
        java.util.List list4 = categoryPlot0.getCategoriesForAxis(categoryAxis3);
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = categoryPlot0.getRangeMarkers((int) ' ', layer6);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(collection7);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        int int9 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray14 = new org.jfree.chart.axis.ValueAxis[] { valueAxis13 };
        categoryPlot10.setRangeAxes(valueAxisArray14);
        categoryPlot0.setRangeAxes(valueAxisArray14);
        double double17 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot0.getDomainAxisLocation((int) (short) 1);
        java.awt.Image image20 = null;
        categoryPlot0.setBackgroundImage(image20);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, (int) (byte) 10, plotRenderingInfo20);
        java.awt.Image image22 = null;
        categoryPlot0.setBackgroundImage(image22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomDomainAxes(0.0d, (double) (-1L), plotRenderingInfo26, point2D27);
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        categoryPlot0.setDomainAxis(11, categoryAxis30);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot18 = categoryPlot10.getRootPlot();
        double double19 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot10.getRangeAxisEdge();
        categoryPlot10.clearAnnotations();
        org.jfree.chart.plot.CategoryMarker categoryMarker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot10.addDomainMarker(categoryMarker23, layer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleEdge21);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearRangeMarkers();
        java.awt.Paint paint6 = categoryPlot4.getOutlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis8 = categoryPlot4.getRangeAxis((int) (byte) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        categoryPlot9.markerChanged(markerChangeEvent10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot9.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo14, point2D15);
        categoryPlot9.clearRangeMarkers((int) (short) -1);
        categoryPlot9.clearAnnotations();
        categoryPlot9.clearRangeMarkers();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot9.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        categoryPlot23.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        categoryPlot23.addChangeListener(plotChangeListener27);
        categoryPlot23.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        categoryPlot31.markerChanged(markerChangeEvent32);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot31.getDomainAxisEdge((int) '4');
        categoryPlot31.setAnchorValue((double) (short) 1);
        categoryPlot31.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        java.awt.geom.Point2D point2D42 = null;
        categoryPlot31.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo41, point2D42);
        java.awt.Image image44 = categoryPlot31.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        java.awt.geom.Point2D point2D47 = null;
        categoryPlot31.zoomDomainAxes((double) '#', plotRenderingInfo46, point2D47);
        org.jfree.chart.axis.AxisLocation axisLocation50 = categoryPlot31.getRangeAxisLocation((int) '#');
        categoryPlot23.setDomainAxisLocation((int) 'a', axisLocation50, true);
        categoryPlot9.setDomainAxisLocation((int) (byte) 100, axisLocation50, false);
        categoryPlot4.setDomainAxisLocation(axisLocation50, false);
        java.lang.Class<?> wildcardClass57 = axisLocation50.getClass();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertNotNull(axisLocation50);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot10.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation((int) (byte) 0, axisLocation15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker((int) (byte) 0, marker19, layer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = categoryPlot0.getDatasetRenderingOrder();
        categoryPlot0.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
        org.junit.Assert.assertNotNull(drawingSupplier10);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray9 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot0.setRenderers(categoryItemRendererArray9);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = categoryPlot0.removeAnnotation(categoryAnnotation11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot0.getRendererForDataset(categoryDataset16);
        java.lang.String str18 = categoryPlot0.getPlotType();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot0.getDomainAxis(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        categoryPlot21.markerChanged(markerChangeEvent22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot21.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo26, point2D27);
        categoryPlot21.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        categoryPlot31.markerChanged(markerChangeEvent32);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot31.getDomainAxisEdge((int) '4');
        categoryPlot31.setAnchorValue((double) (short) 1);
        double double38 = categoryPlot31.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot39 = categoryPlot31.getRootPlot();
        double double40 = categoryPlot31.getRangeCrosshairValue();
        categoryPlot21.setParent((org.jfree.chart.plot.Plot) categoryPlot31);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = categoryPlot21.getInsets();
        categoryPlot0.setInsets(rectangleInsets42, true);
        java.awt.Paint paint45 = categoryPlot0.getRangeGridlinePaint();
        int int46 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Category Plot" + "'", str18, "Category Plot");
        org.junit.Assert.assertNull(categoryAxis20);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(plot39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        boolean boolean12 = categoryPlot0.isRangeCrosshairVisible();
        java.lang.Object obj13 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = null;
        categoryPlot0.setDomainAxis(categoryAxis3);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        java.lang.Object obj6 = categoryPlot0.clone();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        categoryPlot0.setRangeAxis((int) (short) 1, valueAxis8);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot27 = categoryPlot19.getRootPlot();
        double double28 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot19.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        categoryPlot19.setDomainAxis(10, categoryAxis31, false);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        categoryPlot0.notifyListeners(plotChangeEvent35);
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.util.Layer layer39 = null;
        java.util.Collection collection40 = categoryPlot0.getRangeMarkers(layer39);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertNull(collection40);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        boolean boolean14 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot16.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot16.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot16.setDomainAxis((int) (short) 100, categoryAxis21, false);
        java.awt.Image image24 = null;
        categoryPlot16.setBackgroundImage(image24);
        categoryPlot16.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot16.getRangeAxis((int) (byte) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        categoryPlot16.setRenderer(categoryItemRenderer31, true);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot16);
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = categoryPlot0.getDomainAxis((int) (byte) 0);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNull(categoryAxis36);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        int int10 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot27 = categoryPlot19.getRootPlot();
        double double28 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot19.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        categoryPlot19.setDomainAxis(10, categoryAxis31, false);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        double double35 = categoryPlot19.getAnchorValue();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(categoryItemRenderer8, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray19 = new org.jfree.chart.axis.ValueAxis[] { valueAxis18 };
        categoryPlot15.setRangeAxes(valueAxisArray19);
        categoryPlot15.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean24 = categoryPlot15.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot15.getDomainAxisLocation();
        categoryPlot11.setDomainAxisLocation((int) (byte) 1, axisLocation25, false);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray28 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot11.setDomainAxes(categoryAxisArray28);
        categoryPlot0.setDomainAxes(categoryAxisArray28);
        java.awt.Stroke stroke31 = categoryPlot0.getOutlineStroke();
        double double32 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(valueAxisArray19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(categoryAxisArray28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Paint paint9 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getRangeAxisEdge();
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        boolean boolean13 = categoryPlot0.getDrawSharedDomainAxis();
        int int14 = categoryPlot0.getBackgroundImageAlignment();
        boolean boolean15 = categoryPlot0.isRangeZoomable();
        java.awt.Paint paint16 = categoryPlot0.getRangeCrosshairPaint();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        categoryPlot0.setRangeCrosshairPaint(paint15);
        java.awt.Paint paint18 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot27 = categoryPlot19.getRootPlot();
        double double28 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset29 = categoryPlot19.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        categoryPlot19.setDomainAxis(10, categoryAxis31, false);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        categoryPlot0.notifyListeners(plotChangeEvent35);
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        categoryPlot0.addChangeListener(plotChangeListener37);
        java.awt.Image image39 = categoryPlot0.getBackgroundImage();
        double double40 = categoryPlot0.getAnchorValue();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertNull(image39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint13 = categoryPlot12.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint13);
        java.util.List list15 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot0.getDomainAxisEdge();
        categoryPlot0.setBackgroundAlpha(0.0f);
        java.lang.Object obj20 = categoryPlot0.clone();
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = categoryPlot0.getRangeMarkers((int) (byte) 1, layer22);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(collection23);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent13);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot15.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation19, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot22.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        int int25 = categoryPlot22.getDomainAxisIndex(categoryAxis24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot22.setDomainAxis((int) (short) 100, categoryAxis27, false);
        org.jfree.chart.util.Layer layer30 = null;
        java.util.Collection collection31 = categoryPlot22.getRangeMarkers(layer30);
        categoryPlot22.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot22.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder34);
        categoryPlot0.configureDomainAxes();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        boolean boolean41 = categoryPlot0.render(graphics2D37, rectangle2D38, (int) (byte) 10, plotRenderingInfo40);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = categoryPlot0.getRenderer();
        java.awt.Stroke stroke43 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(collection31);
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(categoryItemRenderer42);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent8 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent8);
        int int10 = categoryPlot0.getDatasetCount();
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        categoryPlot13.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        categoryPlot13.addChangeListener(plotChangeListener17);
        categoryPlot13.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        categoryPlot21.markerChanged(markerChangeEvent22);
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot21.getDomainAxisEdge((int) '4');
        categoryPlot21.setAnchorValue((double) (short) 1);
        categoryPlot21.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        categoryPlot21.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo31, point2D32);
        java.awt.Image image34 = categoryPlot21.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        java.awt.geom.Point2D point2D37 = null;
        categoryPlot21.zoomDomainAxes((double) '#', plotRenderingInfo36, point2D37);
        org.jfree.chart.axis.AxisLocation axisLocation40 = categoryPlot21.getRangeAxisLocation((int) '#');
        categoryPlot13.setDomainAxisLocation((int) 'a', axisLocation40, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot43.setInsets(rectangleInsets44);
        java.awt.Stroke stroke46 = categoryPlot43.getRangeGridlineStroke();
        categoryPlot43.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation50 = categoryPlot43.getRangeAxisLocation((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent52 = null;
        categoryPlot51.markerChanged(markerChangeEvent52);
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray55 = new org.jfree.chart.axis.ValueAxis[] { valueAxis54 };
        categoryPlot51.setRangeAxes(valueAxisArray55);
        categoryPlot51.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot51.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.PlotOrientation plotOrientation63 = categoryPlot51.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge64 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation50, plotOrientation63);
        org.jfree.chart.util.RectangleEdge rectangleEdge65 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation40, plotOrientation63);
        categoryPlot0.setDomainAxisLocation(axisLocation40);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNull(image34);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(axisLocation50);
        org.junit.Assert.assertNotNull(valueAxisArray55);
        org.junit.Assert.assertNotNull(plotOrientation63);
        org.junit.Assert.assertNotNull(rectangleEdge64);
        org.junit.Assert.assertNotNull(rectangleEdge65);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot0.setDataset(10, categoryDataset22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = null;
        categoryPlot0.setRenderer(categoryItemRenderer26);
        java.awt.Image image28 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        categoryPlot29.markerChanged(markerChangeEvent30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot29.getDomainAxisEdge((int) '4');
        categoryPlot29.setAnchorValue((double) (short) 1);
        categoryPlot29.setRangeCrosshairValue((double) (byte) -1, true);
        org.jfree.chart.util.SortOrder sortOrder39 = categoryPlot29.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder39);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(sortOrder39);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        categoryPlot0.setRangeCrosshairVisible(true);
        org.jfree.chart.util.SortOrder sortOrder11 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace12);
        categoryPlot0.setAnchorValue((double) (byte) 0, true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sortOrder11);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (short) 100);
        org.jfree.chart.util.Layer layer12 = null;
        java.util.Collection collection13 = categoryPlot0.getDomainMarkers(layer12);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(0, valueAxis15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        categoryPlot17.setAnchorValue((double) (short) 1);
        double double24 = categoryPlot17.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        categoryPlot17.setDomainAxis((int) '4', categoryAxis26);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        categoryPlot17.setDataset(1, categoryDataset29);
        boolean boolean31 = categoryPlot0.equals((java.lang.Object) categoryPlot17);
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = categoryPlot0.getDomainMarkers(layer32);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(collection13);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(collection33);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 100);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot7.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        int int10 = categoryPlot7.getDomainAxisIndex(categoryAxis9);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        categoryPlot7.setDomainAxis((int) (short) 100, categoryAxis12, false);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot7.getRangeMarkers(layer15);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray18 = new org.jfree.chart.axis.ValueAxis[] { valueAxis17 };
        categoryPlot7.setRangeAxes(valueAxisArray18);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot7.setDomainAxes(categoryAxisArray20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot7.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation22, false);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor25 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.data.Range range27 = categoryPlot0.getDataRange(valueAxis26);
        java.util.List list28 = categoryPlot0.getCategories();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder29 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(valueAxisArray18);
        org.junit.Assert.assertNotNull(categoryAxisArray20);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(categoryAnchor25);
        org.junit.Assert.assertNull(range27);
        org.junit.Assert.assertNull(list28);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        categoryPlot8.markerChanged(markerChangeEvent9);
        categoryPlot8.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot8.getDomainAxisLocation();
        boolean boolean13 = categoryPlot8.isOutlineVisible();
        java.awt.Stroke stroke14 = categoryPlot8.getDomainGridlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.awt.Image image17 = null;
        categoryPlot0.setBackgroundImage(image17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        categoryPlot0.setDataset(categoryDataset19);
        org.jfree.chart.util.SortOrder sortOrder21 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        categoryPlot0.setRangeAxis(valueAxis22);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        categoryPlot0.removeChangeListener(plotChangeListener24);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(sortOrder21);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D17, rectangle2D18, (int) (byte) 10, plotRenderingInfo20);
        java.awt.Image image22 = null;
        categoryPlot0.setBackgroundImage(image22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomDomainAxes(0.0d, (double) (-1L), plotRenderingInfo26, point2D27);
        int int29 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot30.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        int int33 = categoryPlot30.getDomainAxisIndex(categoryAxis32);
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        categoryPlot30.setDomainAxis((int) (short) 100, categoryAxis35, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        int int39 = categoryPlot30.getIndexOf(categoryItemRenderer38);
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        categoryPlot30.setDomainAxis(categoryAxis40);
        categoryPlot30.setWeight(15);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = categoryPlot30.getAxisOffset();
        boolean boolean45 = categoryPlot0.equals((java.lang.Object) rectangleInsets44);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(categoryAxis31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        categoryPlot0.mapDatasetToRangeAxis((int) '4', (int) (byte) 1);
        int int7 = categoryPlot0.getWeight();
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 100, 1);
        categoryPlot0.setNoDataMessage("");
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot0.getFixedLegendItems();
        int int14 = categoryPlot0.getWeight();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        int int5 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = categoryPlot0.removeAnnotation(categoryAnnotation6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot0.setDomainAxis((int) (short) 1, categoryAxis14);
        categoryPlot0.setNoDataMessage("hi!");
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        categoryPlot0.setRangeCrosshairValue((double) (short) 10, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot7.setRangeAxes(valueAxisArray11);
        categoryPlot7.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot17.setInsets(rectangleInsets18);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = null;
        categoryPlot17.setFixedLegendItems(legendItemCollection20);
        java.awt.Paint paint22 = categoryPlot17.getNoDataMessagePaint();
        categoryPlot16.setBackgroundPaint(paint22);
        categoryPlot7.setRangeCrosshairPaint(paint22);
        java.awt.Paint paint25 = categoryPlot7.getRangeCrosshairPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        categoryPlot26.markerChanged(markerChangeEvent27);
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = categoryPlot26.getDomainAxisEdge((int) '4');
        categoryPlot26.setAnchorValue((double) (short) 1);
        double double33 = categoryPlot26.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot34 = categoryPlot26.getRootPlot();
        double double35 = categoryPlot26.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset36 = categoryPlot26.getDataset();
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        categoryPlot26.setDomainAxis(10, categoryAxis38, false);
        categoryPlot7.setParent((org.jfree.chart.plot.Plot) categoryPlot26);
        org.jfree.chart.util.SortOrder sortOrder42 = categoryPlot7.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder42);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(plot34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset36);
        org.junit.Assert.assertNotNull(sortOrder42);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray5 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot0.setRenderers(categoryItemRendererArray5);
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(categoryItemRendererArray5);
        org.junit.Assert.assertNotNull(legendItemCollection7);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Paint paint13 = categoryPlot12.getRangeGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint13);
        java.util.List list15 = categoryPlot0.getAnnotations();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        categoryPlot0.setDataset(categoryDataset16);
        int int18 = categoryPlot0.getRangeAxisCount();
        boolean boolean19 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 1, plotRenderingInfo21, point2D22);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot0.setDomainAxis((int) (short) 0, categoryAxis11);
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(0, categoryItemRenderer15);
        org.jfree.chart.plot.Plot plot17 = categoryPlot0.getRootPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        categoryPlot19.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot19.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo29, point2D30);
        java.awt.Image image32 = categoryPlot19.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        java.awt.geom.Point2D point2D35 = null;
        categoryPlot19.zoomDomainAxes((double) '#', plotRenderingInfo34, point2D35);
        org.jfree.chart.axis.AxisLocation axisLocation38 = categoryPlot19.getRangeAxisLocation((int) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = categoryPlot39.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = null;
        int int42 = categoryPlot39.getDomainAxisIndex(categoryAxis41);
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        categoryPlot39.setDomainAxis((int) (short) 100, categoryAxis44, false);
        org.jfree.chart.util.Layer layer47 = null;
        java.util.Collection collection48 = categoryPlot39.getRangeMarkers(layer47);
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray50 = new org.jfree.chart.axis.ValueAxis[] { valueAxis49 };
        categoryPlot39.setRangeAxes(valueAxisArray50);
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.data.Range range53 = categoryPlot39.getDataRange(valueAxis52);
        org.jfree.chart.plot.PlotOrientation plotOrientation54 = categoryPlot39.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge55 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation38, plotOrientation54);
        categoryPlot0.setDomainAxisLocation(0, axisLocation38, false);
        org.jfree.chart.util.Layer layer59 = null;
        java.util.Collection collection60 = categoryPlot0.getDomainMarkers((int) (short) 1, layer59);
        float float61 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(plotOrientation13);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertNotNull(axisLocation38);
        org.junit.Assert.assertNull(categoryAxis40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(collection48);
        org.junit.Assert.assertNotNull(valueAxisArray50);
        org.junit.Assert.assertNull(range53);
        org.junit.Assert.assertNotNull(plotOrientation54);
        org.junit.Assert.assertNotNull(rectangleEdge55);
        org.junit.Assert.assertNull(collection60);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 1.0f + "'", float61 == 1.0f);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        boolean boolean10 = categoryPlot0.isSubplot();
        java.lang.String str11 = categoryPlot0.getPlotType();
        categoryPlot0.mapDatasetToRangeAxis(10, 101);
        org.jfree.chart.axis.AxisSpace axisSpace15 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Category Plot" + "'", str11, "Category Plot");
        org.junit.Assert.assertNull(axisSpace15);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        boolean boolean9 = categoryPlot0.isOutlineVisible();
        java.lang.String str10 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot12.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot12.getDomainAxisIndex(categoryAxis14);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot12.setDomainAxis((int) (short) 100, categoryAxis17, false);
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot12.getRangeMarkers(layer20);
        categoryPlot12.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        int int25 = categoryPlot12.getDomainAxisIndex(categoryAxis24);
        categoryPlot12.setAnchorValue((double) 10L, true);
        java.awt.Image image29 = null;
        categoryPlot12.setBackgroundImage(image29);
        float float31 = categoryPlot12.getForegroundAlpha();
        java.awt.Paint paint32 = categoryPlot12.getBackgroundPaint();
        categoryPlot0.setDomainGridlinePaint(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(categoryAxis11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        categoryPlot0.notifyListeners(plotChangeEvent13);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        categoryPlot0.addChangeListener(plotChangeListener15);
        java.awt.Paint paint17 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        java.awt.Paint paint14 = categoryPlot0.getRangeCrosshairPaint();
        boolean boolean15 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot0.setRangeAxis(101, valueAxis17);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        double double14 = categoryPlot5.getRangeCrosshairValue();
        int int15 = categoryPlot5.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot5.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        categoryPlot0.setBackgroundAlpha((float) 15);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot21.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        int int24 = categoryPlot21.getDomainAxisIndex(categoryAxis23);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        categoryPlot21.setDomainAxis((int) (short) 100, categoryAxis26, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        int int30 = categoryPlot21.getDomainAxisIndex(categoryAxis29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.data.Range range32 = categoryPlot21.getDataRange(valueAxis31);
        categoryPlot21.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean36 = categoryPlot21.isSubplot();
        java.awt.Paint paint37 = categoryPlot21.getOutlinePaint();
        java.awt.Paint paint38 = categoryPlot21.getNoDataMessagePaint();
        categoryPlot0.setBackgroundPaint(paint38);
        org.jfree.chart.axis.AxisSpace axisSpace40 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace40);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = categoryPlot42.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = null;
        int int45 = categoryPlot42.getDomainAxisIndex(categoryAxis44);
        java.awt.Paint paint46 = categoryPlot42.getRangeCrosshairPaint();
        categoryPlot0.setNoDataMessagePaint(paint46);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(range32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(categoryAxis43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        int int15 = categoryPlot0.getWeight();
        categoryPlot0.setRangeCrosshairValue(0.0d);
        categoryPlot0.clearDomainMarkers();
        java.lang.String str19 = categoryPlot0.getPlotType();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        categoryPlot0.setRenderer(categoryItemRenderer20);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Category Plot" + "'", str19, "Category Plot");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot0.markerChanged(markerChangeEvent15);
        categoryPlot0.setBackgroundAlpha((float) (short) 1);
        categoryPlot0.mapDatasetToDomainAxis(11, 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryPlot0.getInsets();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.handleClick((int) (short) 1, (int) (byte) 10, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = categoryPlot4.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        int int7 = categoryPlot4.getDomainAxisIndex(categoryAxis6);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot4.setDomainAxis((int) (short) 100, categoryAxis9, false);
        java.awt.Image image12 = null;
        categoryPlot4.setBackgroundImage(image12);
        float float14 = categoryPlot4.getBackgroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        java.awt.geom.Point2D point2D21 = null;
        categoryPlot15.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo20, point2D21);
        categoryPlot15.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        categoryPlot25.markerChanged(markerChangeEvent26);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot25.getDomainAxisEdge((int) '4');
        categoryPlot25.setAnchorValue((double) (short) 1);
        double double32 = categoryPlot25.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot33 = categoryPlot25.getRootPlot();
        double double34 = categoryPlot25.getRangeCrosshairValue();
        categoryPlot15.setParent((org.jfree.chart.plot.Plot) categoryPlot25);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = categoryPlot15.getInsets();
        categoryPlot4.setAxisOffset(rectangleInsets36);
        categoryPlot0.setAxisOffset(rectangleInsets36);
        float float39 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(categoryAxis5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(plot33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean9 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation10 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        categoryPlot11.markerChanged(markerChangeEvent12);
        categoryPlot11.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation15 = categoryPlot11.getDomainAxisLocation();
        categoryPlot0.setRangeAxisLocation(axisLocation15, true);
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot0.getFixedRangeAxisSpace();
        categoryPlot0.setBackgroundAlpha(100.0f);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNull(axisSpace18);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Stroke stroke9 = categoryPlot0.getDomainGridlineStroke();
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.util.SortOrder sortOrder12 = categoryPlot0.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(sortOrder12);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        double double17 = categoryPlot10.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot18 = categoryPlot10.getRootPlot();
        double double19 = categoryPlot10.getRangeCrosshairValue();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = categoryPlot0.getInsets();
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = categoryPlot0.getRangeMarkers(10, layer23);
        categoryPlot0.clearDomainMarkers((int) 'a');
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNull(collection24);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        java.awt.Paint paint6 = categoryPlot0.getNoDataMessagePaint();
        categoryPlot0.setBackgroundImageAlignment(15);
        categoryPlot0.setOutlineVisible(false);
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis13, true);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot17.setInsets(rectangleInsets18);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot17.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup22 = categoryPlot17.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray27 = new org.jfree.chart.axis.ValueAxis[] { valueAxis26 };
        categoryPlot23.setRangeAxes(valueAxisArray27);
        categoryPlot23.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean32 = categoryPlot23.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot23.getDomainAxisLocation();
        categoryPlot17.setRangeAxisLocation(axisLocation33, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        categoryPlot36.markerChanged(markerChangeEvent37);
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray40 = new org.jfree.chart.axis.ValueAxis[] { valueAxis39 };
        categoryPlot36.setRangeAxes(valueAxisArray40);
        categoryPlot36.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot36.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.PlotOrientation plotOrientation48 = categoryPlot36.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge49 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation33, plotOrientation48);
        categoryPlot0.setRangeAxisLocation(axisLocation33, true);
        java.lang.Object obj52 = categoryPlot0.clone();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(valueAxisArray27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(valueAxisArray40);
        org.junit.Assert.assertNotNull(plotOrientation48);
        org.junit.Assert.assertNotNull(rectangleEdge49);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        categoryPlot0.setAnchorValue((double) 10.0f);
        org.jfree.chart.util.Layer layer11 = null;
        java.util.Collection collection12 = categoryPlot0.getDomainMarkers(layer11);
        java.util.List list13 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.getFixedDomainAxisSpace();
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot0.getFixedLegendItems();
        java.util.List list16 = categoryPlot0.getAnnotations();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        categoryPlot0.setDomainAxis((int) '4', categoryAxis9);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.mapDatasetToRangeAxis(0, (int) '#');
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryItemRenderer11);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxis((int) (byte) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        categoryPlot0.setRenderer(categoryItemRenderer15, true);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder18 = categoryPlot0.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = categoryPlot0.getOrientation();
        java.awt.Paint paint20 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.util.SortOrder sortOrder21 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNotNull(datasetRenderingOrder18);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(sortOrder21);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot8 = categoryPlot0.getRootPlot();
        double double9 = categoryPlot0.getRangeCrosshairValue();
        int int10 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation((int) ' ');
        java.awt.Paint paint13 = categoryPlot0.getOutlinePaint();
        categoryPlot0.setWeight((int) (short) -1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        categoryPlot0.removeChangeListener(plotChangeListener16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot19.setInsets(rectangleInsets20);
        org.jfree.chart.LegendItemCollection legendItemCollection22 = null;
        categoryPlot19.setFixedLegendItems(legendItemCollection22);
        java.awt.Paint paint24 = categoryPlot19.getNoDataMessagePaint();
        categoryPlot18.setBackgroundPaint(paint24);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot18.getRenderer((int) (short) 100);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        categoryPlot18.setRenderer(categoryItemRenderer28);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        categoryPlot30.markerChanged(markerChangeEvent31);
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot30.getDomainAxisEdge((int) '4');
        categoryPlot30.setAnchorValue((double) (short) 1);
        double double37 = categoryPlot30.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot38 = categoryPlot30.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray39 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot30.setRenderers(categoryItemRendererArray39);
        categoryPlot18.setRenderers(categoryItemRendererArray39);
        categoryPlot0.setRenderers(categoryItemRendererArray39);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categoryItemRenderer27);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(plot38);
        org.junit.Assert.assertNotNull(categoryItemRendererArray39);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer5 = categoryPlot0.getRendererForDataset(categoryDataset4);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 1, (int) (short) -1);
        int int9 = categoryPlot0.getRangeAxisCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer11, false);
        java.util.List list14 = categoryPlot0.getCategories();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(list14);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        categoryPlot0.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot0.setDomainAxis(100, categoryAxis17, true);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot0.getRenderer((int) (short) 1);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemRenderer22);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot13.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot13.getRangeAxisLocation();
        boolean boolean19 = categoryPlot13.isDomainGridlinesVisible();
        boolean boolean20 = categoryPlot13.isRangeZoomable();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot21.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        int int24 = categoryPlot21.getDomainAxisIndex(categoryAxis23);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        categoryPlot21.setDomainAxis((int) (short) 100, categoryAxis26, false);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = categoryPlot21.getRangeMarkers(layer29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray32 = new org.jfree.chart.axis.ValueAxis[] { valueAxis31 };
        categoryPlot21.setRangeAxes(valueAxisArray32);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray34 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot21.setDomainAxes(categoryAxisArray34);
        org.jfree.chart.axis.AxisLocation axisLocation36 = categoryPlot21.getRangeAxisLocation();
        categoryPlot13.setDomainAxisLocation(axisLocation36, false);
        categoryPlot0.setDomainAxisLocation((int) (short) 10, axisLocation36, false);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertNotNull(valueAxisArray32);
        org.junit.Assert.assertNotNull(categoryAxisArray34);
        org.junit.Assert.assertNotNull(axisLocation36);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent13 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent13);
        boolean boolean15 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        int int17 = categoryPlot0.getIndexOf(categoryItemRenderer16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        categoryPlot18.markerChanged(markerChangeEvent19);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray22 = new org.jfree.chart.axis.ValueAxis[] { valueAxis21 };
        categoryPlot18.setRangeAxes(valueAxisArray22);
        categoryPlot18.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot18.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot18.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation33 = categoryPlot18.getRangeAxisLocation((int) '#');
        categoryPlot18.setWeight((int) (byte) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = categoryPlot18.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier36);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        java.awt.geom.Point2D point2D40 = null;
        categoryPlot0.zoomDomainAxes((double) 100L, plotRenderingInfo39, point2D40);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(valueAxisArray22);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(drawingSupplier36);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        int int13 = categoryPlot0.getIndexOf(categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        categoryPlot15.markerChanged(markerChangeEvent16);
        categoryPlot15.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot15.getDomainAxisLocation();
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation19, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot22.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        int int25 = categoryPlot22.getDomainAxisIndex(categoryAxis24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot22.setDomainAxis((int) (short) 100, categoryAxis27, false);
        org.jfree.chart.util.Layer layer30 = null;
        java.util.Collection collection31 = categoryPlot22.getRangeMarkers(layer30);
        categoryPlot22.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot22.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder34);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = categoryPlot0.getDomainAxisEdge(10);
        categoryPlot0.setRangeCrosshairValue((double) 100L, true);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(collection31);
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertNotNull(rectangleEdge37);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = categoryPlot0.getRenderer();
        categoryPlot0.setBackgroundAlpha(0.0f);
        boolean boolean11 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Paint paint12 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) (short) 100, categoryAxis18, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        int int22 = categoryPlot13.getDomainAxisIndex(categoryAxis21);
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.data.Range range24 = categoryPlot13.getDataRange(valueAxis23);
        categoryPlot13.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean28 = categoryPlot13.isSubplot();
        categoryPlot13.configureDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        categoryPlot13.zoomDomainAxes((double) 100L, (double) (byte) 100, plotRenderingInfo32, point2D33);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        categoryPlot35.markerChanged(markerChangeEvent36);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        java.awt.geom.Point2D point2D41 = null;
        categoryPlot35.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo40, point2D41);
        categoryPlot35.clearRangeMarkers((int) (short) -1);
        java.awt.Stroke stroke45 = categoryPlot35.getRangeCrosshairStroke();
        categoryPlot13.setRangeGridlineStroke(stroke45);
        categoryPlot0.setRangeGridlineStroke(stroke45);
        org.junit.Assert.assertNull(categoryItemRenderer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(range24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(stroke45);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedRangeAxisSpace();
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace6);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot0.getDomainMarkers(layer21);
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        categoryPlot0.setRangeGridlinePaint(paint23);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        float float8 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot0.getRenderer();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getDomainAxisEdge();
        categoryPlot0.setBackgroundAlpha(10.0f);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation(1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(axisLocation13);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.clearAnnotations();
        java.awt.Paint paint11 = categoryPlot0.getRangeGridlinePaint();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot0.zoomDomainAxes((double) 0.0f, plotRenderingInfo14, point2D15);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 0, (int) (byte) 10);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        categoryPlot0.axisChanged(axisChangeEvent20);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(100, categoryItemRenderer8, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer12);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot0.getDomainAxis((int) (byte) -1);
        boolean boolean16 = categoryPlot0.isRangeGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = categoryPlot17.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        int int20 = categoryPlot17.getDomainAxisIndex(categoryAxis19);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        categoryPlot17.setDomainAxis((int) (short) 100, categoryAxis22, false);
        org.jfree.chart.util.Layer layer25 = null;
        java.util.Collection collection26 = categoryPlot17.getRangeMarkers(layer25);
        categoryPlot17.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder29 = categoryPlot17.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder29);
        categoryPlot0.setAnchorValue(100.0d);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        categoryPlot0.setRenderer(categoryItemRenderer33);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(categoryAxis18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertNotNull(sortOrder29);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        boolean boolean12 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor13 = categoryPlot0.getDomainGridlinePosition();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(categoryAnchor13);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        java.awt.Image image13 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes((double) '#', plotRenderingInfo15, point2D16);
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot0.getRangeAxisLocation((int) '#');
        org.jfree.chart.plot.PlotOrientation plotOrientation20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge21 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation19, plotOrientation20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        java.awt.Stroke stroke10 = categoryPlot7.getRangeGridlineStroke();
        categoryPlot0.setRangeGridlineStroke(stroke10);
        org.jfree.chart.axis.ValueAxis valueAxis12 = categoryPlot0.getRangeAxis();
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = categoryPlot0.getDomainMarkers(0, layer14);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxisForDataset((int) (short) 0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addAnnotation(categoryAnnotation18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = categoryPlot0.getOrientation();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot13.getDomainAxisEdge((int) '4');
        categoryPlot13.setAnchorValue((double) (short) 1);
        double double20 = categoryPlot13.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot21 = categoryPlot13.getRootPlot();
        int int22 = categoryPlot13.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray27 = new org.jfree.chart.axis.ValueAxis[] { valueAxis26 };
        categoryPlot23.setRangeAxes(valueAxisArray27);
        categoryPlot13.setRangeAxes(valueAxisArray27);
        double double30 = categoryPlot13.getRangeCrosshairValue();
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot13.getDomainAxisLocation((int) (short) 1);
        categoryPlot0.setRangeAxisLocation(axisLocation32);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation32);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        float float8 = categoryPlot0.getBackgroundImageAlpha();
        java.lang.Object obj9 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset(categoryDataset7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot0.getRangeAxisForDataset((int) (byte) 100);
        categoryPlot0.setRangeCrosshairValue(10.0d, true);
        double double14 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(valueAxis10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        int int9 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        categoryPlot0.setRangeCrosshairValue((double) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis((int) '4');
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot0.getFixedRangeAxisSpace();
        java.awt.Image image19 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNull(axisSpace18);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        java.lang.String str9 = categoryPlot0.getNoDataMessage();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers(layer10);
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation((int) '4');
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot0.getRangeAxisEdge(15);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(rectangleEdge16);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        java.awt.Image image8 = null;
        categoryPlot0.setBackgroundImage(image8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        categoryPlot10.setBackgroundPaint(paint16);
        categoryPlot0.setBackgroundPaint(paint16);
        categoryPlot0.setDrawSharedDomainAxis(false);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot0.setDataset(10, categoryDataset22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace24);
        java.awt.Stroke stroke26 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot0.setOutlineStroke(stroke26);
        float float28 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.Marker marker29 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        int int10 = categoryPlot0.getDatasetCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot11.setInsets(rectangleInsets12);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = null;
        categoryPlot11.setFixedLegendItems(legendItemCollection14);
        java.awt.Paint paint16 = categoryPlot11.getNoDataMessagePaint();
        java.awt.Paint paint17 = categoryPlot11.getDomainGridlinePaint();
        categoryPlot0.setBackgroundPaint(paint17);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        categoryPlot0.setRangeAxis((int) (short) 10, valueAxis4);
        java.util.List list6 = categoryPlot0.getAnnotations();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.setAnchorValue((double) (byte) 0);
        org.jfree.chart.axis.AxisSpace axisSpace7 = null;
        categoryPlot4.setFixedDomainAxisSpace(axisSpace7);
        categoryPlot4.clearAnnotations();
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot0.getFixedDomainAxisSpace();
        int int14 = categoryPlot0.getDatasetCount();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = null;
        int int16 = categoryPlot0.getIndexOf(categoryItemRenderer15);
        org.jfree.chart.axis.AxisSpace axisSpace17 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot18.setInsets(rectangleInsets19);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = null;
        categoryPlot18.setFixedLegendItems(legendItemCollection21);
        java.lang.Object obj23 = categoryPlot18.clone();
        categoryPlot18.clearDomainMarkers(100);
        categoryPlot18.configureDomainAxes();
        categoryPlot18.setRangeCrosshairVisible(true);
        org.jfree.chart.util.SortOrder sortOrder29 = categoryPlot18.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder29);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        categoryPlot0.markerChanged(markerChangeEvent31);
        categoryPlot0.setDomainGridlinesVisible(false);
        java.awt.Font font35 = categoryPlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(axisSpace17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(sortOrder29);
        org.junit.Assert.assertNotNull(font35);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        categoryPlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        int int10 = categoryPlot0.getDomainAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        categoryPlot0.setDataset((int) '#', categoryDataset12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot14.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        int int17 = categoryPlot14.getDomainAxisIndex(categoryAxis16);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot14.setDomainAxis((int) (short) 100, categoryAxis19, false);
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = categoryPlot14.getRangeMarkers(layer22);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot14.setRenderer(categoryItemRenderer24, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        categoryPlot27.markerChanged(markerChangeEvent28);
        org.jfree.chart.util.RectangleEdge rectangleEdge31 = categoryPlot27.getDomainAxisEdge((int) '4');
        categoryPlot27.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        categoryPlot27.setRenderer(categoryItemRenderer34);
        java.awt.Paint paint36 = categoryPlot27.getRangeCrosshairPaint();
        categoryPlot14.setRangeCrosshairPaint(paint36);
        org.jfree.chart.axis.AxisSpace axisSpace38 = null;
        categoryPlot14.setFixedDomainAxisSpace(axisSpace38);
        java.awt.Font font40 = categoryPlot14.getNoDataMessageFont();
        categoryPlot0.setNoDataMessageFont(font40);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(collection23);
        org.junit.Assert.assertNotNull(rectangleEdge31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(font40);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        categoryPlot0.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        int int13 = categoryPlot0.getDomainAxisIndex(categoryAxis12);
        categoryPlot0.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot0.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        int int21 = categoryPlot18.getDomainAxisIndex(categoryAxis20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot18.setDomainAxis((int) (short) 100, categoryAxis23, false);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot18.getRangeMarkers(layer26);
        categoryPlot18.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder30 = categoryPlot18.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder30);
        org.jfree.chart.axis.ValueAxis valueAxis33 = categoryPlot0.getRangeAxisForDataset((int) (byte) 0);
        boolean boolean34 = categoryPlot0.isDomainZoomable();
        int int35 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(sortOrder30);
        org.junit.Assert.assertNull(valueAxis33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 101 + "'", int35 == 101);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        categoryPlot0.clearAnnotations();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot12.setInsets(rectangleInsets13);
        org.jfree.chart.axis.AxisLocation axisLocation16 = categoryPlot12.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot17.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot17.getRangeAxisLocation();
        categoryPlot12.setDomainAxisLocation(axisLocation22, false);
        categoryPlot0.setDomainAxisLocation((int) (byte) 1, axisLocation22, false);
        org.jfree.chart.LegendItemCollection legendItemCollection27 = categoryPlot0.getFixedLegendItems();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        boolean boolean32 = categoryPlot0.render(graphics2D28, rectangle2D29, 10, plotRenderingInfo31);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNull(legendItemCollection27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot7.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot7.getRangeAxisLocation();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot7.setRangeCrosshairStroke(stroke13);
        java.awt.Stroke stroke15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        categoryPlot7.setDomainGridlineStroke(stroke15);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        java.util.List list18 = categoryPlot0.getCategories();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(list18);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot6.getDomainAxisEdge((int) '4');
        categoryPlot6.setAnchorValue((double) (short) 1);
        double double13 = categoryPlot6.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot14 = categoryPlot6.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray15 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot6.setRenderers(categoryItemRendererArray15);
        categoryPlot0.setRenderers(categoryItemRendererArray15);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        categoryPlot18.markerChanged(markerChangeEvent19);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot18.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot18.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot25.setInsets(rectangleInsets26);
        org.jfree.chart.LegendItemCollection legendItemCollection28 = null;
        categoryPlot25.setFixedLegendItems(legendItemCollection28);
        java.awt.Paint paint30 = categoryPlot25.getNoDataMessagePaint();
        categoryPlot24.setBackgroundPaint(paint30);
        categoryPlot18.setRangeCrosshairPaint(paint30);
        org.jfree.chart.util.Layer layer34 = null;
        java.util.Collection collection35 = categoryPlot18.getRangeMarkers(10, layer34);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor36 = categoryPlot18.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor36);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = null;
        categoryPlot0.setRenderer(categoryItemRenderer38);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(categoryItemRendererArray15);
        org.junit.Assert.assertNotNull(rectangleEdge22);
        org.junit.Assert.assertNotNull(axisLocation23);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(collection35);
        org.junit.Assert.assertNotNull(categoryAnchor36);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        org.jfree.chart.axis.AxisSpace axisSpace6 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder7 = categoryPlot0.getDatasetRenderingOrder();
        categoryPlot0.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.chart.plot.CategoryMarker categoryMarker10 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNotNull(datasetRenderingOrder7);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = categoryPlot0.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        double double12 = categoryPlot5.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot13 = categoryPlot5.getRootPlot();
        double double14 = categoryPlot5.getRangeCrosshairValue();
        int int15 = categoryPlot5.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation17 = categoryPlot5.getRangeAxisLocation((int) ' ');
        categoryPlot0.setDomainAxisLocation(axisLocation17);
        float float19 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }
}

