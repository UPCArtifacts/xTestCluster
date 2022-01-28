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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation22 = categoryPlot0.getOrientation();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        categoryPlot0.axisChanged(axisChangeEvent23);
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.AxisSpace axisSpace26 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(plotOrientation22);
        org.junit.Assert.assertNotNull(plotOrientation25);
        org.junit.Assert.assertNull(axisSpace26);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation15 = categoryPlot0.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        java.util.List list17 = categoryPlot0.getCategoriesForAxis(categoryAxis16);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot0.setDomainAxis((int) ' ', categoryAxis19, true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        categoryPlot0.removeChangeListener(plotChangeListener22);
        org.jfree.chart.axis.ValueAxis valueAxis25 = categoryPlot0.getRangeAxisForDataset(10);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNotNull(plotOrientation15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(valueAxis25);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(axisSpace11);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNotNull(rectangleEdge15);
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
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean24 = categoryPlot0.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        categoryPlot0.setDataset((int) '#', categoryDataset26);
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        categoryPlot31.markerChanged(markerChangeEvent32);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        java.awt.geom.Point2D point2D37 = null;
        categoryPlot31.zoomDomainAxes((double) (-1L), 0.0d, plotRenderingInfo36, point2D37);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = categoryPlot31.getRenderer();
        categoryPlot31.setBackgroundAlpha(0.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        categoryPlot43.markerChanged(markerChangeEvent44);
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray47 = new org.jfree.chart.axis.ValueAxis[] { valueAxis46 };
        categoryPlot43.setRangeAxes(valueAxisArray47);
        categoryPlot43.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean52 = categoryPlot43.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation53 = categoryPlot43.getDomainAxisLocation();
        categoryPlot31.setRangeAxisLocation(15, axisLocation53);
        categoryPlot0.setRangeAxisLocation(100, axisLocation53);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(categoryItemRenderer39);
        org.junit.Assert.assertNotNull(valueAxisArray47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(axisLocation53);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        categoryPlot0.addChangeListener(plotChangeListener17);
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot0.getDomainMarkers((int) (byte) 1, layer20);
        java.awt.Paint paint22 = categoryPlot0.getDomainGridlinePaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.removeChangeListener(plotChangeListener23);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        categoryPlot0.clearRangeAxes();
        org.jfree.chart.plot.Plot plot48 = null;
        categoryPlot0.setParent(plot48);
        java.awt.Graphics2D graphics2D50 = null;
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        categoryPlot0.drawBackgroundImage(graphics2D50, rectangle2D51);
        org.jfree.chart.util.Layer layer54 = null;
        java.util.Collection collection55 = categoryPlot0.getRangeMarkers(11, layer54);
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
        org.junit.Assert.assertNull(collection55);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        int int15 = categoryPlot0.getRangeAxisCount();
        categoryPlot0.clearRangeMarkers(101);
        categoryPlot0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot0.getDatasetGroup();
        categoryPlot0.clearDomainMarkers();
        categoryPlot0.setOutlineVisible(true);
        org.junit.Assert.assertNull(datasetGroup6);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray4 = new org.jfree.chart.axis.ValueAxis[] { valueAxis3 };
        categoryPlot0.setRangeAxes(valueAxisArray4);
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = null;
        java.util.List list7 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot0.getDomainAxis((int) (short) -1);
        java.awt.Stroke stroke10 = categoryPlot0.getRangeCrosshairStroke();
        java.awt.Stroke stroke11 = categoryPlot0.getDomainGridlineStroke();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.AxisLocation axisLocation7 = categoryPlot0.getRangeAxisLocation((int) (short) 10);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot0.getDomainAxisLocation(1);
        categoryPlot0.setRangeCrosshairValue(0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(axisLocation9);
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        int int9 = categoryPlot0.getIndexOf(categoryItemRenderer8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot0.setDomainAxis(categoryAxis10);
        java.awt.Stroke stroke12 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot14.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        int int17 = categoryPlot14.getDomainAxisIndex(categoryAxis16);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = null;
        categoryPlot14.setDomainAxis((int) (short) 100, categoryAxis19, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        int int23 = categoryPlot14.getDomainAxisIndex(categoryAxis22);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.data.Range range25 = categoryPlot14.getDataRange(valueAxis24);
        categoryPlot14.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean29 = categoryPlot14.isSubplot();
        categoryPlot14.configureDomainAxes();
        categoryPlot14.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        categoryPlot33.markerChanged(markerChangeEvent34);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = categoryPlot33.getDomainAxisEdge((int) '4');
        categoryPlot33.setAnchorValue((double) (short) 1);
        double double40 = categoryPlot33.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot41 = categoryPlot33.getRootPlot();
        double double42 = categoryPlot33.getRangeCrosshairValue();
        int int43 = categoryPlot33.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation45 = categoryPlot33.getRangeAxisLocation((int) ' ');
        categoryPlot14.setDomainAxisLocation(axisLocation45);
        categoryPlot0.setDomainAxisLocation((int) (short) 0, axisLocation45);
        org.jfree.chart.axis.AxisSpace axisSpace48 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace48);
        categoryPlot0.clearRangeMarkers();
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        categoryPlot0.setDataset(categoryDataset51);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(range25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(rectangleEdge37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(axisLocation45);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        java.awt.Stroke stroke9 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getDomainMarkers(layer10);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Image image4 = null;
        categoryPlot0.setBackgroundImage(image4);
        boolean boolean6 = categoryPlot0.isRangeZoomable();
        boolean boolean7 = categoryPlot0.isSubplot();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        categoryPlot0.setRangeAxis(valueAxis4);
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis(15);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(axisSpace8);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        categoryPlot0.setWeight(15);
        java.awt.Image image14 = categoryPlot0.getBackgroundImage();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(image14);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker26 = null;
        org.jfree.chart.util.Layer layer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot6.addDomainMarker((int) (byte) 1, categoryMarker26, layer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(valueAxis23);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        org.jfree.chart.plot.Plot plot18 = categoryPlot0.getParent();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot0.getDomainAxis();
        org.junit.Assert.assertNotNull(valueAxisArray8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(plot18);
        org.junit.Assert.assertNull(categoryAxis19);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.awt.Paint paint12 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        categoryPlot0.setDomainAxis((int) (byte) 100, categoryAxis14);
        org.jfree.chart.plot.PlotOrientation plotOrientation16 = categoryPlot0.getOrientation();
        boolean boolean17 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(sortOrder11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plotOrientation16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1, true);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot0.getDomainAxis();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        categoryPlot0.notifyListeners(plotChangeEvent11);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(categoryAxis10);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        java.awt.Paint paint17 = categoryPlot0.getNoDataMessagePaint();
        java.awt.Stroke stroke18 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        float float8 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer9 = categoryPlot0.getRenderer();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = categoryPlot0.getDomainAxisEdge();
        boolean boolean11 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot12.markerChanged(markerChangeEvent13);
        org.jfree.chart.util.RectangleEdge rectangleEdge16 = categoryPlot12.getDomainAxisEdge((int) '4');
        categoryPlot12.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot12.setRenderer(categoryItemRenderer19);
        int int21 = categoryPlot12.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        categoryPlot12.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo24, point2D25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot12.zoomRangeAxes((double) 1, 0.0d, plotRenderingInfo29, point2D30);
        java.awt.Stroke stroke32 = categoryPlot12.getRangeCrosshairStroke();
        categoryPlot0.setOutlineStroke(stroke32);
        org.jfree.chart.axis.ValueAxis valueAxis34 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rectangleEdge16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNull(valueAxis34);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        categoryPlot7.addChangeListener(plotChangeListener33);
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        categoryPlot7.setDomainAxis(categoryAxis35);
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        boolean boolean12 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        categoryPlot0.removeChangeListener(plotChangeListener13);
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = categoryPlot0.getDomainAxisForDataset(0);
        org.jfree.chart.axis.AxisSpace axisSpace17 = categoryPlot0.getFixedDomainAxisSpace();
        categoryPlot0.setDomainGridlinesVisible(false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(categoryItemRendererArray9);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(categoryAxis16);
        org.junit.Assert.assertNull(axisSpace17);
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
        categoryPlot0.clearRangeAxes();
        int int8 = categoryPlot0.getDomainAxisCount();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot0.getDomainAxisForDataset((int) 'a');
        boolean boolean11 = categoryPlot0.isDomainZoomable();
        float float12 = categoryPlot0.getBackgroundImageAlpha();
        java.awt.Image image13 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo15, point2D16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = categoryPlot0.getInsets();
        java.lang.String str19 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Category Plot" + "'", str19, "Category Plot");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Image image4 = null;
        categoryPlot0.setBackgroundImage(image4);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent6);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = categoryPlot8.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        int int11 = categoryPlot8.getDomainAxisIndex(categoryAxis10);
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot8.setDomainAxis((int) (short) 100, categoryAxis13, false);
        java.awt.Image image16 = null;
        categoryPlot8.setBackgroundImage(image16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot19.setInsets(rectangleInsets20);
        org.jfree.chart.LegendItemCollection legendItemCollection22 = null;
        categoryPlot19.setFixedLegendItems(legendItemCollection22);
        java.awt.Paint paint24 = categoryPlot19.getNoDataMessagePaint();
        categoryPlot18.setBackgroundPaint(paint24);
        categoryPlot8.setBackgroundPaint(paint24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot8.setDomainAxis(categoryAxis27);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        categoryPlot29.markerChanged(markerChangeEvent30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot29.getDomainAxisEdge((int) '4');
        categoryPlot29.setAnchorValue((double) (short) 1);
        double double36 = categoryPlot29.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot37 = categoryPlot29.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray38 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot29.setRenderers(categoryItemRendererArray38);
        categoryPlot8.setRenderers(categoryItemRendererArray38);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot8);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(categoryAxis9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(plot37);
        org.junit.Assert.assertNotNull(categoryItemRendererArray38);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getDomainMarkers(layer8);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot0.setRenderer(categoryItemRenderer10);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot0.getAxisOffset();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot13.markerChanged(markerChangeEvent14);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot13.getDomainAxisEdge((int) '4');
        categoryPlot13.setAnchorValue((double) (short) 1);
        double double20 = categoryPlot13.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = categoryPlot13.getDomainAxis();
        categoryPlot13.setAnchorValue((double) 100L, false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        categoryPlot13.setDrawingSupplier(drawingSupplier25);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = categoryPlot27.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        int int30 = categoryPlot27.getDomainAxisIndex(categoryAxis29);
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = null;
        categoryPlot27.setDomainAxis((int) (short) 100, categoryAxis32, false);
        org.jfree.chart.util.Layer layer35 = null;
        java.util.Collection collection36 = categoryPlot27.getRangeMarkers(layer35);
        categoryPlot27.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        int int40 = categoryPlot27.getDomainAxisIndex(categoryAxis39);
        categoryPlot27.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis44 = categoryPlot27.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = categoryPlot45.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = null;
        int int48 = categoryPlot45.getDomainAxisIndex(categoryAxis47);
        org.jfree.chart.axis.CategoryAxis categoryAxis50 = null;
        categoryPlot45.setDomainAxis((int) (short) 100, categoryAxis50, false);
        org.jfree.chart.util.Layer layer53 = null;
        java.util.Collection collection54 = categoryPlot45.getRangeMarkers(layer53);
        categoryPlot45.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder57 = categoryPlot45.getRowRenderingOrder();
        categoryPlot27.setColumnRenderingOrder(sortOrder57);
        categoryPlot13.setRowRenderingOrder(sortOrder57);
        java.awt.Paint paint60 = categoryPlot13.getRangeGridlinePaint();
        categoryPlot13.setBackgroundImageAlignment((-1));
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis21);
        org.junit.Assert.assertNull(categoryAxis28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(collection36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(valueAxis44);
        org.junit.Assert.assertNull(categoryAxis46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(collection54);
        org.junit.Assert.assertNotNull(sortOrder57);
        org.junit.Assert.assertNotNull(paint60);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        float float9 = categoryPlot0.getBackgroundAlpha();
        double double10 = categoryPlot0.getAnchorValue();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        int int12 = categoryPlot0.getIndexOf(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        int int17 = categoryPlot0.getIndexOf(categoryItemRenderer16);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 10, 15);
        org.jfree.chart.util.SortOrder sortOrder21 = categoryPlot0.getColumnRenderingOrder();
        org.jfree.chart.axis.AxisLocation axisLocation23 = categoryPlot0.getDomainAxisLocation((int) (short) -1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot0.setRenderer(categoryItemRenderer24, true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(sortOrder21);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor3 = categoryPlot0.getDomainGridlinePosition();
        boolean boolean4 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = categoryPlot0.getDrawingSupplier();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis((int) (short) 10);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(categoryAnchor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(valueAxis7);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = categoryPlot0.getOrientation();
        double double15 = categoryPlot0.getRangeCrosshairValue();
        java.awt.Paint paint16 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = categoryPlot0.getRangeMarkers(0, layer18);
        categoryPlot0.clearDomainAxes();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(plotOrientation14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(collection19);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        categoryPlot0.setWeight(0);
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot0.setRangeAxis(valueAxis6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        categoryPlot0.zoomDomainAxes((double) (short) 10, plotRenderingInfo9, point2D10);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
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
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        categoryPlot0.notifyListeners(plotChangeEvent13);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        categoryPlot0.addChangeListener(plotChangeListener15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        categoryPlot17.markerChanged(markerChangeEvent18);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray21 = new org.jfree.chart.axis.ValueAxis[] { valueAxis20 };
        categoryPlot17.setRangeAxes(valueAxisArray21);
        categoryPlot17.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot27.setInsets(rectangleInsets28);
        org.jfree.chart.LegendItemCollection legendItemCollection30 = null;
        categoryPlot27.setFixedLegendItems(legendItemCollection30);
        java.awt.Paint paint32 = categoryPlot27.getNoDataMessagePaint();
        categoryPlot26.setBackgroundPaint(paint32);
        categoryPlot17.setRangeCrosshairPaint(paint32);
        java.awt.Paint paint35 = categoryPlot17.getRangeCrosshairPaint();
        categoryPlot0.setNoDataMessagePaint(paint35);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNotNull(valueAxisArray21);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        categoryPlot0.setOutlineVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        categoryPlot20.markerChanged(markerChangeEvent21);
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray24 = new org.jfree.chart.axis.ValueAxis[] { valueAxis23 };
        categoryPlot20.setRangeAxes(valueAxisArray24);
        categoryPlot20.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot20.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        categoryPlot20.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot20.getRangeAxisLocation((int) '#');
        categoryPlot20.setWeight((int) (byte) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = categoryPlot20.getDrawingSupplier();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder39 = categoryPlot20.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder39);
        float float41 = categoryPlot0.getForegroundAlpha();
        float float42 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(valueAxisArray24);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNotNull(drawingSupplier38);
        org.junit.Assert.assertNotNull(datasetRenderingOrder39);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge40 = categoryPlot0.getDomainAxisEdge(100);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertNotNull(plotOrientation11);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNull(categoryDataset38);
        org.junit.Assert.assertNotNull(rectangleEdge40);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        categoryPlot5.markerChanged(markerChangeEvent6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot5.getDomainAxisEdge((int) '4');
        categoryPlot5.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot5.setRenderer(categoryItemRenderer12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot14.setInsets(rectangleInsets15);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot14.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup19 = categoryPlot14.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot20.getRenderer((int) '4');
        org.jfree.chart.axis.CategoryAnchor categoryAnchor23 = categoryPlot20.getDomainGridlinePosition();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = categoryPlot20.getRendererForDataset(categoryDataset24);
        org.jfree.chart.axis.AxisLocation axisLocation27 = categoryPlot20.getRangeAxisLocation(100);
        categoryPlot14.setDomainAxisLocation(axisLocation27);
        categoryPlot5.setRangeAxisLocation(axisLocation27, true);
        categoryPlot0.setRangeAxisLocation((int) (short) 100, axisLocation27);
        org.jfree.data.general.DatasetGroup datasetGroup32 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = null;
        categoryPlot0.setRenderer((int) (byte) 0, categoryItemRenderer34, true);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(rectangleEdge3);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNull(categoryItemRenderer22);
        org.junit.Assert.assertNotNull(categoryAnchor23);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNull(datasetGroup32);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot12.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot12.getDomainAxisIndex(categoryAxis14);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot12.setDomainAxis((int) (short) 100, categoryAxis17, false);
        java.awt.Image image20 = null;
        categoryPlot12.setBackgroundImage(image20);
        categoryPlot12.mapDatasetToDomainAxis((int) '#', 1);
        categoryPlot12.configureRangeAxes();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot27.setInsets(rectangleInsets28);
        org.jfree.chart.LegendItemCollection legendItemCollection30 = null;
        categoryPlot27.setFixedLegendItems(legendItemCollection30);
        java.awt.Paint paint32 = categoryPlot27.getNoDataMessagePaint();
        categoryPlot26.setBackgroundPaint(paint32);
        categoryPlot12.setRangeGridlinePaint(paint32);
        categoryPlot0.setBackgroundPaint(paint32);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = categoryPlot0.getRenderer((int) '4');
        java.util.List list3 = categoryPlot0.getAnnotations();
        org.jfree.chart.axis.AxisSpace axisSpace4 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = categoryPlot5.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        int int8 = categoryPlot5.getDomainAxisIndex(categoryAxis7);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        categoryPlot5.setDomainAxis((int) (short) 100, categoryAxis10, false);
        java.awt.Image image13 = null;
        categoryPlot5.setBackgroundImage(image13);
        categoryPlot5.mapDatasetToDomainAxis((int) '#', 1);
        categoryPlot5.configureRangeAxes();
        categoryPlot5.setRangeGridlinesVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        categoryPlot22.markerChanged(markerChangeEvent23);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        categoryPlot26.markerChanged(markerChangeEvent27);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray30 = new org.jfree.chart.axis.ValueAxis[] { valueAxis29 };
        categoryPlot26.setRangeAxes(valueAxisArray30);
        categoryPlot26.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean35 = categoryPlot26.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation36 = categoryPlot26.getDomainAxisLocation();
        categoryPlot22.setDomainAxisLocation((int) (byte) 1, axisLocation36, false);
        categoryPlot5.setRangeAxisLocation(15, axisLocation36, false);
        categoryPlot0.setDomainAxisLocation(axisLocation36);
        categoryPlot0.setWeight((int) (byte) 100);
        categoryPlot0.mapDatasetToRangeAxis((int) (byte) 100, (int) (short) 100);
        org.jfree.chart.axis.AxisLocation axisLocation48 = categoryPlot0.getRangeAxisLocation((int) (byte) 1);
        org.junit.Assert.assertNull(categoryItemRenderer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(axisSpace4);
        org.junit.Assert.assertNull(categoryAxis6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(valueAxisArray30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(axisLocation36);
        org.junit.Assert.assertNotNull(axisLocation48);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairValue((double) 10, false);
        org.jfree.chart.util.Layer layer10 = null;
        java.util.Collection collection11 = categoryPlot0.getRangeMarkers((int) (short) -1, layer10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = categoryPlot12.getRenderer((int) '4');
        java.util.List list15 = categoryPlot12.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot12.getLegendItems();
        categoryPlot12.setDomainGridlinesVisible(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        categoryPlot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation24 = categoryPlot19.getRangeAxisLocation();
        categoryPlot19.setNoDataMessage("hi!");
        categoryPlot19.clearRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        categoryPlot19.setRangeAxis((int) (byte) 100, valueAxis29);
        categoryPlot19.setNoDataMessage("Category Plot");
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = categoryPlot33.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = null;
        int int36 = categoryPlot33.getDomainAxisIndex(categoryAxis35);
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        categoryPlot33.setDomainAxis((int) (short) 100, categoryAxis38, false);
        org.jfree.chart.util.Layer layer41 = null;
        java.util.Collection collection42 = categoryPlot33.getRangeMarkers(layer41);
        categoryPlot33.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = null;
        int int46 = categoryPlot33.getDomainAxisIndex(categoryAxis45);
        categoryPlot33.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D50 = null;
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo53 = null;
        boolean boolean54 = categoryPlot33.render(graphics2D50, rectangle2D51, (int) (byte) 10, plotRenderingInfo53);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent55 = null;
        categoryPlot33.axisChanged(axisChangeEvent55);
        java.awt.Stroke stroke57 = categoryPlot33.getRangeCrosshairStroke();
        categoryPlot19.setRangeCrosshairStroke(stroke57);
        categoryPlot12.setRangeCrosshairStroke(stroke57);
        categoryPlot0.setDomainGridlineStroke(stroke57);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNull(categoryItemRenderer14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(axisLocation24);
        org.junit.Assert.assertNull(categoryAxis34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(collection42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(stroke57);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Stroke stroke3 = categoryPlot0.getDomainGridlineStroke();
        java.awt.Paint paint4 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        categoryPlot28.markerChanged(markerChangeEvent29);
        org.jfree.chart.util.RectangleEdge rectangleEdge32 = categoryPlot28.getDomainAxisEdge((int) '4');
        categoryPlot28.setAnchorValue((double) (short) 1);
        categoryPlot28.clearRangeAxes();
        int int36 = categoryPlot28.getDomainAxisCount();
        java.awt.Paint paint37 = categoryPlot28.getRangeCrosshairPaint();
        org.jfree.chart.plot.PlotOrientation plotOrientation38 = categoryPlot28.getOrientation();
        categoryPlot0.setOrientation(plotOrientation38);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleEdge32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(plotOrientation38);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(valueAxis18);
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
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        categoryPlot0.setAnchorValue((double) (-1.0f), false);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1, true);
        org.jfree.chart.util.SortOrder sortOrder10 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot0.setRangeAxes(valueAxisArray11);
        boolean boolean13 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(sortOrder10);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
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
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray11 = new org.jfree.chart.axis.ValueAxis[] { valueAxis10 };
        categoryPlot0.setRangeAxes(valueAxisArray11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = categoryPlot0.getDataRange(valueAxis13);
        categoryPlot0.clearRangeMarkers((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        int int21 = categoryPlot18.getDomainAxisIndex(categoryAxis20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot18.setDomainAxis((int) (short) 100, categoryAxis23, false);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot18.getRangeMarkers(layer26);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray29 = new org.jfree.chart.axis.ValueAxis[] { valueAxis28 };
        categoryPlot18.setRangeAxes(valueAxisArray29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.data.Range range32 = categoryPlot18.getDataRange(valueAxis31);
        categoryPlot18.clearRangeMarkers((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot35.setInsets(rectangleInsets36);
        org.jfree.chart.axis.AxisLocation axisLocation39 = categoryPlot35.getDomainAxisLocation((-1));
        org.jfree.data.general.DatasetGroup datasetGroup40 = categoryPlot35.getDatasetGroup();
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        categoryPlot41.markerChanged(markerChangeEvent42);
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray45 = new org.jfree.chart.axis.ValueAxis[] { valueAxis44 };
        categoryPlot41.setRangeAxes(valueAxisArray45);
        categoryPlot41.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean50 = categoryPlot41.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation51 = categoryPlot41.getDomainAxisLocation();
        categoryPlot35.setRangeAxisLocation(axisLocation51, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot54 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent55 = null;
        categoryPlot54.markerChanged(markerChangeEvent55);
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray58 = new org.jfree.chart.axis.ValueAxis[] { valueAxis57 };
        categoryPlot54.setRangeAxes(valueAxisArray58);
        categoryPlot54.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        categoryPlot54.mapDatasetToRangeAxis((int) 'a', (int) (short) 1);
        org.jfree.chart.plot.PlotOrientation plotOrientation66 = categoryPlot54.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge67 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation51, plotOrientation66);
        categoryPlot18.setRangeAxisLocation(axisLocation51);
        categoryPlot0.setDomainAxisLocation((int) ' ', axisLocation51);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNull(categoryAxis19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(valueAxisArray29);
        org.junit.Assert.assertNull(range32);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNotNull(axisLocation39);
        org.junit.Assert.assertNull(datasetGroup40);
        org.junit.Assert.assertNotNull(valueAxisArray45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(axisLocation51);
        org.junit.Assert.assertNotNull(valueAxisArray58);
        org.junit.Assert.assertNotNull(plotOrientation66);
        org.junit.Assert.assertNotNull(rectangleEdge67);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        int int21 = categoryPlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot22.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = null;
        int int25 = categoryPlot22.getDomainAxisIndex(categoryAxis24);
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        categoryPlot22.setDomainAxis((int) (short) 100, categoryAxis27, false);
        org.jfree.chart.util.Layer layer30 = null;
        java.util.Collection collection31 = categoryPlot22.getRangeMarkers(layer30);
        categoryPlot22.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        int int35 = categoryPlot22.getDomainAxisIndex(categoryAxis34);
        categoryPlot22.setAnchorValue((double) 10L, true);
        org.jfree.chart.axis.ValueAxis valueAxis39 = categoryPlot22.getRangeAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = categoryPlot40.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = null;
        int int43 = categoryPlot40.getDomainAxisIndex(categoryAxis42);
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = null;
        categoryPlot40.setDomainAxis((int) (short) 100, categoryAxis45, false);
        org.jfree.chart.util.Layer layer48 = null;
        java.util.Collection collection49 = categoryPlot40.getRangeMarkers(layer48);
        categoryPlot40.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.SortOrder sortOrder52 = categoryPlot40.getRowRenderingOrder();
        categoryPlot22.setColumnRenderingOrder(sortOrder52);
        org.jfree.chart.axis.ValueAxis valueAxis55 = categoryPlot22.getRangeAxisForDataset((int) (byte) 0);
        categoryPlot22.clearRangeMarkers();
        java.awt.Stroke stroke57 = categoryPlot22.getOutlineStroke();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor58 = categoryPlot22.getDomainGridlinePosition();
        org.jfree.chart.plot.CategoryPlot categoryPlot59 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent60 = null;
        categoryPlot59.markerChanged(markerChangeEvent60);
        org.jfree.chart.util.RectangleEdge rectangleEdge63 = categoryPlot59.getDomainAxisEdge((int) '4');
        categoryPlot59.setAnchorValue((double) (short) 1);
        double double66 = categoryPlot59.getRangeCrosshairValue();
        org.jfree.chart.axis.CategoryAxis categoryAxis67 = categoryPlot59.getDomainAxis();
        org.jfree.chart.plot.PlotOrientation plotOrientation68 = categoryPlot59.getOrientation();
        java.awt.Paint paint69 = categoryPlot59.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets70 = categoryPlot59.getInsets();
        org.jfree.chart.plot.CategoryPlot categoryPlot71 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent72 = null;
        categoryPlot71.markerChanged(markerChangeEvent72);
        org.jfree.chart.plot.CategoryPlot categoryPlot75 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent76 = null;
        categoryPlot75.markerChanged(markerChangeEvent76);
        org.jfree.chart.axis.ValueAxis valueAxis78 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray79 = new org.jfree.chart.axis.ValueAxis[] { valueAxis78 };
        categoryPlot75.setRangeAxes(valueAxisArray79);
        categoryPlot75.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        boolean boolean84 = categoryPlot75.isRangeCrosshairVisible();
        org.jfree.chart.axis.AxisLocation axisLocation85 = categoryPlot75.getDomainAxisLocation();
        categoryPlot71.setDomainAxisLocation((int) (byte) 1, axisLocation85, false);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray88 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot71.setDomainAxes(categoryAxisArray88);
        categoryPlot59.setDomainAxes(categoryAxisArray88);
        categoryPlot22.setDomainAxes(categoryAxisArray88);
        categoryPlot0.setDomainAxes(categoryAxisArray88);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(collection31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertNull(categoryAxis41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(collection49);
        org.junit.Assert.assertNotNull(sortOrder52);
        org.junit.Assert.assertNull(valueAxis55);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(categoryAnchor58);
        org.junit.Assert.assertNotNull(rectangleEdge63);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNull(categoryAxis67);
        org.junit.Assert.assertNotNull(plotOrientation68);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNotNull(rectangleInsets70);
        org.junit.Assert.assertNotNull(valueAxisArray79);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(axisLocation85);
        org.junit.Assert.assertNotNull(categoryAxisArray88);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.clearDomainMarkers(100);
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.Marker marker9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addRangeMarker(marker9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        categoryPlot0.addChangeListener(plotChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = categoryPlot0.getDatasetGroup();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent7);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        boolean boolean13 = categoryPlot0.render(graphics2D9, rectangle2D10, (int) (byte) 100, plotRenderingInfo12);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        categoryPlot0.addChangeListener(plotChangeListener17);
        org.jfree.chart.util.Layer layer20 = null;
        java.util.Collection collection21 = categoryPlot0.getDomainMarkers((int) (byte) 1, layer20);
        org.jfree.chart.axis.AxisLocation axisLocation22 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        categoryPlot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = categoryPlot23.getDomainAxisEdge((int) '4');
        categoryPlot23.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = null;
        categoryPlot23.setRenderer(categoryItemRenderer30);
        int int32 = categoryPlot23.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot23.zoomDomainAxes((double) (-1), (double) 100.0f, plotRenderingInfo35, point2D36);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        java.awt.geom.Point2D point2D41 = null;
        categoryPlot23.zoomRangeAxes((double) 1, 0.0d, plotRenderingInfo40, point2D41);
        java.awt.Stroke stroke43 = categoryPlot23.getRangeCrosshairStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot44.setInsets(rectangleInsets45);
        org.jfree.chart.axis.AxisLocation axisLocation48 = categoryPlot44.getDomainAxisLocation((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent50 = null;
        categoryPlot49.markerChanged(markerChangeEvent50);
        org.jfree.chart.util.RectangleEdge rectangleEdge53 = categoryPlot49.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation54 = categoryPlot49.getRangeAxisLocation();
        categoryPlot44.setDomainAxisLocation(axisLocation54, false);
        org.jfree.chart.axis.AxisLocation axisLocation57 = categoryPlot44.getRangeAxisLocation();
        categoryPlot23.setDomainAxisLocation(axisLocation57);
        categoryPlot0.setDomainAxisLocation(axisLocation57);
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        categoryPlot0.setDataset(11, categoryDataset61);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertNotNull(axisLocation22);
        org.junit.Assert.assertNotNull(rectangleEdge27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(axisLocation48);
        org.junit.Assert.assertNotNull(rectangleEdge53);
        org.junit.Assert.assertNotNull(axisLocation54);
        org.junit.Assert.assertNotNull(axisLocation57);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        java.awt.Paint paint24 = categoryPlot0.getOutlinePaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        categoryPlot25.markerChanged(markerChangeEvent26);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot25.getDomainAxisEdge((int) '4');
        categoryPlot25.setAnchorValue((double) (short) 1);
        categoryPlot25.clearRangeAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        categoryPlot25.zoomRangeAxes(1.0d, (double) 0L, plotRenderingInfo35, point2D36);
        org.jfree.chart.axis.AxisSpace axisSpace38 = categoryPlot25.getFixedDomainAxisSpace();
        categoryPlot25.clearRangeMarkers();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = categoryPlot25.getInsets();
        categoryPlot0.setInsets(rectangleInsets40);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(sortOrder21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNull(axisSpace38);
        org.junit.Assert.assertNotNull(rectangleInsets40);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        double double19 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        categoryPlot2.markerChanged(markerChangeEvent3);
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = categoryPlot2.getDomainAxisEdge((int) '4');
        categoryPlot2.setAnchorValue((double) (short) 1);
        double double9 = categoryPlot2.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot10 = categoryPlot2.getRootPlot();
        categoryPlot2.mapDatasetToRangeAxis(0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot14.setInsets(rectangleInsets15);
        org.jfree.chart.LegendItemCollection legendItemCollection17 = null;
        categoryPlot14.setFixedLegendItems(legendItemCollection17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot14.zoomDomainAxes((double) ' ', (double) (short) 10, plotRenderingInfo21, point2D22);
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot14.getRangeAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation26 = categoryPlot14.getRangeAxisLocation(0);
        categoryPlot2.setDomainAxisLocation(axisLocation26, true);
        categoryPlot0.setRangeAxisLocation(axisLocation26);
        java.awt.Stroke stroke30 = categoryPlot0.getRangeCrosshairStroke();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertNotNull(rectangleEdge6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleEdge24);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1, true);
        categoryPlot0.setWeight((int) (byte) -1);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = categoryPlot0.getInsets();
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setRangeCrosshairValue((double) (byte) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot17.setInsets(rectangleInsets18);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = null;
        categoryPlot17.setFixedLegendItems(legendItemCollection20);
        java.awt.Paint paint22 = categoryPlot17.getNoDataMessagePaint();
        categoryPlot16.setBackgroundPaint(paint22);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = categoryPlot16.getRenderer((int) (short) 100);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        categoryPlot16.setDataset(categoryDataset26);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = null;
        int int29 = categoryPlot16.getIndexOf(categoryItemRenderer28);
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot16);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(rectangleEdge13);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(categoryItemRenderer25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        categoryPlot0.setRenderer(categoryItemRenderer19);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot21.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        int int24 = categoryPlot21.getDomainAxisIndex(categoryAxis23);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        categoryPlot21.setDomainAxis((int) (short) 100, categoryAxis26, false);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = categoryPlot21.getRangeMarkers(layer29);
        categoryPlot21.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = null;
        int int34 = categoryPlot21.getDomainAxisIndex(categoryAxis33);
        categoryPlot21.setAnchorValue((double) 10L, true);
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        boolean boolean42 = categoryPlot21.render(graphics2D38, rectangle2D39, (int) (byte) 10, plotRenderingInfo41);
        categoryPlot21.setRangeCrosshairLockedOnData(true);
        boolean boolean45 = categoryPlot21.isOutlineVisible();
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot46.setInsets(rectangleInsets47);
        org.jfree.chart.LegendItemCollection legendItemCollection49 = null;
        categoryPlot46.setFixedLegendItems(legendItemCollection49);
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent52 = null;
        categoryPlot51.markerChanged(markerChangeEvent52);
        org.jfree.chart.util.RectangleEdge rectangleEdge55 = categoryPlot51.getDomainAxisEdge((int) '4');
        categoryPlot51.setAnchorValue((double) (short) 1);
        double double58 = categoryPlot51.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot59 = categoryPlot51.getRootPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray60 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] {};
        categoryPlot51.setRenderers(categoryItemRendererArray60);
        categoryPlot46.setRenderers(categoryItemRendererArray60);
        categoryPlot21.setRenderers(categoryItemRendererArray60);
        categoryPlot0.setRenderers(categoryItemRendererArray60);
        org.jfree.chart.util.RectangleEdge rectangleEdge65 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryAxis22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertNotNull(rectangleEdge55);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(plot59);
        org.junit.Assert.assertNotNull(categoryItemRendererArray60);
        org.junit.Assert.assertNotNull(rectangleEdge65);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        categoryPlot0.setAnchorValue(0.0d);
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis29);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = null;
        categoryPlot0.setRenderer((int) (byte) 10, categoryItemRenderer32, false);
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleEdge rectangleEdge1 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation2 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        int int4 = categoryPlot0.getIndexOf(categoryItemRenderer3);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        java.util.List list6 = categoryPlot0.getCategoriesForAxis(categoryAxis5);
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getRangeMarkers(layer7);
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        categoryPlot0.addChangeListener(plotChangeListener9);
        org.junit.Assert.assertNotNull(rectangleEdge1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        categoryPlot0.setDomainAxis(categoryAxis13);
        boolean boolean15 = categoryPlot0.isRangeGridlinesVisible();
        java.awt.Paint paint16 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        categoryPlot0.setDomainAxis((int) 'a', categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot0.setDomainAxis(101, categoryAxis18, false);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(axisSpace13);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        boolean boolean6 = categoryPlot0.isDomainGridlinesVisible();
        categoryPlot0.setDomainGridlinesVisible(false);
        java.awt.Stroke stroke9 = categoryPlot0.getDomainGridlineStroke();
        categoryPlot0.setOutlineVisible(true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot0.setRenderer((int) (short) 1, categoryItemRenderer13, true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        categoryPlot0.setWeight((int) (byte) 1);
        org.jfree.chart.util.SortOrder sortOrder28 = categoryPlot0.getColumnRenderingOrder();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(sortOrder28);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        categoryPlot0.setRangeAxis(valueAxis1);
        org.jfree.chart.util.RectangleEdge rectangleEdge3 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(rectangleEdge3);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.jfree.chart.axis.AxisLocation axisLocation52 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.axis.CategoryAxis categoryAxis54 = categoryPlot0.getDomainAxisForDataset(100);
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
        org.junit.Assert.assertNotNull(axisLocation52);
        org.junit.Assert.assertNull(categoryAxis54);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        double double7 = categoryPlot0.getRangeCrosshairValue();
        float float8 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = categoryPlot0.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleEdge9);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = null;
        categoryPlot0.setRenderer(categoryItemRenderer29, false);
        boolean boolean32 = categoryPlot0.isRangeGridlinesVisible();
        categoryPlot0.setRangeCrosshairValue((double) (byte) -1, false);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer7 = null;
        categoryPlot0.setRenderer(categoryItemRenderer7);
        categoryPlot0.setAnchorValue((double) 10.0f);
        java.awt.Paint paint11 = categoryPlot0.getRangeCrosshairPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis14 = categoryPlot0.getRangeAxisForDataset((int) (short) 10);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(categoryAxis12);
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        categoryPlot12.markerChanged(markerChangeEvent13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray16 = new org.jfree.chart.axis.ValueAxis[] { valueAxis15 };
        categoryPlot12.setRangeAxes(valueAxisArray16);
        categoryPlot12.mapDatasetToRangeAxis((int) (short) 100, (int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot22.setInsets(rectangleInsets23);
        org.jfree.chart.LegendItemCollection legendItemCollection25 = null;
        categoryPlot22.setFixedLegendItems(legendItemCollection25);
        java.awt.Paint paint27 = categoryPlot22.getNoDataMessagePaint();
        categoryPlot21.setBackgroundPaint(paint27);
        categoryPlot12.setRangeCrosshairPaint(paint27);
        java.awt.Paint paint30 = categoryPlot12.getRangeCrosshairPaint();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder31 = categoryPlot12.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder31);
        java.awt.Stroke stroke33 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset34 = categoryPlot0.getDataset();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(valueAxisArray16);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(datasetRenderingOrder31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNull(categoryDataset34);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getRangeMarkers((int) ' ', layer13);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot0.getDomainAxisIndex(categoryAxis15);
        boolean boolean17 = categoryPlot0.isDomainZoomable();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryItemRenderer9);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        categoryPlot0.removeChangeListener(plotChangeListener5);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        int int8 = categoryPlot0.getDomainAxisIndex(categoryAxis7);
        java.awt.Font font9 = categoryPlot0.getNoDataMessageFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot10.markerChanged(markerChangeEvent11);
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot10.getDomainAxisEdge((int) '4');
        categoryPlot10.setAnchorValue((double) (short) 1);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = null;
        categoryPlot10.setRenderer(categoryItemRenderer17);
        java.awt.Stroke stroke19 = categoryPlot10.getDomainGridlineStroke();
        categoryPlot10.setRangeCrosshairLockedOnData(true);
        categoryPlot10.setBackgroundImageAlignment(10);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        categoryPlot10.setRenderer(categoryItemRenderer24);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor26 = categoryPlot10.getDomainGridlinePosition();
        categoryPlot0.setDomainGridlinePosition(categoryAnchor26);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(categoryAnchor26);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = categoryPlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot0.getRendererForDataset(categoryDataset20);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertNotNull(datasetRenderingOrder18);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNull(categoryItemRenderer21);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot0.getRangeMarkers((-1), layer21);
        categoryPlot0.configureRangeAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        categoryPlot0.removeChangeListener(plotChangeListener24);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(collection22);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        java.awt.Stroke stroke16 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke16);
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.data.category.CategoryDataset categoryDataset21 = categoryPlot0.getDataset((-1));
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(categoryDataset21);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        double double22 = categoryPlot0.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = categoryPlot12.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = null;
        int int15 = categoryPlot12.getDomainAxisIndex(categoryAxis14);
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        categoryPlot12.setDomainAxis((int) (short) 100, categoryAxis17, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        int int21 = categoryPlot12.getDomainAxisIndex(categoryAxis20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.data.Range range23 = categoryPlot12.getDataRange(valueAxis22);
        categoryPlot12.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean27 = categoryPlot12.isSubplot();
        java.awt.Paint paint28 = categoryPlot12.getOutlinePaint();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder29 = categoryPlot12.getDatasetRenderingOrder();
        categoryPlot0.setDatasetRenderingOrder(datasetRenderingOrder29);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(categoryAxis13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(range23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(datasetRenderingOrder29);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        categoryPlot0.removeChangeListener(plotChangeListener5);
        org.jfree.chart.axis.AxisLocation axisLocation8 = categoryPlot0.getRangeAxisLocation((int) 'a');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes(100.0d, (double) 1.0f, plotRenderingInfo11, point2D12);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation8);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder20 = categoryPlot0.getDatasetRenderingOrder();
        float float21 = categoryPlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(valueAxisArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(datasetRenderingOrder20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        org.jfree.chart.util.SortOrder sortOrder35 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryMarker categoryMarker36 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.addDomainMarker(categoryMarker36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset29);
        org.junit.Assert.assertNotNull(sortOrder35);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        categoryPlot0.clearDomainMarkers((int) (short) -1);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleEdge12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.data.Range range22 = categoryPlot0.getDataRange(valueAxis21);
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        categoryPlot0.removeChangeListener(plotChangeListener23);
        boolean boolean25 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        categoryPlot0.setAnchorValue((double) (short) 1);
        categoryPlot0.clearRangeAxes();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset((int) '#', categoryDataset9);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = categoryPlot0.getLegendItems();
        categoryPlot0.clearRangeAxes();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(legendItemCollection11);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        categoryPlot0.notifyListeners(plotChangeEvent15);
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = categoryPlot0.getDomainMarkers((int) (byte) 0, layer18);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(plotOrientation12);
        org.junit.Assert.assertNull(collection19);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        int int3 = categoryPlot0.getDomainAxisIndex(categoryAxis2);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        categoryPlot0.setDomainAxis((int) (short) 100, categoryAxis5, false);
        org.jfree.chart.util.Layer layer8 = null;
        java.util.Collection collection9 = categoryPlot0.getRangeMarkers(layer8);
        int int10 = categoryPlot0.getDatasetCount();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        categoryPlot0.markerChanged(markerChangeEvent11);
        org.jfree.chart.axis.AxisLocation axisLocation14 = null;
        categoryPlot0.setDomainAxisLocation((int) ' ', axisLocation14);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        org.jfree.chart.axis.ValueAxis valueAxis19 = categoryPlot0.getRangeAxis((int) (byte) 10);
        org.junit.Assert.assertNotNull(valueAxisArray4);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNull(valueAxis19);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        float float5 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = categoryPlot6.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = null;
        int int9 = categoryPlot6.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        categoryPlot6.setDomainAxis((int) (short) 100, categoryAxis11, false);
        java.awt.Image image14 = null;
        categoryPlot6.setBackgroundImage(image14);
        categoryPlot6.mapDatasetToDomainAxis((int) '#', 1);
        org.jfree.chart.LegendItemCollection legendItemCollection19 = null;
        categoryPlot6.setFixedLegendItems(legendItemCollection19);
        java.awt.Paint paint21 = categoryPlot6.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot6.getRendererForDataset(categoryDataset22);
        org.jfree.chart.util.SortOrder sortOrder24 = categoryPlot6.getColumnRenderingOrder();
        categoryPlot0.setColumnRenderingOrder(sortOrder24);
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = null;
        java.util.List list27 = categoryPlot0.getCategoriesForAxis(categoryAxis26);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(categoryAxis7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(categoryItemRenderer23);
        org.junit.Assert.assertNotNull(sortOrder24);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot24.getRenderer((int) '4');
        java.util.List list27 = categoryPlot24.getAnnotations();
        org.jfree.chart.LegendItemCollection legendItemCollection28 = categoryPlot24.getLegendItems();
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        categoryPlot29.markerChanged(markerChangeEvent30);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot29.getDomainAxisEdge((int) '4');
        categoryPlot29.setAnchorValue((double) (short) 1);
        double double36 = categoryPlot29.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot37 = categoryPlot29.getRootPlot();
        double double38 = categoryPlot29.getRangeCrosshairValue();
        int int39 = categoryPlot29.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation41 = categoryPlot29.getRangeAxisLocation((int) ' ');
        categoryPlot24.setDomainAxisLocation(axisLocation41);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent43 = null;
        categoryPlot24.notifyListeners(plotChangeEvent43);
        java.awt.Stroke stroke45 = categoryPlot24.getRangeGridlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke45);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer47 = null;
        categoryPlot0.setRenderer(categoryItemRenderer47);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryItemRenderer26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(legendItemCollection28);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(plot37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(axisLocation41);
        org.junit.Assert.assertNotNull(stroke45);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent1 = null;
        categoryPlot0.markerChanged(markerChangeEvent1);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getDomainAxisEdge((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation5 = categoryPlot0.getRangeAxisLocation();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        categoryPlot0.setRangeCrosshairStroke(stroke6);
        java.awt.Image image8 = categoryPlot0.getBackgroundImage();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot10.setInsets(rectangleInsets11);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        categoryPlot10.setFixedLegendItems(legendItemCollection13);
        java.awt.Paint paint15 = categoryPlot10.getNoDataMessagePaint();
        categoryPlot9.setBackgroundPaint(paint15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot9.getRenderer((int) (short) 100);
        boolean boolean19 = categoryPlot9.isDomainGridlinesVisible();
        boolean boolean20 = categoryPlot0.equals((java.lang.Object) categoryPlot9);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.Point2D point2D23 = null;
        org.jfree.chart.plot.PlotState plotState24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot9.draw(graphics2D21, rectangle2D22, point2D23, plotState24, plotRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemRenderer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = null;
        categoryPlot0.setFixedLegendItems(legendItemCollection3);
        java.lang.Object obj5 = categoryPlot0.clone();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setRangeGridlinesVisible(false);
        boolean boolean11 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) (short) 100, categoryAxis18, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = null;
        int int22 = categoryPlot13.getDomainAxisIndex(categoryAxis21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = categoryPlot13.getDataset((int) (byte) 1);
        categoryPlot13.setRangeCrosshairValue((double) 100.0f, true);
        java.awt.Paint paint28 = categoryPlot13.getRangeCrosshairPaint();
        boolean boolean29 = categoryPlot13.isDomainGridlinesVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot13.getDomainAxisForDataset((int) (byte) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = categoryPlot32.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = null;
        int int35 = categoryPlot32.getDomainAxisIndex(categoryAxis34);
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = null;
        categoryPlot32.setDomainAxis((int) (short) 100, categoryAxis37, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = null;
        int int41 = categoryPlot32.getIndexOf(categoryItemRenderer40);
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = null;
        categoryPlot32.setDomainAxis(categoryAxis42);
        java.awt.Stroke stroke44 = categoryPlot32.getDomainGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = categoryPlot46.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = null;
        int int49 = categoryPlot46.getDomainAxisIndex(categoryAxis48);
        org.jfree.chart.axis.CategoryAxis categoryAxis51 = null;
        categoryPlot46.setDomainAxis((int) (short) 100, categoryAxis51, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis54 = null;
        int int55 = categoryPlot46.getDomainAxisIndex(categoryAxis54);
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.data.Range range57 = categoryPlot46.getDataRange(valueAxis56);
        categoryPlot46.setRangeCrosshairValue((double) 10.0f, true);
        boolean boolean61 = categoryPlot46.isSubplot();
        categoryPlot46.configureDomainAxes();
        categoryPlot46.setRangeCrosshairValue((double) 1.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot65 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent66 = null;
        categoryPlot65.markerChanged(markerChangeEvent66);
        org.jfree.chart.util.RectangleEdge rectangleEdge69 = categoryPlot65.getDomainAxisEdge((int) '4');
        categoryPlot65.setAnchorValue((double) (short) 1);
        double double72 = categoryPlot65.getRangeCrosshairValue();
        org.jfree.chart.plot.Plot plot73 = categoryPlot65.getRootPlot();
        double double74 = categoryPlot65.getRangeCrosshairValue();
        int int75 = categoryPlot65.getRangeAxisCount();
        org.jfree.chart.axis.AxisLocation axisLocation77 = categoryPlot65.getRangeAxisLocation((int) ' ');
        categoryPlot46.setDomainAxisLocation(axisLocation77);
        categoryPlot32.setDomainAxisLocation((int) (short) 0, axisLocation77);
        categoryPlot13.setRangeAxisLocation(axisLocation77);
        categoryPlot0.setDomainAxisLocation((int) (short) 1, axisLocation77, false);
        org.jfree.chart.util.Layer layer84 = null;
        java.util.Collection collection85 = categoryPlot0.getRangeMarkers((int) '4', layer84);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(categoryAxis31);
        org.junit.Assert.assertNull(categoryAxis33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNull(categoryAxis47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(range57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(rectangleEdge69);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(plot73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(axisLocation77);
        org.junit.Assert.assertNull(collection85);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.awt.Stroke stroke55 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = categoryPlot0.getInsets();
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
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(rectangleInsets56);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getWeight();
        java.util.List list2 = categoryPlot0.getCategories();
        float float3 = categoryPlot0.getForegroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation4 = categoryPlot0.getDomainAxisLocation();
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = null;
        int int6 = categoryPlot0.getDomainAxisIndex(categoryAxis5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = categoryPlot0.getInsets();
        java.awt.Paint paint47 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer49 = null;
        categoryPlot0.setRenderer((int) (byte) 1, categoryItemRenderer49, true);
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
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        categoryPlot0.setRangeCrosshairLockedOnData(true);
        boolean boolean24 = categoryPlot0.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        categoryPlot0.setDataset((int) '#', categoryDataset26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot0.zoomRangeAxes((double) '4', (double) 1, plotRenderingInfo30, point2D31);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        categoryPlot0.clearRangeMarkers();
        categoryPlot0.setRangeCrosshairValue((double) 1.0f);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        boolean boolean15 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Category Plot" + "'", str10, "Category Plot");
        org.junit.Assert.assertNull(valueAxis14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.data.Range range22 = categoryPlot0.getDataRange(valueAxis21);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = categoryPlot23.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = null;
        int int26 = categoryPlot23.getDomainAxisIndex(categoryAxis25);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = null;
        int int28 = categoryPlot23.getIndexOf(categoryItemRenderer27);
        org.jfree.chart.plot.Plot plot29 = categoryPlot23.getParent();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = null;
        categoryPlot23.setRenderer(100, categoryItemRenderer31, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = null;
        categoryPlot23.setRenderer((int) (byte) 1, categoryItemRenderer35);
        int int37 = categoryPlot23.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = categoryPlot23.getDomainAxisEdge();
        java.lang.String str39 = categoryPlot23.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = categoryPlot23.getAxisOffset();
        boolean boolean41 = categoryPlot0.equals((java.lang.Object) categoryPlot23);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(range22);
        org.junit.Assert.assertNull(categoryAxis24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(plot29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        categoryPlot0.removeChangeListener(plotChangeListener38);
        categoryPlot0.setAnchorValue((double) ' ');
        java.awt.Paint paint42 = categoryPlot0.getRangeCrosshairPaint();
        java.awt.Font font43 = categoryPlot0.getNoDataMessageFont();
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
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(font43);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = categoryPlot13.getDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        int int16 = categoryPlot13.getDomainAxisIndex(categoryAxis15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = null;
        categoryPlot13.setDomainAxis((int) (short) 100, categoryAxis18, false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot13.getRangeMarkers(layer21);
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray24 = new org.jfree.chart.axis.ValueAxis[] { valueAxis23 };
        categoryPlot13.setRangeAxes(valueAxisArray24);
        categoryPlot0.setRangeAxes(valueAxisArray24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot0.zoomDomainAxes((double) (byte) -1, plotRenderingInfo28, point2D29);
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNotNull(valueAxisArray11);
        org.junit.Assert.assertNull(categoryAxis14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertNotNull(valueAxisArray24);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = categoryPlot0.getRendererForDataset(categoryDataset15);
        boolean boolean17 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot0.getLegendItems();
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = categoryPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(categoryItemRenderer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendItemCollection18);
        org.junit.Assert.assertNotNull(rectangleEdge19);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        categoryPlot0.setDomainGridlinesVisible(true);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = categoryPlot0.getDomainAxis();
        float float2 = categoryPlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(categoryAxis1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        categoryPlot0.setInsets(rectangleInsets1);
        java.awt.Image image3 = null;
        categoryPlot0.setBackgroundImage(image3);
        boolean boolean5 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        categoryPlot0.zoomRangeAxes((double) '4', (double) (short) 0, plotRenderingInfo8, point2D9);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = categoryPlot0.removeAnnotation(categoryAnnotation11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        java.awt.Paint paint49 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis51 = categoryPlot0.getDomainAxis(1);
        java.awt.Stroke stroke52 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.setRangeGridlineStroke(stroke52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(categoryAxis51);
    }
}

