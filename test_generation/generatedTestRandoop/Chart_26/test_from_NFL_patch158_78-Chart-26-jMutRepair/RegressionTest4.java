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
        org.jfree.chart.util.SortOrder sortOrder18 = categoryPlot0.getRowRenderingOrder();
        java.awt.Stroke stroke19 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(sortOrder18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        java.awt.Stroke stroke6 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot7.setRangeAxes(valueAxisArray11);
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = categoryPlot0.getRangeMarkers((int) (byte) 1, layer15);
        java.awt.Stroke stroke17 = categoryPlot0.getRangeGridlineStroke();
        java.awt.Font font18 = categoryPlot0.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        categoryPlot0.setDataset(categoryDataset19);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot0.getRangeAxisEdge((int) (short) 10);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(rectangleEdge22);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
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
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = null;
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray37 = new org.jfree.chart.axis.CategoryAxis[] { categoryAxis36 };
        categoryPlot17.setDomainAxes(categoryAxisArray37);
        categoryPlot0.setDomainAxes(categoryAxisArray37);
        java.awt.Paint paint40 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(valueAxisArray21);
        org.junit.Assert.assertNotNull(axisLocation32);
        org.junit.Assert.assertNotNull(datasetRenderingOrder35);
        org.junit.Assert.assertNotNull(categoryAxisArray37);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.jfree.chart.axis.AxisSpace axisSpace28 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace28);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        categoryPlot0.addChangeListener(plotChangeListener30);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeAxis((int) (short) -1, valueAxis33, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(collection27);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        boolean boolean20 = categoryPlot0.isRangeCrosshairVisible();
        categoryPlot0.setNoDataMessage("Category Plot");
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        boolean boolean16 = categoryPlot0.isDomainGridlinesVisible();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.zoom((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        java.lang.Object obj12 = categoryPlot0.clone();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        java.awt.Stroke stroke17 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis19 = categoryPlot0.getRangeAxis((int) (byte) -1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(valueAxis19);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.lang.String str6 = categoryPlot0.getPlotType();
        java.lang.String str7 = categoryPlot0.getNoDataMessage();
        java.awt.Stroke stroke8 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.axis.AxisSpace axisSpace9 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace9);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Category Plot" + "'", str6, "Category Plot");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        categoryPlot0.configureRangeAxes();
        java.awt.Stroke stroke17 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot18 = categoryPlot0.getParent();
        java.awt.Image image19 = null;
        categoryPlot0.setBackgroundImage(image19);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(plot18);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        java.util.List list17 = categoryPlot0.getAnnotations();
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot0.getDomainMarkers(layer20);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(collection21);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) (short) 100, categoryAxis18, false);
        java.awt.Image image21 = null;
        categoryPlot13.setBackgroundImage(image21);
        categoryPlot13.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection26 = null;
        categoryPlot13.setFixedLegendItems(legendItemCollection26);
        java.awt.Paint paint28 = categoryPlot13.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        categoryPlot29.markerChanged(markerChangeEvent30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot29.getDomainAxisEdge((int) '4');
        categoryPlot29.setAnchorValue((double) (short) 1);
        java.awt.Paint paint36 = categoryPlot29.getRangeCrosshairPaint();
        categoryPlot13.setRangeCrosshairPaint(paint36);
        categoryPlot0.setNoDataMessagePaint(paint36);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        int int13 = categoryPlot0.getDatasetCount();
        double double14 = categoryPlot0.getAnchorValue();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        categoryPlot0.setDataset(categoryDataset17);
        java.awt.Image image19 = null;
        categoryPlot0.setBackgroundImage(image19);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        categoryPlot4.clearRangeMarkers();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder6 = categoryPlot4.getDatasetRenderingOrder();
        org.junit.Assert.assertNotNull(datasetRenderingOrder6);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        org.jfree.chart.util.SortOrder sortOrder18 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot0.setRenderer(categoryItemRenderer19);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = categoryPlot0.removeAnnotation(categoryAnnotation21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertNotNull(sortOrder18);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        java.awt.Stroke stroke15 = categoryPlot5.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot5.zoomDomainAxes((double) '#', plotRenderingInfo17, point2D18);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        org.jfree.chart.plot.Plot plot12 = categoryPlot0.getParent();
        categoryPlot0.setWeight((int) (short) 1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = categoryPlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        categoryPlot0.notifyListeners(plotChangeEvent13);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot0.getRenderer();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot16.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot16.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        categoryPlot16.setDomainAxis((int) (short) 100, categoryAxis21, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        int int25 = categoryPlot16.getIndexOf(categoryItemRenderer24);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        categoryPlot16.setDomainAxis(categoryAxis26);
        java.awt.Stroke stroke28 = categoryPlot16.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot30.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        int int33 = categoryPlot30.getDomainAxisIndex(categoryAxis32);
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        categoryPlot30.setDomainAxis((int) (short) 100, categoryAxis35, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        int int39 = categoryPlot30.getDomainAxisIndex(categoryAxis38);
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.data.Range range41 = categoryPlot30.getDataRange(valueAxis40);
        categoryPlot30.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean45 = categoryPlot30.isSubplot();
        categoryPlot30.configureDomainAxes();
        categoryPlot30.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent50 = null;
        categoryPlot49.markerChanged(markerChangeEvent50);
        org.jfree.chart.util.RectangleEdge rectangleEdge53 = categoryPlot49.getDomainAxisEdge((int) '4');
        categoryPlot49.setAnchorValue((double) (short) 1);
        double double56 = categoryPlot49.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot57 = categoryPlot49.getRootPlot();
        double double58 = categoryPlot49.getRangeCrosshairValue();
        int int59 = categoryPlot49.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation61 = categoryPlot49.getRangeAxisLocation((int) ' ');
        categoryPlot30.setDomainAxisLocation(axisLocation61);
        categoryPlot16.setDomainAxisLocation((int) (short) 0, axisLocation61);
        categoryPlot0.setRangeAxisLocation(axisLocation61);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(categoryItemRenderer15);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(categoryAxis31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(range41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(rectangleEdge53);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(plot57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(axisLocation61);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot16.getDomainAxisEdge((int) '4');
        categoryPlot16.setAnchorValue((double) (short) 1);
        java.awt.Paint paint23 = categoryPlot16.getRangeCrosshairPaint();
        categoryPlot0.setRangeCrosshairPaint(paint23);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot0.getRangeMarkers(101, layer26);
        categoryPlot0.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = categoryPlot0.getInsets();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor43 = categoryPlot0.getDomainGridlinePosition();
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
        org.junit.Assert.assertNotNull(categoryAnchor43);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.jfree.chart.axis.AxisLocation axisLocation13 = categoryPlot0.getRangeAxisLocation();
        org.jfree.data.general.DatasetGroup datasetGroup14 = categoryPlot0.getDatasetGroup();
        categoryPlot0.configureDomainAxes();
        categoryPlot0.configureRangeAxes();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent22 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent22);
        categoryPlot0.setNoDataMessage("Category Plot");
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.jfree.data.general.DatasetGroup datasetGroup13 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = categoryPlot14.getDomainAxisEdge((int) '4');
        categoryPlot14.setAnchorValue((double) (short) 1);
        double double21 = categoryPlot14.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot22 = categoryPlot14.getRootPlot();
        double double23 = categoryPlot14.getRangeCrosshairValue();
        int int24 = categoryPlot14.getRangeAxisCount();
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        categoryPlot14.addChangeListener(plotChangeListener25);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot14.getDomainAxisEdge((-1));
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        categoryPlot14.setRangeAxis(valueAxis29);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        categoryPlot31.markerChanged(markerChangeEvent32);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        java.awt.geom.Point2D point2D37 = null;
        categoryPlot31.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo36, point2D37);
        categoryPlot31.clearRangeMarkers((int) (short) -1);
        categoryPlot31.clearAnnotations();
        boolean boolean42 = categoryPlot14.equals((java.lang.Object) categoryPlot31);
        categoryPlot14.setDrawSharedDomainAxis(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent46 = null;
        categoryPlot45.markerChanged(markerChangeEvent46);
        org.jfree.chart.util.RectangleEdge rectangleEdge49 = categoryPlot45.getDomainAxisEdge((int) '4');
        categoryPlot45.setAnchorValue((double) (short) 1);
        categoryPlot45.setRangeCrosshairValue((double) (byte) -1, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis55 = categoryPlot45.getDomainAxis();
        int int56 = categoryPlot45.getRangeAxisCount();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor57 = categoryPlot45.getDomainGridlinePosition();
        categoryPlot14.setDomainGridlinePosition(categoryAnchor57);
        categoryPlot0.setDomainGridlinePosition(categoryAnchor57);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(rectangleEdge49);
        org.junit.Assert.assertNull(categoryAxis55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(categoryAnchor57);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        org.jfree.chart.axis.ValueAxis valueAxis19 = categoryPlot0.getRangeAxis((int) (byte) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNull(categoryItemRenderer20);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        boolean boolean18 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(legendItemCollection19);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        boolean boolean15 = categoryPlot0.isOutlineVisible();
        int int16 = categoryPlot0.getRangeAxisCount();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot0.getRendererForDataset(categoryDataset17);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        categoryPlot0.axisChanged(axisChangeEvent19);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(categoryItemRenderer18);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot0.getRangeAxisLocation(100);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        boolean boolean5 = categoryPlot0.isOutlineVisible();
        java.awt.Stroke stroke6 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot7.setRangeAxes(valueAxisArray11);
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis15 = categoryPlot0.getRangeAxisForDataset((int) (short) 0);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(valueAxis15);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        int int15 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        java.awt.Paint paint4 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Image image6 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot7.setInsets(rectangleInsets8);
        java.awt.Stroke stroke10 = categoryPlot7.getRangeGridlineStroke();
        categoryPlot7.setDomainGridlinesVisible(true);
        categoryPlot7.setAnchorValue((double) 10);
        categoryPlot7.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot16.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        int int19 = categoryPlot16.getDomainAxisIndex(categoryAxis18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = null;
        int int21 = categoryPlot16.getIndexOf(categoryItemRenderer20);
        org.jfree.chart.plot.Plot plot22 = categoryPlot16.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot16.setRenderer(100, categoryItemRenderer24, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        categoryPlot16.setRenderer((int) (byte) 1, categoryItemRenderer28);
        int int30 = categoryPlot16.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge31 = categoryPlot16.getDomainAxisEdge();
        java.lang.String str32 = categoryPlot16.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = categoryPlot16.getAxisOffset();
        categoryPlot7.setInsets(rectangleInsets33);
        java.awt.Paint paint35 = categoryPlot7.getBackgroundPaint();
        categoryPlot0.setRangeCrosshairPaint(paint35);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(plot22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        java.util.List list17 = categoryPlot0.getCategoriesForAxis(categoryAxis16);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        java.awt.Stroke stroke17 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot0.setRenderer((int) 'a', categoryItemRenderer19);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot0.setRenderer((int) (byte) 0, categoryItemRenderer22);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        categoryPlot0.clearRangeMarkers();
        java.awt.Stroke stroke35 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor36 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        categoryPlot37.markerChanged(markerChangeEvent38);
        org.jfree.chart.util.RectangleEdge rectangleEdge41 = categoryPlot37.getDomainAxisEdge((int) '4');
        categoryPlot37.setAnchorValue((double) (short) 1);
        double double44 = categoryPlot37.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = categoryPlot37.getDomainAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation46 = categoryPlot37.getOrientation();
        java.awt.Paint paint47 = categoryPlot37.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = categoryPlot37.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent50 = null;
        categoryPlot49.markerChanged(markerChangeEvent50);
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent54 = null;
        categoryPlot53.markerChanged(markerChangeEvent54);
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray57 = new org.jfree.chart.axis.ValueAxis[] { valueAxis56 };
        categoryPlot53.setRangeAxes(valueAxisArray57);
        categoryPlot53.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean62 = categoryPlot53.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation63 = categoryPlot53.getDomainAxisLocation();
        categoryPlot49.setDomainAxisLocation((int) (byte) 1, axisLocation63, false);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray66 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot49.setDomainAxes(categoryAxisArray66);
        categoryPlot37.setDomainAxes(categoryAxisArray66);
        categoryPlot0.setDomainAxes(categoryAxisArray66);
        org.jfree.data.category.CategoryDataset categoryDataset71 = categoryPlot0.getDataset((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(categoryAnchor36);
        org.junit.Assert.assertNotNull(rectangleEdge41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis45);
        org.junit.Assert.assertNotNull(plotOrientation46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(rectangleInsets48);
        org.junit.Assert.assertNotNull(valueAxisArray57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(axisLocation63);
        org.junit.Assert.assertNotNull(categoryAxisArray66);
        org.junit.Assert.assertNull(categoryDataset71);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getRangeAxisEdge((int) (short) -1);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor12 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        categoryPlot14.markerChanged(markerChangeEvent15);
        categoryPlot14.configureRangeAxes();
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot14.getDomainAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        categoryPlot19.setAnchorValue((double) (short) 1);
        double double26 = categoryPlot19.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = categoryPlot19.getDomainAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation28 = categoryPlot19.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation18, plotOrientation28);
        categoryPlot0.setRangeAxisLocation((int) (byte) 0, axisLocation18, false);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(categoryAnchor12);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis27);
        org.junit.Assert.assertNotNull(plotOrientation28);
        org.junit.Assert.assertNotNull(rectangleEdge29);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot6.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation11 = categoryPlot6.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot13.setInsets(rectangleInsets14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = null;
        categoryPlot13.setFixedLegendItems(legendItemCollection16);
        java.awt.Paint paint18 = categoryPlot13.getNoDataMessagePaint();
        categoryPlot12.setBackgroundPaint(paint18);
        categoryPlot6.setRangeCrosshairPaint(paint18);
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = categoryPlot6.getRangeMarkers(10, layer22);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor24 = categoryPlot6.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor24);
        categoryPlot0.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset28 = categoryPlot0.getDataset();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(collection23);
        org.junit.Assert.assertNotNull(categoryAnchor24);
        org.junit.Assert.assertNull(categoryDataset28);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setRangeCrosshairVisible(false);
        categoryPlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        categoryPlot0.axisChanged(axisChangeEvent16);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot0.getLegendItems();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(legendItemCollection18);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        categoryPlot0.setAnchorValue((double) (byte) -1);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace5);
        java.awt.Stroke stroke7 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Paint paint8 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        categoryPlot9.markerChanged(markerChangeEvent10);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot9.getDomainAxisEdge((int) '4');
        categoryPlot9.setAnchorValue((double) (short) 1);
        double double16 = categoryPlot9.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot17 = categoryPlot9.getRootPlot();
        categoryPlot9.mapDatasetToRangeAxis(0, 0);
        categoryPlot9.setDomainGridlinesVisible(true);
        categoryPlot9.setBackgroundAlpha((float) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = categoryPlot9.getDomainAxisForDataset((int) '#');
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot9.getRangeAxisLocation(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        categoryPlot29.markerChanged(markerChangeEvent30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot29.getDomainAxisEdge((int) '4');
        categoryPlot29.setAnchorValue((double) (short) 1);
        double double36 = categoryPlot29.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot37 = categoryPlot29.getRootPlot();
        double double38 = categoryPlot29.getRangeCrosshairValue();
        int int39 = categoryPlot29.getRangeAxisCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = categoryPlot40.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = null;
        int int43 = categoryPlot40.getDomainAxisIndex(categoryAxis42);
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = null;
        categoryPlot40.setDomainAxis((int) (short) 100, categoryAxis45, false);
        org.jfree.chart.util.Layer layer48 = null;
        java.util.Collection collection49 = categoryPlot40.getRangeMarkers(layer48);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer50 = null;
        categoryPlot40.setRenderer(categoryItemRenderer50, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent54 = null;
        categoryPlot53.markerChanged(markerChangeEvent54);
        org.jfree.chart.util.RectangleEdge rectangleEdge57 = categoryPlot53.getDomainAxisEdge((int) '4');
        categoryPlot53.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer60 = null;
        categoryPlot53.setRenderer(categoryItemRenderer60);
        java.awt.Paint paint62 = categoryPlot53.getRangeCrosshairPaint();
        categoryPlot40.setRangeCrosshairPaint(paint62);
        categoryPlot29.setRangeGridlinePaint(paint62);
        categoryPlot9.setOutlinePaint(paint62);
        categoryPlot0.setNoDataMessagePaint(paint62);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNull(categoryAxis26);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(plot37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(categoryAxis41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(collection49);
        org.junit.Assert.assertNotNull(rectangleEdge57);
        org.junit.Assert.assertNotNull(paint62);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot0.zoomRangeAxes((double) (byte) 10, plotRenderingInfo16, point2D17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace19);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis8);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset(categoryDataset7);
        boolean boolean9 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.lang.String str10 = categoryPlot0.getPlotType();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot11.getRenderer((int) '4');
        java.util.List list14 = categoryPlot11.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot11.getLegendItems();
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
        categoryPlot11.setDomainAxisLocation(axisLocation28);
        categoryPlot11.setBackgroundAlpha((float) 15);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = categoryPlot32.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        int int35 = categoryPlot32.getDomainAxisIndex(categoryAxis34);
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        categoryPlot32.setDomainAxis((int) (short) 100, categoryAxis37, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        int int41 = categoryPlot32.getDomainAxisIndex(categoryAxis40);
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.data.Range range43 = categoryPlot32.getDataRange(valueAxis42);
        categoryPlot32.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean47 = categoryPlot32.isSubplot();
        java.awt.Paint paint48 = categoryPlot32.getOutlinePaint();
        java.awt.Paint paint49 = categoryPlot32.getNoDataMessagePaint();
        categoryPlot11.setBackgroundPaint(paint49);
        categoryPlot0.setRangeGridlinePaint(paint49);
        org.jfree.chart.plot.CategoryPlot categoryPlot52 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis53 = categoryPlot52.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis54 = null;
        int int55 = categoryPlot52.getDomainAxisIndex(categoryAxis54);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer56 = null;
        int int57 = categoryPlot52.getIndexOf(categoryItemRenderer56);
        int int58 = categoryPlot52.getWeight();
        org.jfree.chart.util.SortOrder sortOrder59 = categoryPlot52.getColumnRenderingOrder();
        java.awt.Stroke stroke60 = categoryPlot52.getDomainGridlineStroke();
        org.jfree.chart.util.SortOrder sortOrder61 = categoryPlot52.getColumnRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder61);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Category Plot" + "'", str10, "Category Plot");
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNull(categoryAxis33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(range43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(categoryAxis53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(sortOrder59);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNotNull(sortOrder61);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getWeight();
        org.jfree.data.general.DatasetGroup datasetGroup2 = categoryPlot0.getDatasetGroup();
        boolean boolean3 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        categoryPlot0.clearRangeMarkers((int) '#');
        categoryPlot0.clearDomainAxes();
        categoryPlot0.setDomainGridlinesVisible(false);
        java.awt.Stroke stroke13 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        categoryPlot0.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo10, point2D11);
        int int13 = categoryPlot0.getDatasetCount();
        double double14 = categoryPlot0.getAnchorValue();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis(valueAxis15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot0.setRenderer((int) (byte) 100, categoryItemRenderer18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        boolean boolean24 = categoryPlot0.render(graphics2D20, rectangle2D21, 15, plotRenderingInfo23);
        categoryPlot0.clearRangeMarkers((int) (byte) -1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        org.jfree.chart.plot.Plot plot19 = categoryPlot0.getRootPlot();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(plot19);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = categoryPlot0.getDataset((int) (byte) 1);
        org.jfree.chart.axis.AxisSpace axisSpace12 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        categoryPlot0.removeChangeListener(plotChangeListener13);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(axisSpace12);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        org.jfree.chart.plot.Plot plot6 = categoryPlot0.getParent();
        java.awt.Font font7 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot0.setRenderer(categoryItemRenderer8, false);
        categoryPlot0.setNoDataMessage("");
        boolean boolean13 = categoryPlot0.isSubplot();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertNull(categoryAxis29);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer20 = categoryPlot0.getRenderer(1);
        java.awt.Font font21 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryMarker categoryMarker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker((int) ' ', categoryMarker23, layer24);
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
        org.junit.Assert.assertNull(categoryItemRenderer20);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        categoryPlot7.clearRangeAxes();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(valueAxis30);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        categoryPlot6.markerChanged(markerChangeEvent7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot6.getDomainAxisEdge((int) '4');
        categoryPlot6.setAnchorValue((double) (short) 1);
        double double13 = categoryPlot6.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot14 = categoryPlot6.getRootPlot();
        double double15 = categoryPlot6.getRangeCrosshairValue();
        int int16 = categoryPlot6.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot6.getRangeAxisLocation((int) ' ');
        java.awt.Paint paint19 = categoryPlot6.getOutlinePaint();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder20 = categoryPlot6.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder20);
        categoryPlot0.clearDomainAxes();
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot0.getRangeAxisLocation((int) 'a');
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot25.setInsets(rectangleInsets26);
        org.jfree.chart.LegendItemCollection legendItemCollection28 = null;
        categoryPlot25.setFixedLegendItems(legendItemCollection28);
        java.awt.Paint paint30 = categoryPlot25.getNoDataMessagePaint();
        categoryPlot0.setOutlinePaint(paint30);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(datasetRenderingOrder20);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        categoryPlot0.setDataset(categoryDataset7);
        boolean boolean9 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.lang.String str10 = categoryPlot0.getPlotType();
        org.jfree.chart.axis.AxisSpace axisSpace11 = null;
        categoryPlot0.setFixedDomainAxisSpace(axisSpace11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxis((int) (short) 0);
        categoryPlot0.setBackgroundAlpha(0.0f);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Category Plot" + "'", str10, "Category Plot");
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        boolean boolean20 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(valueAxisArray14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        categoryPlot21.markerChanged(markerChangeEvent22);
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot21.getDomainAxisEdge((int) '4');
        categoryPlot21.setAnchorValue((double) (short) 1);
        categoryPlot21.setRangeCrosshairValue((double) (byte) -1, true);
        org.jfree.chart.util.SortOrder sortOrder31 = categoryPlot21.getRowRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder31);
        java.awt.Font font33 = categoryPlot0.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = categoryPlot0.getRendererForDataset(categoryDataset34);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(sortOrder31);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNull(categoryItemRenderer35);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        org.jfree.chart.util.SortOrder sortOrder18 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        int int20 = categoryPlot0.getIndexOf(categoryItemRenderer19);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemRenderer17);
        org.junit.Assert.assertNotNull(sortOrder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        int int5 = categoryPlot0.getIndexOf(categoryItemRenderer4);
        int int6 = categoryPlot0.getWeight();
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) '4');
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        categoryPlot0.axisChanged(axisChangeEvent9);
        java.awt.Image image11 = null;
        categoryPlot0.setBackgroundImage(image11);
        categoryPlot0.setAnchorValue((double) (short) 0);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = null;
        categoryPlot0.setDomainAxis(categoryAxis3);
        java.awt.Paint paint5 = categoryPlot0.getRangeCrosshairPaint();
        java.lang.Object obj6 = categoryPlot0.clone();
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot8.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        int int11 = categoryPlot8.getDomainAxisIndex(categoryAxis10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot8.setDomainAxis((int) (short) 100, categoryAxis13, false);
        org.jfree.chart.util.Layer layer16 = null;
        java.util.Collection collection17 = categoryPlot8.getRangeMarkers(layer16);
        categoryPlot8.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        int int21 = categoryPlot8.getDomainAxisIndex(categoryAxis20);
        boolean boolean22 = categoryPlot8.isOutlineVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder23 = categoryPlot8.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot8.getRangeAxisLocation();
        categoryPlot0.setRangeAxisLocation((int) 'a', axisLocation24, false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(collection17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(datasetRenderingOrder23);
        org.junit.Assert.assertNotNull(axisLocation24);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        categoryPlot0.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot0.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot0.setRangeCrosshairVisible(false);
        categoryPlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        categoryPlot0.axisChanged(axisChangeEvent16);
        int int18 = categoryPlot0.getWeight();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        java.lang.String str6 = categoryPlot0.getPlotType();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        categoryPlot7.markerChanged(markerChangeEvent8);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot7.getDomainAxisEdge((int) '4');
        categoryPlot7.setAnchorValue((double) (short) 1);
        double double14 = categoryPlot7.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot15 = categoryPlot7.getRootPlot();
        categoryPlot7.setNoDataMessage("Category Plot");
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = categoryPlot7.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Category Plot" + "'", str6, "Category Plot");
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 0, plotRenderingInfo16, point2D17);
        org.jfree.chart.plot.Marker marker19 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(categoryAnchor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot0.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo5, point2D6);
        categoryPlot0.clearRangeMarkers((int) (short) -1);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getRangeAxisEdge((int) (short) -1);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor12 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(categoryAnchor12);
        org.junit.Assert.assertNull(valueAxis13);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        categoryPlot16.markerChanged(markerChangeEvent17);
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot16.getDomainAxisEdge((int) '4');
        categoryPlot16.setAnchorValue((double) (short) 1);
        double double23 = categoryPlot16.getRangeCrosshairValue();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        categoryPlot24.markerChanged(markerChangeEvent25);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        categoryPlot28.markerChanged(markerChangeEvent29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray32 = new org.jfree.chart.axis.ValueAxis[] { valueAxis31 };
        categoryPlot28.setRangeAxes(valueAxisArray32);
        categoryPlot28.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean37 = categoryPlot28.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation38 = categoryPlot28.getDomainAxisLocation();
        categoryPlot24.setDomainAxisLocation((int) (byte) 1, axisLocation38, false);
        java.awt.Paint paint41 = categoryPlot24.getOutlinePaint();
        categoryPlot16.setNoDataMessagePaint(paint41);
        org.jfree.chart.axis.AxisSpace axisSpace43 = categoryPlot16.getFixedRangeAxisSpace();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = categoryPlot16.getDrawingSupplier();
        categoryPlot0.setDrawingSupplier(drawingSupplier44);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(valueAxisArray32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(axisLocation38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(axisSpace43);
        org.junit.Assert.assertNotNull(drawingSupplier44);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        java.awt.Font font37 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font37);
        boolean boolean39 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        categoryPlot0.setRangeAxis((int) (byte) 1, valueAxis41);
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
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent16);
        categoryPlot0.setNoDataMessage("Category Plot");
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(collection15);
    }
}

