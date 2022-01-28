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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.zoom((double) 0.5f);
        multiplePiePlot1.setForegroundAlpha(1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Paint paint16 = null;
        multiplePiePlot12.setBackgroundPaint(paint16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot12.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot12.getDatasetGroup();
        java.awt.Paint paint20 = multiplePiePlot12.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot12.getInsets();
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot12.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot24.setParent((org.jfree.chart.plot.Plot) multiplePiePlot27);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot27.getInsets();
        multiplePiePlot27.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.util.TableOrder tableOrder35 = multiplePiePlot27.getDataExtractOrder();
        java.awt.Paint paint36 = multiplePiePlot27.getBackgroundPaint();
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot27.getPieChart();
        multiplePiePlot12.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        multiplePiePlot1.setPieChart(jFreeChart37);
        int int40 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNull(tableOrder35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(jFreeChart37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent5);
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        java.lang.Object obj9 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot3.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Stroke stroke11 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke11);
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setForegroundAlpha((float) 10);
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(tableOrder13);
        org.junit.Assert.assertNull(categoryDataset16);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getAggregatedItemsPaint();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessage("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot1.setDataset(categoryDataset7);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.zoom((double) (short) 1);
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        boolean boolean10 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setLimit((double) (byte) 0);
        java.awt.Paint paint13 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        java.lang.Comparable comparable13 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setForegroundAlpha((float) '4');
        float float16 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 52.0f + "'", float16 == 52.0f);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.awt.Image image10 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot1.handleClick((int) (byte) 1, (int) ' ', plotRenderingInfo14);
        float float16 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        float float17 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setForegroundAlpha((float) 0L);
        java.awt.Paint paint23 = multiplePiePlot19.getNoDataMessagePaint();
        java.awt.Paint paint24 = multiplePiePlot19.getBackgroundPaint();
        boolean boolean25 = multiplePiePlot19.isOutlineVisible();
        multiplePiePlot19.zoom((double) (byte) -1);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot19.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart28);
        java.awt.Stroke stroke30 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        java.lang.String str14 = multiplePiePlot4.getPlotType();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot4.getRootPlot();
        java.awt.Font font16 = plot15.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        java.awt.Paint paint13 = multiplePiePlot11.getBackgroundPaint();
        java.awt.Paint paint14 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot11.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier19);
        boolean boolean22 = multiplePiePlot18.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot18.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = multiplePiePlot25.getDrawingSupplier();
        java.awt.Paint paint30 = multiplePiePlot25.getNoDataMessagePaint();
        multiplePiePlot18.setBackgroundPaint(paint30);
        multiplePiePlot11.setBackgroundPaint(paint30);
        java.awt.Image image33 = multiplePiePlot11.getBackgroundImage();
        multiplePiePlot11.setOutlineVisible(true);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot11);
        multiplePiePlot11.setNoDataMessage("Other");
        java.lang.String str39 = multiplePiePlot11.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(drawingSupplier29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(image33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Other" + "'", str39, "Other");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        java.awt.Paint paint9 = multiplePiePlot7.getBackgroundPaint();
        float float10 = multiplePiePlot7.getForegroundAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        multiplePiePlot7.setLimit((double) '4');
        float float14 = multiplePiePlot7.getForegroundAlpha();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot7.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.lang.String str18 = multiplePiePlot7.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setLimit((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = multiplePiePlot10.getAggregatedItemsPaint();
        java.lang.Comparable comparable15 = multiplePiePlot10.getAggregatedItemsKey();
        multiplePiePlot10.setBackgroundImageAlpha((float) 0);
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        double double19 = multiplePiePlot10.getLimit();
        java.awt.Paint paint20 = multiplePiePlot10.getAggregatedItemsPaint();
        java.awt.Font font21 = multiplePiePlot10.getNoDataMessageFont();
        float float22 = multiplePiePlot10.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        boolean boolean29 = multiplePiePlot28.isSubplot();
        multiplePiePlot28.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot25.setParent((org.jfree.chart.plot.Plot) multiplePiePlot28);
        java.awt.Stroke stroke33 = multiplePiePlot28.getOutlineStroke();
        multiplePiePlot28.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        multiplePiePlot28.setDataset(categoryDataset36);
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        multiplePiePlot28.drawBackgroundImage(graphics2D38, rectangle2D39);
        java.lang.String str41 = multiplePiePlot28.getPlotType();
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot28);
        multiplePiePlot28.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot28.drawBackground(graphics2D45, rectangle2D46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Multiple Pie Plot" + "'", str41, "Multiple Pie Plot");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setBackgroundImageAlignment((int) 'a');
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        boolean boolean16 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot1.setDataset(categoryDataset17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot1.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot19.handleClick((int) (byte) 1, 1, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(plot19);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image7 = null;
        multiplePiePlot1.setBackgroundImage(image7);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = null;
        multiplePiePlot13.setBackgroundPaint(paint17);
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font21 = multiplePiePlot13.getNoDataMessageFont();
        java.awt.Paint paint22 = multiplePiePlot13.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint22);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D26, rectangle2D27);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier7);
        float float9 = multiplePiePlot6.getBackgroundImageAlpha();
        java.awt.Paint paint10 = multiplePiePlot6.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent13);
        multiplePiePlot1.setLimit((double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(drawingSupplier12);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        float float11 = multiplePiePlot7.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot7.setDataset(categoryDataset12);
        boolean boolean14 = multiplePiePlot7.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener18);
        java.awt.Paint paint20 = multiplePiePlot16.getAggregatedItemsPaint();
        multiplePiePlot7.setOutlinePaint(paint20);
        multiplePiePlot1.setNoDataMessagePaint(paint20);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(categoryDataset23);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        int int9 = plot6.getBackgroundImageAlignment();
        java.awt.Font font10 = plot6.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot11 = plot6.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot1.getDrawingSupplier();
        java.lang.Comparable comparable14 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setLimit((double) ' ');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        multiplePiePlot1.setDataset(categoryDataset10);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.awt.Paint paint14 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setForegroundAlpha((float) 0L);
        java.awt.Paint paint20 = multiplePiePlot16.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot16.setDataset(categoryDataset21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier25);
        java.awt.Image image27 = null;
        multiplePiePlot24.setBackgroundImage(image27);
        java.awt.Paint paint29 = multiplePiePlot24.getAggregatedItemsPaint();
        multiplePiePlot16.setBackgroundPaint(paint29);
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot16.getDatasetGroup();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        multiplePiePlot16.drawBackgroundImage(graphics2D32, rectangle2D33);
        boolean boolean35 = multiplePiePlot1.equals((java.lang.Object) graphics2D32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (-1), plotRenderingInfo11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint14 = plot13.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot1.handleClick(10, (int) (short) 10, plotRenderingInfo13);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        java.awt.Image image12 = null;
        multiplePiePlot9.setBackgroundImage(image12);
        java.awt.Paint paint14 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot1.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent18);
        float float20 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot1.getDrawingSupplier();
        java.lang.Comparable comparable16 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Other" + "'", comparable16, "Other");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        java.awt.Image image8 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(image8);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getAggregatedItemsPaint();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNull(drawingSupplier8);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        boolean boolean8 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint9 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier3);
        java.awt.Paint paint5 = multiplePiePlot2.getOutlinePaint();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot2.getRootPlot();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot2.getRootPlot();
        java.awt.Paint paint8 = plot7.getNoDataMessagePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint8);
        java.awt.Stroke stroke10 = multiplePiePlot0.getOutlineStroke();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.plot.PlotState plotState14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D11, rectangle2D12, point2D13, plotState14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessage("hi!");
        double double9 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.zoom((double) (short) 1);
        multiplePiePlot1.setForegroundAlpha((float) 15);
        multiplePiePlot1.zoom((double) 1);
        float float13 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 10);
        java.awt.Stroke stroke16 = multiplePiePlot1.getOutlineStroke();
        java.lang.Comparable comparable17 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 15.0f + "'", float13 == 15.0f);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        java.awt.Paint paint17 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        multiplePiePlot1.zoom((double) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot1.getDatasetGroup();
        java.awt.Stroke stroke20 = multiplePiePlot1.getOutlineStroke();
        java.awt.Paint paint21 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundAlpha((float) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot8.setParent((org.jfree.chart.plot.Plot) multiplePiePlot11);
        java.awt.Stroke stroke16 = multiplePiePlot11.getOutlineStroke();
        multiplePiePlot11.setBackgroundAlpha(0.0f);
        multiplePiePlot11.setBackgroundImageAlpha((float) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        multiplePiePlot11.axisChanged(axisChangeEvent21);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        multiplePiePlot11.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Paint paint26 = multiplePiePlot11.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 0);
        float float3 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot5.markerChanged(markerChangeEvent7);
        java.awt.Paint paint9 = multiplePiePlot5.getAggregatedItemsPaint();
        java.lang.Comparable comparable10 = multiplePiePlot5.getAggregatedItemsKey();
        multiplePiePlot5.setBackgroundImageAlpha((float) 0);
        java.awt.Font font13 = multiplePiePlot5.getNoDataMessageFont();
        double double14 = multiplePiePlot5.getLimit();
        java.awt.Font font15 = multiplePiePlot5.getNoDataMessageFont();
        multiplePiePlot5.setBackgroundAlpha((float) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier20);
        boolean boolean23 = multiplePiePlot19.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot19.getRootPlot();
        plot24.setBackgroundImageAlpha((float) 1);
        java.awt.Stroke stroke27 = plot24.getOutlineStroke();
        java.awt.Stroke stroke28 = plot24.getOutlineStroke();
        multiplePiePlot5.setOutlineStroke(stroke28);
        multiplePiePlot0.setOutlineStroke(stroke28);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Paint paint10 = multiplePiePlot9.getOutlinePaint();
        multiplePiePlot1.setOutlinePaint(paint10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier7);
        float float9 = multiplePiePlot6.getBackgroundImageAlpha();
        java.awt.Paint paint10 = multiplePiePlot6.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint10);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        multiplePiePlot1.setLimit((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier17);
        java.lang.String str19 = multiplePiePlot1.getNoDataMessage();
        float float20 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot1.getParent();
        multiplePiePlot1.setLimit((double) (byte) -1);
        float float24 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNull(datasetGroup25);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot6.setBackgroundPaint(paint10);
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font14 = multiplePiePlot6.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Paint paint21 = multiplePiePlot18.getNoDataMessagePaint();
        java.awt.Paint paint22 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        java.awt.Paint paint25 = null;
        multiplePiePlot1.setBackgroundPaint(paint25);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent27 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent27);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent29 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(jFreeChart24);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1L);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent12);
        boolean boolean14 = multiplePiePlot1.isSubplot();
        float float15 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        float float14 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot16.notifyListeners(plotChangeEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNull(tableOrder15);
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        double double16 = multiplePiePlot1.getLimit();
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(datasetGroup17);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot8.getRootPlot();
        multiplePiePlot8.zoom((double) (short) 1);
        multiplePiePlot8.setForegroundAlpha((float) 15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot8.handleClick((int) (short) 100, 15, plotRenderingInfo20);
        boolean boolean22 = multiplePiePlot8.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        multiplePiePlot24.setForegroundAlpha((float) 0L);
        java.awt.Paint paint28 = multiplePiePlot24.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.lang.String str31 = multiplePiePlot30.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        multiplePiePlot30.addChangeListener(plotChangeListener32);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = multiplePiePlot30.getDrawingSupplier();
        multiplePiePlot24.setDrawingSupplier(drawingSupplier34);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        multiplePiePlot24.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo38);
        org.jfree.chart.JFreeChart jFreeChart40 = multiplePiePlot24.getPieChart();
        multiplePiePlot8.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart40);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart40);
        multiplePiePlot1.setLimit((double) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(drawingSupplier34);
        org.junit.Assert.assertNotNull(jFreeChart40);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(jFreeChart12);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier7);
        float float9 = multiplePiePlot6.getBackgroundImageAlpha();
        java.awt.Paint paint10 = multiplePiePlot6.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint10);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Stroke stroke16 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setNoDataMessage("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(datasetGroup17);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image7 = null;
        multiplePiePlot1.setBackgroundImage(image7);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = multiplePiePlot13.getAggregatedItemsPaint();
        java.lang.Comparable comparable18 = multiplePiePlot13.getAggregatedItemsKey();
        multiplePiePlot13.setBackgroundImageAlpha((float) 0);
        java.awt.Font font21 = multiplePiePlot13.getNoDataMessageFont();
        double double22 = multiplePiePlot13.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Paint paint28 = null;
        multiplePiePlot24.setBackgroundPaint(paint28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot24.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot24.getDatasetGroup();
        java.awt.Paint paint32 = multiplePiePlot24.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot24.getInsets();
        multiplePiePlot13.setInsets(rectangleInsets33, false);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        boolean boolean38 = multiplePiePlot37.isSubplot();
        java.awt.Paint paint39 = multiplePiePlot37.getBackgroundPaint();
        float float40 = multiplePiePlot37.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        java.lang.String str43 = multiplePiePlot42.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        multiplePiePlot42.markerChanged(markerChangeEvent44);
        java.awt.Paint paint46 = null;
        multiplePiePlot42.setBackgroundPaint(paint46);
        multiplePiePlot42.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font50 = multiplePiePlot42.getNoDataMessageFont();
        multiplePiePlot37.setNoDataMessageFont(font50);
        org.jfree.chart.plot.Plot plot52 = multiplePiePlot37.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        boolean boolean55 = multiplePiePlot54.isSubplot();
        java.awt.Paint paint56 = multiplePiePlot54.getBackgroundPaint();
        java.awt.Paint paint57 = multiplePiePlot54.getNoDataMessagePaint();
        java.awt.Paint paint58 = multiplePiePlot54.getNoDataMessagePaint();
        multiplePiePlot37.setOutlinePaint(paint58);
        multiplePiePlot13.setNoDataMessagePaint(paint58);
        multiplePiePlot1.setBackgroundPaint(paint58);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo64 = null;
        multiplePiePlot1.handleClick(100, 100, plotRenderingInfo64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Other" + "'", comparable18, "Other");
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(categoryDataset30);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(font50);
        org.junit.Assert.assertNotNull(plot52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(paint58);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.lang.String str14 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Image image16 = null;
        multiplePiePlot1.setBackgroundImage(image16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(tableOrder15);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot4.getInsets();
        boolean boolean17 = multiplePiePlot4.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot4.getDataExtractOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent19);
        multiplePiePlot4.setBackgroundImageAlignment((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tableOrder18);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (-1), plotRenderingInfo11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot1.setDataset(categoryDataset15);
        boolean boolean17 = multiplePiePlot1.isSubplot();
        double double18 = multiplePiePlot1.getLimit();
        float float19 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = multiplePiePlot7.getAggregatedItemsPaint();
        java.lang.Comparable comparable12 = multiplePiePlot7.getAggregatedItemsKey();
        multiplePiePlot7.setBackgroundImageAlpha((float) 0);
        java.awt.Font font15 = multiplePiePlot7.getNoDataMessageFont();
        double double16 = multiplePiePlot7.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Paint paint22 = null;
        multiplePiePlot18.setBackgroundPaint(paint22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot18.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot18.getDatasetGroup();
        java.awt.Paint paint26 = multiplePiePlot18.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = multiplePiePlot18.getInsets();
        multiplePiePlot7.setInsets(rectangleInsets27, false);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        boolean boolean32 = multiplePiePlot31.isSubplot();
        java.awt.Paint paint33 = multiplePiePlot31.getBackgroundPaint();
        float float34 = multiplePiePlot31.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.lang.String str37 = multiplePiePlot36.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        multiplePiePlot36.markerChanged(markerChangeEvent38);
        java.awt.Paint paint40 = null;
        multiplePiePlot36.setBackgroundPaint(paint40);
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font44 = multiplePiePlot36.getNoDataMessageFont();
        multiplePiePlot31.setNoDataMessageFont(font44);
        org.jfree.chart.plot.Plot plot46 = multiplePiePlot31.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        boolean boolean49 = multiplePiePlot48.isSubplot();
        java.awt.Paint paint50 = multiplePiePlot48.getBackgroundPaint();
        java.awt.Paint paint51 = multiplePiePlot48.getNoDataMessagePaint();
        java.awt.Paint paint52 = multiplePiePlot48.getNoDataMessagePaint();
        multiplePiePlot31.setOutlinePaint(paint52);
        multiplePiePlot7.setNoDataMessagePaint(paint52);
        multiplePiePlot1.setAggregatedItemsPaint(paint52);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent56 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent56);
        java.awt.Paint paint58 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertNotNull(plot46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(paint58);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image7 = null;
        multiplePiePlot1.setBackgroundImage(image7);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = null;
        multiplePiePlot13.setBackgroundPaint(paint17);
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font21 = multiplePiePlot13.getNoDataMessageFont();
        java.awt.Paint paint22 = multiplePiePlot13.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint22);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent24);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot4.getInsets();
        java.lang.Comparable comparable17 = multiplePiePlot4.getAggregatedItemsKey();
        multiplePiePlot4.setBackgroundAlpha((float) '#');
        java.lang.Comparable comparable20 = multiplePiePlot4.getAggregatedItemsKey();
        java.lang.String str21 = multiplePiePlot4.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 0 + "'", comparable17, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 0 + "'", comparable20, (short) 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setLimit((double) (-1L));
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        java.lang.String str17 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier20);
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot19.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        multiplePiePlot19.datasetChanged(datasetChangeEvent23);
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float27 = multiplePiePlot19.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        multiplePiePlot19.axisChanged(axisChangeEvent28);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        multiplePiePlot19.drawBackgroundImage(graphics2D30, rectangle2D31);
        java.awt.Image image33 = null;
        multiplePiePlot19.setBackgroundImage(image33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = null;
        multiplePiePlot36.setDrawingSupplier(drawingSupplier37);
        float float39 = multiplePiePlot36.getBackgroundImageAlpha();
        java.awt.Paint paint40 = multiplePiePlot36.getBackgroundPaint();
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) 1L);
        int int43 = multiplePiePlot36.getBackgroundImageAlignment();
        org.jfree.data.general.DatasetGroup datasetGroup44 = multiplePiePlot36.getDatasetGroup();
        java.awt.Image image45 = null;
        multiplePiePlot36.setBackgroundImage(image45);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier49 = null;
        multiplePiePlot48.setDrawingSupplier(drawingSupplier49);
        org.jfree.chart.plot.Plot plot51 = multiplePiePlot48.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart52 = multiplePiePlot48.getPieChart();
        multiplePiePlot36.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart52);
        multiplePiePlot19.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart52);
        multiplePiePlot1.setPieChart(jFreeChart52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(plot22);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.5f + "'", float39 == 0.5f);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
        org.junit.Assert.assertNull(datasetGroup44);
        org.junit.Assert.assertNotNull(plot51);
        org.junit.Assert.assertNotNull(jFreeChart52);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot1.getPieChart();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(jFreeChart14);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Paint paint16 = multiplePiePlot12.getAggregatedItemsPaint();
        multiplePiePlot9.setOutlinePaint(paint16);
        multiplePiePlot1.setAggregatedItemsPaint(paint16);
        multiplePiePlot1.zoom((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot9.markerChanged(markerChangeEvent11);
        java.awt.Paint paint13 = multiplePiePlot9.getAggregatedItemsPaint();
        java.lang.Comparable comparable14 = multiplePiePlot9.getAggregatedItemsKey();
        multiplePiePlot9.setBackgroundImageAlpha((float) 0);
        java.awt.Font font17 = multiplePiePlot9.getNoDataMessageFont();
        double double18 = multiplePiePlot9.getLimit();
        java.awt.Paint paint19 = multiplePiePlot9.getAggregatedItemsPaint();
        java.awt.Font font20 = multiplePiePlot9.getNoDataMessageFont();
        multiplePiePlot9.setLimit((double) (-1L));
        java.awt.Paint paint23 = null;
        multiplePiePlot9.setOutlinePaint(paint23);
        java.lang.String str25 = multiplePiePlot9.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier28);
        boolean boolean31 = multiplePiePlot27.equals((java.lang.Object) 1.0d);
        multiplePiePlot27.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint34 = multiplePiePlot27.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.lang.String str37 = multiplePiePlot36.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        java.lang.String str40 = multiplePiePlot39.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        multiplePiePlot39.markerChanged(markerChangeEvent41);
        java.awt.Paint paint43 = multiplePiePlot39.getAggregatedItemsPaint();
        multiplePiePlot36.setOutlinePaint(paint43);
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot36.setInsets(rectangleInsets45, true);
        multiplePiePlot27.setInsets(rectangleInsets45);
        java.awt.Paint paint49 = multiplePiePlot27.getNoDataMessagePaint();
        multiplePiePlot9.setOutlinePaint(paint49);
        multiplePiePlot1.setAggregatedItemsPaint(paint49);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = null;
        multiplePiePlot1.handleClick((int) (byte) 100, (int) ' ', plotRenderingInfo54);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        boolean boolean6 = multiplePiePlot5.isSubplot();
        java.awt.Paint paint7 = multiplePiePlot5.getBackgroundPaint();
        float float8 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = null;
        multiplePiePlot10.setBackgroundPaint(paint14);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot5.setNoDataMessageFont(font18);
        multiplePiePlot1.setNoDataMessageFont(font18);
        float float21 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.lang.String str24 = multiplePiePlot23.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        multiplePiePlot23.markerChanged(markerChangeEvent25);
        java.awt.Paint paint27 = multiplePiePlot23.getAggregatedItemsPaint();
        java.lang.Comparable comparable28 = multiplePiePlot23.getAggregatedItemsKey();
        multiplePiePlot23.setBackgroundImageAlpha((float) 0);
        java.awt.Font font31 = multiplePiePlot23.getNoDataMessageFont();
        double double32 = multiplePiePlot23.getLimit();
        java.awt.Font font33 = multiplePiePlot23.getNoDataMessageFont();
        multiplePiePlot23.setBackgroundAlpha((float) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = null;
        multiplePiePlot37.setDrawingSupplier(drawingSupplier38);
        boolean boolean41 = multiplePiePlot37.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot42 = multiplePiePlot37.getRootPlot();
        plot42.setBackgroundImageAlpha((float) 1);
        java.awt.Stroke stroke45 = plot42.getOutlineStroke();
        java.awt.Stroke stroke46 = plot42.getOutlineStroke();
        multiplePiePlot23.setOutlineStroke(stroke46);
        multiplePiePlot1.setOutlineStroke(stroke46);
        java.lang.Comparable comparable49 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Other" + "'", comparable28, "Other");
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(plot42);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + "Other" + "'", comparable49, "Other");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        boolean boolean6 = multiplePiePlot5.isSubplot();
        java.awt.Paint paint7 = multiplePiePlot5.getBackgroundPaint();
        float float8 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = null;
        multiplePiePlot10.setBackgroundPaint(paint14);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot5.setNoDataMessageFont(font18);
        multiplePiePlot1.setNoDataMessageFont(font18);
        multiplePiePlot1.setLimit((double) 100.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) "hi!");
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        java.awt.Stroke stroke27 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot4.getInsets();
        java.lang.Comparable comparable17 = multiplePiePlot4.getAggregatedItemsKey();
        multiplePiePlot4.setBackgroundAlpha((float) '#');
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 0 + "'", comparable17, (short) 0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        multiplePiePlot4.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.util.TableOrder tableOrder12 = multiplePiePlot4.getDataExtractOrder();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(tableOrder12);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        double double4 = multiplePiePlot1.getLimit();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        float float3 = multiplePiePlot1.getForegroundAlpha();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, (int) (short) 100, plotRenderingInfo7);
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        java.lang.String str16 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = plot6.getDrawingSupplier();
        float float8 = plot6.getBackgroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        plot6.notifyListeners(plotChangeEvent9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        multiplePiePlot1.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent16);
        java.awt.Paint paint18 = multiplePiePlot14.getAggregatedItemsPaint();
        multiplePiePlot11.setOutlinePaint(paint18);
        multiplePiePlot1.setAggregatedItemsPaint(paint18);
        java.lang.String str21 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setNoDataMessage("");
        multiplePiePlot1.zoom((double) 10L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        multiplePiePlot4.setBackgroundImageAlignment((int) (short) 0);
        multiplePiePlot4.setBackgroundAlpha((float) (byte) 0);
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot6.setParent((org.jfree.chart.plot.Plot) multiplePiePlot9);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot9.getInsets();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot9.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart15);
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Image image15 = multiplePiePlot11.getBackgroundImage();
        multiplePiePlot11.setLimit((double) '4');
        boolean boolean18 = multiplePiePlot1.equals((java.lang.Object) '4');
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        boolean boolean8 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setBackgroundAlpha((float) ' ');
        boolean boolean11 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        plot19.markerChanged(markerChangeEvent20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = plot19.getDrawingSupplier();
        java.awt.Stroke stroke23 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot19.setOutlineStroke(stroke23);
        multiplePiePlot1.setOutlineStroke(stroke23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNull(drawingSupplier22);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        multiplePiePlot4.setForegroundAlpha((float) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = null;
        multiplePiePlot17.setBackgroundPaint(paint21);
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font25 = multiplePiePlot17.getNoDataMessageFont();
        java.awt.Stroke stroke26 = multiplePiePlot17.getOutlineStroke();
        multiplePiePlot17.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = multiplePiePlot17.getInsets();
        multiplePiePlot4.setInsets(rectangleInsets29, false);
        java.awt.Paint paint32 = multiplePiePlot4.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot4.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = multiplePiePlot4.getInsets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(jFreeChart33);
        org.junit.Assert.assertNotNull(rectangleInsets34);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (-1), plotRenderingInfo11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot1.setDataset(categoryDataset15);
        boolean boolean17 = multiplePiePlot1.isSubplot();
        double double18 = multiplePiePlot1.getLimit();
        java.lang.Class<?> wildcardClass19 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = plot4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot4);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        java.lang.String str4 = multiplePiePlot3.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        multiplePiePlot3.addChangeListener(plotChangeListener5);
        java.awt.Image image7 = multiplePiePlot3.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot3.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot3.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        int int12 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        java.lang.String str12 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(plot13);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        float float5 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) false);
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        java.lang.String str9 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        java.lang.String str14 = multiplePiePlot1.getPlotType();
        float float15 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent17);
        multiplePiePlot1.setForegroundAlpha((float) 'a');
        java.awt.Image image21 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNull(image21);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Stroke stroke3 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent4);
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent7);
        java.awt.Paint paint9 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot1.setDataset(categoryDataset12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot16.setParent((org.jfree.chart.plot.Plot) multiplePiePlot19);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot19.getInsets();
        multiplePiePlot19.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot19.getRootPlot();
        java.awt.Stroke stroke28 = plot27.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke28);
        java.awt.Image image30 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertNull(tableOrder6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(image30);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setForegroundAlpha((float) 0L);
        java.awt.Paint paint18 = multiplePiePlot14.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot20.getDrawingSupplier();
        multiplePiePlot14.setDrawingSupplier(drawingSupplier24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot14.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo28);
        float float30 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot32.markerChanged(markerChangeEvent35);
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Image image39 = multiplePiePlot32.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier42 = null;
        multiplePiePlot41.setDrawingSupplier(drawingSupplier42);
        org.jfree.chart.plot.Plot plot44 = multiplePiePlot41.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent45 = null;
        multiplePiePlot41.datasetChanged(datasetChangeEvent45);
        multiplePiePlot41.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float49 = multiplePiePlot41.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart50 = multiplePiePlot41.getPieChart();
        multiplePiePlot32.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        multiplePiePlot14.setPieChart(jFreeChart50);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        float float54 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent55 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent55);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNull(image39);
        org.junit.Assert.assertNull(plot44);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.5f + "'", float49 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart50);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot11.getRootPlot();
        plot16.setBackgroundImageAlpha((float) 1);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier21);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = plot23.getInsets();
        plot16.setInsets(rectangleInsets24);
        multiplePiePlot1.setInsets(rectangleInsets24, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (short) 10, plotRenderingInfo30);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        multiplePiePlot4.setBackgroundImageAlpha((float) (short) 1);
        java.awt.Stroke stroke14 = multiplePiePlot4.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1L);
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.general.DatasetGroup datasetGroup9 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot13.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertNotNull(jFreeChart19);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        java.awt.Paint paint9 = multiplePiePlot7.getBackgroundPaint();
        float float10 = multiplePiePlot7.getForegroundAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        multiplePiePlot7.setLimit((double) '4');
        multiplePiePlot7.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = null;
        multiplePiePlot17.setBackgroundPaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot17.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup24 = multiplePiePlot17.getDatasetGroup();
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) 10L);
        boolean boolean27 = multiplePiePlot7.equals((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.zoom((double) (short) 1);
        multiplePiePlot1.setForegroundAlpha((float) 15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot1.handleClick((int) (short) 100, 15, plotRenderingInfo13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setForegroundAlpha((float) 0L);
        java.awt.Paint paint20 = multiplePiePlot16.getNoDataMessagePaint();
        java.awt.Paint paint21 = multiplePiePlot16.getBackgroundPaint();
        multiplePiePlot16.setBackgroundAlpha(10.0f);
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        java.awt.Paint paint26 = multiplePiePlot16.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint26);
        java.awt.Font font28 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        float float7 = multiplePiePlot1.getForegroundAlpha();
        float float8 = multiplePiePlot1.getForegroundAlpha();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        java.awt.Image image9 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot7.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot7.getInsets();
        boolean boolean12 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot7);
        boolean boolean13 = multiplePiePlot7.isOutlineVisible();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        java.lang.Comparable comparable13 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) -1);
        double double16 = multiplePiePlot1.getLimit();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D17, rectangle2D18);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint13);
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        boolean boolean16 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint17 = multiplePiePlot1.getAggregatedItemsPaint();
        float float18 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot11.getRootPlot();
        plot16.setBackgroundImageAlpha((float) 1);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier21);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = plot23.getInsets();
        plot16.setInsets(rectangleInsets24);
        multiplePiePlot1.setInsets(rectangleInsets24, true);
        int int28 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        java.lang.Object obj10 = multiplePiePlot1.clone();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent7);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        float float15 = multiplePiePlot12.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = null;
        multiplePiePlot17.setBackgroundPaint(paint21);
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font25 = multiplePiePlot17.getNoDataMessageFont();
        multiplePiePlot12.setNoDataMessageFont(font25);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot12.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        boolean boolean30 = multiplePiePlot29.isSubplot();
        java.awt.Paint paint31 = multiplePiePlot29.getBackgroundPaint();
        java.awt.Paint paint32 = multiplePiePlot29.getNoDataMessagePaint();
        java.awt.Paint paint33 = multiplePiePlot29.getNoDataMessagePaint();
        multiplePiePlot12.setOutlinePaint(paint33);
        multiplePiePlot1.setOutlinePaint(paint33);
        java.awt.Stroke stroke36 = multiplePiePlot1.getOutlineStroke();
        java.awt.Paint paint37 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        java.awt.Paint paint9 = multiplePiePlot7.getBackgroundPaint();
        multiplePiePlot1.setBackgroundPaint(paint9);
        java.awt.Image image11 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        plot19.markerChanged(markerChangeEvent20);
        float float22 = plot19.getBackgroundImageAlpha();
        java.awt.Paint paint23 = plot19.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint23);
        float float25 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        multiplePiePlot1.setDataset(categoryDataset26);
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertNotNull(plot28);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier17);
        boolean boolean20 = multiplePiePlot16.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot16.getRootPlot();
        plot21.setBackgroundImageAlpha((float) 1);
        java.awt.Stroke stroke24 = plot21.getOutlineStroke();
        multiplePiePlot1.setParent(plot21);
        java.awt.Image image26 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.zoom((double) (byte) 10);
        multiplePiePlot1.zoom((double) 10L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(image26);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) 10);
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        boolean boolean14 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(tableOrder11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setForegroundAlpha((float) (byte) -1);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot6.setParent((org.jfree.chart.plot.Plot) multiplePiePlot9);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot9.getInsets();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot9.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart15);
        boolean boolean17 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier7);
        float float9 = multiplePiePlot6.getBackgroundImageAlpha();
        java.awt.Paint paint10 = multiplePiePlot6.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint10);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Image image16 = null;
        multiplePiePlot1.setBackgroundImage(image16);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setForegroundAlpha((float) (-1));
        java.awt.Stroke stroke21 = multiplePiePlot1.getOutlineStroke();
        int int22 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(tableOrder18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = null;
        multiplePiePlot7.setBackgroundPaint(paint11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot7.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot7.getDatasetGroup();
        java.awt.Paint paint15 = multiplePiePlot7.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot7.getDataset();
        boolean boolean17 = multiplePiePlot1.equals((java.lang.Object) categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot1.getPieChart();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener20);
        java.awt.Paint paint22 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D23, rectangle2D24);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.lang.String str14 = multiplePiePlot1.getPlotType();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.lang.String str18 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent19);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        java.awt.Image image12 = null;
        multiplePiePlot9.setBackgroundImage(image12);
        java.awt.Paint paint14 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot1.getDatasetGroup();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D17, rectangle2D18);
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(datasetGroup16);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setLimit((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = multiplePiePlot10.getAggregatedItemsPaint();
        java.lang.Comparable comparable15 = multiplePiePlot10.getAggregatedItemsKey();
        multiplePiePlot10.setBackgroundImageAlpha((float) 0);
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        double double19 = multiplePiePlot10.getLimit();
        java.awt.Paint paint20 = multiplePiePlot10.getAggregatedItemsPaint();
        java.awt.Font font21 = multiplePiePlot10.getNoDataMessageFont();
        float float22 = multiplePiePlot10.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        boolean boolean29 = multiplePiePlot28.isSubplot();
        multiplePiePlot28.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot25.setParent((org.jfree.chart.plot.Plot) multiplePiePlot28);
        java.awt.Stroke stroke33 = multiplePiePlot28.getOutlineStroke();
        multiplePiePlot28.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        multiplePiePlot28.setDataset(categoryDataset36);
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        multiplePiePlot28.drawBackgroundImage(graphics2D38, rectangle2D39);
        java.lang.String str41 = multiplePiePlot28.getPlotType();
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot28);
        float float43 = multiplePiePlot28.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot44 = multiplePiePlot28.getRootPlot();
        java.lang.Comparable comparable45 = multiplePiePlot28.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Multiple Pie Plot" + "'", str41, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.0f + "'", float43 == 1.0f);
        org.junit.Assert.assertNotNull(plot44);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + (short) 0 + "'", comparable45, (short) 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
        double double6 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 10);
        double double7 = multiplePiePlot1.getLimit();
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(tableOrder8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        java.awt.Stroke stroke9 = plot6.getOutlineStroke();
        java.awt.Stroke stroke10 = plot6.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot6.setInsets(rectangleInsets11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        double double4 = multiplePiePlot1.getLimit();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = null;
        multiplePiePlot7.setBackgroundPaint(paint11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot7.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot7.getDatasetGroup();
        java.awt.Paint paint15 = multiplePiePlot7.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot7.getDataset();
        boolean boolean17 = multiplePiePlot1.equals((java.lang.Object) categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        boolean boolean19 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D20, rectangle2D21);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(tableOrder7);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot4.getInsets();
        boolean boolean17 = multiplePiePlot4.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot4.getDataExtractOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = multiplePiePlot4.getNoDataMessagePaint();
        java.awt.Image image22 = multiplePiePlot4.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tableOrder18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(image22);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent12);
        java.awt.Stroke stroke14 = multiplePiePlot11.getOutlineStroke();
        java.awt.Font font15 = multiplePiePlot11.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font15);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent17);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        multiplePiePlot22.setOutlineVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot22.handleClick(1, (int) (byte) -1, plotRenderingInfo28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = null;
        multiplePiePlot31.setDrawingSupplier(drawingSupplier32);
        boolean boolean35 = multiplePiePlot31.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint36 = multiplePiePlot31.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection37 = multiplePiePlot31.getLegendItems();
        boolean boolean38 = multiplePiePlot31.isOutlineVisible();
        multiplePiePlot31.setAggregatedItemsKey((java.lang.Comparable) 1.0f);
        java.awt.Paint paint41 = multiplePiePlot31.getBackgroundPaint();
        multiplePiePlot22.setAggregatedItemsPaint(paint41);
        multiplePiePlot1.setAggregatedItemsPaint(paint41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(legendItemCollection37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        int int9 = plot6.getBackgroundImageAlignment();
        java.lang.Class<?> wildcardClass10 = plot6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick(1, 0, plotRenderingInfo10);
        java.lang.String str12 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot1.getParent();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent22);
        java.awt.Paint paint24 = multiplePiePlot20.getAggregatedItemsPaint();
        multiplePiePlot17.setOutlinePaint(paint24);
        java.lang.String str26 = multiplePiePlot17.getPlotType();
        java.lang.String str27 = multiplePiePlot17.getNoDataMessage();
        multiplePiePlot17.setForegroundAlpha(0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot17.getInsets();
        org.jfree.chart.util.TableOrder tableOrder31 = multiplePiePlot17.getDataExtractOrder();
        java.awt.Image image32 = multiplePiePlot17.getBackgroundImage();
        boolean boolean33 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot17);
        double double34 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Multiple Pie Plot" + "'", str26, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNull(tableOrder31);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setLimit((double) (-1L));
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Paint paint22 = multiplePiePlot18.getAggregatedItemsPaint();
        java.lang.Comparable comparable23 = multiplePiePlot18.getAggregatedItemsKey();
        multiplePiePlot18.setBackgroundImageAlpha((float) 0);
        java.awt.Font font26 = multiplePiePlot18.getNoDataMessageFont();
        double double27 = multiplePiePlot18.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        multiplePiePlot29.markerChanged(markerChangeEvent31);
        java.awt.Paint paint33 = null;
        multiplePiePlot29.setBackgroundPaint(paint33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = multiplePiePlot29.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup36 = multiplePiePlot29.getDatasetGroup();
        java.awt.Paint paint37 = multiplePiePlot29.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = multiplePiePlot29.getInsets();
        multiplePiePlot18.setInsets(rectangleInsets38, false);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        boolean boolean43 = multiplePiePlot42.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        boolean boolean46 = multiplePiePlot45.isSubplot();
        multiplePiePlot45.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot42.setParent((org.jfree.chart.plot.Plot) multiplePiePlot45);
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = multiplePiePlot45.getInsets();
        org.jfree.chart.JFreeChart jFreeChart51 = multiplePiePlot45.getPieChart();
        multiplePiePlot18.setPieChart(jFreeChart51);
        multiplePiePlot1.setPieChart(jFreeChart51);
        java.awt.Paint paint54 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean55 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint56 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + "Other" + "'", comparable23, "Other");
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(categoryDataset35);
        org.junit.Assert.assertNull(datasetGroup36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(rectangleInsets50);
        org.junit.Assert.assertNotNull(jFreeChart51);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(paint56);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        boolean boolean8 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint9 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot4.getInsets();
        boolean boolean17 = multiplePiePlot4.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot4.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot4.getParent();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot4.getParent();
        org.jfree.chart.util.TableOrder tableOrder21 = multiplePiePlot4.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tableOrder18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNull(plot20);
        org.junit.Assert.assertNull(tableOrder21);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        multiplePiePlot1.setBackgroundImageAlignment(100);
        float float17 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setBackgroundAlpha((float) (-1));
        multiplePiePlot1.setBackgroundAlpha((float) '#');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot3.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Paint paint11 = multiplePiePlot6.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot7.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Stroke stroke15 = multiplePiePlot10.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke15);
        java.awt.Image image17 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(jFreeChart18);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        float float3 = multiplePiePlot1.getForegroundAlpha();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, (int) (short) 100, plotRenderingInfo7);
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        java.awt.Paint paint16 = multiplePiePlot4.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Paint paint22 = multiplePiePlot18.getAggregatedItemsPaint();
        java.lang.Comparable comparable23 = multiplePiePlot18.getAggregatedItemsKey();
        multiplePiePlot18.setBackgroundImageAlpha((float) 0);
        java.awt.Font font26 = multiplePiePlot18.getNoDataMessageFont();
        double double27 = multiplePiePlot18.getLimit();
        java.awt.Paint paint28 = multiplePiePlot18.getAggregatedItemsPaint();
        java.awt.Font font29 = multiplePiePlot18.getNoDataMessageFont();
        float float30 = multiplePiePlot18.getBackgroundImageAlpha();
        java.awt.Font font31 = multiplePiePlot18.getNoDataMessageFont();
        multiplePiePlot4.setNoDataMessageFont(font31);
        java.awt.Paint paint33 = multiplePiePlot4.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + "Other" + "'", comparable23, "Other");
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 10);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setLimit((double) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = null;
        plot6.setBackgroundImage(image7);
        java.awt.Paint paint9 = plot6.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        plot6.notifyListeners(plotChangeEvent10);
        java.awt.Image image12 = null;
        plot6.setBackgroundImage(image12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        boolean boolean6 = multiplePiePlot5.isSubplot();
        java.awt.Paint paint7 = multiplePiePlot5.getBackgroundPaint();
        float float8 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = null;
        multiplePiePlot10.setBackgroundPaint(paint14);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot5.setNoDataMessageFont(font18);
        multiplePiePlot1.setNoDataMessageFont(font18);
        boolean boolean21 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder23 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setOutlineVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        multiplePiePlot25.handleClick(1, (int) (byte) -1, plotRenderingInfo31);
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot25.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(tableOrder22);
        org.junit.Assert.assertNull(tableOrder23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jFreeChart33);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        double double7 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        java.awt.Image image11 = multiplePiePlot9.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot9.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot9.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets13, true);
        multiplePiePlot1.setBackgroundAlpha((float) '4');
        java.awt.Font font18 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(legendItemCollection19);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = null;
        multiplePiePlot7.setBackgroundPaint(paint11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot7.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot7.getDatasetGroup();
        java.awt.Paint paint15 = multiplePiePlot7.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot7.getDataset();
        boolean boolean17 = multiplePiePlot1.equals((java.lang.Object) categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot1.getPieChart();
        java.lang.Object obj20 = null;
        boolean boolean21 = multiplePiePlot1.equals(obj20);
        double double22 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        boolean boolean14 = multiplePiePlot10.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        plot15.setBackgroundImageAlpha((float) 1);
        int int18 = plot15.getBackgroundImageAlignment();
        java.awt.Font font19 = plot15.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font19);
        java.awt.Paint paint21 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.lang.String str24 = multiplePiePlot23.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.lang.String str27 = multiplePiePlot26.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot26.markerChanged(markerChangeEvent28);
        java.awt.Paint paint30 = multiplePiePlot26.getAggregatedItemsPaint();
        multiplePiePlot23.setOutlinePaint(paint30);
        java.awt.Image image32 = multiplePiePlot23.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot23.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets33);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 10);
        double double7 = multiplePiePlot1.getLimit();
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        float float13 = multiplePiePlot10.getBackgroundImageAlpha();
        java.awt.Paint paint14 = multiplePiePlot10.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Paint paint20 = null;
        multiplePiePlot16.setBackgroundPaint(paint20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot16.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot16.getDatasetGroup();
        java.awt.Paint paint24 = multiplePiePlot16.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot16.getDataset();
        boolean boolean26 = multiplePiePlot10.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot10.getDataset();
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        java.lang.Object obj30 = multiplePiePlot1.clone();
        java.awt.Paint paint31 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(categoryDataset27);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent7);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        float float15 = multiplePiePlot12.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = null;
        multiplePiePlot17.setBackgroundPaint(paint21);
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font25 = multiplePiePlot17.getNoDataMessageFont();
        multiplePiePlot12.setNoDataMessageFont(font25);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot12.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        boolean boolean30 = multiplePiePlot29.isSubplot();
        java.awt.Paint paint31 = multiplePiePlot29.getBackgroundPaint();
        java.awt.Paint paint32 = multiplePiePlot29.getNoDataMessagePaint();
        java.awt.Paint paint33 = multiplePiePlot29.getNoDataMessagePaint();
        multiplePiePlot12.setOutlinePaint(paint33);
        multiplePiePlot1.setOutlinePaint(paint33);
        java.awt.Paint paint36 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setBackgroundAlpha((float) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier16);
        boolean boolean19 = multiplePiePlot15.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot15.getRootPlot();
        plot20.setBackgroundImageAlpha((float) 1);
        java.awt.Stroke stroke23 = plot20.getOutlineStroke();
        java.awt.Stroke stroke24 = plot20.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke24);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot29.setDrawingSupplier(drawingSupplier30);
        java.awt.Paint paint32 = multiplePiePlot29.getAggregatedItemsPaint();
        float float33 = multiplePiePlot29.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent34 = null;
        multiplePiePlot29.axisChanged(axisChangeEvent34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = multiplePiePlot29.getDrawingSupplier();
        multiplePiePlot29.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        java.lang.String str41 = multiplePiePlot40.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        multiplePiePlot40.markerChanged(markerChangeEvent42);
        java.awt.Image image44 = multiplePiePlot40.getBackgroundImage();
        java.lang.Comparable comparable45 = multiplePiePlot40.getAggregatedItemsKey();
        multiplePiePlot40.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        boolean boolean50 = multiplePiePlot49.isSubplot();
        multiplePiePlot49.setForegroundAlpha((float) 0L);
        java.awt.Paint paint53 = multiplePiePlot49.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot55 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset54);
        java.lang.String str56 = multiplePiePlot55.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener57 = null;
        multiplePiePlot55.addChangeListener(plotChangeListener57);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier59 = multiplePiePlot55.getDrawingSupplier();
        multiplePiePlot49.setDrawingSupplier(drawingSupplier59);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo63 = null;
        multiplePiePlot49.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo63);
        org.jfree.chart.JFreeChart jFreeChart65 = multiplePiePlot49.getPieChart();
        multiplePiePlot40.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart65);
        multiplePiePlot29.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart65);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart65);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.5f + "'", float33 == 0.5f);
        org.junit.Assert.assertNull(drawingSupplier36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + "Other" + "'", comparable45, "Other");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(drawingSupplier59);
        org.junit.Assert.assertNotNull(jFreeChart65);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        boolean boolean6 = multiplePiePlot5.isSubplot();
        java.awt.Paint paint7 = multiplePiePlot5.getBackgroundPaint();
        float float8 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = null;
        multiplePiePlot10.setBackgroundPaint(paint14);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot5.setNoDataMessageFont(font18);
        multiplePiePlot1.setNoDataMessageFont(font18);
        boolean boolean21 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot1.getDatasetGroup();
        int int24 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(tableOrder22);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot4.getInsets();
        java.lang.Comparable comparable17 = multiplePiePlot4.getAggregatedItemsKey();
        float float18 = multiplePiePlot4.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 0 + "'", comparable17, (short) 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        boolean boolean8 = multiplePiePlot1.isSubplot();
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot1.getInsets();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        float float12 = multiplePiePlot9.getBackgroundImageAlpha();
        java.awt.Paint paint13 = multiplePiePlot9.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot9.setDataset(categoryDataset14);
        boolean boolean16 = multiplePiePlot9.isSubplot();
        multiplePiePlot9.setBackgroundAlpha((float) ' ');
        boolean boolean19 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot9);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot9.getPieChart();
        int int21 = multiplePiePlot9.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jFreeChart20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Image image5 = null;
        multiplePiePlot1.setBackgroundImage(image5);
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup7 = multiplePiePlot1.getDatasetGroup();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Point2D point2D10 = null;
        org.jfree.chart.plot.PlotState plotState11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D8, rectangle2D9, point2D10, plotState11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNull(datasetGroup7);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        plot6.handleClick((int) (short) 100, (int) (byte) -1, plotRenderingInfo9);
        org.jfree.data.general.DatasetGroup datasetGroup11 = plot6.getDatasetGroup();
        plot6.setBackgroundAlpha((float) 1);
        java.awt.Paint paint14 = plot6.getNoDataMessagePaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setLimit((double) (short) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(tableOrder10);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        int int7 = multiplePiePlot1.getBackgroundImageAlignment();
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit(10.0d);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart14);
        java.lang.String str16 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setBackgroundImageAlignment(100);
        float float19 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset20);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 0);
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        java.awt.geom.Point2D point2D5 = null;
        org.jfree.chart.plot.PlotState plotState6 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D3, rectangle2D4, point2D5, plotState6, plotRenderingInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.zoom((double) 10.0f);
        java.awt.Paint paint9 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        boolean boolean12 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot1.setDataset(categoryDataset13);
        multiplePiePlot1.zoom((double) (byte) 0);
        java.lang.Object obj17 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        float float13 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 1);
        boolean boolean16 = multiplePiePlot1.isSubplot();
        double double17 = multiplePiePlot1.getLimit();
        boolean boolean18 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(categoryDataset19);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint7 = multiplePiePlot1.getNoDataMessagePaint();
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setLimit((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = multiplePiePlot10.getAggregatedItemsPaint();
        java.lang.Comparable comparable15 = multiplePiePlot10.getAggregatedItemsKey();
        multiplePiePlot10.setBackgroundImageAlpha((float) 0);
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        double double19 = multiplePiePlot10.getLimit();
        java.awt.Paint paint20 = multiplePiePlot10.getAggregatedItemsPaint();
        java.awt.Font font21 = multiplePiePlot10.getNoDataMessageFont();
        float float22 = multiplePiePlot10.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.lang.String str24 = multiplePiePlot10.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        float float9 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = null;
        multiplePiePlot7.setBackgroundPaint(paint11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot7.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot7.getDatasetGroup();
        java.awt.Paint paint15 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint15);
        java.awt.Stroke stroke17 = multiplePiePlot1.getOutlineStroke();
        java.awt.Paint paint18 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        java.awt.Paint paint9 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint10 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot1.getDrawingSupplier();
        java.lang.Comparable comparable14 = multiplePiePlot1.getAggregatedItemsKey();
        float float15 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Image image16 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setBackgroundImageAlignment((int) 'a');
        java.lang.Class<?> wildcardClass15 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        multiplePiePlot1.zoom((double) '#');
        java.lang.String str19 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.util.TableOrder tableOrder20 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint21 = multiplePiePlot1.getBackgroundPaint();
        java.lang.String str22 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(tableOrder20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint7 = plot6.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        plot6.notifyListeners(plotChangeEvent8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setOutlinePaint(paint15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setOutlineVisible(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(categoryDataset17);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        java.lang.String str4 = multiplePiePlot3.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        multiplePiePlot3.addChangeListener(plotChangeListener5);
        java.awt.Image image7 = multiplePiePlot3.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot3.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot3.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets9);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.setForegroundAlpha((float) 0L);
        java.awt.Paint paint12 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot14.getDrawingSupplier();
        multiplePiePlot8.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier18);
        java.awt.Font font21 = multiplePiePlot1.getNoDataMessageFont();
        float float22 = multiplePiePlot1.getBackgroundImageAlpha();
        java.lang.String str23 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent24);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setLimit((double) (byte) 0);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, (int) (short) 1, plotRenderingInfo7);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getAggregatedItemsPaint();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNull(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        float float15 = multiplePiePlot11.getForegroundAlpha();
        java.awt.Paint paint16 = multiplePiePlot11.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint16);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNull(tableOrder8);
        org.junit.Assert.assertNull(tableOrder9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        float float12 = multiplePiePlot9.getBackgroundImageAlpha();
        java.awt.Paint paint13 = multiplePiePlot9.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot9.setDataset(categoryDataset14);
        boolean boolean16 = multiplePiePlot9.isSubplot();
        multiplePiePlot9.setBackgroundAlpha((float) ' ');
        boolean boolean19 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot9);
        java.awt.Paint paint20 = multiplePiePlot9.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((-1), 15, plotRenderingInfo15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit(10.0d);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart14);
        int int16 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        java.awt.Paint paint10 = multiplePiePlot4.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setBackgroundAlpha((float) (-1));
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        double double8 = multiplePiePlot1.getLimit();
        multiplePiePlot1.zoom((double) (short) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot1.handleClick(15, (int) (byte) 0, plotRenderingInfo13);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (-1), plotRenderingInfo11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryDataset15);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        boolean boolean6 = multiplePiePlot5.isSubplot();
        java.awt.Paint paint7 = multiplePiePlot5.getBackgroundPaint();
        float float8 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = null;
        multiplePiePlot10.setBackgroundPaint(paint14);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot5.setNoDataMessageFont(font18);
        multiplePiePlot1.setNoDataMessageFont(font18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent21);
        java.lang.String str23 = multiplePiePlot1.getPlotType();
        boolean boolean24 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str25 = multiplePiePlot1.getPlotType();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        multiplePiePlot29.addChangeListener(plotChangeListener31);
        java.awt.Image image33 = multiplePiePlot29.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart34 = multiplePiePlot29.getPieChart();
        multiplePiePlot29.setBackgroundImageAlpha(1.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = multiplePiePlot29.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier37);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent39);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Multiple Pie Plot" + "'", str23, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Multiple Pie Plot" + "'", str25, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(image33);
        org.junit.Assert.assertNotNull(jFreeChart34);
        org.junit.Assert.assertNotNull(drawingSupplier37);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        float float3 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot5.markerChanged(markerChangeEvent7);
        java.awt.Paint paint9 = multiplePiePlot5.getAggregatedItemsPaint();
        java.lang.Comparable comparable10 = multiplePiePlot5.getAggregatedItemsKey();
        multiplePiePlot5.setBackgroundImageAlpha((float) 0);
        java.awt.Image image13 = null;
        multiplePiePlot5.setBackgroundImage(image13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Image image20 = multiplePiePlot16.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection21 = multiplePiePlot16.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = multiplePiePlot16.getDrawingSupplier();
        multiplePiePlot5.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        java.awt.geom.Point2D point2D29 = null;
        org.jfree.chart.plot.PlotState plotState30 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D27, rectangle2D28, point2D29, plotState30, plotRenderingInfo31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertNotNull(drawingSupplier22);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier7);
        float float9 = multiplePiePlot6.getBackgroundImageAlpha();
        java.awt.Paint paint10 = multiplePiePlot6.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint10);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Image image16 = null;
        multiplePiePlot1.setBackgroundImage(image16);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent20 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(tableOrder18);
        org.junit.Assert.assertNotNull(drawingSupplier19);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
        double double21 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot23.setDrawingSupplier(drawingSupplier24);
        float float26 = multiplePiePlot23.getBackgroundImageAlpha();
        java.awt.Paint paint27 = multiplePiePlot23.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        multiplePiePlot23.setDataset(categoryDataset28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot23.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        multiplePiePlot23.handleClick((int) (short) 1, 1, plotRenderingInfo33);
        multiplePiePlot23.setBackgroundImageAlignment(15);
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot23.setNoDataMessagePaint(paint37);
        multiplePiePlot1.setBackgroundPaint(paint37);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) 10);
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundAlpha((float) ' ');
        float float15 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        boolean boolean24 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(tableOrder11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot6.setBackgroundPaint(paint10);
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font14 = multiplePiePlot6.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font14);
        float float16 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot21.getInsets();
        java.awt.Font font27 = multiplePiePlot21.getNoDataMessageFont();
        java.awt.Font font28 = multiplePiePlot21.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot6.setBackgroundPaint(paint10);
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font14 = multiplePiePlot6.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Paint paint21 = multiplePiePlot18.getNoDataMessagePaint();
        java.awt.Paint paint22 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        java.awt.Paint paint25 = null;
        multiplePiePlot1.setBackgroundPaint(paint25);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent27 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot1.getRootPlot();
        double double31 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent32);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        java.awt.geom.Point2D point2D36 = null;
        org.jfree.chart.plot.PlotState plotState37 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D34, rectangle2D35, point2D36, plotState37, plotRenderingInfo38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        java.lang.Comparable comparable16 = multiplePiePlot11.getAggregatedItemsKey();
        multiplePiePlot11.setBackgroundImageAlpha((float) 0);
        java.awt.Font font19 = multiplePiePlot11.getNoDataMessageFont();
        double double20 = multiplePiePlot11.getLimit();
        java.awt.Paint paint21 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = multiplePiePlot11.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier22);
        org.jfree.chart.LegendItemCollection legendItemCollection24 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Other" + "'", comparable16, "Other");
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(drawingSupplier22);
        org.junit.Assert.assertNotNull(legendItemCollection24);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, (int) (short) 1, plotRenderingInfo7);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        multiplePiePlot1.setOutlineVisible(false);
        double double13 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot14.drawBackgroundImage(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = null;
        multiplePiePlot7.setBackgroundPaint(paint11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot7.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot7.getDatasetGroup();
        java.awt.Paint paint15 = multiplePiePlot7.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot7.getDataset();
        boolean boolean17 = multiplePiePlot1.equals((java.lang.Object) categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        boolean boolean19 = multiplePiePlot1.isOutlineVisible();
        java.awt.Image image20 = null;
        multiplePiePlot1.setBackgroundImage(image20);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
        java.awt.Stroke stroke18 = multiplePiePlot13.getOutlineStroke();
        multiplePiePlot13.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot13.setDataset(categoryDataset21);
        double double23 = multiplePiePlot13.getLimit();
        java.awt.Font font24 = multiplePiePlot13.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot13.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        multiplePiePlot27.notifyListeners(plotChangeEvent28);
        multiplePiePlot27.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Paint paint32 = multiplePiePlot27.getAggregatedItemsPaint();
        multiplePiePlot13.setAggregatedItemsPaint(paint32);
        java.lang.Comparable comparable34 = multiplePiePlot13.getAggregatedItemsKey();
        boolean boolean35 = multiplePiePlot13.isOutlineVisible();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (short) 0 + "'", comparable34, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Paint paint16 = multiplePiePlot12.getAggregatedItemsPaint();
        java.lang.Comparable comparable17 = multiplePiePlot12.getAggregatedItemsKey();
        multiplePiePlot12.setBackgroundImageAlpha((float) 0);
        java.awt.Font font20 = multiplePiePlot12.getNoDataMessageFont();
        double double21 = multiplePiePlot12.getLimit();
        java.awt.Paint paint22 = multiplePiePlot12.getAggregatedItemsPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot12.getDrawingSupplier();
        boolean boolean24 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        multiplePiePlot1.handleClick((int) ' ', (int) (short) 100, plotRenderingInfo27);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent29 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent29);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot1.getInsets();
        org.jfree.data.general.DatasetGroup datasetGroup11 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image12 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.zoom(1.0d);
        java.lang.Object obj8 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(categoryDataset9);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 10);
        double double7 = multiplePiePlot1.getLimit();
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        float float13 = multiplePiePlot10.getBackgroundImageAlpha();
        java.awt.Paint paint14 = multiplePiePlot10.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Paint paint20 = null;
        multiplePiePlot16.setBackgroundPaint(paint20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot16.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot16.getDatasetGroup();
        java.awt.Paint paint24 = multiplePiePlot16.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot16.getDataset();
        boolean boolean26 = multiplePiePlot10.equals((java.lang.Object) categoryDataset25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot10.getDataset();
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        multiplePiePlot1.setBackgroundImageAlpha((float) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(categoryDataset27);
        org.junit.Assert.assertNotNull(jFreeChart28);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo8);
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.String str11 = multiplePiePlot1.getPlotType();
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Multiple Pie Plot" + "'", str11, "Multiple Pie Plot");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot8.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot15.getDrawingSupplier();
        java.awt.Paint paint20 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot8.setBackgroundPaint(paint20);
        multiplePiePlot1.setBackgroundPaint(paint20);
        java.awt.Image image23 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.zoom((double) 15.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(image23);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        multiplePiePlot7.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener14);
        java.awt.Image image16 = multiplePiePlot12.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot12.axisChanged(axisChangeEvent17);
        double double19 = multiplePiePlot12.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier22);
        java.awt.Paint paint24 = multiplePiePlot21.getOutlinePaint();
        multiplePiePlot12.setNoDataMessagePaint(paint24);
        multiplePiePlot7.setOutlinePaint(paint24);
        multiplePiePlot1.setAggregatedItemsPaint(paint24);
        java.lang.Class<?> wildcardClass28 = paint24.getClass();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        multiplePiePlot4.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Font font12 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent16);
        java.awt.Paint paint18 = multiplePiePlot14.getAggregatedItemsPaint();
        java.lang.Comparable comparable19 = multiplePiePlot14.getAggregatedItemsKey();
        multiplePiePlot14.setBackgroundImageAlpha((float) 0);
        java.awt.Font font22 = multiplePiePlot14.getNoDataMessageFont();
        double double23 = multiplePiePlot14.getLimit();
        java.awt.Paint paint24 = multiplePiePlot14.getAggregatedItemsPaint();
        java.awt.Font font25 = multiplePiePlot14.getNoDataMessageFont();
        multiplePiePlot14.setLimit((double) (-1L));
        java.awt.Paint paint28 = null;
        multiplePiePlot14.setOutlinePaint(paint28);
        java.lang.String str30 = multiplePiePlot14.getNoDataMessage();
        java.awt.Stroke stroke31 = multiplePiePlot14.getOutlineStroke();
        multiplePiePlot4.setOutlineStroke(stroke31);
        org.jfree.chart.plot.Plot plot33 = multiplePiePlot4.getParent();
        java.awt.Image image34 = multiplePiePlot4.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Other" + "'", comparable19, "Other");
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(plot33);
        org.junit.Assert.assertNull(image34);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setBackgroundAlpha((float) 'a');
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        java.lang.Comparable comparable15 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.zoom((double) '4');
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setLimit((double) (short) 1);
        java.awt.Paint paint9 = multiplePiePlot1.getNoDataMessagePaint();
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = null;
        plot6.setBackgroundImage(image7);
        java.awt.Paint paint9 = plot6.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        plot6.notifyListeners(plotChangeEvent10);
        int int12 = plot6.getBackgroundImageAlignment();
        boolean boolean13 = plot6.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(drawingSupplier9);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        double double12 = multiplePiePlot1.getLimit();
        java.lang.String str13 = multiplePiePlot1.getPlotType();
        java.awt.Font font14 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D15, rectangle2D16);
        multiplePiePlot1.setForegroundAlpha((float) (-1));
        java.awt.Paint paint20 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D21, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        multiplePiePlot1.zoom((double) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot1.getDatasetGroup();
        java.awt.Stroke stroke20 = multiplePiePlot1.getOutlineStroke();
        java.awt.Paint paint21 = multiplePiePlot1.getOutlinePaint();
        java.awt.Font font22 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(plot23);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        float float5 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setLimit(0.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick(97, 0, plotRenderingInfo10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) 10);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot8 = plot7.getRootPlot();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot8.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        float float13 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Font font14 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent15);
        multiplePiePlot1.zoom((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.lang.String str24 = multiplePiePlot23.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        multiplePiePlot23.markerChanged(markerChangeEvent25);
        java.awt.Paint paint27 = multiplePiePlot23.getAggregatedItemsPaint();
        multiplePiePlot20.setOutlinePaint(paint27);
        java.lang.String str29 = multiplePiePlot20.getPlotType();
        java.lang.String str30 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = multiplePiePlot20.getInsets();
        org.jfree.chart.plot.Plot plot32 = multiplePiePlot20.getParent();
        multiplePiePlot20.setBackgroundImageAlignment((int) (byte) 1);
        java.awt.Paint paint35 = multiplePiePlot20.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Multiple Pie Plot" + "'", str29, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNull(plot32);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image7 = null;
        multiplePiePlot1.setBackgroundImage(image7);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = multiplePiePlot13.getAggregatedItemsPaint();
        java.lang.Comparable comparable18 = multiplePiePlot13.getAggregatedItemsKey();
        multiplePiePlot13.setBackgroundImageAlpha((float) 0);
        java.awt.Font font21 = multiplePiePlot13.getNoDataMessageFont();
        double double22 = multiplePiePlot13.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Paint paint28 = null;
        multiplePiePlot24.setBackgroundPaint(paint28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot24.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot24.getDatasetGroup();
        java.awt.Paint paint32 = multiplePiePlot24.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot24.getInsets();
        multiplePiePlot13.setInsets(rectangleInsets33, false);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        boolean boolean38 = multiplePiePlot37.isSubplot();
        java.awt.Paint paint39 = multiplePiePlot37.getBackgroundPaint();
        float float40 = multiplePiePlot37.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        java.lang.String str43 = multiplePiePlot42.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        multiplePiePlot42.markerChanged(markerChangeEvent44);
        java.awt.Paint paint46 = null;
        multiplePiePlot42.setBackgroundPaint(paint46);
        multiplePiePlot42.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font50 = multiplePiePlot42.getNoDataMessageFont();
        multiplePiePlot37.setNoDataMessageFont(font50);
        org.jfree.chart.plot.Plot plot52 = multiplePiePlot37.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        boolean boolean55 = multiplePiePlot54.isSubplot();
        java.awt.Paint paint56 = multiplePiePlot54.getBackgroundPaint();
        java.awt.Paint paint57 = multiplePiePlot54.getNoDataMessagePaint();
        java.awt.Paint paint58 = multiplePiePlot54.getNoDataMessagePaint();
        multiplePiePlot37.setOutlinePaint(paint58);
        multiplePiePlot13.setNoDataMessagePaint(paint58);
        multiplePiePlot1.setBackgroundPaint(paint58);
        float float62 = multiplePiePlot1.getForegroundAlpha();
        double double63 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Other" + "'", comparable18, "Other");
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(categoryDataset30);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(font50);
        org.junit.Assert.assertNotNull(plot52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 1.0f + "'", float62 == 1.0f);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        plot6.setBackgroundAlpha((float) (byte) -1);
        float float11 = plot6.getForegroundAlpha();
        float float12 = plot6.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D12, rectangle2D13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = multiplePiePlot7.getAggregatedItemsPaint();
        java.lang.Comparable comparable12 = multiplePiePlot7.getAggregatedItemsKey();
        multiplePiePlot7.setBackgroundImageAlpha((float) 0);
        java.awt.Image image15 = null;
        multiplePiePlot7.setBackgroundImage(image15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Image image22 = multiplePiePlot18.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot18.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot18.getDrawingSupplier();
        multiplePiePlot7.setDrawingSupplier(drawingSupplier24);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier24);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        multiplePiePlot1.setDataset(categoryDataset27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        multiplePiePlot1.setDataset(categoryDataset29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(drawingSupplier24);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        multiplePiePlot1.zoom((double) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image20 = null;
        multiplePiePlot1.setBackgroundImage(image20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(datasetGroup19);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(categoryDataset9);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        multiplePiePlot1.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = plot14.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets15, true);
        multiplePiePlot1.zoom((double) 15);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D20, rectangle2D21);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(plot23);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setLimit((double) (byte) 0);
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        multiplePiePlot1.zoom((double) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        multiplePiePlot1.setBackgroundImageAlignment(100);
        float float17 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setNoDataMessage("");
        multiplePiePlot1.zoom(1.0d);
        java.awt.Image image22 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(image22);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = plot6.isOutlineVisible();
        java.lang.String str8 = plot6.getNoDataMessage();
        org.jfree.chart.plot.Plot plot9 = plot6.getRootPlot();
        plot9.zoom(52.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.lang.String str4 = multiplePiePlot1.getNoDataMessage();
        java.lang.Comparable comparable5 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + "Other" + "'", comparable5, "Other");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot4.getInsets();
        java.awt.Stroke stroke17 = multiplePiePlot4.getOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent18 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent18);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent20);
        boolean boolean22 = multiplePiePlot4.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot4.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(drawingSupplier23);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10L);
        java.awt.Image image11 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier17);
        java.lang.String str19 = multiplePiePlot1.getNoDataMessage();
        java.lang.String str20 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Multiple Pie Plot" + "'", str20, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot21);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick(1, 0, plotRenderingInfo10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent13);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot12);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        double double4 = multiplePiePlot1.getLimit();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setNoDataMessage("Other");
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        boolean boolean15 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        plot4.markerChanged(markerChangeEvent10);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier17);
        java.lang.String str19 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        double double22 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent23);
        multiplePiePlot1.setForegroundAlpha((float) '4');
        multiplePiePlot1.setLimit((double) 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        double double14 = multiplePiePlot4.getLimit();
        java.awt.Font font15 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent20);
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Image image24 = multiplePiePlot17.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot26.setDrawingSupplier(drawingSupplier27);
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot26.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent30 = null;
        multiplePiePlot26.datasetChanged(datasetChangeEvent30);
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float34 = multiplePiePlot26.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot26.getPieChart();
        multiplePiePlot17.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart35);
        multiplePiePlot4.setPieChart(jFreeChart35);
        double double38 = multiplePiePlot4.getLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertNull(plot29);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setBackgroundImageAlignment((int) 'a');
        java.lang.String str15 = multiplePiePlot1.getNoDataMessage();
        boolean boolean16 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot1.setDataset(categoryDataset17);
        java.awt.Paint paint19 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot1.setDataset(categoryDataset20);
        java.awt.Stroke stroke22 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot11.getParent();
        double double15 = multiplePiePlot11.getLimit();
        java.lang.Comparable comparable16 = multiplePiePlot11.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot11.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets17);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(tableOrder9);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Other" + "'", comparable16, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(tableOrder19);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Paint paint9 = multiplePiePlot4.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        boolean boolean6 = multiplePiePlot5.isSubplot();
        java.awt.Paint paint7 = multiplePiePlot5.getBackgroundPaint();
        float float8 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = null;
        multiplePiePlot10.setBackgroundPaint(paint14);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot5.setNoDataMessageFont(font18);
        multiplePiePlot1.setNoDataMessageFont(font18);
        boolean boolean21 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint23 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setOutlineVisible(false);
        java.lang.Class<?> wildcardClass26 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(tableOrder22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.lang.String str14 = multiplePiePlot1.getPlotType();
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertNull(categoryDataset16);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot7.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier15);
        java.lang.String str17 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot4.getInsets();
        boolean boolean17 = multiplePiePlot4.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot4.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot4.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        multiplePiePlot21.notifyListeners(plotChangeEvent22);
        multiplePiePlot21.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Font font26 = multiplePiePlot21.getNoDataMessageFont();
        boolean boolean27 = multiplePiePlot4.equals((java.lang.Object) multiplePiePlot21);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent28 = null;
        multiplePiePlot21.datasetChanged(datasetChangeEvent28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tableOrder18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setBackgroundAlpha((float) (-1));
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        float float8 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        java.lang.String str10 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(tableOrder9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        boolean boolean9 = plot8.isOutlineVisible();
        java.awt.Paint paint10 = plot8.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        multiplePiePlot1.zoom((double) 1.0f);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot1.getInsets();
        double double11 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot15.getDrawingSupplier();
        java.awt.Paint paint20 = multiplePiePlot15.getNoDataMessagePaint();
        java.awt.Image image21 = null;
        multiplePiePlot15.setBackgroundImage(image21);
        java.lang.Object obj23 = null;
        boolean boolean24 = multiplePiePlot15.equals(obj23);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent25);
        double double27 = multiplePiePlot15.getLimit();
        java.awt.Paint paint28 = multiplePiePlot15.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint28);
        org.jfree.chart.util.TableOrder tableOrder30 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(tableOrder30);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setBackgroundAlpha((float) 'a');
        java.awt.Stroke stroke14 = multiplePiePlot1.getOutlineStroke();
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
        double double21 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.Plot plot22 = null;
        multiplePiePlot1.setParent(plot22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(categoryDataset24);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot1.getInsets();
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        float float12 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot3.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Stroke stroke11 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke11);
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setForegroundAlpha((float) 10);
        multiplePiePlot1.setBackgroundImageAlpha((float) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(tableOrder13);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setLimit((double) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        boolean boolean13 = multiplePiePlot9.equals((java.lang.Object) 1.0d);
        boolean boolean14 = multiplePiePlot9.isOutlineVisible();
        multiplePiePlot9.setLimit(10.0d);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier19);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot18.getPieChart();
        multiplePiePlot9.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        multiplePiePlot1.setPieChart(jFreeChart22);
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = plot25.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertNull(plot25);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier17);
        java.lang.String str19 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image20 = null;
        multiplePiePlot1.setBackgroundImage(image20);
        java.awt.Image image22 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(image22);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((-1), 15, plotRenderingInfo15);
        float float17 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image7 = null;
        multiplePiePlot1.setBackgroundImage(image7);
        java.lang.Object obj9 = null;
        boolean boolean10 = multiplePiePlot1.equals(obj9);
        java.awt.Image image11 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Object obj8 = multiplePiePlot1.clone();
        java.awt.Paint paint9 = null;
        multiplePiePlot1.setOutlinePaint(paint9);
        org.jfree.data.general.DatasetGroup datasetGroup11 = multiplePiePlot1.getDatasetGroup();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Point2D point2D14 = null;
        org.jfree.chart.plot.PlotState plotState15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D12, rectangle2D13, point2D14, plotState15, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(datasetGroup11);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        float float12 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float9 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent10);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        multiplePiePlot15.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener22);
        java.awt.Image image24 = multiplePiePlot20.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent25 = null;
        multiplePiePlot20.axisChanged(axisChangeEvent25);
        double double27 = multiplePiePlot20.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot29.setDrawingSupplier(drawingSupplier30);
        java.awt.Paint paint32 = multiplePiePlot29.getOutlinePaint();
        multiplePiePlot20.setNoDataMessagePaint(paint32);
        multiplePiePlot15.setOutlinePaint(paint32);
        multiplePiePlot15.setForegroundAlpha((float) (short) 10);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        multiplePiePlot1.setOutlineVisible(true);
        double double40 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent12);
        double double14 = multiplePiePlot1.getLimit();
        float float15 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot17.setDataset(categoryDataset22);
        float float24 = multiplePiePlot17.getForegroundAlpha();
        boolean boolean25 = multiplePiePlot17.isOutlineVisible();
        boolean boolean26 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.TableOrder tableOrder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset9);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot1.setDataset(categoryDataset11);
        java.lang.Object obj13 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        java.lang.Class<?> wildcardClass6 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot9.markerChanged(markerChangeEvent11);
        float float13 = multiplePiePlot9.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getParent();
        boolean boolean15 = multiplePiePlot1.equals((java.lang.Object) plot14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent16);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Paint paint21 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot18.setLimit((double) (byte) 1);
        java.lang.Object obj24 = null;
        boolean boolean25 = multiplePiePlot18.equals(obj24);
        multiplePiePlot18.setBackgroundImageAlpha((float) 1L);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot18.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart28);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jFreeChart28);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        multiplePiePlot1.zoom((double) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot1.getDatasetGroup();
        java.awt.Stroke stroke20 = multiplePiePlot1.getOutlineStroke();
        java.awt.Paint paint21 = multiplePiePlot1.getOutlinePaint();
        java.awt.Font font22 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Paint paint28 = null;
        multiplePiePlot24.setBackgroundPaint(paint28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot24.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot24.getDatasetGroup();
        java.awt.Paint paint32 = multiplePiePlot24.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot24.getInsets();
        java.awt.Font font34 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(categoryDataset30);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(font34);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        java.awt.Image image12 = null;
        multiplePiePlot9.setBackgroundImage(image12);
        java.awt.Paint paint14 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint14);
        float float16 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessage("hi!");
        double double9 = multiplePiePlot1.getLimit();
        org.jfree.chart.util.TableOrder tableOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent5);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        boolean boolean6 = multiplePiePlot5.isSubplot();
        java.awt.Paint paint7 = multiplePiePlot5.getBackgroundPaint();
        float float8 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = null;
        multiplePiePlot10.setBackgroundPaint(paint14);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot5.setNoDataMessageFont(font18);
        multiplePiePlot1.setNoDataMessageFont(font18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent21);
        java.lang.String str23 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.zoom((double) 1);
        java.awt.Stroke stroke26 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Multiple Pie Plot" + "'", str23, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image7 = null;
        multiplePiePlot1.setBackgroundImage(image7);
        java.lang.Object obj9 = null;
        boolean boolean10 = multiplePiePlot1.equals(obj9);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent11);
        double double13 = multiplePiePlot1.getLimit();
        java.awt.Paint paint14 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot6.setBackgroundPaint(paint10);
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font14 = multiplePiePlot6.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Paint paint21 = multiplePiePlot18.getNoDataMessagePaint();
        java.awt.Paint paint22 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot1.getParent();
        java.awt.Paint paint26 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertNull(plot25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        boolean boolean4 = multiplePiePlot3.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot3.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Stroke stroke11 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke11);
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setForegroundAlpha((float) 10);
        multiplePiePlot1.setBackgroundImageAlpha((float) 1L);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot1.getInsets();
        float float19 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(tableOrder13);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot1.handleClick((int) '#', 1, plotRenderingInfo13);
        java.awt.Font font15 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Stroke stroke22 = multiplePiePlot1.getOutlineStroke();
        java.awt.Paint paint23 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(tableOrder16);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot8.setInsets(rectangleInsets12);
        multiplePiePlot1.setInsets(rectangleInsets12);
        multiplePiePlot1.zoom((double) 1);
        multiplePiePlot1.setBackgroundAlpha((float) 100L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        float float17 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(datasetGroup18);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.lang.String str14 = multiplePiePlot1.getPlotType();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.lang.Object obj18 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setLimit((double) (-1L));
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Image image21 = multiplePiePlot18.getBackgroundImage();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot18.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot18.getInsets();
        multiplePiePlot18.setLimit((double) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier28);
        float float30 = multiplePiePlot27.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        multiplePiePlot27.handleClick((int) (byte) -1, (int) (short) 1, plotRenderingInfo33);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        multiplePiePlot27.notifyListeners(plotChangeEvent35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = null;
        multiplePiePlot38.setDrawingSupplier(drawingSupplier39);
        org.jfree.chart.plot.Plot plot41 = multiplePiePlot38.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent42 = null;
        multiplePiePlot38.datasetChanged(datasetChangeEvent42);
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float46 = multiplePiePlot38.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart47 = multiplePiePlot38.getPieChart();
        multiplePiePlot27.setPieChart(jFreeChart47);
        multiplePiePlot18.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart47);
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot51 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset50);
        java.lang.String str52 = multiplePiePlot51.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent53 = null;
        multiplePiePlot51.markerChanged(markerChangeEvent53);
        java.awt.Paint paint55 = multiplePiePlot51.getAggregatedItemsPaint();
        java.lang.Comparable comparable56 = multiplePiePlot51.getAggregatedItemsKey();
        multiplePiePlot51.setBackgroundImageAlpha((float) 0);
        java.awt.Font font59 = multiplePiePlot51.getNoDataMessageFont();
        double double60 = multiplePiePlot51.getLimit();
        java.awt.Paint paint61 = multiplePiePlot51.getAggregatedItemsPaint();
        java.awt.Font font62 = multiplePiePlot51.getNoDataMessageFont();
        multiplePiePlot51.setLimit((double) (-1L));
        java.awt.Paint paint65 = null;
        multiplePiePlot51.setOutlinePaint(paint65);
        java.lang.String str67 = multiplePiePlot51.getNoDataMessage();
        java.awt.Stroke stroke68 = multiplePiePlot51.getOutlineStroke();
        multiplePiePlot18.setOutlineStroke(stroke68);
        multiplePiePlot1.setOutlineStroke(stroke68);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNull(plot22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNull(plot41);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.5f + "'", float46 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart47);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertEquals("'" + comparable56 + "' != '" + "Other" + "'", comparable56, "Other");
        org.junit.Assert.assertNotNull(font59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(stroke68);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        float float5 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setLimit(0.0d);
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 0);
        int int10 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        java.lang.String str9 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        boolean boolean8 = multiplePiePlot1.isSubplot();
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot1.getInsets();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        java.lang.Object obj5 = multiplePiePlot1.clone();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier7);
        float float9 = multiplePiePlot6.getBackgroundImageAlpha();
        java.awt.Paint paint10 = multiplePiePlot6.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent13);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(drawingSupplier12);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot1.drawBackground(graphics2D11, rectangle2D12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        boolean boolean3 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        boolean boolean6 = multiplePiePlot5.isSubplot();
        java.awt.Paint paint7 = multiplePiePlot5.getBackgroundPaint();
        java.awt.Paint paint8 = multiplePiePlot5.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot1.setDataset(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        multiplePiePlot4.setBackgroundImageAlpha((float) (short) 1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot4.getDataset();
        multiplePiePlot4.setOutlineVisible(true);
        multiplePiePlot4.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(categoryDataset17);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setLimit(0.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick(10, (int) (short) 1, plotRenderingInfo11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        multiplePiePlot7.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener14);
        java.awt.Image image16 = multiplePiePlot12.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot12.axisChanged(axisChangeEvent17);
        double double19 = multiplePiePlot12.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier22);
        java.awt.Paint paint24 = multiplePiePlot21.getOutlinePaint();
        multiplePiePlot12.setNoDataMessagePaint(paint24);
        multiplePiePlot7.setOutlinePaint(paint24);
        multiplePiePlot1.setAggregatedItemsPaint(paint24);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        multiplePiePlot1.setDataset(categoryDataset28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint31 = plot30.getOutlinePaint();
        plot30.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier7);
        float float9 = multiplePiePlot6.getBackgroundImageAlpha();
        java.awt.Paint paint10 = multiplePiePlot6.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent13);
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(drawingSupplier12);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) 10);
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundAlpha((float) ' ');
        multiplePiePlot1.zoom(52.0d);
        java.lang.String str17 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.zoom(52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(tableOrder11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Multiple Pie Plot" + "'", str17, "Multiple Pie Plot");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 100);
        java.lang.Comparable comparable13 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Paint paint22 = multiplePiePlot18.getAggregatedItemsPaint();
        multiplePiePlot15.setOutlinePaint(paint22);
        java.lang.String str24 = multiplePiePlot15.getPlotType();
        java.lang.String str25 = multiplePiePlot15.getNoDataMessage();
        float float26 = multiplePiePlot15.getBackgroundImageAlpha();
        int int27 = multiplePiePlot15.getBackgroundImageAlignment();
        java.awt.Paint paint28 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint28);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Multiple Pie Plot" + "'", str24, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Paint paint16 = multiplePiePlot12.getAggregatedItemsPaint();
        multiplePiePlot9.setOutlinePaint(paint16);
        multiplePiePlot1.setAggregatedItemsPaint(paint16);
        java.awt.Font font19 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Image image20 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNull(image20);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        plot6.handleClick((int) (short) 100, (int) (byte) -1, plotRenderingInfo9);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        plot6.markerChanged(markerChangeEvent11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot5.addChangeListener(plotChangeListener7);
        java.awt.Image image9 = multiplePiePlot5.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        java.lang.String str14 = multiplePiePlot1.getPlotType();
        java.awt.Image image15 = multiplePiePlot1.getBackgroundImage();
        java.lang.Class<?> wildcardClass16 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = null;
        multiplePiePlot11.setBackgroundPaint(paint15);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font19 = multiplePiePlot11.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        multiplePiePlot4.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot4.getRootPlot();
        boolean boolean13 = plot12.isOutlineVisible();
        java.awt.Paint paint14 = plot12.getBackgroundPaint();
        java.lang.Object obj15 = plot12.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.awt.Image image10 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot1.handleClick((int) (byte) 1, (int) ' ', plotRenderingInfo14);
        multiplePiePlot1.setLimit((double) 10L);
        java.awt.Paint paint18 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Image image19 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        float float10 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.awt.Image image10 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        java.lang.String str12 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent5);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick((int) (byte) 10, 10, plotRenderingInfo10);
        double double12 = multiplePiePlot1.getLimit();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float9 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent10);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        multiplePiePlot15.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener22);
        java.awt.Image image24 = multiplePiePlot20.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent25 = null;
        multiplePiePlot20.axisChanged(axisChangeEvent25);
        double double27 = multiplePiePlot20.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot29.setDrawingSupplier(drawingSupplier30);
        java.awt.Paint paint32 = multiplePiePlot29.getOutlinePaint();
        multiplePiePlot20.setNoDataMessagePaint(paint32);
        multiplePiePlot15.setOutlinePaint(paint32);
        multiplePiePlot15.setForegroundAlpha((float) (short) 10);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier42 = null;
        multiplePiePlot41.setDrawingSupplier(drawingSupplier42);
        org.jfree.chart.plot.Plot plot44 = multiplePiePlot41.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        plot44.markerChanged(markerChangeEvent45);
        float float47 = plot44.getBackgroundImageAlpha();
        plot44.setBackgroundImageAlpha(0.0f);
        java.awt.Image image50 = null;
        plot44.setBackgroundImage(image50);
        org.jfree.chart.plot.Plot plot52 = plot44.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = plot52.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets53);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(plot44);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.5f + "'", float47 == 0.5f);
        org.junit.Assert.assertNotNull(plot52);
        org.junit.Assert.assertNotNull(rectangleInsets53);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        double double6 = multiplePiePlot1.getLimit();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot1.handleClick((int) '4', 97, plotRenderingInfo17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(jFreeChart14);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        java.awt.Font font15 = multiplePiePlot1.getNoDataMessageFont();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setLimit((double) (short) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        multiplePiePlot13.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier19);
        float float21 = multiplePiePlot18.getBackgroundImageAlpha();
        java.awt.Paint paint22 = multiplePiePlot18.getBackgroundPaint();
        multiplePiePlot13.setAggregatedItemsPaint(paint22);
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 0L);
        multiplePiePlot13.setOutlineVisible(true);
        java.awt.Stroke stroke28 = multiplePiePlot13.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        boolean boolean6 = multiplePiePlot5.isSubplot();
        java.awt.Paint paint7 = multiplePiePlot5.getBackgroundPaint();
        float float8 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = null;
        multiplePiePlot10.setBackgroundPaint(paint14);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot5.setNoDataMessageFont(font18);
        multiplePiePlot1.setNoDataMessageFont(font18);
        boolean boolean21 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint23 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot27.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        plot30.markerChanged(markerChangeEvent31);
        float float33 = plot30.getBackgroundImageAlpha();
        plot30.setBackgroundImageAlpha(0.0f);
        java.awt.Image image36 = null;
        plot30.setBackgroundImage(image36);
        org.jfree.chart.plot.Plot plot38 = plot30.getRootPlot();
        boolean boolean39 = plot38.isSubplot();
        java.awt.Font font40 = plot38.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font40);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(tableOrder22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.5f + "'", float33 == 0.5f);
        org.junit.Assert.assertNotNull(plot38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(font40);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 15.0d);
        java.lang.Class<?> wildcardClass12 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        java.awt.Image image9 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot7.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot7.getInsets();
        boolean boolean12 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot7);
        float float13 = multiplePiePlot7.getForegroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot7.getLegendItems();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(legendItemCollection14);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        boolean boolean6 = multiplePiePlot5.isSubplot();
        java.awt.Paint paint7 = multiplePiePlot5.getBackgroundPaint();
        float float8 = multiplePiePlot5.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = null;
        multiplePiePlot10.setBackgroundPaint(paint14);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot5.setNoDataMessageFont(font18);
        multiplePiePlot1.setNoDataMessageFont(font18);
        boolean boolean21 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint23 = multiplePiePlot1.getOutlinePaint();
        java.awt.Stroke stroke24 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(tableOrder22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot1.getInsets();
        org.jfree.data.general.DatasetGroup datasetGroup11 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot16.getInsets();
        multiplePiePlot16.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.util.TableOrder tableOrder24 = multiplePiePlot16.getDataExtractOrder();
        java.awt.Paint paint25 = multiplePiePlot16.getBackgroundPaint();
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot16.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart26);
        java.lang.Object obj28 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNull(tableOrder24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(jFreeChart26);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot9.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot1.handleClick((int) (byte) 100, (int) (short) 1, plotRenderingInfo23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot1.getInsets();
        java.lang.String str26 = multiplePiePlot1.getNoDataMessage();
        java.awt.Stroke stroke27 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        plot4.markerChanged(markerChangeEvent7);
        int int9 = plot4.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (-1), plotRenderingInfo11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        multiplePiePlot7.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener14);
        java.awt.Image image16 = multiplePiePlot12.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot12.axisChanged(axisChangeEvent17);
        double double19 = multiplePiePlot12.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier22);
        java.awt.Paint paint24 = multiplePiePlot21.getOutlinePaint();
        multiplePiePlot12.setNoDataMessagePaint(paint24);
        multiplePiePlot7.setOutlinePaint(paint24);
        multiplePiePlot1.setAggregatedItemsPaint(paint24);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        multiplePiePlot1.setDataset(categoryDataset28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        multiplePiePlot1.setDataset(categoryDataset30);
        java.awt.Paint paint32 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent33);
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        multiplePiePlot38.notifyListeners(plotChangeEvent39);
        multiplePiePlot38.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Paint paint43 = multiplePiePlot38.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint43);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent4);
        multiplePiePlot1.setLimit((double) 0);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        plot4.zoom(0.0d);
        org.jfree.chart.plot.Plot plot9 = plot4.getParent();
        plot4.setNoDataMessage("Multiple Pie Plot");
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        plot4.axisChanged(axisChangeEvent12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        java.awt.Image image19 = multiplePiePlot15.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot15.getPieChart();
        multiplePiePlot15.setBackgroundImageAlpha(1.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot15.getDrawingSupplier();
        plot4.setDrawingSupplier(drawingSupplier23);
        float float25 = plot4.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(jFreeChart20);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        double double12 = multiplePiePlot1.getLimit();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        multiplePiePlot15.setForegroundAlpha((float) 0L);
        java.awt.Paint paint19 = multiplePiePlot15.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        multiplePiePlot21.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot21.getDrawingSupplier();
        multiplePiePlot15.setDrawingSupplier(drawingSupplier25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        multiplePiePlot15.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo29);
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot15.getPieChart();
        multiplePiePlot15.zoom((double) 100L);
        java.awt.Font font34 = multiplePiePlot15.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font34);
        boolean boolean36 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(drawingSupplier25);
        org.junit.Assert.assertNotNull(jFreeChart31);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.zoom((double) (short) 1);
        multiplePiePlot1.setForegroundAlpha((float) 15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot1.handleClick((int) (short) 100, 15, plotRenderingInfo13);
        boolean boolean15 = multiplePiePlot1.isOutlineVisible();
        boolean boolean16 = multiplePiePlot1.isSubplot();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        java.awt.Image image10 = null;
        plot4.setBackgroundImage(image10);
        org.jfree.chart.plot.Plot plot12 = plot4.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        plot12.notifyListeners(plotChangeEvent13);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        plot12.setNoDataMessagePaint(paint15);
        boolean boolean17 = plot12.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener21);
        boolean boolean23 = multiplePiePlot19.isSubplot();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot19.getRootPlot();
        java.awt.Paint paint25 = plot24.getOutlinePaint();
        boolean boolean26 = plot24.isOutlineVisible();
        java.awt.Paint paint27 = plot24.getOutlinePaint();
        plot12.setBackgroundPaint(paint27);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot6.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = null;
        multiplePiePlot6.setBackgroundPaint(paint10);
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font14 = multiplePiePlot6.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font14);
        float float16 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        multiplePiePlot1.setLimit((double) 1);
        java.awt.Stroke stroke21 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.zoom((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot1.setDataset(categoryDataset11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 0);
        float float3 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent5);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        float float8 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        java.lang.Object obj6 = multiplePiePlot1.clone();
        float float7 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setLimit((double) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Paint paint16 = null;
        multiplePiePlot12.setBackgroundPaint(paint16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot12.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot12.getDatasetGroup();
        java.awt.Paint paint20 = multiplePiePlot12.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot12.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets21, false);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        boolean boolean29 = multiplePiePlot28.isSubplot();
        multiplePiePlot28.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot25.setParent((org.jfree.chart.plot.Plot) multiplePiePlot28);
        java.awt.Stroke stroke33 = multiplePiePlot28.getOutlineStroke();
        multiplePiePlot28.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        multiplePiePlot28.setDataset(categoryDataset36);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent38 = null;
        multiplePiePlot28.notifyListeners(plotChangeEvent38);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = multiplePiePlot28.getInsets();
        java.awt.Stroke stroke41 = multiplePiePlot28.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = multiplePiePlot28.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets42, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(rectangleInsets42);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setBackgroundImageAlignment((int) 'a');
        java.awt.Image image15 = multiplePiePlot1.getBackgroundImage();
        boolean boolean16 = multiplePiePlot1.isOutlineVisible();
        boolean boolean17 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        multiplePiePlot1.zoom((double) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot1.getDatasetGroup();
        java.awt.Stroke stroke20 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot1.setDataset(categoryDataset21);
        java.lang.String str23 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image24 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(image24);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        double double10 = multiplePiePlot1.getLimit();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        plot19.markerChanged(markerChangeEvent20);
        float float22 = plot19.getBackgroundImageAlpha();
        java.awt.Paint paint23 = plot19.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint23);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent25 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent25);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot1.getRootPlot();
        java.lang.Object obj28 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = plot6.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot9.markerChanged(markerChangeEvent11);
        java.awt.Paint paint13 = multiplePiePlot9.getAggregatedItemsPaint();
        java.lang.Comparable comparable14 = multiplePiePlot9.getAggregatedItemsKey();
        multiplePiePlot9.setBackgroundImageAlpha((float) 0);
        java.awt.Font font17 = multiplePiePlot9.getNoDataMessageFont();
        double double18 = multiplePiePlot9.getLimit();
        java.awt.Paint paint19 = multiplePiePlot9.getAggregatedItemsPaint();
        java.awt.Paint paint20 = multiplePiePlot9.getOutlinePaint();
        plot6.setOutlinePaint(paint20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getAggregatedItemsPaint();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean9 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = plot4.getDrawingSupplier();
        java.awt.Stroke stroke8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        plot4.setOutlineStroke(stroke8);
        org.jfree.data.general.DatasetGroup datasetGroup10 = plot4.getDatasetGroup();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(datasetGroup10);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo15);
        multiplePiePlot1.zoom((double) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot1.getDatasetGroup();
        java.awt.Stroke stroke20 = multiplePiePlot1.getOutlineStroke();
        java.awt.Paint paint21 = multiplePiePlot1.getAggregatedItemsPaint();
        boolean boolean22 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setBackgroundAlpha((float) 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot4.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        java.lang.Comparable comparable12 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
    }
}

